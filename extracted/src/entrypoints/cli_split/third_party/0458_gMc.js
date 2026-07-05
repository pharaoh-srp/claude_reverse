  var gMc = __commonJS((Dgv, LDf) => {
    LDf.exports = `// One chromium page visit against the reference storybook-static: fiber-walk
// provider detection. Fallback diagnostic for when
// the .storybook/preview decorator bundle fails (or doesn't exist) and
// previews show context/provider errors \u2014 it infers the provider chain the
// repo's own storybook wraps stories in, as a cfg.provider suggestion.
// Provider match is name-based (displayName/name) \u2014 the storybook page's
// React is a separate bundled copy, so identity-matching against our
// _ds_bundle.js wouldn't work.
//
// Standalone usage (prints a cfg.provider suggestion as JSON on stdout):
//   node storybook/probe.mjs --storybook-static .design-sync/sb-reference \\
//     [--story-id <id>] [--names Button,ThemeProvider,\u2026]

import { existsSync, readFileSync } from 'node:fs';
import { join, resolve } from 'node:path';
import { pathToFileURL } from 'node:url';
import { serveDir } from './http-serve.mjs';

// Walk fibers from the story's leaf node upward, recording every named
// component. \`names\` (when non-empty) filters to that set \u2014 pass the DS's
// exported names so story-internal wrappers don't pollute the chain; with no
// filter, every PascalCase-named fiber is recorded (diagnostic mode).
const FIBER_WALK_STORE = \`((names) => {
  const set = new Set(names);
  const root = document.querySelector('#storybook-root') || document.querySelector('#root');
  // Descend to the leaf, skipping injected metadata elements \u2014 CSS-in-JS
  // runtimes often put a <style>/<script> as the first child, which has no
  // fiber and would dead-end provider detection.
  const SKIP = /^(STYLE|SCRIPT|LINK|META|TEMPLATE)$/;
  const content = (el) => [...el.children].find((c) => !SKIP.test(c.tagName));
  let n = root && content(root);
  while (n) { const c = content(n); if (!c) break; n = c; }
  if (!n || n === root) return (window.__dsChain = []).length;
  const fkey = Object.keys(n).find((k) => k.startsWith('__reactFiber$'));
  let fiber = fkey ? n[fkey] : null;
  const out = [];
  while (fiber) {
    const t = fiber.type || fiber.elementType;
    const nm = t && (t.displayName || t.name);
    if (nm && /^[A-Z]/.test(nm) && (set.size === 0 || set.has(nm))) out.push({ component: nm, liveProps: fiber.memoizedProps || {} });
    fiber = fiber.return;
  }
  return (window.__dsChain = out.reverse()).length;
})\`;

const RESOLVE_PROPS = \`(() => {
  // Primitives pass through; objects become a $hint of their top-level keys
  // (the user sets the real value via cfg.provider).
  const ser = (v) => {
    if (v == null || typeof v !== 'object') return typeof v === 'function' ? undefined : v;
    if (v.$$typeof) return undefined;
    return { $hint: Object.keys(v).slice(0, 5).map((k) => String(k).replace(/[^\\\\w]/g, '_')).join(',') };
  };
  // The chain runs outermost-first. Keep only the outermost component plus
  // any immediately-nested one whose name suggests it's part of the provider
  // shell (Provider/Theme/Root/App) \u2014 layout components like Box/Grid deeper
  // in are story-specific, not provider.
  const chain = window.__dsChain || [];
  const shell = chain.slice(0, 1).concat(
    chain.slice(1).filter((c, i) => i < 1 && /Provider|Theme|Root|App|Config|Styles|Reset|Base/i.test(c.component)),
  );
  return shell.map((c) => {
    const props = {};
    for (const [k, v] of Object.entries(c.liveProps)) {
      if (k === 'children') continue;
      const s = ser(v);
      if (s !== undefined) props[k] = s;
    }
    return { component: c.component, props };
  });
})\`;

// \`sbStatic\` is served directly \u2014 the reference storybook build, not an
// uploaded artifact.
export async function probe({ sbStatic, firstStoryId, exportedNames = [] }) {
  let pw;
  try { pw = await import('playwright'); }
  catch {
    console.error('[NO_CHROMIUM] provider detection skipped \u2014 set cfg.provider manually if the DS needs one');
    return { provider: null };
  }
  const { srv, port } = await serveDir(sbStatic);
  let browser;
  try {
    browser = await pw.chromium.launch(
      process.env.DS_CHROMIUM_PATH ? { executablePath: process.env.DS_CHROMIUM_PATH } : {},
    );
    const page = await browser.newPage();
    await page.goto(\`http://127.0.0.1:\${port}/iframe.html?id=\${encodeURIComponent(firstStoryId)}&viewMode=story\`, { waitUntil: 'networkidle', timeout: 30_000 });
    // Storybook 7+ renders into #storybook-root; v6 into #root. Wait for
    // CONTENT, not any child \u2014 CSS-in-JS runtimes inject <style> first and
    // waitForSelector locks onto the first match.
    await page.waitForSelector(':is(#storybook-root, #root) > :not(style,script,link,meta,template)', { timeout: 10_000 }).catch(() => {});
    await page.evaluate(\`(\${FIBER_WALK_STORE})(\${JSON.stringify(exportedNames)})\`).catch(() => 0);
    const chain = await page.evaluate(\`(\${RESOLVE_PROPS})()\`).catch(() => []);
    const provider = chain.length
      ? chain.reduceRight((inner, p) => ({ component: p.component, props: p.props, ...(inner ? { inner } : {}) }), null)
      : null;
    if (provider) console.error(\`[PROVIDER_DETECTED] \${chain.map((p) => p.component).join(' > ')}\`);
    return { provider };
  } catch (e) {
    console.error(\`  ! probe: \${String(e).split('\\n')[0]}\`);
    return { provider: null };
  } finally {
    await browser?.close().catch(() => {});
    srv.close();
  }
}

// \u2500\u2500 standalone CLI \u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500
if (process.argv[1] && pathToFileURL(resolve(process.argv[1])).href === import.meta.url) {
  const argv = process.argv.slice(2);
  const flag = (n, d) => { const i = argv.indexOf(\`--\${n}\`); return i < 0 ? d : argv[i + 1]; };
  const sbStatic = flag('storybook-static') && resolve(flag('storybook-static'));
  if (!sbStatic || !existsSync(join(sbStatic, 'iframe.html'))) {
    console.error('usage: node storybook/probe.mjs --storybook-static <dir> [--story-id <id>] [--names A,B]');
    process.exit(2);
  }
  let storyId = flag('story-id');
  if (!storyId) {
    const idx = JSON.parse(readFileSync(join(sbStatic, 'index.json'), 'utf8'));
    storyId = Object.values(idx.entries ?? idx.stories ?? {}).find((e) => !e.type || e.type === 'story')?.id;
  }
  if (!storyId) { console.error('no story entries in index.json \u2014 pass --story-id'); process.exit(2); }
  const names = (flag('names') ?? '').split(',').map((s) => s.trim()).filter(Boolean);
  const { provider } = await probe({ sbStatic, firstStoryId: storyId, exportedNames: names });
  // The cfg.provider suggestion \u2014 paste into .design-sync/config.json after
  // resolving each $hint: literals for small scalars; for data the repo
  // already owns (locale JSON, theme objects), prefer a 2-line module via
  // cfg.extraEntries referenced with {"$ref": "<export>"} (repo files need
  // an explicit ./ or ../ package-relative entry; bare names resolve from
  // node_modules) \u2014 an inlined copy duplicates into every card and rots
  // when the source file changes, so anything sizable or evolving belongs
  // behind a $ref.
  console.log(JSON.stringify({ provider }, null, 2));
  process.exit(0);
}
`;
  });
  var yMc = __commonJS((Mgv, FDf) => {
    FDf.exports = `#!/usr/bin/env node
// Capture harness for matching self-contained previews (<Name>.html rendering
// from _ds_bundle.js) against the repo's own storybook render \u2014 the fidelity
// ground truth. This script captures the TWO TRUE IMAGES per story and pairs
// them; it does NOT judge visual similarity and computes no similarity
// heuristics (pixel diffs and text/font scores mislead whenever layout or
// framing legitimately differs \u2014 the agent's eyes on the real screenshots are
// the judge). Grading is the working agent's job: Read the sheet PNG
// (storybook | preview), decide match/close/mismatch per story, and record it
// in the grade file (see GRADE FILES below). The only verdicts this script
// emits are factual: the story didn't render in storybook (sb-error), no
// preview cell pairs with the story (unpaired), the cell threw (error).
//
// Per paired story it captures, at full native resolution:
//   <out>/_screenshots/compare/raw/<base>__sb.png   storybook root screenshot
//   <out>/_screenshots/compare/raw/<base>__ds.png   preview cell screenshot
// and a sheet PNG per component (<out>/_screenshots/compare/<group>__<Name>.png,
// storybook | preview per story; images are shrunk to fit \u2014 the raw/ PNGs are
// the full-resolution authority when in doubt). Sheets and shots are transient
// (package-build wipes <out>).
//
// ALL state is campaign-local and gitignored (.design-sync/.cache/compare/):
//   <Name>.grade.json  the grading agent's verdicts (see GRADE FILES below)
//   <Name>.json        capture facts \u2014 pairing, shot paths, srcSha,
//                      spot-check anchors. Reconstructible.
// Nothing is committed \u2014 CROSS-MACHINE carry-forward is derived from the
// uploaded project instead (lib/remote-diff.mjs vs its _ds_sync.json):
// a component unchanged vs the upload was already verified at upload time.
//
// LIFECYCLE \u2014 one invariant: grades follow the user's SOURCES. The grade
// key is the build-stamped sourceKey (story files, owned preview source,
// story set, preview-affecting config, committed forks \u2014 lib/sync-hashes.mjs).
// Styling, bundle, and pipeline-internal churn (compiled bytes, generated
// html, toolchain) never invalidate: artifact churn on source-stable
// components is verified by a sampled [SPOT_CHECK], not wholesale re-grading.
// - Grade key unchanged + fully graded match/close \u2192 skipped outright
//   ("carried forward"); no capture.
// - Grade key changed \u2192 recapture, grade cleared, re-grade from the fresh
//   sheet. [STORY_CHANGED] marks the stories whose contract moved (an owned
//   preview must be edited); without it, re-grading is usually all that's
//   needed. Screenshot bytes are never compared \u2014 pixel jitter is irrelevant.
// - [SPOT_CHECK]: full runs re-capture a couple of carried-forward
//   components (grades kept) when shared inputs changed, so the lockstep
//   assumption keeps earning trust. --spot-check N tunes it (0 disables);
//   --spot-check-components A,B names the picks explicitly with the same
//   semantics, and is honored on scoped runs too (the \xA77 step-4 audit).
// - --force recaptures everything AND clears all grades (fresh verdicts) \u2014
//   for systemic re-verification, not casual sheet regeneration.
//
// GRADE FILES \u2014 written by the agent after Reading the images:
//   {"stories": {"<story name>": {"verdict": "match|close|mismatch", "note": "\u2026"}}}
//
// Safe for parallel subagents when scoped via --components to disjoint sets:
// per-component outputs don't collide, and the aggregate report
// (<out>/.compare-report.json, full runs only) is skipped.
//
// Usage:
//   node storybook/compare.mjs --out ./ds-bundle \\
//     --storybook-static .design-sync/sb-reference \\
//     [--components Button,Tabs] [--max-stories 6] [--force] [--spot-check 2]
//     [--spot-check-components Button,Tabs]

import { createHash } from 'node:crypto';
import { existsSync, mkdirSync, readFileSync, readdirSync, rmSync, writeFileSync } from 'node:fs';
import { join, resolve } from 'node:path';
import { escapeHtml, exportName, hypothesisLine } from '../lib/common.mjs';
import { KEY_RECIPE, gradeKeyFrom, renderHashFor, sbBaseShaFor } from '../lib/sync-hashes.mjs';
import { serveDir } from './http-serve.mjs';

const argv = process.argv.slice(2);
const flag = (n, d) => { const i = argv.indexOf(\`--\${n}\`); return i < 0 ? d : argv[i + 1]; };
// Unconsumed argv is silently dead otherwise \u2014 \`--components A B\` runs only A.
{
  const VALUE_FLAGS = ['out', 'components', 'max-stories', 'storybook-static', 'spot-check', 'spot-check-components'];
  for (let i = 0; i < argv.length; i++) {
    if (argv[i] === '--force') continue;
    if (argv[i].startsWith('--') && VALUE_FLAGS.includes(argv[i].slice(2))) { i++; continue; }
    console.error(\`(unrecognized argument "\${argv[i]}" \u2014 ignored; multi-component scoping is comma-separated: --components A,B)\`);
  }
}
const OUT = flag('out') && resolve(flag('out'));
const ONLY = flag('components') ? new Set(flag('components').split(',').map((s) => s.trim()).filter(Boolean)) : null;
const SPOT_PICKS = flag('spot-check-components') ? flag('spot-check-components').split(',').map((s) => s.trim()).filter(Boolean) : [];
const MAX_STORIES = Number(flag('max-stories', '6')) || 6;
const FORCE = argv.includes('--force');
if (!OUT || !existsSync(join(OUT, '.stories-map.json'))) {
  console.error('usage: node storybook/compare.mjs --out <ds-bundle> --storybook-static <dir> [--components A,B]');
  console.error('(requires <out>/.stories-map.json \u2014 run package-build.mjs first)');
  process.exit(2);
}
const manifest = JSON.parse(readFileSync(join(OUT, '.stories-map.json'), 'utf8'));
// A manifest stamped under a different recipe can't vouch for its keys \u2014
// drop them so every consumer below (key derivation, shim, capture-json
// provenance) falls back to the render-contract keying, same as the other
// recipe-gated consumers (remote-diff, preview-rebuild).
if (manifest.keyRecipe !== KEY_RECIPE) for (const c of manifest.components ?? []) delete c.sourceKey;
const SB = resolve(flag('storybook-static', manifest.storybookStatic ?? ''));
if (!SB || !existsSync(join(SB, 'iframe.html'))) {
  console.error(\`[SB_REFERENCE_MISSING] \${SB || '(unset)'} has no iframe.html \u2014 build the reference storybook first (npx storybook build -o .design-sync/sb-reference) and pass --storybook-static.\`);
  process.exit(2);
}

const comps = manifest.components.filter((c) => c.stories.length && (!ONLY || ONLY.has(c.name) || SPOT_PICKS.includes(c.name)));
// A valid pick must not mask a mistyped --components scope \u2014 [ZERO_MATCH]
// checks the scope on its own before picks widen comps.
if (ONLY && !comps.some((c) => ONLY.has(c.name))) {
  console.error(\`[ZERO_MATCH] none of \${[...ONLY].join(', ')} have stories in .stories-map.json\`);
  process.exit(2);
}
if (!comps.length) {
  console.error(ONLY ? \`[ZERO_MATCH] none of \${[...ONLY].join(', ')} have stories in .stories-map.json\` : '[ZERO_MATCH] no components with stories \u2014 compare needs the storybook shape');
  process.exit(2);
}

let pw;
try { pw = await import('playwright'); }
catch {
  console.error('[NO_CHROMIUM] compare requires playwright \u2014 npm i playwright && npx playwright install chromium');
  process.exit(2);
}

const squash = (s) => String(s ?? '').replace(/[^a-z0-9]/gi, '').toLowerCase();

// Input fingerprinting for the skip rule: BASE = the whole reference
// storybook + everything shared in the bundle (by exclusion, so a new asset
// dir is automatically covered \u2014 no list to maintain); per-component adds its
// preview js, its component dir, and its story set. Hashing is IO-bound \u2014 a
// second or two even for big builds, paid once per run. Same machine +
// unchanged inputs \u21D2 identical renders, so skipping capture is sound; any
// instability (e.g. cross-machine sb rebuild) just forces a recapture, never
// a stale verdict. Dot-entries are excluded everywhere: they're converter/
// compare scratch that changes every run.
function hashFile(h, p, label) {
  h.update(label);
  try { h.update(readFileSync(p)); } catch { h.update('\u2205'); }
}
function hashDir(h, dir, prefix, skip) {
  let entries;
  try { entries = readdirSync(dir, { withFileTypes: true }); } catch { h.update('\u2205'); return; }
  for (const e of entries.sort((a, b) => (a.name < b.name ? -1 : 1))) {
    if (e.name.startsWith('.') || skip?.has(e.name)) continue;
    if (e.isDirectory()) hashDir(h, join(dir, e.name), \`\${prefix}\${e.name}/\`);
    else hashFile(h, join(dir, e.name), \`\${prefix}\${e.name}\`);
  }
}
// The grade key is the sourceKey package-build STAMPED into the manifest \u2014
// the same value it wrote into the uploaded _ds_sync.json sidecar, so local
// grade carry-forward and remote verified-by-upload can never disagree, and
// the key always describes the artifacts this build produced. Styling,
// bundle, and pipeline internals are NOT part of it \u2014 only the user's
// sources re-grade. A manifest from pre-sourceKey scripts falls back to the
// old render-contract key (unknown \u21D2 today's behavior).
const oldGradeKeyFor = (c) => gradeKeyFrom(renderHashFor(OUT, c, { stories: c.stories, srcSha: c.srcSha ?? null }));
const gradeKeyFor = (c) => (c.sourceKey ? gradeKeyFrom(c.sourceKey) : oldGradeKeyFor(c));
// Recorded to power the [REFERENCE_STALE?] hint and the driver's
// reference-drift spot-check trigger. Not a skip input.
const SB_BASE_SHA = sbBaseShaFor(SB);
const outH = createHash('sha256');
hashDir(outH, OUT, 'out/', new Set(['_screenshots', '_preview', 'components', '_ds_sync.json']));
const OUT_BASE_SHA = outH.digest('hex');

const { srv: sbSrv, port: sbPort } = await serveDir(SB);
const { srv: outSrv, port: outPort } = await serveDir(OUT);
const cmpDir = join(OUT, '_screenshots', 'compare');
const rawDir = join(cmpDir, 'raw');
const cacheDir = resolve('.design-sync', '.cache', 'compare');
mkdirSync(rawDir, { recursive: true });
mkdirSync(cacheDir, { recursive: true });
// Self-defending: even a sloppy \`git add .design-sync\` can't commit the cache.
writeFileSync(join(resolve('.design-sync', '.cache'), '.gitignore'), '*\\n');

// Pre-pass (no browser): each component's contract state, computed once.
const pre = new Map();
const migrationPool = [];
for (const c of comps) {
  const gradeKey = gradeKeyFor(c);
  let prevCapture = null;
  let grade = null;
  try { prevCapture = JSON.parse(readFileSync(join(cacheDir, \`\${c.name}.json\`), 'utf8')); } catch { /* first capture */ }
  try { grade = JSON.parse(readFileSync(join(cacheDir, \`\${c.name}.grade.json\`), 'utf8')); } catch { /* ungraded */ }
  // Adoption shim \u2014 pre-recipe capture jsons carry old-recipe gradeKeys;
  // without adoption the first post-flip run would clear every grade.
  // Removable once pre-recipe local state has aged out.
  if (c.sourceKey && prevCapture && prevCapture.gradeKey !== gradeKey && (prevCapture.keyRecipe ?? 0) !== KEY_RECIPE) {
    const adopt = () => {
      prevCapture = { ...prevCapture, gradeKey, sourceKey: c.sourceKey, keyRecipe: KEY_RECIPE };
      writeFileSync(join(cacheDir, \`\${c.name}.json\`), JSON.stringify(prevCapture, null, 2));
    };
    if (prevCapture.gradeKey === oldGradeKeyFor(c)) {
      // The artifacts are byte-identical to the verified capture \u2014 adopt.
      adopt();
    } else if (prevCapture.srcSha != null && c.srcSha != null && prevCapture.srcSha === c.srcSha &&
        !existsSync(resolve('.design-sync', 'previews', \`\${c.name}.tsx\`))) {
      // Artifacts churned but story sources provably didn't (and no OWNED
      // preview, which srcSha can't vouch for) \u2014 adopt; sampled below. A
      // null srcSha means story-source resolution FAILED \u2014 identity unknown
      // is not evidence of stability, so null===null must not adopt.
      adopt();
      migrationPool.push(c.name);
    }
    // else: no evidence of source stability \u2014 normal rules, re-grades once.
  }
  // Grade keys must equal story names EXACTLY (spaces and all) \u2014 a PascalCase
  // or export-style key silently never joins, surfacing much later as a
  // confusing "awaiting grade".
  if (grade?.stories) {
    const known = new Set(c.stories.map((s) => s.name));
    const unknown = Object.keys(grade.stories).filter((k) => !known.has(k));
    if (unknown.length) {
      console.error(\`  (grade key(s) matching no story for \${c.name}: \${unknown.slice(0, 4).join(', ')} \u2014 keys must equal story names exactly, e.g. \${JSON.stringify(c.stories[0]?.name ?? '')})\`);
    }
  }
  const storyNames = c.stories.slice(0, MAX_STORIES).map((s) => s.name);
  const fullyGraded = !!grade?.stories && storyNames.length > 0 &&
    storyNames.every((n) => ['match', 'close'].includes(grade.stories[n]?.verdict));
  pre.set(c.name, { gradeKey, prevCapture, grade, fullyGraded });
}

// Spot checks \u2014 the lockstep assumption (shared rebuilds render the same
// preview\u2194story relationship on both sides) should keep earning trust, not
// be trusted blindly after the first sync. On full runs, re-capture a couple
// of carried-forward components whose shared inputs changed since their
// capture, WITHOUT clearing their grades: the agent confirms the fresh sheet
// still matches the recorded verdicts. Their contracts are unchanged, so a
// divergence can't be a component bug \u2014 it's systemic by construction. And
// because a systemic failure shows up in any component, a RANDOM sample is
// the right pick: no rotation state, no filesystem assumptions.
const SPOT_CHECK_N = Number(flag('spot-check', '2'));
const spotChecks = new Set();
// Manual picks (--spot-check-components A,B): the sampler's semantics \u2014
// re-capture, grades KEPT, confirm the fresh sheet against the recorded
// verdicts \u2014 but with explicit names, and honored on scoped runs where the
// sampler is off (the \xA77 step-4 audit names its picks explicitly).
// A pick that isn't a fully-graded carried-forward component falls through
// to the normal rules \u2014 captured, graded fresh \u2014 which is what that state
// needs anyway (there are no trusted verdicts to confirm against).
if (FORCE && SPOT_PICKS.length) {
  console.error('  (--force demands fresh verdicts everywhere \u2014 --spot-check-components picks are captured and re-graded like everything else)');
}
for (const name of SPOT_PICKS) {
  const p = pre.get(name);
  // Unknown names warn even under --force \u2014 a typo should never be silent.
  if (!p) { console.error(\`(spot-check pick "\${name}" has no stories in .stories-map.json \u2014 ignored)\`); continue; }
  if (FORCE) continue;
  if (p.fullyGraded && p.prevCapture?.gradeKey === p.gradeKey) spotChecks.add(name);
  else console.error(\`  (spot-check pick \${name} is not a fully-graded carried-forward component \u2014 captured under the normal rules instead)\`);
}
if (spotChecks.size) {
  console.error(\`\u25C9 [SPOT_CHECK] re-verifying \${spotChecks.size} requested carried-forward component(s): \${[...spotChecks].join(', ')} \u2014 grades kept; Read their fresh sheets and confirm they still match the recorded grades. Divergence remediation scales with the churned set: a couple of components diverge \u2014 re-grade just those; widespread \u2014 stop, diagnose, then --force a full pass.\`);
}
if (!ONLY && !FORCE && SPOT_CHECK_N > 0) {
  const candidates = comps.filter((c) => {
    const p = pre.get(c.name);
    return !spotChecks.has(c.name) && p.fullyGraded && p.prevCapture?.gradeKey === p.gradeKey &&
      (p.prevCapture.sbBaseSha !== SB_BASE_SHA || p.prevCapture.outBaseSha !== OUT_BASE_SHA);
  });
  for (let i = candidates.length - 1; i > 0; i--) {
    const j = Math.floor(Math.random() * (i + 1));
    [candidates[i], candidates[j]] = [candidates[j], candidates[i]];
  }
  const sampled = candidates.slice(0, SPOT_CHECK_N).map((c) => c.name);
  for (const n of sampled) spotChecks.add(n);
  if (sampled.length) {
    console.error(\`\u25C9 [SPOT_CHECK] re-verifying \${sampled.length} carried-forward component(s) after shared-input changes: \${sampled.join(', ')} \u2014 Read their fresh sheets and confirm they still match the recorded grades. Divergence remediation scales with the churned set: a couple of components diverge \u2014 re-grade just those; widespread \u2014 stop, diagnose, then --force a full pass.\`);
  }
}
// Migration canary: adopted-on-evidence components get a one-time sampled
// confirmation \u2014 min(5, pool), portal pick mandatory (the render check never
// exercises a single-mode card's non-primary stories). The rest carries on
// trust \u2014 an uncapped check would be the storm adoption exists to avoid.
if (migrationPool.length && !FORCE) {
  const eligible = migrationPool.filter((n) => {
    const p = pre.get(n);
    return p.fullyGraded && p.prevCapture?.gradeKey === p.gradeKey && !spotChecks.has(n);
  });
  const picks = new Set(eligible.filter((n) => pre.get(n).prevCapture?.portal).slice(0, 1));
  const rest = eligible.filter((n) => !picks.has(n));
  for (let i = rest.length - 1; i > 0; i--) {
    const j = Math.floor(Math.random() * (i + 1));
    [rest[i], rest[j]] = [rest[j], rest[i]];
  }
  for (const n of rest) { if (picks.size >= 5) break; picks.add(n); }
  for (const n of picks) spotChecks.add(n);
  console.error(\`\u25C9 [SPOT_CHECK] grade-key migration: adopted \${migrationPool.length} component(s) whose artifacts churned while their sources held\${picks.size ? \`; re-verifying \${picks.size} of them: \${[...picks].join(', ')} \u2014 grades kept; Read their fresh sheets and confirm they still match the recorded grades\` : ''}.\`);
}

const report = [];
const blockedHosts = new Set();
let warnedStaleRef = false;
let browser;
try {
  browser = await pw.chromium.launch(
    process.env.DS_CHROMIUM_PATH ? { executablePath: process.env.DS_CHROMIUM_PATH } : {},
  );
  const sbPage = await browser.newPage({ viewport: { width: 900, height: 700 } });
  const dsPage = await browser.newPage({ viewport: { width: 900, height: 700 } });
  // Sandboxed shells (Claude Code's Bash sandbox, CI egress policies) are
  // inherited by this browser: external story assets (CDN images/fonts) fail
  // to load on BOTH panels, so grades can pass while claude.ai/design users
  // see different output \u2014 the same oracle-blind class as missing fonts.
  // Track failed external requests and warn loudly at the end.
  for (const p of [sbPage, dsPage]) {
    p.on('requestfailed', (r) => {
      if (r.failure()?.errorText === 'net::ERR_ABORTED') return; // benign (navigation aborts)
      try {
        const u = new URL(r.url());
        if (u.hostname !== '127.0.0.1' && u.hostname !== 'localhost') blockedHosts.add(u.hostname);
      } catch { /* non-URL request */ }
    });
  }
  // Render stabilization \u2014 for GRADING comparability, not hashing (grades
  // are keyed to contracts, never to pixels): reduced-motion and a frozen
  // Date (timers still run \u2014 setFixedTime, not install) make both panels
  // show the same settled frame \u2014 same date rendered on both sides, spinners
  // at a consistent state \u2014 so the agent judges content, not animation
  // timing. Verification-only: shipped previews are untouched and fully
  // animated.
  for (const p of [sbPage, dsPage]) {
    await p.emulateMedia({ reducedMotion: 'reduce' }).catch(() => {});
    await p.clock?.setFixedTime(new Date('2030-01-15T12:00:00Z')).catch(() => {});
  }
  // Fast-forward finite animations, reset infinite ones (spinners) to their
  // initial state \u2014 playwright-native, no CSS injection that could strand
  // fill-mode entrance animations at opacity 0.
  const SHOT = { animations: 'disabled', timeout: 8_000 };
  // Webfont activation and image decode can land after networkidle \u2014 settle
  // both before shooting so neither panel is caught mid-font-swap or with
  // undecoded images (the sheets must show the settled rendering).
  async function settleRender(page) {
    await page.evaluate(() => Promise.all([
      document.fonts?.ready,
      ...[...document.images].map((i) => i.decode().catch(() => {})),
    ])).catch(() => {});
  }
  let dsErrs = [];
  dsPage.on('pageerror', (e) => dsErrs.push(String(e).split('\\n')[0]));

  // Capture one storybook story: the true root screenshot. Storybook 7+
  // renders into #storybook-root; v6 into #root. CSS-in-JS runtimes often
  // inject <style>/<script> as the first root child and waitForSelector
  // locks onto the first match \u2014 wait for CONTENT, not any child.
  const SB_ROOT = '#storybook-root, #root';
  const SB_CONTENT = \`:is(\${SB_ROOT}) > :not(style,script,link,meta,template)\`;
  async function captureStory(id) {
    try {
      await sbPage.goto(\`http://127.0.0.1:\${sbPort}/iframe.html?id=\${encodeURIComponent(id)}&viewMode=story\`, { waitUntil: 'networkidle', timeout: 20_000 });
    } catch { /* fall through to the selector wait \u2014 slow asset \u2260 broken story */ }
    const loaded = await sbPage.waitForSelector(SB_CONTENT, { timeout: 8_000 }).then(() => true).catch(() => false);
    if (!loaded) {
      // .sb-errordisplay is always present as a display:none template \u2014 only
      // report its text when it's actually visible.
      const err = await sbPage.evaluate(() => {
        const e = document.querySelector('.sb-errordisplay');
        return e && getComputedStyle(e).display !== 'none' ? e.textContent?.slice(0, 160) : 'no storybook root content';
      }).catch(() => '?');
      return { err };
    }
    await settleRender(sbPage);
    let png = null;
    try {
      const el = await sbPage.$(SB_ROOT);
      png = await el.screenshot(SHOT);
    } catch { /* full-page fallback below */ }
    if (!png || png.length < 200) {
      try { png = await sbPage.screenshot({ ...SHOT, fullPage: false }); } catch { /* keep null */ }
    }
    return { png };
  }

  for (const c of comps) {
    const gradePath = join(cacheDir, \`\${c.name}.grade.json\`);
    const capturePath = join(cacheDir, \`\${c.name}.json\`);
    const { gradeKey, prevCapture, fullyGraded } = pre.get(c.name);
    // Mutable: the clear block below nulls it, so a non-null grade further
    // down is always one that survived this capture.
    let { grade } = pre.get(c.name);

    // Skip rule \u2014 fully graded + grade key unchanged \u21D2 the judgment those
    // grades encode is still valid: same story contract, same preview source.
    // Styling, bundle, and storybook rebuilds alone don't invalidate (both
    // sides consume the same CSS and compiled code \u2014 lockstep). No capture;
    // sheets may have been wiped by a rebuild, but a graded component doesn't
    // need them (--force regenerates everything). Spot-check picks are
    // captured anyway \u2014 grades kept \u2014 so the lockstep claim gets re-verified.
    if (!FORCE && fullyGraded && prevCapture?.gradeKey === gradeKey && !spotChecks.has(c.name)) {
      // Refresh the pendingGrade bit: grading happens AFTER capture, so a
      // component graded since its last capture still carries pending:true
      // in its json \u2014 without this, a post-grading re-run (the grade \u2192
      // re-verify \u2192 clean loop) could never report it done.
      if (prevCapture.pendingGrade !== false) {
        writeFileSync(capturePath, JSON.stringify({ ...prevCapture, pendingGrade: false }, null, 2));
        prevCapture.pendingGrade = false;
      }
      report.push({ ...prevCapture, skipped: true });
      console.error(\`\u21BB [COMPARE] \${c.name}: sources unchanged & fully graded \u2014 carried forward (--force to recapture)\`);
      continue;
    }
    // The bundle changed but the reference storybook didn't \u2014 if the DS
    // source changed, the reference is stale and the sheets you're about to
    // grade would show the OLD design. Warn once.
    if (!warnedStaleRef && prevCapture &&
        prevCapture.sbBaseSha === SB_BASE_SHA && prevCapture.outBaseSha !== OUT_BASE_SHA) {
      warnedStaleRef = true;
      console.error('! [REFERENCE_STALE?] the bundle changed but .design-sync/sb-reference did not \u2014 if the DS source changed, rebuild the reference first (a stale reference makes compare grade against the OLD design)');
    }
    // Capture feasibility BEFORE touching the grade: a missing build artifact
    // makes gradeKeyFor hash '\u2205' \u2014 a phantom "contract change" that would
    // destroy a valid grade and then error out without producing a new sheet.
    const rel = \`components/\${c.group}/\${c.name}/\${c.name}.html\`;
    if (!existsSync(join(OUT, rel))) {
      report.push({ name: c.name, group: c.group, verdict: 'error', reason: \`\${rel} missing \u2014 run package-build.mjs\` });
      console.error(\`\u2717 [COMPARE] \${c.name}: \${rel} missing\`);
      continue;
    }
    // Clear the old grade only when the render contract it judged actually
    // changed (or on --force, where the point is a fresh verdict). A PARTIAL
    // grade on an unchanged contract stays \u2014 those verdicts are still valid;
    // the component is only being recaptured because it isn't fully graded
    // yet. Styling/bundle changes never reach this branch (not in the key).
    if (grade && (FORCE || prevCapture?.gradeKey !== gradeKey)) {
      rmSync(gradePath, { force: true });
      grade = null;
      console.error(\`  (grade cleared for \${c.name} \u2014 \${FORCE ? '--force requested fresh verdicts' : 'contract changed'}; re-grade from the fresh sheet)\`);
    }
    dsErrs = [];
    let pageErr = null;
    // Both sides capture at the card's declared viewport when the html
    // carries one (single-mode cards declare the size the product renders
    // at), else the default \u2014 same artifact the product reads, no separate
    // config plumbing.
    const vpMatch = /viewport="(\\d+)x(\\d+)"/.exec(readFileSync(join(OUT, rel), 'utf8').split('\\n', 1)[0] ?? '');
    const vp = vpMatch
      ? { width: Math.min(+vpMatch[1], 2000), height: Math.min(+vpMatch[2], 2000) }
      : { width: 900, height: 700 };
    await sbPage.setViewportSize(vp);
    await dsPage.setViewportSize(vp);
    try {
      await dsPage.goto(\`http://127.0.0.1:\${outPort}/\${rel}\`, { waitUntil: 'networkidle', timeout: 20_000 });
    } catch (e) {
      // networkidle timeout \u2260 broken page \u2014 a hanging asset connection still
      // leaves the DOM rendered; settle and proceed like the sb side does.
      if (/Timeout/i.test(String(e.message ?? e))) console.error(\`  (networkidle timeout on \${c.name} \u2014 capturing after settle)\`);
      else pageErr = e.message.split('\\n')[0];
    }
    // previewKind: 'module' (compiled .design-sync/previews/<Name>.tsx, cells
    // keyed by export name) vs 'fallback' (the floor card \u2014 no compiled
    // preview module). Fallback still renders, but the
    // fix for a mismatch lives in the .tsx, so surface the kind loudly.
    const pv = pageErr ? null : await dsPage.evaluate(() => {
      const kind = document.querySelector('script[src*="_preview/"]') ? 'module' : 'fallback';
      // Module previews list every export in __dsCells (capture happens
      // per-story via ?story=, so pairing must not depend on the default
      // render mode \u2014 a single-mode card shows only one story). Fallback
      // previews keep the DOM-cell path.
      const dsCells = Array.isArray(window.__dsCells) ? window.__dsCells.slice() : null;
      const cells = dsCells
        ? dsCells.map((label, i) => ({ i, label }))
        : [...document.querySelectorAll('section.ds-cell')].map((s, i) => {
            const mount = s.querySelector('div[id^="r"]');
            const box = (mount ?? s).getBoundingClientRect();
            return {
              i, label: s.querySelector('h4')?.textContent?.trim() ?? '',
              // w/h only gate the element-vs-section screenshot fallback; text only
              // feeds the cell-threw error message. Neither is a similarity signal.
              w: Math.round(box.width), h: Math.round(box.height),
              text: (mount?.textContent ?? '').trim().slice(0, 200),
              caught: (mount?.textContent ?? '').trim().startsWith('\u26A0'),
            };
          });
      // Portal content (Dialog/Tooltip/Toast) renders outside the cells \u2014
      // cell crops would miss it, so pair shots fall back to full-page. Only
      // counts foreign body children that actually hold content; empty
      // injected containers (toast roots, style mounts) don't trip it.
      const portal = [...document.body.children].some((el) =>
        !el.matches('.ds-grid, .ds-single, section, script, style, link, h4, div[id]') &&
        (el.childElementCount > 0 || (el.textContent ?? '').trim().length > 0));
      return { kind, cells, portal, perStory: !!dsCells, mode: window.__dsMode ?? 'grid' };
    }).catch((e) => { pageErr = String(e).split('\\n')[0]; return null; });

    if (pageErr || !pv) {
      report.push({ name: c.name, group: c.group, verdict: 'error', reason: \`preview page failed: \${pageErr}\` });
      console.error(\`\u2717 [COMPARE] \${c.name}: preview page failed \u2014 \${pageErr}\`);
      continue;
    }

    // Pair stories \u2192 cells: squashed export-name equality first. The order
    // fallback (covers renamed/dedup-suffixed exports) engages only when the
    // leftover counts agree 1:1 \u2014 otherwise structurally-unrelated extras
    // (an authored Preview export, a Variants grid, a fallthrough Default)
    // would mispair with stories whose exports were dropped at generation
    // time, hiding genuinely-unpaired stories behind wrong sheets.
    const stories = c.stories.slice(0, MAX_STORIES);
    if (c.stories.length > MAX_STORIES) {
      console.error(\`  [STORY_CAP] \${c.name}: comparing first \${MAX_STORIES} of \${c.stories.length} stories \u2014 pass --max-stories \${c.stories.length} to cover all\`);
    }
    const cellByLabel = new Map(pv.cells.map((cell) => [squash(cell.label), cell]));
    const usedCells = new Set();
    const pairs = stories.map((s) => {
      // Exact emitted-label first (the generator dedupes colliding keys to
      // "Default"/"Default2" \u2014 fuzzy matching maps both stories to one cell);
      // squash fallback covers hand-owned previews with renamed exports.
      const cell =
        (s.emitted != null ? cellByLabel.get(squash(s.emitted)) : undefined) ??
        cellByLabel.get(squash(s.exportKey ?? exportName(s.name)));
      if (cell && !usedCells.has(cell.i)) { usedCells.add(cell.i); return { story: s, cell, pairedBy: 'name' }; }
      return { story: s, cell: null, pairedBy: null };
    });
    const freeCells = pv.cells.filter((cell) => !usedCells.has(cell.i));
    const unmatched = pairs.filter((p) => !p.cell);
    if (unmatched.length && unmatched.length === freeCells.length) {
      for (const p of unmatched) {
        const cell = freeCells.shift();
        p.cell = cell; p.pairedBy = 'order'; usedCells.add(cell.i);
      }
    }
    // Cells for stories beyond MAX_STORIES are explained by the cap \u2014 don't
    // report them as unexplained extras.
    const overCap = new Set(c.stories.slice(MAX_STORIES).map((s) => squash(s.emitted ?? s.exportKey ?? exportName(s.name))));
    const extraCells = pv.cells
      .filter((cell) => !usedCells.has(cell.i) && !overCap.has(squash(cell.label)))
      .map((cell) => cell.label);
    if (extraCells.length) {
      // Logged (not just recorded) so \xA77's triage-by-log flow can see it \u2014
      // an owned export whose story was deleted upstream shows up here.
      console.error(\`  (extra cells not matching any story for \${c.name}: \${extraCells.join(', ')})\`);
    }

    // Overlay/portal content in a grid card paints over sibling cells in the
    // PRODUCT too (the app renders this same html whole) \u2014 single-story cards
    // are the fix, not a harness workaround.
    if (pv.portal && pv.mode !== 'single') {
      console.error(\`  [PORTAL?] \${c.name}: overlay/portal content renders outside its cells \u2014 consider cfg.overrides \${c.name}: {"cardMode": "single"}\`);
    }

    // Capture. Module previews: navigate ?story=<export> per story \u2014 each
    // story renders ALONE (no portal stacking, shared radio-group names,
    // focus contention, or container-measurement interference) at the full
    // capture viewport, mirroring how storybook frames the reference side.
    // Fallback previews: cell crops from the grid page.
    await settleRender(dsPage);
    const cellLocators = pv.perStory ? [] : await dsPage.$$('section.ds-cell');
    async function cellShot(cell) {
      if (pv.portal) return dsPage.screenshot({ ...SHOT, fullPage: false });
      const sec = cellLocators[cell.i];
      const mount = sec ? await sec.$('div[id^="r"]') : null;
      try {
        if (mount && cell.w >= 4 && cell.h >= 4) return await mount.screenshot(SHOT);
        if (sec) return await sec.screenshot(SHOT);
      } catch { /* fall through */ }
      return dsPage.screenshot({ ...SHOT, fullPage: false });
    }
    async function storyShot(label) {
      try {
        await dsPage.goto(\`http://127.0.0.1:\${outPort}/\${rel}?story=\${encodeURIComponent(label)}\`, { waitUntil: 'networkidle', timeout: 20_000 });
      } catch (e) {
        // Hanging asset connection \u2260 broken story \u2014 settle and capture anyway.
        if (!/Timeout/i.test(String(e.message ?? e))) {
          return { png: null, caught: true, text: String(e.message ?? e).split('\\n')[0] };
        }
      }
      await settleRender(dsPage);
      const info = await dsPage.evaluate(() => {
        const t = (document.getElementById('r0')?.textContent ?? document.body.textContent ?? '').trim();
        return { caught: t.startsWith('\u26A0'), text: t.slice(0, 200) };
      }).catch(() => ({ caught: false, text: '' }));
      const png = await dsPage.screenshot({ ...SHOT, fullPage: false }).catch(() => null);
      return { png, ...info };
    }

    const storyResults = [];
    for (const p of pairs) {
      const sb = await captureStory(p.story.id);
      // Keyed by story ID \u2014 names can repeat across a component's story files.
      const base = \`\${c.group}__\${c.name}__\${squash(p.story.id) || squash(p.story.name) || 'story'}\`;
      if (sb.png) writeFileSync(join(rawDir, \`\${base}__sb.png\`), sb.png);
      if (sb.err) {
        storyResults.push({ story: p.story.name, id: p.story.id, verdict: 'sb-error', reasons: [sb.err] });
        continue;
      }
      if (!p.cell) {
        storyResults.push({
          story: p.story.name, id: p.story.id, verdict: 'unpaired',
          reasons: [pv.kind === 'fallback'
            ? 'preview is the floor card (no compiled preview) \u2014 author this story in .design-sync/previews/' + c.name + '.tsx'
            : \`no cell labeled \${p.story.exportKey ?? exportName(p.story.name)} \u2014 the .tsx export for this story is missing or renamed\`],
        });
        continue;
      }
      let dsPng = null;
      let caught = false;
      let caughtText = '';
      if (pv.perStory) {
        const shot = await storyShot(p.cell.label);
        dsPng = shot.png;
        caught = shot.caught;
        caughtText = shot.text;
      } else {
        try { dsPng = await cellShot(p.cell); } catch { /* leave null */ }
        caught = !!p.cell.caught;
        caughtText = p.cell.text ?? '';
      }
      if (dsPng) writeFileSync(join(rawDir, \`\${base}__ds.png\`), dsPng);
      storyResults.push({
        story: p.story.name, id: p.story.id, export: p.cell.label, pairedBy: p.pairedBy,
        // Factual error only (the story threw). Visual judgment belongs to the
        // grading agent \u2014 record it in the .grade.json, not here.
        verdict: caught ? 'error' : 'needs-grade',
        reasons: caught ? [\`story threw: \${caughtText.slice(0, 120)}\`] : [],
        sbShot: sb.png ? \`_screenshots/compare/raw/\${base}__sb.png\` : null,
        dsShot: dsPng ? \`_screenshots/compare/raw/\${base}__ds.png\` : null,
      });
    }
    // Dedup: per-story navigation re-fires module-load errors once per visit.
    if (dsErrs.length) storyResults.push({ story: '(page)', verdict: 'error', reasons: [...new Set(dsErrs)].slice(0, 3) });

    // [STORY_CHANGED] \u2014 the story FILE (srcSha) moved since the last capture.
    // This is the signal that an OWNED preview must be edited; a recapture
    // without it means lockstep re-rendering or styling/preview changes,
    // where re-grading the fresh sheet is usually all that's needed.
    // File-level granularity on purpose: the story module compiles whole, so
    // its file hash IS the contract. A capture json without the field at all
    // (foreign or hand-edited \u2014 this harness always writes it, null when
    // unknown) is treated as "unknown", never as "changed": comparing absence
    // against a present hash would fire a spurious [STORY_CHANGED] for every
    // component.
    const srcChanged = !!(prevCapture && prevCapture.srcSha !== undefined &&
      (prevCapture.srcSha ?? null) !== (c.srcSha ?? null) && (prevCapture.srcSha || c.srcSha));
    for (const r of storyResults) r.storyChanged = srcChanged;
    // Ownership is by location: a file in .design-sync/previews/ is the
    // user's, whatever its content. (A modified file in the generated cache
    // gets its own loud per-build warning from package-build \u2014 not re-warned
    // here.)
    const ownedPreview = existsSync(resolve('.design-sync', 'previews', \`\${c.name}.tsx\`));
    const storyChanged = storyResults.filter((r) => r.storyChanged).map((r) => r.story);
    if (storyChanged.length) {
      console.error(\`! [STORY_CHANGED] \${c.name}: \${storyChanged.join(', ')} \u2014 the story itself changed\${ownedPreview
        ? \`; preview is OWNED (.design-sync/previews/\${c.name}.tsx) \u2014 update it to mirror the new story\`
        : '; preview is generated and re-derives on the next full package-build'}\`);
    }

    // Sheet: the two true images side by side per story \u2014 the artifact the
    // grading agent Reads. Images shrink to fit the sheet; the raw/ PNGs are
    // the full-resolution authority when the sheet is too small to judge.
    const rows = storyResults.map((r) => {
      const base = \`\${c.group}__\${c.name}__\${squash(r.id ?? r.story) || 'story'}\`;
      const img = (suffix) => existsSync(join(rawDir, \`\${base}__\${suffix}.png\`))
        ? \`<img src="./raw/\${base}__\${suffix}.png" style="max-width:480px;max-height:420px;display:block">\`
        : '<div style="width:480px;height:80px;display:flex;align-items:center;justify-content:center;color:#999">(no shot)</div>';
      const color = r.verdict === 'needs-grade' ? '#555' : '#d33';
      return \`<tr><td style="vertical-align:top;padding:8px;font:600 14px system-ui">\${escapeHtml(r.story)}<br><span style="color:\${color}">\${r.verdict}</span><br><span style="font-weight:400;font-size:12px;color:#555">\${(r.reasons ?? []).map(escapeHtml).join('<br>')}</span></td>\` +
        \`<td style="vertical-align:top;padding:8px;border-left:1px solid #eee">\${img('sb')}</td>\` +
        \`<td style="vertical-align:top;padding:8px;border-left:1px solid #eee">\${img('ds')}</td></tr>\`;
    }).join('\\n');
    const sheetHtml = \`<!doctype html><html><head><meta charset="utf-8"></head><body style="margin:0;background:#fff;width:1180px;font-family:system-ui">\` +
      \`<div style="font:600 18px system-ui;padding:10px">\${escapeHtml(c.name)} \u2014 storybook (left) vs preview (right)\${pv.kind === 'fallback' ? ' \u2014 \u26A0 FALLBACK preview (no compiled .tsx)' : ''}\${pv.portal && !pv.perStory ? ' \u2014 portal content: preview side is full-page' : ''}</div>\` +
      \`<table style="border-collapse:collapse"><tr style="font:600 13px system-ui;color:#555"><td style="padding:8px">story</td><td style="padding:8px">storybook</td><td style="padding:8px">preview</td></tr>\${rows}</table></body></html>\`;
    writeFileSync(join(cmpDir, \`.sheet-\${c.group}__\${c.name}.html\`), sheetHtml);
    try {
      await dsPage.goto(\`http://127.0.0.1:\${outPort}/_screenshots/compare/.sheet-\${c.group}__\${c.name}.html\`, { waitUntil: 'networkidle', timeout: 15_000 });
      await dsPage.evaluate(() => Promise.all([...document.images].map((i) => i.decode().catch(() => {}))));
      await dsPage.screenshot({ path: join(cmpDir, \`\${c.group}__\${c.name}.png\`), fullPage: true });
    } catch (e) { console.error(\`  (sheet skipped for \${c.name} \u2014 \${String(e).split('\\n')[0]})\`); }

    const counts = { 'needs-grade': 0, error: 0, unpaired: 0, 'sb-error': 0 };
    for (const r of storyResults) counts[r.verdict] = (counts[r.verdict] ?? 0) + 1;
    // pendingGrade: the post-capture grade state, written here so consumers
    // (the resync driver) read one bit instead of re-implementing this
    // harness's verdict vocabulary. The clear block above nulls \`grade\`, so
    // non-null here means the grade survived this capture.
    const gradable = storyResults.filter((r) => r.story !== '(page)');
    const pendingGrade = !(gradable.length > 0 && gradable.every((r) => ['match', 'close'].includes(grade?.stories?.[r.story]?.verdict)));
    const entry = {
      name: c.name, group: c.group, previewKind: pv.kind, portal: pv.portal, pendingGrade,
      srcSha: c.srcSha ?? null,
      sourceKey: c.sourceKey ?? null, keyRecipe: c.sourceKey ? KEY_RECIPE : undefined,
      sbBaseSha: SB_BASE_SHA, outBaseSha: OUT_BASE_SHA, gradeKey, counts, extraCells, stories: storyResults,
      sheet: \`_screenshots/compare/\${c.group}__\${c.name}.png\`,
      grade: \`.design-sync/.cache/compare/\${c.name}.grade.json\`,
    };
    writeFileSync(capturePath, JSON.stringify(entry, null, 2));
    report.push(entry);
    const summary = Object.entries(counts).filter(([, n]) => n).map(([k, n]) => \`\${n} \${k}\`).join(', ');
    const mark = counts.error || counts.unpaired || counts['sb-error'] ? '\u2717' : '\u25CB';
    // Grade keys verbatim \u2014 graders must use these EXACT strings (the story
    // display names), not export names; a mismatched key never joins.
    const keyHint = counts['needs-grade']
      ? \` \u2014 grade keys: \${storyResults.filter((r) => r.verdict === 'needs-grade').map((r) => JSON.stringify(r.story)).join(', ')}\`
      : '';
    console.error(\`\${mark} [COMPARE] \${c.name}: \${summary}\${pv.kind === 'fallback' ? ' (fallback preview)' : ''}\${keyHint}\`);
    // Printed only when a signature matches \u2014 never a hint without its
    // corroborating error.
    if (counts.error) {
      const firstErr = storyResults.find((r) => r.verdict === 'error')?.reasons?.[0];
      const hyp = hypothesisLine(firstErr);
      if (firstErr && hyp) {
        console.error(\`    first error: \${firstErr}\`);
        console.error(hyp);
      }
    }
  }
} finally {
  await browser?.close().catch(() => {});
  sbSrv.close();
  outSrv.close();
}

// .sb-state.json (the driver's reference-drift baseline) is deliberately NOT
// written here: a scoped run verifies only its own components, so writing
// the new reference hash would consume the drift signal on behalf of the
// whole carried set. The driver owns that state (resync.mjs).

// Aggregate only on full runs \u2014 parallel --components invocations must not
// clobber each other's view of the world. Grade files are joined in so the
// report answers "what's still ungraded / what did the grader say".
const hard = report.filter((r) => !r.skipped && (r.verdict === 'error' || (r.counts && (r.counts.error || r.counts.unpaired || r.counts['sb-error']))));
if (!ONLY) {
  // Prune state for components that left the sync (excluded, renamed, story
  // files deleted) \u2014 stale jsons read as phantom worklist entries. Full runs
  // only: a scoped run must never touch other components' state.
  const live = new Set(manifest.components.map((c) => c.name));
  for (const f of readdirSync(cacheDir)) {
    // Dot-entries are harness state (.sb-state.json), not component jsons.
    if (f.startsWith('.')) continue;
    const m = /^(.+?)(\\.grade)?\\.json$/.exec(f);
    if (!m || live.has(m[1])) continue;
    rmSync(join(cacheDir, f), { force: true });
    console.error(\`  (pruned stale \${f} \u2014 component no longer in the sync)\`);
  }
  const withGrades = report.map((r) => {
    if (!r.grade) return r;
    try { return { ...r, grades: JSON.parse(readFileSync(join(cacheDir, \`\${r.name}.grade.json\`), 'utf8')) }; }
    catch { return { ...r, grades: null }; }
  });
  writeFileSync(join(OUT, '.compare-report.json'), JSON.stringify({ components: withGrades }, null, 2) + '\\n');
  // Subagent learnings left unmerged are insight lost to the next sync. Nag on
  // every full (orchestrator-facing) run so the fold into NOTES.md can't be
  // overlooked \u2014 the skill treats this line as an upload blocker. Scoped runs
  // skip it: a subagent's own in-progress learnings file is expected.
  try {
    const pendingLearnings = readdirSync(resolve('.design-sync', 'learnings')).filter((f) => f.endsWith('.md'));
    if (pendingLearnings.length) {
      console.error(\`[LEARNINGS_UNMERGED] \${pendingLearnings.length} file(s) in .design-sync/learnings/ \u2014 promote [GENERAL] bullets into .design-sync/NOTES.md, then delete the folder. Do not upload while this prints.\`);
    }
  } catch { /* no learnings dir \u2014 nothing pending */ }
}
if (blockedHosts.size) {
  console.error(\`! [ASSETS_BLOCKED] external assets failed to load during capture: \${[...blockedHosts].slice(0, 8).join(', ')}\${blockedHosts.size > 8 ? ', \u2026' : ''}. If this shell sandboxes network egress, BOTH panels rendered without these assets and grades can falsely pass while claude.ai/design users see different output. Re-run package-validate.mjs and compare.mjs --force from a shell with egress to these hosts (approve running the command without the sandbox when prompted, or add the hosts to the sandbox allowlist).\`);
}
const skipped = report.filter((r) => r.skipped);
const pending = report.filter((r) => !r.skipped && r.counts?.['needs-grade'] && !hard.includes(r));
console.error(\`\\ncompare: \${report.length} component(s) \u2014 \${skipped.length} carried forward unchanged, \${report.length - skipped.length} captured, \${hard.length} with factual failures, \${pending.length} awaiting your grade\`);
console.error('Grade from the true images: Read each _screenshots/compare/<group>__<Name>.png sheet (raw/ PNGs are the full-res authority), then Write the verdicts to .design-sync/.cache/compare/<Name>.grade.json (a recapture clears the old grade \u2014 its contract changed).');
process.exit(hard.length ? 1 : 0);
`;
  });
  var _Mc = __commonJS((Ngv, UDf) => {
    UDf.exports = `#!/usr/bin/env node
// package-capture \u2014 capture harness for the PACKAGE shape's ABSOLUTE grading.
// There is no storybook here, so there is no reference render to compare
// against: this photographs each authored preview story alone (via the
// card's ?story= single-story render mode) and produces sheets
// the working agent grades on ABSOLUTE criteria \u2014 styled with the DS's own
// tokens/fonts, complete, legible, a plausible composition \u2014 rather than
// against a reference column.
//
// Scope: only components with a COMPILED preview (_preview/<Name>.js \u2014
// authored .design-sync/previews/<Name>.tsx). Floor-card components are the
// validator's territory (.render-check.json \`fallbackCard\`), not graded.
//
// LIFECYCLE \u2014 one invariant: grades follow the user's SOURCES. gradeKey =
// H(sourceKey), the build-stamped key over the authored .tsx and the
// preview-affecting config (lib/sync-hashes.mjs \u2014 the same values the
// uploaded _ds_sync.json sidecar carries); styling/bundle/pipeline churn
// never invalidates (the pipeline's fidelity travels; churn is spot-checked
// by sample via --spot-check-components, driven by the resync driver).
// Unchanged & fully graded \`good\` \u2192 carried forward, zero work.
//
// ALL state here is campaign-local and gitignored (.design-sync/.cache/
// review/): <Name>.json is capture bookkeeping, <Name>.grade.json holds the
// agent's verdicts:
//   { "cells": { "<CellName>": { "verdict": "good"|"needs-work", "note": "\u2026" } } }
// Nothing is committed \u2014 CROSS-MACHINE carry-forward is derived from the
// uploaded project instead (lib/remote-diff.mjs vs its _ds_sync.json):
// a component unchanged vs the upload was already verified at upload time.
//
// Usage: node package-capture.mjs --out ./ds-bundle [--components A,B] [--force]
//        [--spot-check-components A,B]

import { existsSync, mkdirSync, readdirSync, readFileSync, rmSync, writeFileSync } from 'node:fs';
import { join, resolve } from 'node:path';
import { KEY_RECIPE, gradeKeyFrom, renderHashFor } from './lib/sync-hashes.mjs';
import { serveDir } from './storybook/http-serve.mjs';

const argv = process.argv.slice(2);
const flag = (n, d) => { const i = argv.indexOf(\`--\${n}\`); return i < 0 ? d : argv[i + 1]; };
{
  const VALUE_FLAGS = ['out', 'components', 'spot-check-components'];
  for (let i = 0; i < argv.length; i++) {
    if (argv[i] === '--force') continue;
    if (argv[i].startsWith('--') && VALUE_FLAGS.includes(argv[i].slice(2))) { i++; continue; }
    console.error(\`(unrecognized argument "\${argv[i]}" \u2014 ignored; multi-component scoping is comma-separated: --components A,B)\`);
  }
}
const OUT = flag('out') && resolve(flag('out'));
const ONLY = flag('components') ? new Set(flag('components').split(',').map((s) => s.trim())) : null;
// compare.mjs pick semantics: re-capture with grades KEPT, confirm the sheet
// against recorded verdicts; honored on scoped runs (the driver's canary).
// A pick whose grade or key doesn't carry falls through to normal rules.
const SPOT_PICKS = flag('spot-check-components') ? flag('spot-check-components').split(',').map((s) => s.trim()).filter(Boolean) : [];
const FORCE = argv.includes('--force');
if (!OUT || !existsSync(join(OUT, '.stories-map.json'))) {
  console.error('usage: package-capture.mjs --out <ds-bundle dir> (run package-build.mjs first)');
  process.exit(2);
}

const manifest = JSON.parse(readFileSync(join(OUT, '.stories-map.json'), 'utf8'));
// Recipe-gate the stamped keys (see compare.mjs): a manifest stamped under a
// different recipe falls back to render-contract keying.
if (manifest.keyRecipe !== KEY_RECIPE) for (const c of manifest.components ?? []) delete c.sourceKey;
const escapeHtml = (s) => String(s).replace(/[&<>"']/g, (c) => ({ '&': '&amp;', '<': '&lt;', '>': '&gt;', '"': '&quot;', "'": '&#39;' }[c]));

// The grade key is the sourceKey package-build STAMPED into the manifest \u2014
// the same value in the uploaded _ds_sync.json sidecar, so local carry-
// forward and remote verified-by-upload can never disagree. Only the user's
// sources (authored .tsx, preview-affecting config) re-grade; --force
// re-opens everything when a human wants a fresh look. A manifest from
// pre-sourceKey scripts falls back to the old render-contract key.
const oldGradeKeyFor = (c) => gradeKeyFrom(renderHashFor(OUT, c, {}));
const gradeKeyFor = (c) => (c.sourceKey ? gradeKeyFrom(c.sourceKey) : oldGradeKeyFor(c));

const cacheDir = resolve('.design-sync', '.cache', 'review');
mkdirSync(cacheDir, { recursive: true });
// Self-defending: even a sloppy \`git add .design-sync\` can't commit the cache.
writeFileSync(join(resolve('.design-sync', '.cache'), '.gitignore'), '*\\n');
const shotBase = join(OUT, '_screenshots', 'review');
const rawDir = join(shotBase, 'raw');
mkdirSync(rawDir, { recursive: true });

const all = (manifest.components ?? []).filter((c) => existsSync(join(OUT, '_preview', \`\${c.name}.js\`)));
const comps = ONLY ? all.filter((c) => ONLY.has(c.name) || SPOT_PICKS.includes(c.name)) : all;
const floorCount = (manifest.components ?? []).length - all.length;
if (floorCount && !ONLY) console.error(\`  (\${floorCount} component(s) on the floor card \u2014 author previews to bring them into grading)\`);
const spotChecks = new Set(FORCE ? [] : SPOT_PICKS.filter((n) => all.some((c) => c.name === n)));
// A typo'd, renamed, or floor-card pick must never vanish silently \u2014 same
// contract as compare.mjs's per-pick warning.
for (const n of SPOT_PICKS) {
  if (!spotChecks.has(n)) console.error(\`! --spot-check-components: "\${n}" matches no capturable component (typo? renamed? floor card with no compiled preview?) \u2014 pick ignored\`);
}
if (spotChecks.size) {
  console.error(\`\u25C9 [SPOT_CHECK] re-verifying \${spotChecks.size} requested component(s): \${[...spotChecks].join(', ')} \u2014 grades kept; Read their fresh sheets and confirm they still match the recorded grades.\`);
}

let chromium;
try { ({ chromium } = await import('playwright')); }
catch { console.error('playwright not installed \u2014 npm i playwright (in .ds-sync/) first'); process.exit(2); }
const browser = await chromium.launch(process.env.DS_CHROMIUM_PATH ? { executablePath: process.env.DS_CHROMIUM_PATH } : {});
const page = await browser.newPage({ viewport: { width: 900, height: 700 } });
try { await page.clock.setFixedTime(new Date('2024-05-15T12:00:00Z')); } catch { /* older playwright */ }
let pageErrs = [];
page.on('pageerror', (e) => pageErrs.push(String(e).split('\\n')[0]));
const { srv, port } = await serveDir(OUT);

async function settle() {
  await page.evaluate(() => Promise.all([
    document.fonts?.ready,
    ...[...document.images].map((i) => i.decode().catch(() => {})),
  ])).catch(() => {});
}

const report = [];
for (const c of comps) {
  const rel = \`components/\${c.group}/\${c.name}/\${c.name}.html\`;
  // Capture feasibility BEFORE the grade key: a missing card html would hash
  // as '\u2205' \u2014 a phantom contract change that clears a perfectly valid grade.
  let cardHead;
  try { cardHead = readFileSync(join(OUT, rel), 'utf8').split('\\n', 1)[0] ?? ''; }
  catch {
    report.push({ name: c.name, group: c.group, verdict: 'error', reason: \`missing \${rel} \u2014 rebuild (package-build.mjs) before capturing\` });
    console.error(\`\u2717 [CAPTURE] \${c.name}: missing \${rel} \u2014 rebuild (package-build.mjs) before capturing\`);
    continue;
  }
  const gradeKey = gradeKeyFor(c);
  // Grade identity is the component NAME (export names are unique; the group
  // is display-only) \u2014 a pure regroup must not orphan grades.
  const capPath = join(cacheDir, \`\${c.name}.json\`);
  const gradePath = join(cacheDir, \`\${c.name}.grade.json\`);
  let prev = null, grade = null;
  try { prev = JSON.parse(readFileSync(capPath, 'utf8')); } catch { /* first capture */ }
  try { grade = JSON.parse(readFileSync(gradePath, 'utf8')); } catch { /* ungraded */ }
  // Adoption shim (see compare.mjs): a pre-recipe json whose artifacts are
  // byte-identical adopts the new key silently \u2014 here every captured
  // component has an owned preview, so that's the only safe evidence.
  if (c.sourceKey && prev && prev.gradeKey !== gradeKey && (prev.keyRecipe ?? 0) !== KEY_RECIPE &&
      prev.gradeKey === oldGradeKeyFor(c)) {
    prev = { ...prev, gradeKey, sourceKey: c.sourceKey, keyRecipe: KEY_RECIPE };
    writeFileSync(capPath, JSON.stringify(prev, null, 2));
  }

  // Honor the card's declared viewport (single-mode cards).
  const vpMatch = /viewport="(\\d+)x(\\d+)"/.exec(cardHead);
  const vp = vpMatch ? { width: Math.min(+vpMatch[1], 2000), height: Math.min(+vpMatch[2], 2000) } : { width: 900, height: 700 };

  pageErrs = [];
  let cells = [];
  try {
    await page.setViewportSize(vp);
    await page.goto(\`http://127.0.0.1:\${port}/\${rel}\`, { waitUntil: 'networkidle', timeout: 20_000 });
    cells = await page.evaluate(() => Array.isArray(window.__dsCells) ? window.__dsCells.slice() : []);
  } catch (e) {
    report.push({ name: c.name, group: c.group, verdict: 'error', reason: String(e.message ?? e).split('\\n')[0] });
    console.error(\`\u2717 [CAPTURE] \${c.name}: \${String(e.message ?? e).split('\\n')[0]}\`);
    continue;
  }
  if (cells.length === 0) {
    // The preview module compiled but evaluated to nothing (module-scope
    // throw, or no exports) \u2014 permanently ungradable, so it's an error, not
    // a clean zero-cell capture.
    const why = pageErrs[0] ?? 'preview module evaluated to no exports (window.__dsCells is empty)';
    report.push({ name: c.name, group: c.group, verdict: 'error', reason: why });
    console.error(\`\u2717 [CAPTURE] \${c.name}: \${why} \u2014 fix the preview (.design-sync/previews/\${c.name}.tsx) and rebuild\`);
    continue;
  }

  const fullyGraded = grade?.cells && cells.length > 0
    && cells.every((k) => ['good'].includes(grade.cells[k]?.verdict));
  if (!FORCE && fullyGraded && prev?.gradeKey === gradeKey && !spotChecks.has(c.name)) {
    // Refresh the pendingGrade bit (grading happens after capture \u2014 see the
    // same refresh in compare.mjs's skip path).
    if (prev.pendingGrade !== false) {
      writeFileSync(capPath, JSON.stringify({ ...prev, pendingGrade: false }, null, 2));
    }
    report.push({ name: c.name, group: c.group, skipped: true });
    console.error(\`\u25CB [CAPTURE] \${c.name}: carried forward\`);
    continue;
  }
  if (grade && (FORCE || prev?.gradeKey !== gradeKey)) {
    rmSync(gradePath, { force: true });
    grade = null;
    console.error(\`  (grade cleared for \${c.name} \u2014 \${FORCE ? '--force requested fresh verdicts' : 'contract changed'}; re-grade from the fresh sheet)\`);
  }

  const shots = [];
  for (const label of cells) {
    try {
      await page.goto(\`http://127.0.0.1:\${port}/\${rel}?story=\${encodeURIComponent(label)}\`, { waitUntil: 'networkidle', timeout: 20_000 });
    } catch (e) {
      if (!/Timeout/i.test(String(e.message ?? e))) { shots.push({ label, png: null, err: String(e.message ?? e).split('\\n')[0] }); continue; }
    }
    await settle();
    const info = await page.evaluate(() => {
      const t = (document.getElementById('r0')?.textContent ?? '').trim();
      return { caught: t.startsWith('\u26A0'), text: t.slice(0, 200) };
    }).catch(() => ({ caught: false, text: '' }));
    const file = \`\${c.group}__\${c.name}__\${label}.png\`;
    const png = await page.screenshot({ fullPage: false }).catch(() => null);
    if (png) writeFileSync(join(rawDir, file), png);
    shots.push({ label, png: png ? \`raw/\${file}\` : null, err: info.caught ? info.text.slice(0, 120) : null });
  }

  // Single-column sheet: one labeled render per row \u2014 the agent grades each
  // on the absolute rubric in the SKILL.
  const rows = shots.map((s) =>
    \`<tr><td style="vertical-align:top;padding:8px;font:600 14px system-ui">\${escapeHtml(s.label)}\${s.err ? \`<br><span style="color:#d33;font-weight:400;font-size:12px">\${escapeHtml(s.err)}</span>\` : ''}</td>\` +
    \`<td style="vertical-align:top;padding:8px;border-left:1px solid #eee">\${s.png ? \`<img src="./\${s.png}" style="max-width:760px;max-height:520px;display:block">\` : '<div style="color:#999">(no shot)</div>'}</td></tr>\`).join('\\n');
  const sheetHtml = \`<!doctype html><html><head><meta charset="utf-8"></head><body style="margin:0;background:#fff;width:980px;font-family:system-ui">\` +
    \`<div style="font:600 18px system-ui;padding:10px">\${escapeHtml(c.name)} \u2014 authored preview (no reference: grade on the absolute rubric)</div>\` +
    \`<table style="border-collapse:collapse">\${rows}</table></body></html>\`;
  writeFileSync(join(shotBase, \`.sheet-\${c.group}__\${c.name}.html\`), sheetHtml);
  try {
    await page.setViewportSize({ width: 1000, height: 700 });
    await page.goto(\`http://127.0.0.1:\${port}/_screenshots/review/.sheet-\${c.group}__\${c.name}.html\`, { waitUntil: 'networkidle', timeout: 15_000 });
    await page.evaluate(() => Promise.all([...document.images].map((i) => i.decode().catch(() => {}))));
    await page.screenshot({ path: join(shotBase, \`\${c.group}__\${c.name}.png\`), fullPage: true });
  } catch (e) { console.error(\`  (sheet skipped for \${c.name} \u2014 \${String(e).split('\\n')[0]})\`); }

  // pendingGrade: post-capture grade state for consumers (the resync
  // driver) \u2014 one bit instead of re-implementing this harness's verdicts.
  // The clear block above nulls \`grade\`, so non-null here means it survived.
  const pendingGrade = !(cells.length > 0 && cells.every((k) => grade?.cells?.[k]?.verdict === 'good'));
  writeFileSync(capPath, JSON.stringify({ gradeKey, sourceKey: c.sourceKey ?? null, keyRecipe: c.sourceKey ? KEY_RECIPE : undefined, cells, pendingGrade, shots: shots.map((s) => s.label), pageErrs: [...new Set(pageErrs)].slice(0, 3) }, null, 2));
  const errCells = shots.filter((s) => s.err).length;
  report.push({ name: c.name, group: c.group, cells: cells.length, errors: errCells });
  const keyHint = cells.length ? \` \u2014 grade keys: \${cells.map((k) => JSON.stringify(k)).join(', ')}\` : '';
  console.error(\`\${errCells ? '\u2717' : '\u25CB'} [CAPTURE] \${c.name}: \${cells.length} cell(s)\${errCells ? \`, \${errCells} error(s)\` : ' need grading'}\${keyHint}\`);
}

await browser.close();
srv.close();

if (!ONLY) {
  // Prune grade + cache state for components that left the sync.
  const live = new Set((manifest.components ?? []).map((c) => c.name));
  try {
    for (const f of readdirSync(cacheDir)) {
      const m = /^(.+?)(\\.grade)?\\.json$/.exec(f);
      if (!m || live.has(m[1])) continue;
      rmSync(join(cacheDir, f), { force: true });
      console.error(\`  (pruned stale \${f} \u2014 component no longer in the sync)\`);
    }
  } catch { /* fresh dir */ }
  // Unfolded subagent learnings block the upload gate, so a missed fold
  // can't silently ship.
  try {
    const unmerged = readdirSync(resolve('.design-sync', 'learnings')).filter((f) => f.endsWith('.md'));
    if (unmerged.length) console.error(\`! [LEARNINGS_UNMERGED] \${unmerged.length} file(s) in .design-sync/learnings/ \u2014 fold into NOTES.md and delete them before upload\`);
  } catch { /* no learnings dir */ }
}

const skipped = report.filter((r) => r.skipped);
const errors = report.filter((r) => r.verdict === 'error' || r.errors);
console.error(\`\\npackage-capture: \${report.length} component(s) \u2014 \${skipped.length} carried forward, \${report.length - skipped.length} captured, \${errors.length} with errors\${floorCount && !ONLY ? \`; \${floorCount} on the floor card (not graded)\` : ''}\`);
console.error('Grade from the sheets: Read each _screenshots/review/<group>__<Name>.png, then Write verdicts to .design-sync/.cache/review/<Name>.grade.json (keys must equal the cell labels exactly).');
process.exit(errors.length ? 1 : 0);
`;
  });
  var bMc = __commonJS((Lgv, BDf) => {
    BDf.exports = `// The hash recipes \u2014 single source of truth for every consumer that must
// agree byte-for-byte: package-build.mjs writes the recipe outputs into
// _ds_sync.json (the uploaded sidecar future syncs diff against) and stamps
// per-component sourceKeys into .stories-map.json; package-capture.mjs /
// compare.mjs key their local grade lifecycle on the stamped sourceKey;
// lib/preview-rebuild.mjs re-stamps after targeted recompiles;
// lib/remote-diff.mjs compares a fetched sidecar against a fresh build.
// "Verified" carry-forward is sound only because all of them compute the
// same hashes from the same recipe \u2014 never fork this logic into a harness.
//
// Factorization, by what a change should cost:
//   - sourceKey (KEY_RECIPE) \u2014 the GRADE contract: the user's own inputs
//     (story files, owned previews, story set, preview-affecting config,
//     committed forks). A change re-grades that component.
//   - renderHash \u2014 the per-component ARTIFACT fingerprint: feeds the upload
//     partition and the churn detector (artifacts moved while sourceKey
//     held \u21D2 pipeline churn \u21D2 sampled spot-check, never a re-grade storm).
//   - styleSha \u2014 the global styling surface, upload partition only.
// gradeKey = H(sourceKey).

import { createHash } from 'node:crypto';
import { readFileSync, readdirSync } from 'node:fs';
import { join, resolve } from 'node:path';
import { fileURLToPath } from 'node:url';

function hashFile(h, p, label) {
  h.update(label);
  try { h.update(readFileSync(p)); } catch { h.update('\u2205'); }
}
function hashDir(h, dir, prefix, skip) {
  let entries;
  try { entries = readdirSync(dir, { withFileTypes: true }); } catch { h.update('\u2205'); return; }
  for (const e of entries.sort((a, b) => (a.name < b.name ? -1 : 1))) {
    if (e.name.startsWith('.') || skip?.has(e.name)) continue;
    if (e.isDirectory()) hashDir(h, join(dir, e.name), \`\${prefix}\${e.name}/\`, skip);
    else hashFile(h, join(dir, e.name), \`\${prefix}\${e.name}\`);
  }
}

// JSON with sorted object keys, so config slices hash stably across
// key-order churn. undefined collapses to null.
function canonical(v) {
  if (Array.isArray(v)) return \`[\${v.map(canonical).join(',')}]\`;
  if (v && typeof v === 'object') {
    return \`{\${Object.keys(v).sort().map((k) => \`\${JSON.stringify(k)}:\${canonical(v[k])}\`).join(',')}}\`;
  }
  return JSON.stringify(v) ?? 'null';
}

// Global styling surface \u2014 feeds the upload partition only (upload.styling),
// never grades. The package shape includes the compiled DS bundle body (a DS
// recompile re-ships the styling surface); the storybook shape excludes it
// (the bundle ships via bundleSha12 \u2192 upload.bundle).
export function styleShaFor(OUT, { includeBundleBody }) {
  const h = createHash('sha256');
  if (includeBundleBody) {
    // Body only \u2014 the first-line @ds-bundle header embeds per-file hashes,
    // so including it would invalidate everything whenever anything changes.
    h.update('bundlejs');
    try {
      const src = readFileSync(join(OUT, '_ds_bundle.js'), 'utf8');
      h.update(src.slice(src.indexOf('\\n') + 1));
    } catch { h.update('\u2205'); }
  }
  hashFile(h, join(OUT, '_ds_bundle.css'), 'bundlecss');
  hashFile(h, join(OUT, 'styles.css'), 'styles');
  hashDir(h, join(OUT, 'fonts'), 'fonts/');
  hashDir(h, join(OUT, 'tokens'), 'tokens/');
  // The whole vendor runtime, not just the decorators: every preview card
  // loads _vendor/react.js, so a React version bump must flip the styling
  // surface and re-ship _vendor/** (upload.styling).
  hashDir(h, join(OUT, '_vendor'), '_vendor/');
  return h.digest('hex');
}

// Per-component render contract. The card html is hashed MINUS its first-line
// @dsCard marker \u2014 the marker embeds the display group, and a pure regroup
// must not read as a contract change (the viewport attr does belong: capture
// honors it). For storybook components the story contract (names/export keys,
// NOT the title-embedding storybook id) and the story-file fingerprint join \u2014
// an owned preview doesn't recompile when its story file changes, but the
// contract must move either way.
export function renderHashFor(OUT, c, { stories, srcSha } = {}) {
  const h = createHash('sha256');
  hashFile(h, join(OUT, '_preview', \`\${c.name}.js\`), 'preview');
  hashFile(h, join(OUT, '_preview', \`\${c.name}.css\`), 'previewcss');
  h.update('html');
  try {
    const html = readFileSync(join(OUT, 'components', c.group, c.name, \`\${c.name}.html\`), 'utf8');
    const nl = html.indexOf('\\n');
    h.update(/viewport="[^"]*"/.exec(html.slice(0, nl))?.[0] ?? '');
    h.update(html.slice(nl + 1));
  } catch { h.update('\u2205'); }
  if (stories) h.update(JSON.stringify(stories.map((s) => [s.name, s.exportKey ?? null, s.emitted ?? null])));
  if (srcSha !== undefined) h.update(String(srcSha ?? ''));
  return h.digest('hex').slice(0, 16);
}

// Auxiliary docs surface \u2014 guidelines/, README.md. Neither affects renders
// (no verification impact) but both upload, and without a hash a docs-only
// edit would be invisible to the diff and never ship.
export function auxShaFor(OUT) {
  const h = createHash('sha256');
  hashDir(h, join(OUT, 'guidelines'), 'guidelines/');
  hashFile(h, join(OUT, 'README.md'), 'readme');
  return h.digest('hex').slice(0, 16);
}

export function gradeKeyFrom(key) {
  return createHash('sha256').update(key).digest('hex').slice(0, 16);
}

// \u2500\u2500 sourceKey: the grade contract, keyed on what the user expressed \u2500\u2500\u2500\u2500\u2500\u2500\u2500
// Versioned: the sidecar and capture jsons record keyRecipe, so a recipe
// change reads as "unknown \u2014 re-verify", never as source churn. ANY change
// to what feeds these hashes MUST bump this constant in the same commit \u2014
// same number over different bytes makes every existing anchor read as
// total source churn (a full grade-wipe storm) instead of taking the
// render-hash fallback. The golden-key test in resync-driver.test.ts
// enforces the pairing.
// Recipe 7: cardMode/primaryStory left the per-component override slice \u2014
// they only pick what the DEFAULT card view shows, but grading captures
// every story solo via ?story=, so flipping them never changes a graded
// pixel. viewport and skip stay keyed (capture viewport / story set).
export const KEY_RECIPE = 7;

// Config slices in the grade contract: the knobs that change the preview's
// DOM/mount semantics, plus committed lib forks. Asset-surface knobs
// (cssEntry/tokensPkg/extraFonts/runtimeFontPrefixes) stay in the styling
// trust class \u2014 deliberately NOT keyed; auto-detected siblings are derived
// state whose churn rides renderHash into the spot-check tier. Computed at
// BUILD time and stamped \u2014 consumers read the stamp, never live config, so
// the key always describes the artifacts on disk.
export function configSlicesFor(cfg = {}, designSyncDir = resolve('.design-sync')) {
  const g = createHash('sha256');
  g.update('provider');
  g.update(canonical(cfg.provider ?? null));
  g.update('storyImports');
  g.update(canonical(cfg.storyImports ?? null));
  g.update('extraEntries');
  g.update(canonical(cfg.extraEntries ?? null));
  // cfg.libOverrides is deliberately NOT keyed: its values are declaration
  // prose with no render effect, and fork behavior is fully keyed by the
  // fork file bytes below (loading keys off file existence, not the map).
  let forks = [];
  try { forks = readdirSync(join(designSyncDir, 'overrides')).filter((f) => f.endsWith('.mjs')).sort(); } catch { /* no forks */ }
  for (const f of forks) hashFile(g, join(designSyncDir, 'overrides', f), \`fork:\${f}\`);
  const global = g.digest('hex');
  const titleMap = cfg.titleMap ?? {};
  const overrides = cfg.overrides ?? {};
  return {
    global,
    componentFor(name) {
      const h = createHash('sha256');
      h.update('override');
      // Presentation-only knobs (cardMode/primaryStory) are excluded: they
      // arrange the default card view, not any solo-captured story, so a
      // layout flip carries grades forward. An override left empty by the
      // strip canonicalizes to null \u2014 same key as no override at all.
      const ov = overrides[name];
      let graded = null;
      if (ov && typeof ov === 'object' && !Array.isArray(ov)) {
        const { cardMode, primaryStory, ...rest } = ov;
        graded = Object.keys(rest).length ? rest : null;
      } else if (ov !== undefined && ov !== null) {
        graded = ov; // malformed (non-object) override \u2014 key it as-is
      }
      h.update(canonical(graded));
      // Only remaps INTO this component are its identity; {title: null}
      // exclusions remove the component from the manifest entirely.
      h.update('titlemap');
      h.update(canonical(Object.entries(titleMap).filter(([, v]) => v === name).sort()));
      return h.digest('hex');
    },
  };
}

// Per-component grade contract. The owned preview is read at stamp time \u2014
// normally right after its bytes were compiled, but a multi-target rebuild's
// stamp can trail the compile by the rest of the pipeline (accepted
// limitation; see preview-rebuild's KNOWN LIMITATION note). The package
// shape passes no stories/srcSha. \`emitted\` labels are generator dedup
// output \u2014 excluded.
export function sourceKeyFor(name, { globalSlice, componentSlice, stories = null, srcSha = undefined, designSyncDir = resolve('.design-sync') } = {}) {
  const h = createHash('sha256');
  h.update(\`recipe:\${KEY_RECIPE}\`);
  h.update('global');
  h.update(globalSlice ?? '');
  h.update('component');
  h.update(componentSlice ?? '');
  h.update('src');
  h.update(String(srcSha ?? ''));
  hashFile(h, join(designSyncDir, 'previews', \`\${name}.tsx\`), 'owned');
  if (stories) {
    h.update('stories');
    h.update(JSON.stringify(stories.map((s) => [s.name, s.exportKey ?? null])));
  }
  return h.digest('hex').slice(0, 16);
}

// Reference-storybook fingerprint \u2014 compare's [REFERENCE_STALE?]/sampler and
// the driver's drift trigger must agree on one recipe. project.json carries
// a generatedAt timestamp \u2014 excluded.
export function sbBaseShaFor(sbDir) {
  const h = createHash('sha256');
  hashDir(h, sbDir, 'sb/', new Set(['project.json']));
  return h.digest('hex');
}

// Staged-scripts fingerprint, recorded in the sidecar so a spot-check event
// can be traced to a skill release. Informational \u2014 never a partition input.
export function scriptsShaFor() {
  const libDir = fileURLToPath(new URL('.', import.meta.url));
  const root = fileURLToPath(new URL('..', import.meta.url));
  const h = createHash('sha256');
  hashDir(h, libDir, 'lib/');
  for (const f of ['package-build.mjs', 'package-validate.mjs', 'package-capture.mjs', 'resync.mjs',
    'storybook/compare.mjs', 'storybook/http-serve.mjs', 'storybook/probe.mjs']) {
    hashFile(h, join(root, f), f);
  }
  return h.digest('hex').slice(0, 16);
}
`;
  });
  var SMc = __commonJS((Fgv, $Df) => {
    $Df.exports = `#!/usr/bin/env node
// Two-partition diff: fresh local build vs the uploaded project's
// _ds_sync.json sidecar. The partitions answer DIFFERENT questions:
//
//   VERIFICATION (sourceKeys, falling back to renderHashes): which
//   components need their previews re-captured and re-graded. A component
//   verified at the last upload whose SOURCES are unchanged needs no
//   re-verification; artifact churn on a source-stable component
//   (renderChurned) keeps its grades and gets a sampled spot-check instead.
//   Either side missing sourceKeys, or a keyRecipe mismatch, falls back to
//   the renderHashes partition \u2014 today's behavior, never something worse.
//
//   UPLOAD (sourceHashes + bundleSha12 + styleSha): which files the project
//   is missing. This is a SUPERSET concern \u2014 renderHash deliberately ignores
//   .d.ts/.prompt.md edits and lockstep bundle changes, all of which still
//   must ship. Never scope uploads by the verification partition.
//
// The agent fetches the remote sidecar (DesignSync get_file \u2014 only it has
// auth) and saves it to a file; this script does the deterministic part.
// No --remote (project empty / never synced / fetch failed) \u2192 everything is
// unverified and everything uploads: full first-sync scope.
//
// Usage: node remote-diff.mjs --local <ds-bundle dir> [--remote <saved-sidecar.json>]
// Writes <ds-bundle>/.sync-diff.json:
//   {
//     styleChanged,                      // styling surface moved \u2192 re-ships (upload.styling); never re-verifies
//     unchanged: [..], changed: [..],    // verification scope (capture + grading)
//     added: [..], removed: [..],
//     renderChurned: [..],               // sources stable, artifacts moved \u2014 grades
//                                        // kept; the driver spot-checks a sample
//     keyedBy,                           // 'sourceKeys' | 'renderHashes' (fallback)
//     upload: {
//       any,                             // false \u21D2 nothing to upload at all
//       components: [..],                // informational \u2014 components whose upload files
//                                        // changed; feeds upload.any and the narration.
//                                        // NOT a write scope: the skill mandates full
//                                        // writes on every upload (storybook SKILL.md \xA76,
//                                        // non-storybook SKILL.md \xA75).
//       deletePaths: [..],               // exact remote paths to delete (removed/regrouped/orphaned)
//       bundle,                          // _ds_bundle.js (+ sidecar) must upload
//       styling,                         // styles.css/_ds_bundle.css/tokens/**/fonts/**
//                                        // AND _vendor/preview-decorators.js must upload
//       aux,                             // guidelines/**, README.md must upload
//     }
//   }

import { createHash } from 'node:crypto';
import { readFileSync, writeFileSync } from 'node:fs';
import { join, resolve } from 'node:path';

const argv = process.argv.slice(2);
const flag = (n) => { const i = argv.indexOf(\`--\${n}\`); return i < 0 ? null : argv[i + 1]; };
{
  const VALUE_FLAGS = ['local', 'remote'];
  for (let i = 0; i < argv.length; i++) {
    if (argv[i].startsWith('--') && VALUE_FLAGS.includes(argv[i].slice(2))) { i++; continue; }
    console.error(\`(unrecognized argument "\${argv[i]}" \u2014 ignored; usage: remote-diff.mjs --local <ds-bundle> [--remote <saved-sidecar.json>])\`);
  }
}
const OUT = flag('local') && resolve(flag('local'));
if (!OUT) { console.error('usage: remote-diff.mjs --local <ds-bundle dir> [--remote <saved-sidecar.json>]'); process.exit(2); }

const validSidecar = (s) =>
  s && typeof s === 'object' && typeof s.styleSha === 'string' &&
  s.renderHashes && typeof s.renderHashes === 'object' && !Array.isArray(s.renderHashes) &&
  s.sourceHashes && typeof s.sourceHashes === 'object' && !Array.isArray(s.sourceHashes);

let local;
try { local = JSON.parse(readFileSync(join(OUT, '_ds_sync.json'), 'utf8')); }
catch (e) { console.error(\`\u2717 \${OUT}/_ds_sync.json unreadable (\${e.message}) \u2014 run package-build.mjs first\`); process.exit(1); }
if (!validSidecar(local)) { console.error('\u2717 local _ds_sync.json malformed (styleSha/renderHashes/sourceHashes) \u2014 rebuild'); process.exit(1); }

// Local self-check: a sidecar from an older build than the bundle would
// vouch for hashes that don't describe what's on disk.
let liveBundleSha;
try { liveBundleSha = createHash('sha256').update(readFileSync(join(OUT, '_ds_bundle.js'))).digest('hex').slice(0, 12); }
catch { console.error(\`\u2717 \${OUT}/_ds_bundle.js unreadable \u2014 run package-build.mjs first\`); process.exit(1); }
if (local.bundleSha12 !== liveBundleSha) {
  console.error('\u2717 local _ds_sync.json is stale (bundleSha mismatch with _ds_bundle.js) \u2014 rebuild before diffing');
  process.exit(1);
}

let remote = null;
// anchorReason travels into .sync-diff.json so downstream consumers (the
// resync driver's verdict, CI) can tell "verified against the last upload"
// from "full first-sync scope" without parsing stderr.
let anchorReason = 'not_provided';
const remotePath = flag('remote');
if (remotePath) {
  anchorReason = 'unreadable';
  try { remote = JSON.parse(readFileSync(remotePath, 'utf8')); }
  catch (e) { console.error(\`! remote sidecar unreadable (\${e.message}) \u2014 treating as no anchor\`); }
  if (remote && !validSidecar(remote)) {
    console.error('! remote sidecar malformed \u2014 treating as no anchor');
    remote = null;
    anchorReason = 'malformed';
  } else if (remote && remote.shape !== local.shape) {
    console.error(\`! source shape changed (\${remote.shape} \u2192 \${local.shape}) \u2014 hashes are not comparable across recipes; full re-verification\`);
    remote = null;
    anchorReason = 'shape_changed';
  } else if (remote) {
    anchorReason = 'ok';
  }
}

// components/<group>/<Name>/<file> \u2014 the per-name view of sourceHashes paths
// powers regroup/move detection (key changes) and delete derivation.
function byName(sourceHashes) {
  const m = new Map();
  for (const path of Object.keys(sourceHashes)) {
    const seg = path.split('/');
    if (seg[0] !== 'components' || seg.length < 4) continue;
    const name = seg[2];
    if (!m.has(name)) m.set(name, { group: seg[1], paths: [] });
    m.get(name).paths.push(path);
  }
  return m;
}

const localNames = Object.keys(local.renderHashes ?? {});
const out = {
  styleChanged: false,
  anchorUsed: !!remote, anchorReason,
  keyedBy: 'renderHashes',
  unchanged: [], changed: [], added: [], removed: [], renderChurned: [],
  upload: { any: true, components: [], deletePaths: [], bundle: true, styling: true, aux: true },
};

if (!remote) {
  out.added = localNames;
  out.upload.components = localNames;
  console.error(\`no remote anchor \u2014 full scope (\${localNames.length} component(s) verify + upload)\`);
} else {
  // \u2500\u2500 Verification partition (capture + grading scope). Source-key
  // inequality when both sidecars carry comparable keys; styling changes
  // never re-verify either way. styleChanged drives the upload partition.
  const keysOk = (s) => s.sourceKeys && typeof s.sourceKeys === 'object' && !Array.isArray(s.sourceKeys);
  const useSourceKeys = keysOk(local) && keysOk(remote) &&
    local.keyRecipe !== undefined && remote.keyRecipe === local.keyRecipe;
  if (keysOk(remote) && keysOk(local) && !useSourceKeys) {
    console.error(\`! source-key recipe changed (remote keyRecipe \${remote.keyRecipe} \u2192 local \${local.keyRecipe}) \u2014 falling back to the render-hash partition (full re-verification of changed artifacts)\`);
  }
  out.keyedBy = useSourceKeys ? 'sourceKeys' : 'renderHashes';
  out.styleChanged = remote.styleSha !== local.styleSha;
  for (const n of localNames) {
    if (!(n in remote.renderHashes)) { out.added.push(n); continue; }
    // A name missing from either sourceKeys map is unknown \u2014 re-verify.
    const changed = useSourceKeys
      ? remote.sourceKeys[n] === undefined || local.sourceKeys[n] === undefined || remote.sourceKeys[n] !== local.sourceKeys[n]
      : remote.renderHashes[n] !== local.renderHashes[n];
    if (changed) { out.changed.push(n); continue; }
    out.unchanged.push(n);
    // Sources held, artifacts moved: grades carry, the driver spot-checks a
    // sample, and the fresh artifacts still re-ship (renderChurned joins the
    // upload set below \u2014 else the anchor never refreshes and this re-fires).
    if (useSourceKeys && remote.renderHashes[n] !== local.renderHashes[n]) out.renderChurned.push(n);
  }
  out.removed = Object.keys(remote.renderHashes).filter((n) => !(n in local.renderHashes));

  // \u2500\u2500 Upload partition (what the project is missing).
  const localBy = byName(local.sourceHashes);
  const remoteBy = byName(remote.sourceHashes);
  const uploadSet = new Set();
  // Added/changed components re-ship their card/preview files; so do
  // renderChurned ones \u2014 their grades carry but their artifacts moved.
  for (const n of [...out.added, ...out.changed, ...out.renderChurned]) uploadSet.add(n);
  // Source files moved (path OR content): catches .d.ts/.prompt.md/.jsx-only
  // edits that the render hash deliberately ignores, and regroups (path keys
  // change even when content doesn't). Only components/ keys carry names.
  for (const [path, sha] of Object.entries(local.sourceHashes)) {
    if (!path.startsWith('components/')) continue;
    if (remote.sourceHashes[path] !== sha) {
      const name = path.split('/')[2];
      if (name) uploadSet.add(name);
    }
  }
  out.upload.components = [...uploadSet].sort();
  // Deletes: every remote component path that no longer exists locally \u2014
  // removed components entirely, the OLD group's paths after a regroup, and
  // residue files a kept component no longer emits (sourceHashes is
  // existence-filtered at build time, so a dropped .prompt.md leaves a
  // remote orphan). The card html and compiled preview aren't in
  // sourceHashes; derive them.
  const localPathSet = new Set(Object.keys(local.sourceHashes));
  for (const [name, info] of remoteBy) {
    const localInfo = localBy.get(name);
    if (!localInfo) {
      out.upload.deletePaths.push(
        ...info.paths,
        \`components/\${info.group}/\${name}/\${name}.html\`,
        \`_preview/\${name}.js\`, \`_preview/\${name}.css\`,
      );
      continue;
    }
    out.upload.deletePaths.push(...info.paths.filter((p) => !localPathSet.has(p)));
    if (localInfo.group !== info.group) {
      out.upload.deletePaths.push(\`components/\${info.group}/\${name}/\${name}.html\`);
    }
  }
  // A remote component present in renderHashes but absent from sourceHashes
  // has no derivable paths \u2014 its deletes can't be computed. Loud, not silent.
  for (const n of Object.keys(remote.renderHashes)) {
    if (!(n in local.renderHashes) && !remoteBy.has(n)) {
      console.error(\`! removed component "\${n}" has no sourceHashes coverage in the remote sidecar \u2014 its remote files can't be derived for deletion; list_files and clean up by hand once\`);
    }
  }
  out.upload.bundle = remote.bundleSha12 !== local.bundleSha12;
  out.upload.styling = out.styleChanged;
  // A sidecar missing auxSha (malformed or hand-produced off-envelope) can't
  // vouch for the docs surface \u2014 treat as changed so guidelines/README ship.
  out.upload.aux = remote.auxSha === undefined || local.auxSha === undefined || remote.auxSha !== local.auxSha;
  out.upload.any = out.upload.components.length > 0 || out.upload.deletePaths.length > 0 || out.upload.bundle || out.upload.styling || out.upload.aux;
  // Recipe UPGRADE with byte-identical artifacts: nothing above triggers, so
  // the new-recipe sidecar would never ship and the fallback window never
  // closes (a later pipeline churn then costs a full re-verify instead of
  // the grades-kept canary). Flip upload.any: the upload is full-writes by
  // doctrine (idempotent; identical bytes are cheap) and always ships
  // _ds_sync.json last \u2014 one routine upload closes the window for good.
  // Direction-gated: recipes are forward-only, so only a LOCAL-newer flip
  // refreshes \u2014 an older-skill machine must never downgrade a newer anchor
  // (mixed-version fleets would ping-pong full uploads otherwise), and a
  // keyRecipe-less local sidecar (foreign generator) must never loop.
  if (!useSourceKeys && keysOk(local) && keysOk(remote) && !out.upload.any &&
      typeof local.keyRecipe === 'number' && typeof remote.keyRecipe === 'number' &&
      local.keyRecipe > remote.keyRecipe) {
    out.upload.any = true;
  }

  console.error(\`verify: \${out.unchanged.length} verified-by-upload (skip capture/grade), \${out.changed.length} changed, \${out.added.length} new, \${out.removed.length} removed\${out.renderChurned.length ? \`, \${out.renderChurned.length} artifact-churned with stable sources (grades kept \u2014 spot-check)\` : ''} [keyed on \${out.keyedBy}]\`);
  console.error(out.upload.any
    ? ((out.upload.components.length || out.upload.deletePaths.length || out.upload.bundle || out.upload.styling || out.upload.aux)
      ? \`upload: \${out.upload.components.length} component(s), \${out.upload.deletePaths.length} delete(s)\${out.upload.bundle ? ', bundle' : ''}\${out.upload.styling ? ', styling' : ''}\${out.upload.aux ? ', docs' : ''} (+ _ds_sync.json last)\`
      : 'upload: anchor refresh \u2014 artifacts match but the anchor is on an older key recipe; the routine upload (storybook SKILL.md \xA76 / non-storybook \xA75, _ds_sync.json last) closes the fallback window')
    : 'upload: nothing \u2014 the project already matches this build');
}
writeFileSync(join(OUT, '.sync-diff.json'), JSON.stringify(out, null, 2) + '\\n');
console.error(\`\u2192 \${join(OUT, '.sync-diff.json')}\`);
`;
  });
  var TMc = __commonJS((Ugv, HDf) => {
    HDf.exports = `#!/usr/bin/env node
// resync.mjs \u2014 THE re-sync path: one driver for the mechanical whole of a
// re-sync, emitting ONE machine-readable verdict (stdout + <out>/.resync-verdict.json):
//
//   package-build \u2192 remote-diff \u2192 package-validate \u2192 capture(new + contract-changed)
//
// Trust model: grades follow the user's SOURCES (gradeKey = H(sourceKey) \u2014
// story files, owned previews, preview-affecting config, committed forks).
// DS source edits, CSS/token changes, and shared bundle changes re-upload
// bytes without re-grading; pipeline churn (skill/toolchain updates moving
// compiled artifacts while sources hold) keeps grades and triggers a sampled
// spot-check canary instead. Only components whose sources moved or that are
// new get captured and land in pendingGrade.
// For a deliberate audit of carried-forward grades, run the capture harness
// directly afterwards (compare.mjs / package-capture.mjs --components A,B
// --spot-check-components A,B).
//
// The agent runs the judgment half: fetch the anchor before this (DesignSync
// get_file \u2192 a local file), run the repo's own build when source may have
// changed, grade whatever pendingGrade lists, check validate's warn lines
// against NOTES.md's known list (a warn not recorded there is new \u2014 look),
// and do the attended upload when upload.any is true. A no-change re-sync
// skips capture entirely and uploads nothing.
//
// Usage:
//   node resync.mjs --config .design-sync/config.json --node-modules <nm>
//     --out ./ds-bundle [--remote <saved-sidecar.json>] [--entry <dist-entry>]
//     [--storybook-static <dir>] [--render-sample N] [--max-stories N]
//     [--no-render-check]
//
// Exit code: 0 when every mechanical stage passed \u2014 pendingGrade is NOT a
// failure (grading is the agent's job). Exception: an unfolded
// .design-sync/learnings/ file fails the verdict (exit 1) with every stage
// green \u2014 the learnings gate (see learningsUnmerged below). A failed stage stops the chain;
// later stages get skipped:"prior_failure"; the verdict is still written and
// the exit code mirrors the first failure \u2014 except a child's exit 2, which
// is clamped to 1 so that 2 stays the usage-error discriminator (exit 2 =
// no verdict).
//
// Verdict schema v2 (the CI contract \u2014 additive changes only):
// {
//   version: 2, ok, shape,
//   anchor,         // ok|not_provided|unreadable|malformed|shape_changed|unknown
//                   // ("unknown" = --remote was given but the diff artifact
//                   // is missing or predates this field)
//   learningsUnmerged, // unfolded .design-sync/learnings/*.md names \u2014 non-empty fails ok
//   stages: { build|diff|validate|capture: { ok, exit, skipped } },
//                   // skipped: null (ran) | "prior_failure" | "empty_worklist"
//   verification: { unchanged, changed, added, removed,
//                   pendingGrade,         // capture ran for these; grade their sheets
//                   canary },             // null, or {picks, churned, trigger}: sources
//                                         // held while artifacts (or the reference
//                                         // storybook) churned \u2014 grades kept; confirm
//                                         // the picks' [SPOT_CHECK] sheets
//   upload: { any, components, deletePaths, bundle, styling, aux } | null
//                   // null when the diff never produced an artifact \u2014 ok is
//                   // false then; fix the failed stage, don't upload
// }

import { existsSync, mkdirSync, readdirSync, readFileSync, writeFileSync } from 'node:fs';
import { join, resolve } from 'node:path';
import { fileURLToPath } from 'node:url';
import { spawnSync } from 'node:child_process';
import { validateConfig } from './lib/common.mjs';
import { sbBaseShaFor } from './lib/sync-hashes.mjs';

const argv = process.argv.slice(2);
const flag = (n) => { const i = argv.indexOf(\`--\${n}\`); return i < 0 ? null : argv[i + 1]; };
{
  const VALUE_FLAGS = ['config', 'remote', 'node-modules', 'entry', 'out', 'storybook-static', 'render-sample', 'max-stories'];
  for (let i = 0; i < argv.length; i++) {
    if (argv[i] === '--no-render-check') continue;
    if (argv[i].startsWith('--') && VALUE_FLAGS.includes(argv[i].slice(2))) { i++; continue; }
    console.error(\`(unrecognized argument "\${argv[i]}" \u2014 ignored)\`);
  }
}
const CONFIG = flag('config');
const OUT = flag('out') && resolve(flag('out'));
const NM = flag('node-modules');
const REMOTE = flag('remote') && resolve(flag('remote'));
if (!CONFIG || !OUT || !NM) {
  console.error('usage: node resync.mjs --config <.design-sync/config.json> --node-modules <nm> --out <ds-bundle> [--remote <saved-sidecar.json>] \u2026');
  process.exit(2);
}
// cwd sanity \u2014 the capture harnesses resolve .design-sync/ from cwd; a driver
// run from the wrong directory would scatter campaign state somewhere no
// later run will find it.
if (!existsSync(resolve(CONFIG))) {
  console.error(\`\u2717 \${CONFIG} not found from \${process.cwd()} \u2014 run the driver from the repo root (the directory the --config path is relative to)\`);
  process.exit(2);
}
if (!existsSync(resolve('.design-sync'))) {
  console.error(\`\u2717 no .design-sync/ under \${process.cwd()} \u2014 run the driver from the repo root\`);
  process.exit(2);
}
// Usage-class errors fail in usage-class time \u2014 a typo'd --node-modules
// would otherwise burn the whole build stage before an esbuild resolution
// error that never names the flag.
if (!existsSync(resolve(NM))) {
  console.error(\`\u2717 --node-modules \${NM} does not exist\`);
  process.exit(2);
}
// Config-shape pre-flight: a well-formed config with unknown or removed
// keys fails usage-class (exit 2, no verdict) before any stage spends time.
// Unparseable JSON is deliberately left to the build stage, which reports
// it with full context \u2014 the stale-artifact gating relies on that path
// staying a stage failure.
{
  let cfg, parsed = false;
  try { cfg = JSON.parse(readFileSync(resolve(CONFIG), 'utf8')); parsed = true; } catch { /* build reports it */ }
  if (parsed) {
    const errs = validateConfig(cfg);
    if (errs.length) {
      for (const e of errs) console.error(\`\u2717 config: \${e}\`);
      console.error(\`\u2717 \${CONFIG}: fix the config and re-run \u2014 nothing was built\`);
      process.exit(2);
    }
  }
}

const here = (p) => fileURLToPath(new URL(p, import.meta.url));
// Every stage record passes through exactly one of runStage/skipStage, so
// "ran" is always \`skipped === null\`.
const stages = {};
let firstFailExit = null;

// Children: stdout piped to OUR stderr (the driver's stdout is verdict-only \u2014
// a CI step parses it), stderr inherited so every [TAG] diagnostic streams
// live.
function runStage(name, script, args) {
  const r = spawnSync(process.execPath, [here(script), ...args], {
    cwd: process.cwd(), encoding: 'utf8',
    stdio: ['ignore', 'pipe', 'inherit'],
    // Piped stdout defaults to a 1MB cap \u2014 a chatty child would die with
    // ENOBUFS mid-stage. 64MB is effectively unbounded for build logs.
    maxBuffer: 64 * 1024 * 1024,
  });
  if (r.stdout) process.stderr.write(r.stdout);
  const exit = r.status ?? 1;
  stages[name] = { ok: exit === 0, exit, skipped: null };
  // The verdict's stages[].exit reports the child's TRUE code, but the
  // DRIVER's own exit clamps a child's 2 to 1 \u2014 2 is reserved for usage
  // errors (no verdict written), and compare/package-capture legitimately
  // exit 2 for stage-class failures ([SB_REFERENCE_MISSING], [ZERO_MATCH]).
  if (exit !== 0 && firstFailExit === null) firstFailExit = exit === 2 ? 1 : exit;
  return exit === 0;
}
function skipStage(name, why) {
  stages[name] = { ok: null, exit: null, skipped: why };
}

const readJson = (p) => { try { return JSON.parse(readFileSync(p, 'utf8')); } catch { return null; } };

// \u2500\u2500 Stage 1-3: build \u2192 diff \u2192 validate. Each failure stops the chain.
let aborted = false;
{
  const buildArgs = ['--config', resolve(CONFIG), '--node-modules', resolve(NM), '--out', OUT];
  if (flag('entry')) buildArgs.push('--entry', resolve(flag('entry')));
  if (flag('storybook-static')) buildArgs.push('--storybook-static', resolve(flag('storybook-static')));
  if (!runStage('build', './package-build.mjs', buildArgs)) aborted = true;
}
if (aborted) { skipStage('diff', 'prior_failure'); } else {
  const args = ['--local', OUT];
  if (REMOTE) args.push('--remote', REMOTE);
  if (!runStage('diff', './lib/remote-diff.mjs', args)) aborted = true;
}
// The diff artifact scopes both the validate stage (render-check tiering
// below) and the capture stage. Gated on the diff having succeeded THIS run:
// a build that dies before package-build's OUT wipe leaves the PREVIOUS
// run's artifacts on disk, and reading them would scope this run by a prior
// run's diff.
const syncDiff = stages.diff?.ok ? readJson(join(OUT, '.sync-diff.json')) : null;

if (aborted) { skipStage('validate', 'prior_failure'); } else {
  const args = [OUT];
  if (flag('render-sample')) args.push('--render-sample', flag('render-sample'));
  if (argv.includes('--no-render-check')) args.push('--no-render-check');
  const userScoped = argv.includes('--render-sample') || argv.includes('--no-render-check');
  // No explicit render flag \u2192 scope the render check by what the diff proved.
  // With a healthy anchor, bundle+styling hashes equal, and nothing
  // changed/added/render-churned, every preview's render inputs are
  // byte-identical to the last upload: the diff pins the anchor to the fresh
  // sidecar, and remote-diff's fatal bundle-sha check plus validate's
  // always-on [SYNC_STALE] recompute pin the sidecar to disk. Re-rendering
  // identical bytes tests the local chromium environment, not the artifacts.
  // Nothing to upload \u2192 skip the render check; only render-inert files to
  // ship (docs/anchor refresh \u2014 a .d.ts/.prompt.md edit re-ships the
  // bundle via its header hashes and takes the full check) \u2192 sample. Anything render-affecting
  // moved, or no healthy anchor \u2192 full, as before.
  if (!userScoped && syncDiff?.anchorReason === 'ok' && syncDiff.upload && !syncDiff.upload.bundle && !syncDiff.upload.styling
      && !(syncDiff.changed?.length || syncDiff.added?.length || syncDiff.renderChurned?.length)) {
    if (!syncDiff.upload?.any) {
      args.push('--no-render-check');
      console.error('render check: skipped \u2014 anchored no-change re-sync (nothing uploads; [SYNC_STALE] and the file-shape checks still run). Pass --render-sample 0 to force the full pass.');
    } else {
      args.push('--render-sample', '10');
      console.error('render check: sampled (~10) \u2014 anchor ok, no component moved; nothing that affects rendering ships. Pass --render-sample 0 to force the full pass.');
    }
  }
  if (!runStage('validate', './package-validate.mjs', args)) aborted = true;
}

// \u2500\u2500 Stage 4: capture, scoped to the diff's worklist (new + contract-changed).
// Artifact reads are gated on their producing stage having succeeded THIS
// run (syncDiff above is gated the same way): a build that dies before
// package-build's OUT wipe (malformed config, [OUT_UNSAFE]) leaves the
// PREVIOUS run's artifacts on disk, and reading them would dress a failed
// run in the prior run's anchor and partitions.
const sidecar = stages.build.ok ? readJson(join(OUT, '_ds_sync.json')) : null;
const shape = sidecar?.shape ?? 'storybook';
const gradeCacheDir = shape === 'storybook'
  ? resolve('.design-sync', '.cache', 'compare')
  : resolve('.design-sync', '.cache', 'review');
let worklist = [];
let brokenAuthored = [];
// The learnings fold gate (read unconditionally here, enforced at verdict
// assembly) must be known BEFORE the drift-baseline refresh in the capture
// section: a learnings-failed verdict is not acted on, so it must preserve
// the one-shot drift signal for the post-fold retry \u2014 same contract as a
// failed capture.
let learningsUnmerged = [];
try { learningsUnmerged = readdirSync(resolve('.design-sync', 'learnings')).filter((f) => f.endsWith('.md')).sort(); } catch { /* no dir \u2014 nothing unfolded */ }
let canary = null;
let canaryPicks = [];
if (aborted) {
  skipStage('capture', 'prior_failure');
} else if (!syncDiff) {
  // diff exited 0 but its artifact is unreadable \u2014 treat as a failure, not a skip.
  skipStage('capture', 'prior_failure');
  if (firstFailExit === null) firstFailExit = 1;
  aborted = true;
  console.error('\u2717 .sync-diff.json unreadable after a clean diff stage \u2014 cannot scope the capture');
} else {
  worklist = [...(syncDiff.changed ?? []), ...(syncDiff.added ?? [])];
  const manifest = shape === 'storybook' ? readJson(join(OUT, '.stories-map.json')) : null;
  // What the capture harness can actually capture: compare.mjs needs stories
  // in the manifest; package-capture needs a compiled _preview/<Name>.js
  // (floor-card components are the deliberate baseline, not gradable work).
  const isCapturable = shape === 'storybook'
    ? (manifest
      ? (() => { const s = new Set((manifest.components ?? []).filter((c) => (c.stories ?? []).length).map((c) => c.name)); return (n) => s.has(n); })()
      : null)
    : (n) => existsSync(join(OUT, '_preview', \`\${n}.js\`));
  if (worklist.length && isCapturable) {
    // Passing an uncapturable member through would either fail the stage
    // ([ZERO_MATCH]) or \u2014 since no capture json is ever written for it \u2014
    // leave it forever in pendingGrade with no sheet to grade. The dropped
    // members still re-ship via the upload partition.
    {
      const dropped = worklist.filter((n) => !isCapturable(n));
      // An AUTHORED preview with no compiled output is not a deliberate
      // floor card \u2014 its compile failed this build (package-build warns
      // \`! preview build failed\` but exits 0). Dropping it silently would
      // ship the floor-card regression under an ok:true verdict and anchor
      // it as verified-by-upload. Surface it as pending instead.
      // PACKAGE shape only: storybook's capturable means "has manifest
      // stories", not "preview compiled" \u2014 there, a story-less component
      // with an owned preview (all stories skipped via cfg.overrides) is a
      // legitimate state, and flagging it would park it in pendingGrade
      // with no capture json ever coming to clear it.
      const broken = shape !== 'storybook' ? dropped.filter((n) => existsSync(resolve('.design-sync', 'previews', \`\${n}.tsx\`))) : [];
      const floor = dropped.filter((n) => !broken.includes(n));
      if (broken.length) console.error(\`(\${broken.join(', ')}: authored preview exists but did not compile this build \u2014 see '! preview build failed' in the build log; listed in pendingGrade until it compiles)\`);
      if (floor.length) console.error(\`(\${floor.join(', ')}: nothing to capture \u2014 re-ships via the upload partition, no grading needed)\`);
      worklist = worklist.filter((n) => isCapturable(n));
      brokenAuthored = broken;
    }
  }

  // \u2500\u2500 Tier-1 canary: sources held but artifacts churned (renderChurned) or
  // the reference storybook moved since the last capture (missing
  // .sb-state.json \u21D2 no drift trigger \u2014 parity; nothing samples that today).
  // Grades stay; min(5, pool) is re-captured via --spot-check-components for
  // the agent to confirm. The single-mode/portal pick is mandatory \u2014 the
  // render check never exercises a single-mode card's non-primary stories.
  let sbCur = null;
  let refDrift = false;
  {
    const churned = (syncDiff.renderChurned ?? []).filter((n) => isCapturable?.(n));
    if (shape === 'storybook') {
      const sbDir = flag('storybook-static') ? resolve(flag('storybook-static')) : manifest?.storybookStatic;
      if (sbDir && existsSync(join(sbDir, 'iframe.html'))) {
        sbCur = sbBaseShaFor(resolve(sbDir));
        const state = readJson(join(gradeCacheDir, '.sb-state.json'));
        if (state?.sbBaseSha) refDrift = sbCur !== state.sbBaseSha;
      }
    }
    const pool = [...new Set([...churned, ...(refDrift ? (syncDiff.unchanged ?? []).filter((n) => isCapturable?.(n)) : [])])]
      .filter((n) => !worklist.includes(n));
    if (pool.length) {
      const cfgObj = readJson(resolve(CONFIG)) ?? {};
      const capJson = new Map();
      const capOf = (n) => { if (!capJson.has(n)) capJson.set(n, readJson(join(gradeCacheDir, \`\${n}.json\`))); return capJson.get(n); };
      // Prefer picks with recorded verdicts to confirm against; one without
      // is captured fresh and surfaces in pendingGrade (bounded by K).
      const clean = (n) => capOf(n)?.pendingGrade === false;
      // Non-grid card modes (single/column) render a different default view
      // than the solo-graded stories \u2014 keep at least one in the picks.
      const single = (n) => ['single', 'column'].includes(cfgObj.overrides?.[n]?.cardMode) || capOf(n)?.portal === true;
      const picks = new Set();
      const singles = pool.filter(single);
      if (singles.length) picks.add(singles.find(clean) ?? singles[0]);
      const rest = pool.filter((n) => !picks.has(n));
      for (let i = rest.length - 1; i > 0; i--) {
        const j = Math.floor(Math.random() * (i + 1));
        [rest[i], rest[j]] = [rest[j], rest[i]];
      }
      rest.sort((a, b) => Number(clean(b)) - Number(clean(a))); // stable: random within clean/unclean
      for (const n of rest) { if (picks.size >= 5) break; picks.add(n); }
      canaryPicks = [...picks];
      canary = { picks: canaryPicks, churned, trigger: refDrift && churned.length ? 'both' : refDrift ? 'reference_drift' : 'render_churn' };
      console.error(\`\u25C9 canary: \${churned.length ? \`\${churned.length} component(s) re-rendered with unchanged sources\` : ''}\${churned.length && refDrift ? '; ' : ''}\${refDrift ? 'the reference storybook changed under carried grades' : ''} \u2014 spot-checking \${canaryPicks.length} with grades kept: \${canaryPicks.join(', ')}\`);
    }
  }

  if (!worklist.length && !canaryPicks.length) {
    skipStage('capture', 'empty_worklist');
    console.error('capture skipped \u2014 no capturable changed or added components');
  } else {
    // A canary with an empty worklist still runs \u2014 scoped to the picks so
    // the harness keeps its scoped-run semantics (no prune/report/sampler).
    const args = ['--out', OUT, '--components', (worklist.length ? worklist : canaryPicks).join(',')];
    if (canaryPicks.length) args.push('--spot-check-components', canaryPicks.join(','));
    if (shape === 'storybook') {
      const sb = flag('storybook-static');
      if (sb) args.push('--storybook-static', resolve(sb));
      if (flag('max-stories')) args.push('--max-stories', flag('max-stories'));
      runStage('capture', './storybook/compare.mjs', args);
    } else {
      runStage('capture', './package-capture.mjs', args);
    }
  }

  // The reference-drift baseline is owned HERE, not by compare: a scoped
  // compare run verifies only its own components and must not consume the
  // drift signal for the carried set. A clean (or no-drift) driver run is
  // the designed one-shot consumption \u2014 seed/refresh the baseline; a failed
  // capture preserves the signal for the retry \u2014 and so does a verdict that
  // will fail on the learnings gate when drift was sampled (the post-fold
  // re-run is the one acted on); seeding and no-drift refreshes destroy no
  // signal and proceed regardless.
  // Consume-aware: a drifted run refreshes the baseline only if it actually
  // sampled the carried set \u2014 an anchor-less run has an empty unchanged
  // partition (empty pool), and writing there would destroy the one-shot
  // drift signal while locally-cached grades carried unverified. First-time
  // seeding and no-drift refreshes are unaffected.
  if (sbCur && stages.capture.ok !== false && (!refDrift || (canaryPicks.length && learningsUnmerged.length === 0))) {
    try {
      mkdirSync(gradeCacheDir, { recursive: true });
      writeFileSync(join(gradeCacheDir, '.sb-state.json'), JSON.stringify({ sbBaseSha: sbCur }, null, 2));
    } catch { /* best-effort */ }
  }
}

// \u2500\u2500 Verdict assembly \u2014 artifacts only, never stderr.
// pendingGrade \u2014 each harness writes a \`pendingGrade\` bit into its fresh
// capture json (its own post-capture verdict-state, in its own vocabulary),
// so the driver reads one bit instead of re-implementing either harness's
// grading predicate. Missing json or missing bit (stale staged scripts) is
// conservatively pending. Scans worklist \u222A canary picks: a demoted pick must
// surface here, not accumulate as silent pending state.
const scanSet = [...new Set([...worklist, ...canaryPicks])];
// Capture never ran \u2192 nothing is freshly pending; ran and failed \u2192 the whole
// scope is pending (the verdict is ok:false anyway); ran clean \u2192 derive.
const pendingGrade = [...new Set([
  ...(stages.capture.skipped !== null ? [] : (stages.capture.ok
    ? scanSet.filter((name) => readJson(join(gradeCacheDir, \`\${name}.json\`))?.pendingGrade !== false)
    : scanSet)),
  // Authored previews whose compile failed this build: nothing was captured
  // for them, but they are NOT done \u2014 the floor card is currently shipping
  // in place of the authored preview.
  ...brokenAuthored,
])];

// The driver is the \xA74d closing receipt, but its capture is scoped, so
// compare's full-run-only [LEARNINGS_UNMERGED] advisory can never fire here.
// Check the learnings dir directly: an unfolded learnings file means the
// mandatory \xA74c fold was missed \u2014 fail the verdict rather than let it ship.
if (learningsUnmerged.length) {
  console.error(\`\u2717 [LEARNINGS_UNMERGED] unfolded learnings file(s): \${learningsUnmerged.join(', ')} \u2014 fold into NOTES.md and delete them (your shape's between-waves fold step), then re-run\`);
}
const ok = learningsUnmerged.length === 0 && Object.values(stages).every((s) => (s.skipped === null ? s.ok : s.skipped !== 'prior_failure'));
const verdict = {
  version: 2,
  ok,
  shape,
  anchor: syncDiff?.anchorReason ?? (REMOTE ? 'unknown' : 'not_provided'),
  learningsUnmerged,
  stages,
  verification: {
    unchanged: syncDiff?.unchanged ?? [],
    changed: syncDiff?.changed ?? [],
    added: syncDiff?.added ?? [],
    removed: syncDiff?.removed ?? [],
    pendingGrade,
    canary,
  },
  upload: syncDiff?.upload ?? null,
};

// stdout is the verdict's primary channel; the file copy is best-effort.
// Two deliberate non-writes: when the build never created OUT (creating it
// here would leave a dir holding only this file, tripping package-build's
// [OUT_UNSAFE] guard on the very re-run the verdict asks for), and when the
// write itself fails (unwritable path, OUT is a regular file) \u2014 neither may
// swallow the stdout verdict or change the exit code.
try {
  if (existsSync(OUT)) {
    writeFileSync(join(OUT, '.resync-verdict.json'), JSON.stringify(verdict, null, 2) + '\\n');
  } else {
    console.error('(.resync-verdict.json not written \u2014 the build never created --out; verdict on stdout only)');
  }
} catch (e) {
  console.error(\`(.resync-verdict.json not written: \${String(e.message ?? e).split('\\n')[0]} \u2014 verdict on stdout only)\`);
}
process.stdout.write(JSON.stringify(verdict, null, 2) + '\\n');
process.exit(ok ? 0 : (firstFailExit ?? 1));
`;
  });