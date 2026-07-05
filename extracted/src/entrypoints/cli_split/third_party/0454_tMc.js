  var tMc = __commonJS((_gv, TDf) => {
    TDf.exports = `// Shared filesystem + string helpers used across the converter modules.
// Pure functions only \u2014 no process globals, no CLI parsing. One exception:
// gitWorkspaceRoot reads HOME/USERPROFILE for its containment guard, so the
// home bound has a single definition instead of one per caller.

import { existsSync, readFileSync, readdirSync, realpathSync } from 'node:fs';
import { dirname, join, parse, relative, resolve, sep } from 'node:path';

// Normalize to \`/\` so downstream regexes and split('/') are platform-agnostic.
// Node fs functions accept \`/\` on Windows, so the normalized form is usable
// everywhere.
export const slash = (p) => (sep === '/' ? p : p.split(sep).join('/'));

// readdirSync order is filesystem-dependent; sort for reproducible output.
export const ls = (d, o) =>
  readdirSync(d, o).sort((a, b) => (a.name ?? a).localeCompare(b.name ?? b));

// Containment bound for config-supplied paths (docsDir, tsconfig, cssEntry,
// extraFonts\u2026). dirname(node_modules) alone is too narrow in monorepos \u2014
// pnpm installs per-package, and docs/tsconfig commonly live in sibling
// packages or at the repo root \u2014 so widen to the enclosing git repo when one
// exists (\`.git\` may be a file: worktrees, submodules). Never $HOME or /
// even when they carry .git (dotfiles repos must not turn the whole home
// dir into "the repo"); callers keep realpath as the symlink vet.
export function gitWorkspaceRoot(base) {
  const homeEnv = process.env.HOME ?? process.env.USERPROFILE;
  // realpath so the comparison sees the same form as the realpath'd walk
  // (a symlinked /home segment would otherwise make the guard silently inert).
  let home = null;
  if (homeEnv) { try { home = realpathSync(homeEnv); } catch { home = resolve(homeEnv); } }
  let d = base;
  while (true) {
    // relative() instead of string equality \u2014 case-insensitive on Windows,
    // where the realpath-fallback home and the realpath'd walk can disagree
    // purely on casing.
    // parse(d).root === d is true at any filesystem root \u2014 '/', 'C:\\\\',
    // UNC shares \u2014 where resolve('/') is only the CWD-DRIVE root on Windows
    // and would let a stray D:\\.git become the ceiling on another drive.
    if ((home && relative(home, d) === '') || parse(d).root === d) return base;
    if (existsSync(join(d, '.git'))) return d;
    const up = dirname(d);
    if (up === d) return base;
    d = up;
  }
}

export const readText = (p) => (existsSync(p) ? readFileSync(p, 'utf8') : '');

export const escapeHtml = (s) =>
  String(s ?? '').replace(/[&<>"]/g, (c) => ({ '&': '&amp;', '<': '&lt;', '>': '&gt;', '"': '&quot;' })[c]);

// Export name from a story name: PascalCase the alnum runs; prefix S if it
// would start with a digit. Dedup with a counter. Shared by preview-gen
// (writes the export) and storybook/compare.mjs (pairs a story to its cell),
// so the two can never drift.
export function exportName(storyName, used) {
  let n = String(storyName ?? 'Default').split(/[^A-Za-z0-9]+/).filter(Boolean)
    .map((w) => w[0].toUpperCase() + w.slice(1)).join('') || 'Default';
  if (/^[0-9]/.test(n)) n = 'S' + n;
  if (!used) return n;
  let out = n, i = 2;
  while (used.has(out)) out = \`\${n}\${i++}\`;
  used.add(out);
  return out;
}

// Storybook title \u2192 {name, group}. titleMap remaps a derived name to the
// real export name (e.g. {"Toast": "ToastNotification"}). With \`exportedSet\`,
// scan segments right-to-left for the first that's a known export \u2014 handles
// 3-level titles like \`Media/Carousel/Simple\` where the last segment is the
// story variant, not the component.
export function titleParts(title, titleMap = {}, exportedSet = null) {
  const parts = title.split('/');
  const segs = parts.map((s) => s.replace(/\\s+/g, ''));
  let idx = segs.length - 1;
  if (exportedSet) {
    for (let i = segs.length - 1; i >= 0; i--) {
      if (exportedSet.has(titleMap[segs[i]] ?? segs[i])) { idx = i; break; }
    }
  }
  let name = segs[idx];
  // Explicit null = exclude (non-visual utilities etc.), mirroring
  // componentSrcMap's {Name: null} convention. Callers skip name === null.
  if (Object.prototype.hasOwnProperty.call(titleMap, name) && titleMap[name] === null) {
    return { name: null, group: 'misc' };
  }
  name = titleMap[name] ?? name;
  const group =
    (parts[idx - 1] || 'misc').trim().toLowerCase().replace(/[^a-z0-9]+/g, '-').replace(/^-+|-+$/g, '') || 'misc';
  return { name, group };
}

// JSDoc \`/** \u2026 */\` block immediately preceding \`name\`'s own declaration,
// \`* \` gutters stripped, empty string when no match. Walks backward from the
// decl so a multi-export file picks the nearest doc, not the first-in-file.
export function leadingJsdoc(text, name) {
  const declRx = name
    ? new RegExp(\`(?:export\\\\s+)?(?:declare\\\\s+)?(?:const|let|function|class|interface|type)\\\\s+\${name}\\\\b\`)
    : /(?:export|declare|const|function|class|interface)/;
  const dm = declRx.exec(text);
  if (!dm) return '';
  const before = text.slice(0, dm.index);
  const end = before.lastIndexOf('*/');
  if (end < 0 || before.slice(end + 2).trim() !== '') return '';
  const start = before.lastIndexOf('/**', end);
  if (start < 0) return '';
  return before.slice(start + 3, end).split('\\n').map((l) => l.replace(/^\\s*\\*\\s?/, '')).join('\\n').trim();
}

// Recursive directory walk, skipping node_modules. \`accept(name)\` filters
// which file basenames to collect; default keeps everything.
export function walk(dir, accept = () => true, out = []) {
  if (!existsSync(dir)) return out;
  for (const e of ls(dir, { withFileTypes: true })) {
    if (e.name === 'node_modules') continue;
    const p = join(dir, e.name);
    if (e.isDirectory()) walk(p, accept, out);
    else if (accept(e.name)) out.push(slash(p));
  }
  return out;
}

// \u2500\u2500 Config schema: known top-level keys \u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500
// esbuild lowers \`import.meta\` to {} under format:'iife', so the standard
// cross-bundler asset idiom \`new URL('img.png', import.meta.url)\`
// (webpack/Vite/parcel) throws at the URL constructor \u2014 at module init for
// top-level refs, blanking every preview cell (or a whole Vite-built dist
// bundle). Every iife compile spreads this define so the module loads: the
// asset 404s (demo images don't ship) but the component renders. \`.invalid\`
// is RFC-reserved \u2014 never resolves, fails fast. Known trade-off: a dist
// guard like \`typeof import.meta.url === 'string' ? \u2026 : fallback\` now takes
// the URL branch instead of its fallback \u2014 inherent to defining the value
// at all, and the unguarded idiom (a hard crash before this) is the
// dominant real-world shape.
export const IIFE_IMPORT_META_DEFINE = {
  'import.meta.url': '"https://ds-preview.invalid/"',
  // Vite-convention env \u2014 \`import.meta.env.MODE\` under iife throws at module
  // init without it. Same trade-off as .url: feature-detecting code takes the
  // env branch with these synthetic values instead of its fallback.
  'import.meta.env': '{"MODE":"development","DEV":true,"PROD":false,"SSR":false,"BASE_URL":"/"}',
};

// Failure-signature \u2192 hypothesis lines, printed under the raw error they
// annotate (stderr-only, never persisted). High-specificity signatures only \u2014
// a wrong named remedy anchors harder than none. Order matters: glob/scheme
// must match before the generic module-miss entry.
export const ERROR_REMEDIES = [
  [/could not resolve "[^"]*\\*[^"]*"/i,
    'glob import (a bundler-specific idiom esbuild cannot resolve) \u2014 verify: the specifier in the error contains * \u2014 if confirmed: fork story-imports.mjs to stub that module'],
  [/could not resolve "node:[^"]*"/i,
    'Node builtin imported in a browser-platform bundle (esbuild cannot resolve it) \u2014 verify: the specifier starts with node: \u2014 if confirmed: fork story-imports.mjs to stub it, or drop the import in an owned .tsx'],
  // 2+ chars before the colon \u2014 a single letter is a Windows drive path.
  [/could not resolve "[a-z][\\w.+-]+:[^"]*"/i,
    'custom URL-scheme import (bundler plugin territory) \u2014 verify: the specifier carries a scheme prefix (not a drive letter or node:) \u2014 if confirmed: fork story-imports.mjs to resolve or stub it'],
  [/importing with (a type|the "[^"]+") attribute .{0,40}is not supported|import attribute/i,
    'build-time macro import (evaluated by the repo\\'s own bundler) \u2014 esbuild cannot evaluate it; fork story-imports.mjs to stub the macro module, or skip those stories'],
  // Covers the major libraries' provider-error phrasings.
  [/must be used within|outside (of )?(a |the )?\\w* ?provider|provider was not found|could not find .{0,60}context value|forgot to wrap|wrapped in a <\\w*provider/i,
    'missing context provider \u2014 verify: storybook shape: node .ds-sync/storybook/probe.mjs --storybook-static .design-sync/sb-reference (detects the actual chain); package shape: check the repo\\'s own usage examples \u2014 if confirmed: set cfg.provider'],
  [/cannot find module|could not resolve/i,
    'runtime module miss \u2014 verify: the named module is package API (a story-only helper should bundle via cfg.storyImports.bundle instead) \u2014 if confirmed: add it via cfg.extraEntries'],
  [/invalid hook call|multiple copies of react/i,
    'two React instances \u2014 verify: the erroring module imports react directly instead of the shared global \u2014 if confirmed: cfg.storyImports.shim it'],
  [/failed to fetch|networkerror|net::err/i,
    'live network call in a story (offline capture cannot serve it) \u2014 verify: the story fetches an external URL \u2014 if confirmed: cfg.overrides.<Name>.skip that story, or accept close'],
];
export const remedyFor = (t) => ERROR_REMEDIES.find(([re]) => re.test(String(t ?? '')))?.[1] ?? '';
// The one rendering of a hypothesis \u2014 format lives in exactly one place.
export const hypothesisLine = (t) => {
  const h = remedyFor(t);
  return h ? \`    hypothesis: \${h}\` : '';
};

// The single source of truth for what .design-sync/config.json accepts.
// Strict on key NAMES only \u2014 interiors (provider.props, overrides entries)
// are deliberately freeform, and type mistakes already fail loudly in the
// build. Strictness is the migration trigger: when a breaking change
// removes a key, it moves to REMOVED_CONFIG_KEYS with a pointer to where
// the value lives now, so a stale config fails with the fix named instead
// of being silently misread (skill-mediated migration; scripts carry no
// compat code).
export const CONFIG_KEYS = new Set([
  // identity + wiring
  'pkg', 'shape', 'projectId', 'buildCmd', 'globalName', 'entry',
  'storybookConfigDir', 'storybookStatic', 'srcDir', 'tsconfig',
  // styling + assets
  'cssEntry', 'tokensPkg', 'tokensGlob', 'extraFonts', 'runtimeFontPrefixes',
  // bundling
  'extraEntries', 'libOverrides', 'storyImports', 'replaces', 'provider',
  // curation + docs
  'titleMap', 'overrides', 'componentSrcMap', 'dtsPropsFor',
  'docsDir', 'docsMap', 'guidelinesGlob', 'readmeHeader',
]);
// name \u2192 where the value lives now. Seed on removal; prune after a few
// releases once stale configs have cycled through a sync.
export const REMOVED_CONFIG_KEYS = new Map([
  ['previewArgs', 'the generated-preview tier is gone \u2014 author .design-sync/previews/<Name>.tsx instead (it fully replaces previewArgs), then delete this key'],
]);

// Returns ALL violations at once (the consumer is usually an agent \u2014 a
// one-pass repair beats whack-a-mole re-runs). Empty array = valid.
export function validateConfig(cfg) {
  if (typeof cfg !== 'object' || cfg === null || Array.isArray(cfg)) {
    return ['config root must be a JSON object'];
  }
  const errors = [];
  for (const k of Object.keys(cfg)) {
    if (CONFIG_KEYS.has(k)) continue;
    if (REMOVED_CONFIG_KEYS.has(k)) {
      errors.push(\`"\${k}" \u2014 \${REMOVED_CONFIG_KEYS.get(k)}\`);
      continue;
    }
    const near = [...CONFIG_KEYS].find((n) => n.toLowerCase() === k.toLowerCase());
    errors.push(\`unknown key "\${k}"\${near ? \` \u2014 did you mean "\${near}"?\` : ''}\`);
  }
  return errors;
}
`;
  });
  var nMc = __commonJS((bgv, EDf) => {
    EDf.exports = `// Source-shape detection \u2014 shared by both adapters so cfg.shape can override
// the result without either shape's lib importing the other.

import { existsSync } from 'node:fs';
import { join } from 'node:path';
import { ls } from './common.mjs';

// Enumerate .storybook/ config dirs under root (depth-limited, skips
// node_modules). Some DSes use \`storybook/\` (no dot) \u2014 match any dir with a
// main.* file.
export function findStorybookDirs(root, depth = 4) {
  const out = [];
  const isConfigDir = (p) =>
    ['ts', 'js', 'mjs', 'cjs'].some((e) => existsSync(join(p, \`main.\${e}\`)));
  (function walk(d, lvl) {
    if (lvl > depth || !existsSync(d)) return;
    for (const e of ls(d, { withFileTypes: true })) {
      if (!e.isDirectory() || e.name === 'node_modules') continue;
      const p = join(d, e.name);
      if ((e.name === '.storybook' || e.name === 'storybook') && isConfigDir(p)) out.push(p);
      else walk(p, lvl + 1);
    }
  })(root, 0);
  return out;
}

export function detectShape({ INPUTS, SB_STATIC, SB_CONFIG_DIR }) {
  if (SB_STATIC || SB_CONFIG_DIR) {
    console.error(\`[DETECT] shape=storybook (explicit \${SB_STATIC ? '--storybook-static' : '--storybook-config'})\`);
    return 'storybook';
  }
  const found = findStorybookDirs(INPUTS, 4);
  const shape = found.length ? 'storybook' : 'package';
  console.error(\`[DETECT] searched \${INPUTS} (depth 4), found .storybook at [\${found.join(', ')}] \u2192 shape=\${shape}\`);
  return shape;
}
`;
  });
  var rMc = __commonJS((Sgv, vDf) => {
    vDf.exports = `// esbuild bundling: dist entry \u2192 IIFE at window.<GLOBAL>, plus the
// \`/* @ds-bundle: {...} */\` first-line header the claude.ai/design app's
// self-check parses.

import { build } from 'esbuild';
import { createHash } from 'node:crypto';
import { existsSync, readFileSync, statSync, writeFileSync } from 'node:fs';
import { dirname, join, resolve } from 'node:path';
import { IIFE_IMPORT_META_DEFINE } from './common.mjs';

// Resolve the package's browser entry. Prefer ESM (tree-shakes cleaner).
// \`soft\` \u2192 return null on miss instead of exiting (caller synthesizes from src/).
export function resolveDistEntry({ pkgDir, pkgJson, override, pkgName, soft = false }) {
  if (override) {
    const p = resolve(override);
    if (!existsSync(p)) {
      console.error(\`[NO_DIST] --entry \${override} doesn't exist \u2014 run the DS's build.\`);
      if (soft) return null;
      process.exit(1);
    }
    return p;
  }
  // exports conditions can nest ({types, default:{types, default}}) \u2014 flatten.
  const str = (v) => (typeof v === 'string' ? v : v?.default ? str(v.default) : null);
  const cand = [
    pkgJson.module,
    str(pkgJson.exports?.['.']?.import),
    str(pkgJson.exports?.['.']?.default),
    str(pkgJson.exports?.['.']),
    pkgJson.main,
  ].filter((c) => typeof c === 'string');
  for (const c of cand) {
    const p = join(pkgDir, c);
    if (existsSync(p)) return p;
  }
  if (soft) return null;
  console.error(
    \`[NO_DIST] \${pkgName} has no built entry (tried \${cand.join(', ')} under \${pkgDir}). \` +
      \`Run the DS's build script, or use 'npm install \${pkgName}@latest' in a scratch dir and pass --node-modules.\`,
  );
  process.exit(1);
}

// react/react-dom are externals \u2192 resolved to window.React / window.ReactDOM.
// Everything else is bundled from NODE_MODULES.
export const reactShim = {
  name: 'react-global',
  setup(b) {
    b.onResolve({ filter: /^react(\\/(jsx-(dev-)?runtime|compiler-runtime))?$/ }, () => ({
      path: 'react-shim',
      namespace: 'shim',
    }));
    b.onResolve({ filter: /^react-dom(\\/client)?$/ }, () => ({
      path: 'react-dom-shim',
      namespace: 'shim',
    }));
    // react-is must match window.React's $$typeof symbols. A bundled copy
    // from node_modules can be a different major (e.g. react-is@19 checks
    // for 'react.transitional.element' while react@18 emits 'react.element'),
    // which makes isElement() always false and breaks components that
    // branch on it (count badges, nav indicators, \u2026).
    b.onResolve({ filter: /^react-is$/ }, () => ({ path: 'react-is-shim', namespace: 'shim' }));
    // scheduler must be the same instance window.React uses internally; a
    // second bundled copy breaks concurrent rendering.
    b.onResolve({ filter: /^scheduler(\\/|$)/ }, () => ({ path: 'scheduler-shim', namespace: 'shim' }));
    b.onLoad({ filter: /^react-shim$/, namespace: 'shim' }, () => ({
      // Automatic-runtime jsx/jsxs \u2192 createElement. Two invariants matter:
      //  \xB7 key is the 3rd ARG, never in props \u2014 lift it into the createElement
      //    config object.
      //  \xB7 jsxs means "static children array": the compiler emits it for
      //    <div><A/><B/></div> as jsxs("div",{children:[A,B]}). The real
      //    react/jsx-runtime suppresses key validation for that array. We
      //    must SPREAD it into createElement variadic args \u2014 passing the
      //    array via props.children makes React's reconciler treat it as a
      //    dynamic list and warn "missing key" on every component with 2+
      //    static children. jsx (single child slot) keeps the child as one
      //    arg so a runtime .map() array there is still key-validated.
      contents: \`var R=window.React;
function np(p,k){var o={};for(var x in p)if(x!=="children")o[x]=p[x];if(k!==void 0)o.key=k;return o}
function jsx(t,p,k){var c=p&&p.children;return c===void 0?R.createElement(t,np(p,k)):R.createElement(t,np(p,k),c)}
function jsxs(t,p,k){return R.createElement.apply(R,[t,np(p,k)].concat(p.children))}
module.exports=R;
module.exports.jsx=jsx;module.exports.jsxs=jsxs;module.exports.jsxDEV=function(t,p,k,s){return(s?jsxs:jsx)(t,p,k)};
module.exports.Fragment=R.Fragment;\`,
      loader: 'js',
    }));
    b.onLoad({ filter: /^react-dom-shim$/, namespace: 'shim' }, () => ({
      // preload/preinit/preconnect/prefetchDNS (React 18.3+/19 resource
      // hints) must exist \u2014 some DSes call them at Provider mount.
      contents: 'var D=window.ReactDOM,n=function(){};' +
        'module.exports=Object.assign({preload:n,preinit:n,preconnect:n,prefetchDNS:n,preloadModule:n,preinitModule:n},D);',
      loader: 'js',
    }));
    b.onLoad({ filter: /^react-is-shim$/, namespace: 'shim' }, () => ({
      contents: \`var R=window.React;
var FWD=Symbol.for("react.forward_ref"),MEMO=Symbol.for("react.memo"),PORTAL=Symbol.for("react.portal"),LAZY=Symbol.for("react.lazy");
function tt(o){return o!=null&&typeof o==="object"?(R.isValidElement(o)?(o.type&&o.type.$$typeof)||o.type:o.$$typeof):undefined}
exports.typeOf=tt;
exports.isElement=R.isValidElement;
exports.isValidElementType=function(t){return typeof t==="string"||typeof t==="function"||t===R.Fragment||t===R.Suspense||t===R.StrictMode||t===R.Profiler||(t!=null&&typeof t==="object"&&t.$$typeof!=null)};
exports.isFragment=function(o){return R.isValidElement(o)&&o.type===R.Fragment};
exports.isSuspense=function(o){return R.isValidElement(o)&&o.type===R.Suspense};
exports.isPortal=function(o){return o!=null&&o.$$typeof===PORTAL};
exports.isForwardRef=function(o){return tt(o)===FWD};
exports.isMemo=function(o){return tt(o)===MEMO};
exports.isLazy=function(o){return tt(o)===LAZY};
exports.isContextProvider=exports.isContextConsumer=exports.isProfiler=exports.isStrictMode=function(){return false};
exports.ForwardRef=FWD;exports.Memo=MEMO;exports.Portal=PORTAL;exports.Lazy=LAZY;
exports.Fragment=R.Fragment;exports.Suspense=R.Suspense;exports.StrictMode=R.StrictMode;exports.Profiler=R.Profiler;\`,
      loader: 'js',
    }));
    b.onLoad({ filter: /^scheduler-shim$/, namespace: 'shim' }, () => ({
      // A DS dist/ rarely imports scheduler directly \u2014 when it does, it
      // means react-dom leaked into the dist. Surface it.
      contents: \`throw new Error("[SCHEDULER_MISSING] this DS's dist/ imports 'scheduler' directly \u2014 usually react-dom leaked into the dist. Check the DS build's externals.");\`,
      loader: 'js',
    }));
  },
};

// Build a resolve plugin from tsconfig compilerOptions.paths. esbuild's
// built-in \`tsconfig\` option only applies paths to files covered by that
// tsconfig, which the synth entry (in OUT) isn't \u2014 so we resolve explicitly.
export function tsconfigPathsPlugin(tsconfigPath) {
  let paths, baseUrl;
  try {
    // Strip // and /* */ comments \u2014 tsconfig.json permits them, JSON.parse doesn't.
    const raw = readFileSync(tsconfigPath, 'utf8')
      .replace(/\\/\\*[\\s\\S]*?\\*\\//g, '')
      .replace(/(^|[^:])\\/\\/.*$/gm, '$1');
    ({ paths, baseUrl = '.' } = JSON.parse(raw).compilerOptions ?? {});
  } catch { return null; }
  if (!paths) return null;
  const base = resolve(dirname(tsconfigPath), baseUrl);
  const rules = Object.entries(paths).map(([k, v]) => ({
    prefix: k.replace(/\\*$/, ''),
    targets: (Array.isArray(v) ? v : [v]).map((t) => resolve(base, t.replace(/\\*$/, ''))),
    wild: k.endsWith('*'),
  }));
  // Filter on the alias prefixes so the plugin only fires for @/-style paths,
  // not every node_modules import.
  const esc = (s) => s.replace(/[.*+?^\${}()|[\\]\\\\]/g, '\\\\$&');
  const filter = new RegExp(\`^(?:\${rules.map((r) => esc(r.prefix)).join('|')})\`);
  const exts = ['', '.ts', '.tsx', '.js', '.jsx', '.mjs', '/index.ts', '/index.tsx', '/index.js', '/index.jsx'];
  return {
    name: 'tsconfig-paths',
    setup(b) {
      b.onResolve({ filter }, (args) => {
        for (const r of rules) {
          if (r.wild ? !args.path.startsWith(r.prefix) : args.path !== r.prefix) continue;
          const tail = r.wild ? args.path.slice(r.prefix.length) : '';
          for (const t of r.targets) {
            const stem = join(t, tail);
            for (const ext of exts) {
              if (existsSync(stem + ext)) return { path: stem + ext };
            }
          }
        }
        return undefined;
      });
    },
  };
}

// Bundle \`entry\` to a single IIFE at the project root. Returns paths +
// inlinedExternals (npm packages esbuild pulled in, derived from the
// metafile \u2014 react/react-dom/react-is are externalized so excluded).
// Options shared by the runtime bundle pass and the export-evidence pass \u2014
// one source so the two resolutions can never drift: a loader or plugin
// present in one but not the other would either throw the evidence pass
// into its silent null-fallback or, worse, make the evidence diverge from
// what the runtime bundle actually contains.
function sharedBuildOptions({ nodePaths, tsconfig }) {
  const pathsPlugin = tsconfig ? tsconfigPathsPlugin(tsconfig) : null;
  const plugins = [reactShim];
  if (pathsPlugin) plugins.unshift(pathsPlugin);
  return {
    bundle: true,
    platform: 'browser',
    target: 'es2020',
    nodePaths: [nodePaths],
    plugins,
    metafile: true,
    loader: {
      '.svg': 'dataurl',
      '.png': 'dataurl',
      '.woff': 'dataurl',
      '.woff2': 'dataurl',
    },
    // No '.css' loader override: some DSes ship scss already compiled to
    // .css with css-modules hashes pre-baked, and esbuild's default 'css'
    // loader (unlike 'local-css') preserves them.
    minify: false,
    define: { 'process.env.NODE_ENV': '"development"' },
  };
}

export async function bundleToIife({ entry, globalName, nodePaths, out, tsconfig }) {
  const bundleJs = join(out, '_ds_bundle.js');
  const bundleCss = join(out, '_ds_bundle.css');
  const shared = sharedBuildOptions({ nodePaths, tsconfig });
  let buildResult;
  try {
    buildResult = await build({
      ...shared,
      entryPoints: [entry],
      format: 'iife',
      globalName,
      // __dsMainNs (set by package-build when extraEntries are present) is
      // the main package's runtime namespace \u2014 Object.assign it over the
      // merged IIFE exports so main-package names win over icon collisions.
      footer: { js: \`window.\${globalName}=\${globalName}.__dsMainNs?Object.assign({},\${globalName},\${globalName}.__dsMainNs,{__dsMainNs:undefined}):\${globalName};\` },
      outfile: bundleJs,
      logLevel: 'warning',
      // iife can't evaluate import.meta.url natively \u2014 define it here only.
      // The esm evidence pass supports it natively, and a define is not
      // resolution-affecting, so the two graphs still resolve identically.
      // Merged over the shared define (a bare override would drop NODE_ENV).
      define: { ...shared.define, ...IIFE_IMPORT_META_DEFINE },
    });
  } catch (e) {
    // Tag unbuilt workspace siblings \u2014 package exists in node_modules but its
    // entry points at a dist/ that hasn't been built.
    const unresolved = [...new Set((e.errors ?? []).map((er) => er.text.match(/Could not resolve "([^"]+)"/)?.[1]).filter(Boolean))];
    const siblings = unresolved.filter((p) => {
      const pj = join(nodePaths, p, 'package.json');
      if (!existsSync(pj)) return false;
      try {
        const j = JSON.parse(readFileSync(pj, 'utf8'));
        const ent = j.module ?? j.main ?? 'index.js';
        return !existsSync(join(nodePaths, p, ent));
      } catch { return false; }
    });
    if (siblings.length) {
      console.error(
        \`[WORKSPACE_SIBLING] \${siblings.join(', ')} exist in node_modules but aren't built (no dist entry). \` +
          \`Run their build, or npm install the published versions.\`,
      );
    } else if (unresolved.length) {
      console.error(\`[UNRESOLVED_IMPORT] \${unresolved.join(', ')} \u2014 missing from node_modules.\`);
    }
    throw e;
  }
  const REACT_PKGS = new Set(['react', 'react-dom', 'react-is']);
  const inlinedExternals = [
    ...new Set(
      Object.keys(buildResult?.metafile?.inputs ?? {})
        .map((p) => p.match(/(?:^|\\/)node_modules\\/((?:@[^/]+\\/)?[^/]+)\\//)?.[1])
        .filter((pkg) => pkg && !REACT_PKGS.has(pkg)),
    ),
  ].sort();
  console.error(\`  bundle: \${(statSync(bundleJs).size / 1024).toFixed(0)} KB\`);
  console.error(\`  inlined npm packages: \${inlinedExternals.length}\`);
  return { bundleJs, bundleCss, inlinedExternals };
}

// Evidence pass for the provider gate: rebuild the same entry as ESM
// (write:false, nothing touches disk) and read esbuild's own export list \u2014
// the same resolution that produced the runtime bundle, so presence/absence
// is provable where a .d.ts scan is heuristic. One residual unknowable:
// \`export * from <cjs>\` isn't statically enumerable (esbuild emits a
// runtime __reExport and the names are missing from \`exports\`), and the
// metafile carries no signal for WHICH import is a star \u2014 so any bundled
// CJS input downgrades absence from provable to unverifiable (cjsPresent).
// That over-triggers for plain CJS imports (a bundled lodash softens the
// gate), which is the accepted price of never minting a false fatal.
// Returns null on ANY failure: the caller must fall back to scan evidence \u2014
// this pass may only ever change a gate verdict, never fail a build the
// real bundle pass accepted.
export async function bundleExportEvidence({ entry, nodePaths, tsconfig }) {
  try {
    const r = await build({
      ...sharedBuildOptions({ nodePaths, tsconfig }),
      entryPoints: [entry],
      format: 'esm',
      write: false,
      outfile: '__ds_export_evidence.mjs',
      logLevel: 'silent',
    });
    const out = Object.values(r.metafile?.outputs ?? {})[0];
    const exports = new Set((out?.exports ?? []).filter((n) => n !== '__dsMainNs'));
    // The react-family shims are authored as CJS and appear in every build's
    // inputs under the 'shim:' namespace \u2014 they can't hide DS names, so
    // only genuinely-bundled CJS counts toward the unverifiable signal.
    const cjsPresent = Object.entries(r.metafile?.inputs ?? {}).some(
      ([k, i]) => i.format === 'cjs' && !k.startsWith('shim:'),
    );
    return { exports, cjsPresent };
  } catch {
    return null;
  }
}

// Prepend the \`/* @ds-bundle: {\u2026} */\` first-line header. The
// claude.ai/design app reads this; format is load-bearing \u2014 namespace +
// components feed the consuming agent and the ds_manifest;
// sourceHashes + inlinedExternals drive the keep-vs-rebuild decision.
// \`*/\` inside the JSON is escaped so the comment can't terminate early.
export function stampHeader(bundleJs, { namespace, components, inlinedExternals }) {
  const body = readFileSync(bundleJs, 'utf8');
  const out = dirname(bundleJs);
  // Keyed by per-component output paths \u2014 what decideBundleRebuild compares
  // against. Includes .d.ts and .prompt.md so contract/doc-only edits also
  // surface in the incremental-upload diff.
  const sourceHashes = Object.fromEntries(
    components.flatMap((c) => {
      const base = \`components/\${c.group}/\${c.name}/\${c.name}\`;
      return ['.jsx', '.d.ts', '.prompt.md']
        .map((ext) => base + ext)
        .filter((rel) => existsSync(join(out, rel)))
        .map((rel) => [rel, createHash('sha256').update(readFileSync(join(out, rel))).digest('hex').slice(0, 12)]);
    }),
  );
  const meta = {
    namespace,
    components: components.map((c) => ({
      name: c.name,
      sourcePath: \`components/\${c.group}/\${c.name}/\${c.name}.jsx\`,
    })),
    sourceHashes,
    inlinedExternals,
    builtBy: 'cc-design-sync',
  };
  const headerJson = JSON.stringify(meta).replace(/\\*\\//g, '*\\\\/');
  writeFileSync(bundleJs, \`/* @ds-bundle: \${headerJson} */\\n\` + body);
}
`;
  });
  var oMc = __commonJS((Tgv, wDf) => {
    wDf.exports = `// .d.ts extraction via ts-morph (real TS checker). Resolves the apparent
// structural type of each <Name>Props \u2014 unwraps Omit/Pick, follows extends
// chains and intersections, resolves \`(typeof X)[number]\` / mapped types to
// literal unions.

import { existsSync, readFileSync, readdirSync } from 'node:fs';
import { dirname, join } from 'node:path';
import { Project, Node, ts } from 'ts-morph';

export function findTypesRoot(pkgDir, pkgJson) {
  // Workspace/monorepo packages often point dev \`types\` at src/*.ts (no .d.ts
  // tree there); publishConfig carries the published .d.ts entry \u2014 prefer it
  // when it exists on disk.
  const pubTypes = pkgJson.publishConfig?.types;
  if (pubTypes && existsSync(join(pkgDir, pubTypes))) return dirname(join(pkgDir, pubTypes));
  const t = pkgJson.types || pkgJson.typings;
  if (t) return dirname(join(pkgDir, t));
  const hasDts = (d) => { try { return readdirSync(d).some((f) => f.endsWith('.d.ts')); } catch { return false; } };
  for (const c of ['build/ts', 'dist/types', 'types', 'lib', 'dist']) {
    const p = join(pkgDir, c);
    if (existsSync(p) && (c !== 'dist' || hasDts(p))) return p;
  }
  return pkgDir;
}

// *Props are prop interfaces; ALL-CAPS are object constants; *Manager /
// *Placements / *Context are utility singletons; use* are hooks \u2014 none
// renderable. (dts.nonComponents also catches React.Context by symbol kind;
// the suffix check is belt-and-suspenders for DSes where that misses.)
export const isComponentName = (n) => !n.endsWith('Props') && !/^[A-Z][A-Z0-9_]+$/.test(n)
  && !/(?:Manager|Placements|Context)$/.test(n) && !/^use[A-Z]/.test(n);

// Partition into roots and subcomponents. A name is a subcomponent ONLY when
// another name is a PascalCase prefix of it AND the suffix is an actual
// namespace member of that prefix per the \`compounds\` map (i.e. Table.Row
// exists, so top-level TableRow is the same subpart). Name shape alone
// can't distinguish TableRow (only renders inside Table) from ButtonGroup
// (standalone) \u2014 the compounds membership is the reliable signal. For DSes
// that export subparts top-level only (no \`Table.Row\` namespace), this
// conservatively does nothing.
export function partitionSubcomponents(names, compounds) {
  const set = new Set(names);
  const parentOf = new Map();
  for (const n of names) {
    const parts = n.match(/[A-Z][a-z0-9]*/g) ?? [];
    // Try longest prefix first, keep trying shorter ones \u2014 \`ListItemText\`
    // with compounds {List: ['ItemText']} must reach \`List\` even if
    // \`ListItem\` is itself a top-level name.
    for (let i = parts.length - 1; i >= 1; i--) {
      const prefix = parts.slice(0, i).join('');
      if (!set.has(prefix)) continue;
      const suffix = parts.slice(i).join('');
      if ((compounds?.get(prefix) ?? []).includes(suffix)) { parentOf.set(n, prefix); break; }
    }
  }
  // Flatten transitively \u2014 TableRowCell \u2192 TableRow \u2192 Table becomes
  // TableRowCell \u2192 Table, so the caller's per-root bucketing doesn't lose
  // subs whose immediate parent is itself a sub. Terminates: each parent has
  // strictly fewer PascalCase parts than its child.
  for (const [n] of parentOf) {
    let p = parentOf.get(n);
    while (parentOf.has(p)) p = parentOf.get(p);
    parentOf.set(n, p);
  }
  return { parentOf };
}

// One Project per package \u2014 loadDts/exportedNames share it.
const projects = new Map();

function projectFor(pkgDir, typesRoot) {
  if (projects.has(pkgDir)) return projects.get(pkgDir);
  // Derive node_modules for cross-package resolution (React, peer deps).
  // Normalize separators \u2014 pkgDir may have backslashes on Windows.
  const posix = pkgDir.split('\\\\').join('/');
  const i = posix.lastIndexOf('/node_modules/');
  let nodeModules = i >= 0 ? join(pkgDir.slice(0, i), 'node_modules') : join(pkgDir, '..');
  // Workspace packages live outside node_modules \u2014 walk up to the hoisted
  // root node_modules so @types/react resolves (otherwise React utility types
  // collapse to \`any\` and inherited props drop out of the emitted bodies).
  if (!existsSync(join(nodeModules, '@types', 'react'))) {
    for (let d = pkgDir; ; d = dirname(d)) {
      if (existsSync(join(d, 'node_modules', '@types', 'react'))) { nodeModules = join(d, 'node_modules'); break; }
      if (dirname(d) === d) break;
    }
  }
  const pj = JSON.parse(readFileSync(join(pkgDir, 'package.json'), 'utf8'));
  // Same publishConfig preference as findTypesRoot \u2014 keep the two in sync.
  const pubEntry = pj.publishConfig?.types;
  const entry = join(pkgDir, (pubEntry && existsSync(join(pkgDir, pubEntry)) ? pubEntry : null) || pj.types || pj.typings || 'index.d.ts');
  const project = new Project({
    skipAddingFilesFromTsConfig: true,
    compilerOptions: {
      target: ts.ScriptTarget.ES2020,
      module: ts.ModuleKind.ESNext,
      moduleResolution: ts.ModuleResolutionKind.Bundler,
      jsx: ts.JsxEmit.ReactJSX,
      skipLibCheck: true,
      strict: false,
    },
  });
  // Add the package's own .d.ts tree plus @types/react (otherwise
  // \`ComponentPropsWithoutRef<\u2026>\` is \`any\` and intersection types collapse).
  const reactTypes = join(nodeModules, '@types', 'react', 'index.d.ts');
  // The negation must be absolute-scoped to match the positive pattern \u2014
  // ts-morph's fast-glob ignores bare \`!**/node_modules/**\` otherwise.
  const root = typesRoot ?? dirname(entry);
  project.addSourceFilesAtPaths([\`\${root}/**/*.d.ts\`, \`!\${root}/**/node_modules/**\`]);
  console.error(\`  [DTS] parsed \${project.getSourceFiles().length} .d.ts files from \${root}\`);
  // ts-morph StandardizedFilePath is always forward-slash; normalize pkgDir
  // once so fp.startsWith(pkgDir) in isOwnProp/propsBodyFor works on Windows.
  // Trailing slash so a sibling node_modules package whose name is a prefix of
  // this one (foo vs foo-icons) isn't mis-classified as in-package.
  const pkgDirStd = pkgDir.split('\\\\').join('/').replace(/\\/?$/, '/');
  if (existsSync(reactTypes)) project.addSourceFileAtPath(reactTypes);
  else console.error(
    '\\n[DTS_REACT] \u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\\n' +
    '[DTS_REACT] @types/react not found in node_modules. React utility types\\n' +
    '[DTS_REACT] (ComponentPropsWithoutRef, FC, \u2026) will resolve to \`any\`, so\\n' +
    '[DTS_REACT] components whose props extend them will emit EMPTY bodies.\\n' +
    '[DTS_REACT] Fix: \`npm i -D @types/react\` then rebuild.\\n' +
    '[DTS_REACT] \u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\\n',
  );
  if (existsSync(entry)) project.addSourceFileAtPath(entry);
  const ctx = { project, entry, pkgDir: pkgDirStd };
  projects.set(pkgDir, ctx);
  return ctx;
}

// Keep a prop unless its declaration lives in React/DOM types or a CSS-in-JS
// style-system base (hundreds of token-typed style props from the component
// library's styled-props layer). The small KEEP_PROP set passes regardless so
// structural props survive when inherited from React. ts-morph's getFilePath()
// returns StandardizedFilePath (forward-slash), so the substring checks are
// cross-platform.
const KEEP_PROP = /^(children|className|style|as|asChild|ref|id)$/;
// Style-system bases are detected by SHAPE, two-tier (canonical contract \u2014
// the call sites point here):
// - EXTERNAL packages: >STYLE_SYSTEM_THRESHOLD CSS/token-named props,
//   counted per package directory (the node_modules/<pkg>/ boundary), so a
//   style system split across small per-category .d.ts files still crosses
//   the bar in aggregate. Paths with no node_modules/ segment fall back to
//   per-file counting at the in-package bar.
// - IN-PACKAGE files: >IN_PACKAGE_FILE_THRESHOLD CSS-named props in ONE
//   file. Hand-written API layers (tens of CSS-named props) are the DS's
//   own API and are never filtered; only a generated style system crosses
//   this bar. Left unfiltered, printing hundreds of token-typed unions per
//   component costs minutes of build time and tens of GB of retained
//   checker cache, and bloats every emitted .d.ts.
// All props declared in a flagged file/package are filtered (KEEP_PROP
// passes regardless). ASSUMPTION: when inherited shorthands are real API,
// override per component with cfg.dtsPropsFor.<Name>.
const CSS_PROP_NAME =
  /^(m[tblrxy]?$|p[tblrxy]?$|margin|padding|bg|background|color|border|width|height|flex|grid|gap|font|text|display|position|top|left|right|bottom|z|opacity|overflow|shadow|rounded|space)/;
const STYLE_SYSTEM_THRESHOLD = 15;
const IN_PACKAGE_FILE_THRESHOLD = 100;
// The package that owns a path: its deepest node_modules/<pkg>/ boundary
// (trailing slash), or null for workspace paths. Identity comparison against
// ownerOf(pkgDir) is the single in-package/external discriminator.
function ownerOf(p) {
  const m = /^(.*\\/node_modules\\/(?:@[^/]+\\/)?[^/]+)\\//.exec(p);
  return m ? m[1] + '/' : null;
}
function detectStyleSystemDirs(props, pkgDir, declFile) {
  const pkgOwner = ownerOf(pkgDir);
  const cssByDir = new Map();
  for (const p of props) {
    if (!CSS_PROP_NAME.test(p.getName())) continue;
    const d = p.getDeclarations()[0];
    if (!d) continue;
    const fp = d.getSourceFile().getFilePath();
    // Key shape encodes the tier (see the canonical contract above
    // CSS_PROP_NAME): external packages \u2192 node_modules/<pkg>/ prefix key
    // (trailing slash); in-package declarations \u2192 exact FILE key. The
    // DEEPEST node_modules boundary decides: a dep nested under the
    // package's own node_modules (un-hoisted version conflict) is external.
    // One principle, no orientation cases: a declaration is IN-PACKAGE iff
    // the package that OWNS its file is the package being synced.
    // ownerOf() = deepest node_modules package boundary, null for
    // workspace paths. This derives every layout \u2014 nested dep under the
    // package's own node_modules (different owner \u2192 external), dual-publish
    // nested manifest (same owner \u2192 in-package even though pkgDir sits
    // below the boundary), DS synced from inside a host package's
    // node_modules (host files have a shallower owner \u2192 external).
    // In-package files key per-FILE; external files key per owning package.
    // Ownerless externals (sibling workspace packages) key per-file at the
    // in-package bar \u2014 the documented out-of-scope fallback in the
    // canonical block above.
    const owner = ownerOf(fp);
    const inPackage = owner === pkgOwner && (owner !== null || fp.startsWith(pkgDir));
    const key = inPackage ? fp : (owner ?? fp);
    // Never flag the file that declares the component's own Props: in a
    // rolled-up single-file .d.ts the generated style layer co-lives with
    // the API interfaces, and a per-FILE flag would drop the component's
    // own props. Separate generated files still filter; rollups fall back
    // to unfiltered (slow but correct). External dir keys are unaffected.
    if (key === declFile) continue;
    cssByDir.set(key, (cssByDir.get(key) ?? 0) + 1);
  }
  // Per-tier bars \u2014 rationale in the canonical block above CSS_PROP_NAME.
  const keys = [];
  for (const [k, n] of cssByDir) {
    const bar = k.endsWith('/') ? STYLE_SYSTEM_THRESHOLD : IN_PACKAGE_FILE_THRESHOLD;
    if (n > bar) keys.push(k);
  }
  return keys;
}
function isOwnProp(p, pkgDir, styleSystemDirs) {
  const name = p.getName();
  if (KEEP_PROP.test(name)) return true;
  const d = p.getDeclarations()[0];
  if (!d) return true;
  const fp = d.getSourceFile().getFilePath();
  // Same owner-identity discriminator as detectStyleSystemDirs, same order
  // of authority: a flagged in-package FILE drops first (exact match); then
  // owner-equality keeps the DS's own API \u2014 checked BEFORE dir keys because
  // a flagged dir key can be an ANCESTOR of pkgDir (DS synced from inside a
  // host package's node_modules) and must not swallow in-package files;
  // then flagged external packages drop by prefix.
  if (styleSystemDirs.some((k) => !k.endsWith('/') && fp === k)) return false;
  const owner = ownerOf(fp);
  if (owner === ownerOf(pkgDir) && (owner !== null || fp.startsWith(pkgDir))) return true;
  if (styleSystemDirs.some((k) => k.endsWith('/') && fp.startsWith(k))) return false;
  if (fp.includes('/@types/react/') || fp.includes('/typescript/lib/')) return false;
  // DOM-noise name filters apply only to props inherited from other packages.
  if (/^(on[A-Z]|aria-)/.test(name)) return false;
  return true;
}

// Keep well-known aliases as-written instead of expanding to their full union.
const KEEP_ALIAS = /^(ReactNode|ReactElement|CSSProperties|JSX\\.Element|Key|Ref|RefObject)$/;

function typeText(t, at) {
  const alias = t.getAliasSymbol()?.getName();
  if (alias && KEEP_ALIAS.test(alias)) return \`React.\${alias}\`;
  if (t.isBoolean()) return 'boolean';
  let s;
  if (t.isUnion()) {
    // Render each member so ReactNode/boolean collapse while literal unions
    // stay expanded; dedup, drop \`undefined\` (optionality is the \`?\`).
    const parts = t.getUnionTypes().map((u) => typeText(u, at)).filter((p) => p !== 'undefined');
    let uniq = [...new Set(parts)];
    if (uniq.length === 2 && uniq.includes('true') && uniq.includes('false')) return 'boolean';
    // Collapse the structural expansion of React.ReactNode (string | number |
    // ReactElement<\u2026> | Iterable<ReactNode> | ReactPortal | Promise<\u2026>) back to
    // the alias \u2014 when the alias symbol is lost, the expansion blows past the
    // length cap below and would truncate into invalid TS.
    if (uniq.includes('ReactPortal') && uniq.some((u) => u.startsWith('Iterable<ReactNode>'))) {
      const RN_MEMBER = /^(string|number|bigint|boolean|ReactPortal|Iterable<ReactNode>.*|ReactElement<.*|Promise<.*)$/;
      uniq = [...new Set([...uniq.filter((u) => !RN_MEMBER.test(u)), 'React.ReactNode'])];
    }
    // Function-type members are invalid un-parenthesized inside a union
    // (\`string | (x) => void\` doesn't parse) \u2014 wrap them.
    if (uniq.length > 1) uniq = uniq.map((u) => (u.includes('=>') ? \`(\${u})\` : u));
    // Cap very wide unions (icon-name sets can be 600+ members).
    if (uniq.length > 24) uniq = [...uniq.slice(0, 16), \`(string & {}) /* +\${uniq.length - 16} more */\`];
    s = uniq.join(' | ').replace(/\\bfalse \\| true\\b/, 'boolean');
  } else {
    s = t.getText(at, ts.TypeFormatFlags.NoTruncation).replace(/import\\("[^"]*"\\)\\./g, '');
  }
  // Never hard-slice an over-long type \u2014 a cut generic/object literal is
  // invalid TS and fails the validator's [DTS_PARSE] check (and the app's
  // API-contract parse). Fall back to a safe wide type instead; the JSDoc
  // line above the prop carries the human-readable detail.
  return s.length > 240 ? 'unknown' : s;
}

// PascalCase value exports from the entry module. The checker knows value vs
// type, so type-only exports never enter the set.
export function exportedNames(pkgDir, pkgJson) {
  const { project, entry } = projectFor(pkgDir, findTypesRoot(pkgDir, pkgJson));
  const sf = project.getSourceFile(entry);
  const names = new Set();
  if (!sf) return names;
  for (const [name, decls] of sf.getExportedDeclarations()) {
    if (!/^[A-Z][A-Za-z0-9]*$/.test(name)) continue;
    const hasValue = decls.some((d) =>
      Node.isVariableDeclaration(d) || Node.isFunctionDeclaration(d) ||
      Node.isClassDeclaration(d) || Node.isSourceFile(d));
    if (hasValue) names.add(name);
  }
  return names;
}

// Builds the context propsBodyFor/jsdocFor read from. \`nonComponents\` /
// \`compounds\` are derived from the checker's symbol kinds.
export function loadDts(typesRoot) {
  // typesRoot is always under <nm>/<pkg>/\u2026 \u2014 walk up to the real package
  // root: the nearest package.json with a \`name\` field, skipping stubs
  // (\`{"type":"module"}\` in esm/ or dist/). dirname-fixed-point is the
  // cross-platform root test (\`/\` vs \`C:\\\`).
  let walk = typesRoot;
  for (; walk !== dirname(walk); walk = dirname(walk)) {
    const pj = join(walk, 'package.json');
    if (existsSync(pj)) {
      try { if (JSON.parse(readFileSync(pj, 'utf8')).name) break; } catch {}
    }
  }
  // projectFor normalizes pkgDir to forward-slashes (ts-morph's
  // StandardizedFilePath) \u2014 use that for every fp.startsWith() downstream.
  const { project, entry, pkgDir } = projectFor(walk, typesRoot);
  const sf = project.getSourceFile(entry);
  const nonComponents = new Set();
  const compounds = new Map();
  if (sf) for (const [name, decls] of sf.getExportedDeclarations()) {
    if (!/^[A-Z][A-Za-z0-9]*$/.test(name)) continue;
    // Declaration-merged names (\`interface Button {}\` + \`const Button: \u2026\`)
    // return both decls \u2014 prefer the value decl so the merge isn't
    // misclassified as type-only by whichever the checker listed first.
    const d = decls.find((x) =>
      Node.isVariableDeclaration(x) || Node.isFunctionDeclaration(x) ||
      Node.isClassDeclaration(x) || Node.isSourceFile(x)) ?? decls[0];
    // Namespace export (\`export * as X\`) \u2192 compound with its own value members.
    if (Node.isSourceFile(d)) {
      const members = [...d.getExportedDeclarations().entries()]
        .filter(([n, ds]) => /^[A-Z][a-z]/.test(n) && ds.some((x) => !Node.isInterfaceDeclaration(x) && !Node.isTypeAliasDeclaration(x)))
        .map(([n]) => n);
      if (members.length) compounds.set(name, members);
      else nonComponents.add(name);
      continue;
    }
    // Type-only / enum / Context / abstract-class are not components.
    if (Node.isInterfaceDeclaration(d) || Node.isTypeAliasDeclaration(d) || Node.isEnumDeclaration(d)) {
      nonComponents.add(name);
      continue;
    }
    if (Node.isClassDeclaration(d) && d.isAbstract()) { nonComponents.add(name); continue; }
    if (Node.isClassDeclaration(d)) continue;  // always renderable; compounds via statics aren't handled here
    if (!Node.isVariableDeclaration(d) && !Node.isFunctionDeclaration(d)) continue;
    // \`const X: FC<\u2026> & { Sub: \u2026 }\` (possibly through an alias/Omit) \u2014
    // PascalCase callable properties declared in-package are compound members
    // (React.Component lifecycle names have underscores / fail the full match).
    const t = d.getType();
    const members = [];
    // PascalCase props can't be style-system CSS-shorthands, so the empty
    // list is correct here \u2014 detectStyleSystemDirs would contribute nothing.
    const noStyle = [];
    for (const p of t.getProperties()) {
      const pn = p.getName();
      if (!/^[A-Z][a-zA-Z0-9]*$/.test(pn) || !isOwnProp(p, pkgDir, noStyle)) continue;
      if (p.getTypeAtLocation(d).getCallSignatures().length) members.push(pn);
    }
    if (members.length) compounds.set(name, members);
    // Only provably-not-renderable consts are filtered: a plain object/record
    // type whose every property is a primitive (token/enum
    // objects like Colors or Sizes). Anything with a call signature, construct signature, or a
    // non-primitive property stays \u2014 class components and forwardRef wrappers
    // without call sigs on the instance type must not be dropped here.
    if (t.isObject() && !t.getCallSignatures().length && !t.getConstructSignatures().length && !members.length && !t.isAny()) {
      const props = t.getProperties();
      if (props.length && props.every((p) => {
        const pt = p.getTypeAtLocation(d);
        return pt.isString() || pt.isNumber() || pt.isStringLiteral() || pt.isNumberLiteral();
      })) nonComponents.add(name);
    }
  }
  return { project, entry, pkgDir, nonComponents, compounds };
}

// Returns { body, generics, extendsClause, prelude } for emit.mjs. Types are
// fully resolved into \`body\`, so extendsClause/prelude stay empty.
export function propsBodyFor(name, ctx) {
  if (ctx.dtsPropsFor?.[name]) {
    return { body: ctx.dtsPropsFor[name], generics: '', extendsClause: '', prelude: '' };
  }
  const { project, entry, pkgDir } = ctx;
  // Find <Name>Props across the package's own files (not @types/react).
  // Skip deprecated/legacy/experimental dirs so a stale copy doesn't shadow
  // the live one.
  let decl = null;
  for (const sf of project.getSourceFiles()) {
    const fp = sf.getFilePath();
    if (!fp.startsWith(pkgDir)) continue;
    if (/\\/(deprecated|legacy|experimental)\\//i.test(fp)) continue;
    decl = sf.getInterface(\`\${name}Props\`) ?? sf.getTypeAlias(\`\${name}Props\`);
    if (decl) break;
  }
  // Fallback: derive from the component symbol's first call signature.
  // Prefer the value decl (declaration-merging \u2014 see loadDts).
  if (!decl) {
    const decls = project.getSourceFile(entry)?.getExportedDeclarations().get(name) ?? [];
    const exp = decls.find((d) =>
      Node.isVariableDeclaration(d) || Node.isFunctionDeclaration(d) || Node.isClassDeclaration(d)) ?? decls[0];
    if (!exp || Node.isSourceFile(exp)) return null;
    const sig = exp.getType().getCallSignatures()[0];
    const p0 = sig?.getParameters()[0];
    if (!p0) return null;
    return emitBody(p0.getTypeAtLocation(exp), exp, '', pkgDir);
  }
  const generics = decl.getTypeParameters?.().length
    ? \`<\${decl.getTypeParameters().map((p) => p.getText()).join(', ')}>\`
    : '';
  return emitBody(decl.getType(), decl, generics, pkgDir);
}

let loggedStyleSystemDirs;
function emitBody(type, at, generics, pkgDir) {
  const lines = [];
  const props = type.getApparentType().getProperties();
  // \`at\` is the component's own Props declaration site \u2014 its file is exempt
  // from per-FILE flagging (see detectStyleSystemDirs).
  const styleSystemDirs = detectStyleSystemDirs(props, pkgDir, at.getSourceFile().getFilePath());
  // Surface a one-shot [DTS_STYLE_SYSTEM] line per flagged package so the
  // self-heal loop routes to cfg.dtsPropsFor when the heuristic guesses
  // wrong. ASSUMPTION: props from the named packages are token-typed
  // style shorthands; override a component's contract with cfg.dtsPropsFor.
  loggedStyleSystemDirs ??= new Set();
  for (const dir of styleSystemDirs) {
    if (loggedStyleSystemDirs.has(dir)) continue;
    loggedStyleSystemDirs.add(dir);
    const isDirKey = dir.endsWith('/');
    const pkg = /\\/node_modules\\/((?:@[^/]+\\/)?[^/]+)\\/$/.exec(dir)?.[1]
      ?? (dir.startsWith(pkgDir) ? dir.slice(pkgDir.length) : dir);
    const bar = isDirKey ? STYLE_SYSTEM_THRESHOLD : IN_PACKAGE_FILE_THRESHOLD;
    console.error(
      \`[DTS_STYLE_SYSTEM] filtering \${pkg} props (>\${bar} CSS-shorthand-named props) \u2014 override a component with cfg.dtsPropsFor.<Name> if these are real API\`,
    );
  }
  for (const p of props) {
    if (!isOwnProp(p, pkgDir, styleSystemDirs)) continue;
    const optional = p.hasFlags(ts.SymbolFlags.Optional) ? '?' : '';
    const pt = p.getTypeAtLocation(at);
    let tt = typeText(pt, at);
    // Structural hint when the type text hides the shape (aliased functions /
    // arrays) \u2014 smartDefaultProps reads these to pick the right required-stub.
    const members = pt.isUnion() ? pt.getUnionTypes() : [pt];
    if (members.some((u) => u.getCallSignatures().length)) tt += ' /* @fn */';
    // Tuples are not @arr \u2014 \`[]\` has the wrong length and \`[0]\` access crashes
    // either way; optional tuples are safer left unset.
    else if (members.some((u) => u.isArray())) tt += ' /* @arr */';
    // Leading JSDoc on the prop declaration, if any.
    const d = p.getDeclarations()[0];
    const doc = d?.getJsDocs?.()?.[0]?.getDescription()?.trim();
    if (doc) lines.push(\`  /** \${doc.replace(/\\s+/g, ' ').slice(0, 120)} */\`);
    const pn = p.getName();
    // Hyphenated/index-signature names (\`data-*\`, \`aria-*\`) must be quoted.
    const key = /^[a-zA-Z_$][\\w$]*$/.test(pn) ? pn : JSON.stringify(pn);
    lines.push(\`  \${key}\${optional}: \${tt};\`);
  }
  if (!lines.length) return null;
  return { body: lines.join('\\n'), generics, extendsClause: '', prelude: '' };
}

// Scaffold-preview defaults from the resolved props body. Conservative: fill
// only what's needed for a meaningful first render (children + variant axis +
// visibility toggles + required arrays). Optional string/number/Date props are
// left unset \u2014 filling them with placeholder values crashes more than it
// helps.
//
// Void-element-ish components \u2014 a string \`children\` would throw at render.
const VOID_LIKE = /^(Text|Number|Search|Password|File|Masked)?Input$|^(TextField|TextArea|Textarea|Img|Image|Avatar|Hr|Br|Spacer|Divider|Separator|Slider|Progress|ProgressBar)$/;
// Ordered preference for the variant axis \u2014 earlier wins. \`type\` is last so
// the HTML \`type\` attr ("button"|"submit"|"reset") doesn't beat \`variant\`.
const VARIANT_RANK = ['variant', 'intent', 'kind', 'appearance', 'tone', 'status', 'size', 'color', 'type'];
export function smartDefaultProps(name, pb) {
  const body = pb?.body ?? '';
  const props = {};
  let variants = null;
  // Matches the 2-space indent emitBody writes \u2014 keep the two in sync.
  // \`.+\` (not \`[^;]+\`) so object-param types with inner semicolons still match.
  for (const m of body.matchAll(/^ {2}([a-zA-Z_$][\\w$]*)(\\??)\\s*:\\s*(.+);$/gm)) {
    const [, prop, q, t] = m;
    if (prop in props) continue;
    const req = !q;
    // Union of string literals, optionally with a \`string & {}\` escape-hatch
    // member (the "autocomplete these, accept any string" TS pattern).
    if (/^(?:(?:"[^"]*"|\\(?string\\s*&\\s*\\{\\}\\)?)\\s*\\|?\\s*)+$/.test(t)) {
      const lits = [...t.matchAll(/"([^"]*)"/g)].map((l) => l[1]).filter(Boolean);
      if (lits.length >= 2) {
        const rank = VARIANT_RANK.indexOf(prop.toLowerCase());
        // Displace on strictly better rank (prop names are unique, so no ties).
        if (!variants || (rank >= 0 && (variants.rank < 0 || rank < variants.rank))) {
          variants = { prop, values: lits.slice(0, 4), rank };
        }
        if (req) props[prop] = lits[0];
        continue;
      }
    }
    // Structural hints (/* @fn */, /* @arr */) from emitBody are authoritative
    // over the text regexes \u2014 \`(() => void)[]\` has @arr, so the \`=>\` in the
    // element type must not flip it to isFn. The text regexes cover
    // cfg.dtsPropsFor overrides with no hints.
    const hasFn = t.includes('/* @fn */'), hasArr = t.includes('/* @arr */');
    const isFn = hasFn || (!hasArr && /=>|\\)\\s*:/.test(t));
    const isArr = !isFn && (hasArr || /\\[\\]|Array</.test(t));
    if (prop === 'children' && /React\\.ReactNode|ReactElement/.test(t) && !isFn && !VOID_LIKE.test(name)) props.children = name;
    // Visibility toggles \u2014 an overlay/dialog with open=false renders nothing.
    else if (/^(open|isOpen|visible|show|defaultOpen|expanded|checked|active|selected)$/.test(prop) && t === 'boolean') props[prop] = true;
    // Callable (required or optional) \u2014 optional stays unset (DSes guard
    // optional callbacks); required gets a noop.
    else if (isFn) { if (req) props[prop] = { $raw: '()=>null' }; }
    // Arrays (required or optional). \`[]\` is crash-safe but renders nothing.
    // Props that look like data/option lists get a small sample so the
    // preview has visible rows; element shape is best-effort from the type
    // text (string[] \u2192 strings; otherwise {id,label,value}).
    else if (isArr) {
      const isList = /^(items|options|tabs|rows|columns|data|actions|fields|links|steps|choices|values)$/i.test(prop);
      const elT = t.replace(/\\/\\*.*?\\*\\//g, '').trim();
      const elIsString = /^(?:readonly\\s+)?string\\[\\]|^ReadonlyArray<string>|^Array<string>/.test(elT);
      // Over-provision keys \u2014 extra ones are ignored, and this covers the
      // common {id|key} + {label|text|name|title} + value conventions.
      props[prop] = isList
        ? elIsString
          ? ['Item 1', 'Item 2', 'Item 3']
          : [1, 2, 3].map((i) => {
            const s = String(i), l = \`Item \${i}\`;
            return { id: s, key: s, value: s, label: l, text: l, name: l, title: l };
          })
        : [];
    }
    // Optional everything-else stays unset \u2014 the component's own defaults are
    // safer than a placeholder.
    else if (!req) continue;
    // Required props get a type-appropriate stub so the render doesn't crash
    // on \`undefined.\u2026\` / \`undefined()\`. \`$raw\` values are emitted verbatim by
    // scaffoldPropsExpr (not JSON-stringified).
    else if (/\\bDate\\b/.test(t)) props[prop] = { $raw: 'new Date()' };
    else if (/ElementType|ComponentType|JSXElementConstructor/.test(t)) props[prop] = 'div';
    else if (/React\\.ReactNode|ReactElement/.test(t)) props[prop] = name;
    else if (/^string\\b/.test(t)) props[prop] = name;
    else if (/^number\\b/.test(t)) props[prop] = 0;
    else if (/^boolean\\b/.test(t)) props[prop] = false;
    else if (/^\\{/.test(t) || /Record<|Partial<|Pick<|Omit</.test(t)) props[prop] = {};
    // Fallback: required prop of unrecognized shape \u2014 \`{}\` is the least likely
    // to crash \`.foo\` access.
    else props[prop] = {};
  }
  return { props, variants };
}

// One-line JSDoc from the component's own declaration.
export function jsdocFor(name, ctx) {
  const decls = ctx.project?.getSourceFile(ctx.entry)?.getExportedDeclarations().get(name) ?? [];
  const exp = decls.find((d) =>
    Node.isVariableDeclaration(d) || Node.isFunctionDeclaration(d) || Node.isClassDeclaration(d)) ?? decls[0];
  if (!exp || Node.isSourceFile(exp)) return '';
  const doc = exp.getJsDocs?.()?.[0]?.getDescription()
    ?? exp.getSymbol?.()?.compilerSymbol.getDocumentationComment?.(undefined)?.[0]?.text;
  if (!doc) return '';
  return doc.split('\\n').find((l) => l.trim() && !l.trim().startsWith('@'))
    ?.trim().replace(/\\s+/g, ' ').replace(/[^\\w\\s.,()'/:+-]/g, '').slice(0, 140) ?? '';
}
`;
  });
  var sMc = __commonJS((Egv, CDf) => {
    CDf.exports = `// CSS handling: token-file copy, @font-face extraction, and the final
// styles.css writer (the styles entry point \u2014 an @import list, never inlined CSS).
// Storybook-only fallbacks live in css-fallback.mjs.

import { cpSync, existsSync, mkdirSync, readFileSync, realpathSync, writeFileSync } from 'node:fs';
import { basename, dirname, isAbsolute, join, relative, resolve } from 'node:path';
import { ls } from './common.mjs';

// Parse @font-face blocks from \`cssPath\` \u2192 resolve url() paths relative to
// \`srcDir\` \u2192 copy .woff2/.woff/.ttf/.otf to fonts/ \u2192 return rewritten rules.
// \`roots\` bounds the resolved path so a \`url(../../etc/passwd)\` can't escape \u2014
// one or more directories the font file may legitimately be under.
export function extractFonts(cssPath, srcDir, { fontsOut, roots }) {
  // Bounds and targets are REALPATHED (a font-named symlink inside the
  // workspace pointing outside must not smuggle an arbitrary file into the
  // uploadable fonts/ \u2014 same containment rule as cfg.extraFonts), and the
  // check is relative()-based, not a startsWith prefix: case-insensitive on
  // win32 where a pnpm junction can realpath to canonical D:\\ while a
  // symlink-free root keeps user-typed d:\\ (failure direction of the prefix
  // form is false-rejection \u2014 legit brand fonts silently skipped).
  const realOf = (p) => { try { return realpathSync(p); } catch { return null; } };
  const rootsReal = (Array.isArray(roots) ? roots : [roots]).map((r) => realOf(resolve(r)) ?? resolve(r));
  const insideRoots = (p) => rootsReal.some((root) => {
    const rel = relative(root, p);
    return rel !== '' && !rel.startsWith('..') && !isAbsolute(rel);
  });
  if (!existsSync(cssPath)) return [];
  const css = readFileSync(cssPath, 'utf8');
  const rules = [];
  for (const m of css.matchAll(/@font-face\\s*\\{([^}]+)\\}/g)) {
    const body = m[1];
    const fam = body.match(/font-family\\s*:\\s*['"]?([^;'"\\n]+)['"]?/)?.[1]?.trim();
    const urls = [...body.matchAll(/url\\(\\s*['"]?([^'")]+?\\.(?:woff2?|ttf|otf))['"]?\\s*\\)/gi)].map((u) => u[1]);
    if (!fam || !urls.length) continue;
    let rewritten = body;
    for (const u of urls) {
      if (/^(https?:|data:)/.test(u)) continue; // CDN / inline \u2014 leave as-is
      const src = resolve(srcDir, u.replace(/^\\.\\//, ''));
      const real = realOf(src);
      if (!real || !insideRoots(real)) continue;
      const name = basename(src);
      mkdirSync(fontsOut, { recursive: true });
      cpSync(real, join(fontsOut, name));
      rewritten = rewritten.split(u).join(\`./\${name}\`);
    }
    rules.push(\`@font-face{\${rewritten}}\`);
  }
  return rules;
}

// Copy a tokens package's shipped CSS verbatim into OUT/tokens/. tokensGlob
// supports a single trailing \`**\` segment for deep recursion.
export function copyTokens({ tokensPkg, tokensGlob, nodeModules, out }) {
  const tokenFiles = [];
  if (!tokensPkg) return tokenFiles;
  const tdir = join(nodeModules, tokensPkg);
  const tjson = JSON.parse(readFileSync(join(tdir, 'package.json'), 'utf8'));
  if (tokensGlob) {
    const parts = tokensGlob.split('/');
    const pat = parts.pop();
    const rx = new RegExp('^' + pat.replace(/\\./g, '\\\\.').replace(/\\*/g, '.*') + '$');
    const deep = parts.includes('**');
    const base = join(tdir, ...parts.filter((p) => p !== '**'));
    (function collect(d, rel = '') {
      if (!existsSync(d)) return;
      for (const e of ls(d, { withFileTypes: true })) {
        const r = rel ? \`\${rel}/\${e.name}\` : e.name;
        if (e.isDirectory() && deep) collect(join(d, e.name), r);
        else if (e.isFile() && rx.test(e.name)) {
          // Preserve subdir structure so @import './sub/x.css' inside a
          // copied file keeps resolving.
          mkdirSync(dirname(join(out, 'tokens', r)), { recursive: true });
          cpSync(join(d, e.name), join(out, 'tokens', r));
          tokenFiles.push(r);
        }
      }
    })(base);
  } else {
    for (const sub of ['dist/css', 'css', 'dist', '.']) {
      const d = join(tdir, sub);
      if (!existsSync(d)) continue;
      for (const f of ls(d)) {
        if (f.endsWith('.css')) {
          cpSync(join(d, f), join(out, 'tokens', f));
          tokenFiles.push(f);
        }
      }
      if (tokenFiles.length) break;
    }
  }
  console.error(\`  tokens: \${tokenFiles.length} files from \${tokensPkg}@\${tjson.version}\`);
  return tokenFiles;
}

// _ds_bundle.css enters the styles.css closure (rendered designs load it),
// so its @font-face blocks must not carry package-relative url()s: the font
// binaries aren't uploaded at those paths, and a dead-src face declared
// AFTER fonts/fonts.css shadows the working copy of the same family
// (browsers don't fall back to an earlier duplicate face) \u2014 brand fonts
// silently degrade to system fonts. Rewrite urls to the fonts/ copies
// extractFonts made (matched by basename, same flattening); drop any face
// still referencing an unresolvable relative url (a dead src is worse than
// no face \u2014 and it recurs as an app-side error on every compile).
export function rewriteBundleFontFaces({ out, bundleCss }) {
  const p = bundleCss ?? join(out, '_ds_bundle.css');
  let css;
  try { css = readFileSync(p, 'utf8'); } catch { return; }
  if (!/@font-face/i.test(css)) return;
  let dropped = 0, rewrote = 0;
  const next = css.replace(/@font-face\\s*\\{[^}]*\\}/gi, (block) => {
    let b = block;
    for (const m of block.matchAll(/url\\(\\s*['"]?([^'")]+)['"]?\\s*\\)/gi)) {
      const u = m[1];
      if (/^(?:https?:|data:|\\.\\/fonts\\/)/.test(u)) continue;
      const name = basename(u.split(/[?#]/)[0]);
      if (existsSync(join(out, 'fonts', name))) { b = b.split(u).join(\`./fonts/\${name}\`); rewrote++; }
    }
    if (/url\\(\\s*['"]?(?!https?:|data:|\\.\\/fonts\\/)/i.test(b)) { dropped++; return '/* @ds-font-face-dropped: unresolvable src */'; }
    return b;
  });
  if (rewrote || dropped) {
    writeFileSync(p, next);
    console.error(\`  _ds_bundle.css fonts: \${rewrote} url(s) rewritten to fonts/\${dropped ? \`, \${dropped} dead @font-face block(s) dropped\` : ''}\`);
  }
}

// styles.css \u2014 the styles entry point. The claude.ai/design app's
// contract: rendered designs consume ONLY this file's transitive @import
// closure (plus the JS bundle) \u2014 \`_ds_bundle.css\` is not loaded by anything
// app-side, so component CSS left out of this closure never reaches a design
// built with the DS (the DS-pane cards link it directly, which masks the
// gap). Import it LAST, after tokens/fonts. Token pollution: the app's
// scope filter is a permissive heuristic \u2014 :root/theme containers, but also
// single lowercase class selectors (\`.btn { --btn-pad: \u2026 }\`) and data-attr
// selectors register as token scopes \u2014 so public component vars from the
// bundle DO enter the token list. That's tolerable (they're real, usable
// vars) and the price of designs actually receiving component CSS.
export function writeStylesCss({ out, tokenFiles, bundleCss, fontRules, remoteImports }) {
  let hasBundleCss = false;
  try {
    // The CSS-in-JS placeholder (@ds-css-runtime) isn't real CSS \u2014 importing
    // it would also suppress the [CSS_RUNTIME] message below.
    const css = readFileSync(bundleCss ?? join(out, '_ds_bundle.css'), 'utf8');
    hasBundleCss = css.trim().length > 0 && !css.startsWith('/* @ds-css-runtime');
  } catch { /* absent */ }
  const styleImports = [
    ...tokenFiles.map((f) => \`@import "./tokens/\${f}";\`),
    ...(fontRules.length ? ['@import "./fonts/fonts.css";'] : []),
    ...remoteImports.map((u) => \`@import url("\${u}");\`),
    ...(hasBundleCss ? ['@import "./_ds_bundle.css";'] : []),
  ];
  if (styleImports.length) {
    writeFileSync(join(out, 'styles.css'), styleImports.join('\\n') + '\\n');
    console.error(\`  styles.css: \${styleImports.length} @import(s)\${hasBundleCss ? ' (incl. _ds_bundle.css \u2014 component styles ship to designs via this closure)' : ''}\`);
    return;
  }
  writeFileSync(
    join(out, 'styles.css'),
    '/* @ds-styles: runtime \u2014 this design system injects its styles at runtime (CSS-in-JS); no static stylesheet to import. */\\n',
  );
  console.error('[CSS_RUNTIME] no static CSS found (tokens/component/fonts/remote all empty) \u2014 wrote a self-styling styles.css. Expected for CSS-in-JS DSes; if this DS does ship a stylesheet, set cfg.cssEntry to it. If cfg.cssEntry is ALREADY set and renders verify, this line refers only to the scrape \u2014 do not chase it.');
}
`;
  });
  var iMc = __commonJS((vgv, RDf) => {
    RDf.exports = `// Storybook source adapter. Builds (or copies) storybook-static, parses
// index.json into the component list, resolves each component's story SOURCE
// file, and pairs index story names to the module's export keys \u2014 the inputs
// preview-gen-storybook.mjs needs to compile story modules as previews.
// Story args are never evaluated here: stories run only in the browser,
// against the shipped bundle.

import { createHash } from 'node:crypto';
import { existsSync, readFileSync, realpathSync, rmSync, writeFileSync } from 'node:fs';
import { dirname, isAbsolute, join, relative, resolve, sep } from 'node:path';
import { IIFE_IMPORT_META_DEFINE, titleParts } from './common.mjs';
import { findStorybookDirs } from './detect.mjs';
import { storybookStubPlugin } from './story-imports.mjs';

function pickStorybookDir({ INPUTS, PKG, SB_CONFIG_DIR }) {
  if (SB_CONFIG_DIR) return SB_CONFIG_DIR;
  // Many repos name the config dir via \`storybook dev -c <dir>\` in
  // package.json scripts \u2014 that's authoritative when present.
  try {
    const scripts = JSON.parse(readFileSync(join(INPUTS, 'package.json'), 'utf8')).scripts ?? {};
    for (const s of Object.values(scripts)) {
      const m = typeof s === 'string' && s.match(/\\bstorybook\\s+(?:dev|build)\\b[^;&|]*?(?:-c|--config-dir)[= ]+(\\S+)/);
      if (m) return resolve(INPUTS, m[1]);
    }
  } catch {}
  const found = findStorybookDirs(INPUTS);
  if (found.length > 1) {
    const pkgTail = PKG.split('/').pop();
    const ranked = found
      .map((d) => {
        const sib = join(dirname(d), 'package.json');
        let name = '';
        try { name = JSON.parse(readFileSync(sib, 'utf8')).name ?? ''; } catch {}
        return { d, score: name === PKG ? 2 : d.includes(pkgTail) ? 1 : 0, depth: d.split(sep).length };
      })
      .sort((a, b) => b.score - a.score || a.depth - b.depth);
    console.error(
      \`[MULTI_STORYBOOK] \${found.length} .storybook/ dirs under --inputs; picked \${ranked[0].d}. \` +
        \`Override with --storybook-config <dir> if wrong. Found: \${found.join(', ')}\`,
    );
    return ranked[0].d;
  }
  return found[0] ?? (existsSync(join(INPUTS, '.storybook')) ? join(INPUTS, '.storybook') : undefined);
}

// Storybook derives a story's display name from its export key (startCase);
// squash-compare pairs them back without re-implementing the exact algorithm.
// storyName overrides break the pairing for that story \u2192 it stays unpaired
// and its cell is omitted; a component with no paired stories shows the
// floor card.
const squash = (s) => String(s ?? '').replace(/[^a-z0-9]/gi, '').toLowerCase();

// Module export keys WITHOUT evaluating the module: esbuild parses the file
// (bundle:false) and reports exports in the metafile. ~10ms per story file.
async function storyModuleExports(absPath) {
  const { build } = await import('esbuild');
  try {
    const r = await build({
      entryPoints: [absPath], bundle: false, write: false, metafile: true,
      format: 'esm', platform: 'neutral', logLevel: 'silent', jsx: 'preserve',
      // JSX-in-.js story files are a common convention; jsx is a strict
      // syntax superset of js, so this is safe for plain files too.
      loader: { '.js': 'jsx' },
    });
    const out = Object.values(r.metafile.outputs)[0];
    return (out?.exports ?? []).filter((e) => e !== 'default');
  } catch (e) {
    console.error(\`  ! story parse failed: \${relative(process.cwd(), absPath)}: \${String(e?.errors?.[0]?.text ?? e?.message ?? e).split('\\n')[0]}\`);
    return [];
  }
}

// Resolve each component's story source file(s) and pair its index stories
// to module export keys (c.storySrc / c.srcSha / c.storyIds[].exportKey).
// A component's stories may live in ONE file or be split across many files
// sharing a title \u2014 each story pairs against the exports of its OWN file
// (its index.json importPath). index.json importPaths are relative to the
// storybook PROJECT root \u2014 the .storybook dir's parent when we know it; cwd
// and the static dir's parent as fallbacks (--storybook-static-only runs).
async function resolveStorySources(csfComponents, sbDir, sbStatic) {
  const bases = [...new Set([
    ...(sbDir ? [dirname(sbDir)] : []),
    process.cwd(),
    ...(sbStatic ? [dirname(sbStatic)] : []),
  ])];
  let paired = 0, total = 0;
  for (const c of csfComponents) {
    const srcByIp = new Map();
    for (const ip of c.importPaths ?? []) {
      const abs = bases.map((b) => resolve(b, ip)).find(existsSync);
      if (abs) srcByIp.set(ip, abs);
    }
    const srcs = [...new Set(srcByIp.values())];
    if (!srcs.length) continue;
    c.storySrc = srcs[0];
    // srcSha spans ALL story files \u2014 an edit to any of them is a contract
    // change for the component.
    const h = createHash('sha256');
    for (const f of srcs) h.update(readFileSync(f));
    c.srcSha = h.digest('hex').slice(0, 12);
    const keysByFile = new Map();
    for (const f of srcs) {
      keysByFile.set(f, new Map((await storyModuleExports(f)).map((k) => [squash(k), k])));
    }
    for (const s of c.storyIds ?? []) {
      total++;
      const f = srcByIp.get(s.importPath) ?? srcs[0];
      // Display name first; fall back to the story ID's tail \u2014 storybook
      // derives it from the export key, so it survives \`name:\` overrides
      // ("button--my-story" pairs to export MyStory whatever the name says).
      const k = keysByFile.get(f)?.get(squash(s.name))
        ?? keysByFile.get(f)?.get(squash(String(s.id ?? '').split('--').pop() ?? ''));
      if (k) { s.exportKey = k; s.storySrc = f; paired++; }
    }
  }
  console.error(\`  story sources: \${paired}/\${total} stories paired to module exports\`);
}

export async function resolveStorybook(ctx) {
  const { INPUTS, STORIES_ROOT, SB_CONFIG_DIR, SB_STATIC, PKG, PKG_DIR, OUT, entry, titleMap, exportedSet } = ctx;
  const sbDir = pickStorybookDir({ STORIES_ROOT, INPUTS, PKG, SB_CONFIG_DIR });
  let sbStatic = SB_STATIC ? resolve(SB_STATIC) : null;
  if (sbStatic && !existsSync(join(sbStatic, 'index.json'))) {
    console.error(\`--storybook-static \${sbStatic} has no index.json\`);
    sbStatic = null;
  }
  // storybook-static is parsed for index.json (component list + story source
  // pairing) and the CSS fallback, then discarded \u2014 previews render
  // self-contained from the bundle. Built into a dot-prefixed dir so it's
  // never uploaded.
  if (!sbStatic && sbDir) {
    sbStatic = resolve(OUT, '.sb-static');
    console.error(\`  running: npx storybook build -c \${sbDir} -o \${sbStatic}\`);
    const { spawnSync } = await import('node:child_process');
    const r = spawnSync(
      'npx', ['storybook', 'build', '-c', sbDir, '-o', sbStatic, '--quiet'],
      { cwd: dirname(sbDir), stdio: ['ignore', 'pipe', 'pipe'], encoding: 'utf8', maxBuffer: 64 * 1024 * 1024, timeout: 600_000, shell: process.platform === 'win32' },
    );
    if (r.error || r.signal || r.status !== 0 || !existsSync(join(sbStatic, 'index.json'))) {
      console.error(\`[SB_BUILD_FAIL] storybook build exited \${r.status ?? r.signal ?? r.error?.code}:\\n\${(r.stderr || r.stdout || '').slice(-2000)}\`);
      sbStatic = null;
    }
  }
  const csfComponents = [];
  if (sbStatic) {
    const idx = JSON.parse(readFileSync(join(sbStatic, 'index.json'), 'utf8'));
    // Multi-package Storybooks can have a 'TextField' from each sibling
    // package. Prefer stories whose importPath is under the target
    // package's own directory.
    const sbRoot = sbDir ? resolve(dirname(sbDir)) : null;
    // Same relative()+realpath treatment as story-imports' barrel rule:
    // startsWith is case-sensitive (win32 drive-letter casing makes it
    // silently inert) and raw resolve() misses pnpm-style symlinked package
    // dirs. A wrong isOwn lets a sibling package's same-named stories win.
    const realOf = (p) => { try { return realpathSync(p); } catch { return p; } };
    const pkgReal = realOf(resolve(PKG_DIR));
    // Memoized per importPath: the sort comparator below calls isOwn
    // O(n log n) times, and a comparator's view of an entry must not
    // re-derive syscalls mid-sort.
    const ownCache = new Map();
    const isOwn = (e) => {
      if (!sbRoot || !e.importPath) return false;
      if (!ownCache.has(e.importPath)) {
        const rel = relative(pkgReal, realOf(resolve(sbRoot, e.importPath)));
        ownCache.set(e.importPath, rel !== '' && !rel.startsWith('..') && !isAbsolute(rel));
      }
      return ownCache.get(e.importPath);
    };
    const idxEntries = Object.values(idx.entries ?? {}).sort((a, b) => isOwn(b) - isOwn(a));
    const byComp = new Map();
    for (const e of idxEntries) {
      if (e.type === 'docs') continue;
      // Skip stories the DS marks deprecated/hidden so v1-API stories don't
      // render the v2 export with wrong props.
      if ((e.tags ?? []).includes('!dev') || (e.tags ?? []).includes('deprecated')) continue;
      if (/deprecated/i.test(e.importPath ?? '')) continue;
      const { name: compName, group } = titleParts(e.title, titleMap, exportedSet);
      if (compName === null) continue; // titleMap {Name: null} = excluded
      if (!byComp.has(compName)) byComp.set(compName, { name: compName, group, own: isOwn(e), storyIds: [], importPaths: new Set() });
      const comp = byComp.get(compName);
      if (comp.own && !isOwn(e)) continue; // own-package stories win the name
      comp.storyIds.push({ id: e.id, name: e.name, importPath: e.importPath });
      if (e.importPath) comp.importPaths.add(e.importPath);
    }
    for (const c of byComp.values()) csfComponents.push(c);
    console.error(
      \`  storybook-static: \${Object.keys(idx.entries ?? {}).length} entries \u2192 \${csfComponents.length} components\`,
    );
    await resolveStorySources(csfComponents, sbDir, sbStatic);
  } else {
    console.error(\`[SB_BUILD_FAIL] no storybook-static and no .storybook/ dir found \u2014 pass --storybook-static <dir> or run from a repo with .storybook/.\`);
  }
  return { shape: 'storybook', entry, components: csfComponents, sbStatic, sbDir };
}

// Bundle .storybook/preview.{tsx,ts,jsx,js} decorators into
// _vendor/preview-decorators.js so each preview can wrap its mount in the same
// provider chain Storybook does. Best-effort: bail (return false) if there's
// no decorator array or the bundle fails \u2014 cfg.provider remains the manual
// fallback. Imports of the DS package itself are shimmed to window.<GLOBAL>
// so the decorator's provider components are the same instances the
// previews use.
export async function bundlePreviewDecorators({ sbDir, OUT, NODE_MODULES, PKG, PKG_DIR, GLOBAL }) {
  if (!sbDir) return false;
  const sbPreview = ['tsx', 'ts', 'jsx', 'js'].map((e) => join(sbDir, \`preview.\${e}\`)).find(existsSync);
  if (!sbPreview) {
    console.error(\`  (preview decorators: no preview.{tsx,ts,jsx,js} in \${sbDir} \u2014 nothing to bundle; cfg.provider is the manual path)\`);
    return false;
  }
  // \\bdecorators\\b (not just \`decorators:\` / \`decorators=\`) \u2014 re-export forms
  // like \`export { decorators }\` are real; a false positive is harmless (the
  // wrapper finds no array at runtime and __dsDecorate stays null).
  if (!/\\bdecorators\\b/.test(readFileSync(sbPreview, 'utf8'))) {
    console.error(\`  (preview decorators: \${sbPreview} never mentions decorators \u2014 nothing to bundle; if providers live elsewhere, set cfg.provider)\`);
    return false;
  }
  const { build } = await import('esbuild');
  const entry = join(OUT, '.preview-decorators-entry.mjs');
  // The decorator receives (Story, ctx). We pass a Story fn that returns the
  // already-built inner element and a minimal ctx whose globals are seeded
  // from globalTypes defaultValues / initialGlobals \u2014 theming decorators read
  // ctx.globals.theme et al, and storybook's own default render uses exactly
  // these values. Single-function decorators are legal CSF ([].concat).
  // A decorator returning undefined (an addon stub, a manager-side noop)
  // falls through to the inner render with one console warning \u2014 otherwise
  // one unrecognized addon silently blanks every preview.
  writeFileSync(entry, \`import * as pv from \${JSON.stringify(sbPreview)};
var ds = [].concat((pv.default && pv.default.decorators) || pv.decorators || []).filter(function(d){return typeof d==="function"});
if (!ds.length) console.warn("[ds] preview decorators: the preview module mentions decorators but exposed none at runtime (indirect export?) \u2014 previews render without the provider chain; set cfg.provider if components need one");
var GT = (pv.default && pv.default.globalTypes) || pv.globalTypes || {};
var G = {};
for (var k in GT) { if (GT[k] && GT[k].defaultValue !== undefined) G[k] = GT[k].defaultValue; }
var IG = (pv.default && pv.default.initialGlobals) || pv.initialGlobals || {};
for (var k2 in IG) { G[k2] = IG[k2]; }
var ctx = {args:{},argTypes:{},globals:G,parameters:{},viewMode:"story",loaded:{},id:"",name:"",title:"",kind:"",componentId:""};
// reduce (not reduceRight): Storybook composes first-in-array = innermost.
// The chain runs inside a rendered component so decorator hooks have a
// dispatcher \u2014 calling decorators eagerly (outside render) would null it.
window.__dsDecorate = !ds.length ? null : function(el){
  return window.React.createElement(function(){
    return ds.reduce(function(inner,d){
      var out = d(function(){return inner}, ctx);
      if (out === undefined) {
        if (!window.__dsDecoratorWarned) { window.__dsDecoratorWarned = 1; console.warn("[ds] a preview decorator returned undefined \u2014 skipped (addon stub?)"); }
        return inner;
      }
      return out;
    }, el);
  });
};\`);
  // Shim the DS package (by name, or by a relative path that resolves under
  // PKG_DIR \u2014 e.g. \`../src\` from .storybook/) to window.<GLOBAL> so we don't
  // re-bundle the whole DS and the provider's Context matches the bundle's.
  const pkgRoot = resolve(PKG_DIR);
  const dsShim = {
    name: 'ds-global',
    setup(b) {
      const escPkg = PKG.replace(/[.*+?^\${}()|[\\]\\\\]/g, '\\\\$&');
      // Exact match only \u2014 subpath imports (<pkg>/locales/en.json) must bundle
      // normally, not shim to a nonexistent window.<GLOBAL>.<subpath>.
      b.onResolve({ filter: new RegExp(\`^\${escPkg}$\`) }, () => ({ path: 'ds', namespace: 'ds-shim' }));
      b.onResolve({ filter: /^\\.\\.?\\// }, (a) => {
        const abs = resolve(a.resolveDir, a.path);
        if (abs === pkgRoot || abs === join(pkgRoot, 'src') || abs === join(pkgRoot, 'src', 'index')) {
          return { path: 'ds', namespace: 'ds-shim' };
        }
        return undefined;
      });
      b.onLoad({ filter: /^ds$/, namespace: 'ds-shim' }, () => ({
        contents: \`module.exports=window.\${GLOBAL};\`, loader: 'js',
      }));
    },
  };
  // Storybook-runtime/addon/msw packages are preview-time only. Stubbed (not
  // externalized \u2014 \`external\` in IIFE output leaves a bare require() that
  // throws in-browser); manager-api gets functional no-ops. One definition,
  // shared with preview compilation, lives in story-imports.mjs.
  const stubEmpty = storybookStubPlugin();
  // React shim for the decorator bundle: read window.React/ReactDOM at USE
  // time (getters), not via \`var R = window.React\` at thunk-define time \u2014
  // esbuild can hoist the CJS thunk call before the page global is live.
  const reactGlobal = {
    name: 'react-global',
    setup(b) {
      // Catch every subpath (react/jsx-runtime, react-dom/client,
      // react-dom/server, \u2026) so a transitive package's own \`import React\`
      // can't bundle a second copy alongside the page's window.React.
      b.onResolve({ filter: /^react(-dom)?($|\\/)/ }, (a) =>
        ({ path: a.path.startsWith('react-dom') ? 'rd' : 'r', namespace: 'rg' }));
      // ownKeys + getOwnPropertyDescriptor so esbuild's __toESM/__copyProps
      // (which enumerate via getOwnPropertyNames) see every React export \u2014
      // otherwise \`import {useState} from 'react'\` is undefined.
      const proxy = (g, extra) => \`new Proxy(\${extra},{
  get:function(o,k){return k in o?o[k]:(\${g}||{})[k]},
  ownKeys:function(o){return Array.from(new Set(Object.keys(o).concat(Object.keys(\${g}||{}))))},
  getOwnPropertyDescriptor:function(o,k){return{enumerable:true,configurable:true,get:function(){return k in o?o[k]:(\${g}||{})[k]}}}
})\`;
      b.onLoad({ filter: /^r$/, namespace: 'rg' }, () => ({
        loader: 'js',
        contents: \`function jsx(t,p,k){return window.React.createElement(t,k===void 0?p:Object.assign({key:k},p))}
module.exports=\${proxy('window.React', '{jsx:jsx,jsxs:jsx,jsxDEV:jsx,Fragment:undefined}')};\`,
      }));
      b.onLoad({ filter: /^rd$/, namespace: 'rg' }, () => ({
        loader: 'js',
        contents: \`module.exports=\${proxy('window.ReactDOM', '{}')};\`,
      }));
    },
  };
  try {
    await build({
      entryPoints: [entry], outfile: join(OUT, '_vendor', 'preview-decorators.js'),
      bundle: true, format: 'iife', platform: 'browser', target: 'es2020',
      jsx: 'automatic', loader: { '.js': 'jsx', '.json': 'json' },
      nodePaths: [NODE_MODULES], plugins: [reactGlobal, dsShim, stubEmpty],
      // Same defines as the preview compile \u2014 provider chains routinely guard
      // on NODE_ENV/__DEV__, and esbuild leaves undefined identifiers to
      // throw at load time.
      define: {
        'process.env.NODE_ENV': '"development"', __DEV__: 'true',
        ...IIFE_IMPORT_META_DEFINE,
      },
      logLevel: 'silent',
    });
    console.error(\`  preview-decorators.js: bundled from \${relative(pkgRoot, sbPreview)}\`);
    return true;
  } catch (e) {
    {
      // A decorator bundle failure always means the provider chain needs
      // manual config, so that line prints unconditionally.
      // esbuild rejections carry the signature in e.errors[0].text, not String(e).
      const err = e?.errors?.[0];
      const firstLine = String(err?.text ?? e?.message ?? String(e)).split('\\n')[0];
      console.error(\`  ! preview decorator bundle failed: \${firstLine}\`);
      // No hypothesis line here: the resolve-class remedies name the
      // story-imports fork seam, which this bundle's hardcoded plugins never
      // consult \u2014 the only actionable remedy is the unconditional line below.
      console.error('    decorators will not wrap previews \u2014 set cfg.provider to supply the context they provided');
    }
    return false;
  } finally {
    rmSync(entry, { force: true });
  }
}
`;
  });
  var aMc = __commonJS((wgv, xDf) => {
    xDf.exports = `// Non-storybook \`package\` adapter. Bundles dist/ when present (the authoritative
// component list comes from shipped .d.ts; with no dist it synthesizes an
// entry from src/ as a last resort) and opportunistically enriches each
// component from src/ \u2014 JSDoc and dir-derived group. Every enrichment miss
// degrades to the plain-dist behaviour.
//
// Discovery is heuristic-based; each heuristic has a \`.design-sync/config.json\`
// override (ASSUMPTION comments below name them) so repos that don't match the
// defaults write config, not code. \`componentSrcMap\` is the single override
// knob for component inclusion: non-null value = add/pin src path, null =
// exclude a .d.ts-exported internal.

import { existsSync, writeFileSync } from 'node:fs';
import { dirname, join, relative, resolve } from 'node:path';
import { Project, Node, ts } from 'ts-morph';
import { leadingJsdoc, readText, slash, walk } from './common.mjs';
import { resolveDistEntry } from './bundle.mjs';
import { exportedNames, isComponentName } from './dts.mjs';

const NON_IMPL_RX = /\\.(stories|test|spec)\\./;
const SRC_IMPL_RX = /\\.(tsx|jsx)$/;
// Dir names that don't usefully group components \u2014 skip so the emitted path
// is \`components/<group>/<Name>\` not \`components/components/<Name>\`.
const GENERIC_DIR = new Set(['components', 'component', 'src', 'lib', 'ui', 'packages', 'react']);
const slug = (s) => s.trim().toLowerCase().replace(/[^a-z0-9]+/g, '-').replace(/^-+|-+$/g, '') || 'general';

// No .d.ts \u2192 scan src files for PascalCase value exports via ts-morph.
function deriveComponentsFromSrc(srcFiles) {
  const project = new Project({
    skipAddingFilesFromTsConfig: true,
    compilerOptions: { jsx: ts.JsxEmit.Preserve, allowJs: true, skipLibCheck: true },
  });
  const seen = new Set();
  for (const p of srcFiles) {
    if (NON_IMPL_RX.test(p) || !SRC_IMPL_RX.test(p)) continue;
    const sf = project.addSourceFileAtPathIfExists(p);
    if (!sf) continue;
    for (const [name, decls] of sf.getExportedDeclarations()) {
      // \`export default function Button()\` is keyed as 'default' \u2014 recover
      // the declared name from the function/class node.
      const real = name === 'default'
        ? decls.map((d) => d.getName?.()).find((n) => n && n !== 'default')
        : name;
      if (!real || !/^[A-Z][A-Za-z0-9]*$/.test(real)) continue;
      if (decls.some((d) => Node.isVariableDeclaration(d) || Node.isFunctionDeclaration(d) || Node.isClassDeclaration(d))) {
        seen.add(real);
      }
    }
  }
  return [...seen].sort().map((name) => ({ name, group: 'general' }));
}

export async function resolvePackage(ctx) {
  const { PKG_DIR, pkgJson, ENTRY_OVERRIDE, PKG, OUT, cfg } = ctx;
  const srcMap = cfg.componentSrcMap ?? {};

  // \u2500\u2500 1. src/ discovery (best-effort; feeds enrichment + synth-entry fallback).
  // ASSUMPTION: source root is first of src/ | lib/ | components/. Override: cfg.srcDir.
  const srcRoot = [cfg.srcDir, 'src', 'lib', 'components']
    .map((d) => d && resolve(PKG_DIR, d))
    .find((d) => d && existsSync(d));
  const srcFiles = srcRoot ? walk(srcRoot, (n) => /\\.(tsx|jsx|mdx?)$/.test(n)) : [];

  // \u2500\u2500 2. entry: dist if it exists, else synthesize from src/ (last resort).
  let entry = resolveDistEntry({ pkgDir: PKG_DIR, pkgJson, override: ENTRY_OVERRIDE, pkgName: PKG, soft: true });
  let synthEntry = false;
  if (!entry) {
    if (!srcRoot) {
      console.error(\`[NO_DIST] \${PKG} has no built entry and no src/ to synthesize from \u2014 run its build.\`);
      process.exit(1);
    }
    const comps = srcFiles.filter((p) => SRC_IMPL_RX.test(p) && !NON_IMPL_RX.test(p));
    entry = join(OUT, '.pkg-entry.mjs');
    writeFileSync(entry, comps.map((p) => \`export * from \${JSON.stringify(p)};\`).join('\\n') + '\\n');
    synthEntry = true;
    console.error(
      \`[NO_DIST] no built entry \u2014 synthesizing from \${comps.length} src files (run the package's build for best results)\`,
    );
  }

  // \u2500\u2500 3. component list: from shipped .d.ts (authoritative when dist exists).
  // ASSUMPTION: components = PascalCase value exports in the .d.ts tree.
  // Override: cfg.componentSrcMap (non-null adds/pins, null excludes).
  const exported = exportedNames(PKG_DIR, pkgJson);
  const names = new Set([...exported].filter(isComponentName));
  for (const [k, v] of Object.entries(srcMap)) {
    if (v === null) { names.delete(k); continue; }
    // Names reach \`<script>\` blocks in the emitted HTML \u2014 reject anything
    // that isn't a plain PascalCase identifier.
    if (!/^[A-Z][A-Za-z0-9]*$/.test(k)) {
      console.error(\`[CONFIG] componentSrcMap: "\${k}" is not a valid component name (PascalCase identifiers only)\`);
      continue;
    }
    names.add(k);
  }
  let components = [...names].sort().map((name) => ({ name, group: 'general' }));
  if (!components.length && synthEntry) {
    components = deriveComponentsFromSrc(srcFiles).filter((c) => srcMap[c.name] !== null);
  }
  if (!components.length) {
    if (cfg.cssEntry || existsSync(join(PKG_DIR, 'styles.css'))) {
      console.error('[ZERO_MATCH] no component exports \u2014 treating as tokens-only DS');
      return { shape: 'package', entry, components: [], tokensOnly: true };
    }
    console.error(\`[ZERO_MATCH] no PascalCase exports in \${PKG} and no styles \u2014 nothing to sync\`);
    process.exit(1);
  }

  // \u2500\u2500 4. src/ enrichment per component. Every miss degrades to plain-dist.
  if (srcRoot) {
    for (const c of components) {
      // Pinned via config \u2192 skip fuzzy-find entirely.
      let hit = typeof srcMap[c.name] === 'string' ? slash(resolve(PKG_DIR, srcMap[c.name])) : null;
      if (!hit) {
        // ASSUMPTION: <Name>.tsx | <name>/<name>.tsx | <Name>/index.tsx |
        // <kebab-name>.tsx, case-insensitive; dir-match ranks above
        // bare-file match, then prefer one that actually exports \`c.name\`.
        // Override: cfg.componentSrcMap.
        const kebab = c.name.replace(/([a-z0-9])([A-Z])/g, '$1-$2');
        const nameRx = new RegExp(
          \`(?:^|/)(?:\${c.name}/(?:index|\${c.name})\\\\.(tsx|jsx)|(?:\${c.name}|\${kebab})\\\\.(tsx|jsx))$\`,
          'i',
        );
        const hits = srcFiles
          .filter((p) => nameRx.test(p) && !NON_IMPL_RX.test(p))
          .sort(
            (a, b) =>
              (b.toLowerCase().includes(\`/\${c.name.toLowerCase()}/\`) ? 1 : 0) -
              (a.toLowerCase().includes(\`/\${c.name.toLowerCase()}/\`) ? 1 : 0),
          );
        const exportRx = new RegExp(\`export\\\\s+(?:default\\\\s+)?(?:const|let|var|function|class)\\\\s+\${c.name}\\\\b\`);
        hit = hits.find((p) => exportRx.test(readText(p))) ?? hits[0];
      }
      if (!hit || !existsSync(hit)) continue;
      c.srcPath = hit;
      c.doc = leadingJsdoc(readText(hit), c.name) || undefined;
      // group = last src/ path segment that isn't the component's own dir or
      // a generic container name \u2014 else JSDoc @category \u2014 else 'general'.
      c.group = slug(
        slash(relative(srcRoot, dirname(hit)))
          .split('/')
          .filter((s) => s && s.toLowerCase() !== c.name.toLowerCase() && !GENERIC_DIR.has(s.toLowerCase()))
          .at(-1)
        || (c.doc && /@category\\s+(\\S+)/.exec(c.doc)?.[1])
        || 'general',
      );
    }
  }

  console.error(
    \`  package: \${components.length} components\` +
      (srcRoot ? \` (\${components.filter((c) => c.srcPath).length} src-matched)\` : ' (no src/ \u2014 dist-only)'),
  );
  return { shape: 'package', entry, components, synthEntry, exported };
}
`;
  });
  var lMc = __commonJS((Cgv, kDf) => {
    kDf.exports = `// How story modules resolve at preview-compile time. Small on purpose and
// FORKABLE: copy to .design-sync/overrides/story-imports.mjs (declare in
// cfg.libOverrides) when a repo's layout needs different rules \u2014 this seam
// owns ALL resolution policy, so a fork never touches generation or build
// orchestration. Lighter tweaks need no fork: cfg.storyImports.shim /
// cfg.storyImports.bundle are substring patterns matched against resolved
// paths (any import style \u2014 relative, tsconfig alias, bare workspace name)
// that force a module to the bundle global / to source bundling, and
// cfg.storyImports.loaders merges over STORY_LOADERS.
//
// Rules:
// 1. Package + extraEntries imports \u2192 \`window.<GLOBAL>\` (the shipped bundle).
//    Subpaths whose last segment is an exported component (\`<pkg>/Button\`)
//    shim with that export as the default; every other subpath
//    (\`<pkg>/locales/en.json\`, \`<pkg>/utils\`) bundles normally \u2014 a wrong
//    shim is silent, a missing module is loud (and the fix is named:
//    cfg.extraEntries merges a subpath's exports onto the global).
// 2. ANY import that RESOLVES to an EXPORTED component's module \u2192
//    \`window.<GLOBAL>\` too, however it was spelled (relative \`../Button\` \u2014
//    the dominant story convention \u2014 tsconfig alias, or monorepo path). This
//    keeps previews rendering the SHIPPED bundle instead of a duplicate
//    source copy \u2014 which breaks React context identity (consumers throw
//    their missing-provider errors) and drops co-located styles. Story files
//    themselves and anything under node_modules are never redirected.
//    Default imports get the matched export as \`default\` (default-importing
//    the component is a common story convention; a bare namespace shim
//    renders "Element type is invalid" in every such cell).
// 3. Every other import (fixtures, helpers, internal contexts) bundles from
//    source; component imports INSIDE those modules recurse through rule 2.
//    The honest residue: a story needing a component-PRIVATE context that
//    must share identity with the global component renders a cell error and
//    falls to grading/hand-fix \u2014 no shim can fix that, by construction.
// 4. @storybook/* runtime \u2192 functional stubs. manager/preview/client-api get
//    real no-op hooks (useGlobals/useArgs/addons \u2014 module-scope
//    \`addons.register()\` or a decorator calling \`useGlobals()\` on an empty
//    stub takes the whole module down); everything else gets an inert
//    callable proxy so the canonical CSF idiom \u2014 \`args: { onClick: fn() }\`,
//    \`action('click')\` at module scope \u2014 evaluates instead of throwing.
// 5. Styles/assets \u2192 LOADERS below (styles ship via _ds_bundle.css/styles.css;
//    images inline as data URLs so fixtures keep working offline). Exception:
//    \`.module.css\` falls through to esbuild's local-css default \u2014 class names
//    resolve and the compiled stylesheet lands at _preview/<Name>.css, which
//    the emitted html links when present.

import { existsSync, realpathSync } from 'node:fs';
import { relative, resolve } from 'node:path';

// Storybook's preview-api also re-exports React-compatible hooks for use in
// render functions \u2014 those delegate to the page's React (an inert stub there
// is a guaranteed render crash: destructuring a non-iterable).
const MANAGER_API_STUB =
  'const noopChannel={on(){},off(){},once(){},emit(){},removeListener(){}};' +
  'const addons={register(){},add(){},getChannel(){return noopChannel},setConfig(){},getConfig(){return{}}};' +
  'const R=function(){return window.React||{}};' +
  'module.exports={addons,types:{},useGlobals(){return[{},function(){}]},useArgs(){return[{},function(){},function(){}]},useParameter(){},useStorybookApi(){return{}},' +
  'useState(){return R().useState.apply(null,arguments)},useCallback(){return R().useCallback.apply(null,arguments)},useRef(){return R().useRef.apply(null,arguments)},' +
  'useMemo(){return R().useMemo.apply(null,arguments)},useEffect(){return R().useEffect.apply(null,arguments)},useReducer(){return R().useReducer.apply(null,arguments)},' +
  'useChannel(){return function(){}}};';

// Inert callable proxy: every member access yields another inert callable, so
// \`fn()\`, \`action("x")\`, \`expect.anything()\`, \`userEvent.click(...)\` all
// evaluate to harmless values at module scope. Named imports are copied by
// esbuild's CJS interop from own enumerable props, so the common API surface
// is materialized explicitly (Object.assign keeps them as own props of the
// callable default \u2014 do not change the proxy target's own-property shape);
// everything else resolves through the get trap. The DEFAULT export is a
// children-passthrough component: stories render addon defaults as JSX
// (@storybook/addon-links \`<LinkTo>\u2026</LinkTo>\`), and an object default
// throws "Element type is invalid" the instant React mounts it. Both traps
// hand back the REAL \`prototype\` \u2014 React's shouldConstruct() probes
// \`.prototype.isReactComponent\`, and a truthy proxy answer classifies the
// stub as a CLASS component, silently swallowing the children.
const INERT_STUB =
  'var inert=new Proxy(function(){},{' +
  'get:function(t,k){if(k==="then")return void 0;if(k==="prototype")return t.prototype;if(k==="valueOf"||k==="toString"||k===Symbol.toPrimitive)return function(){return""};return inert},' +
  'apply:function(){return inert},construct:function(){return{}}});' +
  'var m={};"fn action actions expect userEvent within waitFor screen fireEvent spyOn mocked jest vi configureActions decorateAction setupWorker http HttpResponse graphql rest".split(" ").forEach(function(k){m[k]=inert});' +
  'var def=function(p){return p&&p.children!==void 0?p.children:null};Object.assign(def,m);' +
  'module.exports=new Proxy(def,{get:function(t,k){if(k==="then")return void 0;if(k==="prototype")return t.prototype;return k in m?m[k]:k==="__esModule"?void 0:inert}});';

export const STORY_FILE_RE = /\\.stor(?:y|ies)\\.[cm]?[jt]sx?$/;

export const STORY_LOADERS = {
  // jsx is a strict syntax superset of js \u2014 JSX-in-.js story files are a
  // common convention and plain .js parses identically.
  '.js': 'jsx',
  '.css': 'empty', '.scss': 'empty', '.sass': 'empty', '.less': 'empty', '.styl': 'empty',
  '.png': 'dataurl', '.jpg': 'dataurl', '.jpeg': 'dataurl', '.gif': 'dataurl',
  '.webp': 'dataurl', '.avif': 'dataurl', '.svg': 'dataurl', '.ico': 'dataurl',
  '.woff': 'dataurl', '.woff2': 'dataurl', '.ttf': 'dataurl', '.eot': 'empty',
  '.md': 'text', '.mdx': 'empty', '.mp4': 'empty', '.webm': 'empty', '.mov': 'empty',
};

// Which exported component (if any) does a resolved file path look like the
// source module of? Matches \`<...>/Button/Button.tsx\`, \`<...>/Button/index.ts\`,
// and bare \`<...>/Button.tsx\`; returns the export name or null. A helper
// coincidentally named like an export (\`utils/Text.ts\`) would false-positive \u2014
// that's what cfg.storyImports.bundle is for; over-shimming surfaces
// immediately as undefined-component cell errors, never as silent wrong
// renders.
function exportedComponentFor(p, exported) {
  const segs = p.replace(/\\\\/g, '/').split('/');
  const file = (segs[segs.length - 1] ?? '').replace(/\\.[cm]?[jt]sx?$/, '');
  const dir = segs[segs.length - 2] ?? '';
  if (exported.has(file)) return file;
  if ((file === 'index' || file === dir) && exported.has(dir)) return dir;
  return null;
}

// The @storybook/* stub plugin alone \u2014 also used by the decorator bundler.
export function storybookStubPlugin() {
  return {
    name: 'sb-stub',
    setup(b) {
      b.onResolve({ filter: /^(@storybook\\/|storybook(\\/|$)|msw(\\/|$)|@mswjs\\/)/ }, (a) => ({ path: a.path, namespace: 'sb-stub' }));
      b.onLoad({ filter: /.*/, namespace: 'sb-stub' }, (a) => ({
        contents: /(^|\\/)(manager|preview|client)-api$/.test(a.path) ? MANAGER_API_STUB : INERT_STUB,
        loader: 'js',
      }));
    },
  };
}

// Build the esbuild plugin set for compiling preview .tsx files (generated
// story-module wrappers AND hand-authored previews \u2014 same rules for both).
// IMPORTANT for callers: any tsconfig-paths plugin must be registered AFTER
// these (buildPreviews does this) \u2014 the policy plugin resolves aliases via
// b.resolve, so a paths plugin registered first would bypass rule 2.
export function storyImportPlugins({ PKG, GLOBAL, extraEntries = [], exported, cfg, pkgDir }) {
  // Path-form entries (./, ../, absolute) are repo files bundled by path \u2014
  // they must never enter import-SPECIFIER matching below, where a story's
  // relative import could coincidentally equal the config string and get
  // wrongly shimmed to the global. Bare package specifiers only.
  extraEntries = extraEntries.filter((e) => !/^(\\.\\.?\\/|\\/|[A-Za-z]:[\\\\/])/.test(e));
  const escRx = (s) => s.replace(/[.*+?^\${}()|[\\]\\\\]/g, '\\\\$&');
  const pkgRx = new RegExp(\`^(?:\${[PKG, ...extraEntries].map(escRx).join('|')})(?:/.*)?$\`);
  const force = cfg?.storyImports ?? {};
  const matches = (p, pats) => Array.isArray(pats) && pats.some((s) => typeof s === 'string' && p.includes(s));
  // ESM facade shim, NOT CJS: in a \`"type":"module"\` repo esbuild applies
  // node's ESM-CJS interop to the importing file \u2014 \`default\` becomes the
  // whole exports object and \`__esModule\` is ignored \u2014 which breaks every
  // \`import Button from '<pkg>/Button'\` (the style most docs examples use).
  // An ESM module binds \`default\` explicitly under BOTH interop modes; the
  // star re-export of the raw CJS global keeps dynamic named access working
  // (hooks, constants \u2014 anything on the global beyond the component list).
  const shimFor = (name) =>
    \`export * from "__ds_raw__";var g=window.\${GLOBAL};export default \${
      name ? \`g[\${JSON.stringify(name)}]!==void 0?g[\${JSON.stringify(name)}]:g\` : \`"default" in g?g.default:g\`
    };\`;
  const shimResult = (name) => ({ path: name ? \`ds:\${name}\` : 'ds', namespace: 'ds-shim' });

  const dsShim = {
    name: 'ds-global',
    setup(b) {
      const entryNames = new Set([PKG, ...extraEntries]);
      b.onResolve({ filter: pkgRx }, (a) => {
        if (matches(a.path, force.bundle)) return null; // explicit bundle wins
        if (!entryNames.has(a.path)) {
          // Subpath import: a named component shims default-aware; anything
          // else bundles normally \u2014 a wrong root-namespace shim is silent
          // (undefined members), a missing module is loud, and the loud
          // path's fix is named (cfg.extraEntries / node_modules symlink in
          // the package's own source repo).
          const name = (a.path.split('/').pop() ?? '').replace(/\\.[cm]?[jt]sx?$/, '');
          return exported.has(name) ? shimResult(name) : null;
        }
        return shimResult(null);
      });
      b.onLoad({ filter: /.*/, namespace: 'ds-shim' }, (a) => ({
        contents: shimFor(a.path.startsWith('ds:') ? a.path.slice(3) : null),
        loader: 'js',
      }));
      // Location-independent story imports emitted by the preview generator:
      // \`@ds-stories/<repo-root-relative path>\` resolves against cwd, so the
      // same wrapper compiles from the generated cache or from
      // .design-sync/previews/ after a promote. Extensionless \u2014 esbuild
      // appends its resolve extensions.
      b.onResolve({ filter: /^@ds-stories\\// }, (a) => {
        const base = resolve(process.cwd(), a.path.slice('@ds-stories/'.length));
        for (const ext of ['', '.tsx', '.ts', '.jsx', '.js', '.mjs', '.cjs', '.mdx']) {
          if (existsSync(base + ext)) return { path: base + ext };
        }
        return { errors: [{ text: \`@ds-stories path not found: \${a.path} (resolved against \${process.cwd()})\` }] };
      });
      // The raw CJS module the ESM facade star-re-exports \u2014 dynamic names
      // (everything on the global) without a static export list.
      b.onResolve({ filter: /^__ds_raw__$/ }, () => ({ path: '__ds_raw__', namespace: 'ds-raw' }));
      b.onLoad({ filter: /.*/, namespace: 'ds-raw' }, () => ({
        contents: \`module.exports=window.\${GLOBAL};\`,
        loader: 'js',
      }));
    },
  };

  // Rule 2: resolve every remaining import and shim the ones that land on an
  // exported component's module \u2014 regardless of how the import was spelled.
  // Returning the b.resolve result (instead of null) keeps resolution single-pass.
  // The package's own source BARREL (src/index.* under the build cwd OR under
  // the package dir \u2014 monorepos build from the repo root while the barrel
  // lives at packages/<x>/src/) shims to the root namespace: \`import { X }
  // from "../src"\` would otherwise bundle a second copy of the whole library
  // with its own React contexts.
  const CWD = process.cwd().replace(/\\\\/g, '/');
  // realpath both roots \u2014 esbuild's resolver returns symlink-resolved paths,
  // and a merely-resolve()'d root (symlinked tmpdir, symlinked package dir)
  // would never prefix-match them.
  const real = (p) => { try { return realpathSync(p).replace(/\\\\/g, '/'); } catch { return null; } };
  const barrelRoots = [...new Set([CWD, real(process.cwd()), pkgDir && resolve(pkgDir).replace(/\\\\/g, '/'), pkgDir && real(pkgDir)].filter(Boolean))];
  const policyRedirect = {
    name: 'ds-import-policy',
    setup(b) {
      b.onResolve({ filter: /.*/ }, async (a) => {
        if (a.pluginData === 'ds-resolving') return null; // our own re-entry
        if (a.kind === 'entry-point' || (a.namespace && a.namespace !== 'file')) return null;
        const r = await b.resolve(a.path, {
          kind: a.kind, resolveDir: a.resolveDir, importer: a.importer,
          pluginData: 'ds-resolving',
        });
        if (r.errors.length > 0 || !r.path) return null;
        if (r.namespace && r.namespace !== 'file') return r;  // claimed by another plugin
        const p = r.path.replace(/\\\\/g, '/');
        if (STORY_FILE_RE.test(p)) return r;                  // never the story itself
        if (matches(p, force.bundle)) return r;               // explicit bundle wins
        if (matches(p, force.shim)) return shimResult(exportedComponentFor(p, exported));
        if (p.includes('/node_modules/')) return r;           // third-party stays put
        // relative() instead of a startsWith prefix \u2014 case-insensitive on
        // win32, where the pkgDir roots carry user-typed casing (a lowercase
        // d:\\ drive from --node-modules) while p carries cwd casing, and JS
        // realpathSync never canonicalizes case. Outside-root ('../') and
        // cross-drive (absolute) remainders can never match the anchor.
        // Known limit: darwin's default case-insensitive APFS still compares
        // case-sensitively here (path.posix.relative) \u2014 a blanket lowercase
        // compare would be wrong on case-SENSITIVE volumes, so mis-cased
        // --node-modules on mac remains the user's to fix.
        if (barrelRoots.some((root) => /^src\\/index\\.[cm]?[jt]sx?$/.test(relative(root, p).replace(/\\\\/g, '/')))) {
          return shimResult(null);                            // package source barrel
        }
        const name = exportedComponentFor(p, exported);
        return name ? shimResult(name) : r;
      });
    },
  };

  // Bare \`import console from "console"\` (and node:console) appears in real
  // story files; node builtins can't bundle for the browser, but this one has
  // an exact page-global equivalent.
  const consoleStub = {
    name: 'node-console-stub',
    setup(b) {
      b.onResolve({ filter: /^(node:)?console$/ }, () => ({ path: 'console', namespace: 'node-console' }));
      b.onLoad({ filter: /.*/, namespace: 'node-console' }, () => ({ contents: 'module.exports=console;', loader: 'js' }));
    },
  };

  return {
    plugins: [dsShim, storybookStubPlugin(), consoleStub, policyRedirect],
    loaders: { ...STORY_LOADERS, ...(force.loaders ?? {}) },
  };
}
`;
  });
  var cMc = __commonJS((Rgv, ADf) => {
    ADf.exports = `// Storybook-only CSS fallbacks \u2014 storybook-static's iframe.html is the source
// for both the compiled-stylesheet fallback (when _ds_bundle.css is a
// bundler-resolve-only stub) and remote webfont <link> scraping.

import { existsSync, readFileSync, statSync, writeFileSync } from 'node:fs';
import { dirname, join, relative, sep } from 'node:path';

// Brand fonts shipped via .storybook/preview-head.html land inline in the
// built iframe.html, often as base64 data-URI @font-face that no filename
// search finds. Harvest faces that are FULLY self-contained (every src is a
// data: URI \u2014 storybook's own UI fonts use file URLs and are skipped) for
// families nothing else shipped.
export function inlineFontFacesFromStorybook(sbStatic, existingRules) {
  if (!sbStatic) return [];
  let html;
  try { html = readFileSync(join(sbStatic, 'iframe.html'), 'utf8'); } catch { return []; }
  const familyOf = (block) => /font-family:\\s*['"]?([^'";}]+)/i.exec(block)?.[1].trim().toLowerCase();
  const have = new Set(existingRules.map(familyOf).filter(Boolean));
  const out = [];
  for (const m of html.matchAll(/@font-face\\s*\\{[^}]*\\}/gi)) {
    const block = m[0];
    const urls = [...block.matchAll(/url\\(\\s*['"]?([^'")]+)/gi)].map((u) => u[1]);
    if (!urls.length || !urls.every((u) => u.startsWith('data:'))) continue;
    const fam = familyOf(block);
    if (!fam || have.has(fam)) continue;
    out.push(block);
  }
  if (out.length) console.error(\`  [FONTS_FROM_PREVIEW_HEAD] harvested \${out.length} data-URI @font-face rule(s) from the storybook reference\`);
  return out;
}

// Utility-CSS / CSS-in-JS DSes often ship a dist/styles.css
// that's a stub \`@import "@scope/styles"\` meant for a bundler to resolve.
export function isPlaceholderCss(p) {
  if (!existsSync(p)) return false;
  const sz = statSync(p).size;
  if (sz > 500) return false;
  const txt = readFileSync(p, 'utf8');
  // Only @import/@charset/comments/whitespace \u2192 no real rules.
  const stripped = txt.replace(/\\/\\*[\\s\\S]*?\\*\\//g, '').replace(/@(import|charset)\\b[^;]*;/g, '').trim();
  return stripped.length === 0;
}

// If bundleCss is a placeholder stub, replace it with storybook-static's own
// compiled CSS (the largest local <link rel=stylesheet> in iframe.html).
// Relative url()s are NOT rewritten \u2014 sbStatic isn't uploaded, so pointing
// into it would break post-upload. They'll 404 in the preview (images missing)
// but class rules still apply. Returns the new srcDir for extractFonts, which
// DOES copy font files into the bundle.
export function fallbackCssFromStorybook({ bundleCss, sbStatic, out }) {
  // A MISSING _ds_bundle.css counts too \u2014 DSes that ship styles in a sibling
  // package (compiled JS imports no CSS) emit no css file at all.
  if ((existsSync(bundleCss) && !isPlaceholderCss(bundleCss)) || !sbStatic || !existsSync(join(sbStatic, 'iframe.html'))) return null;
  const iframeHtml = readFileSync(join(sbStatic, 'iframe.html'), 'utf8');
  const links = [...iframeHtml.matchAll(/<link\\b[^>]*>/gi)]
    .map((m) => m[0])
    .filter((t) => /\\brel\\s*=\\s*["']stylesheet["']/i.test(t))
    .map((t) => t.match(/\\bhref\\s*=\\s*["']([^"']+)["']/i)?.[1])
    .filter((h) => h && !/^(https?:|\\/\\/)/.test(h))
    .map((h) => join(sbStatic, h.replace(/^\\.\\//, '')))
    .filter((p) => p.startsWith(sbStatic + sep) && existsSync(p))
    .sort((a, b) => statSync(b).size - statSync(a).size);
  if (links[0]) {
    const was = existsSync(bundleCss) ? \`a \${statSync(bundleCss).size}B placeholder\` : 'missing';
    const kb = (statSync(links[0]).size / 1024).toFixed(0);
    const srcDir = dirname(links[0]);
    const css = readFileSync(links[0], 'utf8');
    const assets = [...new Set([...css.matchAll(/url\\(\\s*(['"]?)(?!data:|https?:|\\/\\/|\\/)([^'")]+)\\1\\s*\\)/gi)].map((m) => m[2]))];
    writeFileSync(bundleCss, css);
    console.error(\`[CSS_FROM_STORYBOOK] _ds_bundle.css was \${was} \u2014 replaced with \${relative(out, links[0])} (\${kb} KB).\`);
    if (assets.length) {
      console.error(\`[CSS_ASSETS] \${assets.length} relative url() ref(s) in the fallback CSS won't resolve post-upload (fonts are copied separately via extractFonts; images will 404): \${assets.slice(0, 5).join(', ')}\${assets.length > 5 ? ', \u2026' : ''}\`);
    }
    return srcDir;
  }
  console.error(\`[CSS_PLACEHOLDER] _ds_bundle.css is missing or a stub (@import-only, <500B) and no storybook CSS found to fall back to \u2014 set cfg.cssEntry to the compiled stylesheet.\`);
  return null;
}

// Remote stylesheet links (webfonts, etc.) from the storybook iframe. CSS-in-JS
// DSes emit no static stylesheet, but commonly inject a remote webfont <link>
// via .storybook/preview-head.html \u2014 that link
// is then the ONLY static style source. Returns absolute URLs to @import url().
export function scrapeRemoteImports(sbStatic) {
  if (!sbStatic || !existsSync(join(sbStatic, 'iframe.html'))) return [];
  const iframeHtml = readFileSync(join(sbStatic, 'iframe.html'), 'utf8');
  const out = [...new Set(
    [...iframeHtml.matchAll(/<link\\b[^>]*>/gi)]
      .map((m) => m[0])
      .filter((t) => /\\brel\\s*=\\s*["']stylesheet["']/i.test(t))
      .map((t) => t.match(/\\bhref\\s*=\\s*["']([^"']+)["']/i)?.[1])
      .filter((h) => h && /^(https?:|\\/\\/)/.test(h))
      .map((h) => (h.startsWith('//') ? 'https:' + h : h)),
  )];
  if (out.length) {
    console.error(\`  remote stylesheet(s) from storybook: \${out.length} \u2192 styles.css @import url(...)\`);
  }
  return out;
}
`;
  });
  var uMc = __commonJS((xgv, IDf) => {
    IDf.exports = `// Output emitters: vendor React, per-component files (.jsx / .d.ts /
// .prompt.md / <Name>.html), README.md, .ds-build-meta.json.
// Previews are self-contained (render from window.<GLOBAL>) \u2014 the compiled
// preview .tsx module (owned .design-sync/previews/ or the generated
// .cache/previews/) when its build succeeded, else the
// floor card (one render attempt with crash-prevention props; a deliberate
// typographic block when the root stays empty).

import { build } from 'esbuild';
import {
  cpSync,
  existsSync,
  mkdirSync,
  readFileSync,
  writeFileSync,
} from 'node:fs';
import { join, resolve } from 'node:path';
import { escapeHtml, IIFE_IMPORT_META_DEFINE, readText } from './common.mjs';
import { previewExamples } from './docs.mjs';

// React \u226418 ships UMD; React 19 dropped it, so we bundle our own IIFE.
export async function vendorReact({ nodeModules, out }) {
  // Hoisted monorepos (yarn node-modules linker, npm workspaces) keep react
  // \u2014 or just react-dom, when it's only a peerDependency \u2014 in the REPO-ROOT
  // node_modules; the synced package's own dir is sparse. Fail fast with the
  // remedy rather than walking up: the rest of the pipeline (esbuild
  // nodePaths, token/css scrapes) runs against the same root, so healing
  // only this read would leave the build half-resolved.
  const readOrRemedy = (rel) => {
    try {
      return readFileSync(join(nodeModules, rel), 'utf8');
    } catch (e) {
      if (e?.code !== 'ENOENT') throw e;
      throw new Error(
        \`\${rel.split('/')[0]} not found under --node-modules (no \${join(nodeModules, rel)}). \` +
        'In a hoisted monorepo the package\\'s own node_modules is sparse \u2014 pass the repo-root node_modules instead.',
      );
    }
  };
  const reactPkg = JSON.parse(readOrRemedy('react/package.json'));
  // Both branches assign under a temp global then \`||=\`-merge so a host
  // page's existing React isn't clobbered.
  const noClobber =
    ';window.React=window.React||window.__dsReact;' +
    'window.ReactDOM=window.ReactDOM||window.__dsReactDOM;' +
    'try{delete window.__dsReact;delete window.__dsReactDOM;}catch(e){}';
  const reactUmd = join(nodeModules, 'react/umd/react.development.js');
  if (existsSync(reactUmd)) {
    writeFileSync(
      join(out, '_vendor', 'react.js'),
      ';(function(){var __r=window.React,__rd=window.ReactDOM;' +
      readFileSync(reactUmd, 'utf8') + '\\n' +
      readOrRemedy('react-dom/umd/react-dom.development.js') + '\\n' +
      ';window.__dsReact=window.React;window.__dsReactDOM=window.ReactDOM;' +
      'if(__r)window.React=__r;if(__rd)window.ReactDOM=__rd;})();' + noClobber,
    );
  } else {
    console.error(\`  react@\${reactPkg.version} has no UMD \u2014 bundling via esbuild\`);
    await build({
      stdin: {
        contents:
          'window.__dsReact=require("react");' +
          'window.__dsReactDOM=require("react-dom");' +
          'try{Object.assign(window.__dsReactDOM,require("react-dom/client"))}catch(e){}',
        resolveDir: nodeModules,
      },
      bundle: true, format: 'iife', outfile: join(out, '_vendor', 'react.js'),
      platform: 'browser',
      define: { 'process.env.NODE_ENV': '"development"', ...IIFE_IMPORT_META_DEFINE },
      logLevel: 'error', footer: { js: noClobber },
    });
  }
  writeFileSync(join(out, '_vendor', 'react-dom.js'), '/* merged into react.js */');
}

// Serialize the floor card's crash-prevention props to a JS expression.
// {$jsx: 'Item', text} becomes \`h(C.Item,{},text)\`; everything else
// JSON-stringifies (with \`<\` escaped \u2014 this lands in a <script> block).
function scaffoldPropsExpr(props, mount) {
  const esc = (s) => (JSON.stringify(s) ?? 'null').replace(/</g, '\\\\u003c');
  // $raw values from smartDefaultProps are a small closed set of literal
  // expressions \u2014 whitelist-gate them so nothing upstream can inject
  // arbitrary JS into the emitted <script> block.
  const RAW_OK = /^(?:\\(\\)=>null|new Date\\(\\))$/;
  const pairs = Object.entries(props).map(([k, v]) => {
    const key = JSON.stringify(k);
    if (v && typeof v === 'object' && v.$jsx && /^[A-Za-z_$][\\w$]*(\\.[A-Za-z_$][\\w$]*)*$/.test(v.$jsx)) {
      return \`\${key}:h(\${mount}.\${v.$jsx},{},\${esc(v.text ?? '')})\`;
    }
    if (v && typeof v === 'object' && typeof v.$raw === 'string' && RAW_OK.test(v.$raw)) {
      return \`\${key}:\${v.$raw}\`;
    }
    return \`\${key}:\${esc(v)}\`;
  });
  return \`{\${pairs.join(',')}}\`;
}

// Preview rendered from the compiled preview .tsx (either home) \u2014 its
// IIFE assigns named exports to window.__dsPreview. Three render modes:
//   default          labeled grid, one cell per export (one card = the component)
//   ?story=<Export>  ONLY that story, full-bleed \u2014 the capture harnesses drive
//                    this for per-story capture (no cell interference: portals,
//                    shared radio-group names, focus, container measurement);
//                    unknown query params (serving tokens etc.) are ignored
//   cardMode:single  the default render is one story (cfg primaryStory or the
//                    first export) instead of the grid \u2014 for portal/overlay
//                    components whose stories paint over each other in a grid
//   cardMode:column  the grid at one cell per row \u2014 for stories wider than a
//                    multi-column cell (data tables, full-width bars): every
//                    story keeps full card width, primaryStory renders first
//                    (the product folds the card at ~500px; below the fold is
//                    hover-scroll), nothing is dropped the way single drops
//                    non-primary stories
// Single-story renders sit in a transformed wrapper, which makes it the
// containing block for position:fixed descendants \u2014 fixed bars/overlays render
// inside the card instead of escaping to the page viewport. Grid cells get the
// same transform plus overflow clipping: the product renders this grid LIVE
// (often narrower than the capture viewport), and an uncontained story that's
// wider than its cell paints over its neighbors there \u2014 clipping at the cell
// edge degrades to a cropped preview instead of a broken card. Captures are
// unaffected: the harnesses drive ?story= (full-bleed .ds-single, no clip).
// window.__dsCells always lists every export so the harness can pair stories
// without depending on the default render mode.
// Exported (with providerWrapper below) so lib/preview-rebuild.mjs can
// re-emit a single component's html without a full package-build.
export function previewHtmlModule(group, name, GLOBAL, providerWrap, decoratorScript, bundleCssLink, previewCssLink = '', card = {}) {
  const viewportAttr = card.viewport ? \` viewport="\${escapeHtml(card.viewport)}"\` : '';
  return \`<!-- @dsCard group="\${escapeHtml(group)}"\${viewportAttr} -->
<!doctype html>
<html><head><meta charset="utf-8">
  <link rel="stylesheet" href="../../../styles.css">\${bundleCssLink}\${previewCssLink}
  <style>
    body{margin:0;padding:24px;background:#fff}
    /* auto-fit (not auto-fill): empty tracks collapse, so a 1-2 story card
       fills the width instead of stranding stories in a half-width left
       column beside phantom empty columns */
    .ds-grid{display:grid;grid-template-columns:repeat(auto-fit,minmax(320px,1fr));gap:20px;align-items:start}
    .ds-grid.ds-col{grid-template-columns:1fr}
    .ds-cell{border:1px solid #e5e7eb;border-radius:8px;padding:12px;min-width:0;overflow:hidden;transform:translateZ(0)}
    .ds-cell>h4{margin:0 0 8px;font:600 12px system-ui;color:#6b7280;text-transform:uppercase;letter-spacing:.04em}
    .ds-single{transform:translateZ(0)}
  </style>
</head><body>
  <div class="ds-grid" id="g"></div>
  <script src="../../../_vendor/react.js"></script>
  <script src="../../../_vendor/react-dom.js"></script>
  <script src="../../../_ds_bundle.js"></script>\${decoratorScript}
  <script src="../../../_preview/\${name}.js"></script>
  <script>
    var h=React.createElement, g=document.getElementById('g');
    var E=[]; for (var k in (window.__dsPreview||{})) {
      if (typeof window.__dsPreview[k]==='function' && /^[A-Z]/.test(k)) E.push(k);
    }
    window.__dsCells=E.slice();
    var q=null; try{q=new URLSearchParams(location.search).get('story')}catch(e){}
    var MODE=\${JSON.stringify(card.cardMode === 'single' ? 'single' : card.cardMode === 'column' ? 'column' : 'grid')};
    window.__dsMode=MODE;
    var PRIMARY=\${JSON.stringify(card.primaryStory ?? '')};
    if(MODE==='column'){
      g.className+=' ds-col';
      // primaryStory renders first \u2014 it's what shows above the product's fold.
      var cpi=PRIMARY?E.indexOf(PRIMARY):-1;
      if(cpi>0){E.splice(cpi,1);E.unshift(PRIMARY)}
    }
    function mount(id,key){try{ReactDOM.createRoot(document.getElementById(id)).render(\${providerWrap('h(window.__dsPreview[key])')})}catch(e){document.getElementById(id).textContent='\u26A0 '+(e&&e.message||e)}}
    var pick=null;
    if(q){for(var j=0;j<E.length;j++){if(E[j]===q||E[j].toLowerCase()===q.toLowerCase()){pick=E[j];break}}}
    else if(MODE==='single'&&E.length){pick=E.indexOf(PRIMARY)>=0?PRIMARY:E[0]}
    if(q&&!pick){g.textContent='\u26A0 no export named '+q}
    else if(pick){
      var s=document.createElement('div'); s.className='ds-single'; s.id='r0';
      // The PRODUCT's default single render is full-bleed: a full-viewport
      // story root (100vh / Grommet full) plus body padding guarantees a
      // permanent 48px whitespace scrollbar in the card otherwise. Gated on
      // !q so ?story= captures keep the padding gutter \u2014 the graded framing
      // (and its edge-shadow room vs the storybook reference) stays
      // byte-identical to what every existing verdict was minted on.
      if(!q)document.body.style.padding='0';
      g.parentNode.replaceChild(s,g); mount('r0',pick);
    } else {
      for(var i=0;i<E.length;i++){
        var cell=document.createElement('section'); cell.className='ds-cell';
        cell.innerHTML='<h4>'+E[i]+'</h4><div id="r'+i+'"></div>'; g.appendChild(cell);
        mount('r'+i,E[i]);
      }
      if(E.length===0){g.textContent='\u26A0 no PascalCase exports in _preview/\${name}.js'}
    }
  </script>
</body></html>
\`;
}

// The FLOOR CARD \u2014 used whenever no compiled preview exists (nothing
// authored in the package shape; compile failure in either shape). One
// honest render attempt with the crash-prevention props; if the root comes
// up empty (component needs composition/state/providers we can't guess), the
// card swaps to a deliberate typographic block instead of showing a broken
// render. The component is fully importable either way \u2014 the card says so.
// data-ds-fallback lets the validator count typographic floors separately
// from broken renders.
function previewHtmlFloorCard(group, name, GLOBAL, providerWrap, rootMember, decoratorScript, bundleCssLink, smart) {
  // Namespace export (e.g. Dialog) \u2014 \`h(C,{})\` on a namespace object throws;
  // mount the Root sub-component instead.
  const mount = rootMember ? \`C.\${rootMember}\` : 'C';
  const props = smart?.props ?? {};
  return \`<!-- @dsCard group="\${escapeHtml(group)}" -->
<!doctype html>
<html><head><meta charset="utf-8">
  <link rel="stylesheet" href="../../../styles.css">\${bundleCssLink}
  <style>body{margin:0;padding:24px;background:#fff}</style>
</head><body>
  <div id="root"></div>
  <template id="ds-fallback">
    <div data-ds-fallback="" style="border:1px solid #e5e7eb;border-radius:12px;padding:28px 24px;max-width:520px;font-family:system-ui">
      <div data-ds-eyebrow="" style="font-size:11px;letter-spacing:.06em;text-transform:uppercase;color:#9ca3af"></div>
      <div style="font-size:20px;font-weight:600;color:#111827;margin-top:6px">\${escapeHtml(name)}</div>
      <div style="font-size:12px;color:#6b7280;margin-top:14px;line-height:1.5">Preview not yet authored. The component is fully importable \u2014 its API is in <code>\${escapeHtml(name)}.d.ts</code> and usage in <code>\${escapeHtml(name)}.prompt.md</code>.</div>
    </div>
  </template>
  <script src="../../../_vendor/react.js"></script>
  <script src="../../../_vendor/react-dom.js"></script>
  <script src="../../../_ds_bundle.js"></script>\${decoratorScript}
  <script>
    var h=React.createElement, C=window.\${GLOBAL}.\${name};
    var r=document.getElementById('root');
    function dsFallback(){
      r.innerHTML=document.getElementById('ds-fallback').innerHTML;
      // Group comes from the @dsCard marker line so the hashed body stays
      // group-free (a pure regroup must not read as a contract change).
      var c=document.childNodes[0], m=c&&c.nodeType===8?/group="([^"]*)"/.exec(c.nodeValue):null;
      var e=r.querySelector('[data-ds-eyebrow]'); if(e&&m)e.textContent=m[1];
    }
    try {
      ReactDOM.createRoot(r).render(\${providerWrap(\`h(\${mount},\${scaffoldPropsExpr(props, mount)})\`)});
    } catch (e) { dsFallback(); }
    // React render errors don't throw here \u2014 they leave the root empty. An
    // intentionally-empty render (returns null) earns the fallback too, and
    // so does a mount that's no more informative than the floor: a bare echo
    // of the stub children (the component name floating in white space) or a
    // visually collapsed render (invisible/headless output).
    setTimeout(function(){
      var t=(r.textContent||'').trim();
      if (!r.childElementCount && !t) return dsFallback();
      if (t === \${JSON.stringify(name)} || r.getBoundingClientRect().height < 2) dsFallback();
    }, 350);
  </script>
</body></html>
\`;
}

// JS expression that wraps \`expr\` in the config's provider chain (if any).
// \`{"$ref": "X"}\` in a prop value emits \`G.X\` instead of a JSON literal \u2014
// for providers that need a bundle export (e.g. \`theme={LIGHT_THEME}\`).
// \`hasDecorators\` \u2192 auto-detected .storybook/preview decorators were bundled
// to _vendor/preview-decorators.js which defines window.__dsDecorate; an
// explicit PROVIDER still wins so cfg.provider remains the manual override.
export function providerWrapper(PROVIDER, GLOBAL, hasDecorators) {
  if (!PROVIDER && hasDecorators) {
    return (expr) => \`(window.__dsDecorate?window.__dsDecorate(\${expr}):\${expr})\`;
  }
  // p.component and props reach a \`<script>\` block \u2014 validate as identifier
  // paths and escape \`<\` in stringified values.
  for (let p = PROVIDER; p; p = p.inner) {
    // Per-segment (see package-build's gate): a bare dot in the class admits
    // member-expression SyntaxErrors like \`Theme..Provider\`.
    if (!/^[A-Za-z_$][\\w$]*(\\.[A-Za-z_$][\\w$]*)*$/.test(p.component)) {
      console.error(\`[PROVIDER_INVALID] cfg.provider component "\${p.component}" isn't a valid identifier path\`);
      return (e) => e;
    }
  }
  const providerProps = (props, G) => {
    const pairs = Object.entries(props ?? {}).map(([k, v]) => {
      // $hint reaches a /* */ comment inside a <script> block \u2014 strip */ and
      // < so it can neither terminate the comment nor open a tag.
      const san = (s) => String(s).replace(/\\*\\//g, '* /').replace(/</g, '\\\\u003c');
      if (v && typeof v.$ref === 'string') {
        if (/^[A-Za-z_$][\\w$]*(\\.[A-Za-z_$][\\w$]*)*$/.test(v.$ref)) return \`\${JSON.stringify(k)}:\${G}.\${v.$ref}\`;
        console.error(\`[PROVIDER_INVALID] $ref "\${v.$ref}" isn't a valid identifier path\`);
        return \`\${JSON.stringify(k)}:undefined\`;
      }
      const val = v && typeof v.$hint === 'string'
        ? \`undefined /* your \${san(k)} \u2014 storybook applies an object with keys: \${san(v.$hint)} */\`
        : JSON.stringify(v).replace(/</g, '\\\\u003c');
      return \`\${JSON.stringify(k)}:\${val}\`;
    });
    return \`{\${pairs.join(',')}}\`;
  };
  return (expr, G = \`window.\${GLOBAL}\`) => {
    // Collect the chain so we can wrap innermost-first (N-deep, matches
    // providerJsx's walk).
    const chain = [];
    for (let p = PROVIDER; p; p = p.inner) chain.push(p);
    let out = expr;
    for (let i = chain.length - 1; i >= 0; i--) {
      const p = chain[i];
      out = \`h(\${G}.\${p.component},\${providerProps(p.props, G)},\${out})\`;
    }
    return out;
  };
}

// Story-source snippets for .prompt.md \u2014 slice each paired story's export
// block out of the story file verbatim: real JSX a human wrote, a better
// usage reference for the design agent than reconstructed prop strings.
// Line-based (export-to-next-export), capped, fence-sanitized.
function storySnippets(c, visibleStoryIds) {
  // Stories may be split across files \u2014 slice each snippet from the story's
  // OWN module (s.storySrc), parsed once per file.
  const parsed = new Map();
  const parseFile = (p) => {
    if (parsed.has(p)) return parsed.get(p);
    const src = readText(p);
    if (!src) { parsed.set(p, null); return null; }
    const lines = src.split('\\n');
    const starts = new Map();
    lines.forEach((l, i) => {
      const m = /^export (?:const|function) (\\w+)/.exec(l);
      if (m && !starts.has(m[1])) starts.set(m[1], i);
    });
    const entry = { lines, starts, boundaries: [...starts.values()].sort((a, b) => a - b) };
    parsed.set(p, entry);
    return entry;
  };
  const out = [];
  for (const s of visibleStoryIds.slice(0, 3)) {
    const file = s.storySrc ?? c.storySrc;
    if (!s.exportKey || !file) continue;
    const f = parseFile(file);
    if (!f || !f.starts.has(s.exportKey)) continue;
    const begin = f.starts.get(s.exportKey);
    const end = f.boundaries.find((i) => i > begin) ?? f.lines.length;
    let block = f.lines.slice(begin, Math.min(end, begin + 40)).join('\\n').trimEnd();
    if (end > begin + 40) block += '\\n// \u2026';
    out.push(\`// \${String(s.name ?? '').replace(/[\`\\r\\n]/g, ' ')}\\n\${block.replace(/\`\`\`/g, '')}\`);
  }
  return out;
}

export function emitPerComponent({ src, components, OUT, GLOBAL, PKG, VERSION, OVERRIDES, REPLACES, PROVIDER, hasDecorators, builtPreviews, propsBodyFor, compoundsFor, smartDefaultProps }) {
  // PROVIDER arrives pre-validated by package-build's gate: invalid
  // identifier paths and provably-unexported heads exit the build
  // ([PROVIDER_INVALID]/[PROVIDER_UNEXPORTED]); unprovable heads proceed
  // with an explicit [PROVIDER_UNVERIFIED] warning. Either way a non-null
  // PROVIDER is used as-is \u2014 one check site, no per-emitter drift.
  const wrap = providerWrapper(PROVIDER, GLOBAL, hasDecorators);
  const decoratorScript = hasDecorators ? '\\n  <script src="../../../_vendor/preview-decorators.js"></script>' : '';
  // One-line context reminder for every .prompt.md head. The full provider
  // chain lives in README.md, but agents routinely jump straight to a
  // component's prompt.md \u2014 without this line they compose provider-less.
  const providerNote = PROVIDER
    ? \` Wrap the tree in \\\`<\${PROVIDER.component}>\\\` (full provider chain in README.md \u2014 components read theme/i18n from that context).\`
    : hasDecorators
      ? \` Components expect the context this repo's \\\`.storybook/preview\\\` decorators provide (theme/i18n) \u2014 see README.md.\`
      : '';
  // _ds_bundle.css is optional (CSS-in-JS / headless DSes have none).
  const bundleCssLink = existsSync(join(OUT, '_ds_bundle.css'))
    ? '\\n  <link rel="stylesheet" href="../../../_ds_bundle.css">' : '';
  let done = 0;
  for (const c of components) {
    if (++done % 20 === 0 || done === components.length) console.error(\`  [DTS] \${done}/\${components.length} components\`);
    // One dir per component \u2014 the self-check's cardByDir stores the first
    // @dsCard .html per directory, so the .jsx and .html must be the only
    // pair in their dir.
    const dir = join(OUT, 'components', c.group, c.name);
    mkdirSync(dir, { recursive: true });
    // Apply cfg.overrides.<Component>.skip once so the preview grid,
    // .prompt.md variants, JSX examples, and asset subtitle all agree.
    const skip = new Set(OVERRIDES[c.name]?.skip ?? []);
    const visibleStoryIds = (c.storyIds ?? []).filter((s) => !skip.has(s.id));
    c.visibleStoryIds = visibleStoryIds;

    // .jsx \u2014 one-line re-export into window scope.
    writeFileSync(
      join(dir, \`\${c.name}.jsx\`),
      \`// Re-export of \${PKG}@\${VERSION} \${c.name}. Implementation is in the root _ds_bundle.js (window.\${GLOBAL}).\\n\` +
        \`Object.assign(window, { \${c.name}: window.\${GLOBAL}.\${c.name} });\\n\`,
    );

    // .d.ts \u2014 props interface from shipped types + @replaces JSDoc.
    const pb = propsBodyFor(c.name);
    const members = compoundsFor?.(c.name);
    const replaces = REPLACES[c.name] ? \` * @replaces \${REPLACES[c.name]}\\n\` : '';
    // Prelude (inlined type refs) goes AFTER the Props interface \u2014 the app's
    // parser takes the first interface in the file, and TS hoists type decls.
    const dts =
      \`import * as React from 'react';\\n\\n\` +
      \`/**\\n * \${c.name} \u2014 from \${PKG}@\${VERSION}\${c.importPaths?.size ? \` (\${[...c.importPaths][0]})\` : ''}.\\n\${replaces} */\\n\` +
      \`export interface \${c.name}Props\${pb?.generics ?? ''}\${pb?.extendsClause ?? ''} {\\n\${pb?.body ?? '  [key: string]: unknown;'}\\n}\\n\\n\` +
      (pb?.prelude ?? '') +
      // A namespace-only export (\`export * as Dialog\` \u2014 Root present,
      // no own Props) isn't itself callable \u2014 declare as just the member map.
      (members?.includes('Root') && !pb
        ? \`export declare const \${c.name}: {\\n\${members.map((m) => \`  \${m}: React.ComponentType<any>;\`).join('\\n')}\\n};\\n\`
        : \`export declare const \${c.name}: React.ComponentType<\${c.name}Props>\` +
          (members?.length ? \` & {\\n\${members.map((m) => \`  \${m}: React.ComponentType<any>;\`).join('\\n')}\\n}\` : '') +
          \`;\\n\`);
    // Strip structural hints \u2014 they're for smartDefaultProps, not the .d.ts reader.
    writeFileSync(join(dir, \`\${c.name}.d.ts\`), dts.replace(/ \\/\\* @(?:fn|arr) \\*\\//g, ''));

    // .prompt.md \u2014 first line is the element-index summary the design agent
    // reads; the body is the matched doc (cfg.docsDir / sibling .md) when one
    // exists, else a synthesized doc (## Props / ## Examples / ## Related)
    // built from what the converter already knows.
    const kw = c.docKeywords?.length ? \` Keywords: \${c.docKeywords.join(', ')}.\` : '';
    const head = \`\${c.name} from \${PKG}. Use via \\\`window.\${GLOBAL}.\${c.name}\\\` (bundle loaded from the root \\\`_ds_bundle.js\\\`).\${providerNote}\${kw}\\n\`;
    // Flat-sibling related components (DialogBody/MenuItem/TabPanel are
    // separate exports, not dotted) \u2014 surface the <Name>-prefixed siblings.
    const siblings = components
      .filter((s) => s !== c && s.name.startsWith(c.name) && s.name.length > c.name.length && /^[A-Z]/.test(s.name.slice(c.name.length)))
      .map((s) => \`\\\`\${s.name}\\\`\`);
    let prompt;
    if (c.docBody) {
      prompt = head + '\\n' + c.docBody + '\\n';
      // Append the synthesized ## Props when the doc body doesn't carry its
      // own props table/section \u2014 keeps .prompt.md format consistent.
      if (pb?.body && !/##\\s*Props\\b|\\|\\s*Prop\\s*\\|/i.test(c.docBody)) {
        const bodyClean = pb.body.replace(/ \\/\\* @(?:fn|arr) \\*\\//g, '');
        prompt += \`\\n## Props\\n\\n\\\`\\\`\\\`ts\\ninterface \${c.name}Props {\\n\${bodyClean}\\n}\\n\\\`\\\`\\\`\\n\`;
      }
    } else {
      // Synthesized doc.
      const parts = [head];
      if (c.doc) parts.push(c.doc + '\\n');
      if (members?.length) {
        const subs = members.map((m) => \`\\\`\${c.name}.\${m}\\\`\`).join(', ');
        parts.push(\`Sub-components: \${subs}. See the DS docs for composition \u2014 e.g. items like \\\`\${c.name}.Item\\\` go inside \\\`<\${c.name}>\\\`; containers like \\\`\${c.name}.Group\\\` wrap multiple \\\`<\${c.name}>\\\`s.\\n\`);
      }
      if (visibleStoryIds.length) {
        const variantNames = visibleStoryIds.map((s) => s.name);
        parts.push(\`Variants (see \\\`\${c.name}.html\\\`): \${variantNames.join(', ')}.\\n\`);
      }
      // ## Props \u2014 always include the section.
      if (pb?.body) {
        const bodyClean = pb.body.replace(/ \\/\\* @(?:fn|arr) \\*\\//g, '');
        parts.push(\`## Props\\n\\n\\\`\\\`\\\`ts\\ninterface \${c.name}Props {\\n\${bodyClean}\\n}\\n\\\`\\\`\\\`\\n\`);
      }
      // ## Examples \u2014 verbatim story-source snippets first; then any preview
      // .tsx exports, owned .design-sync/previews/ first else the generated
      // cache (gracefully empty when neither exists).
      const exParts = [];
      const snippets = storySnippets(c, visibleStoryIds);
      if (snippets.length) exParts.push('\`\`\`jsx\\n' + snippets.join('\\n\\n') + '\\n\`\`\`');
      const ownedTsx = resolve('.design-sync', 'previews', \`\${c.name}.tsx\`);
      const genTsx = resolve('.design-sync', '.cache', 'previews', \`\${c.name}.tsx\`);
      exParts.push(...previewExamples(existsSync(ownedTsx) ? ownedTsx : genTsx));
      if (exParts.length) parts.push(\`## Examples\\n\\n\${exParts.join('\\n\\n')}\\n\`);
      // ## Related.
      if (siblings.length || members?.length) {
        const rel = [...siblings, ...(members ?? []).map((m) => \`\\\`\${c.name}.\${m}\\\`\`)];
        parts.push(\`## Related\\n\\n\${rel.join(', ')}\\n\`);
      }
      prompt = parts.join('\\n');
    }
    writeFileSync(join(dir, \`\${c.name}.prompt.md\`), prompt);

    // <Name>.html \u2014 self-contained; same rendering for both shapes.
    const rootMember = members?.includes('Root') && !pb ? 'Root' : null;
    // Scaffold props for the fallback path (builtPreviews takes precedence):
    // .d.ts smart-defaults. When those produce a bad floor card, the fix is
    // an authored preview \u2014 there is no props-override config tier.
    const smart = smartDefaultProps?.(c.name, pb);
    // Precedence: compiled preview .tsx (hand-authored in
    // .design-sync/previews/ or generated in the cache) \u2192 floor card when the preview build was
    // skipped or failed. Story-local css modules compile to a sibling
    // _preview/<Name>.css (esbuild local-css) \u2014 link it when present.
    const previewCssLink = existsSync(join(OUT, '_preview', \`\${c.name}.css\`))
      ? \`\\n  <link rel="stylesheet" href="../../../_preview/\${c.name}.css">\` : '';
    // Single/column cards declare a viewport so the product renders the card
    // at a verified size. BOTH mode defaults are 900x700 \u2014 the harness
    // capture viewport. The declared viewport drives the solo ?story=
    // captures too, so a mode default that diverged from 900x700 would
    // silently move capture geometry under carried grades (cardMode isn't in
    // the grade key precisely because flipping it must not change a graded
    // pixel; an explicit ov.viewport IS keyed and re-grades). The product
    // fits the card to its \u2264728px column / 500px fold by scaling; content
    // below the fold is hover-scrollable.
    const ov = OVERRIDES?.[c.name] ?? {};
    // Unknown cardMode values fall through to grid silently \u2014 and the strict
    // config validation is key-name-only, so a typo'd value ("Column",
    // "singe") would otherwise render as grid with zero diagnostics.
    if (ov.cardMode && ov.cardMode !== 'single' && ov.cardMode !== 'column') {
      console.error(\`  ! cfg.overrides.\${c.name}.cardMode "\${ov.cardMode}" isn't "single" or "column" \u2014 rendering as a plain grid\`);
    }
    const card = ov.cardMode === 'single'
      ? { cardMode: 'single', primaryStory: ov.primaryStory, viewport: ov.viewport ?? '900x700' }
      : ov.cardMode === 'column'
        ? { cardMode: 'column', primaryStory: ov.primaryStory, viewport: ov.viewport ?? '900x700' }
        : ov.viewport ? { viewport: ov.viewport } : {};
    const html = builtPreviews?.has(c.name)
      ? previewHtmlModule(c.group, c.name, GLOBAL, wrap, decoratorScript, bundleCssLink, previewCssLink, card)
      : previewHtmlFloorCard(c.group, c.name, GLOBAL, wrap, rootMember, decoratorScript, bundleCssLink, smart);
    writeFileSync(join(dir, \`\${c.name}.html\`), html);
  }
}

// .review.html \u2014 one local page iframing every component card (the REAL
// html the product renders, not screenshots), grouped and labeled, for the
// human review pass: serve the bundle dir and open /.review.html. Dot-
// prefixed \u2192 never uploaded.
export function emitReviewPage({ OUT, components }) {
  const groups = new Map();
  for (const c of components) {
    if (!groups.has(c.group)) groups.set(c.group, []);
    groups.get(c.group).push(c);
  }
  const sections = [...groups.entries()].map(([g, cs]) =>
    \`<h2 style="font:600 16px system-ui;margin:28px 0 10px;color:#374151">\${escapeHtml(g)}</h2>\\n\` +
    \`<div style="display:grid;grid-template-columns:repeat(auto-fill,minmax(460px,1fr));gap:16px">\` +
    cs.map((c) =>
      \`<figure style="margin:0;border:1px solid #e5e7eb;border-radius:10px;overflow:hidden">\` +
      \`<figcaption style="font:600 13px system-ui;padding:8px 12px;background:#f9fafb;border-bottom:1px solid #e5e7eb">\${escapeHtml(c.name)}</figcaption>\` +
      \`<iframe src="components/\${encodeURIComponent(c.group)}/\${encodeURIComponent(c.name)}/\${encodeURIComponent(c.name)}.html" loading="lazy" style="width:100%;height:340px;border:0" title="\${escapeHtml(c.name)}"></iframe>\` +
      \`</figure>\`).join('\\n') +
    \`</div>\`).join('\\n');
  const html = \`<!doctype html>\\n<html><head><meta charset="utf-8"><title>Design-system preview review</title></head>\\n\` +
    \`<body style="margin:0;padding:24px;background:#fff;font-family:system-ui">\\n\` +
    \`<h1 style="font:600 20px system-ui;margin:0 0 4px">Preview review \u2014 \${components.length} component\${components.length === 1 ? '' : 's'}</h1>\\n\` +
    \`<p style="font:13px system-ui;color:#6b7280;margin:0">Each card below is the live preview html exactly as the app will render it. Tell the agent which ones look wrong.</p>\\n\` +
    \`\${sections}\\n</body></html>\\n\`;
  writeFileSync(join(OUT, '.review.html'), html);
}

// Provider JSX line for README (from cfg.provider chain).
function providerJsx(PROVIDER) {
  if (!PROVIDER) return '';
  let open = '', close = '';
  for (let p = PROVIDER; p; p = p.inner) {
    const props = Object.entries(p.props ?? {})
      .map(([k, v]) =>
        v && typeof v.$ref === 'string' ? \` \${k}={\${v.$ref}}\`
        : v && typeof v.$hint === 'string' ? \` \${k}={/* your \${k} \u2014 keys: \${String(v.$hint).replace(/\\*\\//g, '* /')} */}\`
        : \` \${k}={\${JSON.stringify(v)}}\`).join('');
    open += \`<\${p.component}\${props}>\`;
    close = \`</\${p.component}>\` + close;
  }
  return \`\${open}{children}\${close}\`;
}

export function emitReadme({ OUT, GLOBAL, PKG, VERSION, TOKENS_PKG, components, tokenFiles, hasProvider, PROVIDER, hasDecorators = false, jsdocFor, compoundsFor, guidelineCount = 0, headerText = '' }) {
  const tokenNames = new Set();
  for (const f of tokenFiles) {
    const css = readText(join(OUT, 'tokens', f));
    for (const m of css.matchAll(/(?<![\\w-])(--[A-Za-z][\\w-]*)\\s*:/g)) tokenNames.add(m[1]);
  }
  // Monolithic stylesheets (a single compiled CSS via cfg.cssEntry) declare
  // their custom properties inside _ds_bundle.css with no separate tokens/ \u2014
  // surface those instead of claiming the DS has no tokens.
  const bundleCssText = readText(join(OUT, '_ds_bundle.css'));
  const hasBundleCss = bundleCssText.trim().length > 0 && !bundleCssText.startsWith('/* @ds-css-runtime');
  let tokensInBundle = false;
  if (tokenNames.size === 0 && hasBundleCss) {
    for (const m of bundleCssText.matchAll(/(?<![\\w-])(--[A-Za-z][\\w-]*)\\s*:/g)) tokenNames.add(m[1]);
    tokensInBundle = tokenNames.size > 0;
  }
  const tokenFamilies = { color: [], spacing: [], typography: [], radius: [], shadow: [], other: [] };
  for (const t of tokenNames) {
    const k = /color|bg-|fg-|text-|fill|border-(?!radius|width)|surface/i.test(t) ? 'color'
      : /space|gap|pad|margin|inset|-p-|-m-/i.test(t) ? 'spacing'
      : /font|line-height|letter|weight|tracking/i.test(t) ? 'typography'
      : /radius|rounded/i.test(t) ? 'radius'
      : /shadow|elevation/i.test(t) ? 'shadow'
      : 'other';
    tokenFamilies[k].push(t);
  }
  const tokenOverview = Object.entries(tokenFamilies)
    .filter(([, v]) => v.length)
    .map(([k, v]) => \`- **\${k}** (\${v.length}): \\\`\${v.slice(0, 3).join('\`, \`')}\\\`\${v.length > 3 ? ', \u2026' : ''}\`)
    .join('\\n');
  const byGroup = new Map();
  for (const c of components) {
    if (!byGroup.has(c.group)) byGroup.set(c.group, []);
    byGroup.get(c.group).push(c);
  }
  const componentIndex = [...byGroup.entries()]
    .map(([g, cs]) => \`### \${g}\\n\${cs.map((c) => {
      const doc = jsdocFor(c.name);
      const members = compoundsFor?.(c.name) ?? [];
      const memberNote = members.length
        ? \` (compound: \${members.slice(0, 6).map((m) => \`\\\`\${c.name}.\${m}\\\`\`).join(', ')}\${members.length > 6 ? ', \u2026' : ''})\`
        : '';
      return \`- \\\`\${c.name}\\\`\${doc ? \` \u2014 \${doc}\` : ''}\${memberNote}\`;
    }).join('\\n')}\`)
    .join('\\n\\n');
  const readme = \`# \${GLOBAL} (\${PKG}@\${VERSION})

This design system is the published \${PKG} React library, bundled as a single
browser global. All \${components.length} components are the real upstream code.

## Where things are

- \\\`_ds_bundle.js\\\` \u2014 the whole-DS bundle at the project root; loads every component to \\\`window.\${GLOBAL}\\\`. First line is a \\\`/* @ds-bundle: \u2026 */\\\` metadata header.
- \\\`styles.css\\\` \u2014 the single stylesheet entry\${hasBundleCss ? ': it \`@import\`s the tokens, fonts, and component styles (\`_ds_bundle.css\`)' : ' (tokens and fonts; this DS injects component styles at runtime)'}. Link this one file.
- \\\`components/<group>/<Name>/<Name>.prompt.md\\\` (example JSX + variants), \\\`<Name>.d.ts\\\` (types), \\\`<Name>.html\\\` (variant grid).
- \\\`tokens/*.css\\\` \u2014 CSS custom properties, names verbatim from upstream.
- \\\`fonts/\\\` \u2014 \\\`@font-face\\\` files + \\\`fonts.css\\\` (when the package ships fonts).
\${guidelineCount ? \`- \\\`guidelines/\\\` \u2014 the design system's own usage guidance (\${guidelineCount} doc(s), see \\\`guidelines/index.md\\\`). Read these before composing larger layouts.\\n\` : ''}
For a specific component, \\\`read_file("components/<group>/<Name>/<Name>.prompt.md")\\\`.

## Loading

Add these two lines to your page once (React must be on the page first):

\\\`\\\`\\\`html
<link rel="stylesheet" href="styles.css">
<script src="_ds_bundle.js"></script>
\\\`\\\`\\\`

Components are then available at \\\`window.\${GLOBAL}.*\\\`. Mount into a dedicated child node (e.g. \\\`<div id="ds-root">\\\`), not the host page's own React root, so the two trees don't collide:

\\\`\\\`\\\`jsx
const { \${components[0]?.name ?? 'Component'} } = window.\${GLOBAL};
ReactDOM.createRoot(document.getElementById('ds-root')).render(<\${components[0]?.name ?? 'Component'} />);
\\\`\\\`\\\`
\${hasProvider ? \`
Wrap the tree in the provider \u2014 most components read theme/i18n from context:

\\\`\\\`\\\`jsx
\${providerJsx(PROVIDER)}
\\\`\\\`\\\`
\` : hasDecorators ? \`
This DS's storybook wraps every story in decorators from \\\`.storybook/preview\\\`
(bundled for the preview cards as \\\`_vendor/preview-decorators.js\\\`). Components
likely need equivalent context \u2014 theme/i18n providers \u2014 in your tree too. The
exact chain hasn't been distilled into config, so check the DS's documented
provider setup before composing.
\` : ''}
## Tokens

\${tokenNames.size} CSS custom properties from \${TOKENS_PKG ?? PKG}. Names are
preserved verbatim from upstream. \${tokensInBundle
    ? 'They are declared inside \`_ds_bundle.css\` (this DS ships one compiled stylesheet rather than separate token files).'
    : tokenNames.size ? 'See \`tokens/\` for the full list.' : 'None detected \u2014 this DS may compute styles at runtime (CSS-in-JS).'}

\${tokenOverview}

## Components

\${componentIndex}
\`;
  // Repo-authored header (cfg.readmeHeader) rides at the very top so it
  // survives the consumer's 32,000-char inline truncation, which cuts the
  // TAIL. Verbatim concat \u2014 the header is repo-committed content in the
  // same trust class as the README body.
  const assembled = headerText.trim() ? headerText.trimEnd() + '\\n\\n' + readme : readme;
  if (assembled.length > 31_900) {
    // One frame, two overflow sides \u2014 naming the wrong side once inverted
    // the budget guidance (the header survives tail-truncation only while
    // it fits the 32,000-char inline window itself).
    const side = headerText.length > 31_900
      ? \`the readmeHeader alone is \${headerText.length} chars, so the header itself gets tail-truncated and the generated body contributes ZERO \u2014 trim the HEADER below ~31,900\`
      : \`the prepended header survives; the END of the generated body is what gets lost (typically the component index tail) \u2014 accept that deliberately, or reduce the synced surface (package shape: componentSrcMap exclusions / narrower tokensGlob; storybook shape: sync fewer stories)\`;
    console.error(\`  ! README.md is \${assembled.length} chars \u2014 the app inlines only the first 32,000 into the agent prompt (\${side}); see the base SKILL.md Budget guidance.\`);
  }
  writeFileSync(join(OUT, 'README.md'), assembled);
}

// .ds-build-meta.json \u2014 LOCAL build metadata only. The validator reads
// \`componentCount\` / \`skippedStoryIds\` / \`runtimeFontPrefixes\`; it is NOT
// uploaded.
export function emitBuildMeta({ OUT, GLOBAL, PKG, VERSION, PROVIDER, OVERRIDES, components, shape, cfg }) {
  const skippedStoryIds = [...new Set(Object.values(OVERRIDES).flatMap((o) => o?.skip ?? []))];
  // Fence so consumers don't read a half-uploaded tree (see the Upload section of the skill).
  // The app's self-check reads \`by\` to set the manifest's \`source\`.
  writeFileSync(join(OUT, '_ds_needs_recompile'), JSON.stringify({ by: 'design-sync-cli' }));
  writeFileSync(
    join(OUT, '.ds-build-meta.json'),
    JSON.stringify(
      {
        namespace: GLOBAL,
        source: \`\${PKG}@\${VERSION}\`,
        shape,
        provider: PROVIDER?.component ?? null,
        componentCount: components.length,
        skippedStoryIds,
        runtimeFontPrefixes: cfg?.runtimeFontPrefixes ?? [],
      },
      null,
      2,
    ) + '\\n',
  );
  return components.length;
}
`;
  });