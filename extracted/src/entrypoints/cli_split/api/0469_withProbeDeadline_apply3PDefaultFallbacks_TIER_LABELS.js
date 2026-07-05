  __export(bts, {
    upgradeKey: () => upgradeKey,
    probeBedrockModel: () => probeBedrockModel,
    findBedrockUpgradeCandidates: () => findBedrockUpgradeCandidates,
    checkBedrockDefaultAvailability: () => checkBedrockDefaultAvailability
  });
  function _ts(e) {
    if (e.startsWith("sonnet")) {
      return "sonnet";
    }
    if (e.startsWith("opus")) {
      return "opus";
    }
    if (e.startsWith("haiku")) {
      return "haiku";
    }
    return;
  }
  function qqc(e) {
    let t = firstPartyNameToCanonical(e);
    for (let n of ssn) {
      if (firstPartyNameToCanonical(xa[n].firstParty) === t) {
        return n;
      }
    }
    return;
  }
  function upgradeKey(e) {
    return `${e.fromKey}-to-${e.toKey}`;
  }
  async function findBedrockUpgradeCandidates() {
    if (getAPIProvider() !== "bedrock") {
      return [];
    }
    if (st(process.env.CLAUDE_CODE_PROVIDER_MANAGED_BY_HOST)) {
      return [];
    }
    let e = [];
    for (let i of Object.keys(M_r)) {
      let a = M_r[i];
      let l;
      let c;
      let u;
      for (let f of a.envVarPriority) {
        let h = process.env[f];
        if (!h) {
          continue;
        }
        if (h.includes("application-inference-profile")) {
          continue;
        }
        let g = qqc(h);
        if (!g || _ts(g) !== i || g === a.defaultKey) {
          continue;
        }
        l = f;
        c = h;
        u = g;
        break;
      }
      if (!l || !c || !u) {
        continue;
      }
      let d = a.defaultKey;
      let p = ssn.indexOf(u);
      let m = ssn.indexOf(d);
      if (p >= m) {
        continue;
      }
      e.push({
        tier: i,
        envVar: l,
        pinnedRaw: c,
        pinnedKey: u,
        defaultKey: d
      });
    }
    if (e.length === 0) {
      return [];
    }
    let t;
    try {
      t = await dqe();
    } catch {
      return [];
    }
    let n = $le(await Ej());
    let r = [];
    for (let i of e) {
      let a = xa[i.defaultKey].firstParty;
      let l = pqe(t, a, n);
      if (!l) {
        continue;
      }
      let c = getMarketingNameForModel(xa[i.pinnedKey].firstParty);
      let u = getMarketingNameForModel(xa[i.defaultKey].firstParty);
      if (!c || !u) {
        continue;
      }
      r.push({
        tier: i.tier,
        envVar: i.envVar,
        fromKey: i.pinnedKey,
        fromMarketingName: c,
        toKey: i.defaultKey,
        toMarketingName: u,
        toBedrockId: l
      });
    }
    logEvent("tengu_bedrock_upgrade_check", {
      stale_tiers: String(r.length)
    });
    let s = (await Promise.all(r.map(async i => {
      let a = await probeBedrockModel(i.toBedrockId, i.tier);
      logEvent("tengu_bedrock_probe_result", {
        tier: i.tier,
        model_id: sm(i.toBedrockId),
        accessible: a
      });
      return a ? i : null;
    }))).filter(i => i !== null);
    logForDebugging(`[bedrock-upgrade] tiersWithPin=${e.length} candidates=${s.length}`);
    return s;
  }
  async function checkBedrockDefaultAvailability() {
    if (getAPIProvider() !== "bedrock") {
      return [];
    }
    if (st(process.env.CLAUDE_CODE_PROVIDER_MANAGED_BY_HOST)) {
      return [];
    }
    let e = getInitialSettings().modelOverrides;
    let t = [];
    for (let i of Object.keys(M_r)) {
      let a = M_r[i];
      if (e?.[xa[a.defaultKey].firstParty]) {
        continue;
      }
      if (a.envVarPriority.some(c => {
        let u = process.env[c];
        if (!u) {
          return false;
        }
        let d = qqc(u);
        if (!d) {
          return true;
        }
        return _ts(d) === i;
      })) {
        continue;
      }
      t.push({
        tier: i,
        envVar: a.envVarPriority.at(-1),
        defaultKey: a.defaultKey
      });
    }
    if (t.length === 0) {
      return [];
    }
    logEvent("tengu_bedrock_default_check", {
      unpinned_tiers: String(t.length)
    });
    let n;
    try {
      n = await dqe();
    } catch {
      n = [];
    }
    let r = $le(await Ej());
    let o = await Promise.all(t.map(async i => {
      let a = xa[i.defaultKey];
      let l = Wqc(i.defaultKey, n, r);
      if (!l) {
        return null;
      }
      let c = await probeBedrockModel(l, i.tier);
      if (logEvent("tengu_bedrock_probe_result", {
        tier: i.tier,
        model_id: sm(l),
        accessible: c
      }), c) {
        return null;
      }
      let u = await v$f(i.defaultKey, i.tier, n, r, e);
      if (!u) {
        return null;
      }
      let d = getMarketingNameForModel(a.firstParty);
      let p = getMarketingNameForModel(xa[u.key].firstParty);
      if (!d || !p) {
        return null;
      }
      return {
        tier: i.tier,
        envVar: i.envVar,
        defaultKey: i.defaultKey,
        defaultName: d,
        fallbackKey: u.key,
        fallbackName: p,
        fallbackBedrockId: u.regionalId,
        ...(u.crossTier && {
          crossTier: true
        })
      };
    }));
    let s = [];
    for (let i of o) {
      if (i !== null) {
        s.push(i);
      }
    }
    logForDebugging(`[bedrock-fallback] unpinnedTiers=${t.length} fallbacks=${s.length}`);
    return s;
  }
  function Wqc(e, t, n) {
    let r = xa[e];
    let o = pqe(t, r.firstParty, n);
    if (o) {
      return o;
    }
    if (!r.bedrock) {
      return null;
    }
    return ZAe(r.bedrock, n);
  }
  async function v$f(e, t, n, r, o) {
    async function s(l, c) {
      let u = Wqc(l, n, r);
      if (!u) {
        return null;
      }
      return (await probeBedrockModel(u, c)) ? u : null;
    }
    let i = w$f(e, t).filter(l => !o?.[xa[l].firstParty]);
    let a = await Promise.all(i.map(l => s(l, t)));
    for (let [l, c] of a.entries()) {
      if (c) {
        return {
          key: i[l],
          regionalId: c
        };
      }
    }
    if (t === "opus") {
      let l = await s("sonnet45", "sonnet");
      if (l) {
        return {
          key: "sonnet45",
          regionalId: l,
          crossTier: true
        };
      }
    }
    return null;
  }
  function w$f(e, t) {
    let n = ssn.indexOf(e);
    let r = [];
    for (let o = n - 1; o >= 0; o--) {
      let s = ssn[o];
      if (_ts(s) === t) {
        r.push(s);
      }
    }
    return r;
  }
  async function probeBedrockModel(e, t) {
    try {
      let [{
        AnthropicBedrock: n
      }, {
        getProxyFetchOptions: r
      }] = await Promise.all([Promise.resolve().then(() => (Vqe(), Gqe)), Promise.resolve().then(() => (Fh(), BAe))]);
      let o = t === "haiku" && process.env.ANTHROPIC_SMALL_FAST_MODEL_AWS_REGION ? process.env.ANTHROPIC_SMALL_FAST_MODEL_AWS_REGION : await Ej();
      let s = {
        awsRegion: o,
        maxRetries: 0,
        timeout: 8000,
        fetchOptions: r({
          url: process.env.ANTHROPIC_BEDROCK_BASE_URL || `https://bedrock-runtime.${o}.amazonaws.com`
        })
      };
      let i;
      if (process.env.AWS_BEARER_TOKEN_BEDROCK) {
        i = new n({
          ...s,
          apiKey: process.env.AWS_BEARER_TOKEN_BEDROCK
        });
      } else {
        let a = st(process.env.CLAUDE_CODE_SKIP_BEDROCK_AUTH);
        let l = a ? null : await refreshAndGetAwsCredentials();
        i = l ? new n({
          ...s,
          awsAccessKey: l.accessKeyId,
          awsSecretKey: l.secretAccessKey,
          awsSessionToken: l.sessionToken
        }) : new n({
          ...s,
          ...(a && {
            skipAuth: true
          })
        });
      }
      await i.messages.create({
        model: e,
        max_tokens: 1,
        messages: [{
          role: "user",
          content: "."
        }]
      });
      return true;
    } catch (n) {
      if (n?.status === 429) {
        return true;
      }
      return false;
    }
  }
  var ssn;
  var M_r;
  var Sts = __lazy(() => {
    Ot();
    cJ();
    no();
    JHe();
    je();
    gn();
    Hle();
    zN();
    Eo();
    Ds();
    ssn = Object.keys(xa);
    M_r = {
      sonnet: {
        envVarPriority: ["ANTHROPIC_DEFAULT_SONNET_MODEL"],
        defaultKey: "sonnet45"
      },
      opus: {
        envVarPriority: ["ANTHROPIC_DEFAULT_OPUS_MODEL"],
        defaultKey: "opus46"
      },
      haiku: {
        envVarPriority: ["ANTHROPIC_SMALL_FAST_MODEL", "ANTHROPIC_DEFAULT_HAIKU_MODEL"],
        defaultKey: "haiku45"
      }
    };
  });
  var Ets = {};
  __export(Ets, {
    vertexUpgradeKey: () => vertexUpgradeKey,
    probeVertexModel: () => probeVertexModel,
    findVertexUpgradeCandidates: () => findVertexUpgradeCandidates,
    checkVertexDefaultAvailability: () => checkVertexDefaultAvailability
  });
  function Tts(e) {
    if (e.startsWith("sonnet")) {
      return "sonnet";
    }
    if (e.startsWith("opus")) {
      return "opus";
    }
    if (e.startsWith("haiku")) {
      return "haiku";
    }
    return;
  }
  function Gqc(e) {
    let t = firstPartyNameToCanonical(e);
    for (let n of isn) {
      if (firstPartyNameToCanonical(xa[n].firstParty) === t) {
        return n;
      }
    }
    return;
  }
  function vertexUpgradeKey(e) {
    return `${e.fromKey}-to-${e.toKey}`;
  }
  async function findVertexUpgradeCandidates() {
    if (getAPIProvider() !== "vertex") {
      return [];
    }
    if (st(process.env.CLAUDE_CODE_PROVIDER_MANAGED_BY_HOST)) {
      return [];
    }
    let e = [];
    for (let r of Object.keys(L_r)) {
      let o = L_r[r];
      let s;
      let i;
      for (let u of o.envVarPriority) {
        let d = process.env[u];
        if (!d) {
          continue;
        }
        let p = Gqc(d);
        if (!p || Tts(p) !== r || p === o.defaultKey) {
          continue;
        }
        s = u;
        i = p;
        break;
      }
      if (!s || !i) {
        continue;
      }
      let a = o.defaultKey;
      let l = isn.indexOf(i);
      let c = isn.indexOf(a);
      if (l >= c) {
        continue;
      }
      e.push({
        tier: r,
        envVar: s,
        pinnedKey: i,
        defaultKey: a
      });
    }
    if (e.length === 0) {
      return [];
    }
    logEvent("tengu_vertex_upgrade_check", {
      stale_tiers: String(e.length)
    });
    let n = (await Promise.all(e.map(async r => {
      let o = xa[r.defaultKey].vertex;
      if (o === null) {
        return null;
      }
      let s = await probeVertexModel(o);
      if (logEvent("tengu_vertex_probe_result", {
        tier: r.tier,
        model_id: sm(o),
        accessible: s
      }), !s) {
        return null;
      }
      let i = getMarketingNameForModel(xa[r.pinnedKey].firstParty);
      let a = getMarketingNameForModel(xa[r.defaultKey].firstParty);
      if (!i || !a) {
        return null;
      }
      return {
        tier: r.tier,
        envVar: r.envVar,
        fromKey: r.pinnedKey,
        fromMarketingName: i,
        toKey: r.defaultKey,
        toMarketingName: a,
        toVertexId: o
      };
    }))).filter(r => r !== null);
    logForDebugging(`[vertex-upgrade] tiersWithPin=${e.length} candidates=${n.length}`);
    return n;
  }
  async function checkVertexDefaultAvailability() {
    if (getAPIProvider() !== "vertex") {
      return [];
    }
    if (st(process.env.CLAUDE_CODE_PROVIDER_MANAGED_BY_HOST)) {
      return [];
    }
    let e = getInitialSettings().modelOverrides;
    let t = [];
    for (let o of Object.keys(L_r)) {
      let s = L_r[o];
      if (e?.[xa[s.defaultKey].firstParty]) {
        continue;
      }
      if (s.envVarPriority.some(a => {
        let l = process.env[a];
        if (!l) {
          return false;
        }
        let c = Gqc(l);
        if (!c) {
          return true;
        }
        return Tts(c) === o;
      })) {
        continue;
      }
      t.push({
        tier: o,
        envVar: s.envVarPriority.at(-1),
        defaultKey: s.defaultKey
      });
    }
    if (t.length === 0) {
      return [];
    }
    logEvent("tengu_vertex_default_check", {
      unpinned_tiers: String(t.length)
    });
    let n = await Promise.all(t.map(async o => {
      let s = xa[o.defaultKey];
      let i = await probeVertexModel(s.vertex);
      if (logEvent("tengu_vertex_probe_result", {
        tier: o.tier,
        model_id: sm(s.vertex),
        accessible: i
      }), i) {
        return null;
      }
      let a = await k$f(o.defaultKey, o.tier, e);
      if (!a) {
        return null;
      }
      let l = getMarketingNameForModel(s.firstParty);
      let c = getMarketingNameForModel(xa[a.key].firstParty);
      if (!l || !c) {
        return null;
      }
      return {
        tier: o.tier,
        envVar: o.envVar,
        defaultKey: o.defaultKey,
        defaultName: l,
        fallbackKey: a.key,
        fallbackName: c,
        fallbackVertexId: xa[a.key].vertex,
        ...(a.crossTier && {
          crossTier: true
        })
      };
    }));
    let r = [];
    for (let o of n) {
      if (o !== null) {
        r.push(o);
      }
    }
    logForDebugging(`[vertex-fallback] unpinnedTiers=${t.length} fallbacks=${r.length}`);
    return r;
  }
  async function k$f(e, t, n) {
    let r = A$f(e, t).filter(s => !n?.[xa[s].firstParty]);
    let o = await Promise.all(r.map(s => probeVertexModel(xa[s].vertex)));
    for (let [s, i] of o.entries()) {
      if (i) {
        return {
          key: r[s]
        };
      }
    }
    if (t === "opus") {
      let s = "sonnet45";
      if (await probeVertexModel(xa[s].vertex)) {
        return {
          key: s,
          crossTier: true
        };
      }
    }
    return null;
  }
  function A$f(e, t) {
    let n = isn.indexOf(e);
    let r = [];
    for (let o = n - 1; o >= 0; o--) {
      let s = isn[o];
      if (Tts(s) === t) {
        r.push(s);
      }
    }
    return r;
  }
  async function probeVertexModel(e) {
    if (e === null) {
      return false;
    }
    try {
      let [{
        AnthropicVertex: t
      }, {
        getProxyFetchOptions: n
      }] = await Promise.all([Promise.resolve().then(() => (BBt(), UBt)), Promise.resolve().then(() => (Fh(), BAe))]);
      if (!st(process.env.CLAUDE_CODE_SKIP_VERTEX_AUTH)) {
        await refreshGcpCredentialsIfNeeded();
      }
      let r = process.env.GCLOUD_PROJECT || process.env.GOOGLE_CLOUD_PROJECT || process.env.gcloud_project || process.env.google_cloud_project;
      let o = process.env.GOOGLE_APPLICATION_CREDENTIALS || process.env.google_application_credentials;
      let s = r || o ? undefined : process.env.ANTHROPIC_VERTEX_PROJECT_ID;
      let i = await buildVertexGoogleAuth(st(process.env.CLAUDE_CODE_SKIP_VERTEX_AUTH) ? {
        kind: "skip"
      } : {
        kind: "default"
      }, s);
      let a = Dae(e);
      await new t({
        region: a,
        googleAuth: i,
        maxRetries: 0,
        timeout: 8000,
        fetchOptions: n({
          url: process.env.ANTHROPIC_VERTEX_BASE_URL || kZe(a)
        })
      }).messages.create({
        model: e,
        max_tokens: 1,
        messages: [{
          role: "user",
          content: "."
        }]
      });
      return true;
    } catch (t) {
      if (t?.status === 429) {
        return true;
      }
      return false;
    }
  }
  var isn;
  var L_r;
  var vts = __lazy(() => {
    Ot();
    cJ();
    no();
    je();
    gn();
    zN();
    Eo();
    Ds();
    Y0n();
    isn = Object.keys(xa);
    L_r = {
      sonnet: {
        envVarPriority: ["ANTHROPIC_DEFAULT_SONNET_MODEL"],
        defaultKey: "sonnet45"
      },
      opus: {
        envVarPriority: ["ANTHROPIC_DEFAULT_OPUS_MODEL"],
        defaultKey: "opus46"
      },
      haiku: {
        envVarPriority: ["ANTHROPIC_SMALL_FAST_MODEL", "ANTHROPIC_DEFAULT_HAIKU_MODEL"],
        defaultKey: "haiku45"
      }
    };
  });
  var zqc = {};
  __export(zqc, {
    probeMantleModel: () => probeMantleModel,
    checkMantleDefaultAvailability: () => checkMantleDefaultAvailability
  });
  async function checkMantleDefaultAvailability(e = "opus47") {
    if (getAPIProvider() !== "mantle") {
      return [];
    }
    if (Me.CLAUDE_CODE_PROVIDER_MANAGED_BY_HOST) {
      return [];
    }
    let t = getInitialSettings().modelOverrides;
    if (Me.ANTHROPIC_DEFAULT_OPUS_MODEL || t?.[xa[e].firstParty]) {
      return [];
    }
    let n = xa[e].mantle;
    if (!n) {
      return [];
    }
    logEvent("tengu_mantle_default_check", {});
    let r = await probeMantleModel(n);
    if (logEvent("tengu_mantle_probe_result", {
      model_key: e,
      accessible: r ? "true" : "false"
    }), r) {
      return [];
    }
    let o = getMarketingNameForModel(xa[e].firstParty) ?? n;
    let s = Vqc.indexOf(e);
    let i = Vqc.slice(0, s).reverse().filter(c => c.startsWith("opus") && !t?.[xa[c].firstParty]);
    let a = await Promise.all(i.map(async c => {
      let u = xa[c].mantle;
      let d = await probeMantleModel(u);
      logEvent("tengu_mantle_probe_result", {
        model_key: c,
        accessible: d ? "true" : "false"
      });
      let p = getMarketingNameForModel(xa[c].firstParty) ?? u;
      return {
        key: c,
        mantleId: u,
        name: p,
        ok: d
      };
    }));
    for (let c of a) {
      if (c.ok) {
        logForDebugging(`[mantle-fallback] default=${e} fallback=${c.key}`);
        return [{
          kind: "fallback",
          tier: "opus",
          envVar: "ANTHROPIC_DEFAULT_OPUS_MODEL",
          defaultKey: e,
          defaultName: o,
          fallbackKey: c.key,
          fallbackName: c.name,
          fallbackMantleId: c.mantleId
        }];
      }
    }
    let l = [o, ...a.map(c => c.name)];
    logForDebugging(`[mantle-fallback] default=${e} exhausted \u2014 no working Opus`);
    return [{
      kind: "exhausted",
      tier: "opus",
      defaultName: o,
      triedNames: l
    }];
  }
  async function probeMantleModel(e) {
    try {
      let [{
        AnthropicBedrockMantle: t
      }, {
        getProxyFetchOptions: n
      }] = await Promise.all([Promise.resolve().then(() => (Vqe(), Gqe)), Promise.resolve().then(() => (Fh(), BAe))]);
      let r = await Ej();
      let o = {
        awsRegion: r,
        maxRetries: 0,
        timeout: 8000,
        fetchOptions: n({
          url: Me.ANTHROPIC_BEDROCK_MANTLE_BASE_URL || `https://bedrock-mantle.${r}.api.aws`
        })
      };
      let s;
      let i = Me.AWS_BEARER_TOKEN_BEDROCK;
      if (i) {
        s = new t({
          ...o,
          apiKey: i
        });
      } else {
        let a = Me.CLAUDE_CODE_SKIP_MANTLE_AUTH;
        let l = a ? null : await refreshAndGetAwsCredentials();
        s = l ? new t({
          ...o,
          awsAccessKey: l.accessKeyId,
          awsSecretAccessKey: l.secretAccessKey,
          awsSessionToken: l.sessionToken
        }) : new t({
          ...o,
          ...(a && {
            skipAuth: true
          })
        });
      }
      await s.messages.create({
        model: e,
        max_tokens: 1,
        messages: [{
          role: "user",
          content: "."
        }]
      });
      return true;
    } catch (t) {
      if (t?.status === 429) {
        return true;
      }
      return false;
    }
  }
  var Vqc;
  var Kqc = __lazy(() => {
    Ot();
    no();
    JHe();
    je();
    d_();
    zN();
    Eo();
    Ds();
    Vqc = Object.keys(xa).filter(e => xa[e].mantle !== null);
  });
  var Jqc = {};
  __export(Jqc, {
    withProbeDeadline: () => withProbeDeadline,
    apply3PDefaultFallbacks: () => apply3PDefaultFallbacks,
    TIER_LABELS: () => TIER_LABELS
  });
  async function withProbeDeadline(e, t) {
    let n;
    try {
      return await Promise.race([t, new Promise(r => {
        n = setTimeout((o, s) => {
          logForDebugging(`[3p-probe] ${s} hit ${20000}ms deadline; proceeding without it`);
          o([]);
        }, 20000, r, e);
      })]);
    } finally {
      clearTimeout(n);
    }
  }
  async function apply3PDefaultFallbacks() {
    switch (getAPIProvider()) {
      case "bedrock":
        return {
          lines: await P$f(),
          hasHardFailure: false
        };
      case "vertex":
        return {
          lines: await O$f(),
          hasHardFailure: false
        };
      case "mantle":
        return D$f();
      default:
        return {
          lines: [],
          hasHardFailure: false
        };
    }
  }
  async function P$f() {
    let {
      checkBedrockDefaultAvailability: e
    } = await Promise.resolve().then(() => (Sts(), bts));
    let t = await withProbeDeadline("bedrock-fallback", e());
    let n = [];
    for (let r of t) {
      if (process.env[r.envVar] = r.fallbackBedrockId, r.tier === "haiku") {
        process.env.ANTHROPIC_DEFAULT_HAIKU_MODEL = r.fallbackBedrockId;
      }
      if (r.crossTier) {
        process.env.ANTHROPIC_DEFAULT_OPUS_MODEL_NAME = r.fallbackName;
        process.env.ANTHROPIC_DEFAULT_OPUS_MODEL_DESCRIPTION = `Opus unavailable \u2014 using ${r.fallbackName}`;
      }
      logEvent("tengu_bedrock_default_fallback", {
        tier: r.tier,
        default_key: r.defaultKey,
        fallback_key: r.fallbackKey,
        cross_tier: r.crossTier ? "true" : "false"
      });
      n.push(r.crossTier ? `${TIER_LABELS[r.tier]}: ${r.defaultName} not available \u2014 using ${r.fallbackName}. Enable ${r.defaultName} in the Bedrock console to upgrade.` : `${TIER_LABELS[r.tier]}: ${r.defaultName} not available \u2014 using ${r.fallbackName} for this session`);
    }
    return n;
  }
  async function O$f() {
    let {
      checkVertexDefaultAvailability: e
    } = await Promise.resolve().then(() => (vts(), Ets));
    let t = await withProbeDeadline("vertex-fallback", e());
    let n = [];
    for (let r of t) {
      if (process.env[r.envVar] = r.fallbackVertexId, r.tier === "haiku") {
        process.env.ANTHROPIC_DEFAULT_HAIKU_MODEL = r.fallbackVertexId;
      }
      if (r.crossTier) {
        process.env.ANTHROPIC_DEFAULT_OPUS_MODEL_NAME = r.fallbackName;
        process.env.ANTHROPIC_DEFAULT_OPUS_MODEL_DESCRIPTION = `Opus unavailable \u2014 using ${r.fallbackName}`;
      }
      logEvent("tengu_vertex_default_fallback", {
        tier: r.tier,
        default_key: r.defaultKey,
        fallback_key: r.fallbackKey,
        cross_tier: r.crossTier ? "true" : "false"
      });
      n.push(r.crossTier ? `${TIER_LABELS[r.tier]}: ${r.defaultName} not available \u2014 using ${r.fallbackName}. Enable ${r.defaultName} in Model Garden to upgrade.` : `${TIER_LABELS[r.tier]}: ${r.defaultName} not available \u2014 using ${r.fallbackName} for this session`);
    }
    return n;
  }
  async function D$f() {
    let {
      checkMantleDefaultAvailability: e
    } = await Promise.resolve().then(() => (Kqc(), zqc));
    let t = await withProbeDeadline("mantle-fallback", e());
    let n = [];
    let r = false;
    let o;
    for (let s of t) {
      if (s.kind === "fallback") {
        if (process.env[s.envVar] = s.fallbackMantleId, getUserSpecifiedModelSetting() == null) {
          setMainLoopModelOverride(s.fallbackMantleId);
          o = s.fallbackMantleId;
        }
        logEvent("tengu_mantle_default_fallback", {
          default_key: s.defaultKey,
          fallback_key: s.fallbackKey
        });
        n.push(`${TIER_LABELS[s.tier]}: ${s.defaultName} not available \u2014 using ${s.fallbackName} for this session`);
      } else {
        r = true;
        logEvent("tengu_mantle_default_fallback", {
          default_key: "exhausted"
        });
        n.push(`${TIER_LABELS[s.tier]}: no accessible model (tried ${s.triedNames.join(", ")}). Enable ${s.defaultName} in Amazon Bedrock (Mantle).`);
      }
    }
    return {
      lines: n,
      hasHardFailure: r,
      mantleOverride: o
    };
  }
  var TIER_LABELS;
  var Rts = __lazy(() => {
    at();
    Ot();
    je();
    Eo();
    Ds();
    TIER_LABELS = {
      fable: "Fable",
      sonnet: "Sonnet",
      opus: "Opus",
      haiku: "Haiku"
    };
  });
  async function M$f() {
    try {
      let e = getOauthConfig();
      let t = new URL(e.TOKEN_URL);
      let n = [`${e.BASE_API_URL}/api/hello`, `${t.origin}/v1/oauth/hello`];
      let r = async i => {
        try {
          let a = await NP.get(i, {
            headers: {
              "User-Agent": getUserAgent()
            }
          });
          if (a.status !== 200) {
            return {
              success: false,
              error: `Failed to connect to ${new URL(i).hostname}: Status ${a.status}`
            };
          }
          return {
            success: true
          };
        } catch (a) {
          let l = new URL(i).hostname;
          let c = RDe(a);
          return {
            success: false,
            error: `Failed to connect to ${l}: ${a instanceof Error ? a.code || a.message : String(a)}`,
            sslHint: c ?? undefined
          };
        }
      };
      let s = (await Promise.all(n.map(r))).find(i => !i.success);
      if (s) {
        logEvent("tengu_preflight_check_failed", {
          isConnectivityError: false,
          hasErrorMessage: !!s.error,
          isSSLError: !!s.sslHint
        });
      }
      return s || {
        success: true
      };
    } catch (e) {
      Oe(e);
      logEvent("tengu_preflight_check_failed", {
        isConnectivityError: true
      });
      return {
        success: false,
        error: `Connectivity check error: ${e instanceof Error ? e.code || e.message : String(e)}`
      };
    }
  }
  function Qqc(e) {
    let t = Xqc.c(14);
    let {
      onSuccess: n
    } = e;
    let [r, o] = Gxt.useState(null);
    let [s, i] = Gxt.useState(true);
    let a = useTimeout(1000) && s;
    let l;
    let c;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      l = () => {
        (async function () {
          let g = await M$f();
          o(g);
          i(false);
        })();
      };
      c = [];
      t[0] = l;
      t[1] = c;
    } else {
      l = t[0];
      c = t[1];
    }
    Gxt.useEffect(l, c);
    let u;
    if (t[2] !== n || t[3] !== r?.success) {
      u = () => {
        if (r?.success) {
          n();
        }
      };
      t[2] = n;
      t[3] = r?.success;
      t[4] = u;
    } else {
      u = t[4];
    }
    let d;
    if (t[5] !== n || t[6] !== r) {
      d = [r, n];
      t[5] = n;
      t[6] = r;
      t[7] = d;
    } else {
      d = t[7];
    }
    Gxt.useEffect(u, d);
    useTimeout(N$f, r && !r.success ? 100 : null);
    let p;
    if (t[8] !== s || t[9] !== r || t[10] !== a) {
      p = s && a ? $H.jsxs(gXd, {
        paddingLeft: 1,
        children: [$H.jsx(Ed, {}), $H.jsx(Text, {
          children: "Checking connectivity..."
        })]
      }) : !r?.success && !s && $H.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [$H.jsx(Text, {
          color: "error",
          children: "Unable to connect to Anthropic services"
        }), $H.jsx(Text, {
          color: "error",
          children: r?.error
        }), r?.sslHint ? $H.jsxs(gXd, {
          flexDirection: "column",
          gap: 1,
          children: [$H.jsx(Text, {
            children: r.sslHint
          }), $H.jsx(Text, {
            color: "suggestion",
            children: "See https://code.claude.com/docs/en/network-config"
          })]
        }) : $H.jsxs(gXd, {
          flexDirection: "column",
          gap: 1,
          children: [$H.jsx(Text, {
            children: "Please check your internet connection and network settings."
          }), $H.jsxs(Text, {
            children: ["Note: Claude Code might not be available in your country. Check supported countries at", " ", $H.jsx(Text, {
              color: "suggestion",
              children: "https://anthropic.com/supported-countries"
            })]
          })]
        })]
      });