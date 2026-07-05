  __export(sDc, {
    lxl: () => oDc
  });
  function MOf() {
    return DOf ??= Promise.resolve().then(() => (iDc(), sDc));
  }
  function FOf() {
    if (getFeatureValue_CACHED_MAY_BE_STALE("tengu_cobalt_plinth_dataviz", false)) {
      return `**When adding charts or diagrams** The craft shifts from identity to honesty \u2014 pick the form the data's shape calls for, keep encodings from exaggerating, title the finding rather than the axes. Load the \`${"dataviz"}\` skill for the specifics; this skill continues to govern the page the chart sits in.`;
    }
    return "";
  }
  function aDc() {
    Qc({
      name: "artifact-design",
      menuDescription: "Design guidance for Artifacts",
      description: "Design guidance and fundamentals for Artifacts.",
      isEnabled: isArtifactToolEnabled,
      userInvocable: true,
      async getPromptForCommand() {
        let {
          lxl: e
        } = await MOf();
        return [{
          type: "text",
          text: sf(e).content.trimStart().replace("<!-- dataviz-callout -->", FOf)
        }];
      }
    });
  }
  var DOf;
  var lDc = __lazy(() => {
    $n();
    M1();
    fv();
    x_();
  });
  function UOf() {
    return wSt().environment.map(e => `- ${e}`).join(`
`);
  }
  function BOf(e) {
    return `# Auto Mode Setup & Customisation

Help the user set up and customise auto mode. You'll fill in the
**environment section** (strongly recommended \u2014 most of auto mode's rules
read it to decide what's inside vs outside the trust boundary), optionally
suggest a few rule carve-outs based on what they actually do, and show them
how the pieces fit together. You'll ask one framing question, recon the repo
and the user's recent sessions, show the full proposal in one block, get a
single up-or-down approval, then write it to \`~/.claude/settings.json\` \u2014
then offer one optional extra step: granular sensitive-data provenance
rules (Phase 6b).

## Phase 0: Set expectations

Start with one AskUserQuestion to set expectations and confirm they want
to proceed:

> header: "Auto-mode setup & customisation"
> question: "I'll spend a few minutes exploring your repo and recent
> sessions, then show you a proposed environment block to approve \u2014 plus,
> optionally, a few rule tweaks based on what you actually run. This works
> best in auto mode \u2014 recon is read-only, so risk is minimal and you won't
> be prompted for every command. Feel free to open another claude in a new
> terminal while I work. Ready to start?"
> options: "Yes, go ahead" \xB7 "No, not now"

If no: stop here.

Then check whether \`autoMode.{environment, allow, soft_deny}\` are
already set \u2014 read ONLY those keys, never the whole file (settings
files often carry secrets in the \`env\` block):
\`\`\`bash
jq '.autoMode | {environment, allow, soft_deny} | with_entries(select(.value))' \\
  ~/.claude/settings.json 2>/dev/null
\`\`\`
If the user already has entries under any of these, show them and ask
via AskUserQuestion whether to **add to them**, **start fresh**, or
**stop here**. Keep any existing \`environment\`, \`allow\`, and
\`soft_deny\` entries for Phase 6's merge. If the existing
environment already carries per-category **Sensitive data \u2014 <category>**
entries or the sensitive-content provenance bullet, a previous run
mapped audiences: in Phase 6b, offer to tweak that existing mapping
(diff today's recon findings against it) rather than starting over.

Separately, check the user's \`permissions.allow\` (the regular
allowlist, not auto-mode's) for over-broad rules:
\`\`\`bash
jq -r '.permissions.allow // [] | .[]' ~/.claude/settings.json 2>/dev/null
\`\`\`
Flag any entry that's an interpreter/shell/wrapper prefix \u2014 e.g.
\`Bash(python3:*)\`, \`Bash(node:*)\`, \`Bash(bash:*)\`,
\`Bash(sh:*)\`, \`Bash(env:*)\`, \`Bash(sudo:*)\`,
\`Bash(npx:*)\`, \`Bash(npm run *)\` \u2014 or a pure wildcard
(\`Bash(*)\`, \`Bash(**)\`). These would let any command through
the named interpreter, so auto mode strips them at runtime (the
canonical list is \`DANGEROUS_BASH_PATTERNS\` in
\`dangerousPatterns.ts\`; when unsure, check against that). If you
find any, tell the user and offer via AskUserQuestion to **remove them
all**, **pick which to remove**, or **leave them** (they still apply
outside auto mode). If the user picks remove, write that update to
\`~/.claude/settings.json\` in Phase 6 alongside the others.

## Phase 1: Posture + scan scope

Before asking, do a quick (~1s) pre-check to guess posture:
- \`git remote -v\` \u2014 enterprise host or \`github.com/<org-name>\`
  (not a personal username) \u2192 lean enterprise;
  \`github.com/<personal-username>\` or no remote \u2192 lean
  personal/hobby; public remote with a LICENSE/CONTRIBUTING \u2192 lean
  open-source
- Presence of \`.github/CODEOWNERS\`, CI config, k8s/terraform dirs,
  or a CLAUDE.md \u2192 nudges enterprise
- ${e}

Then list the best-guess option first and mark it with "(looks like
this one)" in its description. Don't block on this \u2014 if the check is
inconclusive, just ask without a recommendation.

One AskUserQuestion call with three questions:

> Q1: "How would you describe the code you work on with Claude?"
> - Personal / hobby projects
> - Open-source (public repos \u2014 pushes publish)
> - Work / enterprise (private repos, sensitive data)
> - Mixed \u2014 depends on the project
>
> Q2: "Set this up for all your projects, or just this one?"
> - All projects (recommended \u2014 works everywhere, re-run once)
> - Just this project (adds to your all-projects setup \u2014 doesn't replace it)
>
> Q3: "Want me to look beyond this repo? I can check your shell history
> (may help if you do a lot of work outside Claude, and only if your
> shell keeps a history file \u2014 some managed environments don't persist
> one) and other repos under ~ too. Only applies if you picked 'all
> projects' above."
> - Yes, both
> - Just shell history
> - Just other repos
> - No, just here

Keep Q1 for Phase 3's **Repository visibility** bullet. Don't reduce
recon depth based on it \u2014 even "hobby" projects sometimes touch sensitive
stuff the user isn't aware of, and people often pick the wrong option.
Treat it as a hint for phrasing, not a gate on what to look for.

Q2 decides where the result gets written (Phase 6) and scopes the
recon: "all projects" means auto mode works consistently wherever you
start it; "just this project" is for when this repo's trust boundaries
differ from your other work (e.g., a client project). Q3 gates steps 3
and 4 below.

If Q2 is "just this project": scope everything to the cwd \u2014 step 4
reads only this project's transcripts. The directory is
\`~/.claude/projects/"$(pwd | sed 's|[^a-zA-Z0-9]|-|g')"\` exactly
(don't glob \u2014 \`myapp\` would also match \`myapp-v2\` since
both \`/\` and \`-\` flatten to \`-\`); only for a cwd longer
than 200 chars does it get a truncated+hash suffix, and only then is
a prefix match needed. Step 3 dispatches to the cwd repo only, and
step 6's sibling-repo check is skipped.

## Phase 2: Recon

Run these in order \u2014 earlier ones are higher signal. If a step errors, try
another way to get the same info (a different flag or tool) rather than
skipping \u2014 but check repo size first (\`git ls-files | wc -l\`) before
running anything that could take long on tens of thousands of files. If a
step finds nothing, move on.

Not every environment has every tool or stack below \u2014 some users have no
k8s, no cloud buckets, no CI, no monorepo. Each step is "if present,
use it; if not, move on"; never assume a particular stack exists. And
not every environment has every tool (\`git\`, \`gh\`, \`rg\`,
\`jq\`). If one isn't available, improvise an equivalent \u2014 \`find\` /
\`grep\` for \`rg\`, read \`.git/config\` for \`git remote -v\`, a
small \`python\` one-liner for \`jq\`, \`find . -type f | wc -l\` for
the repo-size check if there's no git. The goal is the information, not the
specific command.

Only pull out **names** (hosts, buckets, namespaces, registry hostnames, CLI
names); never print surrounding file content. Every \`rg\` in this phase
should emit a single name via an \`-r '$1'\` capture, never raw command
or line text \u2014 if a pattern doesn't have a capture group, it's too broad.

**1. CLAUDE.md files** \u2014 usually the single richest source. Read
\`./CLAUDE.md\` and \`~/.claude/CLAUDE.md\` (if they exist) and pull out
any internal services, sensitive paths, buckets, registries, or domains they
already name. Do the same for \`.claude/skills/**/SKILL.md\`,
\`.claude/rules/*.md\`, and \`.claude/agents/*.md\` \u2014 these describe
what the user has Claude do here, so they're strong signal for trusted
operations and targets. Also skim \`README.md\` (usually names the stack
in its first paragraph) and \`.env.example\` / \`.env.sample\`
(service hostnames without the secrets).

**2. Repo context.** Remotes and visibility:
\`\`\`bash
git remote -v
gh repo view --json visibility,nameWithOwner 2>/dev/null
\`\`\`
If \`gh\` isn't available, infer visibility from the remote hostname
(a well-known public host like github.com vs an enterprise host); if
still unclear, ask. Protected branches: large orgs often use rulesets
rather than classic branch protection, so lean on CONTRIBUTING.md /
CLAUDE.md first; if using \`gh\`, try \`gh ruleset list -R {o}/{r}\`
and
\`gh api 'repos/{owner}/{repo}/branches?protected=true&per_page=100' --jq '.[].name'\`.
Also skim \`.gitignore\` for patterns that look sensitive \u2014 paths
deliberately excluded from commits are often the sensitive ones.

**3. Dispatch Explore subagents now** \u2014 via the **${"Agent"}** tool with
\`subagent_type: 'Explore'\`. These run in the background while you
do steps 4\u20136. Pass what you've filled so far so they fill gaps rather
than re-finding the same things. If EVERY in-scope repo (the cwd, plus
any opted-in repos from Q3) is under ~10k files, one combined agent
covering all categories is enough. If ANY in-scope repo is \u226510k files,
run several agents in parallel \u2014 one per category: registries +
domains, bucket prefixes, k8s/prod namespaces, IaC/terraform dirs,
policy-as-code / allowlists, data-classification / retention docs \u2014
and skip step 5's \`rg\` scans. Each agent's brief:

> "I'm filling out the auto-mode environment for this user. Here's what I
> have so far: [filled bullets]. In this repo, find ONLY the names of:
> [category/ies]. Check top-level config files and CLAUDE.md files.
> Return at most ~15 names per category; prefer patterns (e.g.,
> \`*-prod\`) over full enumeration. Names only, no file contents.
> If other org repos are relevant (from step 6), you can read their
> top-level files via \`gh api repos/{o}/{r}/contents/<path>\`
> without cloning. If multiple repos are in scope (the cwd plus any
> from Q3's opt-in or step 6), pick the one most likely to have this
> category \u2014 e.g., a \`terraform-config\` or \`infra-*\` repo for
> IaC scopes, an \`*-manifests\` repo for k8s namespaces, the main
> repo for domains/registries. Don't search every repo for every
> category."

If the user opted into "other repos under ~" in Phase 1,
\`find ~ -maxdepth 3 -name .git -type d -not -path '*/\\.*/*'\`,
skip dot-tool dirs
(\`.oh-my-zsh|.vim|.tmux|.nvm|.rustup|.cargo|.local|.cache|.npm|.gem\`),
keep only dirs whose \`git remote -v\` shows an org you've already
seen in step 2 or 6, and add those repo paths to the Explore briefs.
If Q3 was "just here" but you find other checked-out repos nearby
that look relevant (e.g., a terraform/infra/config repo), ask once
more via AskUserQuestion whether to include them \u2014 name the repos
you found so the user can decide.

**4. Recent usage** \u2014 useful especially for org-specific CLIs and as a
cross-check on what you actually touch; may be thin if you've only run
a few sessions. Build one command stream from the 50 most-recent
session transcripts (each jsonl line's Bash commands live at
\`.message.content[]? | select(.type=="tool_use" and .name=="Bash") | .input.command | split("\\n")[0]\`),
and \u2014 if the user opted into shell history in Phase 1 \u2014 append
\`~/.zsh_history\` / \`~/.bash_history\` (strip zsh's
EXTENDED_HISTORY prefix with \`sed 's/^: [0-9]*:[0-9]*;//'\` first).
History files can carry inline secrets; the \`-r '$1'\` name-only
capture is what makes this safe \u2014 don't widen the patterns.

Run each pattern as its own pass over the stream so capture groups stay
unambiguous:
\`\`\`bash
# hosts (userinfo-stripped)
\u2026 | rg -o -r '$1' 'https?://(?:[^@/\\s"]*@)?([a-zA-Z0-9.-]+)' | sort -u | head -20
# buckets
\u2026 | rg -o -r '$1' '(?:s3|gs)://([a-z0-9][a-z0-9._-]*)' | sort -u | head -20
# k8s namespaces (letter-start, 3+ chars)
\u2026 | rg -o -r '$1' -e '-n\\s+([a-z][a-z0-9-]{2,})' | sort -u | head -20
\`\`\`
Then drop noise
(\`^(127\\.0\\.0\\.1|localhost|github\\.com|jsdelivr|unpkg|example\\.com)$\`)
and ignore any single-occurrence hit that exactly matches one of this
skill's own search patterns. Keep \`-r '$1'\` BEFORE the pattern as
written above \u2014 if the pattern is ever passed after \`--\`, a trailing
\`-r '$1'\` becomes a file path and rg prints raw match lines instead
of captures. If the namespace pass finds nothing but the CLI pass shows
cluster-prefix wrapper commands, the wrapper likely sets the namespace
implicitly \u2014 ask the user rather than assuming none exist.

For org-specific CLIs, from the same stream: strip leading
\`sudo \` / \`timeout N \`, take the first word restricted to
\`^[a-z][a-z0-9_-]{1,20}$\`, and drop standard tools:
\`\`\`bash
\u2026 | sed -E 's/^(sudo |timeout [0-9]+[smh]? )+//' | \\
  rg -o -r '$1' '^([a-z][a-z0-9_-]{1,20})\\b' | \\
  rg -vx 'ls|cd|cat|rg|grep|find|git|gh|python[0-9.]*|node|bun|npm|yarn|pnpm|pip[0-9]*|cargo|go|make|just|docker|curl|wget|echo|printf|sed|awk|tr|cut|sort|uniq|xargs|jq|tee|head|tail|wc|which|date|diff|touch|ln|chmod|mkdir|cp|mv|rm|ps|kill|pgrep|pkill|sleep|stat|env|set|export|unset|read|source|command|ssh|scp|tar|zip|unzip|vim|nano|less|more|man|tmux|sudo|bash|sh|zsh|if|then|else|elif|fi|for|while|until|do|done|case|esac|function|return|exit|true|false' | \\
  sort | uniq -c | sort -rn | head -20
\`\`\`
Note the ones that recur (\u22655) as internal tooling the user invokes
routinely \u2014 but in Phase 3, phrase the bullet so auto mode knows which
subcommands are read-only vs potentially destructive (e.g., \`<cli> status\`
is routine; \`<cli> delete\` / \`<cli> launch\` may warrant care).

Also mine recent auto-mode denials \u2014 they mark exactly where
customisation pays off. A classifier denial leaves a stable marker in
the session transcripts:
\`\`\`bash
rg -oI -r '$1' 'denied by the Claude Code auto mode classifier\\. Reason: ([^".]{1,60})' \\
  ~/.claude/projects -g '*.jsonl' 2>/dev/null | sort | uniq -c | sort -rn | head -10
\`\`\`
The captured clause usually names the rule; print the recurring reasons
(count + clause only \u2014 never the blocked commands) and feed them into
Phase 3b's carve-out suggestions.

**5. Local scans** \u2014 only when every in-scope repo is under the
~10k-file size gate (otherwise the Explore agents cover this). Config-file extraction, hostnames
only, never whole lines (so auth tokens or userinfo can't leak into the
transcript). Use \`rg -g\` glob patterns, not shell globs, so zsh
can't abort on no-match; \`-r '$1'\` keeps only the captured host; the
trailing denylist drops well-known public registries:
\`\`\`bash
NOISE='^(docker\\.io|ghcr\\.io|registry\\.npmjs\\.org|pypi\\.org|mcr\\.microsoft\\.com|nvcr\\.io|gcr\\.io|public\\.ecr\\.aws|lscr\\.io|quay\\.io|registry-1\\.docker\\.io|127\\.0\\.0\\.1|localhost)$'
# registry / index hosts (.npmrc registry=, pip.conf/pyproject index-url=)
rg -oIN --no-heading --max-depth 3 -r '$1' -g .npmrc -g pip.conf -g pyproject.toml \\
  -e '(?:registry|index-url)\\s*=\\s*https?://(?:[^@/\\s"]*@)?([^/\\s":]+)' 2>/dev/null | \\
  rg -v "$NOISE" | sort -u | head -10
# container image registries (FROM host.tld/image\u2026)
rg -oIN --no-heading --max-depth 3 -r '$1' -g 'Dockerfile*' -g 'docker-compose*.yml' \\
  -e 'FROM\\s+(?:[^@/\\s]*@)?([a-z0-9.-]+\\.[a-z]+)/' 2>/dev/null | \\
  rg -v "$NOISE" | sort -u | head -10
# bucket prefixes anywhere in config
rg -oIN --no-heading --max-depth 3 -r '$1' -g '*.toml' -g '*.yaml' -g '*.yml' -g '*.json' -g '*.cfg' \\
  -e '(?:s3|gs)://([a-z0-9][a-z0-9._-]*)' 2>/dev/null | sort -u | head -10
\`\`\`
Prefer buckets seen in step 4 (what the user actually touches); use
step-5 and Explore-agent bucket hits mainly to confirm a safe wildcard
prefix.

Also under the size gate: **CI config**
(\`.github/workflows/*.yml\`, \`.gitlab-ci.yml\`, \`.circleci/\`,
\`buildkite/\`) \u2014 extract names only: deploy target hosts, container
registries pushed to, and the NAMES of secrets referenced (e.g.,
\`secrets.DEPLOY_KEY\` \u2014 the name tells you a deploy key exists, not
its value). **Routine commands** \u2014 \`Makefile\` / \`justfile\` /
\`package.json\` scripts; named targets are the user's everyday
commands, note them alongside org-specific CLIs. **Secrets manager** \u2014
if config or transcripts reference \`VAULT_ADDR\`, \`SOPS_\`,
\`op read\` (1Password), \`aws secretsmanager\`,
\`gcloud secrets\`, or similar, note which manager is in use so
"reading from vault" reads as routine, not exfil. Ignore
single-occurrence hits that exactly match one of this skill's own
search patterns. Lightweight filename scan with a depth cap:
\`\`\`bash
rg --files --max-depth 4 -g '!.git' -g '!node_modules' | \\
  rg -i 'terraform|\\.tf$|k8s|kubernetes|helm|prod|iam|rbac|secret|credential|pii|\\.env' | head -40
\`\`\`

**6. Cross-cutting.** Sibling repos \u2014 skip if \`gh\` isn't available;
list the org's repos grouped by visibility and cross-reference with the
repos seen in step 4's transcript mining:
\`\`\`bash
gh repo list <org> --limit 100 --json name,visibility,pushedAt \\
  --jq 'sort_by(.pushedAt)|reverse|.[0:50]|group_by(.visibility)|map({(.[0].visibility): [.[].name]})' 2>/dev/null
\`\`\`
In Phase 3's **Repository visibility** bullet: list PUBLIC repos
explicitly (any push there is publishing); name the most-active PRIVATE
repos as the ones most likely confidential and worth protecting. For
the handful of most-active repos that aren't checked out locally, pull
their top-level context without cloning:
\`gh api repos/{o}/{r}/contents/CLAUDE.md --jq .content | base64 -d 2>/dev/null\`
(and README.md if no CLAUDE.md). Feed what you find into the same
slots \u2014 these often name infra/terraform/config that the main repo
doesn't.
**Policy & constants files** \u2014 if recon turns up files that enumerate
trusted resources (a constants module listing buckets, a
\`trusted_domains\` list, Cedar policy files, sandbox/egress
allowlists, or network-policy configs), read them; only use them if
they look org-wide rather than narrow to one sub-project. **Data
classification** \u2014 look for database schema files,
data-classification or retention-policy docs (often under \`docs/\`,
\`data/\`, \`schemas/\`, or in CLAUDE.md), and table/column naming
conventions that signal sensitivity (\`_pii\`, \`_encrypted\`,
\`_retention_\`).

**7. Collect the Explore results** from step 3 and merge them with what
steps 4\u20136 found.

## Phase 3: Synthesize the full proposal

Write the complete proposed environment as ONE fenced markdown block in the
chat. Render it as two sub-headed sections:

- **### Org-wide** \u2014 things that apply to anyone at this org
- **### User-specific** \u2014 things particular to this user

Within each section, keep the blank-line grouping (Context, then Trust,
then Sensitivity) so the user can scan each separately. Each bullet is
a bold label, a colon, then the concrete names you found. Include every
label below; where recon found nothing, say so briefly rather than
omitting the line.

Decide per-repo vs global phrasing from what you observed, not just the
posture answer: if they said "hobby" but you found prod namespaces and PII
buckets, phrase it as enterprise. If the Phase 1 answer conflicts with what
recon found (e.g., "personal" but private corp remote + internal
registries), say so in the proposal and go with what recon shows. If
evidence differs across repos (e.g., one public OSS repo and one private
work repo), phrase trust/sensitivity bullets per-repo or per-org rather
than globally.

An individual resource can sit in both a trust slot (safe
destination, not exfiltration) and a sensitivity slot (contents are
PII) \u2014 list it in both if so. A wildcard can't: only wildcard within a
single compartment (\`acme-pii-*\`, \`acme-public-*\`,
\`acme-internal-*\`), and put the pattern in the slot that matches
that compartment. If the org uses one prefix for everything, enumerate
instead of wildcarding. Only wildcard on a prefix that recon shows is
unambiguously org-specific (never something generic like
\`prod-*\` that could match external resources). Same applies to
domains (\`*.acme.internal\`), namespaces, and sensitivity-slot
patterns. Up to ~50 items, list them; beyond that, wildcard on the
safe common prefix.

When you cite a file as a source-of-truth (e.g., "allowlist is in
config/egress.json"), follow with the inlined names (up to ~15, or a
safe wildcard) \u2014 the classifier reads this text, not files. If there
are more, note the count, give the pattern, and cite the file for the
full list \u2014 e.g., "39 PII namespaces: \`ns-a\`, \`ns-b\`,
\`*-pii-*\`, \u2026 (full list in <file>)". For sandbox/egress allowlists
specifically, ask the user before adopting them wholesale \u2014 they may
be stricter than what the user wants for their own interactive work.
Listing trusted buckets or domains from those configs is fine.

### Org-wide

Context:
- **Organization** \u2014 the org name
- **Cloud provider(s)** \u2014 AWS / GCP / Azure / \u2026
- **Repository visibility** \u2014 which repos/orgs are public (any push is publishing) vs private; shaped by the Phase 1 answer
- **Internal sharing / snippet hosting** \u2014 approved alternatives to public gists/pastebins, if any (check CLAUDE.md/README for approved code/doc link-sharing hosts; common patterns: internal gitiles/sourcegraph, an internal pastebin, or a docs wiki)
- **Secrets management** \u2014 where credentials come from (vault, SOPS, cloud secrets manager, env files)
- **Default / protected branches** \u2014 what \`push origin main\` means here (protected & requires review? direct-push OK? triggers deploy?)
- **CI/CD deploy targets** \u2014 where builds push/deploy to
- **Network posture** \u2014 VPN-only hosts, corporate proxy, or open internet

Trust (filling these in whitelists \u2014 empty means nothing is trusted):
- **Source control**
- **Trusted internal domains**
- **Trusted cloud buckets**
- **Key internal services**
- **Internal package registry**

Sensitivity (filling these in sharpens the default heuristic):
- **Sensitive data locations & audiences** \u2014 exact sensitive files, stores, tables, paths, IDs, codenames, routing markers, packages, reports, or services when known, plus who may receive each category and who may not. Do not invent broad audiences: if unclear, write that the audience needs confirmation
- **Data retention / declassification** \u2014 database schemas or tables holding sensitive data; retention/deletion policies if documented
- **Sensitive remote targets**
- **Protected deployment namespaces / environments** \u2014 if any were found
- **Protected IaC scopes**

### User-specific

- **Primary use of Claude Code** \u2014 e.g. software development, ML research, infra automation
- **Trusted repo** \u2014 this user's checkouts and their remotes
- **Org-specific CLIs** \u2014 internal command-line tools this user actually invokes; note any subcommands that can delete or launch resources
- Any "routine under <user>/ prefix" qualifiers that apply to this user specifically

Beyond these, add any other category you found clear evidence for \u2014 the
environment section is freeform, so if recon surfaced something useful (a
shared artifact-store naming convention, a job-priority or quota scheme, a
specific egress boundary), propose it as its own bullet.

## Phase 3b: Optional rule customisations

Still inside the SAME fenced block, right after the User-specific section,
add a one-line preface and then three optional sub-sections. The preface
goes in the fence as a plain line (not a bullet):

> The environment section above is the important one \u2014 many of auto
> mode's rules read it to decide what counts as trusted. The default
> rules already have good coverage; the suggestions below are optional
> tweaks.

### Suggested allow carve-outs (optional)

From step 4's frequent commands, identify 0\u20135 routine actions that would
hit a default soft block and aren't already covered by the default allow
rules. Don't dump \`claude auto-mode defaults\` into context \u2014 it's
~45 KB of JSON. Pipe it: enumerate labels with
\`claude auto-mode defaults | jq -r '.soft_deny[] | split(":")[0]'\`
(and \`.allow[]\` likewise); when a specific rule's wording matters,
pull just that rule with
\`\u2026 | jq -r '.soft_deny[] | select(startswith("<Label>"))'\`. For
each, write a prose allow rule in the \`Label: description\`
convention, scoped as tightly as recon supports (a specific repo / host /
pattern, not "all git pushes"), and note the evidence in a trailing em-dash
("\u2014 you ran this N\xD7 recently"). When transcript evidence is thin (fewer
than ~5 occurrences), an explicit CLAUDE.md statement naming the
operation is acceptable evidence \u2014 cite the statement instead of a
count. Only propose what recon actually supports.
If nothing fits, still render this heading, and under it write: "None
suggested \u2014 defaults look like they cover your usage. To add your own:
set \`autoMode.allow\` to \`["$defaults", "Your Label: description"]\`
in \`~/.claude/settings.json\`." Common
candidates: routine writes to your own cloud-storage prefix, org
package-registry publishes, running a specific org CLI's non-destructive
subcommands, pushes to other pre-existing branches in specific repos.

### Suggested extra soft blocks (optional)

From recon, 0\u20133 extra soft-block rules for sharp edges you found \u2014 e.g.,
destructive subcommands of org CLIs from step 4, or writes to a specific
prod namespace recon turned up. Same \`Label: description\`
convention. Worst case here is extra friction, so be willing to suggest;
but don't invent \u2014 only what recon surfaced. If nothing fits, still render
this heading, and under it write: "None suggested. To add your own: set
\`autoMode.soft_deny\` to \`["$defaults", "Your Label: description"]\`
in \`~/.claude/settings.json\`."

### Intent lines for your CLAUDE.md (optional, paste yourself)

2\u20134 lines the user can paste into their CLAUDE.md
(\`~/.claude/CLAUDE.md\`, or \`./CLAUDE.local.md\` if Q2 was "just
this project") for patterns
too fuzzy for a rule. The classifier reads CLAUDE.md but only counts it as
intent when it names the specific operation AND target \u2014 so phrase each
line concretely: "I routinely push to my own feature branches in
github.com/<org>/*", "Deleting jobs under <myuser>/ is routine cleanup",
not "be autonomous with git". Don't write these to any file \u2014 Phase 6
prints them for the user to paste. If nothing fits, still render this
heading, and under it write: "None suggested. To add your own: paste a
line like \`I routinely <op> <specific target>\` into
your CLAUDE.md (same file as above)."

## Phase 4: One approval

A single AskUserQuestion:

> header: "Auto-mode setup"
> question: "Here's what I found \u2014 environment section plus any suggested
> rule tweaks. Save to your settings? To change specific entries first,
> pick 'Let me adjust a few' or type in this panel's free-text box."
> options: "Looks good \u2014 save it" \xB7 "Let me adjust a few" \xB7 "I'll write it myself"

## Phase 5: Adjust

If **Let me adjust a few**: ask which entries to change (free text, or
multiSelect over the slot labels plus the two rule groups \u2014 "Allow
carve-outs" and "Extra soft blocks" \u2014 in groups of \u22644), revise just
those, re-show the full block, and re-ask Phase 4.

If **I'll write it myself**: print the skeleton (every environment label
above with an empty value, plus defaults-only \`allow: ["$defaults"]\` and
\`soft_deny: ["$defaults"]\` arrays) and explain where to put it
(Phase 6's file/keys), then stop.

## Phase 6: Write

Write the accepted bullets to \`~/.claude/settings.json\` (user-level,
every project) \u2014 or, if Q2 was "just this project", to
\`.claude/settings.local.json\` (gitignored, project-scoped, still a
trusted source) instead. Merge, don't overwrite \u2014
preserve every other key. Never inline the harvested values in a
shell command (they came from untrusted files) and never Read the
whole settings file into the transcript (the \`env\` block can
carry secrets). Write the new array to a temp file
first (create it with \`mktemp\` \u2014 never a fixed \`/tmp\` name,
which another local user on a shared host could pre-create or
symlink) and merge via
\`f=$(mktemp) && out=$(mktemp) && \u2026 && { [ -f file ] || { mkdir -p "$(dirname file)" && echo '{}' >file; }; } && jq --slurpfile v "$f" '.autoMode.environment = $v[0]' <file >"$out" && mv "$out" file && rm -f "$f"\`.
If Phase 0 found existing \`environment\` entries and the user
picked "add to them", include those entries in the array you write
(after the matching section heading, or at the end if they don't
match a slot). Write both sections with the sub-heading
strings as separator entries (this sets up for a future where org-wide
comes from policy settings instead):

\`\`\`json
{
  "autoMode": {
    "environment": [
      "### Org-wide",
      "**Organization**: Acme Corp",
      "**Source control**: github.com/acme (all repos)",
      "...",
      "### User-specific",
      "**Primary use of Claude Code**: backend development",
      "**Trusted repo**: github.com/acme/widgets and its remotes",
      "..."
    ]
  }
}
\`\`\`

Do NOT include \`"$defaults"\`. Instead, for any slot the user skipped
or left empty, write that slot's shipped default verbatim from this list
(existing per-category **Sensitive data \u2014 <category>** entries fulfil
the **Sensitive data locations & audiences** slot \u2014 never write that
slot's default alongside them):

${UOf()}

After the structured slots, append any freeform bullets from Phase 3 \u2014 the
environment section is read as prose by the classifier, so anything that
helps it understand the user's setup belongs here.

Then, if the user accepted any **allow carve-outs** or **extra soft
blocks** from Phase 3b, write those to the same file under
\`autoMode.allow\` and \`autoMode.soft_deny\`:

- Each array MUST start with the literal entry \`"$defaults"\`, then
  the accepted rules \u2014 a non-empty array without \`"$defaults"\`
  REPLACES the shipped defaults, which is not what we want here. (This
  is unlike \`environment\`, which deliberately doesn't use
  \`"$defaults"\`.)
- If Phase 0 found the user already has entries for that key, merge:
  keep their existing entries (including \`"$defaults"\` if present),
  append the newly accepted rules after.
- If the user accepted nothing for a key, don't write that key at all.
- Same safety rules as the environment write above: merge don't
  overwrite other keys; never inline harvested values in a shell
  command; never Read the whole settings file. Write the array to a
  \`mktemp\` file and merge via
  \`f=$(mktemp) && \u2026 && jq --slurpfile v "$f" '.autoMode.allow = $v[0]' \u2026\`
  (same temp-file caution as above).
- Drop the trailing "\u2014 you ran this N\xD7 recently" evidence from each
  rule before writing \u2014 that was for the user's review, not for the
  classifier.

\`\`\`json
{
  "autoMode": {
    "allow": [
      "$defaults",
      "Push to own feature branches: git push to any non-default branch in github.com/acme/*"
    ],
    "soft_deny": [
      "$defaults",
      "Acme CLI delete: any \`acmectl delete\` or \`acmectl rm\` invocation"
    ]
  }
}
\`\`\`

Then print the **CLAUDE.md intent lines** from Phase 3b in a fenced
block, prefixed with: "Optionally, paste these into
\`~/.claude/CLAUDE.md\` \u2014 or \`./CLAUDE.local.md\` for 'just this
project' \u2014 (I haven't written them; your call):". Do
NOT write them to any file.

## Phase 6b: Optional extra \u2014 granular provenance rules

The main work is done at this point: the setup that improves the user's
safety is saved, and the user can stop here. This phase and Phase 7 are
both optional extras \u2014 declining must read as a completely natural way
to finish, not as abandoning the flow. Always make this offer (don't
gate it on recon findings), and when recon DID surface sensitive data,
name the concrete findings in the
question \u2014 pick the ~5 most significant (files, directories, tables,
buckets, services, projects, customers, codenames, ticket IDs, routing
markers, packages, reports, endpoints \u2014 names only, never file contents)
and add "and N more" if there are more. If recon found nothing
sensitive, adapt the question instead: offer to map who may receive any
sensitive data the user works with \u2014 they may know sources recon can't
see \u2014 and who must not, with no findings list or parenthetical. If
they accept with nothing found, ask them to name their sensitive
sources in one free-text reply first; those become the categories for
the per-category asks below:

> header: "Setup saved \u2014 go a step further?"
> question: "That's the main work done \u2014 your setup is saved, and you
> can stop here. If you'd like, we can go a step further with more
> granular provenance rules: I'd map who
> may receive the sensitive data recon found ([the names \u2014 e.g.
> \`billing.customers\`, \`reports/q3/\`, and 2 more]) and who must
> not. Takes a couple of extra minutes."
> options: "Go further" \xB7 "No thanks"

If **No thanks**: go to Phase 7.

If **Go further** \u2014 and Phase 0 found a previous run's per-category
entries, remember its directive: diff today's findings against the
saved mapping and ask only about what's new or changed, rather than
re-asking everything. Ask per category, as tabs \u2014 one AskUserQuestion call
renders up to 4 questions as tabs, so batch the finding categories into
calls of at most 4 until every category is covered, keeping the total
number of calls minimal. Each tab (at most 4 options; the tool adds its
own free-text "Other"):

> header: "<short finding name>"
> question: "Who may receive <finding/category>, and who must not?"
> options: recon-suggested audiences first \u2014 reuse vocabulary from the
> user's own docs and from audiences already named on other
> categories; audiences are often systems or places as well as people
> (e.g. "code running in PII-privileged namespaces", a policy-tagged
> store, a team) \u2014 then "Just me" \xB7 "Skip \u2014 leave unconfirmed"

A free-text "Other" answer can carry both sides ("team X may; never
customer-facing"). An option click records the may-receive side; who
must not defaults to everyone not named, unless the user says
otherwise. A skipped category, or one whose audience stays unclear, is
recorded as "audience needs confirmation" \u2014 never invent broad
audiences to fill the gap.

Then do a small read-only follow-up recon (names only, never file
contents) to pin exact handles for what the user named, so the
audiences attach to things the classifier can recognise later in
messages, reports, filenames, archives, or uploads.
Prefer exact files, objects, tables, paths, services, IDs, and stable
labels; otherwise the narrowest directory, service, or category the
evidence supports.

Then show the addendum in one small fenced block: one entry per
category, each a bullet of the form
**Sensitive data \u2014 <category>**: <exact handles; who may receive;
who must not> \u2014 these entries REPLACE the canonical **Sensitive data
locations & audiences** slot entry (don't also write that slot's
shipped default: the per-category entries are its filled-in form).
Plus this freeform bullet (written only when audiences were actually
mapped \u2014 it's meaningless otherwise):

> **Sensitive-content provenance**: content copied, summarized, exported,
> packaged, pasted, uploaded, or reported from a sensitive source keeps
> that source's audience limits unless the user explicitly says otherwise.

Ask one mini-approval:

> header: "Save provenance additions"
> question: "Update the sensitive-data entry and add the provenance rule
> in your saved environment?"
> options: "Save additions" \xB7 "Discard"

If **Save additions**: merge into the same file and key as Phase 6, with
the same safety rules (mktemp + jq merge; never inline harvested values
in a shell command; never read the whole settings file). This is a
second merge into a file you've already written, so re-read the CURRENT
\`autoMode.environment\` array first (only that key), replace the
**Sensitive data locations & audiences** entry with the per-category
entries (the canonical label disappears \u2014 don't re-add its shipped
default); on a re-run where per-category entries already exist, update
those in place (add new categories, revise changed ones, keep the
rest). Append the provenance bullet (if it was part of the saved
additions and isn't already present) at the end of the array, and write
the result back \u2014 change nothing else in the array or the file.

If **Discard**: write nothing; go to Phase 7.

## Phase 7: How it fits together

Tell the user: "Last thing \u2014 a quick optional read on how customisation
works:"

Then emit ONE personalised worked example. Pick one command from step 4
that (a) the user ran \u22655\xD7 and (b) matches a default soft block. Prefer
one you just wrote an allow rule for; if Phase 6b mapped audiences,
prefer a command touching a mapped source, so the example shows the
audience limits in action. If no real command fits, fall back
to \`git push origin main\` vs the "Git Push to Default Branch"
soft block. Render it as a fenced block shaped like:

\`\`\`
  You ran  <command>  <N>\xD7 recently.
  By default that's a soft block (<Rule Label>). Three ways past it:

    say so in chat   "go ahead and <verb>"          \u2192 clears this turn
    allow rule       autoMode.allow =
                     ["$defaults", "<Label>: \u2026"]     \u2192 never asks again
                     (I added one above \u2191, if so)
    CLAUDE.md        "<specific intent line>"       \u2192 classifier reads
                                                       as standing intent

  Most auto-mode rules are soft blocks like this \u2014 saying what you want
  clears them. Many of them read your environment section to decide
  what counts as "inside" vs "outside" your trust boundary \u2014 that's why
  filling it in is the main thing.

  (Hard blocks are different \u2014 e.g. "Data Exfiltration", sensitive data
  crossing your trust boundary. Intent never clears a hard block; add
  your own as autoMode.hard_deny = ["$defaults", "Label: \u2026"] \u2014 the
  "$defaults" entry keeps the shipped hard rules.)

  \`claude auto-mode defaults\` shows every rule;
  \`claude auto-mode config\` shows your effective setup.
\`\`\`

Finish with one or two sentences: what you wrote and where; that
\`/auto-mode-setup\` re-runs this anytime (worth re-running whenever
the environment changes or defaults are updated \u2014 and, if the user
declined Phase 6b, how to map sensitive-data audiences later); and that
\`claude auto-mode config\` shows the effective result and
\`claude auto-mode critique\` reviews it for clarity and gaps.

Then close with ONE AskUserQuestion that carries the key facts in its
question text \u2014 users often don't read terminal output, so the panel IS
the copy that gets read; the worked example above is supporting depth:

> header: "Before you go"
> question: "Four things worth knowing: (1) your stated intent, typed
> in chat, can clear a soft block \u2014 a block isn't a failure; (2) hard
> denies are never cleared by intent \u2014 if you never want intent to
> clear something, that's the section to customise; (3) the soft
> denies, hard denies and environment all live in \`settings.json\`
> (start custom rule arrays with "$defaults" to keep the shipped
> rules) \u2014 trust slots relax auto mode, sensitivity slots tighten it;
> (4)
> re-run \`/auto-mode-setup\` anytime to revisit any of this."
> options: "Got it" \xB7 "Walk me through them"

If **Walk me through them**: a line or two of plain language per fact,
then finish \u2014 one gentle pass, not a quiz. Keep the mechanics accurate:
a soft block has no permission prompt \u2014 the user clears it by typing
what they want in chat; and when showing how to add a hard deny, show
the sentinel form \`"hard_deny": ["$defaults", "Your Label: \u2026"]\` \u2014
without \`"$defaults"\` the array replaces the shipped hard rules.
`;
  }
  function cDc() {
    Qc({
      name: "auto-mode-setup",
      requires: {
        workspace: true
      },
      menuDescription: "Set up and customise auto mode \u2014 environment context, plus optional rule tweaks",
      description: "Guided setup and customisation for auto mode \u2014 recon the repo, your CLAUDE.md, and your recent sessions; propose the environment section (trusted repos / domains / buckets / registries / org-specific CLIs and sensitive-data / production / IaC scopes); optionally suggest allow / soft-block rule carve-outs and CLAUDE.md intent lines based on what you actually run; get a single approval from you; then write the result to ~/.claude/settings.json under autoMode.{environment, allow, soft_deny}.",
      userInvocable: true,
      disableModelInvocation: true,
      isEnabled: () => vSt() && getFeatureValue_CACHED_MAY_BE_STALE("tengu_auto_mode_config", {})?.envOnboarding === true,
      async getPromptForCommand(e) {
        let t = getSubscriptionType();
        let n = t === "pro" || t === "max" ? `Claude subscription is ${t} \u2192 lean personal/hobby` : t === "team" || t === "enterprise" ? `Claude subscription is ${t} \u2192 lean enterprise` : "Claude subscription plan unknown \u2014 no signal";
        let r = BOf(n);
        if (e) {
          r += `

## Additional instructions from the user

${e}`;
        }
        return [{
          type: "text",
          text: r
        }];
      }
    });
  }
  var uDc = __lazy(() => {
    $n();
    Sh();
    no();
    jz();
    x_();
  });
  function HOf(e) {
    return `# Batch: Parallel Work Orchestration

You are orchestrating a large, parallelizable change across this codebase.

## User Instruction

${e}

## Phase 1: Research and Plan (Plan Mode)

Call the \`${"EnterPlanMode"}\` tool now to enter plan mode, then:

1. **Understand the scope.** Launch one or more subagents (in the foreground \u2014 you need their results) to deeply research what this instruction touches. Find all the files, patterns, and call sites that need to change. Understand the existing conventions so the migration is consistent.

2. **Decompose into independent units.** Break the work into ${5}\u2013${30} self-contained units. Each unit must:
   - Be independently implementable in an isolated git worktree (no shared state with sibling units)
   - Be mergeable on its own without depending on another unit's PR landing first
   - Be roughly uniform in size (split large units, merge trivial ones)

   Scale the count to the actual work: few files \u2192 closer to ${5}; hundreds of files \u2192 closer to ${30}. Prefer per-directory or per-module slicing over arbitrary file lists.

3. **Determine the e2e test recipe.** Figure out how a worker can verify its change actually works end-to-end \u2014 not just that unit tests pass. Look for:
   - A \`claude-in-chrome\` skill or browser-automation tool (for UI changes: click through the affected flow, screenshot the result)
   - A \`tmux\` or CLI-verifier skill (for CLI changes: launch the app interactively, exercise the changed behavior)
   - A dev-server + curl pattern (for API changes: start the server, hit the affected endpoints)
   - An existing e2e/integration test suite the worker can run

   If you cannot find a concrete e2e path, use the \`${"AskUserQuestion"}\` tool to ask the user how to verify this change end-to-end. Offer 2\u20133 specific options based on what you found (e.g., "Screenshot via chrome extension", "Run \`bun run dev\` and curl the endpoint", "No e2e \u2014 unit tests are sufficient"). Do not skip this \u2014 the workers cannot ask the user themselves.

   Write the recipe as a short, concrete set of steps that a worker can execute autonomously. Include any setup (start a dev server, build first) and the exact command/interaction to verify.

4. **Write the plan.** In your plan file, include:
   - A summary of what you found during research
   - A numbered list of work units \u2014 for each: a short title, the list of files/directories it covers, and a one-line description of the change
   - The e2e test recipe (or "skip e2e because \u2026" if the user chose that)
   - The exact worker instructions you will give each agent (the shared template)

5. Call \`${"ExitPlanMode"}\` to present the plan for approval.

## Phase 2: Spawn Workers (After Plan Approval)

Once the plan is approved, spawn one background agent per work unit using the \`${"Agent"}\` tool. **All agents must use \`isolation: "worktree"\` and \`run_in_background: true\`.** Launch them all in a single message block so they run in parallel.

For each agent, the prompt must be fully self-contained. Include:
- The overall goal (the user's instruction)
- This unit's specific task (title, file list, change description \u2014 copied verbatim from your plan)
- Any codebase conventions you discovered that the worker needs to follow
- The e2e test recipe from your plan (or "skip e2e because \u2026")
- The worker instructions below, copied verbatim:

\`\`\`
${$Of}
\`\`\`

Use \`subagent_type: "general-purpose"\` unless a more specific agent type fits.

## Phase 3: Track Progress

After launching all workers, render an initial status table:

| # | Unit | Status | PR |
|---|------|--------|----|
| 1 | <title> | running | \u2014 |
| 2 | <title> | running | \u2014 |

As background-agent completion notifications arrive, parse the \`PR: <url>\` line from each agent's result and re-render the table with updated status (\`done\` / \`failed\`) and PR links. Keep a brief failure note for any agent that did not produce a PR.

When all agents have reported, render the final table and a one-line summary (e.g., "22/24 units landed as PRs").
`;
  }
  function mDc() {
    Qc({
      name: "batch",
      menuDescription: "Plan a large change; background agents each open a PR",
      description: "Research and plan a large-scale change, then execute it in parallel across 5\u201330 isolated worktree agents that each open a PR.",
      whenToUse: "Use when the user wants to make a sweeping, mechanical change across many files (migrations, refactors, bulk renames) that can be decomposed into independent parallel units.",
      argumentHint: "<instruction>",
      userInvocable: true,
      disableModelInvocation: true,
      async getPromptForCommand(e) {
        let t = e.trim();
        if (!t) {
          return [{
            type: "text",
            text: qOf
          }];
        }
        if (!(await getIsGit())) {
          return [{
            type: "text",
            text: "This is not a git repository. The `/batch` command requires a git repo because it spawns agents in isolated git worktrees and creates PRs from each. Initialize a repo first, or run this from inside an existing one."
          }];
        }
        return [{
          type: "text",
          text: HOf(t)
        }];
      }
    });
  }
  var $Of;
  var qOf = `Provide an instruction describing the batch change you want to make.

Examples:
  /batch migrate from react to vue
  /batch replace all uses of lodash with native equivalents
  /batch add type annotations to all untyped function parameters`;
  var fDc = __lazy(() => {
    Sh();
    cU();
    na();
    x_();
    $Of = `After you finish implementing the change:
1. **Code review** \u2014 Invoke the \`${"Skill"}\` tool with \`skill: "code-review"\` to find correctness bugs (it reports findings; it does not edit code). Fix any findings it surfaces before continuing.
2. **Run unit tests** \u2014 Run the project's test suite (check for package.json scripts, Makefile targets, or common commands like \`npm test\`, \`bun test\`, \`pytest\`, \`go test\`). If tests fail, fix them.
3. **Test end-to-end** \u2014 Follow the e2e test recipe from the coordinator's prompt (below). If the recipe says to skip e2e for this unit, skip it.
4. **Commit and push** \u2014 Commit all changes with a clear message, push the branch, and create a PR with \`gh pr create\`. Use a descriptive title. If \`gh\` is not available or the push fails, note it in your final message.
5. **Report** \u2014 End with a single line: \`PR: <url>\` so the coordinator can track it. If no PR was created, end with \`PR: none \u2014 <reason>\`.`;
  });
  function hDc() {
    Qc({
      name: "claude-in-chrome",
      menuDescription: "Let Claude browse and interact with pages in your Chrome",
      description: "Automates your Chrome browser to interact with web pages - clicking elements, filling forms, capturing screenshots, reading console logs, and navigating sites. Opens pages in new tabs within your existing Chrome session. Requires site-level permissions before executing (configured in the extension).",
      whenToUse: "When the user wants to interact with web pages, automate browser tasks, capture screenshots, read console logs, or perform any browser-based actions. Always invoke BEFORE attempting to use any mcp__claude-in-chrome__* tools.",
      allowedTools: [],
      userInvocable: true,
      isEnabled: () => isClaudeInChromeWiredThisSession(),
      async getPromptForCommand(e) {
        let t = G2o;
        if (e) {
          t += `

## Task

${e}`;
        }
        return [{
          type: "text",
          text: t
        }];
      }
    });
  }
  var gDc = __lazy(() => {
    Qrr();
    Gwe();
    x_();
  });
  function WOf(e, t) {
    switch (e) {
      case "low":
        return NNl;
      case "medium":
        return Gnr(t);
      case "high":
        return LNl(t);
      case "xhigh":
        return UNl(t);
      case "max":
        return BNl(t);
    }
  }
  function GOf(e, t) {
    if (e === "low") {
      return false;
    }
    if (t.options?.isSkillPreload) {
      return false;
    }
    if (!t.options?.tools?.some(n => bl(n, "ReportFindings"))) {
      return false;
    }
    if (gI.CLAUDE_CODE_REPORT_FINDINGS) {
      return true;
    }
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_report_findings_tool", false);
  }
  function bDc(e) {
    let {
      rawFirstToken: t,
      flags: n,
      rest: r
    } = Ecr(e, ["comment", "fix"]);
    let o = n.vZc("comment");
    let s = n.vZc("fix");
    let i = r.split(/\s+/).filter(Boolean);
    let a = i[0] ?? "";
    if (t.toLowerCase() === "ultra") {
      return {
        explicit: undefined,
        target: i.slice(1).join(" "),
        comment: o,
        fix: s,
        unrecognizedLevel: undefined,
        ultraFallback: true
      };
    }
    let l = a.toLowerCase() === "ultra" ? undefined : elt(a);
    if (l !== undefined) {
      return {
        explicit: l,
        target: i.slice(1).join(" "),
        comment: o,
        fix: s,
        unrecognizedLevel: undefined,
        ultraFallback: false
      };
    }
    let c = VOf.test(a);
    return {
      explicit: undefined,
      target: r,
      comment: o,
      fix: s,
      unrecognizedLevel: c ? a : undefined,
      ultraFallback: false
    };
  }
  function zOf() {
    return `Review the current diff for correctness bugs and reuse/simplification/efficiency cleanups at the given effort level (low/medium: fewer, high-confidence findings; high\u2192max: broader coverage, may include uncertain findings${xSt() ? `; ultra: deep multi-agent review in the cloud${qz() ? "" : " (requires claude.ai account access)"}` : ""}). Pass --comment to post findings as inline PR comments, or --fix to apply the findings to the working tree after the review.`;
  }
  function KOf() {
    return `[${xSt() ? `${UC.join("|")}|ultra` : UC.join("|")}] [--fix] [--comment] [<target>]`;
  }
  async function YOf(e, t) {
    let {
      explicit: n,
      target: r,
      comment: o,
      fix: s,
      unrecognizedLevel: i,
      ultraFallback: a
    } = bDc(e);
    let l = a ? "max" : n;
    let c = t.options?.mainLoopModel;
    let u = c ? RJ(c, l ?? getEffortValue(t)) ?? l : l ?? getEffortValue(t);
    let d = u === undefined ? "medium" : Fbe(u);
    let p = GOf(d, t);
    let m = p ? MNl : Wnr;
    let f = JOf(t);
    let h = f ? DNl : "";
    let g = QOf({
      ultraFallback: a,
      fix: s,
      unrecognizedLevel: i,
      level: d,
      context: t
    });
    let y = !a && XOf(d, t);
    if (!t.options?.isSkillPreload) {
      logEvent("tengu_code_review_routed", {
        effort_level: d,
        routed_to_workflow: y,
        uses_report_findings_tool: p,
        has_fix: s,
        has_comment: o,
        has_target: r.length > 0,
        is_ultra_fallback: a,
        publishes_artifact: f
      });
    }
    if (y) {
      let b = r ? `${d} ${r}` : d;
      return [{
        type: "text",
        text: `${g}Run the workflow-backed code review at ${d} effort instead of reviewing inline.

Invoke: ${"Workflow"}({ name: ${De("code-review")}, args: ${De(b)} })

Everything after the level in the args string is passed to the workflow as the review target / instructions. If the user gave additional instructions for this review elsewhere in the conversation (a scope restriction, files to focus on, things to skip), append them to the args string so the workflow honors them.

The workflow runs the same finder angles and verify pass as the inline review, in the background; the verified findings arrive as a task notification. When they arrive, ${p ? `call ${"ReportFindings"} once with {level, findings} from the result payload (most-severe first; empty array if nothing survived). Do not also print the findings as text.` : "present the findings ranked most-severe first (or note that nothing survived verification)."}${o ? yDc : ""}${s ? _Dc : ""}${h}`
      }];
    }
    let _ = r ? `Review target: \`${r}\`

` : "";
    return [{
      type: "text",
      text: `${g}${_}${WOf(d, m)}${o ? yDc : ""}${s ? _Dc : ""}${h}`
    }];
  }
  function JOf(e) {
    return false;
  }
  function XOf(e, t) {
    if (e !== "high" && e !== "xhigh" && e !== "max") {
      return false;
    }
    if (t.options?.isSkillPreload) {
      return false;
    }
    if (!dT()) {
      return false;
    }
    if (t.options?.isNonInteractiveSession) {
      return false;
    }
    if (!t.options?.tools?.some(n => bl(n, "Workflow"))) {
      return false;
    }
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_review_workflow_routing", false);
  }
  function QOf({
    ultraFallback: e,
    fix: t,
    unrecognizedLevel: n,
    level: r,
    context: o
  }) {
    if (e) {
      if (!qz()) {
        if (t) {
          return `(Running a local ${r}-effort review and applying its findings.)

`;
        }
        if (xSt()) {
          if (o.options?.isNonInteractiveSession) {
            let i = lQn();
            if (i) {
              return `(${i} Falling back to a local ${r}-effort review.)

`;
            }
          }
          return `(ultra (cloud review) requires claude.ai account access this session doesn't have \u2014 see https://code.claude.com/docs/en/ultrareview. Falling back to a local ${r}-effort review.)

`;
        }
        return `(ultra (cloud review) isn't available in this environment \u2014 see https://code.claude.com/docs/en/ultrareview. Falling back to a local ${r}-effort review.)

`;
      }
      let s = o.options?.commands?.some(i => i.name === "ultrareview" && isCommandEnabled(i)) ?? false;
      if (t) {
        return s ? `(Claude can't launch the cloud review directly \u2014 type \`/code-review ultra --fix\` to review in the cloud and apply the findings locally when it completes. Running a local ${r}-effort review and applying its findings for now.)

` : `(Running a local ${r}-effort review and applying its findings.)

`;
      }
      return s ? `(Claude can't launch the cloud review directly \u2014 type \`/code-review ultra\` to run it. Falling back to a local ${r}-effort review for now.)

` : `(Claude can't launch the cloud review directly \u2014 the user can run \`claude ultrareview\` from a terminal to start it. Falling back to a local ${r}-effort review for now.)

`;
    }
    if (n !== undefined) {
      return `(Ignoring unrecognized effort "${n}"; valid: ${UC.join(", ")}. Using ${r}.)

`;
    }
    return "";
  }
  function SDc() {
    Qc({
      name: "code-review",
      menuDescription: "Review the current diff for bugs and cleanups",
      subcommands: {
        ultra: "ultrareview"
      },
      description: zOf,
      argumentHint: KOf,
      userInvocable: true,
      getEffort(e) {
        return bDc(e).explicit;
      },
      getPromptForCommand: YOf
    });
  }
  var yDc = `

## Posting to GitHub (--comment)

The \`--comment\` flag was passed. After producing the findings list, if the
review target is a GitHub PR, post each finding as an inline PR comment via
\`mcp__github_inline_comment__create_inline_comment\` (one call per finding;
include a suggestion block only when it fully fixes the issue). If that tool
is not available in this session, fall back to \`gh api\` (repos/{owner}/{repo}/pulls/{pr}/comments)
or print the findings instead. If the target is not a PR, print the findings
to the terminal and note that \`--comment\` was ignored.
`;
  var _Dc = `

## Applying fixes (--fix)

The \`--fix\` flag was passed. After producing the findings list, apply the
findings to the working tree instead of stopping at the report: fix each one
directly \u2014 correctness bugs and reuse/simplification/efficiency cleanups alike.
Skip any finding whose fix would change intended behavior, require changes well
outside the reviewed diff, or that you judge to be a false positive \u2014 note the
skip rather than arguing with it. Finish with a brief summary of what was fixed
and what was skipped.
`;
  var VOf;
  function eDf() {
    return false;
  }
  function tDf(e) {
    return `${e === "" ? "No target was given. Ask the user which file, directory, or PR they want explained \u2014 one short question \u2014 and stop until they answer." : `Walkthrough target: \`${e}\``}

## Goal

Produce an **interactive explainer artifact** for the target above \u2014 a
self-contained HTML page a newcomer can read top-to-bottom to understand what
this code does, how it fits together, and why it's built the way it is. Pitch
the writing at explain-like-I'm-new-here: assume the reader is a capable
engineer who has never seen this codebase.

## Explore first

Read the target and whatever it immediately depends on (callers, callees,
types it mentions, tests that exercise it). Build a mental model before
writing a word of the artifact. The artifact is only as good as your
understanding.

## Structure of the artifact

Write an HTML file and publish it with the ${"Artifact"} tool. Load
the \`${"artifact-design"}\` skill first and give the page a
utilitarian treatment \u2014 this is a document, not a landing page.

The page should contain, in this order:

1. **One-paragraph summary** \u2014 what the target is for, in plain language.
2. **Map** \u2014 a short list or simple diagram of the main pieces and how they
   connect. For a single file this is the key functions/types; for a
   directory it's the files; for a PR it's the before\u2192after.
3. **Walkthrough sections** \u2014 one \`<details>\` block per piece from the map.
   Inside each:
   - A plain-language explanation of what this piece does.
   - An **annotated code snippet**: the real code (trimmed to the relevant
     lines) with inline explanations of the non-obvious parts.
   - A **"why this matters"** callout \u2014 what would break or be worse if this
     piece didn't exist or worked differently.
4. **Open questions** \u2014 anything you couldn't determine from the code that a
   maintainer would know. Honest "I don't know" beats a guess.

End the page body with this line verbatim so the reader can bring the
artifact back into Claude Code to keep iterating:

> ${"Paste this URL back into Claude Code to keep iterating on these findings."}

## Keep it honest

Explain what the code *actually does* (trace it), not what its names suggest
it does. When a section is genuinely simple, say so briefly and move on \u2014
don't pad.
`;
  }
  function EDc() {
    Qc({
      name: "code-walkthrough",
      menuDescription: "Generate an interactive walkthrough artifact for code",
      description: 'Generate an interactive walkthrough artifact explaining code in this project \u2014 expandable sections, annotated snippets, and "why this matters" callouts, pitched at someone seeing the code for the first time.',
      argumentHint: "<path | PR# | ref>",
      isEnabled: eDf,
      userInvocable: true,
      async getPromptForCommand(e) {
        return [{
          type: "text",
          text: tDf(e.trim())
        }];
      }
    });
  }
  var vDc = __lazy(() => {
    t1();
    M1();
    x_();
    REt();
  });
  var wDc = __lazy(() => {
    at();
    uTe();
    v6t();
    l8e();
    Q6e();
    ZWt();
    Jf();
    NNe();
    x_();
  });
  var RDc = `# Component Schemas

Detailed format specifications for every plugin component type. Reference this when implementing components in Phase 4.

## Skills

**Location**: \`skills/skill-name/SKILL.md\`
**Format**: Markdown with YAML frontmatter

### Frontmatter Fields

| Field         | Required | Type   | Description                                             |
| ------------- | -------- | ------ | ------------------------------------------------------- |
| \`name\`        | Yes      | String | Skill identifier (lowercase, hyphens; matches dir name) |
| \`description\` | Yes      | String | Third-person description with trigger phrases           |
| \`metadata\`    | No       | Map    | Arbitrary key-value pairs (e.g., \`version\`, \`author\`)   |

### Example Skill

\`\`\`yaml
---
name: api-design
description: >
  This skill should be used when the user asks to "design an API",
  "create API endpoints", "review API structure", or needs guidance
  on REST API best practices, endpoint naming, or request/response design.
metadata:
  version: "0.1.0"
---
\`\`\`

### Writing Style Rules

- **Frontmatter description**: Third-person ("This skill should be used when..."), with specific trigger phrases in quotes.
- **Body**: Imperative/infinitive form ("Parse the config file," not "You should parse the config file").
- **Length**: Keep SKILL.md body under 3,000 words (ideally 1,500-2,000). Move detailed content to \`references/\`.

### Skill Directory Structure

\`\`\`
skill-name/
\u251C\u2500\u2500 SKILL.md              # Core knowledge (required)
\u251C\u2500\u2500 references/           # Detailed docs loaded on demand
\u2502   \u251C\u2500\u2500 patterns.md
\u2502   \u2514\u2500\u2500 advanced.md
\u251C\u2500\u2500 examples/             # Working code examples
\u2502   \u2514\u2500\u2500 sample-config.json
\u2514\u2500\u2500 scripts/              # Utility scripts
    \u2514\u2500\u2500 validate.sh
\`\`\`

### Progressive Disclosure Levels

1. **Metadata** (always in context): name + description (~100 words)
2. **SKILL.md body** (when skill triggers): core knowledge (<5k words)
3. **Bundled resources** (as needed): references, examples, scripts (unlimited)

## Agents

**Location**: \`agents/agent-name.md\`
**Format**: Markdown with YAML frontmatter

### Frontmatter Fields

| Field         | Required | Type   | Description                                         |
| ------------- | -------- | ------ | --------------------------------------------------- |
| \`name\`        | Yes      | String | Lowercase, hyphens, 3-50 chars                      |
| \`description\` | Yes      | String | Triggering conditions with \`<example>\` blocks       |
| \`model\`       | Yes      | String | \`inherit\`, \`sonnet\`, \`opus\`, or \`haiku\`             |
| \`color\`       | Yes      | String | \`blue\`, \`cyan\`, \`green\`, \`yellow\`, \`magenta\`, \`red\` |
| \`tools\`       | No       | Array  | Restrict to specific tools                          |

### Example Agent

\`\`\`markdown
---
name: code-reviewer
description: Use this agent when the user asks for a thorough code review or wants detailed analysis of code quality, security, and best practices.

<example>
Context: User has just written a new module
user: "Can you do a deep review of this code?"
assistant: "I'll use the code-reviewer agent to provide a thorough analysis."
<commentary>
User explicitly requested a detailed review, which matches this agent's specialty.
</commentary>
</example>

<example>
Context: User is about to merge a PR
user: "Review this before I merge"
assistant: "Let me run a comprehensive review using the code-reviewer agent."
<commentary>
Pre-merge review benefits from the agent's structured analysis process.
</commentary>
</example>

model: inherit
color: blue
tools: ["Read", "Grep", "Glob"]
---

You are a code review specialist focused on identifying issues across security, performance, maintainability, and correctness.

**Your Core Responsibilities:**

1. Analyze code structure and organization
2. Identify security vulnerabilities
3. Flag performance concerns
4. Check adherence to best practices

**Analysis Process:**

1. Read all files in scope
2. Identify patterns and anti-patterns
3. Categorize findings by severity
4. Provide specific remediation suggestions

**Output Format:**
Present findings grouped by severity (Critical, Warning, Info) with:

- File path and line number
- Description of the issue
- Suggested fix
\`\`\`

### Agent Naming Rules

- 3-50 characters
- Lowercase letters, numbers, hyphens only
- Must start and end with alphanumeric
- No underscores, spaces, or special characters

### Color Guidelines

- Blue/Cyan: Analysis, review
- Green: Success-oriented tasks
- Yellow: Caution, validation
- Red: Critical, security
- Magenta: Creative, generation

## Hooks

**Location**: \`hooks/hooks.json\`
**Format**: JSON

### Available Events

| Event              | When it fires                   |
| ------------------ | ------------------------------- |
| \`PreToolUse\`       | Before a tool call executes     |
| \`PostToolUse\`      | After a tool call completes     |
| \`Stop\`             | When Claude finishes a response |
| \`SubagentStop\`     | When a subagent finishes        |
| \`SessionStart\`     | When a session begins           |
| \`SessionEnd\`       | When a session ends             |
| \`UserPromptSubmit\` | When the user sends a message   |
| \`PreCompact\`       | Before context compaction       |
| \`Notification\`     | When a notification fires       |

### Hook Types

**Prompt-based** (recommended for complex logic):

\`\`\`json
{
  "type": "prompt",
  "prompt": "Evaluate whether this file write follows project conventions: $TOOL_INPUT",
  "timeout": 30
}
\`\`\`

Supported events: Stop, SubagentStop, UserPromptSubmit, PreToolUse.

**Command-based** (deterministic checks):

\`\`\`json
{
  "type": "command",
  "command": "bash \${CLAUDE_PLUGIN_ROOT}/hooks/scripts/validate.sh",
  "timeout": 60
}
\`\`\`

### Example hooks.json

\`\`\`json
{
  "PreToolUse": [
    {
      "matcher": "Write|Edit",
      "hooks": [
        {
          "type": "prompt",
          "prompt": "Check that this file write follows project coding standards. If it violates standards, explain why and block.",
          "timeout": 30
        }
      ]
    }
  ],
  "SessionStart": [
    {
      "matcher": "",
      "hooks": [
        {
          "type": "command",
          "command": "cat \${CLAUDE_PLUGIN_ROOT}/context/project-context.md",
          "timeout": 10
        }
      ]
    }
  ]
}
\`\`\`

### Hook Output Format (Command Hooks)

Command hooks return JSON to stdout:

\`\`\`json
{
  "decision": "block",
  "reason": "File write violates naming convention"
}
\`\`\`

Decisions: \`approve\`, \`block\`, \`ask_user\` (ask for confirmation).

## MCP Servers

**Location**: \`.mcp.json\` at plugin root
**Format**: JSON

### Server Types

**stdio** (local process):

\`\`\`json
{
  "mcpServers": {
    "my-server": {
      "command": "node",
      "args": ["\${CLAUDE_PLUGIN_ROOT}/servers/server.js"],
      "env": {
        "API_KEY": "\${API_KEY}"
      }
    }
  }
}
\`\`\`

**SSE** (remote server, server-sent events transport):

\`\`\`json
{
  "mcpServers": {
    "asana": {
      "type": "sse",
      "url": "https://mcp.asana.com/sse"
    }
  }
}
\`\`\`

**HTTP** (remote server, streamable HTTP transport):

\`\`\`json
{
  "mcpServers": {
    "api-service": {
      "type": "http",
      "url": "https://api.example.com/mcp",
      "headers": {
        "Authorization": "Bearer \${API_TOKEN}"
      }
    }
  }
}
\`\`\`

### Environment Variable Expansion

All MCP configs support \`\${VAR_NAME}\` substitution:

- \`\${CLAUDE_PLUGIN_ROOT}\` \u2014 plugin directory (always use for portability)
- \`\${ANY_ENV_VAR}\` \u2014 user environment variables

Document all required environment variables in the plugin README.

### Directory Servers Without a URL

Some MCP directory entries have no \`url\` because the endpoint is dynamic. Plugins can reference these servers by **name** instead \u2014 if the server name in the plugin's MCP config matches the directory entry name, it is treated the same as a URL match.

## Commands (Legacy)

> **Prefer \`skills/*/SKILL.md\` for new plugins.** The Cowork UI now presents commands and skills as a single "Skills" concept. The \`commands/\` format still works, but only use it if you specifically need the single-file format with \`$ARGUMENTS\`/\`$1\` substitution and inline bash execution.

**Location**: \`commands/command-name.md\`
**Format**: Markdown with optional YAML frontmatter

### Frontmatter Fields

| Field           | Required | Type            | Description                                         |
| --------------- | -------- | --------------- | --------------------------------------------------- |
| \`description\`   | No       | String          | Brief description shown in \`/help\` (under 60 chars) |
| \`allowed-tools\` | No       | String or Array | Tools the command can use                           |
| \`model\`         | No       | String          | Model override: \`sonnet\`, \`opus\`, \`haiku\`           |
| \`argument-hint\` | No       | String          | Documents expected arguments for autocomplete       |

### Example Command

\`\`\`markdown
---
description: Review code for security issues
allowed-tools: Read, Grep, Bash(git:*)
argument-hint: [file-path]
---

Review @$1 for security vulnerabilities including:

- SQL injection
- XSS attacks
- Authentication bypass
- Insecure data handling

Provide specific line numbers, severity ratings, and remediation suggestions.
\`\`\`

### Key Rules

- Commands are instructions FOR Claude, not messages for the user. Write them as directives.
- \`$ARGUMENTS\` captures all arguments as a single string; \`$1\`, \`$2\`, \`$3\` capture positional arguments.
- \`@path\` syntax includes file contents in the command context.
- \`!\` backtick syntax executes bash inline for dynamic context (e.g., \`\` !\`git diff --name-only\` \`\`).
- Use \`\${CLAUDE_PLUGIN_ROOT}\` to reference plugin files portably.

### allowed-tools Patterns

\`\`\`yaml
# Specific tools
allowed-tools: Read, Write, Edit, Bash(git:*)

# Bash with specific commands only
allowed-tools: Bash(npm:*), Read

# MCP tools (specific)
allowed-tools: ["mcp__plugin_name_server__tool_name"]
\`\`\`

## CONNECTORS.md

**Location**: Plugin root
**When to create**: When the plugin references external tools by category rather than specific product

### Format

\`\`\`markdown
# Connectors

## How tool references work

Plugin files use \`~~category\` as a placeholder for whatever tool the user
connects in that category. For example, \`~~project tracker\` might mean
Asana, Linear, Jira, or any other project tracker with an MCP server.

Plugins are tool-agnostic \u2014 they describe workflows in terms of categories
rather than specific products.

## Connectors for this plugin

| Category        | Placeholder         | Included servers | Other options            |
| --------------- | ------------------- | ---------------- | ------------------------ |
| Chat            | \`~~chat\`            | Slack            | Microsoft Teams, Discord |
| Project tracker | \`~~project tracker\` | Linear           | Asana, Jira, Monday      |
\`\`\`

### Using ~~ Placeholders

In plugin files (skills, agents), reference tools generically:

\`\`\`markdown
Check ~~project tracker for open tickets assigned to the user.
Post a summary to ~~chat in the team channel.
\`\`\`

During customization (via the cowork-plugin-customizer skill), these get replaced with specific tool names.

## README.md

Every plugin should include a README with:

1. **Overview** \u2014 what the plugin does
2. **Components** \u2014 list of skills, agents, hooks, MCP servers
3. **Setup** \u2014 any required environment variables or configuration
4. **Usage** \u2014 how to trigger each skill
5. **Customization** \u2014 if CONNECTORS.md exists, mention it
`;
  var CDc = () => {};
  var kDc = `# Example Plugins

Three complete plugin structures at different complexity levels. Use these as templates when implementing in Phase 4.

## Minimal Plugin: Single Skill

A simple plugin with one skill and no other components.

### Structure

\`\`\`
meeting-notes/
\u251C\u2500\u2500 .claude-plugin/
\u2502   \u2514\u2500\u2500 plugin.json
\u251C\u2500\u2500 skills/
\u2502   \u2514\u2500\u2500 meeting-notes/
\u2502       \u2514\u2500\u2500 SKILL.md
\u2514\u2500\u2500 README.md
\`\`\`

### plugin.json

\`\`\`json
{
  "name": "meeting-notes",
  "version": "0.1.0",
  "description": "Generate structured meeting notes from transcripts",
  "author": {
    "name": "User"
  }
}
\`\`\`

### skills/meeting-notes/SKILL.md

\`\`\`markdown
---
name: meeting-notes
description: >
  Generate structured meeting notes from a transcript. Use when the user asks
  to "summarize this meeting", "create meeting notes", "extract action items
  from this transcript", or provides a meeting transcript file.
---

Read the transcript file the user provided and generate structured meeting notes.

Include these sections:

1. **Attendees** \u2014 list all participants mentioned
2. **Summary** \u2014 2-3 sentence overview of the meeting
3. **Key Decisions** \u2014 numbered list of decisions made
4. **Action Items** \u2014 table with columns: Owner, Task, Due Date
5. **Open Questions** \u2014 anything unresolved

Write the notes to a new file named after the transcript with \`-notes\` appended.
\`\`\`

---

## Standard Plugin: Skills + MCP

A plugin that combines domain knowledge, user-initiated actions, and external service integration.

### Structure

\`\`\`
code-quality/
\u251C\u2500\u2500 .claude-plugin/
\u2502   \u2514\u2500\u2500 plugin.json
\u251C\u2500\u2500 skills/
\u2502   \u251C\u2500\u2500 coding-standards/
\u2502   \u2502   \u251C\u2500\u2500 SKILL.md
\u2502   \u2502   \u2514\u2500\u2500 references/
\u2502   \u2502       \u2514\u2500\u2500 style-rules.md
\u2502   \u251C\u2500\u2500 review-changes/
\u2502   \u2502   \u2514\u2500\u2500 SKILL.md
\u2502   \u2514\u2500\u2500 fix-lint/
\u2502       \u2514\u2500\u2500 SKILL.md
\u251C\u2500\u2500 .mcp.json
\u2514\u2500\u2500 README.md
\`\`\`

### plugin.json

\`\`\`json
{
  "name": "code-quality",
  "version": "0.1.0",
  "description": "Enforce coding standards with reviews, linting, and style guidance",
  "author": {
    "name": "User"
  }
}
\`\`\`

### skills/review-changes/SKILL.md

\`\`\`markdown
---
name: review-changes
description: >
  Review code changes for style and quality issues. Use when the user asks to
  "review my changes", "check this diff", "review for style violations", or
  wants a code quality pass on uncommitted work.
---

Run \`git diff --name-only\` to get the list of changed files.

For each changed file:

1. Read the file
2. Check against the coding-standards skill for style violations
3. Identify potential bugs or anti-patterns
4. Flag any security concerns

Present a summary with:

- File path
- Issue severity (Error, Warning, Info)
- Description and suggested fix
\`\`\`

### skills/fix-lint/SKILL.md

\`\`\`markdown
---
name: fix-lint
description: >
  Auto-fix linting issues in changed files. Use when the user asks to
  "fix lint errors", "clean up linting", or "auto-fix my lint issues".
---

Run the linter: \`npm run lint -- --format json 2>&1\`

Parse the linter output and fix each issue:

- For auto-fixable issues, apply the fix directly
- For manual-fix issues, make the correction following project conventions
- Skip issues that require architectural changes

After all fixes, run the linter again to confirm clean output.
\`\`\`

### skills/coding-standards/SKILL.md

\`\`\`yaml
---
name: coding-standards
description: >
  This skill should be used when the user asks about "coding standards",
  "style guide", "naming conventions", "code formatting rules", or needs
  guidance on project-specific code quality expectations.
metadata:
  version: "0.1.0"
---
\`\`\`

\`\`\`markdown
# Coding Standards

Project coding standards and conventions for consistent, high-quality code.

## Core Rules

- Use camelCase for variables and functions
- Use PascalCase for classes and types
- Prefer const over let; avoid var
- Maximum line length: 100 characters
- Use explicit return types on all exported functions

## Import Order

1. External packages
2. Internal packages (aliased with @/)
3. Relative imports
4. Type-only imports last

## Additional Resources

- **\`references/style-rules.md\`** \u2014 complete style rules by language
\`\`\`

### .mcp.json

\`\`\`json
{
  "mcpServers": {
    "github": {
      "type": "http",
      "url": "https://api.githubcopilot.com/mcp/"
    }
  }
}
\`\`\`

---

## Full-Featured Plugin: All Component Types

A plugin using skills, agents, hooks, and MCP integration with tool-agnostic connectors.

### Structure

\`\`\`
engineering-workflow/
\u251C\u2500\u2500 .claude-plugin/
\u2502   \u2514\u2500\u2500 plugin.json
\u251C\u2500\u2500 skills/
\u2502   \u251C\u2500\u2500 team-processes/
\u2502   \u2502   \u251C\u2500\u2500 SKILL.md
\u2502   \u2502   \u2514\u2500\u2500 references/
\u2502   \u2502       \u2514\u2500\u2500 workflow-guide.md
\u2502   \u251C\u2500\u2500 standup-prep/
\u2502   \u2502   \u2514\u2500\u2500 SKILL.md
\u2502   \u2514\u2500\u2500 create-ticket/
\u2502       \u2514\u2500\u2500 SKILL.md
\u251C\u2500\u2500 agents/
\u2502   \u2514\u2500\u2500 ticket-analyzer.md
\u251C\u2500\u2500 hooks/
\u2502   \u2514\u2500\u2500 hooks.json
\u251C\u2500\u2500 .mcp.json
\u251C\u2500\u2500 CONNECTORS.md
\u2514\u2500\u2500 README.md
\`\`\`

### plugin.json

\`\`\`json
{
  "name": "engineering-workflow",
  "version": "0.1.0",
  "description": "Streamline engineering workflows: standup prep, ticket management, and code quality",
  "author": {
    "name": "User"
  },
  "keywords": ["engineering", "workflow", "tickets", "standup"]
}
\`\`\`

### agents/ticket-analyzer.md

\`\`\`markdown
---
name: ticket-analyzer
description: Use this agent when the user needs to analyze tickets, triage incoming issues, or prioritize a backlog.

<example>
Context: User is preparing for sprint planning
user: "Help me triage these new tickets"
assistant: "I'll use the ticket-analyzer agent to review and categorize the tickets."
<commentary>
Ticket triage requires systematic analysis across multiple dimensions, making the agent appropriate.
</commentary>
</example>

<example>
Context: User has a large backlog
user: "Prioritize my backlog for next sprint"
assistant: "Let me analyze the backlog using the ticket-analyzer agent to recommend priorities."
<commentary>
Backlog prioritization is a multi-step autonomous task well-suited for the agent.
</commentary>
</example>

model: inherit
color: cyan
tools: ["Read", "Grep"]
---

You are a ticket analysis specialist. Analyze tickets for priority, effort, and dependencies.

**Your Core Responsibilities:**

1. Categorize tickets by type (bug, feature, tech debt, improvement)
2. Estimate relative effort (S, M, L, XL)
3. Identify dependencies between tickets
4. Recommend priority ordering

**Analysis Process:**

1. Read all ticket descriptions
2. Categorize each by type
3. Estimate effort based on scope
4. Map dependencies
5. Rank by impact-to-effort ratio

**Output Format:**
| Ticket | Type | Effort | Dependencies | Priority |
|--------|------|--------|-------------|----------|
| ... | ... | ... | ... | ... |

Followed by a brief rationale for the top 5 priorities.
\`\`\`

### hooks/hooks.json

\`\`\`json
{
  "SessionStart": [
    {
      "matcher": "",
      "hooks": [
        {
          "type": "command",
          "command": "echo '## Team Context\\n\\nSprint cycle: 2 weeks. Standup: daily at 9:30 AM. Use ~~project tracker for ticket management.'",
          "timeout": 5
        }
      ]
    }
  ]
}
\`\`\`

### CONNECTORS.md

\`\`\`markdown
# Connectors

## How tool references work

Plugin files use \`~~category\` as a placeholder for whatever tool the user
connects in that category. Plugins are tool-agnostic.

## Connectors for this plugin

| Category        | Placeholder         | Included servers | Other options       |
| --------------- | ------------------- | ---------------- | ------------------- |
| Project tracker | \`~~project tracker\` | Linear           | Asana, Jira, Monday |
| Chat            | \`~~chat\`            | Slack            | Microsoft Teams     |
| Source control  | \`~~source control\`  | GitHub           | GitLab, Bitbucket   |
\`\`\`

### .mcp.json

\`\`\`json
{
  "mcpServers": {
    "linear": {
      "type": "sse",
      "url": "https://mcp.linear.app/sse"
    },
    "github": {
      "type": "http",
      "url": "https://api.githubcopilot.com/mcp/"
    },
    "slack": {
      "type": "http",
      "url": "https://slack.mcp.claude.com/mcp"
    }
  }
}
\`\`\`
`;
  var xDc = () => {};
  var ADc = () => {};
  var ODc = `# Knowledge MCP Search Strategies

Query patterns for gathering organizational context during plugin customization.

## Finding Tool Names

**Source control:**
- Search: "GitHub" OR "GitLab" OR "Bitbucket"
- Search: "pull request" OR "merge request"
- Look for: repository links, CI/CD mentions

**Project management:**
- Search: "Asana" OR "Jira" OR "Linear" OR "Monday"
- Search: "sprint" AND "tickets"
- Look for: task links, project board mentions

**Chat:**
- Search: "Slack" OR "Teams" OR "Discord"
- Look for: channel mentions, integration discussions

**Analytics:**
- Search: "Datadog" OR "Grafana" OR "Mixpanel"
- Search: "monitoring" OR "observability"
- Look for: dashboard links, alert configurations

**Design:**
- Search: "Figma" OR "Sketch" OR "Adobe XD"
- Look for: design file links, handoff discussions

**CRM:**
- Search: "Salesforce" OR "HubSpot"
- Look for: deal mentions, customer record links

## Finding Organization Values

**Workspace/project IDs:**
- Search for existing integrations or bookmarked links
- Look for admin/setup documentation

**Team conventions:**
- Search: "story points" OR "estimation"
- Search: "workflow" OR "ticket status"
- Look for engineering process docs

**Channel/team names:**
- Search: "standup" OR "engineering" OR "releases"
- Look for channel naming patterns

## When Knowledge MCPs Are Unavailable

If no knowledge MCPs are configured, skip automatic discovery and proceed directly to AskUserQuestion for all categories. Note: AskUserQuestion always includes a Skip button and a free-text input box for custom answers, so do not include \`None\` or \`Other\` as options.
`;
  var PDc = () => {};
  var MDc = `# Cowork Plugin Authoring

Create a new Cowork plugin from scratch, or customize an existing one for a specific organization. Both paths deliver a ready-to-install \`.plugin\` file at the end.

## Determining the Mode

Decide from the user's request:

- **Customize** \u2014 the user names an existing installed plugin ("customize the X plugin", "configure X for my company", "set up the X plugin", "update the X skill"). Follow **Customizing an Existing Plugin** below.
- **Create** \u2014 the user wants to build a plugin from scratch ("create a plugin for X", "make a new plugin", "build a plugin that does X"). Follow **Creating a New Plugin** below.

> **Nontechnical output**: Keep all user-facing conversation in plain language. Never mention file paths, directory structures, schema fields, \`~~\` prefixes, or placeholders unless the user asks. Frame everything in terms of what the plugin will do.

> **AskUserQuestion**: When you need input, use AskUserQuestion. Don't assume "industry standard" defaults are correct. AskUserQuestion always includes a Skip button and a free-text input box for custom answers, so do not include \`None\` or \`Other\` as options.

## Plugin Architecture

A plugin is a self-contained directory that extends Claude with skills, agents, hooks, and MCP server integrations.

### Directory Structure

\`\`\`
plugin-name/
\u251C\u2500\u2500 .claude-plugin/
\u2502   \u2514\u2500\u2500 plugin.json           # Required: plugin manifest
\u251C\u2500\u2500 skills/                   # Skills (subdirectories with SKILL.md)
\u2502   \u2514\u2500\u2500 skill-name/
\u2502       \u251C\u2500\u2500 SKILL.md
\u2502       \u2514\u2500\u2500 references/
\u251C\u2500\u2500 agents/                   # Subagent definitions (.md files)
\u251C\u2500\u2500 .mcp.json                 # MCP server definitions
\u2514\u2500\u2500 README.md                 # Plugin documentation
\`\`\`

> **Legacy \`commands/\` format**: Older plugins may include a \`commands/\` directory with single-file \`.md\` slash commands. This format still works, but new plugins should use \`skills/*/SKILL.md\` instead \u2014 the Cowork UI presents both as a single "Skills" concept, and the skills format supports progressive disclosure via \`references/\`. Treat \`commands/*.md\` files the same way you would \`skills/*/SKILL.md\` when customizing.

**Rules:**

- \`.claude-plugin/plugin.json\` is always required
- Component directories (\`skills/\`, \`agents/\`) go at the plugin root, not inside \`.claude-plugin/\`
- Only create directories for components the plugin actually uses
- Use kebab-case for all directory and file names

### plugin.json Manifest

Located at \`.claude-plugin/plugin.json\`. Minimal required field is \`name\`.

\`\`\`json
{
  "name": "plugin-name",
  "version": "0.1.0",
  "description": "Brief explanation of plugin purpose",
  "author": {
    "name": "Author Name"
  }
}
\`\`\`

**Name rules:** kebab-case, lowercase with hyphens, no spaces or special characters.
**Version:** semver format (MAJOR.MINOR.PATCH). Start at \`0.1.0\`.

Optional fields: \`homepage\`, \`repository\`, \`license\`, \`keywords\`.

Custom component paths can be specified (supplements, does not replace, auto-discovery):

\`\`\`json
{
  "commands": "./custom-commands",
  "agents": ["./agents", "./specialized-agents"],
  "hooks": "./config/hooks.json",
  "mcpServers": "./.mcp.json"
}
\`\`\`

### Component Summary

Detailed schemas for each component type are in \`references/component-schemas.md\`.

| Component                          | Location            | Format                      |
| ---------------------------------- | ------------------- | --------------------------- |
| Skills                             | \`skills/*/SKILL.md\` | Markdown + YAML frontmatter |
| MCP Servers                        | \`.mcp.json\`         | JSON                        |
| Agents (uncommonly used in Cowork) | \`agents/*.md\`       | Markdown + YAML frontmatter |
| Hooks (rarely used in Cowork)      | \`hooks/hooks.json\`  | JSON                        |
| Commands (legacy)                  | \`commands/*.md\`     | Markdown + YAML frontmatter |

This schema is shared with Claude Code's plugin system, but you're building for Claude Cowork, a desktop app for knowledge work. Cowork users will usually find skills the most useful. **Scaffold new plugins with \`skills/*/SKILL.md\` \u2014 do not create \`commands/\` unless the user explicitly needs the legacy single-file format.**

### Customizable plugins with \`~~\` placeholders

> **Do not use or ask about this pattern by default.** Only introduce \`~~\` placeholders if the user explicitly says they want people outside their organization to use the plugin. You can mention it as an option if they want to distribute externally, but do not proactively ask with AskUserQuestion.

When a plugin is intended to be shared outside the author's company, it might reference external tools by category rather than specific product (e.g., "project tracker" instead of "Jira"). Use generic language and mark these as requiring customization with two tilde characters: \`create an issue in ~~project tracker\`.

If any tool categories are used, write a \`CONNECTORS.md\` file at the plugin root to explain:

\`\`\`markdown
# Connectors

## How tool references work

Plugin files use \`~~category\` as a placeholder for whatever tool the user
connects in that category. Plugins are tool-agnostic \u2014 they describe
workflows in terms of categories rather than specific products.

## Connectors for this plugin

| Category        | Placeholder         | Options                         |
| --------------- | ------------------- | ------------------------------- |
| Chat            | \`~~chat\`            | Slack, Microsoft Teams, Discord |
| Project tracker | \`~~project tracker\` | Linear, Asana, Jira             |
\`\`\`

### \${CLAUDE_PLUGIN_ROOT} Variable

Use \`\${CLAUDE_PLUGIN_ROOT}\` for all intra-plugin path references in hooks and MCP configs. Never hardcode absolute paths.

## Creating a New Plugin

Build from scratch through a five-phase guided conversation.

### Phase 1: Discovery

Understand what the user wants to build and why. Ask (only what is unclear \u2014 skip questions the user's initial request already answers):

- What should this plugin do? What problem does it solve?
- Who will use it and in what context?
- Does it integrate with any external tools or services?
- Is there a similar plugin or workflow to reference?

Summarize understanding and confirm before proceeding.

### Phase 2: Component Planning

Based on discovery, determine which component types are needed:

- **Skills** \u2014 Specialized knowledge Claude loads on-demand, or user-initiated actions (domain expertise, reference schemas, workflow guides, deploy/configure/analyze/review actions)
- **MCP Servers** \u2014 External service integration (databases, APIs, SaaS tools)
- **Agents (uncommon)** \u2014 Autonomous multi-step tasks (validation, generation, analysis)
- **Hooks (rare)** \u2014 Automatic behavior on certain events (enforce policies, load context, validate operations)

Present a component plan table including types you decided not to create:

\`\`\`
| Component | Count | Purpose |
|-----------|-------|---------|
| Skills    | 3     | Domain knowledge for X, /do-thing, /check-thing |
| Agents    | 0     | Not needed |
| Hooks     | 1     | Validate writes |
| MCP       | 1     | Connect to service Y |
\`\`\`

Get user confirmation before proceeding.

### Phase 3: Design & Clarifying Questions

Specify each component in detail. Resolve all ambiguities before implementation. Present questions grouped by component type and wait for answers.

**Skills:**

- What user queries should trigger this skill?
- What knowledge domains does it cover?
- Should it include reference files for detailed content?
- If it represents a user-initiated action: what arguments does it accept, and what tools does it need? (Read, Write, Bash, Grep, etc.)

**Agents:**

- Should it trigger proactively or only when requested?
- What tools does it need?
- What output format?

**Hooks:**

- Which events? (PreToolUse, PostToolUse, Stop, SessionStart, etc.)
- What behavior \u2014 validate, block, modify, add context?
- Prompt-based (LLM-driven) or command-based (deterministic script)?

**MCP Servers:**

- What server type? (stdio for local, SSE for hosted with OAuth, HTTP for REST APIs)
- What authentication method?
- What tools should be exposed?

If the user says "whatever you think is best," provide specific recommendations and get explicit confirmation.

### Phase 4: Implementation

Create all plugin files following best practices.

1. Create the plugin directory structure
2. Create \`plugin.json\` manifest
3. Create each component (see \`references/component-schemas.md\` for exact formats)
4. Create \`README.md\` documenting the plugin

**Guidelines:**

- **Skills** use progressive disclosure: lean SKILL.md body (under 3,000 words), detailed content in \`references/\`. Frontmatter description must be third-person with specific trigger phrases. Skill bodies are instructions FOR Claude, not messages to the user \u2014 write them as directives.
- **Agents** need a description with \`<example>\` blocks showing triggering conditions, plus a system prompt in the markdown body.
- **Hooks** config goes in \`hooks/hooks.json\`. Use \`\${CLAUDE_PLUGIN_ROOT}\` for script paths. Prefer prompt-based hooks for complex logic.
- **MCP configs** go in \`.mcp.json\` at plugin root. Use \`\${CLAUDE_PLUGIN_ROOT}\` for local server paths. Document required env vars in README.

### Phase 5: Review

1. Summarize what was created \u2014 list each component and its purpose
2. Ask if the user wants any adjustments
3. Run \`claude plugin validate <path-to-plugin-json>\` to check the plugin structure. If this command is unavailable (e.g., when running inside Cowork), verify manually:
   - \`.claude-plugin/plugin.json\` exists and contains valid JSON with at least a \`name\` field
   - The \`name\` field is kebab-case (lowercase letters, numbers, and hyphens only)
   - Any component directories referenced by the plugin (\`commands/\`, \`skills/\`, \`agents/\`, \`hooks/\`) actually exist and contain files in the expected formats \u2014 \`.md\` for commands/skills/agents, \`.json\` for hooks
   - Each skill subdirectory contains a \`SKILL.md\`
   - Report what passed and what didn't, the same way the CLI validator would

   Fix any errors, then proceed to **Packaging**.

## Customizing an Existing Plugin

Customize a plugin for a specific organization \u2014 either by setting up a generic plugin template for the first time, or by tweaking an already-configured plugin.

### Finding the plugin

Run \`find mnt/.local-plugins mnt/.plugins ~/.claude/plugins/synced -type d -name "*<plugin-name>*" 2>/dev/null\` to locate the plugin directory, then read its files to understand its structure before making changes.

If you cannot find the plugin directory in any of those locations, let the user know: "I couldn't find an installed plugin named '<plugin-name>'. If it's installed on your desktop, open this task from the Cowork desktop app so I can access it."

### Determining the Customization Mode

After locating the plugin, check for \`~~\`-prefixed placeholders: \`grep -rn '~~\\w' /path/to/plugin --include='*.md' --include='*.json'\`

> **Default rule**: If \`~~\` placeholders exist, default to **Generic plugin setup** unless the user explicitly asks to customize a specific part of the plugin.

**1. Generic plugin setup** \u2014 The plugin contains \`~~\`-prefixed placeholders. These are customization points in a template that need to be replaced with real values (e.g., \`~~Jira\` \u2192 \`Asana\`, \`~~your-team-channel\` \u2192 \`#engineering\`).

**2. Scoped customization** \u2014 No \`~~\` placeholders exist, and the user asked to customize a specific part of the plugin (e.g., "customize the connectors", "update the standup skill", "change the ticket tool"). Read the plugin files to find the relevant section(s) and focus only on those. Do not scan the entire plugin or present unrelated customization items.

**3. General customization** \u2014 No \`~~\` placeholders exist, and the user wants to modify the plugin broadly. Read the plugin's files to understand its current configuration, then ask the user what they'd like to change.

> **Important**: Never change the name of the plugin or skill being customized. Do not rename directories, files, or the plugin/skill name fields.

### Customization Workflow

#### Phase 0: Gather User Intent (scoped and general customization only)

Check whether the user provided free-form context alongside their request (e.g., "customize the standup skill \u2014 we do async standups in #eng-updates every morning").

- **If the user provided context**: Record it and use it to pre-fill answers in Phase 3 \u2014 skip asking questions the user already answered here.
- **If the user did not provide context**: Ask a single open-ended question using AskUserQuestion before proceeding. Tailor it to what they asked to customize \u2014 e.g., "What changes do you have in mind for the brief skill?" or "What would you like to change about how this plugin works?" Keep it short and specific.

#### Phase 1: Gather Context from Knowledge MCPs

Use company-internal knowledge MCPs to collect information relevant to the customization scope. See \`references/search-strategies.md\` for detailed query patterns.

**What to gather** (scope to what's relevant):

- Tool names and services the organization uses
- Organizational processes and workflows
- Team conventions (naming, statuses, estimation scales)
- Configuration values (workspace IDs, project names, team identifiers)

**Sources to search:**

1. **Chat/Slack MCPs** \u2014 tool mentions, integrations, workflow discussions
2. **Document MCPs** \u2014 onboarding docs, tool guides, setup instructions
3. **Email MCPs** \u2014 license notifications, admin emails, setup invitations

Record all findings for use in Phase 3.

#### Phase 2: Create Todo List

Build a todo list of changes to make, scoped appropriately:

- **Scoped customization**: Only items related to the specific section the user asked about.
- **Generic plugin setup**: Run \`grep -rn '~~\\w' /path/to/plugin --include='*.md' --include='*.json'\` to find all placeholder customization points. Group them by theme.
- **General customization**: Read the plugin files, understand the current config, and based on the user's request, identify what needs to change.

Use user-friendly descriptions that focus on the plugin's purpose:

- **Good**: "Learn how standup prep works at Company"
- **Bad**: "Replace placeholders in skills/standup-prep/SKILL.md"

#### Phase 3: Complete Todo Items

Work through each item using context from Phase 0 and Phase 1.

**If the user's free-form input (Phase 0) or knowledge MCPs (Phase 1) provided a clear answer**: Apply directly without confirmation.

**Otherwise**: Use AskUserQuestion. Don't assume "industry standard" defaults are correct \u2014 if neither the user's input nor knowledge MCPs provided a specific answer, ask.

**Types of changes:**

1. **Placeholder replacements** (generic setup): \`~~Jira\` \u2192 \`Asana\`, \`~~your-org-channel\` \u2192 \`#engineering\`
2. **Content updates**: Modifying instructions, skills, workflows, or references to match the organization
3. **URL pattern updates**: \`tickets.example.com/your-team/123\` \u2192 \`app.asana.com/0/PROJECT_ID/TASK_ID\`
4. **Configuration values**: Workspace IDs, project names, team identifiers

If the user doesn't know or skips, leave the value unchanged (or the \`~~\`-prefixed placeholder, for generic setup).

#### Phase 4: Search for Useful MCPs

After customization items are resolved, connect MCPs for any tools that were identified or changed. See \`references/mcp-servers.md\` for the full workflow, category-to-keywords mapping, and config file format.

For each tool identified during customization:

1. Search the registry: \`search_mcp_registry(keywords=[...])\` using category keywords from \`references/mcp-servers.md\`, or search for the specific tool name if already known
2. If unconnected: \`suggest_connectors(directoryUuids=["chosen-uuid"])\` \u2014 user completes auth
3. Update the plugin's MCP config file (check \`plugin.json\` for custom location, otherwise \`.mcp.json\` at root)

Collect all MCP results and present them together in the summary output \u2014 don't present MCPs one at a time during this phase.

### Summary Output

After customization, present the user with a summary of what was learned grouped by source. Always include the MCPs sections showing which were connected and which the user should still connect:

\`\`\`markdown
## From searching Slack

- You use Asana for project management
- Sprint cycles are 2 weeks

## From searching documents

- Story points use T-shirt sizes

## From your answers

- Ticket statuses are: Backlog, In Progress, In Review, Done
\`\`\`

Then present the MCPs that were connected during setup and any that the user should still connect, with instructions.

If no knowledge MCPs were available in Phase 1, and the user had to answer at least one question manually, include a note at the end:

> By the way, connecting sources like Slack or Microsoft Teams would let me find answers automatically next time you customize a plugin.

Then proceed to **Packaging**.

## Packaging

After create or customize completes, package the plugin as a \`.plugin\` file and deliver it with the SendUserFile tool:

1. Zip the plugin directory:
   \`\`\`bash
   cd /path/to/plugin-dir && zip -r /tmp/plugin-name.plugin . -x "setup/*" -x "*.DS_Store"
   \`\`\`
2. Call \`SendUserFile\` with \`files: ["/tmp/plugin-name.plugin"]\`, \`status: "normal"\`, and a short caption summarizing what was built or changed.

The \`.plugin\` file will appear in the chat as a rich preview where the user can browse the files and accept the plugin by pressing a button.

> **Naming**: Use the plugin name from \`plugin.json\` (for create) or the original plugin directory name (for customize) as the \`.plugin\` filename. Do not rename the plugin or its files during customization \u2014 only replace placeholder values and update content.

## Best Practices

- **Start small**: Begin with the minimum viable set of components. A plugin with one well-crafted skill is more useful than one with five half-baked components.
- **Progressive disclosure for skills**: Core knowledge in SKILL.md, detailed reference material in \`references/\`, working examples in \`examples/\`.
- **Clear trigger phrases**: Skill descriptions should include specific phrases users would say. Agent descriptions should include \`<example>\` blocks.
- **Skills are for Claude**: Write skill body content as instructions for Claude to follow, not documentation for the user to read.
- **Imperative writing style**: Use verb-first instructions in skills ("Parse the config file," not "You should parse the config file").
- **Portability**: Always use \`\${CLAUDE_PLUGIN_ROOT}\` for intra-plugin paths, never hardcoded paths.
- **Security**: Use environment variables for credentials, HTTPS for remote servers, least-privilege tool access.

## Additional Resources

- **\`references/component-schemas.md\`** \u2014 Detailed format specifications for every component type (skills, agents, hooks, MCP, legacy commands, CONNECTORS.md)
- **\`references/example-plugins.md\`** \u2014 Three complete example plugin structures at different complexity levels
- **\`references/mcp-servers.md\`** \u2014 MCP discovery workflow, category-to-keywords mapping, config file locations, example \`.mcp.json\`
- **\`references/search-strategies.md\`** \u2014 Knowledge MCP query patterns for finding tool names and org values
`;
  var DDc = () => {};
  var NDc = {};