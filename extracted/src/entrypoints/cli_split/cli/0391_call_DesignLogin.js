  __export(n3o, {
    formatLastUpdateResult: () => formatLastUpdateResult,
    buildFixPrompt: () => buildFixPrompt,
    PluginErrorsSection: () => PluginErrorsSection,
    McpConnectionIssuesSection: () => McpConnectionIssuesSection,
    LastUpdateNode: () => LastUpdateNode,
    IneffectivePluginDisablesSection: () => IneffectivePluginDisablesSection,
    Doctor: () => Doctor,
    DistTagsDisplay: () => DistTagsDisplay
  });
  function DistTagsDisplay(e) {
    let t = bUe.c(9);
    let {
      promise: n
    } = e;
    let {
      tags: r,
      isNative: o
    } = XM.use(n);
    if (!r.latest) {
      let l;
      if (t[0] !== o) {
        l = o && Vi() ? Jo.jsx(ms.Node, {
          dimColor: true,
          children: "Version check skipped (essential-traffic-only mode)"
        }) : Jo.jsx(ms.Node, {
          dimColor: true,
          children: "Failed to fetch versions"
        });
        t[0] = o;
        t[1] = l;
      } else {
        l = t[1];
      }
      return l;
    }
    let s;
    if (t[2] !== r.stable) {
      s = r.stable && Jo.jsxs(ms.Node, {
        children: ["Stable version: ", r.stable]
      });
      t[2] = r.stable;
      t[3] = s;
    } else {
      s = t[3];
    }
    let i;
    if (t[4] !== r.latest) {
      i = Jo.jsxs(ms.Node, {
        children: ["Latest version: ", r.latest]
      });
      t[4] = r.latest;
      t[5] = i;
    } else {
      i = t[5];
    }
    let a;
    if (t[6] !== s || t[7] !== i) {
      a = Jo.jsxs(ms.Group, {
        children: [s, i]
      });
      t[6] = s;
      t[7] = i;
      t[8] = a;
    } else {
      a = t[8];
    }
    return a;
  }
  function LastUpdateNode(e) {
    let t = bUe.c(4);
    let {
      result: n
    } = e;
    let r;
    if (t[0] !== n) {
      r = formatLastUpdateResult(n);
      t[0] = n;
      t[1] = r;
    } else {
      r = t[1];
    }
    let o;
    if (t[2] !== r) {
      o = Jo.jsxs(ms.Node, {
        children: ["Last update attempt: ", r]
      });
      t[2] = r;
      t[3] = o;
    } else {
      o = t[3];
    }
    return o;
  }
  function formatLastUpdateResult(e) {
    if (!e) {
      return "none recorded";
    }
    let t = e.timestamp.slice(0, 10);
    switch (e.outcome) {
      case "success":
        return e.version_to ? `success \u2192 ${e.version_to} (${t})` : `success (${t})`;
      case "failed":
        return `failed (${e.status}) \u2014 ${t}`;
    }
  }
  function Doctor({
    onDone: e
  }) {
    let t = bt(k => k.agentDefinitions);
    let n = bt(k => k.toolPermissionContext);
    let r = bt(k => k.plugins.errors);
    let o = bt(k => k.plugins.warnings).filter(k => k.type !== "ineffective-disable");
    let s = bt(k => k.mcp.clients);
    let i = XM.useCallback(() => {
      e("Claude Code diagnostics dismissed", {
        display: "system"
      });
    }, [e]);
    let a = Eg(i);
    let [l, c] = XM.useState(null);
    let [u, d] = XM.useState(null);
    let [p, m] = XM.useState(null);
    let [f, h] = XM.useState(null);
    let g = Yir();
    let y = XM.useMemo(async () => {
      let I = (await ZVe()).installationType === "native";
      return {
        tags: await (I ? Hll : $ll)().catch(() => ({
          latest: null,
          stable: null
        })),
        isNative: I
      };
    }, []);
    let _ = UZ();
    let b = g.filter(k => k.mcpErrorMetadata === undefined);
    let S = XM.useMemo(() => lGl(s, A6e), [s]);
    let E = XM.useMemo(() => [{
      name: "BASH_MAX_OUTPUT_LENGTH",
      default: 30000,
      upperLimit: 150000
    }, {
      name: "TASK_MAX_OUTPUT_LENGTH",
      default: 32000,
      upperLimit: 160000
    }, {
      name: "CLAUDE_CODE_MAX_OUTPUT_TOKENS",
      ...dIe("claude-opus-4-6")
    }].map(I => {
      let O = process.env[I.name];
      let M = wde(I.name, O, I.default, I.upperLimit);
      return {
        name: I.name,
        ...M
      };
    }).filter(I => I.status !== "valid"), []);
    XM.useEffect(() => {
      Pe("screen_doctor");
      ZVe({
        probeKeychain: true
      }).then(c);
      (async () => {
        let k = ear.join(er(), "agents");
        let I = ear.join(getOriginalCwd(), ".claude", "agents");
        let {
          activeAgents: O,
          allAgents: M,
          failedFiles: L,
          nameCollisions: P
        } = t;
        let [F, H] = await Promise.all([ad(k), ad(I)]);
        let U = {
          activeAgents: O.map(W => ({
            agentType: W.agentType,
            source: W.source
          })),
          userAgentsDir: k,
          projectAgentsDir: I,
          userDirExists: F,
          projectDirExists: H,
          failedFiles: L ?? [],
          nameCollisions: P ?? []
        };
        d(U);
        let N = await dGl({
          activeAgents: O,
          allAgents: M,
          failedFiles: L
        }, async () => n);
        if (m(N), M1e()) {
          let W = ear.join(uqn(), "claude", "locks");
          let j = await _Yn(W);
          let z = tcl(W);
          h({
            enabled: true,
            locks: z,
            locksDir: W,
            staleLocksCleaned: j
          });
        } else {
          h({
            enabled: false,
            locks: [],
            locksDir: "",
            staleLocksCleaned: 0
          });
        }
      })();
    }, [n, t]);
    let C = XM.useMemo(() => bFn(), []);
    let x = XM.useMemo(() => buildFixPrompt(l, u, b, r, o, p, E, undefined, undefined, C, S), [l, u, b, r, o, p, E, C, S]);
    if (jo({
      "confirm:no": i
    }, {
      context: "Confirmation"
    }), jo({
      "confirm:yes": i
    }, {
      context: "Confirmation",
      isActive: l !== null
    }), jo({
      "doctor:fix": () => {
        if (x) {
          e(x, {
            display: "user",
            shouldQuery: true
          });
        }
      }
    }, {
      context: "Doctor",
      isActive: x !== null
    }), !l) {
      return Jo.jsx(Td, {
        children: Jo.jsx(Xc, {
          message: "Checking installation status\u2026",
          dimColor: true
        })
      });
    }
    let A = Jo.jsxs(Jo.Fragment, {
      children: [Jo.jsxs(gXd, {
        flexDirection: "column",
        children: [Jo.jsx(Bx, {
          title: "Diagnostics",
          status: l.ripgrepStatus.working ? "success" : "warning"
        }), Jo.jsxs(ms, {
          variant: "tree",
          children: [Jo.jsxs(ms.Node, {
            children: ["Currently running: ", l.installationType, " (", l.version, ")"]
          }), {
            ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
            PACKAGE_URL: "@anthropic-ai/claude-code",
            README_URL: "https://code.claude.com/docs/en/overview",
            VERSION: "2.1.198",
            FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
            BUILD_TIME: "2026-07-01T06:09:31Z",
            GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
          }.GIT_SHA && Jo.jsxs(ms.Node, {
            children: ["Commit: ", {
              ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
              PACKAGE_URL: "@anthropic-ai/claude-code",
              README_URL: "https://code.claude.com/docs/en/overview",
              VERSION: "2.1.198",
              FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
              BUILD_TIME: "2026-07-01T06:09:31Z",
              GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
            }.GIT_SHA.slice(0, 12)]
          }), Jo.jsxs(ms.Node, {
            children: ["Platform: ", "linux", "-", "arm64"]
          }), l.packageManager && Jo.jsxs(ms.Node, {
            children: ["Package manager: ", l.packageManager]
          }), Jo.jsxs(ms.Node, {
            children: ["Path: ", l.installationPath]
          }), l.invokedBinary !== l.installationPath && Jo.jsxs(ms.Node, {
            children: ["Invoked: ", l.invokedBinary]
          }), Jo.jsxs(ms.Node, {
            children: ["Config install method: ", l.configInstallMethod]
          }), Jo.jsxs(ms.Node, {
            children: ["Search: ", l.ripgrepStatus.working ? "OK" : "Not working", " (", l.ripgrepStatus.mode === "embedded" ? "bundled" : l.ripgrepStatus.systemPath || "system", ")"]
          })]
        })]
      }), l.multipleInstallations.length > 1 && Jo.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [Jo.jsx(Bx, {
          title: "Multiple installations found",
          status: "warning"
        }), Jo.jsx(ms, {
          variant: "tree",
          children: l.multipleInstallations.map((k, I) => Jo.jsxs(ms.Node, {
            children: [k.type, " at ", k.path]
          }, I))
        })]
      }), l.warnings.length > 0 && Jo.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [Jo.jsx(Bx, {
          title: "Installation warnings",
          status: "warning"
        }), Jo.jsx(ms, {
          variant: "tree",
          children: l.warnings.map((k, I) => Jo.jsxs(ms.Group, {
            children: [Jo.jsx(ms.Node, {
              color: "warning",
              children: k.issue
            }), Jo.jsx(ms.Node, {
              children: Jo.jsx(Wir, {
                dimColor: true,
                children: k.fix
              })
            })]
          }, I))
        })]
      }), b.length > 0 && Jo.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [Jo.jsx(Bx, {
          title: "Invalid settings",
          status: b.some(k => k.severity !== "warning") ? "error" : "warning"
        }), Jo.jsx(zir, {
          errors: b
        })]
      }), Jo.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [Jo.jsx(Bx, {
          title: "Updates",
          status: l.lastUpdateResult?.outcome === "failed" || l.hasUpdatePermissions === false ? "warning" : "success"
        }), Jo.jsxs(ms, {
          variant: "tree",
          children: [Jo.jsxs(ms.Node, {
            children: ["Auto-updates:", " ", l.packageManager ? "Managed by package manager" : l.autoUpdates]
          }), Jo.jsxs(ms.Node, {
            children: ["Auto-update channel:", " ", _ === "rc" ? "slow" : _]
          }), Jo.jsx(LastUpdateNode, {
            result: l.lastUpdateResult
          }), Jo.jsx(XM.Suspense, {
            fallback: Jo.jsx(ms.Node, {
              dimColor: true,
              children: "Checking for updates\u2026"
            }),
            children: Jo.jsx(DistTagsDisplay, {
              promise: y
            })
          })]
        })]
      }), Jo.jsx(rGl, {}), isDaemonCliEnabled() ? Jo.jsx(KWl, {}) : null, Jo.jsx(eGl, {}), Jo.jsx(Hvt, {}), Jo.jsx(McpConnectionIssuesSection, {
        issues: S
      }), Jo.jsx(RWl, {}), Jo.jsx(QWl, {}), E.length > 0 && Jo.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [Jo.jsx(Bx, {
          title: "Environment variables",
          status: E.some(k => k.status !== "capped") ? "error" : "warning"
        }), Jo.jsx(ms, {
          variant: "tree",
          children: E.map((k, I) => Jo.jsx(ms.Node, {
            children: Jo.jsxs(Text, {
              children: [k.name, ":", " ", Jo.jsx(Text, {
                color: k.status === "capped" ? "warning" : "error",
                children: k.message
              })]
            })
          }, I))
        })]
      }), f?.enabled && (f.locks.length > 0 || f.staleLocksCleaned > 0) && Jo.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [Jo.jsx(Bx, {
          title: "Version locks",
          status: f.locks.some(k => !k.isProcessRunning) ? "warning" : "success"
        }), Jo.jsxs(ms, {
          variant: "tree",
          children: [f.staleLocksCleaned > 0 && Jo.jsxs(ms.Node, {
            dimColor: true,
            children: ["Cleaned ", f.staleLocksCleaned, " stale", " ", un(f.staleLocksCleaned, "lock")]
          }), f.locks.map((k, I) => Jo.jsx(ms.Node, {
            children: Jo.jsxs(Text, {
              children: [k.version, ": PID ", k.pid, " ", k.isProcessRunning ? Jo.jsx(Text, {
                children: "(running)"
              }) : Jo.jsx(Text, {
                color: "warning",
                children: "(stale)"
              })]
            })
          }, I))]
        })]
      }), u && u.failedFiles.length > 0 && Jo.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [Jo.jsx(Bx, {
          title: "Agent parse errors",
          status: "error"
        }), Jo.jsxs(ms, {
          variant: "tree",
          children: [Jo.jsx(ms.Node, {
            color: "error",
            children: `Failed to parse ${u.failedFiles.length} agent ${un(u.failedFiles.length, "file")}:`
          }), u.failedFiles.map((k, I) => Jo.jsxs(ms.Node, {
            dimColor: true,
            children: [k.path, ": ", k.error]
          }, I))]
        })]
      }), u && u.nameCollisions.length > 0 && Jo.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [Jo.jsx(Bx, {
          title: "Duplicate agent names",
          status: "warning"
        }), Jo.jsx(ms, {
          variant: "tree",
          children: u.nameCollisions.map((k, I) => Jo.jsxs(ms.Group, {
            children: [Jo.jsx(ms.Node, {
              color: "warning",
              children: `'${k.agentType}' is defined ${k.locations.length} times in ${_je(k.source).toLowerCase()} agents:`
            }), k.locations.map((O, M) => Jo.jsxs(ms.Node, {
              dimColor: true,
              children: [O, M === 0 && k.oneIsActive ? " (active)" : ""]
            }, M))]
          }, I))
        })]
      }), Jo.jsx(PluginErrorsSection, {
        errors: r,
        warnings: o
      }), Jo.jsx(IneffectivePluginDisablesSection, {
        disables: C
      }), p?.unreachableRulesWarning && Jo.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [Jo.jsx(Bx, {
          title: "Unreachable permission rules",
          status: "warning"
        }), Jo.jsxs(ms, {
          variant: "tree",
          children: [Jo.jsx(ms.Node, {
            color: "warning",
            children: p.unreachableRulesWarning.message
          }), p.unreachableRulesWarning.details.map((k, I) => Jo.jsx(ms.Node, {
            dimColor: true,
            children: k
          }, I))]
        })]
      }), p && (p.claudeMdWarning || p.agentWarning) && Jo.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [Jo.jsx(Bx, {
          title: "Context usage warnings",
          status: "warning"
        }), Jo.jsxs(ms, {
          variant: "tree",
          children: [p.claudeMdWarning && Jo.jsx(mGl, {
            warning: p.claudeMdWarning
          }), p.agentWarning && Jo.jsx(mGl, {
            warning: p.agentWarning
          })]
        })]
      })]
    });
    return Jo.jsxs(Td, {
      children: [Jo.jsx(gXd, {
        flexDirection: "column",
        children: A
      }), Jo.jsx(gXd, {
        marginTop: 1,
        children: Jo.jsx(Text, {
          dimColor: true,
          children: "Still having issues? Run /feedback to report details."
        })
      }), Jo.jsx(gXd, {
        marginTop: 1,
        children: Jo.jsx(Text, {
          dimColor: true,
          italic: true,
          children: a.pending ? Jo.jsxs(Jo.Fragment, {
            children: ["Press ", a.keyName, " again to close"]
          }) : Jo.jsxs(Hn, {
            children: [Jo.jsx(xt, {
              chord: "enter",
              action: "close"
            }), x && Jo.jsx(xt, {
              chord: "f",
              action: "fix with Claude"
            })]
          })
        })
      })]
    });
  }
  function GGm() {
    return SandboxManager.isSupportedPlatform() && SandboxManager.isSandboxEnabledInSettings() && SandboxManager.isPlatformInEnabledList() ? SandboxManager.checkDependencies().errors : [];
  }
  function yGl(e) {
    if (e.type === "needs-auth") {
      return "needs authentication";
    }
    return e.errorCode === "INVALID_CONFIG" ? "config issue" : "failed";
  }
  function McpConnectionIssuesSection(e) {
    let t = bUe.c(15);
    let {
      issues: n
    } = e;
    if (n.length === 0) {
      return null;
    }
    let r = n.some(zGm);
    let o = r ? "error" : "warning";
    let s;
    if (t[0] !== o) {
      s = Jo.jsx(Bx, {
        title: "MCP servers",
        status: o
      });
      t[0] = o;
      t[1] = s;
    } else {
      s = t[1];
    }
    let i = r ? "error" : "warning";
    let a = n.length;
    let l;
    if (t[2] !== n.length) {
      l = un(n.length, "server");
      t[2] = n.length;
      t[3] = l;
    } else {
      l = t[3];
    }
    let c = `${a} MCP ${l} not connected \u2014 run /mcp to authenticate, retry, or see details:`;
    let u;
    if (t[4] !== i || t[5] !== c) {
      u = Jo.jsx(ms.Node, {
        color: i,
        children: c
      });
      t[4] = i;
      t[5] = c;
      t[6] = u;
    } else {
      u = t[6];
    }
    let d;
    if (t[7] !== n) {
      d = n.map(VGm);
      t[7] = n;
      t[8] = d;
    } else {
      d = t[8];
    }
    let p;
    if (t[9] !== u || t[10] !== d) {
      p = Jo.jsxs(ms, {
        variant: "tree",
        children: [u, d]
      });
      t[9] = u;
      t[10] = d;
      t[11] = p;
    } else {
      p = t[11];
    }
    let m;
    if (t[12] !== s || t[13] !== p) {
      m = Jo.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [s, p]
      });
      t[12] = s;
      t[13] = p;
      t[14] = m;
    } else {
      m = t[14];
    }
    return m;
  }
  function VGm(e, t) {
    return Jo.jsxs(ms.Node, {
      dimColor: true,
      children: [e.name, ": ", yGl(e), e.error ? ` \u2014 ${e.error}` : ""]
    }, t);
  }
  function zGm(e) {
    return e.type === "failed";
  }
  function IneffectivePluginDisablesSection(e) {
    let t = bUe.c(6);
    let {
      disables: n
    } = e;
    if (n.length === 0) {
      return null;
    }
    let r;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      r = Jo.jsx(Bx, {
        title: "Plugin settings overridden",
        status: "warning"
      });
      t[0] = r;
    } else {
      r = t[0];
    }
    let o;
    if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
      o = Jo.jsx(ms.Node, {
        color: "warning",
        children: "These plugins are disabled in ~/.claude/settings.json, but a higher-precedence source re-enables them:"
      });
      t[1] = o;
    } else {
      o = t[1];
    }
    let s;
    if (t[2] !== n) {
      s = n.map(KGm);
      t[2] = n;
      t[3] = s;
    } else {
      s = t[3];
    }
    let i;
    if (t[4] !== s) {
      i = Jo.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [r, Jo.jsxs(ms, {
          variant: "tree",
          children: [o, s]
        })]
      });
      t[4] = s;
      t[5] = i;
    } else {
      i = t[5];
    }
    return i;
  }
  function KGm(e, t) {
    return Jo.jsx(ms.Node, {
      dimColor: true,
      children: iso(e)
    }, t);
  }
  function SGl(e) {
    let t = bUe.c(4);
    let {
      source: n,
      plugin: r,
      message: o
    } = e;
    let s = n || "unknown";
    let i = r ? ` [${r}]` : "";
    let a;
    if (t[0] !== o || t[1] !== s || t[2] !== i) {
      a = Jo.jsxs(ms.Node, {
        dimColor: true,
        children: [s, i, ": ", o]
      });
      t[0] = o;
      t[1] = s;
      t[2] = i;
      t[3] = a;
    } else {
      a = t[3];
    }
    return a;
  }
  function PluginErrorsSection(e) {
    let t = bUe.c(7);
    let {
      errors: n,
      warnings: r
    } = e;
    if (n.length === 0 && r.length === 0) {
      return null;
    }
    let o;
    if (t[0] !== n) {
      o = n.length > 0 && Jo.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [Jo.jsx(Bx, {
          title: "Plugin errors",
          status: "error"
        }), Jo.jsxs(ms, {
          variant: "tree",
          children: [Jo.jsx(ms.Node, {
            color: "error",
            children: `${n.length} plugin ${un(n.length, "error")} detected:`
          }), n.map(JGm)]
        })]
      });
      t[0] = n;
      t[1] = o;
    } else {
      o = t[1];
    }
    let s;
    if (t[2] !== r) {
      s = r.length > 0 && Jo.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [Jo.jsx(Bx, {
          title: "Plugin notes",
          status: "warning"
        }), Jo.jsxs(ms, {
          variant: "tree",
          children: [Jo.jsx(ms.Node, {
            color: "warning",
            children: `${r.length} plugin ${un(r.length, "note")}:`
          }), r.map(YGm)]
        })]
      });
      t[2] = r;
      t[3] = s;
    } else {
      s = t[3];
    }
    let i;
    if (t[4] !== o || t[5] !== s) {
      i = Jo.jsxs(Jo.Fragment, {
        children: [o, s]
      });
      t[4] = o;
      t[5] = s;
      t[6] = i;
    } else {
      i = t[6];
    }
    return i;
  }
  function YGm(e, t) {
    return Jo.jsx(SGl, {
      source: e.source,
      plugin: "plugin" in e ? e.plugin : undefined,
      message: S1(e)
    }, t);
  }
  function JGm(e, t) {
    return Jo.jsx(SGl, {
      source: e.source,
      plugin: "plugin" in e ? e.plugin : undefined,
      message: hS(e)
    }, t);
  }
  function buildFixPrompt(e, t, n, r, o, s, i, a = pq.warnings, l = GGm(), c = [], u = []) {
    let d = [];
    for (let p of e?.warnings ?? []) {
      d.push(`- ${p.issue}
  Suggested fix: ${p.fix}`);
    }
    for (let p of u) {
      let m = p.error ? ` \u2014 ${p.error}` : "";
      d.push(`- MCP server '${p.name}': ${yGl(p)}${m}
  Run /mcp to authenticate, retry, or inspect the server.`);
    }
    for (let p of a) {
      d.push(`- Keybinding (${pSe()}): ${p.message}${p.suggestion ? `
  Suggested fix: ${p.suggestion}` : ""}`);
    }
    for (let p of t?.failedFiles ?? []) {
      d.push(`- Agent file failed to parse: ${p.path}
  Error: ${p.error}`);
    }
    for (let p of t?.nameCollisions ?? []) {
      let m = p.oneIsActive ? ` Active: ${p.locations[0]}.` : "";
      d.push(`- Duplicate agent name '${p.agentType}' in ${_je(p.source).toLowerCase()} agents.${m}
  ${p.locations.join(`
  `)}
  Fix: rename or remove all but one so the frontmatter \`name:\` is unique.`);
    }
    for (let p of n) {
      let m = [p.file, p.path].filter(Boolean).join(" \u203A ");
      d.push(`- Settings${m ? ` (${m})` : ""}: ${p.message}${p.suggestion ? `
  Suggested fix: ${p.suggestion}` : ""}`);
    }
    for (let p of r) {
      let m = ["plugin" in p && p.plugin, p.source].filter(Boolean).join(" @ ");
      d.push(`- Plugin${m ? ` (${m})` : ""}: ${hS(p)}`);
    }
    for (let p of c) {
      d.push(`- Plugin setting: ${iso(p)}`);
    }
    for (let p of o) {
      let m = ["plugin" in p ? p.plugin : undefined, p.source].filter(Boolean).join(" @ ");
      d.push(`- Plugin note${m ? ` (${m})` : ""}: ${S1(p)}`);
    }
    for (let p of l) {
      d.push(`- Sandbox: ${p}
  (See /sandbox for install instructions)`);
    }
    for (let p of [s?.claudeMdWarning, s?.agentWarning, s?.unreachableRulesWarning]) {
      if (p) {
        d.push(`- ${p.message}
  ${p.details.join(`
  `)}`);
      }
    }
    for (let p of i) {
      d.push(`- Environment variable ${p.name}: ${p.message}`);
    }
    if (d.length === 0) {
      return null;
    }
    return ["Help me fix the issues reported by /doctor below.", "", "For each issue: briefly explain what the fix will do, then ask me to confirm before running any shell command that deletes files, modifies global config, or changes my installation. Safe read-only checks are fine without asking. If a suggested fix looks wrong for my setup, say so instead of running it.", "", d.join(`
`)].join(`
`);
  }
  function mGl(e) {
    let t = bUe.c(7);
    let {
      warning: n
    } = e;
    let r;
    if (t[0] !== n.message) {
      r = Jo.jsx(ms.Node, {
        color: "warning",
        children: n.message
      });
      t[0] = n.message;
      t[1] = r;
    } else {
      r = t[1];
    }
    let o;
    if (t[2] !== n.details) {
      o = n.details.map(XGm);
      t[2] = n.details;
      t[3] = o;
    } else {
      o = t[3];
    }
    let s;
    if (t[4] !== r || t[5] !== o) {
      s = Jo.jsxs(ms.Group, {
        children: [r, o]
      });
      t[4] = r;
      t[5] = o;
      t[6] = s;
    } else {
      s = t[6];
    }
    return s;
  }
  function XGm(e, t) {
    return Jo.jsx(ms.Node, {
      dimColor: true,
      children: e
    }, t);
  }
  var bUe;
  var ear;
  var XM;
  var Jo;
  var tar = __lazy(() => {
    xWl();
    Oir();
    VT();
    gn();
    nf();
    at();
    uT();
    YWl();
    $vt();
    Ai();
    bs();
    Pv();
    oE();
    Pse();
    Vqo();
    ZWl();
    tGl();
    oGl();
    Qqo();
    Zqo();
    mO();
    et();
    xre();
    Bs();
    ln();
    l9();
    ho();
    cV();
    uve();
    pGl();
    D1e();
    Xdt();
    Zl();
    tIo();
    Wd();
    XFe();
    Th();
    aso();
    pK();
    eGt();
    Zn();
    pUo();
    zTe();
    bUe = __toESM(pt(), 1);
    ear = require("path");
    XM = __toESM(ot(), 1);
    Jo = __toESM(ie(), 1);
  });
  var vGl = {};
  __export(vGl, {
    call: () => call_export26
  });
  var wGl;
  var call_export26 = (e, t, n) => Promise.resolve(wGl.jsx(Doctor, {
    onDone: e
  }));
  var CGl = __lazy(() => {
    tar();
    wGl = __toESM(ie(), 1);
  });
  var ZGm;
  function xGl(e) {
    return findGitRoot(e) !== null;
  }
  var kGl = __lazy(() => {
    na();
  });
  function PGl(e) {
    let t = AGl.c(68);
    let {
      onSelect: n,
      onCancel: r
    } = e;
    let o = mK.use(getMemoryFiles());
    let s = o3o.join(er(), "CLAUDE.md");
    let i = o3o.join(getOriginalCwd(), "CLAUDE.md");
    let a = o.some(Ie => Ie.path === s);
    let l = o.some(Ie => Ie.path === i);
    let c = [...o.filter(l9m).map(a9m), ...(a ? [] : [{
      path: s,
      type: "User",
      content: "",
      exists: false
    }]), ...(l ? [] : [{
      path: i,
      type: "Project",
      content: "",
      exists: false
    }])];
    let u = new Map();
    let d = c.map(Ie => {
      let Ue = Pd(Ie.path);
      let Ge = Ie.exists ? "" : " (new)";
      let Be = Ie.parent ? (u.get(Ie.parent) ?? 0) + 1 : 0;
      u.set(Ie.path, Be);
      let We = Be > 0 ? hm("  ", Be - 1) : "";
      let Ze;
      if (Ie.type === "User" && !Ie.isNested && Ie.path === s) {
        Ze = "User memory";
      } else if (Ie.type === "Project" && !Ie.isNested && Ie.path === i) {
        Ze = "Project memory";
      } else if (Be > 0) {
        Ze = `${We}L ${Ue}${Ge}`;
      } else {
        Ze = `${Ue}`;
      }
      let Tt;
      let kt = xGl(getOriginalCwd());
      if (Ie.type === "User" && !Ie.isNested) {
        Tt = "Saved in ~/.claude/CLAUDE.md";
      } else if (Ie.type === "Project" && !Ie.isNested && Ie.path === i) {
        Tt = `${kt ? "Checked in at" : "Saved in"} ./CLAUDE.md`;
      } else if (Ie.parent) {
        Tt = "@-imported";
      } else if (Ie.isNested) {
        Tt = "dynamically loaded";
      } else {
        Tt = "";
      }
      return {
        label: Ze,
        value: Ie.path,
        description: Tt
      };
    });
    let p = [];
    let m = bt(i9m);
    if (Vd() || Ql()) {
      let Ie;
      if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
        Ie = {
          label: "Open auto-memory folder",
          value: `${"__open_folder__"}${vf()}`,
          description: ""
        };
        t[0] = Ie;
      } else {
        Ie = t[0];
      }
      if (p.push(Ie), uO()) {
        let Ue;
        if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
          Ue = {
            label: "Open team memory folder",
            value: `${"__open_folder__"}${pw()}`,
            description: ""
          };
          t[1] = Ue;
        } else {
          Ue = t[1];
        }
        p.push(Ue);
      }
      for (let Ue of m.activeAgents) {
        if (Ue.memory) {
          let Ge = flt(Ue.agentType, Ue.memory);
          p.push({
            label: `Open ${_$u.bold(Ue.agentType)} agent memory`,
            value: `${"__open_folder__"}${Ge}`,
            description: `${Ue.memory} scope`
          });
        }
      }
    }
    d.push(...p);
    let f;
    if (t[2] !== d) {
      f = nar && d.some(s9m) ? nar : d[0]?.value || "";
      t[2] = d;
      t[3] = f;
    } else {
      f = t[3];
    }
    let h = f;
    let [g, y] = mK.useState(Vd);
    let [_, b] = mK.useState(eXt);
    let [S, E] = mK.useState(uDn);
    let C;
    let x;
    if (t[4] !== S) {
      C = () => onGrowthBookRefresh(() => {
        let Ie = uDn();
        if (Ie !== S) {
          E(Ie);
          y(Vd());
        }
      });
      x = [S];
      t[4] = S;
      t[5] = C;
      t[6] = x;
    } else {
      C = t[5];
      x = t[6];
    }
    mK.useEffect(C, x);
    let [A, k] = mK.useState(err);
    let I;
    let O;
    if (t[7] !== A) {
      I = () => {
        if (A) {
          return;
        }
        return onGrowthBookRefresh(() => {
          if (err()) {
            k(true);
            b(eXt());
          }
        });
      };
      O = [A];
      t[7] = A;
      t[8] = I;
      t[9] = O;
    } else {
      I = t[8];
      O = t[9];
    }
    mK.useEffect(I, O);
    let M = S && !g;
    let L = g && A;
    let P = bt(r9m);
    let [F, H] = mK.useState(null);
    let U;
    if (t[10] !== L) {
      U = () => {
        if (!L) {
          return;
        }
        $tr().then(H);
      };
      t[10] = L;
      t[11] = U;
    } else {
      U = t[11];
    }
    let N;
    if (t[12] !== P || t[13] !== L) {
      N = [L, P];
      t[12] = P;
      t[13] = L;
      t[14] = N;
    } else {
      N = t[14];
    }
    mK.useEffect(U, N);
    let W;
    if (t[15] !== P || t[16] !== F) {
      W = P ? "running" : F === null ? "" : F === 0 ? "never" : `last ran ${formatRelativeTimeAgo(new Date(F))}`;
      t[15] = P;
      t[16] = F;
      t[17] = W;
    } else {
      W = t[17];
    }
    let j = W;
    let [z, V] = mK.useState(null);
    let K = z !== null;
    let J = L ? 1 : 0;
    let Q;
    if (t[18] !== g || t[19] !== S) {
      Q = function () {
        if (Ql()) {
          return;
        }
        if (S) {
          return;
        }
        let Ue = !g;
        updateSettingsForSource("userSettings", {
          autoMemoryEnabled: Ue
        });
        y(Ue);
        logEvent("tengu_auto_memory_toggled", {
          enabled: Ue
        });
      };
      t[18] = g;
      t[19] = S;
      t[20] = Q;
    } else {
      Q = t[20];
    }
    let Z = Q;
    let ne;
    if (t[21] !== _ || t[22] !== L) {
      ne = function () {
        if (!L) {
          return;
        }
        let Ue = !_;
        let Ge = Ue && getInitialSettings().autoDreamEnabled === undefined;
        updateSettingsForSource("userSettings", {
          autoDreamEnabled: Ue
        });
        b(Ue);
        logEvent("tengu_auto_dream_toggled", {
          enabled: Ue,
          is_first_enable: Ge
        });
      };
      t[21] = _;
      t[22] = L;
      t[23] = ne;
    } else {
      ne = t[23];
    }
    let oe = ne;
    Eg();
    let ee;
    if (t[24] === Symbol.for("react.memo_cache_sentinel")) {
      ee = {
        context: "Confirmation"
      };
      t[24] = ee;
    } else {
      ee = t[24];
    }
    uo("confirm:no", r, ee);
    let re;
    if (t[25] !== z || t[26] !== oe || t[27] !== Z) {
      re = () => {
        if (z === 0) {
          Z();
        } else if (z === 1) {
          oe();
        }
      };
      t[25] = z;
      t[26] = oe;
      t[27] = Z;
      t[28] = re;
    } else {
      re = t[28];
    }
    let se;
    if (t[29] !== K) {
      se = {
        context: "Confirmation",
        isActive: K
      };
      t[29] = K;
      t[30] = se;
    } else {
      se = t[30];
    }
    uo("confirm:yes", re, se);
    let ae;
    if (t[31] !== J) {
      ae = () => {
        V(Ie => Ie !== null && Ie < J ? Ie + 1 : null);
      };
      t[31] = J;
      t[32] = ae;
    } else {
      ae = t[32];
    }
    let de;
    if (t[33] !== K) {
      de = {
        context: "Select",
        isActive: K
      };
      t[33] = K;
      t[34] = de;
    } else {
      de = t[34];
    }
    uo("select:next", ae, de);
    let be;
    if (t[35] === Symbol.for("react.memo_cache_sentinel")) {
      be = () => {
        V(n9m);
      };
      t[35] = be;
    } else {
      be = t[35];
    }
    let fe;
    if (t[36] !== K) {
      fe = {
        context: "Select",
        isActive: K
      };
      t[36] = K;
      t[37] = fe;
    } else {
      fe = t[37];
    }
    uo("select:previous", be, fe);
    let me = z === 0;
    let Te;
    if (t[38] !== g || t[39] !== M) {
      Te = M ? zZ.jsx(Text, {
        dimColor: true,
        children: "unavailable for current model"
      }) : Ql() ? zZ.jsxs(Text, {
        dimColor: true,
        children: ["off in safe mode \u2014 ", UR(), " to re-enable"]
      }) : g ? "on" : "off";
      t[38] = g;
      t[39] = M;
      t[40] = Te;
    } else {
      Te = t[40];
    }
    let ue;
    if (t[41] !== Te) {
      ue = zZ.jsxs(Text, {
        children: ["Auto-memory:", " ", Te]
      });
      t[41] = Te;
      t[42] = ue;
    } else {
      ue = t[42];
    }
    let ce;
    if (t[43] !== me || t[44] !== ue) {
      ce = zZ.jsx(_v, {
        isFocused: me,
        children: ue
      });
      t[43] = me;
      t[44] = ue;
      t[45] = ce;
    } else {
      ce = t[45];
    }
    let le;
    if (t[46] !== _ || t[47] !== j || t[48] !== z || t[49] !== L) {
      le = L && zZ.jsx(_v, {
        isFocused: z === 1,
        styled: false,
        children: zZ.jsxs(Text, {
          color: z === 1 ? "suggestion" : undefined,
          children: ["Auto-dream: ", _ ? "on" : "off", j && zZ.jsxs(Text, {
            dimColor: true,
            children: [" \xB7 ", j]
          })]
        })
      });
      t[46] = _;
      t[47] = j;
      t[48] = z;
      t[49] = L;
      t[50] = le;
    } else {
      le = t[50];
    }
    let pe;
    if (t[51] !== ce || t[52] !== le) {
      pe = zZ.jsxs(gXd, {
        flexDirection: "column",
        marginBottom: 1,
        children: [ce, le]
      });
      t[51] = ce;
      t[52] = le;
      t[53] = pe;
    } else {
      pe = t[53];
    }
    let ve;
    if (t[54] !== n) {
      ve = Ie => {
        if (Ie.startsWith("__open_folder__")) {
          let Ue = Ie.slice(("__open_folder__").length);
          IGl.mkdir(Ue, {
            recursive: true
          }).catch(t9m).then(() => NIn(Ue)).catch(e9m);
          return;
        }
        nar = Ie;
        n(Ie);
      };
      t[54] = n;
      t[55] = ve;
    } else {
      ve = t[55];
    }
    let _e;
    if (t[56] !== J) {
      _e = () => V(J);
      t[56] = J;
      t[57] = _e;
    } else {
      _e = t[57];
    }
    let xe;
    if (t[58] !== h || t[59] !== d || t[60] !== r || t[61] !== ve || t[62] !== _e || t[63] !== K) {
      xe = zZ.jsx(xr, {
        defaultFocusValue: h,
        options: d,
        isDisabled: K,
        onChange: ve,
        onCancel: r,
        onUpFromFirstItem: _e
      });
      t[58] = h;
      t[59] = d;
      t[60] = r;
      t[61] = ve;
      t[62] = _e;
      t[63] = K;
      t[64] = xe;
    } else {
      xe = t[64];
    }
    let ke;
    if (t[65] !== pe || t[66] !== xe) {
      ke = zZ.jsxs(gXd, {
        flexDirection: "column",
        width: "100%",
        children: [pe, xe]
      });
      t[65] = pe;
      t[66] = xe;
      t[67] = ke;
    } else {
      ke = t[67];
    }
    return ke;
  }
  function e9m() {}
  function t9m() {}
  function n9m(e) {
    return e !== null && e > 0 ? e - 1 : e;
  }
  function r9m(e) {
    return Object.values(e.tasks).some(o9m);
  }
  function o9m(e) {
    return e.type === "dream" && e.status === "running";
  }
  function s9m(e) {
    return e.value === nar;
  }
  function i9m(e) {
    return e.agentDefinitions;
  }
  function a9m(e) {
    return {
      ...e,
      exists: true
    };
  }
  function l9m(e) {
    return e.type !== "AutoMem" && !isSyntheticMemoryPath(e.path);
  }
  var AGl;
  var IGl;
  var o3o;
  var mK;
  var zZ;
  var nar;
  var OGl = __lazy(() => {
    at();
    mO();
    et();
    Bs();
    Eb();
    a1();
    $n();
    Ot();
    ABo();
    jtr();
    ho();
    Vbe();
    ky();
    bx();
    gn();
    Zl();
    cs();
    kGl();
    Zn();
    OS();
    Mue();
    AGl = __toESM(pt(), 1);
    IGl = require("fs/promises");
    o3o = require("path");
    mK = __toESM(ot(), 1);
    zZ = __toESM(ie(), 1);
  });
  function NGl(e) {
    let t = DGl.homedir();
    let n = Nt();
    let r = e.startsWith(t) ? "~" + e.slice(t.length) : null;
    let o = e.startsWith(n) ? "./" + MGl.relative(n, e) : null;
    if (r && o) {
      return r.length <= o.length ? r : o;
    }
    return r || o || e;
  }
  var c9m;
  var DGl;
  var MGl;
  var LGl;
  var FGl = __lazy(() => {
    et();
    vo();
    c9m = __toESM(pt(), 1);
    DGl = require("os");
    MGl = require("path");
    LGl = __toESM(ie(), 1);
  });
  function u9m(e) {
    return !!MTs(e);
  }
  function UGl(e) {
    let t = e.trim().split(/\s+/);
    for (let n of t) {
      if (/^\/[^/]+$/.test(n)) {
        continue;
      }
      if (n.startsWith("-")) {
        continue;
      }
      let r = rar.basename(n);
      if (d9m.vZc(r.toLowerCase())) {
        continue;
      }
      return r;
    }
    return rar.basename(t[0] ?? e);
  }
  function s3o(e) {
    let t = UGl(e);
    return p9m.find(n => t.includes(n));
  }
  function h9m(e, t, n) {
    if (!n) {
      return [t];
    }
    if (f9m.vZc(e)) {
      return ["-g", `${t}:${n}`];
    }
    if (e === "subl") {
      return [`${t}:${n}`];
    }
    return [t];
  }
  function BGl(e, t) {
    let n = v5();
    if (!n) {
      return false;
    }
    let r = n.split(" ");
    let o = r[0] ?? n;
    let s = r.slice(1);
    let i = s3o(n);
    if (i) {
      let c = h9m(i, e, t);
      let u = {
        detached: true,
        stdio: "ignore",
        windowsHide: true
      };
      let d;
      d = oar.spawn(o, [...s, ...c], u);
      d.on("error", p => logForDebugging(`editor spawn failed: ${p}`, {
        level: "error"
      }));
      d.unref();
      return true;
    }
    let a = rVd.get(process.stdout);
    if (!a) {
      return false;
    }
    let l = t && m9m.test(rar.basename(o));
    a.enterAlternateScreen();
    try {
      let c = {
        stdio: "inherit"
      };
      let u;
      {
        let d = [...s, ...(l ? [`+${t}`, e] : [e])];
        u = oar.spawnSync(o, d, c);
      }
      if (u.error) {
        logForDebugging(`editor spawn failed: ${u.error}`, {
          level: "error"
        });
        return false;
      }
      return true;
    } finally {
      a.exitAlternateScreen();
    }
  }
  function v5() {
    return getAttacherCaps()?.editor ?? g9m();
  }
  function i3o() {
    let e = v5();
    if (!e) {
      return;
    }
    let t = UGl(e);
    return t && t.length <= 8 ? t : undefined;
  }
  var oar;
  var rar;
  var d9m;
  var p9m;
  var m9m;
  var f9m;
  var g9m;
  var SUe = __lazy(() => {
    at();
    je();
    oar = require("child_process");
    rar = require("path");
    d9m = new Set(["start", "cmd", "cmd.exe"]);
    p9m = ["code", "cursor", "windsurf", "codium", "subl", "atom", "gedit", "notepad++", "notepad"];
    m9m = /\b(vi|vim|nvim|nano|emacs|pico|micro|helix|hx)\b/;
    f9m = new Set(["code", "cursor", "windsurf", "codium"]);
    g9m = TEr(() => {
      if (process.env.VISUAL?.trim()) {
        return process.env.VISUAL.trim();
      }
      if (process.env.EDITOR?.trim()) {
        return process.env.EDITOR.trim();
      }
      return ["code", "vi", "nano"].find(t => u9m(t));
    });
  });
  function _9m(e) {
    return s3o(e) !== undefined;
  }
  function jwe(e) {
    let t = zt();
    let n = rVd.get(process.stdout);
    if (!n) {
      throw Error("Ink instance not found - cannot pause rendering");
    }
    let r = v5();
    if (!r) {
      return {
        content: null
      };
    }
    try {
      t.statSync(e);
    } catch {
      return {
        content: null
      };
    }
    let o = !_9m(r);
    if (o) {
      n.enterAlternateScreen();
    } else {
      n.pause();
      n.suspendStdin();
    }
    try {
      let s = y9m[r] ?? r;
      let i = s.split(" ");
      let a = i[0] ?? s;
      let l = i.slice(1);
      let c;
      if (c = HGl.spawnSync(a, [...l, e], {
        stdio: "inherit"
      }), c.error || c.signal || c.status !== null && c.status !== 0) {
        let d = S0(r);
        return {
          content: null,
          error: c.error ? `Couldn't open ${d} \u2014 ${c.error.message}` : c.signal ? `${d} closed unexpectedly (${c.signal})` : `${d} quit unexpectedly (exit code ${c.status})`
        };
      }
      return {
        content: t.readFileSync(e, {
          encoding: "utf-8"
        })
      };
    } catch {
      return {
        content: null
      };
    } finally {
      if (o) {
        n.exitAlternateScreen();
      } else {
        n.resumeStdin();
        n.resume();
      }
    }
  }
  function b9m(e, t, n) {
    let r = e;
    for (let [o, s] of Object.entries(n)) {
      if (s.type === "text") {
        let i = parseInt(o);
        let a = s.content;
        let l = r.indexOf(a);
        if (l !== -1) {
          let c = KPe(a);
          let u = out(i, c);
          r = r.slice(0, l) + u + r.slice(l + a.length);
        }
      }
    }
    return r;
  }
  function S9m(e) {
    let t = e.split(`
`);
    if (t.length > 50) {
      t = t.slice(-50);
      t.unshift("\u2026 (earlier output truncated)");
    }
    return `# \u2500\u2500\u2500 Claude's last response (for reference; removed on save) \u2500\u2500\u2500
` + `${t.map(r => r ? `# ${r}` : "#").join(`
`)}
${"# \u2500\u2500\u2500 Write your reply below this line \u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500"}

`;
  }
  function T9m(e) {
    let t = e.indexOf("# \u2500\u2500\u2500 Write your reply below this line \u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500");
    if (t === -1) {
      return e;
    }
    return e.slice(t + ("# \u2500\u2500\u2500 Write your reply below this line \u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500").length).replace(/^\r?\n\r?\n?/, "");
  }
  function KZ(e, t, n) {
    let r = zt();
    let o = olt();
    try {
      let s = t ? nX(e, t) : e;
      let i = n ? S9m(n) + s : s;
      vxe(o, i, {
        encoding: "utf-8",
        flush: true
      });
      let a = jwe(o);
      if (a.content === null) {
        return a;
      }
      let l = a.content;
      if (n) {
        l = T9m(l);
      }
      if (l.endsWith(`
`) && !l.endsWith(`

`)) {
        l = l.slice(0, -1);
      }
      if (t) {
        l = b9m(l, e, t);
      }
      return {
        content: l
      };
    } finally {
      try {
        r.unlinkSync(o);
      } catch {}
    }
  }
  var HGl;
  var y9m;
  var Lfe = __lazy(() => {
    gq();
    SUe();
    bT();
    BC();
    HGl = require("child_process");
    y9m = {
      code: "code -w",
      subl: "subl --wait"
    };
  });
  var WGl = {};
  __export(WGl, {
    call: () => call_export27
  });
  function E9m({
    onDone: e
  }) {
    let t = async r => {
      try {
        if (r.includes(er())) {
          await Ys().mkdir(er());
        }
        try {
          await jGl.writeFile(r, "", {
            encoding: "utf8",
            flag: "wx"
          });
        } catch (c) {
          if (en(c) !== "EEXIST") {
            throw c;
          }
        }
        await jwe(r);
        let o = "default";
        let s = "";
        if (process.env.VISUAL) {
          o = "$VISUAL";
          s = process.env.VISUAL;
        } else if (process.env.EDITOR) {
          o = "$EDITOR";
          s = process.env.EDITOR;
        }
        let i = o !== "default" ? `Using ${o}="${s}".` : "";
        let a = i ? `> ${i} To change editor, set $EDITOR or $VISUAL environment variable.` : "> To use a different editor, set the $EDITOR or $VISUAL environment variable.";
        let l = Ql() ? `

> Safe mode: this session doesn't load memory files, so changes take effect after you ${UR()}.` : "";
        e(`Opened memory file at ${NGl(r)}${l}

${a}`, {
          display: "system"
        });
      } catch (o) {
        logForDebugging(`Failed to open memory file ${r}: ${o}`, {
          level: "error"
        });
        e(`Error opening memory file: ${o}`);
      }
    };
    let n = () => {
      e("Cancelled memory editing", {
        display: "system"
      });
    };
    return YZ.jsx(or, {
      title: "Memory",
      onCancel: n,
      color: "remember",
      children: YZ.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [Ql() && YZ.jsxs(gXd, {
          flexDirection: "column",
          children: [YZ.jsxs(Text, {
            color: "suggestion",
            children: [vGd.info, " Safe mode"]
          }), YZ.jsxs(Text, {
            dimColor: true,
            children: ["Memory files aren't loaded into this session. You can still edit them \u2014 changes take effect after you ", UR(), "."]
          })]
        }), YZ.jsx(qGl.Suspense, {
          fallback: YZ.jsx(Xc, {
            message: "Loading memory files\u2026",
            dimColor: true
          }),
          children: YZ.jsx(PGl, {
            onSelect: t,
            onCancel: n
          })
        }), YZ.jsx(eD, {
          url: "https://code.claude.com/docs/en/memory"
        })]
      })
    });
  }
  var jGl;
  var qGl;
  var YZ;
  var call_export27 = async e => (clearMemoryFileCaches(), await getMemoryFiles(), YZ.jsx(E9m, {
    onDone: e
  }));
  var GGl = __lazy(() => {
    Ii();
    die();
    Pv();
    OGl();
    FGl();
    et();
    _b();
    bx();
    je();
    gn();
    dt();
    Lfe();
    jGl = require("fs/promises");
    qGl = __toESM(ot(), 1);
    YZ = __toESM(ie(), 1);
  });
  var w9m;
  var KGl = {};
  __export(KGl, {
    call: () => call_export28
  });
  var call_export28 = async (e, t) => {
    let n = !getMemoryToggledOff();
    setMemoryToggledOff(n);
    t.sessionState?.notifyInternalMetadataChanged({
      memory_toggled_off: n ? true : null
    });
    logEvent("tengu_memory_toggled", {
      toggled_off: n
    });
    return {
      type: "text",
      value: n ? `Memory paused for this session \xB7 this conversation will not write or read new memories, and previously-loaded memory content should not be referenced.

Run /pause-memory again to resume.` : "Memory resumed \xB7 memory content may be referenced and new memories can be saved."
    };
  };
  var YGl = __lazy(() => {
    at();
    Ot();
  });
  var R9m;
  function c3o(e) {
    let t = XGl.c(14);
    let {
      commands: n,
      maxHeight: r,
      columns: o,
      title: s,
      onCancel: i,
      emptyMessage: a
    } = e;
    let {
      headerFocused: l,
      focusHeader: c
    } = zM();
    let u = Math.max(1, o - 10);
    let d = Math.max(1, Math.floor((r - 10) / 2));
    let p;
    if (t[0] !== n || t[1] !== u) {
      let h = new Set();
      let g;
      if (t[3] !== u) {
        g = y => ({
          label: `/${y.name}`,
          value: y.name,
          description: truncate(formatDescriptionWithSource(y), u, true)
        });
        t[3] = u;
        t[4] = g;
      } else {
        g = t[4];
      }
      p = n.filter(y => {
        if (h.vZc(y.name)) {
          return false;
        }
        h.add(y.name);
        return true;
      }).sort(x9m).map(g);
      t[0] = n;
      t[1] = u;
      t[2] = p;
    } else {
      p = t[2];
    }
    let m = p;
    let f;
    if (t[5] !== n.length || t[6] !== a || t[7] !== c || t[8] !== l || t[9] !== i || t[10] !== m || t[11] !== s || t[12] !== d) {
      f = Ffe.jsx(gXd, {
        flexDirection: "column",
        paddingY: 1,
        children: n.length === 0 && a ? Ffe.jsx(sc, {
          children: a
        }) : Ffe.jsxs(Ffe.Fragment, {
          children: [Ffe.jsx(Text, {
            children: s
          }), Ffe.jsx(gXd, {
            marginTop: 1,
            children: Ffe.jsx(xr, {
              options: m,
              visibleOptionCount: d,
              onCancel: i,
              disableSelection: true,
              hideIndexes: true,
              layout: "compact-vertical",
              onUpFromFirstItem: c,
              isDisabled: l
            })
          })]
        })
      });
      t[5] = n.length;
      t[6] = a;
      t[7] = c;
      t[8] = l;
      t[9] = i;
      t[10] = m;
      t[11] = s;
      t[12] = d;
      t[13] = f;
    } else {
      f = t[13];
    }
    return f;
  }
  function x9m(e, t) {
    return e.name.localeCompare(t.name);
  }
  var XGl;
  var Ffe;
  var QGl = __lazy(() => {
    Bm();
    et();
    cs();
    $c();
    xb();
    yH();
    XGl = __toESM(pt(), 1);
    Ffe = __toESM(ie(), 1);
  });
  function ZGl(e) {
    return e.replaceAll("+", " + ");
  }
  function sar(e) {
    let t = e9l.c(94);
    let {
      dimColor: n,
      fixedWidth: r,
      gap: o,
      paddingX: s
    } = e;
    let i = Zu("app:toggleTranscript", "Global", "ctrl+o");
    let a;
    if (t[0] !== i) {
      a = ZGl(i);
      t[0] = i;
      t[1] = a;
    } else {
      a = t[1];
    }
    let l = a;
    let c = NI("app:toggleTodos", "Global", "ctrl+t");
    let u = NI("chat:undo", "Chat", "ctrl+_");
    let d = NI("chat:stash", "Chat", "ctrl+s");
    let p = NI("chat:cycleMode", "Chat", "shift+tab");
    let m = NI("chat:modelPicker", "Chat", "alt+p");
    let f = NI("chat:fastMode", "Chat", "alt+o");
    let h = NI("chat:externalEditor", "Chat", "ctrl+g");
    let g = Zu("app:toggleTerminal", "Global", "meta+j");
    let y;
    if (t[2] !== g) {
      y = ZGl(g);
      t[2] = g;
      t[3] = y;
    } else {
      y = t[3];
    }
    let _ = y;
    let b = NI("chat:imagePaste", "Chat", "ctrl+v");
    let S;
    if (t[4] !== n || t[5] !== _) {
      S = null;
      t[4] = n;
      t[5] = _;
      t[6] = S;
    } else {
      S = t[6];
    }
    let E = S;
    let C = r ? 24 : undefined;
    let x;
    if (t[7] !== n) {
      x = cp.jsx(gXd, {
        children: cp.jsx(Text, {
          dimColor: n,
          children: "! for shell mode"
        })
      });
      t[7] = n;
      t[8] = x;
    } else {
      x = t[8];
    }
    let A;
    if (t[9] !== n) {
      A = cp.jsx(gXd, {
        children: cp.jsx(Text, {
          dimColor: n,
          children: "/ for commands"
        })
      });
      t[9] = n;
      t[10] = A;
    } else {
      A = t[10];
    }
    let k;
    if (t[11] !== n) {
      k = cp.jsx(gXd, {
        children: cp.jsx(Text, {
          dimColor: n,
          children: "@ for file paths"
        })
      });
      t[11] = n;
      t[12] = k;
    } else {
      k = t[12];
    }
    let I;
    if (t[13] !== n) {
      I = cp.jsx(gXd, {
        children: cp.jsx(Text, {
          dimColor: n,
          children: "/btw for side question"
        })
      });
      t[13] = n;
      t[14] = I;
    } else {
      I = t[14];
    }
    let O;
    if (t[15] !== C || t[16] !== x || t[17] !== A || t[18] !== k || t[19] !== I) {
      O = cp.jsxs(gXd, {
        flexDirection: "column",
        width: C,
        children: [x, A, k, I]
      });
      t[15] = C;
      t[16] = x;
      t[17] = A;
      t[18] = k;
      t[19] = I;
      t[20] = O;
    } else {
      O = t[20];
    }
    let M = r ? 35 : undefined;
    let L;
    if (t[21] !== n) {
      L = cp.jsx(gXd, {
        children: cp.jsx(Text, {
          dimColor: n,
          children: "double tap esc to clear input"
        })
      });
      t[21] = n;
      t[22] = L;
    } else {
      L = t[22];
    }
    let P;
    if (t[23] !== p) {
      P = cp.jsx(xt, {
        chord: p,
        action: "auto-accept edits",
        format: qwe
      });
      t[23] = p;
      t[24] = P;
    } else {
      P = t[24];
    }
    let F;
    if (t[25] !== n || t[26] !== P) {
      F = cp.jsx(gXd, {
        children: cp.jsx(Text, {
          dimColor: n,
          children: P
        })
      });
      t[25] = n;
      t[26] = P;
      t[27] = F;
    } else {
      F = t[27];
    }
    let H;
    if (t[28] !== n || t[29] !== l) {
      H = cp.jsx(gXd, {
        children: cp.jsxs(Text, {
          dimColor: n,
          children: [l, " for verbose output"]
        })
      });
      t[28] = n;
      t[29] = l;
      t[30] = H;
    } else {
      H = t[30];
    }
    let U;
    if (t[31] !== c) {
      U = cp.jsx(xt, {
        chord: c,
        action: "toggle tasks",
        format: qwe
      });
      t[31] = c;
      t[32] = U;
    } else {
      U = t[32];
    }
    let N;
    if (t[33] !== n || t[34] !== U) {
      N = cp.jsx(gXd, {
        children: cp.jsx(Text, {
          dimColor: n,
          children: U
        })
      });
      t[33] = n;
      t[34] = U;
      t[35] = N;
    } else {
      N = t[35];
    }
    let W;
    if (t[36] === Symbol.for("react.memo_cache_sentinel")) {
      W = yql();
      t[36] = W;
    } else {
      W = t[36];
    }
    let j;
    if (t[37] !== n) {
      j = cp.jsx(gXd, {
        children: cp.jsx(Text, {
          dimColor: n,
          children: W
        })
      });
      t[37] = n;
      t[38] = j;
    } else {
      j = t[38];
    }
    let z;
    if (t[39] !== M || t[40] !== L || t[41] !== F || t[42] !== H || t[43] !== N || t[44] !== j || t[45] !== E) {
      z = cp.jsxs(gXd, {
        flexDirection: "column",
        width: M,
        children: [L, F, H, N, E, j]
      });
      t[39] = M;
      t[40] = L;
      t[41] = F;
      t[42] = H;
      t[43] = N;
      t[44] = j;
      t[45] = E;
      t[46] = z;
    } else {
      z = t[46];
    }
    let V;
    if (t[47] !== u) {
      V = cp.jsx(xt, {
        chord: u,
        action: "undo",
        format: qwe
      });
      t[47] = u;
      t[48] = V;
    } else {
      V = t[48];
    }
    let K;
    if (t[49] !== n || t[50] !== V) {
      K = cp.jsx(gXd, {
        children: cp.jsx(Text, {
          dimColor: n,
          children: V
        })
      });
      t[49] = n;
      t[50] = V;
      t[51] = K;
    } else {
      K = t[51];
    }
    let J;
    if (t[52] !== n) {
      J = ano() && cp.jsx(gXd, {
        children: cp.jsx(Text, {
          dimColor: n,
          children: cp.jsx(xt, {
            chord: "ctrl+z",
            action: "suspend",
            format: qwe
          })
        })
      });
      t[52] = n;
      t[53] = J;
    } else {
      J = t[53];
    }
    let Q;
    if (t[54] !== b) {
      Q = cp.jsx(xt, {
        chord: b,
        action: "paste images",
        format: qwe
      });
      t[54] = b;
      t[55] = Q;
    } else {
      Q = t[55];
    }
    let Z;
    if (t[56] !== n || t[57] !== Q) {
      Z = cp.jsx(gXd, {
        children: cp.jsx(Text, {
          dimColor: n,
          children: Q
        })
      });
      t[56] = n;
      t[57] = Q;
      t[58] = Z;
    } else {
      Z = t[58];
    }
    let ne;
    if (t[59] !== m) {
      ne = cp.jsx(xt, {
        chord: m,
        action: "switch model",
        format: qwe
      });
      t[59] = m;
      t[60] = ne;
    } else {
      ne = t[60];
    }
    let oe;
    if (t[61] !== n || t[62] !== ne) {
      oe = cp.jsx(gXd, {
        children: cp.jsx(Text, {
          dimColor: n,
          children: ne
        })
      });
      t[61] = n;
      t[62] = ne;
      t[63] = oe;
    } else {
      oe = t[63];
    }
    let ee;
    if (t[64] !== n || t[65] !== f) {
      ee = lc() && zA() && cp.jsx(gXd, {
        children: cp.jsx(Text, {
          dimColor: n,
          children: cp.jsx(xt, {
            chord: f,
            action: "toggle fast mode",
            format: qwe
          })
        })
      });
      t[64] = n;
      t[65] = f;
      t[66] = ee;
    } else {
      ee = t[66];
    }
    let re;
    if (t[67] !== d) {
      re = cp.jsx(xt, {
        chord: d,
        action: "stash prompt",
        format: qwe
      });
      t[67] = d;
      t[68] = re;
    } else {
      re = t[68];
    }
    let se;
    if (t[69] !== n || t[70] !== re) {
      se = cp.jsx(gXd, {
        children: cp.jsx(Text, {
          dimColor: n,
          children: re
        })
      });
      t[69] = n;
      t[70] = re;
      t[71] = se;
    } else {
      se = t[71];
    }
    let ae;
    if (t[72] !== h) {
      ae = cp.jsx(xt, {
        chord: h,
        action: "edit in $EDITOR",
        format: qwe
      });
      t[72] = h;
      t[73] = ae;
    } else {
      ae = t[73];
    }
    let de;
    if (t[74] !== n || t[75] !== ae) {
      de = cp.jsx(gXd, {
        flexShrink: 0,
        children: cp.jsx(Text, {
          dimColor: n,
          children: ae
        })
      });
      t[74] = n;
      t[75] = ae;
      t[76] = de;
    } else {
      de = t[76];
    }
    let be;
    if (t[77] !== n) {
      be = oV() && cp.jsx(gXd, {
        children: cp.jsx(Text, {
          dimColor: n,
          children: "/keybindings to customize"
        })
      });
      t[77] = n;
      t[78] = be;
    } else {
      be = t[78];
    }
    let fe;
    if (t[79] !== K || t[80] !== J || t[81] !== Z || t[82] !== oe || t[83] !== ee || t[84] !== se || t[85] !== de || t[86] !== be) {
      fe = cp.jsxs(gXd, {
        flexDirection: "column",
        children: [K, J, Z, oe, ee, se, de, be]
      });
      t[79] = K;
      t[80] = J;
      t[81] = Z;
      t[82] = oe;
      t[83] = ee;
      t[84] = se;
      t[85] = de;
      t[86] = be;
      t[87] = fe;
    } else {
      fe = t[87];
    }
    let me;
    if (t[88] !== o || t[89] !== s || t[90] !== O || t[91] !== z || t[92] !== fe) {
      me = cp.jsxs(gXd, {
        paddingX: s,
        flexDirection: "row",
        gap: o,
        children: [O, z, fe]
      });
      t[88] = o;
      t[89] = s;
      t[90] = O;
      t[91] = z;
      t[92] = fe;
      t[93] = me;
    } else {
      me = t[93];
    }
    return me;
  }
  var e9l;
  var cp;
  var qwe;
  var u3o = __lazy(() => {
    lno();
    et();
    xre();
    eOe();
    c0();
    ru();
    $n();
    GT();
    bs();
    oUe();
    e9l = __toESM(pt(), 1);
    cp = __toESM(ie(), 1);
    qwe = {
      keyCase: "lower",
      modSep: " + "
    };
  });
  function n9l() {
    let e = t9l.c(8);
    let {
      rows: t
    } = Sr();
    let n = t < 44;
    let r = n ? 0 : 1;
    let o = n ? 0 : 1;
    let s;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      s = JZ.jsx(gXd, {
        flexShrink: 0,
        children: JZ.jsx(Text, {
          children: "Claude understands your codebase, makes edits with your permission, and executes commands \u2014 right from your terminal."
        })
      });
      e[0] = s;
    } else {
      s = e[0];
    }
    let i;
    if (e[1] !== n) {
      i = !n && JZ.jsx(gXd, {
        children: JZ.jsxs(Text, {
          dimColor: true,
          children: ["New here? Run ", JZ.jsx(Text, {
            color: "suggestion",
            children: "/powerup"
          }), " to learn the features most people miss."]
        })
      });
      e[1] = n;
      e[2] = i;
    } else {
      i = e[2];
    }
    let a;
    if (e[3] === Symbol.for("react.memo_cache_sentinel")) {
      a = JZ.jsxs(gXd, {
        flexDirection: "column",
        children: [JZ.jsx(gXd, {
          flexShrink: 0,
          children: JZ.jsx(Text, {
            bold: true,
            children: "Shortcuts"
          })
        }), JZ.jsx(sar, {
          gap: 2,
          fixedWidth: true
        })]
      });
      e[3] = a;
    } else {
      a = e[3];
    }
    let l;
    if (e[4] !== r || e[5] !== o || e[6] !== i) {
      l = JZ.jsxs(gXd, {
        flexDirection: "column",
        paddingY: r,
        gap: o,
        children: [s, i, a]
      });
      e[4] = r;
      e[5] = o;
      e[6] = i;
      e[7] = l;
    } else {
      l = e[7];
    }
    return l;
  }
  var t9l;
  var JZ;
  var r9l = __lazy(() => {
    ki();
    et();
    u3o();
    t9l = __toESM(pt(), 1);
    JZ = __toESM(ie(), 1);
  });
  function s9l(e) {
    let t = o9l.c(44);
    let {
      onClose: n,
      commands: r
    } = e;
    let o = Sr();
    let {
      rows: s,
      columns: i
    } = h_(o);
    let a = s;
    let l = o.rows >= 44;
    let c;
    if (t[0] !== n) {
      c = () => n("Help dialog dismissed", {
        display: "system"
      });
      t[0] = n;
      t[1] = c;
    } else {
      c = t[1];
    }
    let u = c;
    let d;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      d = {
        context: "Help"
      };
      t[2] = d;
    } else {
      d = t[2];
    }
    uo("help:dismiss", u, d);
    let p = Eg(u);
    let m = Zu("help:dismiss", "Help", "esc");
    let f = I9m;
    let h;
    if (t[3] !== r) {
      let M;
      if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
        M = L => f(L) && !L.isHidden;
        t[5] = M;
      } else {
        M = t[5];
      }
      h = r.filter(M);
      t[3] = r;
      t[4] = h;
    } else {
      h = t[4];
    }
    let g = h;
    let y;
    if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
      y = [];
      t[6] = y;
    } else {
      y = t[6];
    }
    let _ = y;
    let b;
    if (t[7] !== r) {
      let M;
      if (t[9] === Symbol.for("react.memo_cache_sentinel")) {
        M = L => !f(L) && !L.isHidden;
        t[9] = M;
      } else {
        M = t[9];
      }
      b = r.filter(M);
      t[7] = r;
      t[8] = b;
    } else {
      b = t[8];
    }
    let S = b;
    let E;
    if (t[10] === Symbol.for("react.memo_cache_sentinel")) {
      E = H0.jsx(kh, {
        id: "general",
        title: "General",
        children: H0.jsx(n9l, {})
      }, "general");
      t[10] = E;
    } else {
      E = t[10];
    }
    let C;
    if (t[11] !== g || t[12] !== u || t[13] !== i || t[14] !== S || t[15] !== a) {
      C = [E];
      let M;
      if (t[17] !== g || t[18] !== u || t[19] !== i || t[20] !== a) {
        M = H0.jsx(kh, {
          id: "commands",
          title: "Commands",
          children: H0.jsx(c3o, {
            commands: g,
            maxHeight: a,
            columns: i,
            title: "Browse default commands",
            onCancel: u
          })
        }, "commands");
        t[17] = g;
        t[18] = u;
        t[19] = i;
        t[20] = a;
        t[21] = M;
      } else {
        M = t[21];
      }
      C.push(M);
      let L;
      if (t[22] !== u || t[23] !== i || t[24] !== S || t[25] !== a) {
        L = H0.jsx(kh, {
          id: "custom",
          title: "Custom commands",
          children: H0.jsx(c3o, {
            commands: S,
            maxHeight: a,
            columns: i,
            title: "Browse custom commands",
            emptyMessage: "No custom commands found",
            onCancel: u
          })
        }, "custom");
        t[22] = u;
        t[23] = i;
        t[24] = S;
        t[25] = a;
        t[26] = L;
      } else {
        L = t[26];
      }
      C.push(L);
      t[11] = g;
      t[12] = u;
      t[13] = i;
      t[14] = S;
      t[15] = a;
      t[16] = C;
    } else {
      C = t[16];
    }
    let x;
    if (t[31] !== C) {
      x = H0.jsx(VM, {
        title: "Help",
        color: "professionalBlue",
        defaultTab: "general",
        children: C
      });
      t[31] = C;
      t[32] = x;
    } else {
      x = t[32];
    }
    let A;
    if (t[33] === Symbol.for("react.memo_cache_sentinel")) {
      A = H0.jsx(gXd, {
        marginTop: 1,
        flexShrink: 0,
        children: H0.jsxs(Text, {
          children: ["For more help:", " ", H0.jsx(Link, {
            url: "https://code.claude.com/docs/en/overview"
          })]
        })
      });
      t[33] = A;
    } else {
      A = t[33];
    }
    let k;
    if (t[34] !== l) {
      k = l && H0.jsx(gXd, {
        marginTop: 1,
        flexShrink: 0,
        children: H0.jsx(Text, {
          dimColor: true,
          children: "Something else? Use /feedback to report bugs or request features."
        })
      });
      t[34] = l;
      t[35] = k;
    } else {
      k = t[35];
    }
    let I;
    if (t[36] !== m || t[37] !== p.keyName || t[38] !== p.pending) {
      I = H0.jsx(gXd, {
        marginTop: 1,
        flexShrink: 0,
        children: H0.jsx(Text, {
          dimColor: true,
          children: p.pending ? H0.jsxs(H0.Fragment, {
            children: ["Press ", p.keyName, " again to exit"]
          }) : H0.jsxs(Text, {
            italic: true,
            children: [m, " to cancel"]
          })
        })
      });
      t[36] = m;
      t[37] = p.keyName;
      t[38] = p.pending;
      t[39] = I;
    } else {
      I = t[39];
    }
    let O;
    if (t[40] !== I || t[41] !== x || t[42] !== k) {
      O = H0.jsx(gXd, {
        flexDirection: "column",
        children: H0.jsxs(Td, {
          color: "professionalBlue",
          children: [x, A, k, I]
        })
      });
      t[40] = I;
      t[41] = x;
      t[42] = k;
      t[43] = O;
    } else {
      O = t[43];
    }
    return O;
  }
  function I9m(e) {
    return e.type !== "prompt" || e.source === "builtin" || e.source === "bundled";
  }
  var o9l;
  var H0;
  var i9l = __lazy(() => {
    mO();
    c0();
    rE();
    ki();
    et();
    Bs();
    oE();
    yH();
    QGl();
    r9l();
    o9l = __toESM(pt(), 1);
    H0 = __toESM(ie(), 1);
  });
  var a9l = {};
  __export(a9l, {
    call: () => call_export29
  });
  var l9l;
  var call_export29 = async (e, {
    options: {
      commands: t
    }
  }) => l9l.jsx(s9l, {
    commands: t,
    onClose: e
  });
  var c9l = __lazy(() => {
    i9l();
    l9l = __toESM(ie(), 1);
  });
  var O9m;
  function d9l(e) {
    let t = p3o.c(9);
    let {
      onComplete: n
    } = e;
    let r;
    if (t[0] !== n) {
      r = async u => {
        let d = u === "yes";
        saveGlobalConfig(p => ({
          ...p,
          autoConnectIde: d,
          hasIdeAutoConnectDialogBeenShown: true
        }));
        n();
      };
      t[0] = n;
      t[1] = r;
    } else {
      r = t[1];
    }
    let o = r;
    let s;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      s = [{
        label: "Yes",
        value: "yes"
      }, {
        label: "No",
        value: "no"
      }];
      t[2] = s;
    } else {
      s = t[2];
    }
    let i = s;
    let a;
    if (t[3] !== o) {
      a = yYe.jsx(xr, {
        options: i,
        onChange: o,
        defaultValue: "yes"
      });
      t[3] = o;
      t[4] = a;
    } else {
      a = t[4];
    }
    let l;
    if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
      l = yYe.jsx(Text, {
        dimColor: true,
        children: "You can also configure this in /config or with the --ide flag"
      });
      t[5] = l;
    } else {
      l = t[5];
    }
    let c;
    if (t[6] !== n || t[7] !== a) {
      c = yYe.jsxs(or, {
        title: "Do you wish to enable auto-connect to IDE?",
        color: "ide",
        onCancel: n,
        children: [a, l]
      });
      t[6] = n;
      t[7] = a;
      t[8] = c;
    } else {
      c = t[8];
    }
    return c;
  }
  function p9l() {
    let e = getGlobalConfig();
    return !M$() && e.autoConnectIde !== true && e.hasIdeAutoConnectDialogBeenShown !== true;
  }
  function m9l(e) {
    let t = p3o.c(10);
    let {
      onComplete: n
    } = e;
    let r;
    if (t[0] !== n) {
      r = () => {
        saveGlobalConfig(D9m);
        n(true);
      };
      t[0] = n;
      t[1] = r;
    } else {
      r = t[1];
    }
    let o = r;
    let s;
    if (t[2] !== n) {
      s = () => {
        n(false);
      };
      t[2] = n;
      t[3] = s;
    } else {
      s = t[3];
    }
    let i = s;
    let a;
    if (t[4] !== i || t[5] !== o) {
      a = yYe.jsx(mc, {
        cancelFirst: true,
        focus: "cancel",
        onConfirm: o,
        onCancel: i
      });
      t[4] = i;
      t[5] = o;
      t[6] = a;
    } else {
      a = t[6];
    }
    let l;
    if (t[7] !== i || t[8] !== a) {
      l = yYe.jsx(or, {
        title: "Do you wish to disable auto-connect to IDE?",
        subtitle: "You can also configure this in /config",
        onCancel: i,
        color: "ide",
        children: a
      });
      t[7] = i;
      t[8] = a;
      t[9] = l;
    } else {
      l = t[9];
    }
    return l;
  }
  function D9m(e) {
    return {
      ...e,
      autoConnectIde: false
    };
  }
  function f9l() {
    let e = getGlobalConfig();
    return !M$() && e.autoConnectIde === true;
  }
  var p3o;
  var yYe;
  var h9l = __lazy(() => {
    et();
    bT();
    OS();
    b_();
    Ii();
    p3o = __toESM(pt(), 1);
    yYe = __toESM(ie(), 1);
  });
  var _9l = {};
  __export(_9l, {
    formatWorkspaceFolders: () => formatWorkspaceFolders,
    call: () => call_export30,
    IDE_CONNECTION_TIMEOUT_MS: () => 35000,
    IDECommandFlow: () => IDECommandFlow
  });
  function M9m(e) {
    let t = aZt.c(39);
    let {
      availableIDEs: n,
      unavailableIDEs: r,
      selectedIDE: o,
      onClose: s,
      onSelect: i
    } = e;
    let a;
    if (t[0] !== o?.port) {
      a = o?.port?.toString() ?? "None";
      t[0] = o?.port;
      t[1] = a;
    } else {
      a = t[1];
    }
    let [l, c] = w5.useState(a);
    let [u, d] = w5.useState(false);
    let [p, m] = w5.useState(false);
    let f;
    if (t[2] !== n || t[3] !== i) {
      f = O => {
        if (O !== "None" && p9l()) {
          d(true);
        } else if (O === "None" && f9l()) {
          m(true);
        } else {
          i(n.find(M => M.port === parseInt(O)));
        }
      };
      t[2] = n;
      t[3] = i;
      t[4] = f;
    } else {
      f = t[4];
    }
    let h = f;
    let g;
    if (t[5] !== n) {
      g = n.reduce(F9m, {});
      t[5] = n;
      t[6] = g;
    } else {
      g = t[6];
    }
    let y = g;
    let _;
    if (t[7] !== n || t[8] !== y) {
      let O;
      if (t[10] !== y) {
        O = M => {
          let P = (y[M.name] || 0) > 1 && M.workspaceFolders.length > 0;
          return {
            label: M.name,
            value: M.port.toString(),
            description: P ? formatWorkspaceFolders(M.workspaceFolders) : undefined
          };
        };
        t[10] = y;
        t[11] = O;
      } else {
        O = t[11];
      }
      _ = n.map(O).concat([{
        label: "None",
        value: "None",
        description: undefined
      }]);
      t[7] = n;
      t[8] = y;
      t[9] = _;
    } else {
      _ = t[9];
    }
    let b = _;
    if (u) {
      let O;
      if (t[12] !== h || t[13] !== l) {
        O = CE.jsx(d9l, {
          onComplete: () => h(l)
        });
        t[12] = h;
        t[13] = l;
        t[14] = O;
      } else {
        O = t[14];
      }
      return O;
    }
    if (p) {
      let O;
      if (t[15] !== i) {
        O = CE.jsx(m9l, {
          onComplete: () => {
            i(undefined);
          }
        });
        t[15] = i;
        t[16] = O;
      } else {
        O = t[16];
      }
      return O;
    }
    let S;
    if (t[17] !== n.length) {
      S = n.length === 0 && CE.jsx(sc, {
        children: eGn() ? `No available IDEs detected. Please install the plugin and restart your IDE:
https://docs.claude.com/s/claude-code-jetbrains` : "No available IDEs detected. Make sure your IDE has the Claude Code extension or plugin installed and is running."
      });
      t[17] = n.length;
      t[18] = S;
    } else {
      S = t[18];
    }
    let E;
    if (t[19] !== n.length || t[20] !== h || t[21] !== b || t[22] !== l) {
      E = n.length !== 0 && CE.jsx(xr, {
        defaultValue: l,
        defaultFocusValue: l,
        options: b,
        onChange: O => {
          c(O);
          h(O);
        }
      });
      t[19] = n.length;
      t[20] = h;
      t[21] = b;
      t[22] = l;
      t[23] = E;
    } else {
      E = t[23];
    }
    let C;
    if (t[24] !== n) {
      C = n.length !== 0 && n.some(L9m) && CE.jsx(gXd, {
        marginTop: 1,
        children: CE.jsx(Text, {
          color: "warning",
          children: "Note: Only one Claude Code instance can be connected to VS Code at a time."
        })
      });
      t[24] = n;
      t[25] = C;
    } else {
      C = t[25];
    }
    let x;
    if (t[26] !== n.length) {
      x = n.length !== 0 && !M$() && CE.jsx(gXd, {
        marginTop: 1,
        children: CE.jsx(Text, {
          dimColor: true,
          children: "Tip: You can enable auto-connect to IDE in /config or with the --ide flag"
        })
      });
      t[26] = n.length;
      t[27] = x;
    } else {
      x = t[27];
    }
    let A;
    if (t[28] !== r) {
      A = r.length > 0 && CE.jsxs(gXd, {
        marginTop: 1,
        flexDirection: "column",
        children: [CE.jsxs(Text, {
          dimColor: true,
          children: ["Found ", r.length, " other running IDE(s). However, their workspace/project directories do not match the current cwd."]
        }), CE.jsxs(gXd, {
          marginTop: 1,
          paddingLeft: 3,
          flexDirection: "column",
          children: [r.slice(0, 4).map(N9m), r.length > 4 && CE.jsx(B1, {
            count: r.length - 4,
            unit: "IDE"
          })]
        })]
      });
      t[28] = r;
      t[29] = A;
    } else {
      A = t[29];
    }
    let k;
    if (t[30] !== S || t[31] !== E || t[32] !== C || t[33] !== x || t[34] !== A) {
      k = CE.jsxs(gXd, {
        flexDirection: "column",
        children: [S, E, C, x, A]
      });
      t[30] = S;
      t[31] = E;
      t[32] = C;
      t[33] = x;
      t[34] = A;
      t[35] = k;
    } else {
      k = t[35];
    }
    let I;
    if (t[36] !== s || t[37] !== k) {
      I = CE.jsx(or, {
        title: "Select IDE",
        subtitle: "Connect to an IDE for integrated development features.",
        onCancel: s,
        color: "ide",
        children: k
      });
      t[36] = s;
      t[37] = k;
      t[38] = I;
    } else {
      I = t[38];
    }
    return I;
  }
  function N9m(e, t) {
    return CE.jsx(Pw, {
      children: CE.jsxs(Text, {
        dimColor: true,
        children: [e.name, ": ", formatWorkspaceFolders(e.workspaceFolders)]
      })
    }, t);
  }
  function L9m(e) {
    return e.name === "VS Code" || e.name === "Visual Studio Code";
  }
  function F9m(e, t) {
    e[t.name] = (e[t.name] || 0) + 1;
    return e;
  }
  async function U9m(e, t) {
    let n = t?.ide;
    if (!n || n.type !== "sse-ide" && n.type !== "ws-ide") {
      return null;
    }
    for (let r of e) {
      if (r.url === n.url) {
        return r;
      }
    }
    return null;
  }
  function B9m(e) {
    let t = aZt.c(18);
    let {
      availableIDEs: n,
      onSelectIDE: r,
      onDone: o
    } = e;
    let s;
    if (t[0] !== n[0]?.port) {
      s = n[0]?.port?.toString() ?? "";
      t[0] = n[0]?.port;
      t[1] = s;
    } else {
      s = t[1];
    }
    let [i, a] = w5.useState(s);
    let l;
    if (t[2] !== n || t[3] !== r) {
      l = y => {
        let _ = n.find(b => b.port === parseInt(y));
        r(_);
      };
      t[2] = n;
      t[3] = r;
      t[4] = l;
    } else {
      l = t[4];
    }
    let c = l;
    let u;
    if (t[5] !== n) {
      u = n.map($9m);
      t[5] = n;
      t[6] = u;
    } else {
      u = t[6];
    }
    let d = u;
    let p;
    if (t[7] !== o) {
      p = function () {
        o("IDE selection cancelled", {
          display: "system"
        });
      };
      t[7] = o;
      t[8] = p;
    } else {
      p = t[8];
    }
    let m = p;
    let f;
    if (t[9] !== c) {
      f = y => {
        a(y);
        c(y);
      };
      t[9] = c;
      t[10] = f;
    } else {
      f = t[10];
    }
    let h;
    if (t[11] !== d || t[12] !== i || t[13] !== f) {
      h = CE.jsx(xr, {
        defaultValue: i,
        defaultFocusValue: i,
        options: d,
        onChange: f
      });
      t[11] = d;
      t[12] = i;
      t[13] = f;
      t[14] = h;
    } else {
      h = t[14];
    }
    let g;
    if (t[15] !== m || t[16] !== h) {
      g = CE.jsx(or, {
        title: "Select an IDE to open the project",
        onCancel: m,
        color: "ide",
        children: h
      });
      t[15] = m;
      t[16] = h;
      t[17] = g;
    } else {
      g = t[17];
    }
    return g;
  }
  function $9m(e) {
    return {
      label: e.name,
      value: e.port.toString()
    };
  }
  function H9m(e) {
    let t = aZt.c(15);
    let {
      runningIDEs: n,
      onSelectIDE: r,
      onDone: o
    } = e;
    let [s, i] = w5.useState(n[0] ?? "");
    let a;
    if (t[0] !== r) {
      a = g => {
        r(g);
      };
      t[0] = r;
      t[1] = a;
    } else {
      a = t[1];
    }
    let l = a;
    let c;
    if (t[2] !== n) {
      c = n.map(j9m);
      t[2] = n;
      t[3] = c;
    } else {
      c = t[3];
    }
    let u = c;
    let d;
    if (t[4] !== o) {
      d = function () {
        o("IDE selection cancelled", {
          display: "system"
        });
      };
      t[4] = o;
      t[5] = d;
    } else {
      d = t[5];
    }
    let p = d;
    let m;
    if (t[6] !== l) {
      m = g => {
        i(g);
        l(g);
      };
      t[6] = l;
      t[7] = m;
    } else {
      m = t[7];
    }
    let f;
    if (t[8] !== u || t[9] !== s || t[10] !== m) {
      f = CE.jsx(xr, {
        defaultFocusValue: s,
        options: u,
        onChange: m
      });
      t[8] = u;
      t[9] = s;
      t[10] = m;
      t[11] = f;
    } else {
      f = t[11];
    }
    let h;
    if (t[12] !== p || t[13] !== f) {
      h = CE.jsx(or, {
        title: "Select IDE to install extension",
        onCancel: p,
        color: "ide",
        children: f
      });
      t[12] = p;
      t[13] = f;
      t[14] = h;
    } else {
      h = t[14];
    }
    return h;
  }
  function j9m(e) {
    return {
      label: S0(e),
      value: e
    };
  }
  function q9m(e) {
    let t = aZt.c(4);
    let {
      ide: n,
      onInstall: r
    } = e;
    let o;
    let s;
    if (t[0] !== n || t[1] !== r) {
      o = () => {
        r(n);
      };
      s = [n, r];
      t[0] = n;
      t[1] = r;
      t[2] = o;
      t[3] = s;
    } else {
      o = t[2];
      s = t[3];
    }
    w5.useEffect(o, s);
    return null;
  }
  async function call_export30(e, t, n) {
    logEvent("tengu_ext_ide_command", {});
    let {
      options: {
        dynamicMcpConfig: r
      },
      onChangeDynamicMcpConfig: o
    } = t;
    if (n?.trim() === "open") {
      let c = getCurrentWorktreeSession();
      let u = c ? c.worktreePath : Nt();
      let p = (await rGn(true)).filter(m => m.isValid);
      if (p.length === 0) {
        e("No IDEs with Claude Code extension detected.");
        return null;
      }
      return CE.jsx(B9m, {
        availableIDEs: p,
        onSelectIDE: async m => {
          if (!m) {
            e("No IDE selected.");
            return;
          }
          let f = Qja(m.name);
          let h = f ? await oGn(f, m.name) : null;
          if (h) {
            let {
              code: g
            } = await execFileNoThrow(h, [u]);
            if (g !== 0 && !iar.basename(h).startsWith("code")) {
              ({
                code: g
              } = await execFileNoThrow("code", [u]));
            }
            if (g === 0) {
              Pe("ide_open_project");
              e(`Opened ${c ? "worktree" : "project"} in ${_$u.bold(m.name)}`);
            } else {
              Ae("ide_open_project", "ide_open_project_failed");
              e(`Failed to open in ${m.name}. Try opening manually: ${u}`);
            }
          } else if (eGn()) {
            e(`Please open the ${c ? "worktree" : "project"} manually in ${_$u.bold(m.name)}: ${u}`);
          } else {
            e(`Please open the ${c ? "worktree" : "project"} manually in ${_$u.bold(m.name)}: ${u}`);
          }
        },
        onDone: () => {
          e("Exited without opening IDE", {
            display: "system"
          });
        }
      });
    }
    let s = await rGn(true);
    if (s.length === 0 && t.onInstallIDEExtension && !M$()) {
      let c = await ZSo();
      let u = d => {
        if (t.onInstallIDEExtension) {
          if (t.onInstallIDEExtension(d), Foe(d)) {
            e(`Installed plugin to ${_$u.bold(S0(d))}
Please ${_$u.bold("restart your IDE")} completely for it to take effect`);
          } else {
            e(`Installed extension to ${_$u.bold(S0(d))}`);
          }
        }
      };
      if (c.length > 1) {
        return CE.jsx(H9m, {
          runningIDEs: c,
          onSelectIDE: u,
          onDone: () => {
            e("No IDE selected.", {
              display: "system"
            });
          }
        });
      } else if (c.length === 1) {
        return CE.jsx(q9m, {
          ide: c[0],
          onInstall: u
        });
      }
    }
    let i = s.filter(c => c.isValid);
    let a = s.filter(c => !c.isValid);
    let l = await U9m(i, r);
    return CE.jsx(IDECommandFlow, {
      availableIDEs: i,
      unavailableIDEs: a,
      currentIDE: l,
      dynamicMcpConfig: r,
      onChangeDynamicMcpConfig: o,
      onDone: e
    });
  }
  function IDECommandFlow({
    availableIDEs: e,
    unavailableIDEs: t,
    currentIDE: n,
    dynamicMcpConfig: r,
    onChangeDynamicMcpConfig: o,
    onDone: s
  }) {
    let [i, a] = w5.useState(null);
    let l = bt(p => p.mcp.clients.find(m => m.name === "ide"));
    let c = Lo();
    let u = w5.useRef(true);
    w5.useEffect(() => {
      if (!i) {
        return;
      }
      if (u.current) {
        u.current = false;
        return;
      }
      if (!l || l.type === "pending") {
        return;
      }
      if (l.type === "connected") {
        Pe("ide_connect");
        s(`Connected to ${i.name}.`);
      } else if (l.type === "failed") {
        Ae("ide_connect", "ide_connect_failed");
        s(`Failed to connect to ${i.name}.`);
      }
    }, [l, i, s]);
    useTimeout(() => {
      if (!i) {
        return;
      }
      Ae("ide_connect", "ide_connect_timeout");
      s(`Connection to ${i.name} timed out.`);
    }, i ? 35000 : null, [i, s]);
    let d = w5.useCallback(p => {
      if (!o) {
        s("Error connecting to IDE.");
        return;
      }
      let m = {
        ...(r || {})
      };
      if (n) {
        delete m.ide;
      }
      if (!p) {
        if (l && l.type === "connected" && n) {
          l.client.onclose = () => {};
          Ow("ide", l.config);
          c(h => ({
            ...h,
            mcp: {
              ...h.mcp,
              clients: h.mcp.clients.filter(g => g.name !== "ide"),
              tools: h.mcp.tools.filter(g => !g.name?.startsWith("mcp__ide__")),
              commands: h.mcp.commands.filter(g => !g.name?.startsWith("mcp__ide__"))
            }
          }));
        }
        if (o(m), n) {
          Pe("ide_disconnect");
        }
        s(n ? `Disconnected from ${n.name}.` : "No IDE selected.");
        return;
      }
      let f = p.url;
      m.ide = {
        type: f.startsWith("ws:") ? "ws-ide" : "sse-ide",
        url: f,
        ideName: p.name,
        authToken: p.authToken,
        ideRunningInWindows: p.ideRunningInWindows,
        scope: "dynamic"
      };
      u.current = true;
      a(p);
      o(m);
    }, [r, n, l, c, o, s]);
    if (i) {
      return CE.jsxs(Text, {
        dimColor: true,
        children: ["Connecting to ", i.name, "\u2026"]
      });
    }
    return CE.jsx(M9m, {
      availableIDEs: e,
      unavailableIDEs: t,
      selectedIDE: n,
      onClose: () => s("IDE selection cancelled", {
        display: "system"
      }),
      onSelect: d
    });
  }
  function formatWorkspaceFolders(e, t = 100) {
    if (e.length === 0) {
      return "";
    }
    let n = Nt();
    let r = e.slice(0, 2);
    let o = e.length > 2;
    let s = o ? 3 : 0;
    let i = (r.length - 1) * 2;
    let a = t - i - s;
    let l = Math.floor(a / r.length);
    let c = n.normalize("NFC");
    let d = r.map(p => {
      let m = p.normalize("NFC");
      if (m.startsWith(c + iar.sep)) {
        p = m.slice(c.length + 1);
      }
      if (p.length <= l) {
        return p;
      }
      return "\u2026" + p.slice(-(l - 1));
    }).join(", ");
    if (o) {
      d += ", \u2026";
    }
    return d;
  }
  var aZt;
  var iar;
  var w5;
  var CE;
  var b9l = __lazy(() => {
    Ot();
    OS();
    Loe();
    Ii();
    xb();
    YX();
    h9l();
    tjt();
    et();
    ln();
    eA();
    ho();
    vo();
    ji();
    bT();
    iP();
    aZt = __toESM(pt(), 1);
    iar = __toESM(require("path"));
    w5 = __toESM(ot(), 1);
    CE = __toESM(ie(), 1);
  });
  var G9m;
  function V9m() {
    return st(process.env.CLAUDE_CODE_NEW_INIT) || getFeatureValue_CACHED_MAY_BE_STALE("tengu_slate_harbor_experiment", false);
  }
  var z9m = `Please analyze this codebase and create a CLAUDE.md file, which will be given to future instances of Claude Code to operate in this repository.

What to add:
1. Commands that will be commonly used, such as how to build, lint, and run tests. Include the necessary commands to develop in this codebase, such as how to run a single test.
2. High-level code architecture and structure so that future instances can be productive more quickly. Focus on the "big picture" architecture that requires reading multiple files to understand.

Usage notes:
- If there's already a CLAUDE.md, suggest improvements to it.
- When you make the initial CLAUDE.md, do not repeat yourself and do not include obvious instructions like "Provide helpful error messages to users", "Write unit tests for all new utilities", "Never include sensitive information (API keys, tokens) in code or commits".
- Avoid listing every component or file structure that can be easily discovered.
- Don't include generic development practices.
- If there are Cursor rules (in .cursor/rules/ or .cursorrules) or Copilot rules (in .github/copilot-instructions.md), make sure to include the important parts.
- If there is a README.md, make sure to include the important parts.
- Do not make up information such as "Common Development Tasks", "Tips for Development", "Support and Documentation" unless this is expressly included in other files that you read.
- Be sure to prefix the file with the following text:

\`\`\`
# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.
\`\`\``;
  var K9m = `Set up a minimal CLAUDE.md (and optionally skills and hooks) for this repo. CLAUDE.md is loaded into every Claude Code session, so it must be concise \u2014 only include what Claude would get wrong without it.

## Phase 0: Check for an existing CLAUDE.md

Before asking anything, check if CLAUDE.md already exists at the project root (just \`cat ./CLAUDE.md\` \u2014 only the project-root file counts; don't explore the tree yet). This branches Phase 1.

## Phase 1: Ask what to set up

Use AskUserQuestion to find out what the user wants. Which question you ask depends on Phase 0. Call AskUserQuestion with **only Q1** \u2014 do NOT include Q2 in the same call. Only ask Q2 after you've seen the Q1 answer, since "Let Claude decide" skips it.

Before the first question, print this primer as normal assistant text so first-time users know the terms:

> Quick context:
> - **CLAUDE.md** files give Claude persistent instructions for a project, your personal workflow, or your organization. Claude reads them at the start of every session.
> - **Skills** are packaged instructions Claude invokes automatically when a task matches, or that you trigger with a slash command (e.g. \`/frontend-design\`, \`/commit-push-pr\`).
> - **Hooks** allow you to run shell commands automatically on lifecycle events: get notified when Claude is blocked on your input, auto-format after edits, enforce checks before commits \u2014 these are deterministic and Claude can't skip them.

**If CLAUDE.md already exists**, ask:
- "I found an existing CLAUDE.md. What would you like to do?"
  Options: "Review and improve it" | "Leave it, set up other things" | "Start fresh (replace it)"
  Description for improve: "Explore what's changed in the codebase and propose targeted edits to the existing file."
  Description for leave it: "Skip CLAUDE.md. Go straight to skills and hooks."
  Description for start fresh: "Discard it and write new file(s)."
  Routing:
  - "Review and improve" \u2192 skip Q1/Q2; explore (Phase 2), ask the single Phase 3-lite question, then go to Phase 4's diff-proposal, then Phase 8.
  - "Leave it" \u2192 skip Q1, ask Q2 (rename its fourth option to "Neither \u2014 skip setup"). If they pick "Neither \u2014 skip setup", jump straight to Phase 8 with: "Nothing to set up \u2014 your CLAUDE.md is unchanged." Otherwise: Phase 2 \u2192 Phase 3 proposal (no gap-fill interview) \u2192 Phases 6/7 per queue \u2192 Phase 8. For Phase 7's hook target-file default, treat this path as "project" (\`.claude/settings.json\`).
  - "Start fresh" \u2192 continue to Q1 below as if no file existed.

**If no CLAUDE.md exists** (or the user picked "Start fresh"), ask:
- Q1: "Which CLAUDE.md files should /init set up?"
  Options: "Project CLAUDE.md" | "Personal CLAUDE.local.md" | "Both project + personal" | "Let Claude decide"
  Description for project: "Team-shared instructions checked into source control \u2014 architecture, coding standards, common workflows."
  Description for personal: "Your private preferences for this project (gitignored, not shared) \u2014 your role, sandbox URLs, preferred test data, workflow quirks."
  Description for Let Claude decide: "Fastest path \u2014 project CLAUDE.md plus whatever skills or hooks fit this repo. No follow-on questions; you'll approve everything before it's written."
  If the user picks "Let Claude decide", skip Q2 \u2014 treat it as project CLAUDE.md with no skills/hooks constraint.

- Q2: "Also set up skills and hooks?"
  Options: "Skills + hooks" | "Skills only" | "Hooks only" | "Neither, just CLAUDE.md"
  Description for skills: "Packaged instructions Claude invokes automatically when a task matches, or that you trigger with a slash command (e.g. \`/frontend-design\`, \`/commit-push-pr\`)."
  Description for hooks: "Deterministic shell commands that run on tool events (e.g., format after every edit). Claude can't skip them."
  Q2 is a hint, not a filter \u2014 Phase 3 proposes what fits the codebase and notes any deviation.

## Phase 2: Explore the codebase

Launch a subagent to survey the codebase, and ask it to read key files to understand the project: manifest files (package.json, Cargo.toml, pyproject.toml, go.mod, pom.xml, etc.), README, Makefile/build configs, CI config, existing CLAUDE.md, .claude/rules/, AGENTS.md, .cursor/rules or .cursorrules, .github/copilot-instructions.md, .devin/rules/ or .windsurf/rules/ or .windsurfrules, .clinerules, .mcp.json.

Detect:
- Build, test, and lint commands (especially non-standard ones)
- Languages, frameworks, and package manager
- Project structure (monorepo with workspaces, multi-module, or single project)
- Code style rules that differ from language defaults
- Non-obvious gotchas, required env vars, or workflow quirks
- Existing .claude/skills/ and .claude/rules/ directories
- Formatter configuration (prettier, biome, ruff, black, gofmt, rustfmt, or a unified format script like \`npm run format\` / \`make fmt\`)
- Git worktree usage: run \`git worktree list\` to check if this repo has multiple worktrees (only relevant if the user wants a personal CLAUDE.local.md)

Note what you could NOT figure out from code alone \u2014 these become interview questions.

## Phase 3: Fill in the gaps

Use AskUserQuestion to gather what you still need to write good CLAUDE.md files and skills. Ask only things the code can't answer.

If the user chose project CLAUDE.md, both, or "Let Claude decide": ask about codebase practices \u2014 non-obvious commands, gotchas, branch/PR conventions, required env setup, testing quirks. Skip things already in README or obvious from manifest files. Do not mark any options as "recommended" \u2014 this is about how their team works, not best practices.

If the user chose personal CLAUDE.local.md or both: ask about them, not the codebase. Do not mark any options as "recommended" \u2014 this is about their personal preferences, not best practices. Examples of questions:
  - What's their role on the team? (e.g., "backend engineer", "data scientist", "new hire onboarding")
  - How familiar are they with this codebase and its languages/frameworks? (so Claude can calibrate explanation depth)
  - Do they have personal sandbox URLs, test accounts, API key paths, or local setup details Claude should know?
  - Only if Phase 2 found multiple git worktrees: ask whether their worktrees are nested inside the main repo (e.g., \`.claude/worktrees/<name>/\`) or siblings/external (e.g., \`../myrepo-feature/\`). If nested, the upward file walk finds the main repo's CLAUDE.local.md automatically \u2014 no special handling needed. If sibling/external, the personal content should live in a home-directory file (e.g., \`~/.claude/<project-name>-instructions.md\`) and each worktree gets a one-line CLAUDE.local.md stub that imports it: \`@~/.claude/<project-name>-instructions.md\`. Never put this import in the project CLAUDE.md \u2014 that would check a personal reference into the team-shared file.
  - Any communication preferences? (e.g., "be terse", "always explain tradeoffs", "don't summarize at the end")

If the user picked "Review and improve" in Phase 0: ask just one question \u2014 "Has anything changed about how the team works since this CLAUDE.md was written (new conventions, commands, gotchas)?" with options "No, nothing's changed" | "Yes \u2014 let me describe". If they pick Yes, ask what changed (free text) before continuing. Then skip to Phase 4.

**Synthesize a proposal from Phase 2 findings and the gap-fill answers.** For each item, pick the artifact type that fits the evidence:

  - **Hook** \u2014 deterministic, fast, per-edit shell command (formatting, linting a changed file).
  - **Skill** \u2014 on-demand multi-step workflow (\`/verify\`, \`/deploy-staging\`, session reports).
  - **CLAUDE.md note** \u2014 guidance that shapes behavior but isn't enforced (conventions, communication style).

Include the CLAUDE.md file(s) implied by Q1 (project, personal, both, or "Let Claude decide" \u2192 project) as the first bullet(s) of the proposal, with a one-line summary of what each will cover. Then list skills/hooks/notes. On the "Leave it" path, omit CLAUDE.md file bullets and notes (Phase 4 won't run). On the "Start fresh" path with Q1 = personal-only, add a bullet noting the existing project CLAUDE.md will be left untouched (they chose not to replace it with a project file).

Propose what fits. If the user gave a Q2 hint and your proposal deviates from it (e.g. they said "Hooks only" but nothing hook-shaped exists), say so in one line at the top of the proposal and propose the better-fitting artifacts anyway.

**Print the proposal as normal assistant text**, one bullet per item:

> Here's what I'd set up:
> \u2022 **[Artifact type: file/hook/skill/note]** \u2014 [one-line description]
> \u2022 \u2026

Then call AskUserQuestion with a simple question ("Does this look right?") and options like "Looks good \u2014 proceed" | "Drop the hook" | "Drop the skill". Don't use the \`preview\` field \u2014 the proposal is already visible in scrollback. The tool auto-adds an "Other" option for custom tweaks.

**Build the preference queue** from the accepted proposal. Each entry: {type: hook|skill|note, description, target file, any Phase-2-sourced details like the actual test/format command}. Phase 6 and Phase 7's hooks sub-bullet consume this queue; Phases 4/5 gate on the approved proposal's file bullets directly; Phase 7's GitHub-CLI and linting checks run regardless of queue contents.

## Phase 4: Write CLAUDE.md (if the approved proposal includes it, or on the "Review and improve" path)

Write a minimal CLAUDE.md at the project root. Every line must pass this test: "Would removing this cause Claude to make mistakes?" If no, cut it.

If the user picked "Review and improve it" in Phase 0: don't write fresh \u2014 read the existing file, compare against Phase 2 findings and the Phase 3-lite answer, and propose specific additions/removals as diffs with a one-line reason for each. The existing file is the baseline; your job is to catch what's missing, outdated, or bloated. After printing the diffs, call AskUserQuestion ("Apply these edits?" with options like "Apply all" | "Let me pick which" | "Skip \u2014 leave it as is") before writing anything.

**Consume \`note\` entries from the Phase 3 preference queue whose target is CLAUDE.md** (team-level notes) \u2014 add each as a concise line in the most relevant section. These are the behaviors the user wants Claude to follow but didn't need guaranteed (e.g., "propose a plan before implementing", "explain the tradeoffs when refactoring"). Leave personal-targeted notes for Phase 5.

Include:
- Build/test/lint commands Claude can't guess (non-standard scripts, flags, or sequences)
- Code style rules that DIFFER from language defaults (e.g., "prefer type over interface")
- Testing instructions and quirks (e.g., "run single test with: pytest -k 'test_name'")
- Repo etiquette (branch naming, PR conventions, commit style)
- Required env vars or setup steps
- Non-obvious gotchas or architectural decisions
- Important parts from existing AI coding tool configs if they exist (AGENTS.md, .cursor/rules, .cursorrules, .github/copilot-instructions.md, .devin/rules/, .windsurf/rules/, .windsurfrules, .clinerules)

Exclude:
- File-by-file structure or component lists (Claude can discover these by reading the codebase)
- Standard language conventions Claude already knows
- Generic advice ("write clean code", "handle errors")
- Detailed API docs or long references \u2014 use \`@path/to/import\` syntax instead (e.g., \`@docs/api-reference.md\`) to inline content on demand without bloating CLAUDE.md
- Information that changes frequently \u2014 reference the source with \`@path/to/import\` so Claude always reads the current version
- Long tutorials or walkthroughs (move to a separate file and reference with \`@path/to/import\`, or put in a skill)
- Commands obvious from manifest files (e.g., standard "npm test", "cargo test", "pytest")

Be specific: "Use 2-space indentation in TypeScript" is better than "Format code properly."

Do not repeat yourself and do not make up sections like "Common Development Tasks" or "Tips for Development" \u2014 only include information expressly found in files you read.

Prefix the file with:

\`\`\`
# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.
\`\`\`

For projects with multiple concerns, suggest organizing instructions into \`.claude/rules/\` as separate focused files (e.g., \`code-style.md\`, \`testing.md\`, \`security.md\`). These are loaded automatically alongside CLAUDE.md and can be scoped to specific file paths using \`paths\` frontmatter.

For projects with distinct subdirectories (monorepos, multi-module projects, etc.): mention that subdirectory CLAUDE.md files can be added for module-specific instructions (they're loaded automatically when Claude works in those directories). Offer to create them if the user wants.

## Phase 5: Write CLAUDE.local.md (if the approved proposal includes it)

Write a minimal CLAUDE.local.md at the project root. This file is automatically loaded alongside CLAUDE.md. After creating it, add \`CLAUDE.local.md\` to the project's .gitignore so it stays private.

**Consume \`note\` entries from the Phase 3 preference queue whose target is CLAUDE.local.md** (personal-level notes) \u2014 add each as a concise line. If the user chose personal-only in Phase 1, this is the sole consumer of note entries.

Include:
- The user's role and familiarity with the codebase (so Claude can calibrate explanations)
- Personal sandbox URLs, test accounts, or local setup details
- Personal workflow or communication preferences

Keep it short \u2014 only include what would make Claude's responses noticeably better for this user.

If Phase 2 found multiple git worktrees and the user confirmed they use sibling/external worktrees (not nested inside the main repo): the upward file walk won't find a single CLAUDE.local.md from all worktrees. Write the actual personal content to \`~/.claude/<project-name>-instructions.md\` and make CLAUDE.local.md a one-line stub that imports it: \`@~/.claude/<project-name>-instructions.md\`. The user can copy this one-line stub to each sibling worktree. Never put this import in the project CLAUDE.md. If worktrees are nested inside the main repo (e.g., \`.claude/worktrees/\`), no special handling is needed \u2014 the main repo's CLAUDE.local.md is found automatically.

If CLAUDE.local.md already exists: read it, propose specific additions, and do not silently overwrite.

## Phase 6: Suggest and create skills (if the approved proposal includes any)

Skills add capabilities Claude can use on demand without bloating every session.

**First, consume \`skill\` entries from the Phase 3 preference queue.** Each queued skill preference becomes a SKILL.md tailored to what the user described. For each:
- Name it from the preference (e.g., "verify-deep", "session-report", "deploy-sandbox")
- Write the body using the user's own words from the interview plus whatever Phase 2 found (test commands, report format, deploy target). If the preference maps to an existing bundled skill (e.g., \`/verify\`), write a project skill that adds the user's specific constraints on top \u2014 tell the user the bundled one still exists and theirs is additive.
- Ask a quick follow-up if the preference is underspecified (e.g., "which test command should verify-deep run?")

**Then suggest additional skills** beyond the queue when you find:
- Reference knowledge for specific tasks (conventions, patterns, style guides for a subsystem)
- Repeatable workflows the user would want to trigger directly (deploy, fix an issue, release process, verify changes)

For each suggested skill, provide: name, one-line purpose, and why it fits this repo.

If \`.claude/skills/\` already exists with skills, review them first. Do not overwrite existing skills \u2014 only propose new ones that complement what is already there.

Create each skill at \`.claude/skills/<skill-name>/SKILL.md\`:

\`\`\`yaml
---
name: <skill-name>
description: <what the skill does and when to use it>
---

<Instructions for Claude>
\`\`\`

Both the user (\`/<skill-name>\`) and Claude can invoke skills by default. For workflows with side effects (e.g., \`/deploy\`, \`/fix-issue 123\`), add \`disable-model-invocation: true\` so only the user can trigger it, and use \`$ARGUMENTS\` to accept input.

## Phase 7: Suggest additional optimizations

Tell the user you're going to suggest a few additional optimizations now that CLAUDE.md and skills (if chosen) are in place.

Check the environment and ask about each gap you find (use AskUserQuestion):

- **GitHub CLI**: Run \`which gh\` (or \`where gh\` on Windows). If it's missing AND the project uses GitHub (check \`git remote -v\` for github.com), ask the user if they want to install it. Explain that the GitHub CLI lets Claude help with commits, pull requests, issues, and code review directly.

- **Linting**: If Phase 2 found no lint config (no .eslintrc, ruff.toml, .golangci.yml, etc. for the project's language), ask the user if they want Claude to set up linting for this codebase. Explain that linting catches issues early and gives Claude fast feedback on its own edits.

- **Proposal-sourced hooks** (if the approved proposal includes any): Consume \`hook\` entries from the Phase 3 preference queue. If Phase 2 found a formatter and the queue has no formatting hook, offer format-on-edit as a fallback.

  For each hook preference (from the queue or the formatter fallback):

  1. Target file: default based on the Phase 1 CLAUDE.md choice \u2014 project \u2192 \`.claude/settings.json\` (team-shared, committed); personal \u2192 \`.claude/settings.local.json\`. Only ask if the user chose "both" in Phase 1 or the preference is ambiguous. Ask once for all hooks, not per-hook.

  2. Pick the event and matcher from the preference:
     - "after every edit" \u2192 \`PostToolUse\` with matcher \`Write|Edit\`
     - "when Claude finishes" / "before I review" \u2192 \`Stop\` event (fires at the end of every turn \u2014 including read-only ones)
     - "before running bash" \u2192 \`PreToolUse\` with matcher \`Bash\`
     - "before committing" (literal git-commit gate) \u2192 **not a hooks.json hook.** Matchers can't filter Bash by command content, so there's no way to target only \`git commit\`. Route this to a git pre-commit hook (\`.git/hooks/pre-commit\`, husky, pre-commit framework) instead \u2014 offer to write one. If the user actually means "before I review and commit Claude's output", that's \`Stop\` \u2014 probe to disambiguate.
     Probe if the preference is ambiguous.

  3. **Load the hook reference** (once per \`/init\` run, before the first hook): invoke the Skill tool with \`skill: 'update-config'\` and args starting with \`[hooks-only]\` followed by a one-line summary of what you're building \u2014 e.g., \`[hooks-only] Constructing a PostToolUse/Write|Edit format hook for .claude/settings.json using ruff\`. This loads the hooks schema and verification flow into context. Subsequent hooks reuse it \u2014 don't re-invoke.

  4. Follow the skill's **"Constructing a Hook"** flow: dedup check \u2192 construct for THIS project \u2192 pipe-test raw \u2192 wrap \u2192 write JSON \u2192 \`jq -e\` validate \u2192 live-proof (for \`Pre|PostToolUse\` on triggerable matchers) \u2192 cleanup \u2192 handoff. Target file and event/matcher come from steps 1\u20132 above.

Act on each "yes" before moving on.

## Phase 8: Summary and next steps

Recap what was set up \u2014 which files were written and the key points included in each. Remind the user these files are a starting point: they should review and tweak them, and can run \`/init\` again anytime to re-scan.

Then tell the user that you'll be introducing a few more suggestions for optimizing their codebase and Claude Code setup based on what you found. Present these as a single, well-formatted to-do list where every item is relevant to this repo. Put the most impactful items first.

When building the list, work through these checks and include only what applies:
- If frontend code was detected (React, Vue, Svelte, etc.): \`/plugin install frontend-design@claude-plugins-official\` gives Claude design principles and component patterns so it produces polished UI; \`/plugin install playwright@claude-plugins-official\` lets Claude launch a real browser, screenshot what it built, and fix visual bugs itself.
- If you found gaps in Phase 7 (missing GitHub CLI, missing linting) and the user said no: list them here with a one-line reason why each helps.
- If tests are missing or sparse: suggest setting up a test framework so Claude can verify its own changes.
- To help you create skills and optimize existing skills using evals, Claude Code has an official skill-creator plugin you can install. Install it with \`/plugin install skill-creator@claude-plugins-official\`, then run \`/skill-creator <skill-name>\` to create new skills or refine any existing skill. (Always include this one.)
- Browse official plugins with \`/plugin\` \u2014 these bundle skills, agents, hooks, and MCP servers that you may find helpful. You can also create your own custom plugins to share them with others. (Always include this one.)`;
  var Y9m;
  function J9m(e) {
    let t = new Set(ijt.map(n => eGe(n.key)));
    return e.map(n => {
      let r = {};
      for (let [o, s] of Object.entries(n.bindings)) {
        if (!t.vZc(eGe(o))) {
          r[o] = s;
        }
      }
      return {
        context: n.context,
        bindings: r
      };
    }).filter(n => Object.keys(n.bindings).length > 0);
  }
  function w9l() {
    let t = {
      $schema: "https://www.schemastore.org/claude-code-keybindings.json",
      $docs: "https://code.claude.com/docs/en/keybindings",
      bindings: J9m(Mct)
    };
    return De(t, null, 2) + `
`;
  }
  var C9l = __lazy(() => {
    A1n();
    P1n();
  });
  var k9l = {};
  __export(k9l, {
    call: () => call_export31
  });
  async function call_export31() {
    if (!oV()) {
      return {
        type: "text",
        value: "Keybinding customization is disabled in this environment."
      };
    }
    let e = pSe();
    let t = false;
    await Ys().mkdir(x9l.dirname(e));
    try {
      await R9l.writeFile(e, w9l(), {
        encoding: "utf-8",
        flag: "wx"
      });
    } catch (o) {
      if (en(o) === "EEXIST") {
        t = true;
      } else {
        throw o;
      }
    }
    let n = await jwe(e);
    if (n.error) {
      return {
        type: "text",
        value: `${t ? "Opened" : "Created"} ${e}. ${n.error}`
      };
    }
    let r = Ql() ? ` (Safe mode: custom keybindings are disabled this session \u2014 changes take effect after you ${UR()}.)` : "";
    return {
      type: "text",
      value: t ? `Opened ${e} in your editor.${r}` : `Created ${e} with template. Opened in your editor.${r}`
    };
  }
  var R9l;
  var x9l;
  var A9l = __lazy(() => {
    xre();
    C9l();
    _b();
    gn();
    dt();
    Lfe();
    R9l = require("fs/promises");
    x9l = require("path");
  });
  var Q9m;
  var O9l = {};
  __export(O9l, {
    call: () => call_export32
  });
  var call_export32 = async e => {
    let t = e.trim().split(/\s+/).filter(Boolean)[0];
    let n = "your Claude Design projects";
    if (t === "consent") {
      try {
        await BJt("agent_design_projects");
        return {
          type: "text",
          value: "Design agent access granted for your Claude Design projects. Use /design revoke to undo."
        };
      } catch (r) {
        return {
          type: "text",
          value: `Couldn't record Design agent access for ${"your Claude Design projects"} \u2014 ${he(r)}. Try again, or check your claude.ai login with /login.`
        };
      }
    }
    if (t === "revoke") {
      try {
        await wMl("agent_design_projects");
        return {
          type: "text",
          value: "Design agent access revoked for your Claude Design projects."
        };
      } catch (r) {
        return {
          type: "text",
          value: `Couldn't revoke Design agent access for ${"your Claude Design projects"} \u2014 ${he(r)}. Try again, or check your claude.ai login with /login.`
        };
      }
    }
    return {
      type: "text",
      value: "Usage: /design consent | /design revoke"
    };
  };
  var D9l = __lazy(() => {
    NUo();
    dt();
  });
  var t5m;
  var B9l = {};
  __export(B9l, {
    call: () => call_export33,
    DesignLogin: () => DesignLogin
  });
  function DesignLogin({
    onDone: e
  }) {
    let [t, n] = hL.useState({
      state: "starting"
    });
    let [r] = hL.useState(() => new Rz());
    let [o, s] = hL.useState("");
    let [i, a] = hL.useState(0);
    let [l, c] = hL.useState(false);
    let [u, d] = hL.useState(false);
    let p = useClock();
    let m = hL.useRef(new Set());
    let f = hL.useRef(undefined);
    let h = hL.useRef(false);
    let g = Sr();
    let y = Math.max(50, g.columns - ("Paste code here if prompted > ").length - 4);
    function _(C) {
      if (t.state === "success") {
        C.preventDefault();
        e("Design-system access authorized.");
        return;
      }
      if (t.state !== "error") {
        if (C.key === "escape" || (C.ctrl || C.meta) && (C.key === "c" || C.key === "d")) {
          C.preventDefault();
          h.current = true;
          e("Design login cancelled.");
        }
        return;
      }
      if (C.preventDefault(), C.key === "return" && t.toRetry) {
        s("");
        a(0);
        n({
          state: "about_to_retry",
          nextState: t.toRetry
        });
      } else {
        h.current = true;
        e("Design login cancelled.");
      }
    }
    function b(C, x) {
      let [A, k] = C.split("#");
      if (!A || !k) {
        n({
          state: "error",
          message: "Invalid code. Please make sure the full code was copied",
          toRetry: {
            state: "waiting_for_login",
            url: x
          }
        });
        logForDebugging(`Design login: invalid pasted code for ${x}`);
        return;
      }
      logEvent("tengu_design_oauth_manual_entry", {});
      r.handleManualAuthCodeInput({
        authorizationCode: A,
        state: k
      });
    }
    let S = hL.useCallback(async () => {
      if (m.current.forEach(C => C()), m.current.clear(), !MJt()) {
        n({
          state: "error",
          message: "The Claude Design OAuth client is not configured in this build. Set CLAUDE_CODE_DESIGN_OAUTH_CLIENT_ID to the registered client id, or update to a build with the registered client."
        });
        return;
      }
      try {
        let C = getOauthConfig();
        let x = Snr();
        let A = await r.startOAuthFlow(async O => {
          n({
            state: "waiting_for_login",
            url: O
          });
          m.current.add(p.setTimeout(() => c(true), 3000));
        }, {
          loginWithClaudeAi: true,
          oauthClient: {
            clientId: x,
            scopes: DESIGN_OAUTH_SCOPES
          },
          skipProfileFetch: true,
          successRedirectUrl: C.CLAUDEAI_SUCCESS_URL
        });
        if (h.current) {
          if (A.refreshToken) {
            await revokeOAuthToken(A.refreshToken, x);
          }
          return;
        }
        n({
          state: "processing"
        });
        let k = await kUo(A, x);
        if (!k.ok) {
          n({
            state: "error",
            message: k.message,
            toRetry: {
              state: "starting"
            }
          });
          return;
        }
        if (h.current) {
          await revokeOAuthToken(k.slot.refreshToken, k.slot.clientId);
          return;
        }
        let I = await bnr(k.slot);
        if (!I.success) {
          await revokeOAuthToken(k.slot.refreshToken, k.slot.clientId);
          n({
            state: "error",
            message: I.warning ?? "Could not save the design credential to secure storage.",
            toRetry: {
              state: "starting"
            }
          });
          return;
        }
        logEvent("tengu_design_oauth_login_success", {});
        n({
          state: "success"
        });
        m.current.add(p.setTimeout(() => e("Design-system access authorized."), 1500));
      } catch (C) {
        Oe(C);
        logEvent("tengu_design_oauth_login_error", {});
        n({
          state: "error",
          message: he(C),
          toRetry: {
            state: "starting"
          }
        });
      }
    }, [p, r, e]);
    hL.useEffect(() => {
      if (t.state === "starting") {
        S();
      }
    }, [t.state, S]);
    useTimeout(() => {
      if (t.state === "about_to_retry") {
        c(t.nextState.state === "waiting_for_login");
        n(t.nextState);
      }
    }, t.state === "about_to_retry" ? 500 : null);
    hL.useEffect(() => {
      if (o === "c" && t.state === "waiting_for_login" && l && !u) {
        Uk(t.url).then(C => {
          if (C) {
            process.stdout.write(C);
          }
          d(true);
          f.current?.();
          f.current = p.setTimeout(() => d(false), 2000);
        });
        s("");
      }
    }, [p, o, t, l, u]);
    hL.useEffect(() => {
      let C = m.current;
      return () => {
        r.cleanup();
        C.forEach(x => x());
        C.clear();
        f.current?.();
      };
    }, [r]);
    let [E] = hL.useState(() => hEt() != null);
    return DS.jsxs(gXd, {
      flexDirection: "column",
      gap: 1,
      tabIndex: 0,
      autoFocus: true,
      onKeyDown: _,
      children: [t.state !== "success" && DS.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        paddingBottom: 1,
        children: [DS.jsx(Text, {
          bold: true,
          children: "Design login"
        }), DS.jsx(Text, {
          dimColor: true,
          children: "Authorize design-system access (read and write your organization's claude.ai/design projects) with your claude.ai account. This is separate from this session's authentication and changes nothing else."
        }), E && DS.jsx(Text, {
          dimColor: true,
          children: "A design credential is already stored \u2014 completing this flow replaces it."
        })]
      }), t.state === "waiting_for_login" && l && DS.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        paddingBottom: 1,
        children: [DS.jsxs(gXd, {
          paddingX: 1,
          children: [DS.jsxs(Text, {
            dimColor: true,
            children: ["Browser didn't open? Use the url below to sign in", " "]
          }), u ? DS.jsx(Text, {
            color: "success",
            children: "(Copied!)"
          }) : DS.jsx(Text, {
            dimColor: true,
            children: DS.jsx(xt, {
              chord: "c",
              action: "copy",
              parens: true
            })
          })]
        }), DS.jsx(Link, {
          url: t.url,
          children: DS.jsx(Text, {
            dimColor: true,
            children: t.url
          })
        })]
      }), DS.jsx(gXd, {
        paddingLeft: 1,
        flexDirection: "column",
        gap: 1,
        children: DS.jsx(n5m, {
          oauthStatus: t,
          showPastePrompt: l,
          pastedCode: o,
          setPastedCode: s,
          cursorOffset: i,
          setCursorOffset: a,
          textInputColumns: y,
          onSubmitCode: b
        })
      })]
    });
  }
  function n5m(e) {
    let t = L9l.c(23);
    let {
      oauthStatus: n,
      showPastePrompt: r,
      pastedCode: o,
      setPastedCode: s,
      cursorOffset: i,
      setCursorOffset: a,
      textInputColumns: l,
      onSubmitCode: c
    } = e;
    switch (n.state) {
      case "starting":
        {
          let u;
          if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
            u = DS.jsx(Xc, {
              message: "Starting design login\u2026"
            });
            t[0] = u;
          } else {
            u = t[0];
          }
          return u;
        }
      case "waiting_for_login":
        {
          let u;
          if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
            u = DS.jsx(Xc, {
              message: "Waiting for browser authorization\u2026"
            });
            t[1] = u;
          } else {
            u = t[1];
          }
          let d;
          if (t[2] !== i || t[3] !== n.url || t[4] !== c || t[5] !== o || t[6] !== a || t[7] !== s || t[8] !== r || t[9] !== l) {
            d = r && DS.jsxs(gXd, {
              children: [DS.jsx(Text, {
                children: "Paste code here if prompted > "
              }), DS.jsx(Dl, {
                value: o,
                onChange: s,
                onSubmit: m => c(m, n.url),
                cursorOffset: i,
                onChangeCursorOffset: a,
                columns: l
              })]
            });
            t[2] = i;
            t[3] = n.url;
            t[4] = c;
            t[5] = o;
            t[6] = a;
            t[7] = s;
            t[8] = r;
            t[9] = l;
            t[10] = d;
          } else {
            d = t[10];
          }
          let p;
          if (t[11] !== d) {
            p = DS.jsxs(gXd, {
              flexDirection: "column",
              gap: 1,
              children: [u, d]
            });
            t[11] = d;
            t[12] = p;
          } else {
            p = t[12];
          }
          return p;
        }
      case "processing":
        {
          let u;
          if (t[13] === Symbol.for("react.memo_cache_sentinel")) {
            u = DS.jsx(Xc, {
              message: "Saving design credential\u2026"
            });
            t[13] = u;
          } else {
            u = t[13];
          }
          return u;
        }
      case "success":
        {
          let u;
          if (t[14] === Symbol.for("react.memo_cache_sentinel")) {
            u = DS.jsx(Text, {
              color: "success",
              children: "Design-system access authorized. /design-sync can now reach your claude.ai/design projects."
            });
            t[14] = u;
          } else {
            u = t[14];
          }
          return u;
        }
      case "error":
        {
          let u;
          if (t[15] !== n.message) {
            u = DS.jsx(Text, {
              color: "error",
              children: n.message
            });
            t[15] = n.message;
            t[16] = u;
          } else {
            u = t[16];
          }
          let d = n.toRetry ? "Press Enter to retry, or any other key to cancel." : "Press any key to close.";
          let p;
          if (t[17] !== d) {
            p = DS.jsx(Text, {
              dimColor: true,
              children: d
            });
            t[17] = d;
            t[18] = p;
          } else {
            p = t[18];
          }
          let m;
          if (t[19] !== u || t[20] !== p) {
            m = DS.jsxs(gXd, {
              flexDirection: "column",
              gap: 1,
              children: [u, p]
            });
            t[19] = u;
            t[20] = p;
            t[21] = m;
          } else {
            m = t[21];
          }
          return m;
        }
      case "about_to_retry":
        {
          let u;
          if (t[22] === Symbol.for("react.memo_cache_sentinel")) {
            u = DS.jsx(Text, {
              color: "permission",
              children: "Retrying\u2026"
            });
            t[22] = u;
          } else {
            u = t[22];
          }
          return u;
        }
    }
  }
  async function call_export33(e) {
    return DS.jsx(DesignLogin, {
      onDone: t => e(t)
    });
  }
  var L9l;
  var hL;
  var DS;
  var $9l = __lazy(() => {
    bs();
    Pv();
    q_();
    Uc();
    ki();
    Tg();
    et();
    Ot();
    qP();
    GVe();
    Tnr();
    je();
    dt();
    Rn();
    L9l = __toESM(pt(), 1);
    hL = __toESM(ot(), 1);
    DS = __toESM(ie(), 1);
  });
  var H9l = () => ({
    type: "local-jsx",
    name: "design-login",
    description: "Authorize design-system access for /design-sync with your claude.ai account",
    isEnabled: () => pFe(),
    load: () => Promise.resolve().then(() => ($9l(), B9l))
  });
  var j9l = __lazy(() => {
    NJt();
  });
  var q9l = () => ({
    type: "local-jsx",
    name: "login",
    get description() {
      return hasAnthropicApiKeyAuth() ? "Switch Anthropic accounts" : "Sign in with your Anthropic account";
    },
    isEnabled: () => !Me.DISABLE_LOGIN_COMMAND,
    fleetHostCall: async ({
      login: e
    }) => e(),
    load: () => Promise.resolve().then(() => (LSt(), oMo))
  });
  var W9l = __lazy(() => {
    no();
    pr();
  });
  var G9l;
  var V9l = __lazy(() => {
    pr();
    G9l = {
      type: "local-jsx",
      name: "logout",
      description: "Sign out from your Anthropic account",
      isEnabled: () => !Me.DISABLE_LOGOUT_COMMAND,
      fleetHostCall: async e => {
        let {
          fleetHostLogout: t
        } = await Promise.resolve().then(() => (eYn(), A0o));
        return t(e);
      },
      load: () => Promise.resolve().then(() => (eYn(), A0o))
    };
  });
  function Y9l(e) {
    let t = z9l.c(14);
    let {
      onSubmit: n,
      defaultSelections: r
    } = e;
    let [o, s] = K9l.useState(false);
    let i;
    if (t[0] !== n) {
      i = y => {
        if (y.length === 0) {
          s(true);
          return;
        }
        s(false);
        n(y);
      };
      t[0] = n;
      t[1] = i;
    } else {
      i = t[1];
    }
    let a = i;
    let l;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      l = () => {
        s(false);
      };
      t[2] = l;
    } else {
      l = t[2];
    }
    let c = l;
    let u;
    if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
      u = () => {
        s(true);
      };
      t[3] = u;
    } else {
      u = t[3];
    }
    let d = u;
    let p;
    if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
      p = C5.jsx(gXd, {
        children: C5.jsxs(Text, {
          dimColor: true,
          children: ["More workflow examples (issue triage, CI fixes, etc.) at:", " ", C5.jsx(Link, {
            url: "https://github.com/anthropics/claude-code-action/blob/main/examples/",
            children: "https://github.com/anthropics/claude-code-action/blob/main/examples/"
          })]
        })
      });
      t[4] = p;
    } else {
      p = t[4];
    }
    let m;
    if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
      m = o5m.map(i5m);
      t[5] = m;
    } else {
      m = t[5];
    }
    let f;
    if (t[6] !== r || t[7] !== a) {
      f = C5.jsx(eUe, {
        options: m,
        defaultValue: r,
        onSubmit: a,
        onChange: c,
        onCancel: d,
        hideIndexes: true
      });
      t[6] = r;
      t[7] = a;
      t[8] = f;
    } else {
      f = t[8];
    }
    let h;
    if (t[9] !== o) {
      h = o && C5.jsx(gXd, {
        children: C5.jsx(Text, {
          color: "error",
          children: "You must select at least one workflow to continue"
        })
      });
      t[9] = o;
      t[10] = h;
    } else {
      h = t[10];
    }
    let g;
    if (t[11] !== f || t[12] !== h) {
      g = C5.jsxs(or, {
        title: "Select GitHub workflows to install",
        subtitle: "We'll create a workflow file in your repository for each one you select.",
        onCancel: d,
        inputGuide: s5m,
        children: [p, f, h]
      });
      t[11] = f;
      t[12] = h;
      t[13] = g;
    } else {
      g = t[13];
    }
    return g;
  }
  function i5m(e) {
    return {
      label: e.label,
      value: e.value
    };
  }
  var z9l;
  var K9l;
  var C5;
  var o5m;
  var s5m;
  var J9l = __lazy(() => {
    et();
    Sd();
    MQt();
    Ai();
    Ii();
    bs();
    z9l = __toESM(pt(), 1);
    K9l = __toESM(ot(), 1);
    C5 = __toESM(ie(), 1);
    o5m = [{
      value: "claude",
      label: "@Claude Code - Tag @claude in issues and PR comments"
    }, {
      value: "claude-review",
      label: "Claude Code Review - Automated code review on new PRs"
    }];
    s5m = C5.jsxs(Hn, {
      children: [C5.jsx(xt, {
        chord: ["up", "down"],
        action: "navigate"
      }), C5.jsx(xt, {
        chord: "space",
        action: "toggle"
      }), C5.jsx(xt, {
        chord: "enter",
        action: "confirm"
      }), C5.jsx(Wr, {
        action: "confirm:no",
        context: "Confirmation",
        fallback: "Esc",
        description: "cancel"
      })]
    });
  });
  var Q9l = `name: Claude Code

on:
  issue_comment:
    types: [created]
  pull_request_review_comment:
    types: [created]
  issues:
    types: [opened, assigned]
  pull_request_review:
    types: [submitted]

jobs:
  claude:
    if: |
      (github.event_name == 'issue_comment' && contains(github.event.comment.body, '@claude')) ||
      (github.event_name == 'pull_request_review_comment' && contains(github.event.comment.body, '@claude')) ||
      (github.event_name == 'pull_request_review' && contains(github.event.review.body, '@claude')) ||
      (github.event_name == 'issues' && (contains(github.event.issue.body, '@claude') || contains(github.event.issue.title, '@claude')))
    runs-on: ubuntu-latest
    permissions:
      contents: read
      pull-requests: read
      issues: read
      id-token: write
      actions: read # Required for Claude to read CI results on PRs
    steps:
      - name: Checkout repository
        uses: actions/checkout@v4
        with:
          fetch-depth: 1

      - name: Run Claude Code
        id: claude
        uses: anthropics/claude-code-action@v1
        with:
          anthropic_api_key: \${{ secrets.ANTHROPIC_API_KEY }}

          # This is an optional setting that allows Claude to read CI results on PRs
          additional_permissions: |
            actions: read

          # Optional: Give a custom prompt to Claude. If this is not specified, Claude will perform the instructions specified in the comment that tagged it.
          # prompt: 'Update the pull request description to include a summary of changes.'

          # Optional: Add claude_args to customize behavior and configuration
          # See https://github.com/anthropics/claude-code-action/blob/main/docs/usage.md
          # or https://code.claude.com/docs/en/cli-reference for available options
          # claude_args: '--allowed-tools Bash(gh pr *)'

`;
  var Z9l = `## \uD83E\uDD16 Installing Claude Code GitHub App

This PR adds a GitHub Actions workflow that enables Claude Code integration in our repository.

### What is Claude Code?

[Claude Code](https://claude.com/claude-code) is an AI coding agent that can help with:
- Bug fixes and improvements  
- Documentation updates
- Implementing new features
- Code reviews and suggestions
- Writing tests
- And more!

### How it works

Once this PR is merged, we'll be able to interact with Claude by mentioning @claude in a pull request or issue comment.
Once the workflow is triggered, Claude will analyze the comment and surrounding context, and execute on the request in a GitHub action.

### Important Notes

- **This workflow won't take effect until this PR is merged**
- **@claude mentions won't work until after the merge is complete**
- The workflow runs automatically whenever Claude is mentioned in PR or issue comments
- Claude gets access to the entire PR or issue context including files, diffs, and previous comments

### Security

- Our Anthropic API key is securely stored as a GitHub Actions secret
- Only users with write access to the repository can trigger the workflow
- All Claude runs are stored in the GitHub Actions run history
- Claude's default tools are limited to reading/writing files and interacting with our repo by creating comments, branches, and commits.
- We can add more allowed tools by adding them to the workflow file like:

\`\`\`
allowed_tools: Bash(npm install),Bash(npm run build),Bash(npm run lint),Bash(npm run test)
\`\`\`

There's more information in the [Claude Code action repo](https://github.com/anthropics/claude-code-action).

After merging this PR, let's try mentioning @claude in a comment on any PR to get started!`;
  var e5l = `name: Claude Code Review

on:
  pull_request:
    types: [opened, synchronize, ready_for_review, reopened]
    # Optional: Only run on specific file changes
    # paths:
    #   - "src/**/*.ts"
    #   - "src/**/*.tsx"
    #   - "src/**/*.js"
    #   - "src/**/*.jsx"

jobs:
  claude-review:
    # Optional: Filter by PR author
    # if: |
    #   github.event.pull_request.user.login == 'external-contributor' ||
    #   github.event.pull_request.user.login == 'new-developer' ||
    #   github.event.pull_request.author_association == 'FIRST_TIME_CONTRIBUTOR'

    runs-on: ubuntu-latest
    permissions:
      contents: read
      pull-requests: read
      issues: read
      id-token: write

    steps:
      - name: Checkout repository
        uses: actions/checkout@v4
        with:
          fetch-depth: 1

      - name: Run Claude Code Review
        id: claude-review
        uses: anthropics/claude-code-action@v1
        with:
          anthropic_api_key: \${{ secrets.ANTHROPIC_API_KEY }}
          plugin_marketplaces: 'https://github.com/anthropics/claude-code.git'
          plugins: 'code-review@claude-code-plugins'
          prompt: '/code-review:code-review \${{ github.repository }}/pull/\${{ github.event.pull_request.number }}'
          # See https://github.com/anthropics/claude-code-action/blob/main/docs/usage.md
          # or https://code.claude.com/docs/en/cli-reference for available options

`;
  function r5l(e) {
    let t = t5l.c(55);
    let {
      existingApiKey: n,
      apiKeyOrOAuthToken: r,
      onApiKeyChange: o,
      onSubmit: s,
      onToggleUseExistingKey: i,
      onCreateOAuthToken: a,
      selectedOption: l,
      onSelectOption: c
    } = e;
    let u = l === undefined ? n ? "existing" : a ? "oauth" : "new" : l;
    let [d, p] = n5l.useState(0);
    let m = Sr();
    let [f] = useTheme();
    let h;
    if (t[0] !== n || t[1] !== a || t[2] !== c || t[3] !== i || t[4] !== u) {
      h = () => {
        if (u === "new" && a) {
          c("oauth");
        } else if (u === "oauth" && n) {
          c("existing");
          i(true);
        }
      };
      t[0] = n;
      t[1] = a;
      t[2] = c;
      t[3] = i;
      t[4] = u;
      t[5] = h;
    } else {
      h = t[5];
    }
    let g = h;
    let y;
    if (t[6] !== a || t[7] !== c || t[8] !== i || t[9] !== u) {
      y = () => {
        if (u === "existing") {
          c(a ? "oauth" : "new");
          i(false);
        } else if (u === "oauth") {
          c("new");
        }
      };
      t[6] = a;
      t[7] = c;
      t[8] = i;
      t[9] = u;
      t[10] = y;
    } else {
      y = t[10];
    }
    let _ = y;
    let b;
    if (t[11] !== a || t[12] !== s || t[13] !== u) {
      b = () => {
        if (u === "oauth" && a) {
          a();
        } else {
          s();
        }
      };
      t[11] = a;
      t[12] = s;
      t[13] = u;
      t[14] = b;
    } else {
      b = t[14];
    }
    let S = b;
    let E = u === "new";
    let C;
    if (t[15] !== S || t[16] !== _ || t[17] !== g) {
      C = {
        "confirm:previous": g,
        "confirm:next": _,
        "confirm:yes": S
      };
      t[15] = S;
      t[16] = _;
      t[17] = g;
      t[18] = C;
    } else {
      C = t[18];
    }
    let x = !E;
    let A;
    if (t[19] !== x) {
      A = {
        context: "Confirmation",
        isActive: x
      };
      t[19] = x;
      t[20] = A;
    } else {
      A = t[20];
    }
    jo(C, A);
    let k;
    if (t[21] !== _ || t[22] !== g) {
      k = {
        "confirm:previous": g,
        "confirm:next": _
      };
      t[21] = _;
      t[22] = g;
      t[23] = k;
    } else {
      k = t[23];
    }
    let I;
    if (t[24] !== E) {
      I = {
        context: "Confirmation",
        isActive: E
      };
      t[24] = E;
      t[25] = I;
    } else {
      I = t[25];
    }
    jo(k, I);
    let O;
    if (t[26] === Symbol.for("react.memo_cache_sentinel")) {
      O = nD.jsx(gXd, {
        marginBottom: 1,
        children: nD.jsx(Dv, {
          subtitle: "Choose API key",
          children: "Install GitHub App"
        })
      });
      t[26] = O;
    } else {
      O = t[26];
    }
    let M;
    if (t[27] !== n || t[28] !== u || t[29] !== f) {
      M = n && nD.jsx(gXd, {
        marginBottom: 1,
        children: nD.jsxs(Text, {
          children: [u === "existing" ? color("success", f)("> ") : "  ", "Use your existing Claude Code API key"]
        })
      });
      t[27] = n;
      t[28] = u;
      t[29] = f;
      t[30] = M;
    } else {
      M = t[30];
    }
    let L;
    if (t[31] !== a || t[32] !== u || t[33] !== f) {
      L = a && nD.jsx(gXd, {
        marginBottom: 1,
        children: nD.jsxs(Text, {
          children: [u === "oauth" ? color("success", f)("> ") : "  ", "Create a long-lived token with your Claude subscription"]
        })
      });
      t[31] = a;
      t[32] = u;
      t[33] = f;
      t[34] = L;
    } else {
      L = t[34];
    }
    let P;
    if (t[35] !== u || t[36] !== f) {
      P = u === "new" ? color("success", f)("> ") : "  ";
      t[35] = u;
      t[36] = f;
      t[37] = P;
    } else {
      P = t[37];
    }
    let F;
    if (t[38] !== P) {
      F = nD.jsx(gXd, {
        marginBottom: 1,
        children: nD.jsxs(Text, {
          children: [P, "Enter a new API key"]
        })
      });
      t[38] = P;
      t[39] = F;
    } else {
      F = t[39];
    }
    let H;
    if (t[40] !== r || t[41] !== d || t[42] !== o || t[43] !== s || t[44] !== u || t[45] !== m) {
      H = u === "new" && nD.jsx(Dl, {
        value: r,
        onChange: o,
        onSubmit: s,
        onPaste: o,
        focus: true,
        placeholder: "sk-ant\u2026 (Create a new key at https://platform.claude.com/settings/keys)",
        mask: "*",
        columns: m.columns,
        cursorOffset: d,
        onChangeCursorOffset: p,
        showCursor: true
      });
      t[40] = r;
      t[41] = d;
      t[42] = o;
      t[43] = s;
      t[44] = u;
      t[45] = m;
      t[46] = H;
    } else {
      H = t[46];
    }
    let U;
    if (t[47] !== M || t[48] !== L || t[49] !== F || t[50] !== H) {
      U = nD.jsxs(gXd, {
        flexDirection: "column",
        borderStyle: "round",
        paddingX: 1,
        children: [O, M, L, F, H]
      });
      t[47] = M;
      t[48] = L;
      t[49] = F;
      t[50] = H;
      t[51] = U;
    } else {
      U = t[51];
    }
    let N;
    if (t[52] === Symbol.for("react.memo_cache_sentinel")) {
      N = nD.jsx(gXd, {
        marginLeft: 3,
        children: nD.jsx(Text, {
          dimColor: true,
          children: nD.jsxs(Hn, {
            children: [nD.jsx(xt, {
              chord: ["up", "down"],
              action: "select"
            }), nD.jsx(xt, {
              chord: "enter",
              action: "continue"
            })]
          })
        })
      });
      t[52] = N;
    } else {
      N = t[52];
    }
    let W;
    if (t[53] !== U) {
      W = nD.jsxs(nD.Fragment, {
        children: [U, N]
      });
      t[53] = U;
      t[54] = W;
    } else {
      W = t[54];
    }
    return W;
  }
  var t5l;
  var n5l;
  var nD;
  var o5l = __lazy(() => {
    Ai();
    uK();
    bs();
    q_();
    ki();
    et();
    Bs();
    t5l = __toESM(pt(), 1);
    n5l = __toESM(ot(), 1);
    nD = __toESM(ie(), 1);
  });
  function a5l(e) {
    let t = s5l.c(42);
    let {
      useExistingSecret: n,
      secretName: r,
      onToggleUseExistingSecret: o,
      onSecretNameChange: s,
      onSubmit: i
    } = e;
    let [a, l] = i5l.useState(0);
    let c = Sr();
    let [u] = useTheme();
    let d;
    if (t[0] !== o) {
      d = () => o(true);
      t[0] = o;
      t[1] = d;
    } else {
      d = t[1];
    }
    let p = d;
    let m;
    if (t[2] !== o) {
      m = () => o(false);
      t[2] = o;
      t[3] = m;
    } else {
      m = t[3];
    }
    let f = m;
    let h;
    if (t[4] !== f || t[5] !== p || t[6] !== i) {
      h = {
        "confirm:previous": p,
        "confirm:next": f,
        "confirm:yes": i
      };
      t[4] = f;
      t[5] = p;
      t[6] = i;
      t[7] = h;
    } else {
      h = t[7];
    }
    let g;
    if (t[8] !== n) {
      g = {
        context: "Confirmation",
        isActive: n
      };
      t[8] = n;
      t[9] = g;
    } else {
      g = t[9];
    }
    jo(h, g);
    let y;
    if (t[10] !== f || t[11] !== p) {
      y = {
        "confirm:previous": p,
        "confirm:next": f
      };
      t[10] = f;
      t[11] = p;
      t[12] = y;
    } else {
      y = t[12];
    }
    let _ = !n;
    let b;
    if (t[13] !== _) {
      b = {
        context: "Confirmation",
        isActive: _
      };
      t[13] = _;
      t[14] = b;
    } else {
      b = t[14];
    }
    jo(y, b);
    let S;
    if (t[15] === Symbol.for("react.memo_cache_sentinel")) {
      S = Jw.jsx(gXd, {
        marginBottom: 1,
        children: Jw.jsx(Dv, {
          subtitle: "Setup API key secret",
          children: "Install GitHub App"
        })
      });
      t[15] = S;
    } else {
      S = t[15];
    }
    let E;
    if (t[16] === Symbol.for("react.memo_cache_sentinel")) {
      E = Jw.jsx(gXd, {
        marginBottom: 1,
        children: Jw.jsx(Text, {
          color: "warning",
          children: "ANTHROPIC_API_KEY already exists in repository secrets!"
        })
      });
      t[16] = E;
    } else {
      E = t[16];
    }
    let C;
    if (t[17] === Symbol.for("react.memo_cache_sentinel")) {
      C = Jw.jsx(gXd, {
        marginBottom: 1,
        children: Jw.jsx(Text, {
          children: "Would you like to:"
        })
      });
      t[17] = C;
    } else {
      C = t[17];
    }
    let x;
    if (t[18] !== u || t[19] !== n) {
      x = n ? color("success", u)("> ") : "  ";
      t[18] = u;
      t[19] = n;
      t[20] = x;
    } else {
      x = t[20];
    }
    let A;
    if (t[21] !== x) {
      A = Jw.jsx(gXd, {
        marginBottom: 1,
        children: Jw.jsxs(Text, {
          children: [x, "Use the existing API key"]
        })
      });
      t[21] = x;
      t[22] = A;
    } else {
      A = t[22];
    }
    let k;
    if (t[23] !== u || t[24] !== n) {
      k = !n ? color("success", u)("> ") : "  ";
      t[23] = u;
      t[24] = n;
      t[25] = k;
    } else {
      k = t[25];
    }
    let I;
    if (t[26] !== k) {
      I = Jw.jsx(gXd, {
        marginBottom: 1,
        children: Jw.jsxs(Text, {
          children: [k, "Create a new secret with a different name"]
        })
      });
      t[26] = k;
      t[27] = I;
    } else {
      I = t[27];
    }
    let O;
    if (t[28] !== a || t[29] !== s || t[30] !== i || t[31] !== r || t[32] !== c || t[33] !== n) {
      O = !n && Jw.jsxs(Jw.Fragment, {
        children: [Jw.jsx(gXd, {
          marginBottom: 1,
          children: Jw.jsx(Text, {
            children: "Enter new secret name (alphanumeric with underscores):"
          })
        }), Jw.jsx(Dl, {
          value: r,
          onChange: s,
          onSubmit: i,
          focus: true,
          placeholder: "e.g., CLAUDE_API_KEY",
          columns: c.columns,
          cursorOffset: a,
          onChangeCursorOffset: l,
          showCursor: true
        })]
      });
      t[28] = a;
      t[29] = s;
      t[30] = i;
      t[31] = r;
      t[32] = c;
      t[33] = n;
      t[34] = O;
    } else {
      O = t[34];
    }
    let M;
    if (t[35] !== A || t[36] !== I || t[37] !== O) {
      M = Jw.jsxs(gXd, {
        flexDirection: "column",
        borderStyle: "round",
        paddingX: 1,
        children: [S, E, C, A, I, O]
      });
      t[35] = A;
      t[36] = I;
      t[37] = O;
      t[38] = M;
    } else {
      M = t[38];
    }
    let L;
    if (t[39] === Symbol.for("react.memo_cache_sentinel")) {
      L = Jw.jsx(gXd, {
        marginLeft: 3,
        children: Jw.jsx(Text, {
          dimColor: true,
          children: Jw.jsxs(Hn, {
            children: [Jw.jsx(xt, {
              chord: ["up", "down"],
              action: "select"
            }), Jw.jsx(xt, {
              chord: "enter",
              action: "continue"
            })]
          })
        })
      });
      t[39] = L;
    } else {
      L = t[39];
    }
    let P;
    if (t[40] !== M) {
      P = Jw.jsxs(Jw.Fragment, {
        children: [M, L]
      });
      t[40] = M;
      t[41] = P;
    } else {
      P = t[41];
    }
    return P;
  }
  var s5l;
  var i5l;
  var Jw;
  var l5l = __lazy(() => {
    Ai();
    uK();
    bs();
    q_();
    ki();
    et();
    Bs();
    s5l = __toESM(pt(), 1);
    i5l = __toESM(ot(), 1);
    Jw = __toESM(ie(), 1);
  });
  function u5l() {
    let e = c5l.c(1);
    let t;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      t = f3o.jsx(gXd, {
        paddingX: 2,
        children: f3o.jsx(Xc, {
          message: "Checking GitHub CLI installation\u2026"
        })
      });
      e[0] = t;
    } else {
      t = e[0];
    }
    return t;
  }
  var c5l;
  var f3o;
  var d5l = __lazy(() => {
    Pv();
    et();
    c5l = __toESM(pt(), 1);
    f3o = __toESM(ie(), 1);
  });
  function m5l(e) {
    let t = p5l.c(52);
    let {
      currentRepo: n,
      useCurrentRepo: r,
      repoUrl: o,
      onRepoUrlChange: s,
      onSubmit: i,
      onToggleUseCurrentRepo: a
    } = e;
    let [l, c] = h3o.useState(0);
    let [u, d] = h3o.useState(false);
    let m = Sr().columns;
    let f;
    if (t[0] !== n || t[1] !== i || t[2] !== o || t[3] !== r) {
      f = () => {
        if (!(r ? n : o)?.trim()) {
          d(true);
          return;
        }
        i();
      };
      t[0] = n;
      t[1] = i;
      t[2] = o;
      t[3] = r;
      t[4] = f;
    } else {
      f = t[4];
    }
    let h = f;
    let g = !r || !n;
    let y;
    if (t[5] !== a) {
      y = () => {
        a(true);
        d(false);
      };
      t[5] = a;
      t[6] = y;
    } else {
      y = t[6];
    }
    let _ = y;
    let b;
    if (t[7] !== a) {
      b = () => {
        a(false);
        d(false);
      };
      t[7] = a;
      t[8] = b;
    } else {
      b = t[8];
    }
    let S = b;
    let E;
    if (t[9] !== S || t[10] !== _ || t[11] !== h) {
      E = {
        "confirm:previous": _,
        "confirm:next": S,
        "confirm:yes": h
      };
      t[9] = S;
      t[10] = _;
      t[11] = h;
      t[12] = E;
    } else {
      E = t[12];
    }
    let C = !g;
    let x;
    if (t[13] !== C) {
      x = {
        context: "Confirmation",
        isActive: C
      };
      t[13] = C;
      t[14] = x;
    } else {
      x = t[14];
    }
    jo(E, x);
    let A;
    if (t[15] !== S || t[16] !== _) {
      A = {
        "confirm:previous": _,
        "confirm:next": S
      };
      t[15] = S;
      t[16] = _;
      t[17] = A;
    } else {
      A = t[17];
    }
    let k;
    if (t[18] !== g) {
      k = {
        context: "Confirmation",
        isActive: g
      };
      t[18] = g;
      t[19] = k;
    } else {
      k = t[19];
    }
    jo(A, k);
    let I;
    if (t[20] === Symbol.for("react.memo_cache_sentinel")) {
      I = pP.jsx(gXd, {
        marginBottom: 1,
        children: pP.jsx(Dv, {
          subtitle: "Select GitHub repository",
          children: "Install GitHub App"
        })
      });
      t[20] = I;
    } else {
      I = t[20];
    }
    let O;
    if (t[21] !== n || t[22] !== r) {
      O = n && pP.jsx(gXd, {
        marginBottom: 1,
        children: pP.jsxs(Text, {
          bold: r,
          color: r ? "permission" : undefined,
          children: [r ? "> " : "  ", "Use current repository: ", n]
        })
      });
      t[21] = n;
      t[22] = r;
      t[23] = O;
    } else {
      O = t[23];
    }
    let M = !r || !n;
    let L = !r || !n ? "permission" : undefined;
    let P = !r || !n ? "> " : "  ";
    let F = n ? "Enter a different repository" : "Enter repository";
    let H;
    if (t[24] !== M || t[25] !== L || t[26] !== P || t[27] !== F) {
      H = pP.jsx(gXd, {
        marginBottom: 1,
        children: pP.jsxs(Text, {
          bold: M,
          color: L,
          children: [P, F]
        })
      });
      t[24] = M;
      t[25] = L;
      t[26] = P;
      t[27] = F;
      t[28] = H;
    } else {
      H = t[28];
    }
    let U;
    if (t[29] !== n || t[30] !== l || t[31] !== h || t[32] !== s || t[33] !== o || t[34] !== m || t[35] !== r) {
      U = (!r || !n) && pP.jsx(gXd, {
        marginLeft: 2,
        marginBottom: 1,
        children: pP.jsx(Dl, {
          value: o,
          onChange: J => {
            s(J);
            d(false);
          },
          onSubmit: h,
          focus: true,
          placeholder: "Enter a repo as owner/repo or https://github.com/owner/repo\u2026",
          columns: m,
          cursorOffset: l,
          onChangeCursorOffset: c,
          showCursor: true
        })
      });
      t[29] = n;
      t[30] = l;
      t[31] = h;
      t[32] = s;
      t[33] = o;
      t[34] = m;
      t[35] = r;
      t[36] = U;
    } else {
      U = t[36];
    }
    let N;
    if (t[37] !== O || t[38] !== H || t[39] !== U) {
      N = pP.jsxs(gXd, {
        flexDirection: "column",
        borderStyle: "round",
        paddingX: 1,
        children: [I, O, H, U]
      });
      t[37] = O;
      t[38] = H;
      t[39] = U;
      t[40] = N;
    } else {
      N = t[40];
    }
    let W;
    if (t[41] !== u) {
      W = u && pP.jsx(gXd, {
        marginLeft: 3,
        marginBottom: 1,
        children: pP.jsx(Text, {
          color: "error",
          children: "Please enter a repository name to continue"
        })
      });
      t[41] = u;
      t[42] = W;
    } else {
      W = t[42];
    }
    let j;
    if (t[43] !== n) {
      j = n ? pP.jsx(xt, {
        chord: ["up", "down"],
        action: "select"
      }) : null;
      t[43] = n;
      t[44] = j;
    } else {
      j = t[44];
    }
    let z;
    if (t[45] === Symbol.for("react.memo_cache_sentinel")) {
      z = pP.jsx(xt, {
        chord: "enter",
        action: "continue"
      });
      t[45] = z;
    } else {
      z = t[45];
    }
    let V;
    if (t[46] !== j) {
      V = pP.jsx(gXd, {
        marginLeft: 3,
        children: pP.jsx(Text, {
          dimColor: true,
          children: pP.jsxs(Hn, {
            children: [j, z]
          })
        })
      });
      t[46] = j;
      t[47] = V;
    } else {
      V = t[47];
    }
    let K;
    if (t[48] !== N || t[49] !== W || t[50] !== V) {
      K = pP.jsxs(pP.Fragment, {
        children: [N, W, V]
      });
      t[48] = N;
      t[49] = W;
      t[50] = V;
      t[51] = K;
    } else {
      K = t[51];
    }
    return K;
  }
  var p5l;
  var h3o;
  var pP;
  var f5l = __lazy(() => {
    Ai();
    uK();
    bs();
    q_();
    ki();
    et();
    Bs();
    p5l = __toESM(pt(), 1);
    h3o = __toESM(ot(), 1);
    pP = __toESM(ie(), 1);
  });
  function g5l(e) {
    let t = h5l.c(10);
    let {
      currentWorkflowInstallStep: n,
      secretExists: r,
      useExistingSecret: o,
      secretName: s,
      skipWorkflow: i,
      selectedWorkflows: a
    } = e;
    let l = i === undefined ? false : i;
    let c;
    if (t[0] !== r || t[1] !== s || t[2] !== a || t[3] !== l || t[4] !== o) {
      c = l ? ["Getting repository information", r && o ? "Using existing API key secret" : `Setting up ${s} secret`] : ["Getting repository information", "Creating branch", a.length > 1 ? "Creating workflow files" : "Creating workflow file", r && o ? "Using existing API key secret" : `Setting up ${s} secret`, "Opening pull request page"];
      t[0] = r;
      t[1] = s;
      t[2] = a;
      t[3] = l;
      t[4] = o;
      t[5] = c;
    } else {
      c = t[5];
    }
    let u = c;
    let d;
    if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
      d = Bfe.jsx(gXd, {
        marginBottom: 1,
        children: Bfe.jsx(Dv, {
          subtitle: "Create GitHub Actions workflow",
          children: "Install GitHub App"
        })
      });
      t[6] = d;
    } else {
      d = t[6];
    }
    let p;
    if (t[7] !== n || t[8] !== u) {
      p = Bfe.jsx(Bfe.Fragment, {
        children: Bfe.jsxs(_E, {
          children: [d, u.map((m, f) => {
            let h = "pending";
            if (f < n) {
              h = "completed";
            } else if (f === n) {
              h = "in-progress";
            }
            return Bfe.jsx(gXd, {
              children: Bfe.jsxs(Text, {
                color: h === "completed" ? "success" : h === "in-progress" ? "warning" : undefined,
                children: [h === "completed" ? "\u2713 " : "", m, h === "in-progress" ? "\u2026" : ""]
              })
            }, f);
          })]
        })
      });
      t[7] = n;
      t[8] = u;
      t[9] = p;
    } else {
      p = t[9];
    }
    return p;
  }
  var h5l;
  var Bfe;
  var y5l = __lazy(() => {
    uK();
    Az();
    et();
    h5l = __toESM(pt(), 1);
    Bfe = __toESM(ie(), 1);
  });
  function b5l(e) {
    let t = _5l.c(15);
    let {
      error: n,
      errorReason: r,
      errorInstructions: o
    } = e;
    let s;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      s = rD.jsx(gXd, {
        marginBottom: 1,
        children: rD.jsx(Dv, {
          children: "Install GitHub App"
        })
      });
      t[0] = s;
    } else {
      s = t[0];
    }
    let i;
    if (t[1] !== n) {
      i = rD.jsxs(Text, {
        color: "error",
        children: ["Error: ", n]
      });
      t[1] = n;
      t[2] = i;
    } else {
      i = t[2];
    }
    let a;
    if (t[3] !== r) {
      a = r && rD.jsx(gXd, {
        marginTop: 1,
        children: rD.jsxs(Text, {
          dimColor: true,
          children: ["Reason: ", r]
        })
      });
      t[3] = r;
      t[4] = a;
    } else {
      a = t[4];
    }
    let l;
    if (t[5] !== o) {
      l = o.length > 0 && rD.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [rD.jsx(Text, {
          dimColor: true,
          children: "How to fix:"
        }), rD.jsx(gXd, {
          flexDirection: "column",
          marginLeft: 2,
          children: o.map(a5m)
        })]
      });
      t[5] = o;
      t[6] = l;
    } else {
      l = t[6];
    }
    let c;
    if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
      c = rD.jsx(gXd, {
        marginTop: 1,
        children: rD.jsxs(Text, {
          dimColor: true,
          children: ["For manual setup instructions, see:", " ", rD.jsx(Text, {
            color: "claude",
            children: "https://github.com/anthropics/claude-code-action/blob/main/docs/setup.md"
          })]
        })
      });
      t[7] = c;
    } else {
      c = t[7];
    }
    let u;
    if (t[8] !== i || t[9] !== a || t[10] !== l) {
      u = rD.jsxs(_E, {
        children: [s, i, a, l, c]
      });
      t[8] = i;
      t[9] = a;
      t[10] = l;
      t[11] = u;
    } else {
      u = t[11];
    }
    let d;
    if (t[12] === Symbol.for("react.memo_cache_sentinel")) {
      d = rD.jsx(gXd, {
        marginLeft: 3,
        children: rD.jsx(Text, {
          dimColor: true,
          children: "Press any key to exit"
        })
      });
      t[12] = d;
    } else {
      d = t[12];
    }
    let p;
    if (t[13] !== u) {
      p = rD.jsxs(rD.Fragment, {
        children: [u, d]
      });
      t[13] = u;
      t[14] = p;
    } else {
      p = t[14];
    }
    return p;
  }
  function a5m(e, t) {
    return rD.jsx(Pw, {
      children: e
    }, t);
  }
  var _5l;
  var rD;
  var S5l = __lazy(() => {
    Loe();
    uK();
    Az();
    et();
    _5l = __toESM(pt(), 1);
    rD = __toESM(ie(), 1);
  });
  function E5l(e) {
    let t = T5l.c(15);
    let {
      repoName: n,
      onSelectAction: r
    } = e;
    let o;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      o = [{
        label: "Update workflow file with latest version",
        value: "update"
      }, {
        label: "Skip workflow update (configure secrets only)",
        value: "skip"
      }, {
        label: "Exit without making changes",
        value: "exit"
      }];
      t[0] = o;
    } else {
      o = t[0];
    }
    let s = o;
    let i;
    if (t[1] !== r) {
      i = g => {
        r(g);
      };
      t[1] = r;
      t[2] = i;
    } else {
      i = t[2];
    }
    let a = i;
    let l;
    if (t[3] !== r) {
      l = () => {
        r("exit");
      };
      t[3] = r;
      t[4] = l;
    } else {
      l = t[4];
    }
    let c = l;
    let u = `Repository: ${n}`;
    let d;
    if (t[5] !== u) {
      d = R5.jsx(gXd, {
        marginBottom: 1,
        children: R5.jsx(Dv, {
          subtitle: u,
          children: "Existing Workflow Found"
        })
      });
      t[5] = u;
      t[6] = d;
    } else {
      d = t[6];
    }
    let p;
    if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
      p = R5.jsxs(gXd, {
        flexDirection: "column",
        marginBottom: 1,
        children: [R5.jsxs(Text, {
          children: ["A Claude workflow file already exists at", " ", R5.jsx(Text, {
            color: "claude",
            children: ".github/workflows/claude.yml"
          })]
        }), R5.jsx(Text, {
          dimColor: true,
          children: "What would you like to do?"
        })]
      });
      t[7] = p;
    } else {
      p = t[7];
    }
    let m;
    if (t[8] !== c || t[9] !== a) {
      m = R5.jsx(gXd, {
        flexDirection: "column",
        children: R5.jsx(xr, {
          options: s,
          onChange: a,
          onCancel: c
        })
      });
      t[8] = c;
      t[9] = a;
      t[10] = m;
    } else {
      m = t[10];
    }
    let f;
    if (t[11] === Symbol.for("react.memo_cache_sentinel")) {
      f = R5.jsx(gXd, {
        marginTop: 1,
        children: R5.jsxs(Text, {
          dimColor: true,
          children: ["View the latest workflow template at:", " ", R5.jsx(Text, {
            color: "claude",
            children: "https://github.com/anthropics/claude-code-action/blob/main/examples/claude.yml"
          })]
        })
      });
      t[11] = f;
    } else {
      f = t[11];
    }
    let h;
    if (t[12] !== d || t[13] !== m) {
      h = R5.jsxs(gXd, {
        flexDirection: "column",
        borderStyle: "round",
        borderDimColor: true,
        paddingX: 1,
        children: [d, p, m, f]
      });
      t[12] = d;
      t[13] = m;
      t[14] = h;
    } else {
      h = t[14];
    }
    return h;
  }
  var T5l;
  var R5;
  var v5l = __lazy(() => {
    OS();
    uK();
    et();
    T5l = __toESM(pt(), 1);
    R5 = __toESM(ie(), 1);
  });
  function C5l(e) {
    let t = w5l.c(12);
    let {
      repoUrl: n,
      onSubmit: r
    } = e;
    let o;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      o = {
        context: "Confirmation"
      };
      t[0] = o;
    } else {
      o = t[0];
    }
    uo("confirm:yes", r, o);
    let s;
    if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
      s = mP.jsx(gXd, {
        flexDirection: "column",
        marginBottom: 1,
        children: mP.jsx(Text, {
          bold: true,
          children: "Install the Claude GitHub App"
        })
      });
      t[1] = s;
    } else {
      s = t[1];
    }
    let i;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      i = mP.jsx(gXd, {
        marginBottom: 1,
        children: mP.jsx(Text, {
          children: "Opening browser to install the Claude GitHub App\u2026"
        })
      });
      t[2] = i;
    } else {
      i = t[2];
    }
    let a;
    if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
      a = mP.jsx(gXd, {
        marginBottom: 1,
        children: mP.jsx(Text, {
          children: "If your browser doesn't open automatically, visit:"
        })
      });
      t[3] = a;
    } else {
      a = t[3];
    }
    let l;
    if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
      l = mP.jsx(gXd, {
        marginBottom: 1,
        children: mP.jsx(Text, {
          underline: true,
          children: "https://github.com/apps/claude"
        })
      });
      t[4] = l;
    } else {
      l = t[4];
    }
    let c;
    if (t[5] !== n) {
      c = mP.jsx(gXd, {
        marginBottom: 1,
        children: mP.jsxs(Text, {
          children: ["Please install the app for repository: ", mP.jsx(Text, {
            bold: true,
            children: n
          })]
        })
      });
      t[5] = n;
      t[6] = c;
    } else {
      c = t[6];
    }
    let u;
    if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
      u = mP.jsx(gXd, {
        marginBottom: 1,
        children: mP.jsx(Text, {
          dimColor: true,
          children: "Important: Make sure to grant access to this specific repository"
        })
      });
      t[7] = u;
    } else {
      u = t[7];
    }
    let d;
    if (t[8] === Symbol.for("react.memo_cache_sentinel")) {
      d = mP.jsx(gXd, {
        children: mP.jsxs(Text, {
          bold: true,
          color: "permission",
          children: ["Press Enter once you've installed the app", vGd.ellipsis]
        })
      });
      t[8] = d;
    } else {
      d = t[8];
    }
    let p;
    if (t[9] === Symbol.for("react.memo_cache_sentinel")) {
      p = mP.jsx(gXd, {
        marginTop: 1,
        children: mP.jsxs(Text, {
          dimColor: true,
          children: ["Having trouble? See manual setup instructions at:", " ", mP.jsx(Text, {
            color: "claude",
            children: "https://github.com/anthropics/claude-code-action/blob/main/docs/setup.md"
          })]
        })
      });
      t[9] = p;
    } else {
      p = t[9];
    }
    let m;
    if (t[10] !== c) {
      m = mP.jsxs(gXd, {
        flexDirection: "column",
        borderStyle: "round",
        borderDimColor: true,
        paddingX: 1,
        children: [s, i, a, l, c, u, d, p]
      });
      t[10] = c;
      t[11] = m;
    } else {
      m = t[11];
    }
    return m;
  }
  var w5l;
  var mP;
  var R5l = __lazy(() => {
    et();
    Bs();
    w5l = __toESM(pt(), 1);
    mP = __toESM(ie(), 1);
  });
  function A5l({
    onSuccess: e,
    onCancel: t
  }) {
    let [n, r] = TH.useState({
      state: "starting"
    });
    let [o] = TH.useState(() => new Rz());
    let [s, i] = TH.useState("");
    let [a, l] = TH.useState(0);
    let [c, u] = TH.useState(false);
    let [d, p] = TH.useState(false);
    let m = useClock();
    let f = TH.useRef(new Set());
    let h = TH.useRef(undefined);
    let g = Sr();
    let y = Math.max(50, g.columns - ("Paste code here if prompted > ").length - 4);
    function _(E) {
      if (n.state !== "error") {
        return;
      }
      if (E.preventDefault(), E.key === "return" && n.toRetry) {
        i("");
        l(0);
        r({
          state: "about_to_retry",
          nextState: n.toRetry
        });
      } else {
        t();
      }
    }
    async function b(E, C) {
      try {
        let [x, A] = E.split("#");
        if (!x || !A) {
          r({
            state: "error",
            message: "Invalid code. Please make sure the full code was copied",
            toRetry: {
              state: "waiting_for_login",
              url: C
            }
          });
          return;
        }
        logEvent("tengu_oauth_manual_entry", {});
        o.handleManualAuthCodeInput({
          authorizationCode: x,
          state: A
        });
      } catch (x) {
        Oe(x);
        r({
          state: "error",
          message: he(x),
          toRetry: {
            state: "waiting_for_login",
            url: C
          }
        });
      }
    }
    let S = TH.useCallback(async () => {
      f.current.forEach(E => E());
      f.current.clear();
      try {
        let E = await o.startOAuthFlow(async C => {
          r({
            state: "waiting_for_login",
            url: C
          });
          f.current.add(m.setTimeout(() => u(true), 3000));
        }, {
          loginWithClaudeAi: true,
          inferenceOnly: true,
          expiresIn: 31536000
        });
        r({
          state: "processing"
        });
        await saveOAuthTokensIfNeeded(E);
        f.current.add(m.setTimeout(() => {
          r({
            state: "success",
            token: E.accessToken
          });
          f.current.add(m.setTimeout(() => e(E.accessToken), 1000));
        }, 100));
      } catch (E) {
        let C = he(E);
        r({
          state: "error",
          message: C,
          toRetry: {
            state: "starting"
          }
        });
        logForDebugging(`OAuth flow failed in install-github-app: ${C}`, {
          level: "error"
        });
        logEvent("tengu_oauth_error", {
          ...o1(E)
        });
      }
    }, [m, o, e]);
    TH.useEffect(() => {
      if (n.state === "starting") {
        S();
      }
    }, [n.state, S]);
    useTimeout(() => {
      if (n.state === "about_to_retry") {
        u(n.nextState.state === "waiting_for_login");
        r(n.nextState);
      }
    }, n.state === "about_to_retry" ? 500 : null);
    TH.useEffect(() => {
      if (s === "c" && n.state === "waiting_for_login" && c && !d) {
        Uk(n.url).then(E => {
          if (E) {
            process.stdout.write(E);
          }
          p(true);
          h.current?.();
          h.current = m.setTimeout(() => p(false), 2000);
        });
        i("");
      }
    }, [m, s, n, c, d]);
    TH.useEffect(() => {
      let E = f.current;
      return () => {
        o.cleanup();
        E.forEach(C => C());
        E.clear();
        h.current?.();
      };
    }, [o]);
    return dy.jsxs(gXd, {
      flexDirection: "column",
      gap: 1,
      tabIndex: 0,
      autoFocus: true,
      onKeyDown: _,
      children: [n.state === "starting" && dy.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        paddingBottom: 1,
        children: [dy.jsx(Text, {
          bold: true,
          children: "Create Authentication Token"
        }), dy.jsx(Text, {
          dimColor: true,
          children: "Creating a long-lived token for GitHub Actions"
        })]
      }), n.state !== "success" && n.state !== "starting" && n.state !== "processing" && dy.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        paddingBottom: 1,
        children: [dy.jsx(Text, {
          bold: true,
          children: "Create Authentication Token"
        }), dy.jsx(Text, {
          dimColor: true,
          children: "Creating a long-lived token for GitHub Actions"
        })]
      }, "header"), n.state === "waiting_for_login" && c && dy.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        paddingBottom: 1,
        children: [dy.jsxs(gXd, {
          paddingX: 1,
          children: [dy.jsxs(Text, {
            dimColor: true,
            children: ["Browser didn't open? Use the url below to sign in", " "]
          }), d ? dy.jsx(Text, {
            color: "success",
            children: "(Copied!)"
          }) : dy.jsx(Text, {
            dimColor: true,
            children: dy.jsx(xt, {
              chord: "c",
              action: "copy",
              parens: true
            })
          })]
        }), dy.jsx(Link, {
          url: n.url,
          children: dy.jsx(Text, {
            dimColor: true,
            children: n.url
          })
        })]
      }, "urlToCopy"), dy.jsx(gXd, {
        paddingLeft: 1,
        flexDirection: "column",
        gap: 1,
        children: dy.jsx(l5m, {
          oauthStatus: n,
          showPastePrompt: c,
          pastedCode: s,
          setPastedCode: i,
          cursorOffset: a,
          setCursorOffset: l,
          textInputColumns: y,
          onSubmitCode: b
        })
      })]
    });
  }
  function l5m(e) {
    let t = x5l.c(25);
    let {
      oauthStatus: n,
      showPastePrompt: r,
      pastedCode: o,
      setPastedCode: s,
      cursorOffset: i,
      setCursorOffset: a,
      textInputColumns: l,
      onSubmitCode: c
    } = e;
    switch (n.state) {
      case "starting":
        {
          let u;
          if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
            u = dy.jsx(Xc, {
              message: "Starting authentication\u2026"
            });
            t[0] = u;
          } else {
            u = t[0];
          }
          return u;
        }
      case "waiting_for_login":
        {
          let u;
          if (t[1] !== r) {
            u = !r && dy.jsx(Xc, {
              message: "Opening browser to sign in with your Claude account\u2026"
            });
            t[1] = r;
            t[2] = u;
          } else {
            u = t[2];
          }
          let d;
          if (t[3] !== i || t[4] !== n.url || t[5] !== c || t[6] !== o || t[7] !== a || t[8] !== s || t[9] !== r || t[10] !== l) {
            d = r && dy.jsxs(gXd, {
              children: [dy.jsx(Text, {
                children: "Paste code here if prompted > "
              }), dy.jsx(Dl, {
                value: o,
                onChange: s,
                onSubmit: m => c(m, n.url),
                cursorOffset: i,
                onChangeCursorOffset: a,
                columns: l
              })]
            });
            t[3] = i;
            t[4] = n.url;
            t[5] = c;
            t[6] = o;
            t[7] = a;
            t[8] = s;
            t[9] = r;
            t[10] = l;
            t[11] = d;
          } else {
            d = t[11];
          }
          let p;
          if (t[12] !== u || t[13] !== d) {
            p = dy.jsxs(gXd, {
              flexDirection: "column",
              gap: 1,
              children: [u, d]
            });
            t[12] = u;
            t[13] = d;
            t[14] = p;
          } else {
            p = t[14];
          }
          return p;
        }
      case "processing":
        {
          let u;
          if (t[15] === Symbol.for("react.memo_cache_sentinel")) {
            u = dy.jsx(Xc, {
              message: "Processing authentication\u2026"
            });
            t[15] = u;
          } else {
            u = t[15];
          }
          return u;
        }
      case "success":
        {
          let u;
          if (t[16] === Symbol.for("react.memo_cache_sentinel")) {
            u = dy.jsxs(gXd, {
              flexDirection: "column",
              gap: 1,
              children: [dy.jsx(Text, {
                color: "success",
                children: "\u2713 Authentication token created successfully!"
              }), dy.jsx(Text, {
                dimColor: true,
                children: "Using token for GitHub Actions setup\u2026"
              })]
            });
            t[16] = u;
          } else {
            u = t[16];
          }
          return u;
        }
      case "error":
        {
          let u;
          if (t[17] !== n.message) {
            u = dy.jsxs(Text, {
              color: "error",
              children: ["OAuth error: ", n.message]
            });
            t[17] = n.message;
            t[18] = u;
          } else {
            u = t[18];
          }
          let d;
          if (t[19] !== n.toRetry) {
            d = n.toRetry ? dy.jsx(Text, {
              dimColor: true,
              children: "Press Enter to try again, or any other key to cancel"
            }) : dy.jsx(Text, {
              dimColor: true,
              children: "Press any key to return to API key selection"
            });
            t[19] = n.toRetry;
            t[20] = d;
          } else {
            d = t[20];
          }
          let p;
          if (t[21] !== u || t[22] !== d) {
            p = dy.jsxs(gXd, {
              flexDirection: "column",
              gap: 1,
              children: [u, d]
            });
            t[21] = u;
            t[22] = d;
            t[23] = p;
          } else {
            p = t[23];
          }
          return p;
        }
      case "about_to_retry":
        {
          let u;
          if (t[24] === Symbol.for("react.memo_cache_sentinel")) {
            u = dy.jsx(gXd, {
              flexDirection: "column",
              gap: 1,
              children: dy.jsx(Text, {
                color: "permission",
                children: "Retrying\u2026"
              })
            });
            t[24] = u;
          } else {
            u = t[24];
          }
          return u;
        }
      default:
        return null;
    }
  }
  var x5l;
  var TH;
  var dy;
  var I5l = __lazy(() => {
    Ot();
    bs();
    Pv();
    q_();
    Uc();
    ki();
    Tg();
    et();
    GVe();
    no();
    je();
    dt();
    dw();
    Rn();
    x5l = __toESM(pt(), 1);
    TH = __toESM(ot(), 1);
    dy = __toESM(ie(), 1);
  });
  function O5l(e) {
    let t = P5l.c(8);
    let {
      onSelect: n,
      onCancel: r
    } = e;
    let o;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      o = [{
        label: "Set up GitHub Actions workflows",
        value: "setup"
      }, {
        label: "Skip for now (you can run /install-github-app again later)",
        value: "skip"
      }];
      t[0] = o;
    } else {
      o = t[0];
    }
    let s = o;
    let i;
    if (t[1] !== n) {
      i = d => {
        n(d);
      };
      t[1] = n;
      t[2] = i;
    } else {
      i = t[2];
    }
    let a = i;
    let l;
    if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
      l = Wwe.jsx(gXd, {
        marginBottom: 1,
        children: Wwe.jsx(Dv, {
          subtitle: "Set up GitHub Actions",
          children: "GitHub App installed!"
        })
      });
      t[3] = l;
    } else {
      l = t[3];
    }
    let c;
    if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
      c = Wwe.jsx(gXd, {
        flexDirection: "column",
        marginBottom: 1,
        children: Wwe.jsx(Text, {
          children: "The Claude GitHub App is now installed. You can optionally set up GitHub Actions workflows so Claude responds to @claude mentions in issues and PRs."
        })
      });
      t[4] = c;
    } else {
      c = t[4];
    }
    let u;
    if (t[5] !== a || t[6] !== r) {
      u = Wwe.jsxs(gXd, {
        flexDirection: "column",
        borderStyle: "round",
        borderDimColor: true,
        paddingX: 1,
        children: [l, c, Wwe.jsx(gXd, {
          flexDirection: "column",
          children: Wwe.jsx(xr, {
            options: s,
            onChange: a,
            onCancel: r
          })
        })]
      });
      t[5] = a;
      t[6] = r;
      t[7] = u;
    } else {
      u = t[7];
    }
    return u;
  }
  var P5l;
  var Wwe;
  var D5l = __lazy(() => {
    OS();
    uK();
    et();
    P5l = __toESM(pt(), 1);
    Wwe = __toESM(ie(), 1);
  });
  function N5l(e) {
    let t = M5l.c(25);
    let {
      secretExists: n,
      useExistingSecret: r,
      secretName: o,
      skipWorkflow: s,
      appOnlyInstall: i
    } = e;
    let a = s === undefined ? false : s;
    if (i === undefined ? false : i) {
      let _;
      if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
        _ = gf.jsx(gXd, {
          marginBottom: 1,
          children: gf.jsx(Dv, {
            subtitle: "Success",
            children: "Install GitHub App"
          })
        });
        t[0] = _;
      } else {
        _ = t[0];
      }
      let b;
      if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
        b = gf.jsxs(Text, {
          color: "success",
          children: [gf.jsx(Ps, {
            status: "success",
            withSpace: true
          }), "GitHub App installed"]
        });
        t[1] = b;
      } else {
        b = t[1];
      }
      let S;
      if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
        S = gf.jsxs(_E, {
          children: [_, b, gf.jsx(gXd, {
            marginTop: 1,
            children: gf.jsx(Text, {
              children: "Run /install-github-app again anytime to set up GitHub Actions workflows."
            })
          })]
        });
        t[2] = S;
      } else {
        S = t[2];
      }
      let E;
      if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
        E = gf.jsxs(gf.Fragment, {
          children: [S, gf.jsx(gXd, {
            marginLeft: 3,
            children: gf.jsx(Text, {
              dimColor: true,
              children: "Press any key to exit"
            })
          })]
        });
        t[3] = E;
      } else {
        E = t[3];
      }
      return E;
    }
    let c;
    if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
      c = gf.jsx(gXd, {
        marginBottom: 1,
        children: gf.jsx(Dv, {
          subtitle: "Success",
          children: "Install GitHub App"
        })
      });
      t[4] = c;
    } else {
      c = t[4];
    }
    let u;
    if (t[5] !== a) {
      u = !a && gf.jsxs(Text, {
        color: "success",
        children: [gf.jsx(Ps, {
          status: "success",
          withSpace: true
        }), "GitHub Actions workflow created!"]
      });
      t[5] = a;
      t[6] = u;
    } else {
      u = t[6];
    }
    let d;
    if (t[7] !== n || t[8] !== r) {
      d = n && r && gf.jsx(gXd, {
        marginTop: 1,
        children: gf.jsxs(Text, {
          color: "success",
          children: [gf.jsx(Ps, {
            status: "success",
            withSpace: true
          }), "Using existing ANTHROPIC_API_KEY secret"]
        })
      });
      t[7] = n;
      t[8] = r;
      t[9] = d;
    } else {
      d = t[9];
    }
    let p;
    if (t[10] !== n || t[11] !== o || t[12] !== r) {
      p = (!n || !r) && gf.jsx(gXd, {
        marginTop: 1,
        children: gf.jsxs(Text, {
          color: "success",
          children: [gf.jsx(Ps, {
            status: "success",
            withSpace: true
          }), "API key saved as ", o, " secret"]
        })
      });
      t[10] = n;
      t[11] = o;
      t[12] = r;
      t[13] = p;
    } else {
      p = t[13];
    }
    let m;
    if (t[14] === Symbol.for("react.memo_cache_sentinel")) {
      m = gf.jsx(gXd, {
        marginTop: 1,
        children: gf.jsx(Text, {
          children: "Next steps:"
        })
      });
      t[14] = m;
    } else {
      m = t[14];
    }
    let f;
    if (t[15] !== a) {
      f = a ? gf.jsxs(gf.Fragment, {
        children: [gf.jsx(Text, {
          children: "1. Install the Claude GitHub App if you haven't already"
        }), gf.jsx(Text, {
          children: "2. Your workflow file was kept unchanged"
        }), gf.jsx(Text, {
          children: "3. API key is configured and ready to use"
        })]
      }) : gf.jsxs(gf.Fragment, {
        children: [gf.jsx(Text, {
          children: "1. A pre-filled PR page has been created"
        }), gf.jsx(Text, {
          children: "2. Install the Claude GitHub App if you haven't already"
        }), gf.jsx(Text, {
          children: "3. Merge the PR to enable Claude PR assistance"
        })]
      });
      t[15] = a;
      t[16] = f;
    } else {
      f = t[16];
    }
    let h;
    if (t[17] !== u || t[18] !== d || t[19] !== p || t[20] !== f) {
      h = gf.jsxs(_E, {
        children: [c, u, d, p, m, f]
      });
      t[17] = u;
      t[18] = d;
      t[19] = p;
      t[20] = f;
      t[21] = h;
    } else {
      h = t[21];
    }
    let g;
    if (t[22] === Symbol.for("react.memo_cache_sentinel")) {
      g = gf.jsx(gXd, {
        marginLeft: 3,
        children: gf.jsx(Text, {
          dimColor: true,
          children: "Press any key to exit"
        })
      });
      t[22] = g;
    } else {
      g = t[22];
    }
    let y;
    if (t[23] !== h) {
      y = gf.jsxs(gf.Fragment, {
        children: [h, g]
      });
      t[23] = h;
      t[24] = y;
    } else {
      y = t[24];
    }
    return y;
  }
  var M5l;
  var gf;
  var L5l = __lazy(() => {
    uK();
    Az();
    Vf();
    et();
    M5l = __toESM(pt(), 1);
    gf = __toESM(ie(), 1);
  });
  async function c5m(e, t, n, r, o, s, i) {
    let a = await execFileNoThrow("gh", ["api", `repos/${e}/contents/${n}`, "--jq", ".sha"]);
    let l = null;
    if (a.code === 0) {
      l = a.stdout.trim();
    }
    let c = r;
    if (o === "CLAUDE_CODE_OAUTH_TOKEN") {
      c = r.replace(/anthropic_api_key: \$\{\{ secrets\.ANTHROPIC_API_KEY \}\}/g, "claude_code_oauth_token: ${{ secrets.CLAUDE_CODE_OAUTH_TOKEN }}");
    } else if (o !== "ANTHROPIC_API_KEY") {
      c = r.replace(/anthropic_api_key: \$\{\{ secrets\.ANTHROPIC_API_KEY \}\}/g, `anthropic_api_key: \${{ secrets.${o} }}`);
    }
    let u = Buffer.from(c).toString("base64");
    let d = ["api", "--method", "PUT", `repos/${e}/contents/${n}`, "-f", `message=${l ? `"Update ${s}"` : `"${s}"`}`, "-f", `content=${u}`, "-f", `branch=${t}`];
    if (l) {
      d.push("-f", `sha=${l}`);
    }
    let p = await execFileNoThrow("gh", d);
    if (p.code !== 0) {
      if (p.stderr.includes("422") && p.stderr.includes("sha")) {
        throw logEvent("tengu_setup_github_actions_failed", {
          reason: "failed_to_create_workflow_file",
          exit_code: p.code,
          ...i
        }), Error(`Failed to create workflow file ${n}: A Claude workflow file already exists in this repository. Please remove it first or update it manually.`);
      }
      logEvent("tengu_setup_github_actions_failed", {
        reason: "failed_to_create_workflow_file",
        exit_code: p.code,
        ...i
      });
      let m = `

Need help? Common issues:
` + `\xB7 Permission denied \u2192 Run: gh auth refresh -h github.com -s repo,workflow
` + `\xB7 Not authorized \u2192 Ensure you have admin access to the repository
` + "\xB7 For manual setup \u2192 Visit: https://github.com/anthropics/claude-code-action";
      throw Error(`Failed to create workflow file ${n}: ${p.stderr}${m}`);
    }
  }
  async function F5l(e, t, n, r, o = false, s, i, a) {
    try {
      logEvent("tengu_setup_github_actions_started", {
        skip_workflow: o,
        has_api_key: !!t,
        using_default_secret_name: n === "ANTHROPIC_API_KEY",
        selected_claude_workflow: s.includes("claude"),
        selected_claude_review_workflow: s.includes("claude-review"),
        ...a
      });
      let l = await execFileNoThrow("gh", ["api", `repos/${e}`, "--jq", ".id"]);
      if (l.code !== 0) {
        throw logEvent("tengu_setup_github_actions_failed", {
          reason: "repo_not_found",
          exit_code: l.code,
          ...a
        }), Error(`Failed to access repository ${e}: ${l.stderr}`);
      }
      let c = await execFileNoThrow("gh", ["api", `repos/${e}`, "--jq", ".default_branch"]);
      if (c.code !== 0) {
        throw logEvent("tengu_setup_github_actions_failed", {
          reason: "failed_to_get_default_branch",
          exit_code: c.code,
          ...a
        }), Error(`Failed to get default branch: ${c.stderr}`);
      }
      let u = c.stdout.trim();
      let d = await execFileNoThrow("gh", ["api", `repos/${e}/git/ref/heads/${u}`, "--jq", ".object.sha"]);
      if (d.code !== 0) {
        throw logEvent("tengu_setup_github_actions_failed", {
          reason: "failed_to_get_branch_sha",
          exit_code: d.code,
          ...a
        }), Error(`Failed to get branch SHA: ${d.stderr}`);
      }
      let p = d.stdout.trim();
      let m = null;
      if (!o) {
        r();
        m = `add-claude-github-actions-${Date.now()}`;
        let f = await execFileNoThrow("gh", ["api", "--method", "POST", `repos/${e}/git/refs`, "-f", `ref=refs/heads/${m}`, "-f", `sha=${p}`]);
        if (f.code !== 0) {
          throw logEvent("tengu_setup_github_actions_failed", {
            reason: "failed_to_create_branch",
            exit_code: f.code,
            ...a
          }), Error(`Failed to create branch: ${f.stderr}`);
        }
        r();
        let h = [];
        if (s.includes("claude")) {
          h.push({
            path: ".github/workflows/claude.yml",
            content: Q9l,
            message: "Claude PR Assistant workflow"
          });
        }
        if (s.includes("claude-review")) {
          h.push({
            path: ".github/workflows/claude-code-review.yml",
            content: e5l,
            message: "Claude Code Review workflow"
          });
        }
        for (let g of h) {
          await c5m(e, m, g.path, g.content, n, g.message, a);
        }
      }
      if (r(), t) {
        let f = await execFileNoThrow("gh", ["secret", "set", n, "--body", t, "--repo", e]);
        if (f.code !== 0) {
          logEvent("tengu_setup_github_actions_failed", {
            reason: "failed_to_set_api_key_secret",
            exit_code: f.code,
            ...a
          });
          let h = `

Need help? Common issues:
` + `\xB7 Permission denied \u2192 Run: gh auth refresh -h github.com -s repo
` + `\xB7 Not authorized \u2192 Ensure you have admin access to the repository
` + "\xB7 For manual setup \u2192 Visit: https://github.com/anthropics/claude-code-action";
          throw Error(`Failed to set API key secret: ${f.stderr || "Unknown error"}${h}`);
        }
      }
      if (!o && m) {
        r();
        let f = `https://github.com/${e}/compare/${u}...${m}?quick_pull=1&title=${encodeURIComponent("Add Claude Code GitHub Workflow")}&body=${encodeURIComponent(Z9l)}`;
        await Ac(f);
      }
      logEvent("tengu_setup_github_actions_completed", {
        skip_workflow: o,
        has_api_key: !!t,
        auth_type: i,
        using_default_secret_name: n === "ANTHROPIC_API_KEY",
        selected_claude_workflow: s.includes("claude"),
        selected_claude_review_workflow: s.includes("claude-review"),
        ...a
      });
      saveGlobalConfig(f => ({
        ...f,
        githubActionSetupCount: (f.githubActionSetupCount ?? 0) + 1
      }));
    } catch (l) {
      if (l instanceof Error && l.message.includes("Failed to")) {
        logForDebugging(`GitHub Actions setup failed: ${l.message}`, {
          level: "error"
        });
      } else if (logEvent("tengu_setup_github_actions_failed", {
        reason: "unexpected_error",
        ...a
      }), l instanceof Error) {
        Oe(l);
      }
      throw l;
    }
  }
  var U5l = __lazy(() => {
    Ot();
    ky();
    je();
    ji();
    Rn();
  });
  function $5l(e) {
    let t = B5l.c(9);
    let {
      warnings: n,
      onContinue: r
    } = e;
    let o;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      o = {
        context: "Confirmation"
      };
      t[0] = o;
    } else {
      o = t[0];
    }
    uo("confirm:yes", r, o);
    let s;
    if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
      s = j0.jsxs(gXd, {
        flexDirection: "column",
        marginBottom: 1,
        children: [j0.jsxs(Text, {
          bold: true,
          children: [vGd.warning, " Setup Warnings"]
        }), j0.jsx(Text, {
          dimColor: true,
          children: "We found some potential issues, but you can continue anyway"
        })]
      });
      t[1] = s;
    } else {
      s = t[1];
    }
    let i;
    if (t[2] !== n) {
      i = n.map(u5m);
      t[2] = n;
      t[3] = i;
    } else {
      i = t[3];
    }
    let a;
    if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
      a = j0.jsx(xt, {
        chord: "enter",
        action: "continue anyway"
      });
      t[4] = a;
    } else {
      a = t[4];
    }
    let l;
    if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
      l = j0.jsx(gXd, {
        marginTop: 1,
        children: j0.jsxs(Text, {
          bold: true,
          color: "permission",
          children: ["Press", " ", a, ", or", " ", j0.jsx(xt, {
            chord: "ctrl+c",
            action: "exit and fix issues",
            format: {
              modCase: "title",
              charCase: "upper"
            }
          })]
        })
      });
      t[5] = l;
    } else {
      l = t[5];
    }
    let c;
    if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
      c = j0.jsx(gXd, {
        marginTop: 1,
        children: j0.jsxs(Text, {
          dimColor: true,
          children: ["You can also try the manual setup steps if needed:", " ", j0.jsx(Text, {
            color: "claude",
            children: "https://github.com/anthropics/claude-code-action/blob/main/docs/setup.md"
          })]
        })
      });
      t[6] = c;
    } else {
      c = t[6];
    }
    let u;
    if (t[7] !== i) {
      u = j0.jsx(j0.Fragment, {
        children: j0.jsxs(_E, {
          children: [s, i, l, c]
        })
      });
      t[7] = i;
      t[8] = u;
    } else {
      u = t[8];
    }
    return u;
  }
  function u5m(e, t) {
    return j0.jsxs(gXd, {
      flexDirection: "column",
      marginBottom: 1,
      children: [j0.jsx(Text, {
        color: "warning",
        bold: true,
        children: e.title
      }), j0.jsx(Text, {
        children: e.message
      }), e.instructions.length > 0 && j0.jsx(gXd, {
        flexDirection: "column",
        marginLeft: 2,
        marginTop: 1,
        children: e.instructions.map(d5m)
      })]
    }, t);
  }
  function d5m(e, t) {
    return j0.jsx(Pw, {
      children: j0.jsx(Text, {
        dimColor: true,
        children: e
      })
    }, t);
  }
  var B5l;
  var j0;
  var H5l = __lazy(() => {
    Loe();
    bs();
    Az();
    et();
    Bs();
    B5l = __toESM(pt(), 1);
    j0 = __toESM(ie(), 1);
  });
  var j5l = {};