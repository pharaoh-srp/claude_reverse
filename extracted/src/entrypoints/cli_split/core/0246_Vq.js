  function Vq() {
    throw Error("@ant/computer-use-swift is macOS-only");
  }
  var pEp;
  function mEp(e) {
    e._drainMainRunLoop();
  }
  function s_a() {
    if (LHn++, rWt === undefined) {
      rWt = setInterval(mEp, 1, Vq());
      logForDebugging("[drainRunLoop] pump started", {
        level: "verbose"
      });
    }
  }
  function i_a() {
    if (LHn--, LHn <= 0 && rWt !== undefined) {
      clearInterval(rWt);
      rWt = undefined;
      logForDebugging("[drainRunLoop] pump stopped", {
        level: "verbose"
      });
      LHn = 0;
    }
  }
  function hEp(e, t) {
    e(new a_a(t));
  }
  async function hoe(e, t = 30000) {
    s_a();
    let n;
    try {
      let r = e();
      r.catch(() => {});
      let o = Promise.withResolvers();
      n = setTimeout(hEp, t, o.reject, t);
      return await Promise.race([r, o.promise]);
    } finally {
      clearTimeout(n);
      i_a();
    }
  }
  var rWt;
  var LHn = 0;
  var a_a;
  function u_a(e) {
    if (oWt) {
      return true;
    }
    if (!Vq().hotkey.registerEscape(e)) {
      logForDebugging("[cu-esc] registerEscape returned false", {
        level: "warn"
      });
      Et("computeruse_esc_register", "tap_create_failed");
      return false;
    }
    s_a();
    oWt = true;
    logForDebugging("[cu-esc] registered");
    Pe("computeruse_esc_register");
    return true;
  }
  function d_a() {
    if (!oWt) {
      return;
    }
    try {
      Vq().hotkey.unregister();
    } finally {
      i_a();
      oWt = false;
      logForDebugging("[cu-esc] unregistered");
    }
  }
  function gmo() {
    if (!oWt) {
      return;
    }
    Vq().hotkey.notifyExpectedEscape();
  }
  var oWt = false;
  var UHn = __lazy(() => {
    ln();
    je();
  });
  function OTe(e, t) {
    e(n => {
      let r = t(n.computerUseMcpState);
      if (r === n.computerUseMcpState) {
        return n;
      }
      return {
        ...n,
        computerUseMcpState: r
      };
    });
  }
  var jX;
  var BHn = __lazy(() => {
    jX = {
      clipboardRead: false,
      clipboardWrite: false,
      systemKeyCombos: false
    };
  });
  function p_a(e, t) {
    return Math.floor((e - 1) / t) + 1;
  }
  function m_a(e, t, n) {
    return p_a(e, n) * p_a(t, n);
  }
  function $Hn(e, t, n) {
    let {
      pxPerToken: r,
      maxTargetPx: o,
      maxTargetTokens: s
    } = n;
    if (e <= o && t <= o && m_a(e, t, r) <= s) {
      return [e, t];
    }
    if (t > e) {
      let [c, u] = $Hn(t, e, n);
      return [u, c];
    }
    let i = e / t;
    let a = e;
    let l = 1;
    for (;;) {
      if (l + 1 === a) {
        return [l, Math.max(Math.round(l / i), 1)];
      }
      let c = Math.floor((l + a) / 2);
      let u = Math.max(Math.round(c / i), 1);
      if (c <= o && m_a(c, u, r) <= s) {
        l = c;
      } else {
        a = c;
      }
    }
  }
  var ymo;
  var f_a = __lazy(() => {
    ymo = {
      pxPerToken: 28,
      maxTargetPx: 1568,
      maxTargetTokens: 1568
    };
  });
  function gEp(e) {
    if (e === "browser" || e === "trading") {
      return "read";
    }
    if (e === "terminal") {
      return "click";
    }
    return "full";
  }
  function HHn(e, t) {
    if (e && SEp.vZc(e)) {
      return true;
    }
    let n = t.toLowerCase();
    for (let r of TEp) {
      if (n.includes(r)) {
        return true;
      }
    }
    return false;
  }
  function EEp(e) {
    if (yEp.vZc(e)) {
      return "browser";
    }
    if (_Ep.vZc(e)) {
      return "terminal";
    }
    if (bEp.vZc(e)) {
      return "trading";
    }
    return null;
  }
  function REp(e) {
    let t = e.toLowerCase();
    for (let n of CEp) {
      if (t.includes(n)) {
        return "trading";
      }
    }
    for (let n of vEp) {
      if (t.includes(n)) {
        return "browser";
      }
    }
    for (let n of wEp) {
      if (t.includes(n)) {
        return "terminal";
      }
    }
    return null;
  }
  function Upt(e, t) {
    if (e) {
      let n = EEp(e);
      if (n) {
        return n;
      }
    }
    return REp(t);
  }
  function _mo(e, t) {
    return gEp(Upt(e, t));
  }
  var yEp;
  var _Ep;
  var bEp;
  var SEp;
  var TEp;
  var vEp;
  var wEp;
  var CEp;
  var h_a = __lazy(() => {
    yEp = new Set(["com.apple.Safari", "com.apple.SafariTechnologyPreview", "com.google.Chrome", "com.google.Chrome.beta", "com.google.Chrome.dev", "com.google.Chrome.canary", "com.microsoft.edgemac", "com.microsoft.edgemac.Beta", "com.microsoft.edgemac.Dev", "com.microsoft.edgemac.Canary", "org.mozilla.firefox", "org.mozilla.firefoxdeveloperedition", "org.mozilla.nightly", "org.chromium.Chromium", "com.brave.Browser", "com.brave.Browser.beta", "com.brave.Browser.nightly", "com.operasoftware.Opera", "com.operasoftware.OperaGX", "com.operasoftware.OperaDeveloper", "com.vivaldi.Vivaldi", "company.thebrowser.Browser", "company.thebrowser.dia", "org.torproject.torbrowser", "com.duckduckgo.macos.browser", "ru.yandex.desktop.yandex-browser", "ai.perplexity.comet", "com.sigmaos.sigmaos.macos", "com.kagi.kagimacOS"]);
    _Ep = new Set(["com.apple.Terminal", "com.googlecode.iterm2", "dev.warp.Warp-Stable", "dev.warp.Warp-Beta", "com.github.wez.wezterm", "org.alacritty", "io.alacritty", "net.kovidgoyal.kitty", "co.zeit.hyper", "com.mitchellh.ghostty", "org.tabby", "com.termius-dmg.mac", "com.microsoft.VSCode", "com.microsoft.VSCodeInsiders", "com.vscodium", "com.todesktop.230313mzl4w4u92", "com.exafunction.windsurf", "dev.zed.Zed", "dev.zed.Zed-Preview", "com.jetbrains.intellij", "com.jetbrains.intellij.ce", "com.jetbrains.pycharm", "com.jetbrains.pycharm.ce", "com.jetbrains.WebStorm", "com.jetbrains.CLion", "com.jetbrains.goland", "com.jetbrains.rubymine", "com.jetbrains.PhpStorm", "com.jetbrains.datagrip", "com.jetbrains.rider", "com.jetbrains.AppCode", "com.jetbrains.rustrover", "com.jetbrains.fleet", "com.google.android.studio", "com.axosoft.gitkraken", "com.sublimetext.4", "com.sublimetext.3", "org.vim.MacVim", "com.neovim.neovim", "org.gnu.Emacs", "com.apple.dt.Xcode", "org.eclipse.platform.ide", "org.netbeans.ide", "com.microsoft.visual-studio", "com.apple.ScriptEditor2", "com.apple.Automator", "com.apple.shortcuts"]);
    bEp = new Set(["com.webull.desktop.v1", "com.webull.trade.mac.v1", "com.tastytrade.desktop", "com.tradingview.tradingviewapp.desktop", "com.fidelity.activetrader", "com.fmr.activetrader", "com.install4j.5889-6375-8446-2021", "com.binance.BinanceDesktop", "com.electron.exodus", "org.pythonmac.unspecified.Electrum", "com.ledger.live", "io.trezor.TrezorSuite"]);
    SEp = new Set(["com.apple.TV", "com.apple.Music", "com.apple.iBooksX", "com.apple.podcasts", "com.spotify.client", "com.amazon.music", "com.tidal.desktop", "com.deezer.deezer-desktop", "com.pandora.desktop", "com.electron.pocket-casts", "au.com.shiftyjelly.PocketCasts", "tv.plex.desktop", "tv.plex.htpc", "tv.plex.plexamp", "com.amazon.aiv.AIVApp", "net.kovidgoyal.calibre", "com.amazon.Kindle", "com.amazon.Lassen", "com.kobo.desktop.Kobo"]);
    TEp = ["netflix", "disney+", "hulu", "prime video", "apple tv", "peacock", "paramount+", "tubi", "crunchyroll", "vudu", "kindle", "apple books", "kobo", "play books", "calibre", "libby", "readium", "audible", "libro.fm", "speechify", "spotify", "apple music", "amazon music", "youtube music", "tidal", "deezer", "pandora", "pocket casts", "naver", "reddit", "sony music", "vegas pro", "pitchfork", "economist", "nytimes"];
    vEp = ["safari", "chrome", "firefox", "microsoft edge", "brave", "opera", "vivaldi", "chromium", "arc browser", "tor browser", "duckduckgo", "yandex", "orion browser", "comet", "sigmaos", "dia browser"];
    wEp = ["terminal", "iterm", "wezterm", "alacritty", "kitty", "ghostty", "tabby", "termius", "script editor", "automator", "powershell", "cmd.exe", "command prompt", "git bash", "conemu", "cmder", "visual studio code", "visual studio", "vscode", "vs code", "vscodium", "cursor", "windsurf", "intellij", "pycharm", "webstorm", "clion", "goland", "rubymine", "phpstorm", "datagrip", "rider", "appcode", "rustrover", "fleet", "android studio", "sublime text", "macvim", "neovim", "emacs", "xcode", "eclipse", "netbeans"];
    CEp = ["bloomberg", "ameritrade", "thinkorswim", "schwab", "fidelity", "e*trade", "interactive brokers", "trader workstation", "tradestation", "webull", "robinhood", "tastytrade", "ninjatrader", "tradingview", "moomoo", "tradezero", "prorealtime", "plus500", "saxotrader", "oanda", "metatrader", "forex.com", "avaoptions", "ctrader", "jforex", "iq option", "olymp trade", "binomo", "pocket option", "raceoption", "expertoption", "quotex", "naga", "morgan stanley", "ubs neo", "eikon", "coinbase", "kraken", "binance", "okx", "bybit", "phemex", "stormgain", "crypto.com", "electrum", "ledger live", "trezor", "guarda", "atomic wallet", "bitpay", "bisq", "koinly", "cointracker", "blockfi", "stripe cli", "decentraland", "axie infinity", "gods unchained"];
  });
  function IEp(e) {
    let t = e.toLowerCase().split("+").map(s => s.trim()).filter(Boolean);
    let n = [];
    let r = [];
    for (let s of t) {
      let i = xEp[s];
      if (i !== undefined) {
        n.push(i);
      } else {
        r.push(s);
      }
    }
    let o = [...new Set(n)];
    o.sort((s, i) => g_a.indexOf(s) - g_a.indexOf(i));
    return {
      mods: o,
      keys: r
    };
  }
  function jHn(e, t) {
    let n = t === "darwin" ? kEp : AEp;
    let {
      mods: r,
      keys: o
    } = IEp(e);
    let s = r.length > 0 ? r.join("+") + "+" : "";
    if (o.length === 0) {
      return n.vZc(r.join("+"));
    }
    for (let i of o) {
      if (n.vZc(s + i)) {
        return true;
      }
    }
    return false;
  }
  var xEp;
  var g_a;
  var kEp;
  var AEp;
  var y_a = __lazy(() => {
    xEp = {
      meta: "meta",
      super: "meta",
      command: "meta",
      cmd: "meta",
      windows: "meta",
      win: "meta",
      ctrl: "ctrl",
      control: "ctrl",
      lctrl: "ctrl",
      lcontrol: "ctrl",
      rctrl: "ctrl",
      rcontrol: "ctrl",
      shift: "shift",
      lshift: "shift",
      rshift: "shift",
      alt: "alt",
      option: "alt"
    };
    g_a = ["ctrl", "alt", "shift", "meta"];
    kEp = new Set(["meta+q", "shift+meta+q", "alt+meta+escape", "meta+tab", "meta+space", "ctrl+meta+q"]);
    AEp = new Set(["ctrl+alt+delete", "alt+f4", "alt+tab", "meta+l", "meta+d"]);
  });
  function PEp(e, t, n, r, o) {
    if (!e || !t) {
      return null;
    }
    let s = Math.max(0, Math.min(100, n));
    let i = Math.max(0, Math.min(100, r));
    let a = Math.round(s / 100 * e);
    let l = Math.round(i / 100 * t);
    let c = Math.floor(o / 2);
    let u = Math.max(0, a - c);
    let d = Math.max(0, l - c);
    let p = Math.min(o, e - u);
    let m = Math.min(o, t - d);
    if (p <= 0 || m <= 0) {
      return null;
    }
    return {
      x: u,
      y: d,
      width: p,
      height: m
    };
  }
  function OEp(e, t, n, r, o, s = 9) {
    let i = PEp(n.width, n.height, r, o, s);
    if (!i) {
      return false;
    }
    let a = e(t.base64, i);
    let l = e(n.base64, i);
    if (!a || !l) {
      return false;
    }
    return a.equals(l);
  }
  async function __a(e, t, n, r, o, s, i = 9) {
    if (!t) {
      return {
        valid: true,
        skipped: true
      };
    }
    try {
      let a = await o();
      if (!a) {
        return {
          valid: true,
          skipped: true
        };
      }
      if (OEp(e, t, a, n, r, i)) {
        return {
          valid: true,
          skipped: false
        };
      }
      return {
        valid: false,
        skipped: false,
        warning: "Screen content at the target location changed since the last screenshot. Take a new screenshot before clicking."
      };
    } catch (a) {
      s.debug("[pixelCompare] validation error, skipping", a);
      return {
        valid: true,
        skipped: true
      };
    }
  }
  function v_a(e) {
    if (b_a.vZc(e)) {
      return "shell";
    }
    if (S_a.vZc(e)) {
      return "filesystem";
    }
    if (T_a.vZc(e)) {
      return "system_settings";
    }
    return null;
  }
  var b_a;
  var S_a;
  var T_a;
  var E_a;
  var bmo = __lazy(() => {
    b_a = new Set(["com.apple.Terminal", "com.googlecode.iterm2", "com.microsoft.VSCode", "dev.warp.Warp-Stable", "com.github.wez.wezterm", "io.alacritty", "net.kovidgoyal.kitty", "com.jetbrains.intellij", "com.jetbrains.pycharm"]);
    S_a = new Set(["com.apple.finder"]);
    T_a = new Set(["com.apple.systempreferences"]);
    E_a = new Set([...b_a, ...S_a, ...T_a]);
  });
  function Aa(e, t) {
    return {
      content: [{
        type: "text",
        text: e
      }],
      isError: true,
      telemetry: t ? {
        error_kind: t
      } : undefined
    };
  }
  function gU(e) {
    return {
      content: [{
        type: "text",
        text: e
      }]
    };
  }
  function hU(e, t) {
    return {
      content: [{
        type: "text",
        text: JSON.stringify(e)
      }],
      telemetry: t
    };
  }
  function DEp(e) {
    if (typeof e === "object" && e !== null) {
      return e;
    }
    return {};
  }
  function Fde(e, t) {
    let n = e[t];
    if (typeof n !== "string") {
      return Error(`"${t}" must be a string.`);
    }
    return n;
  }
  function lWt(e, t = "coordinate") {
    let n = e[t];
    if (n === undefined) {
      return Error(`${t} is required`);
    }
    if (!Array.isArray(n) || n.length !== 2) {
      return Error(`${t} must be an array of length 2`);
    }
    let [r, o] = n;
    if (typeof r !== "number" || typeof o !== "number" || r < 0 || o < 0) {
      return Error(`${t} must be a tuple of non-negative numbers`);
    }
    return [r, o];
  }
  function Bpt(e, t, n, r, o, s) {
    if (n === "normalized_0_100") {
      return {
        x: Math.round(e / 100 * r.width) + r.originX,
        y: Math.round(t / 100 * r.height) + r.originY
      };
    }
    if (o) {
      return {
        x: Math.round(e * (o.displayWidth / o.width)) + o.originX,
        y: Math.round(t * (o.displayHeight / o.height)) + o.originY
      };
    }
    s.warn("[computer-use] pixels-mode coordinate received with no prior screenshot; falling back to /scaleFactor. Click may be off if downsample is active.");
    return {
      x: Math.round(e / r.scaleFactor) + r.originX,
      y: Math.round(t / r.scaleFactor) + r.originY
    };
  }
  function MEp(e, t, n, r) {
    if (n === "normalized_0_100") {
      return {
        xPct: e,
        yPct: t
      };
    }
    if (!r) {
      return {
        xPct: 0,
        yPct: 0
      };
    }
    return {
      xPct: e / r.width * 100,
      yPct: t / r.height * 100
    };
  }
  function x_a(e, t) {
    let n = e ?? "full";
    if (t === "mouse_position") {
      return true;
    }
    if (t === "keyboard" || t === "mouse_full") {
      return n === "full";
    }
    return n === "click" || n === "full";
  }
  async function GHn(e, t, n) {
    let r = t.getClipboardStash?.();
    if (!n) {
      if (r === undefined) {
        return;
      }
      try {
        await e.executor.writeClipboard(r);
        t.onClipboardStashChanged?.(undefined);
      } catch {}
      return;
    }
    if (r === undefined) {
      try {
        let o = await e.executor.readClipboard();
        t.onClipboardStashChanged?.(o);
      } catch {
        t.onClipboardStashChanged?.("");
      }
    }
    try {
      await e.executor.writeClipboard("");
    } catch {}
  }
  async function DTe(e, t, n, r) {
    if (n.hideBeforeAction) {
      let l = await e.executor.prepareForAction(t.allowedApps.map(c => c.bundleId), t.selectedDisplayId);
      if (l.length > 0) {
        t.onAppsHidden?.(l);
      }
    }
    let o = await e.executor.getFrontmostApp();
    let s = new Map(t.allowedApps.map(l => [l.bundleId, l.tier]));
    let i = o ? s.get(o.bundleId) : undefined;
    if (n.clipboardGuard) {
      await GHn(e, t, i === "click");
    }
    if (!o) {
      return null;
    }
    let {
      hostBundleId: a
    } = e.executor.capabilities;
    if (i !== undefined) {
      if (x_a(i, r)) {
        return null;
      }
      if (i === "read") {
        let l = Upt(o.bundleId, o.displayName) === "browser";
        return Aa(`"${o.displayName}" is granted at tier "read" \u2014 ` + "visible in screenshots only, no clicks or typing." + (l ? " Use the Claude-in-Chrome MCP for browser interaction (tools named `mcp__Claude_in_Chrome__*`; load via ToolSearch if deferred)." : " No interaction is permitted; ask the user to take any actions in this app themselves.") + r5e, "tier_insufficient");
      }
      if (r === "keyboard") {
        return Aa(`"${o.displayName}" is granted at tier "click" \u2014 ` + `typing, key presses, and paste require tier "full". The keys would go to this app's text fields or integrated terminal. To type into a different app, click it first to bring it forward. For shell commands, use the Bash tool.` + r5e, "tier_insufficient");
      }
      return Aa(`"${o.displayName}" is granted at tier "click" \u2014 ` + 'right-click, middle-click, and clicks with modifier keys require tier "full". Right-click opens a context menu with Paste/Cut, and modifier chords fire as keystrokes before the click. Plain left_click is allowed here.' + r5e, "tier_insufficient");
    }
    if (o.bundleId === "com.apple.finder") {
      return null;
    }
    if (o.bundleId === a) {
      if (r !== "keyboard") {
        return null;
      }
      return Aa("Claude's own window still has keyboard focus. This should not happen after the pre-action defocus. Click on the target application first.", "state_conflict");
    }
    return Aa(`"${o.displayName}" is not in the allowed applications and is ` + "currently in front. Take a new screenshot \u2014 it may have appeared " + "since your last one.", "app_not_granted");
  }
  async function o5e(e, t, n, r, o, s) {
    let i = await e.executor.appUnderPoint(r, o);
    if (!i) {
      return null;
    }
    if (i.bundleId === "com.apple.finder") {
      return null;
    }
    let a = new Map(t.allowedApps.map(u => [u.bundleId, u.tier]));
    if (!a.vZc(i.bundleId)) {
      return Aa(`Click at these coordinates would land on "${i.displayName}", which is not in the allowed applications. Take a fresh screenshot to see the current window layout.`, "app_not_granted");
    }
    let l = a.get(i.bundleId);
    if (n.clipboardGuard && l === "click") {
      await GHn(e, t, true);
    }
    if (x_a(l, s)) {
      return null;
    }
    if (s === "mouse_full" && l === "click") {
      return Aa(`Click at these coordinates would land on "${i.displayName}", ` + 'which is granted at tier "click" \u2014 right-click, middle-click, and ' + 'clicks with modifier keys require tier "full" (they can Paste via the context menu or fire modifier-chord keystrokes). Plain left_click is allowed here.' + r5e, "tier_insufficient");
    }
    let c = Upt(i.bundleId, i.displayName) === "browser";
    return Aa(`Click at these coordinates would land on "${i.displayName}", which is granted at tier "read" (screenshots only, no interaction). ` + (c ? "Use the Claude-in-Chrome MCP for browser interaction." : "Ask the user to take any actions in this app themselves.") + r5e, "tier_insufficient");
  }
  function qHn(e) {
    let t = e.endsWith("==") ? 2 : e.endsWith("=") ? 1 : 0;
    return Math.floor(e.length * 3 / 4) - t;
  }
  async function NEp(e, t, n, r) {
    let o = await e.screenshot({
      allowedBundleIds: t,
      displayId: r
    });
    if (qHn(o.base64) < 1024) {
      n.warn(`[computer-use] screenshot implausibly small (${qHn(o.base64)} bytes decoded), retrying once`);
      o = await e.screenshot({
        allowedBundleIds: t,
        displayId: r
      });
    }
    return o;
  }
  function FEp(e) {
    try {
      let t = Intl.Segmenter;
      if (typeof t === "function") {
        let n = new t(undefined, {
          granularity: "grapheme"
        });
        return Array.from(n.segment(e), r => r.segment);
      }
    } catch {}
    return Array.from(e);
  }
  function VHn(e) {
    return new Promise(t => setTimeout(t, e));
  }
  function A_a(e) {
    return e.split("+").map(t => t.trim()).filter(Boolean);
  }
  function vmo() {
    b$ = false;
    Lde = false;
  }
  async function iWt(e) {
    if (!b$) {
      return;
    }
    await e.executor.mouseUp();
    b$ = false;
    Lde = false;
  }
  function wmo(e) {
    return e === "request_access" || e === "list_granted_applications";
  }
  function Smo(e) {
    return UEp.test(e) && !e.includes(" ");
  }
  function BEp(e, t, n) {
    let r = new Map();
    let o = new Map();
    for (let s of t) {
      o.set(s.bundleId, s);
      r.set(s.displayName.toLowerCase(), s);
    }
    return e.map(s => {
      let i;
      if (Smo(s)) {
        i = o.get(s);
      }
      if (!i) {
        i = r.get(s.toLowerCase());
      }
      let a = i?.bundleId;
      let l = a ?? (Smo(s) ? s : undefined);
      return {
        requestedName: s,
        resolved: i,
        isSentinel: a ? E_a.vZc(a) : false,
        alreadyGranted: a ? n.vZc(a) : false,
        proposedTier: _mo(l, i?.displayName ?? s)
      };
    });
  }
  async function $Ep(e, t, n, r) {
    if (!n.onPermissionRequest) {
      return Aa("This session was not wired with a permission handler. Computer control is not available here.", "feature_unavailable");
    }
    if (n.getTeachModeActive?.()) {
      return Aa("Cannot request additional permissions during teach mode \u2014 the permission dialog would be hidden. End teach mode (finish the tour or let the turn complete), then call request_access, then start a new tour.", "teach_mode_conflict");
    }
    let o = Fde(t, "reason");
    if (o instanceof Error) {
      return Aa(o.message, "bad_args");
    }
    if (r) {
      let E = {
        requestId: aWt.randomUUID(),
        reason: o,
        apps: [],
        requestedFlags: {},
        screenshotFiltering: e.executor.capabilities.screenshotFiltering,
        tccState: r
      };
      await n.onPermissionRequest(E);
      let C = await e.ensureOsPermissions();
      if (C.granted) {
        return Aa("macOS Accessibility and Screen Recording are now both granted. " + "Call request_access again immediately \u2014 the next call will show " + "the app selection list.");
      }
      let x = [];
      if (!C.accessibility) {
        x.push("Accessibility");
      }
      if (!C.screenRecording) {
        x.push("Screen Recording");
      }
      return Aa(`macOS ${x.join(" and ")} permission(s) not yet granted. The permission panel has been shown. Once the user grants the missing permission(s), call request_access again.`, "tcc_not_granted");
    }
    let s = t.apps;
    if (!Array.isArray(s) || !s.every(E => typeof E === "string")) {
      return Aa('"apps" must be an array of strings.', "bad_args");
    }
    let i = s;
    let a = {};
    if (typeof t.clipboardRead === "boolean") {
      a.clipboardRead = t.clipboardRead;
    }
    if (typeof t.clipboardWrite === "boolean") {
      a.clipboardWrite = t.clipboardWrite;
    }
    if (typeof t.systemKeyCombos === "boolean") {
      a.systemKeyCombos = t.systemKeyCombos;
    }
    let {
      needDialog: l,
      skipDialogGrants: c,
      willHide: u,
      tieredApps: d,
      userDenied: p,
      policyDenied: m
    } = await I_a(e, i, n.allowedApps, new Set(n.userDeniedBundleIds), n.selectedDisplayId);
    let f = [];
    let h = [];
    let g = n.grantFlags;
    if (l.length > 0 || Object.keys(a).length > 0) {
      let E = {
        requestId: aWt.randomUUID(),
        reason: o,
        apps: l,
        requestedFlags: a,
        screenshotFiltering: e.executor.capabilities.screenshotFiltering,
        ...(u.length > 0 && {
          willHide: u,
          autoUnhideEnabled: e.getAutoUnhideEnabled()
        })
      };
      let C = await n.onPermissionRequest(E);
      f = C.granted;
      h = C.denied;
      g = C.flags;
    }
    let y = [...c, ...f];
    let _ = new Set(y.map(E => E.bundleId));
    let b = d.filter(E => _.vZc(E.bundleId));
    let S = [];
    try {
      S = await HEp(e, y);
    } catch (E) {
      e.logger.warn(`[computer-use] buildWindowLocations failed: ${String(E)}`);
    }
    return hU({
      granted: y,
      denied: h,
      ...(m.length > 0 && {
        policyDenied: {
          apps: m,
          guidance: Emo(m)
        }
      }),
      ...(p.length > 0 && {
        userDenied: {
          apps: p,
          guidance: Tmo(p)
        }
      }),
      ...(b.length > 0 && {
        tierGuidance: P_a(b)
      }),
      screenshotFiltering: e.executor.capabilities.screenshotFiltering,
      ...(S.length > 0 ? {
        windowLocations: S
      } : {})
    }, {
      granted_count: f.length,
      denied_count: h.length,
      ...O_a(b)
    });
  }
  async function HEp(e, t) {
    if (t.length === 0) {
      return [];
    }
    let n = await e.executor.listDisplays();
    if (n.length <= 1) {
      return [];
    }
    let r = t.map(l => l.bundleId);
    let o = await e.executor.findWindowDisplays(r);
    let s = new Map(n.map(l => [l.displayId, l]));
    let i = new Map(o.map(l => [l.bundleId, l.displayIds]));
    let a = [];
    for (let l of t) {
      let c = i.get(l.bundleId);
      if (!c || c.length === 0) {
        continue;
      }
      a.push({
        bundleId: l.bundleId,
        displayName: l.displayName,
        displays: c.map(u => {
          let d = s.get(u);
          return {
            id: u,
            label: d?.label,
            isPrimary: d?.isPrimary
          };
        })
      });
    }
    return a;
  }
  async function I_a(e, t, n, r, o) {
    let s = new Set(n.map(b => b.bundleId));
    let i = await e.executor.listInstalledApps();
    let a = BEp(t, i, s);
    let l = [];
    let c = [];
    for (let b of a) {
      let S = b.resolved?.displayName ?? b.requestedName;
      if (HHn(b.resolved?.bundleId, S)) {
        l.push({
          requestedName: b.requestedName,
          displayName: S
        });
      } else {
        c.push(b);
      }
    }
    let u = [];
    let d = [];
    for (let b of c) {
      if (b.resolved && r.vZc(b.resolved.bundleId)) {
        u.push({
          requestedName: b.requestedName,
          displayName: b.resolved.displayName
        });
      } else {
        d.push(b);
      }
    }
    let p = [];
    for (let b of d) {
      if (b.proposedTier === "full" || !b.resolved) {
        continue;
      }
      p.push({
        bundleId: b.resolved.bundleId,
        displayName: b.resolved.displayName,
        tier: b.proposedTier
      });
    }
    let m = d.filter(b => b.alreadyGranted);
    let f = d.filter(b => !b.alreadyGranted);
    for (let b of f) {
      if (!b.resolved) {
        continue;
      }
      try {
        b.resolved.iconDataUrl = await e.executor.getAppIcon(b.resolved.path);
      } catch {}
    }
    let h = Date.now();
    let g = m.filter(b => b.resolved).map(b => n.find(E => E.bundleId === b.resolved.bundleId) ?? {
      bundleId: b.resolved.bundleId,
      displayName: b.resolved.displayName,
      grantedAt: h,
      tier: b.proposedTier
    });
    let y = [...n.map(b => b.bundleId), ...d.filter(b => b.resolved).map(b => b.resolved.bundleId)];
    let _ = await e.executor.previewHideSet(y, o);
    return {
      needDialog: f,
      skipDialogGrants: g,
      willHide: _,
      tieredApps: p,
      userDenied: u,
      policyDenied: l
    };
  }
  function P_a(e) {
    let t = e.filter(s => s.tier === "read" && Upt(s.bundleId, s.displayName) === "browser");
    let n = e.filter(s => s.tier === "read" && Upt(s.bundleId, s.displayName) !== "browser");
    let r = e.filter(s => s.tier === "click");
    let o = [];
    if (t.length > 0) {
      let s = t.map(i => `"${i.displayName}"`).join(", ");
      o.push(`${s} ${t.length === 1 ? "is a browser" : "are browsers"} \u2014 ` + `granted at tier "read" (visible in screenshots only; no clicks or typing). You can read what's on screen but cannot navigate, click, or type into ${t.length === 1 ? "it" : "them"}. For browser interaction, use the Claude-in-Chrome MCP (tools named \`mcp__Claude_in_Chrome__*\`; load via ToolSearch if deferred).`);
    }
    if (n.length > 0) {
      let s = n.map(i => `"${i.displayName}"`).join(", ");
      o.push(`${s} ${n.length === 1 ? "is" : "are"} granted at tier "read" (visible in screenshots only; no clicks or typing). You can read what's on screen but cannot interact. Ask the user to take any actions in ${n.length === 1 ? "this app" : "these apps"} themselves.`);
    }
    if (r.length > 0) {
      let s = r.map(i => `"${i.displayName}"`).join(", ");
      o.push(`${s} ${r.length === 1 ? "has" : "have"} terminal or IDE ` + 'capabilities \u2014 granted at tier "click" (visible + plain left-click ' + `only; NO typing, key presses, right-click, modifier-clicks, or drag-drop). You can click buttons and scroll output, but ${r.length === 1 ? "its" : "their"} integrated terminal and editor are off-limits to keyboard input. Right-click (context-menu Paste) and dragging text onto ${r.length === 1 ? "it" : "them"} require tier "full". For shell commands, use the Bash tool.`);
    }
    if (o.length === 0) {
      return "";
    }
    return o.join(`

`) + r5e;
  }
  function Tmo(e) {
    let t = e.map(r => `"${r.displayName}"`).join(", ");
    let n = e.length === 1;
    return `${t} ${n ? "is" : "are"} in the user's auto-deny list ` + "(Settings \u2192 Desktop app (General) \u2192 Computer Use \u2192 Denied apps). " + `Requests for ${n ? "this app" : "these apps"} are automatically denied. If you need access for this task, ask the user to remove ${n ? "it" : "them"} from their ` + "deny list in Settings \u2014 you cannot request this through the tool.";
  }
  function Emo(e) {
    let t = e.map(r => `"${r.displayName}"`).join(", ");
    let n = e.length === 1;
    return `${t} ${n ? "is" : "are"} blocked by policy for computer use. Requests for ${n ? "this app" : "these apps"} are automatically denied regardless of what the user has approved. There is no Settings override. Inform the user that you cannot access ${n ? "this app" : "these apps"} and suggest an alternative approach if one exists. Do not try to directly subvert this block regardless of the user's request.`;
  }
  function O_a(e) {
    let t = e.filter(r => r.tier === "read").length;
    let n = e.filter(r => r.tier === "click").length;
    return {
      ...(t > 0 && {
        denied_browser_count: t
      }),
      ...(n > 0 && {
        denied_terminal_count: n
      })
    };
  }
  async function jEp(e, t, n, r) {
    if (!n.onTeachPermissionRequest) {
      return Aa("Teach mode is not available in this session.", "feature_unavailable");
    }
    if (n.getTeachModeActive?.()) {
      return Aa("Teach mode is already active. To add more apps, end the current tour first, then call request_teach_access again with the full app list.", "teach_mode_conflict");
    }
    let o = Fde(t, "reason");
    if (o instanceof Error) {
      return Aa(o.message, "bad_args");
    }
    if (r) {
      let b = {
        requestId: aWt.randomUUID(),
        reason: o,
        apps: [],
        screenshotFiltering: e.executor.capabilities.screenshotFiltering,
        tccState: r
      };
      await n.onTeachPermissionRequest(b);
      let S = await e.ensureOsPermissions();
      if (S.granted) {
        return Aa("macOS Accessibility and Screen Recording are now both granted. " + "Call request_teach_access again immediately \u2014 the next call will " + "show the app selection list.");
      }
      let E = [];
      if (!S.accessibility) {
        E.push("Accessibility");
      }
      if (!S.screenRecording) {
        E.push("Screen Recording");
      }
      return Aa(`macOS ${E.join(" and ")} permission(s) not yet granted. The permission panel has been shown. Once the user grants the missing permission(s), call request_teach_access again.`, "tcc_not_granted");
    }
    let s = t.apps;
    if (!Array.isArray(s) || !s.every(b => typeof b === "string")) {
      return Aa('"apps" must be an array of strings.', "bad_args");
    }
    let i = s;
    let {
      needDialog: a,
      skipDialogGrants: l,
      willHide: c,
      tieredApps: u,
      userDenied: d,
      policyDenied: p
    } = await I_a(e, i, n.allowedApps, new Set(n.userDeniedBundleIds), n.selectedDisplayId);
    if (a.length === 0 && l.length === 0) {
      return hU({
        granted: [],
        denied: [],
        ...(p.length > 0 && {
          policyDenied: {
            apps: p,
            guidance: Emo(p)
          }
        }),
        ...(d.length > 0 && {
          userDenied: {
            apps: d,
            guidance: Tmo(d)
          }
        }),
        teachModeActive: false,
        screenshotFiltering: e.executor.capabilities.screenshotFiltering
      }, {
        granted_count: 0,
        denied_count: 0
      });
    }
    let m = {
      requestId: aWt.randomUUID(),
      reason: o,
      apps: a,
      screenshotFiltering: e.executor.capabilities.screenshotFiltering,
      ...(c.length > 0 && {
        willHide: c,
        autoUnhideEnabled: e.getAutoUnhideEnabled()
      })
    };
    let f = await n.onTeachPermissionRequest(m);
    let h = [...l, ...f.granted];
    let g = f.userConsented === true && h.length > 0;
    if (g) {
      n.onTeachModeActivated?.();
    }
    let y = new Set(h.map(b => b.bundleId));
    let _ = u.filter(b => y.vZc(b.bundleId));
    return hU({
      granted: h,
      denied: f.denied,
      ...(p.length > 0 && {
        policyDenied: {
          apps: p,
          guidance: Emo(p)
        }
      }),
      ...(d.length > 0 && {
        userDenied: {
          apps: d,
          guidance: Tmo(d)
        }
      }),
      ...(_.length > 0 && {
        tierGuidance: P_a(_)
      }),
      teachModeActive: g,
      screenshotFiltering: e.executor.capabilities.screenshotFiltering
    }, {
      granted_count: f.granted.length,
      denied_count: f.denied.length,
      ...O_a(_)
    });
  }
  async function D_a(e, t, n, r) {
    let o = Fde(e, "explanation");
    if (o instanceof Error) {
      return Error(`${r}: ${o.message}`);
    }
    let s = Fde(e, "next_preview");
    if (s instanceof Error) {
      return Error(`${r}: ${s.message}`);
    }
    let i = e.actions;
    if (!Array.isArray(i)) {
      return Error(`${r}: "actions" must be an array (empty is allowed).`);
    }
    for (let [l, c] of i.entries()) {
      if (typeof c !== "object" || c === null) {
        return Error(`${r}: actions[${l}] must be an object`);
      }
      let u = c.action;
      if (typeof u !== "string") {
        return Error(`${r}: actions[${l}].action must be a string`);
      }
      if (!WHn.vZc(u)) {
        return Error(`${r}: actions[${l}].action="${u}" is not allowed. Allowed: ${[...WHn].join(", ")}.`);
      }
    }
    let a;
    if (e.anchor !== undefined) {
      let l = e.anchor;
      if (!Array.isArray(l) || l.length !== 2 || typeof l[0] !== "number" || typeof l[1] !== "number" || !Number.isFinite(l[0]) || !Number.isFinite(l[1])) {
        return Error(`${r}: "anchor" must be a [x, y] number tuple or omitted.`);
      }
      let c = await t.executor.getDisplaySize(n.selectedDisplayId);
      a = Bpt(l[0], l[1], n.coordinateMode, c, n.lastScreenshot, t.logger);
    }
    return {
      explanation: o,
      nextPreview: s,
      anchorLogical: a,
      actions: i
    };
  }
  async function M_a(e, t, n, r) {
    if ((await n.onTeachStep({
      explanation: e.explanation,
      nextPreview: e.nextPreview,
      anchorLogical: e.anchorLogical
    })).action === "exit") {
      await iWt(t);
      return {
        kind: "exit"
      };
    }
    if (n.onTeachWorking?.(), e.actions.length === 0) {
      return {
        kind: "ok",
        results: []
      };
    }
    if (r.hideBeforeAction) {
      let a = await t.executor.prepareForAction(n.allowedApps.map(l => l.bundleId), n.selectedDisplayId);
      if (a.length > 0) {
        n.onAppsHidden?.(a);
      }
    }
    let s = {
      ...r,
      hideBeforeAction: false,
      pixelValidation: false,
      autoTargetDisplay: false
    };
    let i = [];
    for (let [a, l] of e.actions.entries()) {
      if (n.isAborted?.()) {
        await iWt(t);
        return {
          kind: "exit"
        };
      }
      if (a > 0) {
        await VHn(10);
      }
      let c = l.action;
      let {
        screenshot: u,
        ...d
      } = await Cmo(c, l, t, n, s);
      let p = U_a(d);
      let m = {
        action: c,
        ok: !d.isError,
        output: p
      };
      if (i.push(m), d.isError) {
        await iWt(t);
        return {
          kind: "action_error",
          executed: i.length - 1,
          failed: m,
          remaining: e.actions.length - i.length,
          telemetry: d.telemetry
        };
      }
    }
    return {
      kind: "ok",
      results: i
    };
  }
  async function N_a(e, t, n, r) {
    let o = await F_a(t, n, r);
    if (o.isError) {
      return hU(e);
    }
    return {
      content: [{
        type: "text",
        text: JSON.stringify(e)
      }, ...o.content],
      screenshot: o.screenshot
    };
  }
  async function qEp(e, t, n, r) {
    if (!n.onTeachStep) {
      return Aa("Teach mode is not active. Call request_teach_access first.", "teach_mode_not_active");
    }
    let o = await D_a(t, e, n, "teach_step");
    if (o instanceof Error) {
      return Aa(o.message, "bad_args");
    }
    let s = await M_a(o, e, n, r);
    if (s.kind === "exit") {
      return hU({
        exited: true
      });
    }
    if (s.kind === "action_error") {
      return hU({
        executed: s.executed,
        failed: s.failed,
        remaining: s.remaining
      }, s.telemetry);
    }
    if (o.actions.length === 0) {
      return hU({
        executed: 0,
        results: []
      });
    }
    return N_a({
      executed: s.results.length,
      results: s.results
    }, e, n, r);
  }
  async function WEp(e, t, n, r) {
    if (!n.onTeachStep) {
      return Aa("Teach mode is not active. Call request_teach_access first.", "teach_mode_not_active");
    }
    let o = t.steps;
    if (!Array.isArray(o) || o.length < 1) {
      return Aa('"steps" must be a non-empty array.', "bad_args");
    }
    let s = [];
    for (let [c, u] of o.entries()) {
      if (typeof u !== "object" || u === null) {
        return Aa(`steps[${c}] must be an object`, "bad_args");
      }
      let d = await D_a(u, e, n, `steps[${c}]`);
      if (d instanceof Error) {
        return Aa(d.message, "bad_args");
      }
      s.push(d);
    }
    let i = [];
    for (let [c, u] of s.entries()) {
      let d = await M_a(u, e, n, r);
      if (d.kind === "exit") {
        return hU({
          exited: true,
          stepsCompleted: c
        });
      }
      if (d.kind === "action_error") {
        return hU({
          stepsCompleted: c,
          stepFailed: c,
          executed: d.executed,
          failed: d.failed,
          remaining: d.remaining,
          results: i
        }, d.telemetry);
      }
      i.push(d.results);
    }
    let a = s.some(c => c.actions.length > 0);
    let l = {
      stepsCompleted: s.length,
      results: i
    };
    if (!a) {
      return hU(l);
    }
    return N_a(l, e, n, r);
  }
  async function w_a(e, t) {
    if (t.length === 0) {
      return;
    }
    let n = await e.executor.listRunningApps();
    let r = new Map(n.map(a => [a.bundleId, a.displayName]));
    let o = t.map(a => r.get(a) ?? a);
    let s = o.map(a => `"${a}"`).join(", ");
    let i = o.length === 1;
    return `${s} ${i ? "was" : "were"} open and got hidden before this screenshot (not in the session allowlist). If a previous action was meant to open ${i ? "it" : "one of them"}, that's why you don't see it \u2014 call ` + `request_access to add ${i ? "it" : "them"} to the allowlist.`;
  }
  function L_a(e) {
    let t = [...e].sort((o, s) => o.displayId - s.displayId);
    let n = new Map();
    let r = new Map();
    for (let o of t) {
      let s = o.label ?? `display ${o.displayId}`;
      let i = (n.get(s) ?? 0) + 1;
      n.set(s, i);
      r.set(o.displayId, i === 1 ? s : `${s} (${i})`);
    }
    return r;
  }
  async function C_a(e, t, n, r) {
    let o;
    try {
      o = await e.executor.listDisplays();
    } catch (d) {
      e.logger.warn(`[computer-use] listDisplays failed: ${String(d)}`);
      return;
    }
    if (o.length < 2) {
      return;
    }
    let s = L_a(o);
    let i = d => s.get(d) ?? `display ${d}`;
    let a = i(t);
    let l = o.filter(d => d.displayId !== t).map(d => i(d.displayId));
    let c = r ? " Use switch_display to capture a different monitor." : "";
    let u = l.length > 0 ? ` Other attached monitors: ${l.map(d => `"${d}"`).join(", ")}.` + c : "";
    if (n === undefined || n === 0) {
      return `This screenshot was taken on monitor "${a}".` + u;
    }
    if (n !== t) {
      let d = i(n);
      return `This screenshot was taken on monitor "${a}", which is different from your previous screenshot (taken on "${d}").` + u;
    }
    return;
  }
  async function F_a(e, t, n) {
    if (t.allowedApps.length === 0) {
      return Aa("No applications are granted for this session. Call request_access first.", "allowlist_empty");
    }
    if (n.autoTargetDisplay) {
      let l = t.allowedApps.map(y => y.bundleId);
      let c = l.slice().sort().join(",");
      let u = c !== t.displayResolvedForApps;
      let d = !t.displayPinnedByModel && u;
      let p = await e.executor.resolvePrepareCapture({
        allowedBundleIds: l,
        preferredDisplayId: t.selectedDisplayId,
        autoResolve: d,
        doHide: n.hideBeforeAction
      });
      if (p.captureError === undefined && qHn(p.base64) < 1024) {
        e.logger.warn(`[computer-use] resolvePrepareCapture result implausibly small (${qHn(p.base64)} bytes decoded) \u2014 possible transient display state`);
      }
      if (p.displayId !== t.selectedDisplayId) {
        e.logger.debug(`[computer-use] resolver: preferred=${t.selectedDisplayId} resolved=${p.displayId}`);
        t.onResolvedDisplayUpdated?.(p.displayId);
      }
      if (d) {
        t.onDisplayResolvedForApps?.(c);
      }
      let m = [];
      if (t.lastScreenshot !== undefined) {
        m = p.hidden;
      }
      if (p.hidden.length > 0) {
        t.onAppsHidden?.(p.hidden);
      }
      if (p.captureError !== undefined) {
        return Aa(p.captureError, "capture_failed");
      }
      let f = await w_a(e, m);
      let h = {
        base64: p.base64,
        width: p.width,
        height: p.height,
        displayWidth: p.displayWidth,
        displayHeight: p.displayHeight,
        displayId: p.displayId,
        originX: p.originX,
        originY: p.originY
      };
      let g = await C_a(e, h.displayId, t.lastScreenshot?.displayId, t.onDisplayPinned !== undefined);
      return {
        content: [...(g ? [{
          type: "text",
          text: g
        }] : []), ...(f ? [{
          type: "text",
          text: f
        }] : []), {
          type: "image",
          data: h.base64,
          mimeType: "image/jpeg"
        }],
        screenshot: h
      };
    }
    let r = [];
    if (n.hideBeforeAction) {
      let l = await e.executor.prepareForAction(t.allowedApps.map(c => c.bundleId), t.selectedDisplayId);
      if (t.lastScreenshot !== undefined) {
        r = l;
      }
      if (l.length > 0) {
        t.onAppsHidden?.(l);
      }
    }
    let o = t.allowedApps.map(l => l.bundleId);
    let s = await NEp(e.executor, o, e.logger, t.selectedDisplayId);
    let i = await w_a(e, r);
    let a = await C_a(e, s.displayId, t.lastScreenshot?.displayId, t.onDisplayPinned !== undefined);
    return {
      content: [...(a ? [{
        type: "text",
        text: a
      }] : []), ...(i ? [{
        type: "text",
        text: i
      }] : []), {
        type: "image",
        data: s.base64,
        mimeType: "image/jpeg"
      }],
      screenshot: s
    };
  }
  async function GEp(e, t, n) {
    let r = t.region;
    if (!Array.isArray(r) || r.length !== 4) {
      return Aa("region must be an array of length 4: [x0, y0, x1, y1]", "bad_args");
    }
    let [o, s, i, a] = r;
    if (![o, s, i, a].every(f => typeof f === "number" && f >= 0)) {
      return Aa("region values must be non-negative numbers", "bad_args");
    }
    if (i <= o) {
      return Aa("region x1 must be greater than x0", "bad_args");
    }
    if (a <= s) {
      return Aa("region y1 must be greater than y0", "bad_args");
    }
    let l = n.lastScreenshot;
    if (!l) {
      return Aa("take a screenshot before zooming (region coords are relative to it)", "state_conflict");
    }
    if (i > l.width || a > l.height) {
      return Aa(`region exceeds screenshot bounds (${l.width}\xD7${l.height})`, "bad_args");
    }
    let c = l.displayWidth / l.width;
    let u = l.displayHeight / l.height;
    let d = {
      x: o * c,
      y: s * u,
      w: (i - o) * c,
      h: (a - s) * u
    };
    let p = n.allowedApps.map(f => f.bundleId);
    return {
      content: [{
        type: "image",
        data: (await e.executor.zoom(d, p, l.displayId)).base64,
        mimeType: "image/jpeg"
      }]
    };
  }
  async function sWt(e, t, n, r, o, s) {
    if (b$) {
      await e.executor.mouseUp();
      b$ = false;
      Lde = false;
    }
    let i = lWt(t);
    if (i instanceof Error) {
      return Aa(i.message, "bad_args");
    }
    let [a, l] = i;
    let c;
    if (t.text !== undefined) {
      if (typeof t.text !== "string") {
        return Aa("text must be a string", "bad_args");
      }
      if (jHn(t.text, e.executor.capabilities.platform) && !n.grantFlags.systemKeyCombos) {
        return Aa(`The modifier chord "${t.text}" would fire a system shortcut. Request the systemKeyCombos grant flag via request_access, or use only modifier keys (shift, ctrl, alt, cmd) in the text parameter.`, "grant_flag_required");
      }
      c = A_a(t.text);
    }
    let u = o !== "left" || c !== undefined && c.length > 0 ? "mouse_full" : "mouse";
    let d = await DTe(e, n, r, u);
    if (d) {
      return d;
    }
    let p = await e.executor.getDisplaySize(n.selectedDisplayId);
    if (r.pixelValidation) {
      let {
        xPct: g,
        yPct: y
      } = MEp(a, l, n.coordinateMode, n.lastScreenshot);
      let _ = await __a(e.cropRawPatch, n.lastScreenshot, g, y, async () => {
        let b = n.allowedApps.map(S => S.bundleId);
        try {
          return await e.executor.screenshot({
            allowedBundleIds: b,
            displayId: n.lastScreenshot?.displayId
          });
        } catch {
          return null;
        }
      }, e.logger);
      if (!_.valid && _.warning) {
        return gU(_.warning);
      }
    }
    let {
      x: m,
      y: f
    } = Bpt(a, l, n.coordinateMode, p, n.lastScreenshot, e.logger);
    let h = await o5e(e, n, r, m, f, u);
    if (h) {
      return h;
    }
    await e.executor.click(m, f, o, s, c);
    return gU("Clicked.");
  }
  async function VEp(e, t, n, r) {
    let o = Fde(t, "text");
    if (o instanceof Error) {
      return Aa(o.message, "bad_args");
    }
    let s = await DTe(e, n, r, "keyboard");
    if (s) {
      return s;
    }
    if (o.includes(`
`) && n.grantFlags.clipboardWrite && r.clipboardPasteMultiline) {
      await e.executor.type(o, {
        viaClipboard: true
      });
      return gU("Typed (via clipboard).");
    }
    let a = FEp(o);
    for (let [l, c] of a.entries()) {
      if (n.isAborted?.()) {
        return Aa(`Typing aborted after ${l} of ${a.length} graphemes (user interrupt).`);
      }
      if (await VHn(8), c === `
` || c === "\r" || c === `\r
`) {
        await e.executor.key("return");
      } else if (c === "\t") {
        await e.executor.key("tab");
      } else {
        await e.executor.type(c, {
          viaClipboard: false
        });
      }
    }
    return gU(`Typed ${a.length} grapheme(s).`);
  }
  async function zEp(e, t, n, r) {
    let o = Fde(t, "text");
    if (o instanceof Error) {
      return Aa("text is required", "bad_args");
    }
    let s;
    if (t.repeat !== undefined) {
      if (typeof t.repeat !== "number" || !Number.isInteger(t.repeat) || t.repeat < 1) {
        return Aa("repeat must be a positive integer", "bad_args");
      }
      if (t.repeat > 100) {
        return Aa("repeat exceeds maximum of 100", "bad_args");
      }
      s = t.repeat;
    }
    if (jHn(o, e.executor.capabilities.platform) && !n.grantFlags.systemKeyCombos) {
      return Aa(`"${o}" is a system-level shortcut. Request the \`systemKeyCombos\` grant via request_access to use it.`, "grant_flag_required");
    }
    let i = await DTe(e, n, r, "keyboard");
    if (i) {
      return i;
    }
    await e.executor.key(o, s);
    return gU("Key pressed.");
  }
  async function KEp(e, t, n, r) {
    let o = lWt(t);
    if (o instanceof Error) {
      return Aa(o.message, "bad_args");
    }
    let [s, i] = o;
    let a = t.scroll_direction;
    if (a !== "up" && a !== "down" && a !== "left" && a !== "right") {
      return Aa("scroll_direction must be 'up', 'down', 'left', or 'right'", "bad_args");
    }
    let l = t.scroll_amount;
    if (typeof l !== "number" || !Number.isInteger(l) || l < 0) {
      return Aa("scroll_amount must be a non-negative int", "bad_args");
    }
    if (l > 100) {
      return Aa("scroll_amount exceeds maximum of 100", "bad_args");
    }
    let c = a === "left" ? -l : a === "right" ? l : 0;
    let u = a === "up" ? -l : a === "down" ? l : 0;
    let d = await DTe(e, n, r, "mouse");
    if (d) {
      return d;
    }
    let p = await e.executor.getDisplaySize(n.selectedDisplayId);
    let {
      x: m,
      y: f
    } = Bpt(s, i, n.coordinateMode, p, n.lastScreenshot, e.logger);
    let h = await o5e(e, n, r, m, f, b$ ? "mouse_full" : "mouse");
    if (h) {
      return h;
    }
    if (b$) {
      Lde = true;
    }
    await e.executor.scroll(m, f, c, u);
    return gU("Scrolled.");
  }
  async function YEp(e, t, n, r) {
    if (b$) {
      await e.executor.mouseUp();
      b$ = false;
      Lde = false;
    }
    let o = lWt(t, "coordinate");
    if (o instanceof Error) {
      return Aa(o.message, "bad_args");
    }
    let s = o;
    let i;
    if (t.start_coordinate !== undefined) {
      let f = lWt(t, "start_coordinate");
      if (f instanceof Error) {
        return Aa(f.message, "bad_args");
      }
      i = f;
    }
    let a = await DTe(e, n, r, "mouse");
    if (a) {
      return a;
    }
    let l = await e.executor.getDisplaySize(n.selectedDisplayId);
    let c = i === undefined ? undefined : Bpt(i[0], i[1], n.coordinateMode, l, n.lastScreenshot, e.logger);
    let u = Bpt(s[0], s[1], n.coordinateMode, l, n.lastScreenshot, e.logger);
    let d = c ?? (await e.executor.getCursorPosition());
    let p = await o5e(e, n, r, d.x, d.y, "mouse");
    if (p) {
      return p;
    }
    let m = await o5e(e, n, r, u.x, u.y, "mouse_full");
    if (m) {
      return m;
    }
    await e.executor.drag(c, u);
    return gU("Dragged.");
  }
  async function JEp(e, t, n, r) {
    let o = lWt(t);
    if (o instanceof Error) {
      return Aa(o.message, "bad_args");
    }
    let [s, i] = o;
    let l = await DTe(e, n, r, b$ ? "mouse" : "mouse_position");
    if (l) {
      return l;
    }
    let c = await e.executor.getDisplaySize(n.selectedDisplayId);
    let {
      x: u,
      y: d
    } = Bpt(s, i, n.coordinateMode, c, n.lastScreenshot, e.logger);
    if (b$) {
      let p = await o5e(e, n, r, u, d, "mouse_full");
      if (p) {
        return p;
      }
    }
    if (await e.executor.moveMouse(u, d), b$) {
      Lde = true;
    }
    return gU("Moved.");
  }
  async function XEp(e, t, n) {
    let r = Fde(t, "app");
    if (r instanceof Error) {
      return Aa(r.message, "bad_args");
    }
    let o = new Set(n.allowedApps.map(i => i.bundleId));
    let s;
    if (Smo(r) && o.vZc(r)) {
      s = r;
    } else {
      s = n.allowedApps.find(a => a.displayName.toLowerCase() === r.toLowerCase())?.bundleId;
    }
    if (!s || !o.vZc(s)) {
      return Aa(`"${r}" is not granted for this session. Call request_access first.`, "app_not_granted");
    }
    if (await e.executor.openApp(s), n.onDisplayPinned !== undefined) {
      let i = 1;
      try {
        i = (await e.executor.listDisplays()).length;
      } catch {}
      if (i >= 2) {
        return gU(`Opened "${r}". If it isn't visible in the next screenshot, it may ` + "have opened on a different monitor \u2014 use switch_display to check.");
      }
    }
    return gU(`Opened "${r}".`);
  }
  async function QEp(e, t, n) {
    let r = Fde(t, "display");
    if (r instanceof Error) {
      return Aa(r.message, "bad_args");
    }
    if (!n.onDisplayPinned) {
      return Aa("Display switching is not available in this session.", "feature_unavailable");
    }
    if (r.toLowerCase() === "auto") {
      n.onDisplayPinned(undefined);
      return gU("Returned to automatic monitor selection. Call screenshot to continue.");
    }
    let o;
    try {
      o = await e.executor.listDisplays();
    } catch (l) {
      return Aa(`Failed to enumerate displays: ${String(l)}`, "display_error");
    }
    if (o.length < 2) {
      return Aa("Only one monitor is connected. There is nothing to switch to.", "bad_args");
    }
    let s = L_a(o);
    let i = r.toLowerCase();
    let a = o.find(l => s.get(l.displayId)?.toLowerCase() === i);
    if (!a) {
      let l = o.map(c => `"${s.get(c.displayId)}"`).join(", ");
      return Aa(`No monitor named "${r}" is connected. Available monitors: ${l}.`, "bad_args");
    }
    n.onDisplayPinned(a.displayId);
    return gU(`Switched to monitor "${s.get(a.displayId)}". Call screenshot to see it.`);
  }
  function ZEp(e) {
    return hU({
      allowedApps: e.allowedApps,
      grantFlags: e.grantFlags
    });
  }
  async function evp(e, t, n) {
    if (!t.grantFlags.clipboardRead) {
      return Aa("Clipboard read is not granted. Request `clipboardRead` via request_access.", "grant_flag_required");
    }
    if (n.clipboardGuard) {
      let o = await e.executor.getFrontmostApp();
      let s = new Map(t.allowedApps.map(a => [a.bundleId, a.tier]));
      let i = o ? s.get(o.bundleId) : undefined;
      await GHn(e, t, i === "click");
    }
    let r = await e.executor.readClipboard();
    return hU({
      text: r
    });
  }
  async function tvp(e, t, n, r) {
    if (!n.grantFlags.clipboardWrite) {
      return Aa("Clipboard write is not granted. Request `clipboardWrite` via request_access.", "grant_flag_required");
    }
    let o = Fde(t, "text");
    if (o instanceof Error) {
      return Aa(o.message, "bad_args");
    }
    if (r.clipboardGuard) {
      let s = await e.executor.getFrontmostApp();
      let i = new Map(n.allowedApps.map(l => [l.bundleId, l.tier]));
      let a = s ? i.get(s.bundleId) : undefined;
      if (s && a === "click") {
        return Aa(`"${s.displayName}" is a tier-"click" app and currently frontmost. write_clipboard is blocked because the next action ` + "would clear the clipboard anyway \u2014 a UI Paste button in this " + 'app cannot be used to inject text. Bring a tier-"full" app forward before writing to the clipboard.' + r5e, "tier_insufficient");
      }
      await GHn(e, n, a === "click");
    }
    await e.executor.writeClipboard(o);
    return gU("Clipboard written.");
  }
  async function nvp(e) {
    let t = e.duration;
    if (typeof t !== "number" || !Number.isFinite(t)) {
      return Aa("duration must be a number", "bad_args");
    }
    if (t < 0) {
      return Aa("duration must be non-negative", "bad_args");
    }
    if (t > 100) {
      return Aa("duration is too long. Duration is in seconds.", "bad_args");
    }
    await VHn(t * 1000);
    return gU(`Waited ${t}s.`);
  }
  async function rvp(e, t) {
    let n = await e.executor.getCursorPosition();
    let r = t.lastScreenshot;
    if (r) {
      let o = n.x - r.originX;
      let s = n.y - r.originY;
      if (o < 0 || o > r.displayWidth || s < 0 || s > r.displayHeight) {
        return hU({
          x: n.x,
          y: n.y,
          coordinateSpace: "logical_points",
          note: "cursor is on a different monitor than your last screenshot; take a fresh screenshot"
        });
      }
      let i = Math.round(o * (r.width / r.displayWidth));
      let a = Math.round(s * (r.height / r.displayHeight));
      return hU({
        x: i,
        y: a,
        coordinateSpace: "image_pixels"
      });
    }
    return hU({
      x: n.x,
      y: n.y,
      coordinateSpace: "logical_points",
      note: "take a screenshot first for image-pixel coordinates"
    });
  }
  async function ovp(e, t, n, r) {
    let o = Fde(t, "text");
    if (o instanceof Error) {
      return Aa(o.message, "bad_args");
    }
    let s = t.duration;
    if (typeof s !== "number" || !Number.isFinite(s)) {
      return Aa("duration must be a number", "bad_args");
    }
    if (s < 0) {
      return Aa("duration must be non-negative", "bad_args");
    }
    if (s > 100) {
      return Aa("duration is too long. Duration is in seconds.", "bad_args");
    }
    if (jHn(o, e.executor.capabilities.platform) && !n.grantFlags.systemKeyCombos) {
      return Aa(`"${o}" is a system-level shortcut. Request the \`systemKeyCombos\` grant via request_access to use it.`, "grant_flag_required");
    }
    let i = await DTe(e, n, r, "keyboard");
    if (i) {
      return i;
    }
    let a = A_a(o);
    await e.executor.holdKey(a, s * 1000);
    return gU("Key held.");
  }
  async function svp(e, t, n) {
    if (b$) {
      return Aa("mouse button already held, call left_mouse_up first", "state_conflict");
    }
    let r = await DTe(e, t, n, "mouse");
    if (r) {
      return r;
    }
    let o = await e.executor.getCursorPosition();
    let s = await o5e(e, t, n, o.x, o.y, "mouse");
    if (s) {
      return s;
    }
    await e.executor.mouseDown();
    b$ = true;
    Lde = false;
    return gU("Mouse button pressed.");
  }
  async function ivp(e, t, n) {
    let r = async a => (await e.executor.mouseUp(), b$ = false, Lde = false, a);
    let o = await DTe(e, t, n, "mouse");
    if (o) {
      return r(o);
    }
    let s = await e.executor.getCursorPosition();
    let i = await o5e(e, t, n, s.x, s.y, Lde ? "mouse_full" : "mouse");
    if (i) {
      return r(i);
    }
    await e.executor.mouseUp();
    b$ = false;
    Lde = false;
    return gU("Mouse button released.");
  }
  async function avp(e, t, n, r) {
    let o = t.actions;
    if (!Array.isArray(o) || o.length === 0) {
      return Aa("actions must be a non-empty array", "bad_args");
    }
    for (let [a, l] of o.entries()) {
      if (typeof l !== "object" || l === null) {
        return Aa(`actions[${a}] must be an object`, "bad_args");
      }
      let c = l.action;
      if (typeof c !== "string") {
        return Aa(`actions[${a}].action must be a string`, "bad_args");
      }
      if (!WHn.vZc(c)) {
        return Aa(`actions[${a}].action="${c}" is not allowed in a batch. Allowed: ${[...WHn].join(", ")}.`, "bad_args");
      }
    }
    if (r.hideBeforeAction) {
      let a = await e.executor.prepareForAction(n.allowedApps.map(l => l.bundleId), n.selectedDisplayId);
      if (a.length > 0) {
        n.onAppsHidden?.(a);
      }
    }
    let s = {
      ...r,
      hideBeforeAction: false,
      pixelValidation: false,
      autoTargetDisplay: false
    };
    let i = [];
    for (let [a, l] of o.entries()) {
      if (n.isAborted?.()) {
        await iWt(e);
        return Aa(`Batch aborted after ${i.length} of ${o.length} actions (user interrupt).`);
      }
      if (a > 0) {
        await VHn(10);
      }
      let c = l;
      let u = c.action;
      let {
        screenshot: d,
        ...p
      } = await Cmo(u, c, e, n, s);
      let m = U_a(p);
      let f = {
        action: u,
        ok: !p.isError,
        output: m
      };
      if (i.push(f), p.isError) {
        await iWt(e);
        return hU({
          completed: i.slice(0, -1),
          failed: f,
          remaining: o.length - i.length
        }, p.telemetry);
      }
    }
    return hU({
      completed: i
    });
  }
  function U_a(e) {
    let t = e.content[0];
    return t && t.type === "text" ? t.text : "";
  }
  async function Cmo(e, t, n, r, o) {
    switch (e) {
      case "screenshot":
        return F_a(n, r, o);
      case "zoom":
        return GEp(n, t, r);
      case "left_click":
        return sWt(n, t, r, o, "left", 1);
      case "double_click":
        return sWt(n, t, r, o, "left", 2);
      case "triple_click":
        return sWt(n, t, r, o, "left", 3);
      case "right_click":
        return sWt(n, t, r, o, "right", 1);
      case "middle_click":
        return sWt(n, t, r, o, "middle", 1);
      case "type":
        return VEp(n, t, r, o);
      case "key":
        return zEp(n, t, r, o);
      case "scroll":
        return KEp(n, t, r, o);
      case "left_click_drag":
        return YEp(n, t, r, o);
      case "mouse_move":
        return JEp(n, t, r, o);
      case "wait":
        return nvp(t);
      case "cursor_position":
        return rvp(n, r);
      case "hold_key":
        return ovp(n, t, r, o);
      case "left_mouse_down":
        return svp(n, r, o);
      case "left_mouse_up":
        return ivp(n, r, o);
      case "open_application":
        return XEp(n, t, r);
      case "switch_display":
        return QEp(n, t, r);
      case "list_granted_applications":
        return ZEp(r);
      case "read_clipboard":
        return evp(n, r, o);
      case "write_clipboard":
        return tvp(n, t, r, o);
      case "computer_batch":
        return avp(n, t, r, o);
      default:
        return Aa(`Unknown tool "${e}".`, "bad_args");
    }
  }
  async function B_a(e, t, n, r) {
    let {
      logger: o,
      serverName: s
    } = e;
    let i = new Set(r.userDeniedBundleIds);
    let a = r.allowedApps.some(f => f.tier === undefined || i.vZc(f.bundleId) || HHn(f.bundleId, f.displayName)) ? {
      ...r,
      allowedApps: r.allowedApps.filter(f => !i.vZc(f.bundleId)).filter(f => !HHn(f.bundleId, f.displayName)).map(f => f.tier !== undefined ? f : {
        ...f,
        tier: _mo(f.bundleId, f.displayName)
      })
    } : r;
    if (e.isDisabled()) {
      return Aa("Computer control is disabled in Settings. Enable it and try again.", "other");
    }
    let l = await e.ensureOsPermissions();
    let c;
    if (!l.granted) {
      if (t !== "request_access" && t !== "request_teach_access") {
        return Aa("Accessibility and Screen Recording permissions are required. Call request_access to show the permission panel.", "tcc_not_granted");
      }
      c = {
        accessibility: l.accessibility,
        screenRecording: l.screenRecording
      };
    }
    let u = wmo(t);
    let d = a.checkCuLock?.();
    if (d) {
      if (d.holder !== undefined && !d.isSelf) {
        return Aa("Another Claude session is currently using the computer. Wait for the user to acknowledge it is finished (stop button in the Claude window), or find a non-computer-use approach if one is readily apparent.", "cu_lock_held");
      }
      if (d.holder === undefined && !u) {
        a.acquireCuLock?.();
        vmo();
      }
    }
    let p = e.getSubGates();
    let m = DEp(n);
    o.silly(`[${s}] tool=${t} args=${JSON.stringify(m).slice(0, 200)}`);
    try {
      if (t === "request_access") {
        return await $Ep(e, m, a, c);
      }
      if (t === "request_teach_access") {
        return await jEp(e, m, a, c);
      }
      if (t === "teach_step") {
        return await qEp(e, m, a, p);
      }
      if (t === "teach_batch") {
        return await WEp(e, m, a, p);
      }
      return await Cmo(t, m, e, a, p);
    } catch (f) {
      let h = f instanceof Error ? f.message : String(f);
      o.error(`[${s}] tool=${t} threw: ${h}`, f);
      return Aa(`Tool "${t}" failed: ${h}`, "executor_threw");
    }
  }
  var aWt;
  var r5e;
  var b$ = false;
  var Lde = false;
  var UEp;
  var WHn;
  var $_a = __lazy(() => {
    h_a();
    y_a();
    bmo();
    aWt = require("crypto");
    r5e = " Do not attempt to work around this restriction \u2014 never use AppleScript, " + "System Events, shell commands, or any other method to send clicks or keystrokes to this app.";
    UEp = /^[A-Za-z0-9][\w.-]*\.[A-Za-z0-9][\w.-]*$/;
    WHn = new Set(["key", "type", "mouse_move", "left_click", "left_click_drag", "right_click", "middle_click", "double_click", "triple_click", "scroll", "hold_key", "screenshot", "cursor_position", "left_mouse_down", "left_mouse_up", "wait"]);
  });
  function s5e(e, t, n) {
    let r = lvp[t];
    let o = n && n.length > 0 ? ` Available applications on this machine: ${n.join(", ")}.` : "";
    let s = {
      type: "array",
      items: {
        type: "number"
      },
      minItems: 2,
      maxItems: 2,
      description: `(x, y): ${r.x}`
    };
    let i = {
      type: "string",
      description: 'Modifier keys to hold during the click (e.g. "shift", "ctrl+shift"). Supports the same syntax as the key tool.'
    };
    let a = e.screenshotFiltering === "native" ? "Take a screenshot of the primary display. Applications not in the session allowlist are excluded at the compositor level \u2014 only granted apps and the desktop are visible." : "Take a screenshot of the primary display. On this platform, screenshots are NOT filtered \u2014 all open windows are visible. Input actions targeting apps not in the session allowlist are rejected.";
    return [{
      name: "request_access",
      description: "Request user permission to control a set of applications for this session. Must be called before any other tool in this server. The user sees a single dialog listing all requested apps and either allows the whole set or denies it. Call this again mid-session to add more apps; previously granted apps remain granted. Returns the granted apps, denied apps, and screenshot filtering capability.",
      inputSchema: {
        type: "object",
        properties: {
          apps: {
            type: "array",
            items: {
              type: "string"
            },
            description: 'Application display names (e.g. "Slack", "Calendar") or bundle identifiers (e.g. "com.tinyspeck.slackmacgap"). Display names are resolved case-insensitively against installed apps.' + o
          },
          reason: {
            type: "string",
            description: "One-sentence explanation shown to the user in the approval dialog. Explain the task, not the mechanism."
          },
          clipboardRead: {
            type: "boolean",
            description: "Also request permission to read the user's clipboard (separate checkbox in the dialog)."
          },
          clipboardWrite: {
            type: "boolean",
            description: "Also request permission to write the user's clipboard. When granted, multi-line `type` calls use the clipboard fast path."
          },
          systemKeyCombos: {
            type: "boolean",
            description: "Also request permission to send system-level key combos (quit app, switch app, lock screen). Without this, those specific combos are blocked."
          }
        },
        required: ["apps", "reason"]
      }
    }, {
      name: "screenshot",
      description: a + " Returns an error if the allowlist is empty. The returned image is what subsequent click coordinates are relative to.",
      inputSchema: {
        type: "object",
        properties: {
          save_to_disk: {
            type: "boolean",
            description: "Save the image to disk so it can be attached to a message for the user. Returns the saved path in the tool result. Only set this when you intend to share the image \u2014 screenshots you're just looking at don't need saving."
          }
        },
        required: []
      }
    }, {
      name: "zoom",
      description: "Take a higher-resolution screenshot of a specific region of the last full-screen screenshot. Use this liberally to inspect small text, button labels, or fine UI details that are hard to read in the downsampled full-screen image. IMPORTANT: Coordinates in subsequent click calls always refer to the full-screen screenshot, never the zoomed image. This tool is read-only for inspecting detail.",
      inputSchema: {
        type: "object",
        properties: {
          region: {
            type: "array",
            items: {
              type: "integer"
            },
            minItems: 4,
            maxItems: 4,
            description: "(x0, y0, x1, y1): Rectangle to zoom into, in the coordinate space of the most recent full-screen screenshot. x0,y0 = top-left, x1,y1 = bottom-right."
          },
          save_to_disk: {
            type: "boolean",
            description: "Save the image to disk so it can be attached to a message for the user. Returns the saved path in the tool result. Only set this when you intend to share the image."
          }
        },
        required: ["region"]
      }
    }, {
      name: "left_click",
      description: "Left-click at the given coordinates. The frontmost application must be in the session allowlist at the time of this call, or this tool returns an error and does nothing.",
      inputSchema: {
        type: "object",
        properties: {
          coordinate: s,
          text: i
        },
        required: ["coordinate"]
      }
    }, {
      name: "double_click",
      description: "Double-click at the given coordinates. Selects a word in most text editors. The frontmost application must be in the session allowlist at the time of this call, or this tool returns an error and does nothing.",
      inputSchema: {
        type: "object",
        properties: {
          coordinate: s,
          text: i
        },
        required: ["coordinate"]
      }
    }, {
      name: "triple_click",
      description: "Triple-click at the given coordinates. Selects a line in most text editors. The frontmost application must be in the session allowlist at the time of this call, or this tool returns an error and does nothing.",
      inputSchema: {
        type: "object",
        properties: {
          coordinate: s,
          text: i
        },
        required: ["coordinate"]
      }
    }, {
      name: "right_click",
      description: "Right-click at the given coordinates. Opens a context menu in most applications. The frontmost application must be in the session allowlist at the time of this call, or this tool returns an error and does nothing.",
      inputSchema: {
        type: "object",
        properties: {
          coordinate: s,
          text: i
        },
        required: ["coordinate"]
      }
    }, {
      name: "middle_click",
      description: "Middle-click (scroll-wheel click) at the given coordinates. The frontmost application must be in the session allowlist at the time of this call, or this tool returns an error and does nothing.",
      inputSchema: {
        type: "object",
        properties: {
          coordinate: s,
          text: i
        },
        required: ["coordinate"]
      }
    }, {
      name: "type",
      description: "Type text into whatever currently has keyboard focus. The frontmost application must be in the session allowlist at the time of this call, or this tool returns an error and does nothing. Newlines are supported. For keyboard shortcuts use `key` instead.",
      inputSchema: {
        type: "object",
        properties: {
          text: {
            type: "string",
            description: "Text to type."
          }
        },
        required: ["text"]
      }
    }, {
      name: "key",
      description: 'Press a key or key combination (e.g. "return", "escape", "cmd+a", "ctrl+shift+tab"). The frontmost application must be in the session allowlist at the time of this call, or this tool returns an error and does nothing. ' + "System-level combos (quit app, switch app, lock screen) require the `systemKeyCombos` grant \u2014 without it they return an error. All other combos work.",
      inputSchema: {
        type: "object",
        properties: {
          text: {
            type: "string",
            description: 'Modifiers joined with "+", e.g. "cmd+shift+a".'
          },
          repeat: {
            type: "integer",
            minimum: 1,
            maximum: 100,
            description: "Number of times to repeat the key press. Default is 1."
          }
        },
        required: ["text"]
      }
    }, {
      name: "scroll",
      description: "Scroll at the given coordinates. The frontmost application must be in the session allowlist at the time of this call, or this tool returns an error and does nothing.",
      inputSchema: {
        type: "object",
        properties: {
          coordinate: s,
          scroll_direction: {
            type: "string",
            enum: ["up", "down", "left", "right"],
            description: "Direction to scroll."
          },
          scroll_amount: {
            type: "integer",
            minimum: 0,
            maximum: 100,
            description: "Number of scroll ticks."
          }
        },
        required: ["coordinate", "scroll_direction", "scroll_amount"]
      }
    }, {
      name: "left_click_drag",
      description: "Press, move to target, and release. The frontmost application must be in the session allowlist at the time of this call, or this tool returns an error and does nothing.",
      inputSchema: {
        type: "object",
        properties: {
          coordinate: {
            ...s,
            description: `(x, y) end point: ${r.x}`
          },
          start_coordinate: {
            ...s,
            description: `(x, y) start point. If omitted, drags from the current cursor position. ${r.x}`
          }
        },
        required: ["coordinate"]
      }
    }, {
      name: "mouse_move",
      description: "Move the mouse cursor without clicking. Useful for triggering hover states. The frontmost application must be in the session allowlist at the time of this call, or this tool returns an error and does nothing.",
      inputSchema: {
        type: "object",
        properties: {
          coordinate: s
        },
        required: ["coordinate"]
      }
    }, {
      name: "open_application",
      description: "Bring an application to the front, launching it if necessary. The target application must already be in the session allowlist \u2014 call request_access first.",
      inputSchema: {
        type: "object",
        properties: {
          app: {
            type: "string",
            description: 'Display name (e.g. "Slack") or bundle identifier (e.g. "com.tinyspeck.slackmacgap").'
          }
        },
        required: ["app"]
      }
    }, {
      name: "switch_display",
      description: "Switch which monitor subsequent screenshots capture. Use this when the application you need is on a different monitor than the one shown. The screenshot tool tells you which monitor it captured and lists " + "other attached monitors by name \u2014 pass one of those names here. " + 'After switching, call screenshot to see the new monitor. Pass "auto" to return to automatic monitor selection.',
      inputSchema: {
        type: "object",
        properties: {
          display: {
            type: "string",
            description: 'Monitor name from the screenshot note (e.g. "Built-in Retina Display", "LG UltraFine"), or "auto" to re-enable automatic selection.'
          }
        },
        required: ["display"]
      }
    }, {
      name: "list_granted_applications",
      description: "List the applications currently in the session allowlist, plus the active grant flags and coordinate mode. No side effects.",
      inputSchema: {
        type: "object",
        properties: {},
        required: []
      }
    }, {
      name: "read_clipboard",
      description: "Read the current clipboard contents as text. Requires the `clipboardRead` grant.",
      inputSchema: {
        type: "object",
        properties: {},
        required: []
      }
    }, {
      name: "write_clipboard",
      description: "Write text to the clipboard. Requires the `clipboardWrite` grant.",
      inputSchema: {
        type: "object",
        properties: {
          text: {
            type: "string"
          }
        },
        required: ["text"]
      }
    }, {
      name: "wait",
      description: "Wait for a specified duration.",
      inputSchema: {
        type: "object",
        properties: {
          duration: {
            type: "number",
            description: "Duration in seconds (0\u2013100)."
          }
        },
        required: ["duration"]
      }
    }, {
      name: "cursor_position",
      description: "Get the current mouse cursor position. Returns image-pixel coordinates relative to the most recent screenshot, or logical points if no screenshot has been taken.",
      inputSchema: {
        type: "object",
        properties: {},
        required: []
      }
    }, {
      name: "hold_key",
      description: "Press and hold a key or key combination for the specified duration, then release. The frontmost application must be in the session allowlist at the time of this call, or this tool returns an error and does nothing. System-level combos require the `systemKeyCombos` grant.",
      inputSchema: {
        type: "object",
        properties: {
          text: {
            type: "string",
            description: 'Key or chord to hold, e.g. "space", "shift+down".'
          },
          duration: {
            type: "number",
            description: "Duration in seconds (0\u2013100)."
          }
        },
        required: ["text", "duration"]
      }
    }, {
      name: "left_mouse_down",
      description: "Press the left mouse button at the current cursor position and leave it held. The frontmost application must be in the session allowlist at the time of this call, or this tool returns an error and does nothing. Use mouse_move first to position the cursor. Call left_mouse_up to release. Errors if the button is already held.",
      inputSchema: {
        type: "object",
        properties: {},
        required: []
      }
    }, {
      name: "left_mouse_up",
      description: "Release the left mouse button at the current cursor position. The frontmost application must be in the session allowlist at the time of this call, or this tool returns an error and does nothing. Pairs with left_mouse_down. Safe to call even if the button is not currently held.",
      inputSchema: {
        type: "object",
        properties: {},
        required: []
      }
    }, {
      name: "computer_batch",
      description: "Execute a sequence of actions in ONE tool call. Each individual tool call requires a model\u2192API round trip (seconds); " + "batching a predictable sequence eliminates all but one. Use this whenever you can predict the outcome of several actions ahead \u2014 " + `e.g. click a field, type into it, press Return. Actions execute sequentially and stop on the first error. ${"The frontmost application must be in the session allowlist at the time of this call, or this tool returns an error and does nothing."} The frontmost check runs before EACH action inside the batch \u2014 if an action opens a non-allowed app, the next action's gate fires and the batch stops there. ` + "Mid-batch screenshot actions are allowed for inspection but coordinates in subsequent clicks always refer to the PRE-BATCH full-screen screenshot.",
      inputSchema: {
        type: "object",
        properties: {
          actions: {
            type: "array",
            minItems: 1,
            items: H_a,
            description: 'List of actions. Example: [{"action":"left_click","coordinate":[100,200]},{"action":"type","text":"hello"},{"action":"key","text":"Return"}]'
          }
        },
        required: ["actions"]
      }
    }, ...(e.teachMode ? cvp(r, o) : [])];
  }
  function cvp(e, t) {
    let n = {
      explanation: {
        type: "string",
        description: "Tooltip body text. Explain what the user is looking at and why it matters. " + "This is the ONLY place the user sees your words \u2014 be complete but concise."
      },
      next_preview: {
        type: "string",
        description: `One line describing exactly what will happen when the user clicks Next. Example: "Next: I'll click Create Bucket and type the name." Shown below the explanation in a smaller font.`
      },
      anchor: {
        type: "array",
        items: {
          type: "number"
        },
        minItems: 2,
        maxItems: 2,
        description: `(x, y) \u2014 where the tooltip arrow points. ${e.x} Omit to center the tooltip with no arrow (for general-context steps).`
      },
      actions: {
        type: "array",
        items: H_a,
        description: "Actions to execute when the user clicks Next. Same item schema as computer_batch.actions. Empty array is valid for purely explanatory steps. Actions run sequentially and stop on first error."
      }
    };
    return [{
      name: "request_teach_access",
      description: 'Request permission to guide the user through a task step-by-step with on-screen tooltips. Use this INSTEAD OF request_access when the user wants to LEARN how to do something (phrases like "teach me", "walk me through", "show me how", "help me learn"). On approval the main Claude window hides and a fullscreen tooltip overlay appears. You then call teach_step repeatedly; each call shows one tooltip and waits for the user to click Next. Same app-allowlist semantics as request_access, but no clipboard/system-key flags. Teach mode ends automatically when your turn ends.',
      inputSchema: {
        type: "object",
        properties: {
          apps: {
            type: "array",
            items: {
              type: "string"
            },
            description: 'Application display names (e.g. "Slack", "Calendar") or bundle identifiers. Resolved case-insensitively against installed apps.' + t
          },
          reason: {
            type: "string",
            description: 'What you will be teaching. Shown in the approval dialog as "Claude wants to guide you through {reason}". Keep it short and task-focused.'
          }
        },
        required: ["apps", "reason"]
      }
    }, {
      name: "teach_step",
      description: "Show one guided-tour tooltip and wait for the user to click Next. On Next, execute the actions, " + "take a fresh screenshot, and return both \u2014 you do NOT need a separate screenshot call between steps. " + "The returned image shows the state after your actions ran; anchor the next teach_step against it. " + "IMPORTANT \u2014 the user only sees the tooltip during teach mode. Put ALL narration in `explanation`. " + "Text you emit outside teach_step calls is NOT visible until teach mode ends. " + "Pack as many actions as possible into each step's `actions` array \u2014 the user waits through " + "the whole round trip between clicks, so one step that fills a form beats five steps that fill one field each. " + "Returns {exited:true} if the user clicks Exit \u2014 do not call teach_step again after that. " + "Take an initial screenshot before your FIRST teach_step to anchor it.",
      inputSchema: {
        type: "object",
        properties: n,
        required: ["explanation", "next_preview", "actions"]
      }
    }, {
      name: "teach_batch",
      description: "Queue multiple teach steps in one tool call. Parallels computer_batch: " + "N steps \u2192 one model\u2194API round trip instead of N. Each step still shows a tooltip " + "and waits for the user's Next click, but YOU aren't waiting for a round trip between steps. " + "You can call teach_batch multiple times in one tour \u2014 treat each batch as one predictable " + "SEGMENT (typically: all the steps on one page). The returned screenshot shows the state after the batch's final actions; anchor the NEXT teach_batch against it. WITHIN a batch, all anchors and click coordinates refer to the PRE-BATCH screenshot " + "(same invariant as computer_batch) \u2014 for steps 2+ in a batch, either omit anchor " + "(centered tooltip) or target elements you know won't have moved. " + "Good pattern: batch 5 tooltips on page A (last step navigates) \u2192 read returned screenshot \u2192 " + "batch 3 tooltips on page B \u2192 done. " + "Returns {exited:true, stepsCompleted:N} if the user clicks Exit \u2014 do NOT call again after that; " + "{stepsCompleted, stepFailed, ...} if an action errors mid-batch; otherwise {stepsCompleted, results:[...]} plus a final screenshot. Fall back to individual teach_step calls when you need to react to each intermediate screenshot.",
      inputSchema: {
        type: "object",
        properties: {
          steps: {
            type: "array",
            minItems: 1,
            items: {
              type: "object",
              properties: n,
              required: ["explanation", "next_preview", "actions"]
            },
            description: "Ordered steps. Validated upfront \u2014 a typo in step 5 errors before any tooltip shows."
          }
        },
        required: ["steps"]
      }
    }];
  }
  var lvp;
  var H_a;
  var Rmo = __lazy(() => {
    lvp = {
      pixels: {
        x: "Horizontal pixel position read directly from the most recent screenshot image, measured from the left edge. The server handles all scaling.",
        y: "Vertical pixel position read directly from the most recent screenshot image, measured from the top edge. The server handles all scaling."
      },
      normalized_0_100: {
        x: "Horizontal position as a percentage of screen width, 0.0\u2013100.0 (0 = left edge, 100 = right edge).",
        y: "Vertical position as a percentage of screen height, 0.0\u2013100.0 (0 = top edge, 100 = bottom edge)."
      }
    };
    H_a = {
      type: "object",
      properties: {
        action: {
          type: "string",
          enum: ["key", "type", "mouse_move", "left_click", "left_click_drag", "right_click", "middle_click", "double_click", "triple_click", "scroll", "hold_key", "screenshot", "cursor_position", "left_mouse_down", "left_mouse_up", "wait"],
          description: "The action to perform."
        },
        coordinate: {
          type: "array",
          items: {
            type: "number"
          },
          minItems: 2,
          maxItems: 2,
          description: "(x, y) for click/mouse_move/scroll/left_click_drag end point."
        },
        start_coordinate: {
          type: "array",
          items: {
            type: "number"
          },
          minItems: 2,
          maxItems: 2,
          description: "(x, y) drag start \u2014 left_click_drag only. Omit to drag from current cursor."
        },
        text: {
          type: "string",
          description: "For type: the text. For key/hold_key: the chord string. For click/scroll: modifier keys to hold."
        },
        scroll_direction: {
          type: "string",
          enum: ["up", "down", "left", "right"]
        },
        scroll_amount: {
          type: "integer",
          minimum: 0,
          maximum: 100
        },
        duration: {
          type: "number",
          description: "Seconds (0\u2013100). For hold_key/wait."
        },
        repeat: {
          type: "integer",
          minimum: 1,
          maximum: 100,
          description: "For key: repeat count."
        }
      },
      required: ["action"]
    };
  });
  function q_a(e, t, n) {
    let r = new Set(e.map(a => a.bundleId));
    let o = [...e, ...n.granted.filter(a => !r.vZc(a.bundleId))];
    let s = Object.fromEntries(Object.entries(n.flags).filter(([, a]) => a === true));
    let i = {
      ...jX,
      ...t,
      ...s
    };
    return {
      apps: o,
      flags: i
    };
  }
  function zHn(e, t, n) {
    let {
      logger: r,
      serverName: o
    } = e;
    let s;
    let i = n.onPermissionRequest ? async (l, c) => {
      let u = await n.onPermissionRequest(l, c);
      let {
        apps: d,
        flags: p
      } = q_a(n.getAllowedApps(), n.getGrantFlags(), u);
      r.debug(`[${o}] permission result: granted=${u.granted.length} denied=${u.denied.length}`);
      n.onAllowedAppsChanged?.(d, p);
      return u;
    } : undefined;
    let a = n.onTeachPermissionRequest ? async (l, c) => {
      let u = await n.onTeachPermissionRequest(l, c);
      r.debug(`[${o}] teach permission result: granted=${u.granted.length} denied=${u.denied.length}`);
      let {
        apps: d
      } = q_a(n.getAllowedApps(), n.getGrantFlags(), u);
      n.onAllowedAppsChanged?.(d, {
        ...jX,
        ...n.getGrantFlags()
      });
      return u;
    } : undefined;
    return async (l, c) => {
      if (n.checkCuLock) {
        let m = await n.checkCuLock();
        if (m.holder !== undefined && !m.isSelf) {
          return {
            content: [{
              type: "text",
              text: n.formatLockHeldMessage?.(m.holder) ?? "Another Claude session is currently using the computer. Wait for that session to finish, or find a non-computer-use approach."
            }],
            isError: true,
            telemetry: {
              error_kind: "cu_lock_held"
            }
          };
        }
        if (m.holder === undefined && !wmo(l)) {
          await n.acquireCuLock?.();
          let f = await n.checkCuLock();
          if (f.holder !== undefined && !f.isSelf) {
            return {
              content: [{
                type: "text",
                text: n.formatLockHeldMessage?.(f.holder) ?? "Another Claude session is currently using the computer. Wait for that session to finish, or find a non-computer-use approach."
              }],
              isError: true,
              telemetry: {
                error_kind: "cu_lock_held"
              }
            };
          }
          vmo();
        }
      }
      let u = s ? undefined : n.getLastScreenshotDims?.();
      let d = new AbortController();
      let p = {
        allowedApps: [...n.getAllowedApps()],
        grantFlags: n.getGrantFlags(),
        userDeniedBundleIds: n.getUserDeniedBundleIds(),
        coordinateMode: t,
        selectedDisplayId: n.getSelectedDisplayId(),
        displayPinnedByModel: n.getDisplayPinnedByModel?.(),
        displayResolvedForApps: n.getDisplayResolvedForApps?.(),
        lastScreenshot: s ?? (u ? {
          ...u,
          base64: ""
        } : undefined),
        onPermissionRequest: i ? m => i(m, d.signal) : undefined,
        onTeachPermissionRequest: a ? m => a(m, d.signal) : undefined,
        onAppsHidden: n.onAppsHidden,
        getClipboardStash: n.getClipboardStash,
        onClipboardStashChanged: n.onClipboardStashChanged,
        onResolvedDisplayUpdated: n.onResolvedDisplayUpdated,
        onDisplayPinned: n.onDisplayPinned,
        onDisplayResolvedForApps: n.onDisplayResolvedForApps,
        onTeachModeActivated: n.onTeachModeActivated,
        onTeachStep: n.onTeachStep,
        onTeachWorking: n.onTeachWorking,
        getTeachModeActive: n.getTeachModeActive,
        checkCuLock: undefined,
        acquireCuLock: undefined,
        isAborted: n.isAborted
      };
      r.debug(`[${o}] tool=${l} allowedApps=${p.allowedApps.length} coordMode=${t}`);
      try {
        let m = await B_a(e, l, c, p);
        if (m.screenshot) {
          s = m.screenshot;
          let {
            base64: f,
            ...h
          } = m.screenshot;
          r.debug(`[${o}] screenshot dims: ${JSON.stringify(h)}`);
          n.onScreenshotCaptured?.(h);
        }
        return m;
      } finally {
        d.abort();
      }
    };
  }
  function xmo(e, t, n) {
    let {
      serverName: r,
      logger: o
    } = e;
    let s = new pye({
      name: r,
      version: "0.1.3"
    }, {
      capabilities: {
        tools: {},
        logging: {}
      }
    });
    let i = s5e(e.executor.capabilities, t);
    if (s.setRequestHandler(q7, async () => e.isDisabled() ? {
      tools: []
    } : {
      tools: i
    }), n) {
      let a = zHn(e, t, n);
      s.setRequestHandler(A6, async l => {
        let {
          screenshot: c,
          telemetry: u,
          ...d
        } = await a(l.params.name, l.params.arguments ?? {});
        return d;
      });
      return s;
    }
    s.setRequestHandler(A6, async a => (o.warn(`[${r}] tool call "${a.params.name}" reached the stub handler \u2014 no session context bound. Per-session state unavailable.`), {
      content: [{
        type: "text",
        text: "This computer-use server instance is not wired to a session. Per-session app permissions are not available on this code path."
      }],
      isError: true
    }));
    return s;
  }
  var W_a = __lazy(() => {
    BOt();
    $_a();
    Rmo();
    BHn();
  });
  var Hpt = __lazy(() => {
    BHn();
    f_a();
    W_a();
    Rmo();
  });