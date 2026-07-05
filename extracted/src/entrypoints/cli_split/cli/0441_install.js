  __export(TSc, {
    install: () => install
  });
  function Hbf() {
    let e = Me.platform === "win32";
    let t = bSc.homedir();
    if (e) {
      return SSc.join(t, ".local", "bin", "claude.exe").replaceAll("/", "\\");
    }
    return "~/.local/bin/claude";
  }
  function ySc(e) {
    let t = _Sc.c(5);
    let {
      messages: n
    } = e;
    if (n.length === 0) {
      return null;
    }
    let r;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      r = Pf.jsx(gXd, {
        children: Pf.jsxs(Text, {
          color: "warning",
          children: [Pf.jsx(Ps, {
            status: "warning",
            withSpace: true
          }), "Setup notes:"]
        })
      });
      t[0] = r;
    } else {
      r = t[0];
    }
    let o;
    if (t[1] !== n) {
      o = n.map(jbf);
      t[1] = n;
      t[2] = o;
    } else {
      o = t[2];
    }
    let s;
    if (t[3] !== o) {
      s = Pf.jsxs(gXd, {
        flexDirection: "column",
        gap: 0,
        marginBottom: 1,
        children: [r, Pf.jsx(gXd, {
          flexDirection: "column",
          marginLeft: 2,
          children: o
        })]
      });
      t[3] = o;
      t[4] = s;
    } else {
      s = t[4];
    }
    return s;
  }
  function jbf(e, t) {
    return Pf.jsx(Pw, {
      children: Pf.jsx(Text, {
        dimColor: true,
        children: e
      })
    }, t);
  }
  function qbf({
    onDone: e,
    force: t,
    target: n
  }) {
    let [r, o] = bfr.useState({
      type: "checking"
    });
    let s = useClock();
    bfr.useEffect(() => {
      async function i() {
        try {
          logForDebugging(`Install: Starting installation process (force=${t}, target=${n})`);
          let a = n || UZ();
          o({
            type: "installing",
            version: a
          });
          logForDebugging(`Install: Calling installLatest(channelOrVersion=${a}, forceReinstall=${t})`);
          let l = await rze(a, t);
          if (logForDebugging(`Install: installLatest returned version=${l.latestVersion}, wasUpdated=${l.wasUpdated}, lockFailed=${l.lockFailed}`), l.lockFailed) {
            throw Error("Could not install - another process is currently installing Claude. Please try again in a moment.");
          }
          if (!l.latestVersion) {
            logForDebugging("Install: Failed to retrieve version information during install", {
              level: "error"
            });
          }
          if (n === "latest" || n === "stable" || n === "rc") {
            let h = n === "rc" ? "stable" : n;
            updateSettingsForSource("userSettings", {
              autoUpdatesChannel: h
            });
            logForDebugging(`Install: Saved autoUpdatesChannel=${h} to user settings`);
          }
          if (!l.wasUpdated) {
            logForDebugging("Install: Already up to date");
          }
          o({
            type: "setting-up"
          });
          let c = await nze(true);
          if (logForDebugging(`Install: Setup launcher completed with ${c.length} messages`), c.length > 0) {
            c.forEach(h => logForDebugging(`Install: Setup message: ${h.message}`));
          }
          logForDebugging("Install: Cleaning up npm installations after successful install");
          let {
            removed: u,
            errors: d,
            warnings: p
          } = await aIo();
          if (u > 0) {
            logForDebugging(`Cleaned up ${u} npm installation(s)`);
          }
          if (d.length > 0) {
            logForDebugging(`Cleanup errors: ${d.join(", ")}`);
          }
          let m = await iIo();
          if (m.length > 0) {
            logForDebugging(`Shell alias cleanup: ${m.map(h => h.message).join("; ")}`);
          }
          logEvent("tengu_claude_install_command", {
            has_version: l.latestVersion ? 1 : 0,
            forced: t ? 1 : 0
          });
          let f = [...p, ...m.map(h => h.message)];
          if (c.length > 0) {
            o({
              type: "set-up",
              messages: c.map(h => h.message)
            });
            s.setTimeout(() => o({
              type: "success",
              version: l.latestVersion || "current",
              setupMessages: [...c.map(h => h.message), ...f]
            }), 2000);
          } else {
            logForDebugging("Install: Shell PATH already configured");
            o({
              type: "success",
              version: l.latestVersion || "current",
              setupMessages: f
            });
          }
        } catch (a) {
          logForDebugging(`Install command failed: ${a}`, {
            level: "error"
          });
          o({
            type: "error",
            message: he(a)
          });
        }
      }
      i();
    }, [s, t, n]);
    useTimeout(() => {
      if (r.type === "success") {
        e("Claude Code installation completed successfully", {
          display: "system"
        });
      } else if (r.type === "error") {
        e("Claude Code installation failed", {
          display: "system"
        });
      }
    }, r.type === "success" ? 2000 : r.type === "error" ? 3000 : null);
    return Pf.jsxs(gXd, {
      flexDirection: "column",
      marginTop: 1,
      children: [r.type === "checking" && Pf.jsx(Text, {
        color: "claude",
        children: "Checking installation status..."
      }), r.type === "cleaning-npm" && Pf.jsx(Text, {
        color: "warning",
        children: "Cleaning up old npm installations..."
      }), r.type === "installing" && Pf.jsxs(Text, {
        color: "claude",
        children: ["Installing Claude Code native build ", r.version, "..."]
      }), r.type === "setting-up" && Pf.jsx(Text, {
        color: "claude",
        children: "Setting up launcher and shell integration..."
      }), r.type === "set-up" && Pf.jsx(ySc, {
        messages: r.messages
      }), r.type === "success" && Pf.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [Pf.jsxs(gXd, {
          children: [Pf.jsx(Ps, {
            status: "success",
            withSpace: true
          }), Pf.jsx(Text, {
            color: "success",
            bold: true,
            children: "Claude Code successfully installed!"
          })]
        }), Pf.jsxs(gXd, {
          marginLeft: 2,
          flexDirection: "column",
          gap: 1,
          children: [r.version !== "current" && Pf.jsxs(gXd, {
            children: [Pf.jsx(Text, {
              dimColor: true,
              children: "Version: "
            }), Pf.jsx(Text, {
              color: "claude",
              children: r.version
            })]
          }), Pf.jsxs(gXd, {
            children: [Pf.jsx(Text, {
              dimColor: true,
              children: "Location: "
            }), Pf.jsx(Text, {
              color: "text",
              children: Hbf()
            })]
          })]
        }), Pf.jsx(gXd, {
          marginLeft: 2,
          flexDirection: "column",
          gap: 1,
          children: Pf.jsxs(gXd, {
            marginTop: 1,
            children: [Pf.jsx(Text, {
              dimColor: true,
              children: "Next: Run "
            }), Pf.jsx(Text, {
              color: "claude",
              bold: true,
              children: "claude --help"
            }), Pf.jsx(Text, {
              dimColor: true,
              children: " to get started"
            })]
          })
        }), r.setupMessages.length > 0 && Pf.jsx(ySc, {
          messages: r.setupMessages
        })]
      }), r.type === "error" && Pf.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [Pf.jsxs(gXd, {
          children: [Pf.jsx(Ps, {
            status: "error",
            withSpace: true
          }), Pf.jsx(Text, {
            color: "error",
            children: "Installation failed"
          })]
        }), Pf.jsx(Text, {
          color: "error",
          children: r.message
        }), Pf.jsx(gXd, {
          marginTop: 1,
          children: Pf.jsx(Text, {
            dimColor: true,
            children: "Try running with --force to override checks"
          })
        })]
      })]
    });
  }
  var _Sc;
  var bSc;
  var SSc;
  var bfr;
  var Pf;
  var install;
  var ESc = __lazy(() => {
    Ot();
    Loe();
    Vf();
    et();
    je();
    pr();
    dt();
    qQ();
    XFe();
    _Sc = __toESM(pt(), 1);
    bSc = require("os");
    SSc = require("path");
    bfr = __toESM(ot(), 1);
    Pf = __toESM(ie(), 1);
    install = {
      type: "local-jsx",
      name: "install",
      description: "Install Claude Code native build",
      argumentHint: "[options]",
      async call(e, t, n) {
        let r = n.includes("--force");
        let s = n.filter(a => !a.startsWith("--"))[0];
        let {
          unmount: i
        } = await render(Pf.jsx(qbf, {
          onDone: (a, l) => {
            i();
            e(a, l);
          },
          force: r,
          target: s
        }));
      }
    };
  });
  var IE = {};