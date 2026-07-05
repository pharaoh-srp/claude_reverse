  __export(IE, {
    setupTokenHandler: () => setupTokenHandler,
    installHandler: () => installHandler,
    doctorHandler: () => doctorHandler,
    createSubcommandRoot: () => createSubcommandRoot
  });
  function createSubcommandRoot() {
    return createRoot({
      ...getBaseRenderOptions(false),
      patchConsole: false
    });
  }
  async function setupTokenHandler(e) {
    logEvent("tengu_setup_token_command", {});
    let t = !isAnthropicAuthEnabled();
    let {
      ConsoleOAuthFlow: n
    } = await Promise.resolve().then(() => (bKt(), $fl));
    await new Promise(r => {
      e.render(uB.jsx(AppStateProvider, {
        onChangeAppState: HCe,
        children: uB.jsx(KeybindingSetup, {
          children: uB.jsxs(gXd, {
            flexDirection: "column",
            gap: 1,
            children: [uB.jsx(ABe, {}), t && uB.jsxs(gXd, {
              flexDirection: "column",
              children: [uB.jsx(Text, {
                color: "warning",
                children: "Warning: You already have authentication configured via environment variable or API key helper."
              }), uB.jsx(Text, {
                color: "warning",
                children: "The setup-token command will create a new OAuth token which you can use instead."
              })]
            }), uB.jsx(gXd, {
              paddingLeft: 1,
              children: uB.jsx(n, {
                onDone: () => {
                  r();
                },
                mode: "setup-token",
                startingMessage: "This will guide you through long-lived (1-year) auth token setup for your Claude account. Claude subscription required.",
                urlOutdent: 1
              })
            })]
          })
        })
      }));
    });
    e.unmount();
    Pe("cli_setup_token");
    process.exit(0);
  }
  function Kbf(e) {
    let t = vSc.c(2);
    let {
      onDone: n
    } = e;
    _fr();
    let r;
    if (t[0] !== n) {
      r = uB.jsx(Sfr.Suspense, {
        fallback: null,
        children: uB.jsx(zbf, {
          onDone: n
        })
      });
      t[0] = n;
      t[1] = r;
    } else {
      r = t[1];
    }
    return r;
  }
  async function doctorHandler(e) {
    logEvent("tengu_doctor_command", {});
    await G5({
      hasDynamicMcpConfig: false
    });
    await new Promise(t => {
      e.render(uB.jsx(AppStateProvider, {
        children: uB.jsx(KeybindingSetup, {
          children: uB.jsx(pZt, {
            dynamicMcpConfig: undefined,
            isStrictMcpConfig: false,
            children: uB.jsx(Kbf, {
              onDone: () => {
                t();
              }
            })
          })
        })
      }));
    });
    e.unmount();
    Pe("cli_doctor");
    process.exit(0);
  }
  async function installHandler(e, t) {
    if (Me.DISABLE_UPDATES) {
      process.stdout.write(`Updates are disabled by your administrator. Contact your IT team to get the latest version.
`);
      process.exit(0);
    }
    let {
      setup: n
    } = await Promise.resolve().then(() => (ffr(), mfr));
    await n(wSc.cwd(), "default", false, false, undefined, false);
    let {
      install: r
    } = await Promise.resolve().then(() => (ESc(), TSc));
    await new Promise(o => {
      let s = [];
      if (e) {
        s.push(e);
      }
      if (t.force) {
        s.push("--force");
      }
      r.call(i => {
        if (o(), i.includes("failed")) {
          Ae("cli_install", "cli_install_failed");
        } else {
          Pe("cli_install");
        }
        process.exit(i.includes("failed") ? 1 : 0);
      }, {}, s);
    });
  }
  var vSc;
  var wSc;
  var Sfr;
  var uB;
  var zbf;
  var PE = __lazy(() => {
    znn();
    RYo();
    et();
    C9();
    ln();
    Ot();
    Hfe();
    RRt();
    _3();
    xRt();
    no();
    pr();
    Qoe();
    vSc = __toESM(pt(), 1);
    wSc = require("process");
    Sfr = __toESM(ot(), 1);
    uB = __toESM(ie(), 1);
    zbf = Sfr.lazy(() => Promise.resolve().then(() => (tar(), n3o)).then(e => ({
      default: e.Doctor
    })));
  });
  var xYo = {};