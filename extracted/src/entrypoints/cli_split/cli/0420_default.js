  __export(pdc, {
    sanitizeKeytermsForHeader: () => sanitizeKeytermsForHeader,
    probeVoiceConnectivity: () => probeVoiceConnectivity,
    isVoiceStreamAvailable: () => isVoiceStreamAvailable,
    isTypedInterimsEnabled: () => isTypedInterimsEnabled,
    connectVoiceStream: () => connectVoiceStream,
    FINALIZE_TIMEOUTS_MS: () => FINALIZE_TIMEOUTS_MS
  });
  function Wdr(e, t, n) {
    return typeof e === "number" && Number.isInteger(e) && e >= t && e <= n ? String(e) : "unknown";
  }
  function Zlf(e) {
    return gd(e)?.toLowerCase() ?? "unknown";
  }
  async function probeVoiceConnectivity() {
    if (Vi() || yye()) {
      return "skipped_privacy";
    }
    try {
      let e = await NP.get(`${getOauthConfig().BASE_API_URL}/api/hello`, {
        headers: {
          "User-Agent": getUserAgent()
        },
        timeout: 1500,
        validateStatus: () => true,
        maxRedirects: 0
      });
      let t = Wdr(e.status, 100, 599);
      return e.headers["cf-mitigated"] !== undefined ? `cf_mitigated_${t}` : `http_${t}`;
    } catch (e) {
      let t = NP.isAxiosError(e) ? e.code : undefined;
      return t === "ECONNABORTED" || t === "ETIMEDOUT" ? "timeout" : "fetch_failed";
    }
  }
  function isTypedInterimsEnabled() {
    if (st(process.env.CLAUDE_CODE_VOICE_FORWARD_INTERIMS_TYPED)) {
      return true;
    }
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_brick_follow", false);
  }
  function isVoiceStreamAvailable() {
    if (!isAnthropicAuthEnabled()) {
      return false;
    }
    let e = getClaudeAIOAuthTokens();
    return e !== null && e.accessToken !== null;
  }
  function sanitizeKeytermsForHeader(e) {
    let t = new Set();
    let n = [];
    let r = 0;
    for (let o of e) {
      let s = o.replace(/,/g, " ").replace(/[^\x20-\x7E]/g, "").replace(/\s+/g, " ").trim();
      if (!s || t.vZc(s)) {
        continue;
      }
      let i = s.length + (n.length > 0 ? 1 : 0);
      if (r + i > 1024) {
        break;
      }
      t.add(s);
      n.push(s);
      r += i;
    }
    return n.join(",");
  }
  async function connectVoiceStream(e, t) {
    await checkAndRefreshOAuthTokenIfNeeded();
    let n = getClaudeAIOAuthTokens();
    if (!n?.accessToken) {
      logForDebugging("[voice_stream] No OAuth token available");
      return null;
    }
    let r = process.env.VOICE_STREAM_BASE_URL || getOauthConfig().BASE_API_URL.replace("https://", "wss://").replace("http://", "ws://");
    if (process.env.VOICE_STREAM_BASE_URL) {
      logForDebugging(`[voice_stream] Using VOICE_STREAM_BASE_URL override: ${process.env.VOICE_STREAM_BASE_URL}`);
    }
    let o = isTypedInterimsEnabled();
    let s = new URLSearchParams({
      encoding: "linear16",
      sample_rate: "16000",
      channels: "1",
      endpointing_ms: "300",
      utterance_end_ms: "1000",
      language: t?.language ?? "en",
      use_conversation_engine: "true",
      ...(o && {
        forward_interims: "typed"
      }),
      stt_provider: "deepgram-nova3"
    });
    let i = `${r}${"/api/ws/speech_to_text/voice_stream"}?${s.toString()}`;
    logForDebugging(`[voice_stream] Connecting to ${i}`);
    let a = {
      Authorization: `Bearer ${n.accessToken}`,
      "User-Agent": getUserAgent(),
      "x-app": "cli",
      "anthropic-client-platform": getClientPlatform()
    };
    if (t?.keyterms?.length) {
      let A = sanitizeKeytermsForHeader(t.keyterms);
      if (A) {
        a["x-config-keyterms"] = A;
      }
    }
    let l = getWebSocketTLSOptions();
    let c = {
      headers: a,
      proxy: getWebSocketProxyUrl(i),
      Aeu: l || undefined
    };
    let u = new CCe.default(i, c);
    let d = null;
    let p = false;
    let m = false;
    let f = false;
    let h = false;
    let g = false;
    let y = null;
    let _ = null;
    let b = {
      send(A) {
        if (u.readyState !== CCe.default.OPEN) {
          return;
        }
        if (f) {
          logForDebugging(`[voice_stream] Dropping audio chunk after CloseStream: ${String(A.length)} bytes`);
          return;
        }
        logForDebugging(`[voice_stream] Sending audio chunk: ${String(A.length)} bytes`);
        u.send(Buffer.from(A));
      },
      finalize() {
        if (h || f) {
          return Promise.resolve("ws_already_closed");
        }
        h = true;
        return new Promise(A => {
          let k = setTimeout(() => y?.("safety_timeout"), FINALIZE_TIMEOUTS_MS.safety);
          let I = setTimeout(() => y?.("no_data_timeout"), FINALIZE_TIMEOUTS_MS.noData);
          if (_ = () => {
            clearTimeout(I);
            _ = null;
          }, y = O => {
            if (clearTimeout(k), clearTimeout(I), y = null, _ = null, S) {
              logForDebugging(`[voice_stream] Promoting unreported interim before ${O} resolve`);
              let M = S;
              S = "";
              e.onTranscript(M, true);
            }
            logForDebugging(`[voice_stream] Finalize resolved via ${O}`);
            A(O);
          }, u.readyState === CCe.default.CLOSED || u.readyState === CCe.default.CLOSING) {
            y("ws_already_closed");
            return;
          }
          setTimeout(() => {
            if (f = true, u.readyState === CCe.default.OPEN) {
              logForDebugging("[voice_stream] Sending CloseStream (finalize)");
              u.send('{"type":"CloseStream"}');
            }
          }, 0);
        });
      },
      close() {
        if (f = true, d) {
          clearInterval(d);
          d = null;
        }
        if (p = false, u.readyState === CCe.default.OPEN) {
          u.close();
        }
      },
      isConnected() {
        return p && u.readyState === CCe.default.OPEN;
      }
    };
    u.on("open", () => {
      logForDebugging("[voice_stream] WebSocket connected");
      p = true;
      m = true;
      logForDebugging("[voice_stream] Sending initial KeepAlive");
      u.send('{"type":"KeepAlive"}');
      d = setInterval(A => {
        if (A.readyState === CCe.default.OPEN) {
          logForDebugging("[voice_stream] Sending periodic KeepAlive");
          A.send('{"type":"KeepAlive"}');
        }
      }, 8000, u);
      e.onReady(b);
    });
    let S = "";
    function E(A) {
      if (!S) {
        return;
      }
      logForDebugging(`[voice_stream] Promoting unreported interim to final (${A})`);
      let k = S;
      S = "";
      e.onTranscript(k, true);
    }
    u.on("message", A => {
      let k = A.toString();
      logForDebugging(`[voice_stream] Message received (${String(k.length)} chars)`);
      let I;
      try {
        I = qt(k);
      } catch {
        return;
      }
      switch (I.type) {
        case "TranscriptInterim":
        case "TranscriptText":
          {
            let O = I.data;
            if (logForDebugging(`[voice_stream] ${I.type} (${String(O?.length ?? 0)} chars)`), f) {
              _?.();
            }
            if (O) {
              S = O;
              e.onTranscript(O, false);
            }
            break;
          }
        case "TranscriptEndpoint":
          {
            logForDebugging(`[voice_stream] TranscriptEndpoint received (${String(S.length)} chars pending)`);
            let O = S;
            if (S = "", O) {
              e.onTranscript(O, true);
            }
            if (f) {
              y?.("post_closestream_endpoint");
            }
            break;
          }
        case "TranscriptError":
          {
            let O = I.description ?? I.error_code ?? "unknown transcription error";
            if (logForDebugging(`[voice_stream] TranscriptError: ${O}`), E("TranscriptError"), !h) {
              e.onError(O);
            }
            break;
          }
        case "error":
          {
            let O = I.message ?? `unstructured error frame (keys: ${Object.keys(I).join(", ")})`;
            if (logForDebugging(`[voice_stream] Server error: ${O}`), E("server error"), !h) {
              e.onError(O);
            }
            break;
          }
        default:
          break;
      }
    });
    u.on("close", (A, k) => {
      let I = k?.toString() ?? "";
      if (logForDebugging(`[voice_stream] WebSocket closed: code=${String(A)} reason="${I}"`), p = false, d) {
        clearInterval(d);
        d = null;
      }
      if (E("ws close"), y?.("ws_close"), !h && !g && A !== 1000 && A !== 1005) {
        e.onError(`Connection closed: code ${String(A)}${I ? ` \u2014 ${I}` : ""}`, m ? undefined : {
          connectFailureCode: `ws_closed_${Wdr(A, 1000, 4999)}`
        });
      }
      e.onClose();
    });
    let C = console;
    let x = C.error;
    if (x) {
      C.error = Jlf;
    }
    try {
      u.on("unexpected-response", (A, k) => {
        let I = k.statusCode ?? 0;
        if (I === 101) {
          logForDebugging("[voice_stream] unexpected-response fired with 101; ignoring");
          return;
        }
        if (logForDebugging(`[voice_stream] Upgrade rejected: status=${String(I)} cf-mitigated=${String(k.headers["cf-mitigated"])} cf-ray=${String(k.headers["cf-ray"])}`), g = true, k.resume(), A.destroy(), h) {
          return;
        }
        e.onError(`WebSocket upgrade rejected with HTTP ${String(I)}`, {
          fatal: I >= 400 && I < 500,
          connectFailureCode: k.headers["cf-mitigated"] !== undefined ? `cf_mitigated_${Wdr(I, 100, 599)}` : `upgrade_rejected_${Wdr(I, 100, 599)}`
        });
      });
    } finally {
      if (x) {
        C.error = x;
      }
    }
    u.on("error", A => {
      if (logForDebugging(`[voice_stream] WebSocket error: ${A.message}`, {
        level: "error"
      }), E("ws error"), !h) {
        e.onError(`Voice stream connection error: ${A.message}`, m ? undefined : {
          connectFailureCode: `ws_error_${Zlf(A)}`
        });
      }
    });
    return b;
  }
  var CCe;
  var Jlf = () => {};
  var FINALIZE_TIMEOUTS_MS;
  var iVo = __lazy(() => {
    Dp();
    Uc();
    no();
    je();
    gn();
    dt();
    YA();
    fW();
    Wd();
    Fh();
    $n();
    CCe = __toESM(require("ws"));
    FINALIZE_TIMEOUTS_MS = {
      safety: 5000,
      noData: 1500
    };
  });
  var fdc = {};
  __export(fdc, {
    writeNativePlaybackData: () => writeNativePlaybackData,
    stopNativeRecording: () => stopNativeRecording,
    stopNativePlayback: () => stopNativePlayback,
    startNativeRecording: () => startNativeRecording,
    startNativePlayback: () => startNativePlayback,
    microphoneAuthorizationStatus: () => microphoneAuthorizationStatus,
    isNativeRecordingActive: () => isNativeRecordingActive,
    isNativePlaying: () => isNativePlaying,
    isNativeAudioAvailable: () => isNativeAudioAvailable
  });
  function RCe() {
    if (mdc) {
      return Ftn;
    }
    mdc = true;
    let e = "linux";
    if (e !== "darwin" && e !== "linux" && e !== "win32") {
      return null;
    }
    try {
      Ftn = jis();
      return Ftn;
    } catch {}
    let t = `arm64-${e}`;
    let n = [`./vendor/audio-capture/${t}/audio-capture.node`, `../audio-capture/${t}/audio-capture.node`];
    for (let r of n) {
      try {
        Ftn = require(r);
        return Ftn;
      } catch {}
    }
    return null;
  }
  function isNativeAudioAvailable() {
    return RCe() !== null;
  }
  function startNativeRecording(e, t) {
    let n = RCe();
    if (!n) {
      return false;
    }
    return n.startRecording(e, t);
  }
  function stopNativeRecording() {
    let e = RCe();
    if (!e) {
      return;
    }
    e.stopRecording();
  }
  function isNativeRecordingActive() {
    let e = RCe();
    if (!e) {
      return false;
    }
    return e.isRecording();
  }
  function startNativePlayback(e, t) {
    let n = RCe();
    if (!n) {
      return false;
    }
    return n.startPlayback(e, t);
  }
  function writeNativePlaybackData(e) {
    let t = RCe();
    if (!t) {
      return;
    }
    t.writePlaybackData(e);
  }
  function stopNativePlayback() {
    let e = RCe();
    if (!e) {
      return;
    }
    e.stopPlayback();
  }
  function isNativePlaying() {
    let e = RCe();
    if (!e) {
      return false;
    }
    return e.isPlaying();
  }
  function microphoneAuthorizationStatus() {
    let e = RCe();
    if (!e || !e.microphoneAuthorizationStatus) {
      return 0;
    }
    return e.microphoneAuthorizationStatus();
  }
  var Ftn = null;
  var mdc = false;
  var Utn = {};
  __export(Utn, {
    stopRecording: () => stopRecording,
    startRecording: () => startRecording,
    requestMicrophonePermission: () => requestMicrophonePermission,
    checkVoiceDependencies: () => checkVoiceDependencies,
    checkRecordingAvailability: () => checkRecordingAvailability,
    _resetArecordProbeForTesting: () => _resetArecordProbeForTesting,
    _resetAlsaCardsForTesting: () => _resetAlsaCardsForTesting
  });
  function zdr() {
    hdc ??= (async () => {
      let e = Date.now();
      let t = await Promise.resolve().then(() => fdc);
      t.isNativeAudioAvailable();
      aVo = t;
      logForDebugging(`[voice] audio-capture-napi loaded in ${Date.now() - e}ms`);
      return t;
    })();
    return hdc;
  }
  async function xCe(e) {
    return (await execFileNoThrow(e, ["--version"], {
      timeout: 3000,
      useCwd: false
    })).code === 0;
  }
  function _dc() {
    lVo ??= new Promise(e => {
      let t = Vdr.spawn("arecord", ["-f", "S16_LE", "-r", String(16000), "-c", String(1), "-t", "raw", "/dev/null"], {
        stdio: ["ignore", "ignore", "pipe"],
        windowsHide: true
      });
      let n = "";
      t.stderr?.on("data", o => {
        n += o.toString();
      });
      let r = setTimeout((o, s) => {
        o.kill("SIGTERM");
        s({
          ok: true,
          stderr: ""
        });
      }, 150, t, e);
      t.once("close", o => {
        clearTimeout(r);
        e({
          ok: o === 0,
          stderr: n.trim()
        });
      });
      t.once("error", () => {
        clearTimeout(r);
        e({
          ok: false,
          stderr: "arecord: command not found"
        });
      });
    });
    return lVo;
  }
  function _resetArecordProbeForTesting() {
    lVo = null;
  }
  function pVo() {
    cVo ??= ydc.readFile("/proc/asound/cards", "utf8").then(e => {
      let t = e.trim();
      return t !== "" && !t.includes("no soundcards");
    }, () => false);
    return cVo;
  }
  function _resetAlsaCardsForTesting() {
    cVo = null;
  }
  async function bdc() {
    if (await xCe("apt-get")) {
      return {
        cmd: "sudo",
        args: ["apt-get", "install", "-y", "sox"],
        displayCommand: "sudo apt-get install sox"
      };
    }
    if (await xCe("dnf")) {
      return {
        cmd: "sudo",
        args: ["dnf", "install", "-y", "sox"],
        displayCommand: "sudo dnf install sox"
      };
    }
    if (await xCe("pacman")) {
      return {
        cmd: "sudo",
        args: ["pacman", "-S", "--noconfirm", "sox"],
        displayCommand: "sudo pacman -S sox"
      };
    }
    return null;
  }
  async function checkVoiceDependencies() {
    if ((await zdr()).isNativeAudioAvailable() && (await pVo())) {
      return {
        available: true,
        missing: [],
        installCommand: null
      };
    }
    if (await xCe("arecord")) {
      return {
        available: true,
        missing: [],
        installCommand: null
      };
    }
    let t = [];
    if (!(await xCe("sox"))) {
      t.push("sox (rec command)");
    }
    let n = t.length > 0 ? await bdc() : null;
    return {
      available: t.length === 0,
      missing: t,
      installCommand: n?.displayCommand ?? null
    };
  }
  async function requestMicrophonePermission() {
    if (!(await zdr()).isNativeAudioAvailable()) {
      return true;
    }
    if (await startRecording(n => {}, () => {}, {
      silenceDetection: false
    })) {
      stopRecording();
      return true;
    }
    return false;
  }
  async function checkRecordingAvailability() {
    if (cC() || st(process.env.CLAUDE_CODE_REMOTE)) {
      return {
        available: false,
        reason: `Voice mode requires microphone access, but no audio device is available in this environment.

To use voice mode, run Claude Code locally instead.`
      };
    }
    if ((await zdr()).isNativeAudioAvailable() && (await pVo())) {
      return {
        available: true,
        reason: null
      };
    }
    let t = `Voice mode could not find a working audio recorder in WSL.

` + `WSL2 with WSLg provides audio via PulseAudio \u2014 install SoX with its PulseAudio backend (sudo apt install sox libsox-fmt-pulse) so Claude Code can record through it.

` + "If WSLg is not available (for example WSL1), run Claude Code in native Windows instead.";
    if (await xCe("arecord")) {
      let r = await _dc();
      if (r.ok) {
        return {
          available: true,
          reason: null
        };
      }
      logForDebugging(`[voice] arecord probe failed: ${r.stderr}`);
    }
    let n = await xCe("sox");
    if (n && (await xCe("rec"))) {
      return {
        available: true,
        reason: null
      };
    }
    if (Wt() === "wsl") {
      return {
        available: false,
        reason: t
      };
    }
    if (!n) {
      let r = await bdc();
      return {
        available: false,
        reason: r ? `Voice mode requires SoX for audio recording. Install it with: ${r.displayCommand}` : `Voice mode requires SoX for audio recording. Install SoX manually:
  macOS: brew install sox
  Ubuntu/Debian: sudo apt-get install sox
  Fedora: sudo dnf install sox`
      };
    }
    return {
      available: false,
      reason: `Voice mode requires a microphone, but SoX could not open an audio capture device.

This usually means the host has no microphone (for example, a remote server). Run Claude Code on a machine with a microphone to use voice input.`
    };
  }
  async function startRecording(e, t, n) {
    logForDebugging("[voice] startRecording called, platform=linux");
    let r = await zdr();
    let o = r.isNativeAudioAvailable() && (await pVo());
    let s = n?.silenceDetection !== false;
    if (o) {
      if (XCt || r.isNativeRecordingActive()) {
        r.stopNativeRecording();
        XCt = false;
      }
      if (r.startNativeRecording(a => {
        e(a);
      }, () => {
        if (s) {
          XCt = false;
          t();
        }
      })) {
        XCt = true;
        return true;
      }
    }
    if ((await xCe("arecord")) && (await _dc()).ok) {
      return _cf(e, t);
    }
    return ycf(e, t, n);
  }
  function ycf(e, t, n) {
    let r = n?.silenceDetection !== false;
    let o = ["-q", "--buffer", "1024", "-t", "raw", "-r", String(16000), "-e", "signed", "-b", "16", "-c", String(1), "-"];
    if (r) {
      o.push("silence", "1", "0.1", "3%", "1", "2.0", "3%");
    }
    let s = Vdr.spawn("rec", o, {
      stdio: ["pipe", "pipe", "pipe"],
      windowsHide: true
    });
    kCe = s;
    s.stdout?.on("data", i => {
      e(i);
    });
    s.stderr?.on("data", () => {});
    s.on("close", () => {
      kCe = null;
      t();
    });
    s.on("error", i => {
      logForDebugging(`[voice] SoX rec spawn failed: ${i instanceof Error ? i.message : String(i)}`, {
        level: "error"
      });
      kCe = null;
      t();
    });
    return true;
  }
  function _cf(e, t) {
    let n = ["-f", "S16_LE", "-r", String(16000), "-c", String(1), "-t", "raw", "-q", "-"];
    let r = Vdr.spawn("arecord", n, {
      stdio: ["pipe", "pipe", "pipe"],
      windowsHide: true
    });
    kCe = r;
    r.stdout?.on("data", o => {
      e(o);
    });
    r.stderr?.on("data", () => {});
    r.on("close", () => {
      kCe = null;
      t();
    });
    r.on("error", o => {
      logForDebugging(`[voice] arecord recorder spawn error: ${o}`, {
        level: "error"
      });
      kCe = null;
      t();
    });
    return true;
  }
  function stopRecording() {
    if (XCt && aVo) {
      aVo.stopNativeRecording();
      XCt = false;
      return;
    }
    if (kCe) {
      kCe.kill("SIGTERM");
      kCe = null;
    }
  }
  var Vdr;
  var ydc;
  var aVo = null;
  var hdc = null;
  var lVo = null;
  var cVo = null;
  var kCe = null;
  var XCt = false;
  var Btn = __lazy(() => {
    je();
    gn();
    ji();
    Cs();
    Vdr = require("child_process");
    ydc = require("fs/promises");
  });
  var Edc = {};
  __export(Edc, {
    call: () => call_export92
  });
  function Scf(e) {
    let t = e.trim().toLowerCase();
    if (t === "") {
      return;
    }
    if (t === "hold" || t === "tap" || t === "off") {
      return t;
    }
    return "invalid";
  }
  var call_export92 = async e => {
    if (!JCt()) {
      if (!isAnthropicAuthEnabled()) {
        return {
          type: "text",
          value: "Voice mode requires a Claude.ai account. Please run /login to sign in."
        };
      }
      let S = policyDeniedReason("allow_voice_mode", "Voice mode", "is");
      if (S) {
        return {
          type: "text",
          value: S
        };
      }
      return {
        type: "text",
        value: "Voice mode is not available."
      };
    }
    let t = getInitialSettings();
    let n = Ntn(t);
    let r = Scf(e);
    if (r === "invalid") {
      return {
        type: "text",
        value: `Unknown mode: "${e.trim()}". Use hold, tap, or off.`
      };
    }
    if (r === "off" || r === undefined && n) {
      if (updateSettingsForSource("userSettings", {
        voiceEnabled: false,
        voice: {
          ...t.voice,
          enabled: false
        }
      }).error) {
        return {
          type: "text",
          value: "Failed to update settings. Check your settings file for syntax errors."
        };
      }
      logEvent("tengu_voice_toggled", {
        enabled: false
      });
      return {
        type: "text",
        value: "Voice mode disabled."
      };
    }
    let {
      isVoiceStreamAvailable: o
    } = await Promise.resolve().then(() => (iVo(), pdc));
    let {
      checkRecordingAvailability: s
    } = await Promise.resolve().then(() => (Btn(), Utn));
    let i = await s();
    if (!i.available) {
      return {
        type: "text",
        value: i.reason ?? "Voice mode is not available in this environment."
      };
    }
    if (!o()) {
      return {
        type: "text",
        value: "Voice mode requires a Claude.ai account. Please run /login to sign in."
      };
    }
    let {
      checkVoiceDependencies: a,
      requestMicrophonePermission: l
    } = await Promise.resolve().then(() => (Btn(), Utn));
    let c = await a();
    if (!c.available) {
      return {
        type: "text",
        value: `No audio recording tool found.${c.installCommand ? `
Install audio recording tools? Run: ${c.installCommand}` : `
Install SoX manually for audio recording.`}`
      };
    }
    if (!(await l())) {
      let S;
      S = "your system's audio settings";
      return {
        type: "text",
        value: `Microphone access is denied. To enable it, go to ${S}, then run /voice again.`
      };
    }
    let u = r === "hold" || r === "tap" ? r : t.voice?.mode ?? "hold";
    if (updateSettingsForSource("userSettings", {
      voiceEnabled: true,
      voice: {
        ...t.voice,
        enabled: true,
        mode: u
      }
    }).error) {
      return {
        type: "text",
        value: "Failed to update settings. Check your settings file for syntax errors."
      };
    }
    logEvent("tengu_voice_toggled", {
      enabled: true,
      tap_mode: u === "tap"
    });
    let p = dx("voice:pushToTalk", "Chat", "space");
    let m = u === "tap" ? `Tap ${p} (with input empty) to start, tap again to send.` : `Hold ${p} to record.`;
    let f = iZe(t.language);
    let h = getGlobalConfig();
    let g = h.voiceLangHintLastLanguage !== f.code;
    let y = g ? 0 : h.voiceLangHintShownCount ?? 0;
    let _ = !f.fellBackFrom && y < 2;
    let b = "";
    if (f.fellBackFrom) {
      b = ` Note: "${f.fellBackFrom}" is not a supported dictation language; using English. Change it via /config.`;
    } else if (_) {
      b = ` Dictation language: ${f.code} (/config to change).`;
    }
    if (g || _) {
      saveGlobalConfig(S => ({
        ...S,
        voiceLangHintShownCount: y + (_ ? 1 : 0),
        voiceLangHintLastLanguage: f.code
      }));
    }
    return {
      type: "text",
      value: `Voice mode enabled (${u}). ${m}${b}`
    };
  };
  var vdc = __lazy(() => {
    E7();
    kre();
    Ot();
    Kc();
    no();
    Ltn();
  });
  var wdc = {};
  __export(wdc, {
    default: () => Ecf
  });
  var Ecf;
  function CJe(e) {
    return (t, n) => {
      e(r => {
        if (n === undefined) {
          if (!(t in r.replContexts)) {
            return r;
          }
          let {
            [t]: o,
            ...s
          } = r.replContexts;
          return {
            ...r,
            replContexts: s
          };
        }
        if (r.replContexts[t] === n) {
          return r;
        }
        return {
          ...r,
          replContexts: {
            ...r.replContexts,
            [t]: n
          }
        };
      });
    };
  }
  var Rdc = {};