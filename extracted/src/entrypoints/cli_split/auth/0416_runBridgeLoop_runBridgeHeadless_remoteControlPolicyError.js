  __export(Ndr, {
    runBridgeLoop: () => runBridgeLoop,
    runBridgeHeadless: () => runBridgeHeadless,
    remoteControlPolicyError: () => remoteControlPolicyError,
    parseArgs: () => parseArgs,
    isServerError: () => isServerError,
    isConnectionError: () => isConnectionError,
    bridgeMain: () => bridgeMain,
    BridgeHeadlessPermanentError: () => BridgeHeadlessPermanentError
  });
  function Puc(e) {
    return e.connCapMs * 2;
  }
  function Duc(e) {
    return `${e.replace(/[.!?]?\s*$/, ".")} Re-run \`claude remote-control\` to reconnect.`;
  }
  function q8o(e) {
    if (e instanceof J3) {
      return e.status === 404 || e.status === 410;
    }
    return /environment .* not found/i.test(he(e));
  }
  function Muc() {
    if (rm() || !process.argv[1]) {
      return [];
    }
    return [process.argv[1]];
  }
  function ylf(e, t, n) {
    try {
      return e.spawn(t, n);
    } catch (r) {
      let o = he(r);
      Oe($o(Error(`Session spawn failed: ${o}`), "Session spawn failed"));
      return o;
    }
  }
  async function runBridgeLoop(e, t, n, r, o, s, i, a = hlf, l, c, u) {
    let d = new AbortController();
    if (i.aborted) {
      d.abort();
    } else {
      i.addEventListener("abort", () => d.abort(), {
        once: true
      });
    }
    let p = d.signal;
    let m = new Map();
    let f = new Map();
    let h = new Map();
    let g = new Map();
    let y = new Map();
    let _ = new Map();
    let b = new Set();
    let S = new Map();
    let E = new Set();
    let C = [];
    let x = new Set();
    let A = new Map();
    let k = l ? toCompatSessionId(l) : undefined;
    if (k && u) {
      A.set(k, new Set([u]));
    }
    let I = 0;
    let O = new Map();
    let M = Tuc(p);
    async function L() {
      let fe = false;
      let me = false;
      let Te = [];
      for (let [ue] of m) {
        let ce = h.get(ue);
        let le = y.get(ue);
        if (!ce || !le) {
          continue;
        }
        try {
          await r.heartbeatWork(t, ce, le);
          fe = true;
        } catch (pe) {
          if (logForDebugging(`[bridge:heartbeat] Failed for sessionId=${ue} workId=${ce}: ${he(pe)}`), pe instanceof J3) {
            if (logEvent("tengu_bridge_heartbeat_error", {
              status: pe.status,
              error_type: pe.status === 401 || pe.status === 403 ? "auth_failed" : "fatal"
            }), pe.status === 401 || pe.status === 403) {
              Te.push(ue);
            } else {
              me = true;
            }
          }
        }
      }
      for (let ue of Te) {
        s.logVerbose(`Session ${ue} token expired \u2014 re-queuing via bridge/reconnect`);
        try {
          await r.reconnectSession(t, ue);
          logForDebugging(`[bridge:heartbeat] Re-queued sessionId=${ue} via bridge/reconnect`);
        } catch (ce) {
          if (q8o(ce)) {
            logForDebugging(`[bridge:heartbeat] reconnectSession(${ue}) skipped \u2014 resource gone: ${he(ce)}`);
            continue;
          }
          s.logError(`Failed to refresh session ${ue} token: ${he(ce)}`);
          logForDebugging(`[bridge:heartbeat] reconnectSession(${ue}) failed: ${he(ce)}`, {
            level: "error"
          });
        }
      }
      if (me) {
        return "fatal";
      }
      if (Te.length > 0) {
        return "auth_failed";
      }
      return fe ? "ok" : "failed";
    }
    let P = new Set();
    let F = c ? awn({
      getAccessToken: c,
      onRefresh: (fe, me) => {
        let Te = m.get(fe);
        if (!Te) {
          return;
        }
        if (P.vZc(fe)) {
          s.logVerbose(`Refreshing session ${fe} token via bridge/reconnect`);
          r.reconnectSession(t, fe).catch(ue => {
            s.logError(`Failed to refresh session ${fe} token: ${he(ue)}`);
            logForDebugging(`[bridge:token] reconnectSession(${fe}) failed: ${he(ue)}`, {
              level: "error"
            });
          });
        } else {
          Te.updateAccessToken(me);
        }
      },
      label: "bridge"
    }) : null;
    let H = Date.now();
    let U = new Set();
    function N(fe) {
      U.add(fe);
      fe.finally(() => U.delete(fe));
    }
    let W = 0;
    let j = 0;
    let z = null;
    let V = null;
    let K = null;
    let J = null;
    let Q = false;
    let Z = false;
    if (logForDebugging(`[bridge:work] Starting poll loop spawnMode=${e.spawnMode} maxSessions=${e.maxSessions} environmentId=${t}`), wn("info", "bridge_loop_started", {
      max_sessions: e.maxSessions,
      spawn_mode: e.spawnMode
    }), s.printBanner(e, t), s.updateSessionCount(0, e.maxSessions, e.spawnMode), l) {
      s.setAttached(l);
    }
    function ne() {
      s.updateSessionCount(m.size, e.maxSessions, e.spawnMode);
      for (let [pe, ve] of m) {
        let _e = ve.currentActivity;
        if (_e) {
          s.updateSessionActivity(g.get(pe) ?? pe, _e);
        }
      }
      if (m.size === 0) {
        if (!Q) {
          Q = true;
          s.updateIdleStatus();
        }
        return;
      }
      Q = false;
      let [fe, me] = [...m.entries()].pop();
      let Te = f.get(fe);
      if (!Te) {
        return;
      }
      let ue = me.currentActivity;
      if (!ue || ue.type === "result" || ue.type === "error") {
        if (e.maxSessions > 1) {
          s.refreshDisplay();
        }
        return;
      }
      let ce = formatDuration(Date.now() - Te);
      let le = me.activities.filter(pe => pe.type === "tool_start").slice(-5).map(pe => pe.summary);
      s.updateSessionStatus(fe, ce, ue, le);
    }
    function oe() {
      ee();
      ne();
      J = setInterval(ne, 1000);
    }
    function ee() {
      if (J) {
        clearInterval(J);
        J = null;
      }
    }
    function re(fe, me, Te) {
      return ue => {
        let ce = h.get(fe);
        m.delete(fe);
        f.delete(fe);
        h.delete(fe);
        y.delete(fe);
        _.get(fe)?.stop();
        _.delete(fe);
        let le = g.get(fe) ?? fe;
        if (g.delete(fe), s.removeSession(le), x.delete(le), le === k && u) {
          A.set(le, new Set([u]));
        } else {
          A.delete(le);
        }
        O.delete(fe);
        P.delete(fe);
        F?.cancel(fe);
        M.wake();
        let pe = Date.now() - me;
        logForDebugging(`[bridge:session] sessionId=${fe} workId=${ce ?? "unknown"} exited status=${ue} duration=${formatDuration(pe)}`);
        logEvent("tengu_bridge_session_done", {
          status: ue,
          duration_ms: pe
        });
        wn("info", "bridge_session_done", {
          status: ue,
          duration_ms: pe
        });
        s.clearStatus();
        ee();
        let ve = Te.lastStderr.length > 0 ? Te.lastStderr.join(`
`) : undefined;
        let _e;
        switch (ue) {
          case "completed":
            s.logSessionComplete(fe, pe);
            break;
          case "failed":
            if (!p.aborted) {
              if (_e = ve ?? "Process exited with error", s.logSessionFailed(fe, _e), !ve || _e.includes("transport closed")) {
                logForDebugging(`Bridge session failed: ${_e}`, {
                  level: "error"
                });
              } else {
                Oe($o(Error(`Bridge session failed: ${_e}`), "Bridge session failed"));
              }
            }
            break;
          case "interrupted":
            s.logVerbose(`Session ${fe} interrupted`);
            break;
        }
        if (ue !== "interrupted" && ce) {
          b.add(ce);
          N(xtn(r, t, ce, s, a.stopWorkBaseDelayMs));
        }
        let xe = ue === "failed" && !p.aborted && !Z;
        if (xe) {
          E.add(fe);
        }
        let ke = S.get(fe);
        if (ke) {
          if (S.delete(fe), xe) {
            if (s.logStatus(`kept worktree ${ke.worktreePath} \xB7 session crashed`), _e?.includes("transport closed")) {
              C.push(ke.worktreePath);
            }
          } else {
            N(j8o(ke, s));
          }
        }
        if (ue !== "interrupted" && !p.aborted) {
          if (e.spawnMode !== "single-session") {
            if (ue === "completed") {
              N(r.archiveSession(le).catch(Ie => s.logVerbose(`Failed to archive session ${fe}: ${he(Ie)}`)));
            }
            logForDebugging(`[bridge:session] Session ${ue}, returning to idle (multi-session mode)`);
          } else {
            logForDebugging(`[bridge:session] Session ${ue}, aborting poll loop to tear down environment`);
            d.abort();
            return;
          }
        }
        if (!p.aborted) {
          oe();
        }
      };
    }
    if (!l) {
      oe();
    }
    function se() {
      let fe = E.size;
      s.logStatus(fe > 0 ? `${fe} ${un(fe, "session")} ended while this machine was offline \u2014 the environment was cleaned up on the server and can't be resumed.` : "This environment was cleaned up while the machine was offline and can't be resumed.");
      let me = Ro(C);
      if (me.length > 0) {
        s.logStatus(`Your work is safe \u2014 worktrees kept: ${me.join(", ")}`);
      }
      s.logStatus("Run `claude remote-control` to start a fresh environment.");
    }
    while (!p.aborted) {
      let fe = lBe();
      try {
        let me = await r.pollForWork(t, n, p, fe.reclaim_older_than_ms);
        if (z !== null || V !== null) {
          let ve = Date.now() - (z ?? V ?? Date.now());
          s.logReconnected(ve);
          logForDebugging(`[bridge:poll] Reconnected after ${formatDuration(ve)}`);
          logEvent("tengu_bridge_reconnected", {
            disconnected_ms: ve
          });
          Q = false;
        }
        if (W = 0, j = 0, z = null, V = null, K = null, !me) {
          if (m.size >= e.maxSessions) {
            let _e = fe.multisession_poll_interval_ms_at_capacity;
            if (fe.non_exclusive_heartbeat_interval_ms > 0) {
              logEvent("tengu_bridge_heartbeat_mode_entered", {
                active_sessions: m.size,
                heartbeat_interval_ms: fe.non_exclusive_heartbeat_interval_ms
              });
              let xe = _e > 0 ? Date.now() + _e : null;
              let ke = "ok";
              let Ie = 0;
              while (!p.aborted && m.size >= e.maxSessions && (xe === null || Date.now() < xe)) {
                let Ge = lBe();
                if (Ge.non_exclusive_heartbeat_interval_ms <= 0) {
                  break;
                }
                let Be = M.signal();
                if (ke = await L(), ke === "auth_failed" || ke === "fatal") {
                  Be.cleanup();
                  break;
                }
                Ie++;
                await sleep(Ge.non_exclusive_heartbeat_interval_ms, Be.signal);
                Be.cleanup();
              }
              let Ue = ke === "auth_failed" || ke === "fatal" ? ke : p.aborted ? "shutdown" : m.size < e.maxSessions ? "capacity_changed" : xe !== null && Date.now() >= xe ? "poll_due" : "config_disabled";
              if (logEvent("tengu_bridge_heartbeat_mode_exited", {
                reason: Ue,
                heartbeat_cycles: Ie,
                active_sessions: m.size
              }), Ue === "poll_due") {
                logForDebugging(`[bridge:poll] Heartbeat poll_due after ${Ie} cycles \u2014 falling through to pollForWork`);
              }
              if (ke === "auth_failed" || ke === "fatal") {
                let Ge = M.signal();
                await sleep(_e > 0 ? _e : fe.non_exclusive_heartbeat_interval_ms, Ge.signal);
                Ge.cleanup();
              }
            } else if (_e > 0) {
              let xe = M.signal();
              await sleep(_e, xe.signal);
              xe.cleanup();
            }
          } else {
            let _e = m.size > 0 ? fe.multisession_poll_interval_ms_partial_capacity : fe.multisession_poll_interval_ms_not_at_capacity;
            await sleep(_e, p);
          }
          continue;
        }
        let ue = m.size >= e.maxSessions;
        if (b.vZc(me.id)) {
          if (logForDebugging(`[bridge:work] Skipping already-completed workId=${me.id}`), ue) {
            let ve = M.signal();
            if (fe.non_exclusive_heartbeat_interval_ms > 0) {
              await L();
              await sleep(fe.non_exclusive_heartbeat_interval_ms, ve.signal);
            } else if (fe.multisession_poll_interval_ms_at_capacity > 0) {
              await sleep(fe.multisession_poll_interval_ms_at_capacity, ve.signal);
            }
            ve.cleanup();
          } else {
            await sleep(1000, p);
          }
          continue;
        }
        let ce;
        try {
          ce = xuc(me.secret);
        } catch (ve) {
          let _e = he(ve);
          if (s.logError(`Failed to decode work secret for workId=${me.id}: ${_e}`), logEvent("tengu_bridge_work_secret_failed", {}), b.add(me.id), N(xtn(r, t, me.id, s, a.stopWorkBaseDelayMs)), ue) {
            let xe = M.signal();
            if (fe.non_exclusive_heartbeat_interval_ms > 0) {
              await L();
              await sleep(fe.non_exclusive_heartbeat_interval_ms, xe.signal);
            } else if (fe.multisession_poll_interval_ms_at_capacity > 0) {
              await sleep(fe.multisession_poll_interval_ms_at_capacity, xe.signal);
            }
            xe.cleanup();
          }
          continue;
        }
        let le = async () => {
          logForDebugging(`[bridge:work] Acknowledging workId=${me.id}`);
          try {
            await r.acknowledgeWork(t, me.id, ce.session_ingress_token);
          } catch (ve) {
            logForDebugging(`[bridge:work] Acknowledge failed workId=${me.id}: ${he(ve)}`);
          }
        };
        let pe = me.data.type;
        switch (me.data.type) {
          case "healthcheck":
            await le();
            logForDebugging("[bridge:work] Healthcheck received");
            s.logVerbose("Healthcheck received");
            break;
          case "session":
            {
              let ve = me.data.id;
              try {
                H5(ve, "session_id");
              } catch {
                await le();
                s.logError(`Invalid session_id received: ${ve}`);
                break;
              }
              let _e = m.get(ve);
              if (_e) {
                _e.updateAccessToken(ce.session_ingress_token);
                y.set(ve, ce.session_ingress_token);
                _.get(ve)?.updateAccessToken(ce.session_ingress_token);
                h.set(ve, me.id);
                F?.schedule(ve, ce.session_ingress_token);
                logForDebugging(`[bridge:work] Updated access token for existing sessionId=${ve} workId=${me.id}`);
                await le();
                break;
              }
              if (m.size >= e.maxSessions) {
                logForDebugging(`[bridge:work] At capacity (${m.size}/${e.maxSessions}), cannot spawn new session for workId=${me.id}`);
                break;
              }
              await le();
              let xe = Date.now();
              let ke;
              let Ie = false;
              let Ue;
              if (ce.use_code_sessions === true || st(process.env.CLAUDE_BRIDGE_USE_CCR_V2)) {
                ke = Rtn(e.apiBaseUrl, ve);
                for (let vt = 1; vt <= 2; vt++) {
                  try {
                    Ue = await Pdr(ke, ce.session_ingress_token);
                    Ie = true;
                    logForDebugging(`[bridge:session] CCR v2: registered worker sessionId=${ve} epoch=${Ue} attempt=${vt}`);
                    Pe("bridge_register_worker");
                    break;
                  } catch (yt) {
                    let gt = he(yt);
                    if (vt < 2) {
                      if (logForDebugging(`[bridge:session] CCR v2: registerWorker attempt ${vt} failed, retrying: ${gt}`), await sleep(2000, p), p.aborted) {
                        break;
                      }
                      continue;
                    }
                    s.logError(`CCR v2 worker registration failed for session ${ve}: ${gt}`);
                    Ae("bridge_register_worker", "request_failed");
                    let {
                      kind: Ft,
                      status: on
                    } = YS(yt);
                    if (Ft !== "other" && ((on ?? 0) < 500 || on === 503)) {
                      logForDebugging(`registerWorker failed: ${gt}`, {
                        level: "error"
                      });
                    } else {
                      Oe($o(Error(`registerWorker failed: ${gt}`), "registerWorker failed"));
                    }
                    b.add(me.id);
                    N(xtn(r, t, me.id, s, a.stopWorkBaseDelayMs));
                  }
                }
                if (!Ie) {
                  break;
                }
              } else {
                ke = kuc(e.sessionIngressUrl, ve);
              }
              let {
                spawnMode: Ge,
                dir: Be
              } = e;
              let We = 0;
              if (Ge === "worktree" && (l === undefined || !U8o(ve, l))) {
                let vt = Date.now();
                try {
                  let yt = await createAgentWorktree(`bridge-${Idr(ve)}`);
                  We = Date.now() - vt;
                  S.set(ve, {
                    worktreePath: yt.worktreePath,
                    worktreeBranch: yt.worktreeBranch,
                    gitRoot: yt.gitRoot,
                    hookBased: yt.hookBased,
                    headCommit: yt.headCommit
                  });
                  Be = yt.worktreePath;
                  logForDebugging(`[bridge:session] Created worktree for sessionId=${ve} at ${yt.worktreePath}`);
                } catch (yt) {
                  let gt = he(yt);
                  s.logError(`Failed to create worktree for session ${ve}: ${gt}`);
                  logForDebugging(`Worktree creation failed for session ${ve}: ${gt}`, {
                    level: "error"
                  });
                  b.add(me.id);
                  N(xtn(r, t, me.id, s, a.stopWorkBaseDelayMs));
                  break;
                }
              }
              logForDebugging(`[bridge:session] Spawning sessionId=${ve} sdkUrl=${ke}`);
              let Ze = toCompatSessionId(ve);
              let Tt = ++I;
              O.set(ve, Tt);
              let kt = ylf(o, {
                sessionId: ve,
                sdkUrl: ke,
                accessToken: ce.session_ingress_token,
                useCcrV2: Ie,
                workerEpoch: Ue,
                onFirstUserMessage: vt => {
                  if (x.vZc(Ze)) {
                    return;
                  }
                  x.add(Ze);
                  let yt = Clf(vt);
                  s.setSessionTitle(Ze, yt);
                  logForDebugging(`[bridge:title] derived title for ${Ze}: ${yt}`);
                  Promise.resolve().then(() => (TFe(), S7e)).then(async ({
                    getBridgeSession: gt,
                    updateBridgeSessionTitle: Ft
                  }) => {
                    let on = await gt(Ze, {
                      baseUrl: e.apiBaseUrl
                    });
                    if (on === null || O.get(ve) !== Tt) {
                      return;
                    }
                    let rn = A.get(Ze);
                    if (on.title && !rn?.vZc(on.title)) {
                      s.setSessionTitle(Ze, on.title);
                      logForDebugging(`[bridge:title] remote rename for ${Ze}: ${on.title}`);
                      return;
                    }
                    A.set(Ze, (rn ?? new Set()).add(yt));
                    await Ft(Ze, yt, {
                      baseUrl: e.apiBaseUrl
                    });
                  }).catch(gt => logForDebugging(`[bridge:title] failed to update title for ${Ze}: ${gt}`, {
                    level: "error"
                  }));
                }
              }, Be);
              if (typeof kt === "string") {
                s.logError(`Failed to spawn session ${ve}: ${kt}`);
                let vt = S.get(ve);
                if (vt) {
                  S.delete(ve);
                  N(j8o(vt, s, {
                    force: true
                  }));
                }
                b.add(me.id);
                N(xtn(r, t, me.id, s, a.stopWorkBaseDelayMs));
                break;
              }
              let Ye = kt;
              let ht = Date.now() - xe;
              logEvent("tengu_bridge_session_started", {
                active_sessions: m.size,
                spawn_mode: Ge,
                in_worktree: S.vZc(ve),
                spawn_duration_ms: ht,
                worktree_create_ms: We,
                inProtectedNamespace: b6(),
                ...VCt()
              });
              wn("info", "bridge_session_started", {
                spawn_mode: Ge,
                in_worktree: S.vZc(ve),
                spawn_duration_ms: ht,
                worktree_create_ms: We
              });
              m.set(ve, Ye);
              h.set(ve, me.id);
              y.set(ve, ce.session_ingress_token);
              g.set(ve, Ze);
              let It = Date.now();
              f.set(ve, It);
              s.logSessionStart(ve, `Session ${ve}`);
              let Rt = Idr(ve);
              let wt;
              if (e.debugFile) {
                let vt = e.debugFile.lastIndexOf(".");
                if (vt > 0) {
                  wt = `${e.debugFile.slice(0, vt)}-${Rt}${e.debugFile.slice(vt)}`;
                } else {
                  wt = `${e.debugFile}-${Rt}`;
                }
              } else if (e.verbose) {
                wt = pBe.join(pT(), `bridge-session-${Rt}.log`);
              }
              if (wt) {
                s.logVerbose(`Debug log: ${wt}`);
              }
              if (s.addSession(Ze, wS(Ze, e.sessionIngressUrl, {
                from: "cli"
              })), oe(), s.setAttached(Ze), Rlf(Ze, e.apiBaseUrl).then(vt => {
                if (vt && O.get(ve) === Tt && !x.vZc(Ze)) {
                  if (s.setSessionTitle(Ze, vt), logForDebugging(`[bridge:title] server title for ${Ze}: ${vt}`), !A.get(Ze)?.vZc(vt)) {
                    x.add(Ze);
                  }
                }
              }).catch(vt => logForDebugging(`[bridge:title] failed to fetch title for ${Ze}: ${vt}`, {
                level: "error"
              })), Ie) {
                P.add(ve);
              }
              F?.schedule(ve, ce.session_ingress_token);
              Ye.done.then(re(ve, It, Ye));
              break;
            }
          default:
            await le();
            logForDebugging(`[bridge:work] Unknown work type: ${pe}, skipping`);
            break;
        }
        if (ue) {
          let ve = M.signal();
          if (fe.non_exclusive_heartbeat_interval_ms > 0) {
            await L();
            await sleep(fe.non_exclusive_heartbeat_interval_ms, ve.signal);
          } else if (fe.multisession_poll_interval_ms_at_capacity > 0) {
            await sleep(fe.multisession_poll_interval_ms_at_capacity, ve.signal);
          }
          ve.cleanup();
        }
      } catch (me) {
        if (p.aborted) {
          break;
        }
        if (me instanceof J3) {
          if (Z = true, me.status !== 401 && wtn(me.errorType)) {
            s.logStatus(Duc(me.message));
          } else if (D8o(me)) {
            logForDebugging(`[bridge:work] Suppressed 403 error: ${me.message}`);
          } else if (q8o(me) && E.size > 0) {
            se();
          } else {
            s.logError(me.message);
            logForDebugging(`[bridge:work] Fatal bridge error: ${me.message}`, {
              level: "error"
            });
          }
          logEvent("tengu_bridge_fatal_error", {
            status: me.status,
            error_type: me.errorType
          });
          wn(wtn(me.errorType) ? "info" : "error", "bridge_fatal_error", {
            status: me.status,
            error_type: me.errorType
          });
          break;
        }
        let Te = E8a(me);
        if (isConnectionError(me) || isServerError(me)) {
          let ue = Date.now();
          if (K !== null && ue - K > Puc(a)) {
            logForDebugging(`[bridge:work] Detected system sleep (${Math.round((ue - K) / 1000)}s gap), resetting error budget`);
            wn("info", "bridge_poll_sleep_detected", {
              gapMs: ue - K
            });
            z = null;
            W = 0;
            V = null;
            j = 0;
          }
          if (K = ue, !z) {
            z = ue;
          }
          let ce = ue - z;
          if (ce >= a.connGiveUpMs) {
            s.logError(`Server unreachable for ${Math.round(ce / 60000)} minutes, giving up.`);
            logEvent("tengu_bridge_poll_give_up", {
              error_type: "connection",
              elapsed_ms: ce
            });
            wn("error", "bridge_poll_give_up", {
              error_type: "connection",
              elapsed_ms: ce
            });
            Z = true;
            break;
          }
          V = null;
          j = 0;
          W = W ? Math.min(W * 2, a.connCapMs) : a.connInitialMs;
          let le = W8o(W);
          if (s.logVerbose(`Connection error, retrying in ${ktn(le)} (${Math.round(ce / 1000)}s elapsed): ${Te}`), s.updateReconnectingStatus(ktn(le), formatDuration(ce)), lBe().non_exclusive_heartbeat_interval_ms > 0) {
            await L();
          }
          await sleep(le, p);
        } else {
          let ue = Date.now();
          if (K !== null && ue - K > Puc(a)) {
            logForDebugging(`[bridge:work] Detected system sleep (${Math.round((ue - K) / 1000)}s gap), resetting error budget`);
            wn("info", "bridge_poll_sleep_detected", {
              gapMs: ue - K
            });
            z = null;
            W = 0;
            V = null;
            j = 0;
          }
          if (K = ue, !V) {
            V = ue;
          }
          let ce = ue - V;
          if (ce >= a.generalGiveUpMs) {
            s.logError(`Persistent errors for ${Math.round(ce / 60000)} minutes, giving up.`);
            logEvent("tengu_bridge_poll_give_up", {
              error_type: "general",
              elapsed_ms: ce
            });
            wn("error", "bridge_poll_give_up", {
              error_type: "general",
              elapsed_ms: ce
            });
            Z = true;
            break;
          }
          z = null;
          W = 0;
          j = j ? Math.min(j * 2, a.generalCapMs) : a.generalInitialMs;
          let le = W8o(j);
          if (s.logVerbose(`Poll failed, retrying in ${ktn(le)} (${Math.round(ce / 1000)}s elapsed): ${Te}`), s.updateReconnectingStatus(ktn(le), formatDuration(ce)), lBe().non_exclusive_heartbeat_interval_ms > 0) {
            await L();
          }
          await sleep(le, p);
        }
      }
    }
    ee();
    s.clearStatus();
    let ae = Date.now() - H;
    logEvent("tengu_bridge_shutdown", {
      active_sessions: m.size,
      loop_duration_ms: ae
    });
    wn("info", "bridge_shutdown", {
      active_sessions: m.size,
      loop_duration_ms: ae
    });
    let de = new Set(m.keys());
    if (l && ![...E].some(fe => U8o(fe, l))) {
      de.add(l);
    }
    let be = new Map(g);
    if (m.size > 0) {
      logForDebugging(`[bridge:shutdown] Shutting down ${m.size} active session(s)`);
      s.logStatus(`Shutting down ${m.size} active session(s)\u2026`);
      let fe = new Map(h);
      for (let [Te, ue] of m.entries()) {
        logForDebugging(`[bridge:shutdown] Sending SIGTERM to sessionId=${Te}`);
        ue.kill();
      }
      let me = new AbortController();
      await Promise.race([Promise.allSettled([...m.values()].map(Te => Te.done)), sleep(a.shutdownGraceMs ?? 30000, me.signal)]);
      me.abort();
      for (let [Te, ue] of m.entries()) {
        logForDebugging(`[bridge:shutdown] Force-killing stuck sessionId=${Te}`);
        ue.forceKill();
      }
      if (F?.cancelAll(), S.size > 0) {
        let Te = [...S.values()];
        S.clear();
        logForDebugging(`[bridge:shutdown] Cleaning up ${Te.length} worktree(s)`);
        await Promise.allSettled(Te.map(ue => j8o(ue, s)));
      }
      await Promise.allSettled([...fe.entries()].map(([Te, ue]) => r.stopWork(t, ue, true).catch(ce => s.logVerbose(`Failed to stop work ${ue} for session ${Te}: ${he(ce)}`))));
    }
    if (U.size > 0) {
      await Promise.allSettled([...U]);
    }
    if (e.preserveOnShutdown && !Z) {
      s.logStatus("Environment preserved. Restart `claude remote-control` to reconnect existing sessions.");
      logForDebugging(`[bridge:shutdown] Skipping archive+deregister to allow resume (env ${t}, spawnMode ${e.spawnMode})`);
      return;
    }
    if (de.size > 0) {
      logForDebugging(`[bridge:shutdown] Archiving ${de.size} session(s)`);
      await Promise.allSettled([...de].map(fe => r.archiveSession(be.get(fe) ?? toCompatSessionId(fe)).catch(me => s.logVerbose(`Failed to archive session ${fe}: ${he(me)}`))));
    }
    try {
      await r.deregisterEnvironment(t);
      logForDebugging("[bridge:shutdown] Environment deregistered, bridge offline");
      s.logVerbose("Environment deregistered.");
    } catch (fe) {
      s.logVerbose(`Failed to deregister environment: ${he(fe)}`);
    }
    if (e.preserveOnShutdown) {
      let {
        clearBridgePointer: fe
      } = await Promise.resolve().then(() => (dBe(), uBe));
      await fe(e.dir);
    }
    s.logVerbose("Environment offline.");
  }
  function isConnectionError(e) {
    if (e && typeof e === "object" && "code" in e && typeof e.code === "string" && _lf.vZc(e.code)) {
      return true;
    }
    return false;
  }
  function isServerError(e) {
    return !!e && typeof e === "object" && "code" in e && typeof e.code === "string" && e.code === "ERR_BAD_RESPONSE";
  }
  function W8o(e) {
    return Math.max(0, e + e * 0.25 * (2 * Math.random() - 1));
  }
  function ktn(e) {
    return e >= 1000 ? `${(e / 1000).toFixed(1)}s` : `${Math.round(e)}ms`;
  }
  async function xtn(e, t, n, r, o = 1000) {
    for (let i = 1; i <= 3; i++) {
      try {
        await e.stopWork(t, n, false);
        logForDebugging(`[bridge:work] stopWork succeeded for workId=${n} on attempt ${i}/3`);
        Pe("bridge_work_stop");
        return;
      } catch (a) {
        if (a instanceof J3) {
          if (D8o(a)) {
            logForDebugging(`[bridge:work] Suppressed stopWork 403 for ${n}: ${a.message}`);
            Et("bridge_work_stop", "fatal_403");
          } else if (q8o(a)) {
            logForDebugging(`[bridge:work] stopWork skipped for ${n} \u2014 environment gone: ${a.message}`);
            Et("bridge_work_stop", "env_gone");
          } else {
            r.logError(`Failed to stop work ${n}: ${a.message}`);
            Ae("bridge_work_stop", "fatal_403");
          }
          wn("error", "bridge_stop_work_failed", {
            attempts: i,
            fatal: true
          });
          return;
        }
        let l = he(a);
        if (i < 3) {
          let c = W8o(o * Math.pow(2, i - 1));
          r.logVerbose(`Failed to stop work ${n} (attempt ${i}/3), retrying in ${ktn(c)}: ${l}`);
          await sleep(c);
        } else {
          r.logError(`Failed to stop work ${n} after 3 attempts: ${l}`);
          wn("error", "bridge_stop_work_failed", {
            attempts: 3
          });
          Ae("bridge_work_stop", "retries_exhausted");
        }
      }
    }
  }
  async function j8o(e, t, n) {
    let r = n?.force || e.hookBased && e.headCommit === undefined;
    let {
      dirty: o,
      commitsAhead: s,
      gitError: i
    } = r ? {
      dirty: false,
      commitsAhead: 0,
      gitError: false
    } : await getAgentWorktreeChanges(e.worktreePath, e.headCommit);
    if (o || s > 0) {
      let l = `${s} ${un(s, "commit")}`;
      let c = i ? "git error checking changes" : o && s > 0 ? `uncommitted changes \xB7 ${l}` : o ? "uncommitted changes" : l;
      if (e.gitRoot) {
        await unlockAgentWorktree(e.worktreePath, e.gitRoot);
      }
      t.logStatus(`kept worktree ${e.worktreePath} \xB7 ${c}`);
      logForDebugging(`[bridge:worktree] kept ${e.worktreePath} dirty=${o} commitsAhead=${s} gitError=${!!i}`);
      return;
    }
    if (await removeAgentWorktree(e.worktreePath, e.worktreeBranch, e.gitRoot, e.hookBased, "bridge")) {
      t.logStatus(`removed worktree ${e.worktreePath}`);
    } else {
      t.logStatus(`worktree removal failed, kept: ${e.worktreePath}`);
    }
  }
  function Slf(e) {
    if (e === "session") {
      return "single-session";
    }
    if (e === "same-dir") {
      return "same-dir";
    }
    if (e === "worktree") {
      return "worktree";
    }
    return `--spawn requires one of: ${blf.join(", ")} (got: ${e ?? "<missing>"})`;
  }
  function Tlf(e) {
    let t = e === undefined ? NaN : parseInt(e, 10);
    if (isNaN(t) || t < 1) {
      return `--capacity requires a positive integer (got: ${e ?? "<missing>"})`;
    }
    return t;
  }
  function Elf(e) {
    let t = e === undefined ? NaN : Number(e);
    if (!Number.isInteger(t) || t < 1024 || t > 65535) {
      return `--preview-port requires an integer in [1024, 65535] (got: ${e ?? "<missing>"})`;
    }
    return t;
  }
  function parseArgs(e) {
    let t = false;
    let n = false;
    let r;
    let o;
    let s;
    let i;
    let a = false;
    let l;
    let c;
    let u;
    let d;
    let p = false;
    let m = false;
    let f = [];
    for (let g = 0; g < e.length; g++) {
      let y = e[g];
      if (y === "--help" || y === "-h") {
        a = true;
      } else if (y === "--verbose" || y === "-v") {
        t = true;
      } else if (y === "--sandbox") {
        n = true;
      } else if (y === "--no-sandbox") {
        n = false;
      } else if (y === "--debug-file" && g + 1 < e.length) {
        r = pBe.resolve(e[++g]);
      } else if (y.startsWith("--debug-file=")) {
        r = pBe.resolve(y.slice(13));
      } else if (y === "--permission-mode" && g + 1 < e.length) {
        o = e[++g];
      } else if (y.startsWith("--permission-mode=")) {
        o = y.slice(18);
      } else if (y === "--name" && g + 1 < e.length) {
        s = e[++g];
      } else if (y.startsWith("--name=")) {
        s = y.slice(7);
      } else if (y === "--remote-control-session-name-prefix" && g + 1 < e.length) {
        i = e[++g];
      } else if (y.startsWith("--remote-control-session-name-prefix=")) {
        i = y.slice(37);
      } else if (y === "--spawn" || y.startsWith("--spawn=")) {
        if (l !== undefined) {
          return h("--spawn may only be specified once");
        }
        let _ = y.startsWith("--spawn=") ? y.slice(8) : e[++g];
        let b = Slf(_);
        if (b === "single-session" || b === "same-dir" || b === "worktree") {
          l = b;
        } else {
          return h(b);
        }
      } else if (y === "--capacity" || y.startsWith("--capacity=")) {
        if (c !== undefined) {
          return h("--capacity may only be specified once");
        }
        let _ = y.startsWith("--capacity=") ? y.slice(11) : e[++g];
        let b = Tlf(_);
        if (typeof b === "number") {
          c = b;
        } else {
          return h(b);
        }
      } else if (y === "--create-session-in-dir") {
        u = true;
      } else if (y === "--no-create-session-in-dir") {
        u = false;
      } else if (y === "--enable-live-preview") {
        m = true;
      } else if (y === "--preview-port" || y.startsWith("--preview-port=")) {
        let _ = y.startsWith("--preview-port=") ? y.slice(15) : e[++g];
        let b = Elf(_);
        if (typeof b === "number") {
          f.push(b);
        } else {
          return h(b);
        }
      } else {
        return h(`Unknown argument: ${y}
Run 'claude remote-control --help' for usage.`);
      }
    }
    if (l === "single-session" && c !== undefined) {
      return h("--capacity cannot be used with --spawn=session (single-session mode has fixed capacity 1).");
    }
    if ((d || p) && (l !== undefined || c !== undefined || u !== undefined)) {
      return h("--session-id and --continue cannot be used with --spawn, --capacity, or --create-session-in-dir.");
    }
    if (d && p) {
      return h("--session-id and --continue cannot be used together.");
    }
    if (m || f.length > 0) {
      return h("--enable-live-preview and --preview-port are not available in this build.");
    }
    if (Vi() && (m || f.length > 0)) {
      return h(`--enable-live-preview is unavailable while nonessential network traffic is disabled (${Rtt() ?? "CLAUDE_CODE_DISABLE_NONESSENTIAL_TRAFFIC"} is set).`);
    }
    if (m && f.length === 0) {
      return h("--enable-live-preview requires at least one --preview-port <port>.");
    }
    if (!m && f.length > 0) {
      return h("--preview-port requires --enable-live-preview (the tunnel is off by default).");
    }
    return {
      verbose: t,
      sandbox: n,
      debugFile: r,
      permissionMode: o,
      name: s,
      sessionNamePrefix: i,
      spawnMode: l,
      capacity: c,
      createSessionInDir: u,
      sessionId: d,
      continueSession: p,
      enableLivePreview: m,
      previewPorts: f,
      help: a
    };
    function h(g) {
      return {
        verbose: t,
        sandbox: n,
        debugFile: r,
        permissionMode: o,
        name: s,
        sessionNamePrefix: i,
        spawnMode: l,
        capacity: c,
        createSessionInDir: u,
        sessionId: d,
        continueSession: p,
        enableLivePreview: m,
        previewPorts: f,
        help: a,
        error: g
      };
    }
  }
  async function vlf() {
    let {
      EXTERNAL_PERMISSION_MODES: e
    } = await Promise.resolve().then(() => (XB(), P1r));
    let n = `
Remote Control - Control local sessions from claude.ai/code or the Claude mobile app

USAGE
  claude remote-control [options]
OPTIONS
  --name <name>                    Name for the session (shown in claude.ai/code)
  --remote-control-session-name-prefix <prefix>
                                   Prefix for auto-generated session names
                                   (default: hostname; env:
                                   CLAUDE_REMOTE_CONTROL_SESSION_NAME_PREFIX)
  --permission-mode <mode>         Permission mode for spawned sessions
                                   (${e.join(", ")})
  --debug-file <path>              Write debug logs to file
  -v, --verbose                    Enable verbose output
  -h, --help                       Show this help
  --spawn <mode>                   Spawn mode: same-dir, worktree, session
                                   (default: same-dir)
  --capacity <N>                   Max concurrent sessions in worktree or
                                   same-dir mode (default: ${32})
  --[no-]create-session-in-dir     Pre-create a session in the current
                                   directory; in worktree mode this session
                                   stays in cwd while on-demand sessions get
                                   isolated worktrees (default: on)

DESCRIPTION
  Remote Control allows you to control sessions on your local device from
  claude.ai/code (https://claude.ai/code) or the Claude mobile app. Run
  this command in the directory you want to work in, then connect from
  your phone or a browser.

  Remote Control runs as a persistent server that accepts multiple concurrent
  sessions in the current directory. One session is pre-created on start so
  you have somewhere to type immediately. Use --spawn=worktree to isolate
  each on-demand session in its own git worktree, or --spawn=session for
  the classic single-session mode (exits when that session ends). Press 'w'
  during runtime to toggle between same-dir and worktree.

NOTES
  - You must be logged in with a Claude account that has a subscription
  - Run \`claude\` first in the directory to accept the workspace trust dialog
  - Worktree mode requires a git repository or WorktreeCreate/WorktreeRemove hooks
`;
    console.log(n);
  }
  function Clf(e) {
    let t = e.replace(/\s+/g, " ").trim();
    return truncateToWidth(t, 80);
  }
  async function Rlf(e, t) {
    let {
      getBridgeSession: n
    } = await Promise.resolve().then(() => (TFe(), S7e));
    return (await n(e, {
      baseUrl: t
    }))?.title || undefined;
  }
  async function bridgeMain(e) {
    let t = parseArgs(e);
    if (t.help) {
      await vlf();
      return;
    }
    if (t.error) {
      console.error(`Error: ${t.error}`);
      process.exit(1);
    }
    oze();
    vgt(getAttestationFilterPolicy);
    let {
      verbose: n,
      sandbox: r,
      debugFile: o,
      permissionMode: s,
      name: i,
      sessionNamePrefix: a,
      spawnMode: l,
      capacity: c,
      createSessionInDir: u,
      sessionId: d,
      continueSession: p,
      enableLivePreview: m,
      previewPorts: f
    } = t;
    if (a) {
      process.env.CLAUDE_REMOTE_CONTROL_SESSION_NAME_PREFIX = a;
    }
    let h = d;
    let g;
    if (s !== undefined) {
      let {
        INTERNAL_PERMISSION_MODES: vt
      } = await Promise.resolve().then(() => (XB(), P1r));
      let yt = vt;
      if (!yt.includes(s)) {
        console.error(`Error: Invalid permission mode '${s}'. Valid modes: ${yt.join(", ")}`);
        process.exit(1);
      }
    }
    let y = pBe.resolve(".");
    let {
      enableConfigs: _,
      checkHasTrustDialogAccepted: b
    } = await Promise.resolve().then(() => (Jn(), bz));
    _();
    let {
      initSinks: S
    } = await Promise.resolve().then(() => (TJe(), KCt));
    S();
    let {
      setOriginalCwd: E,
      setCwdState: C
    } = await Promise.resolve().then(() => (at(), dxe));
    if (E(y), C(y), !b()) {
      console.error(`Error: Workspace not trusted. Please run \`claude\` in ${y} first to review and accept the workspace trust dialog.`);
      process.exit(1);
    }
    let {
      clearOAuthTokenCache: x,
      checkAndRefreshOAuthTokenIfNeeded: A
    } = await Promise.resolve().then(() => (no(), v2));
    let {
      getBridgeAccessToken: k,
      getBridgeBaseUrl: I
    } = await Promise.resolve().then(() => (wZ(), VFo));
    if (!k()) {
      console.error("Error: You must be logged in to use Remote Control.\n\nRemote Control is only available with claude.ai subscriptions. Please use `/login` to sign in with your claude.ai account.");
      process.exit(1);
    }
    let {
      getGlobalConfig: M,
      saveGlobalConfig: L,
      getCurrentProjectConfig: P,
      saveCurrentProjectConfig: F
    } = await Promise.resolve().then(() => (Jn(), bz));
    if (!M().remoteDialogSeen) {
      let yt = (await import("readline")).createInterface({
        input: process.stdin,
        output: process.stdout
      });
      console.log(`
Take this session with you and pick up right where you left off on any device.
Open the Code tab in the Claude mobile app, or visit claude.ai/code in a browser.

The session keeps running on this machine. Use your other devices as a remote
control. Press Ctrl+C to stop.
`);
      let gt = await new Promise(Ft => {
        yt.question("Enable Remote Control? (y/n) ", Ft);
      });
      if (yt.close(), L(Ft => {
        if (Ft.remoteDialogSeen) {
          return Ft;
        }
        return {
          ...Ft,
          remoteDialogSeen: true
        };
      }), gt.toLowerCase() !== "y" && gt.toLowerCase() !== "yes") {
        process.exit(0);
      }
    }
    let H = I();
    if (H.startsWith("http://") && !H.includes("localhost") && !H.includes("127.0.0.1")) {
      console.error("Error: Remote Control base URL uses HTTP. Only HTTPS or localhost HTTP is allowed.");
      process.exit(1);
    }
    let U = H;
    let {
      getBranch: N,
      getRemoteUrlForBridge: W,
      findGitRoot: j,
      redactGitRemoteCredentials: z
    } = await Promise.resolve().then(() => (na(), Fgn));
    let {
      hasWorktreeCreateHook: V
    } = await Promise.resolve().then(() => (lWe(), BQr));
    let K = V() || j(y) !== null;
    let J = P().remoteControlSpawnMode;
    if (J === "worktree" && !K) {
      console.error("Warning: Saved spawn mode is worktree but this directory is not a git repository. Falling back to same-dir.");
      J = undefined;
      F(vt => {
        if (vt.remoteControlSpawnMode === undefined) {
          return vt;
        }
        return {
          ...vt,
          remoteControlSpawnMode: undefined
        };
      });
    }
    if (!J && K && l === undefined && !h && process.stdin.isTTY) {
      let yt = (await import("readline")).createInterface({
        input: process.stdin,
        output: process.stdout
      });
      console.log(`
Remote Control is launching in spawn mode, which lets you start new sessions in this project from claude.ai/code or the Claude mobile app. Learn more: https://code.claude.com/docs/en/remote-control

Spawn mode for this project:
` + `  [1] same-dir \u2014 sessions share the current directory (default)
` + `  [2] worktree \u2014 each session gets an isolated git worktree

` + `This can be changed later or explicitly set with --spawn=same-dir or --spawn=worktree.
`);
      let gt = await new Promise(on => {
        yt.question("Choose [1/2] (default: 1): ", on);
      });
      yt.close();
      let Ft = gt.trim() === "2" ? "worktree" : "same-dir";
      J = Ft;
      logEvent("tengu_bridge_spawn_mode_chosen", {
        spawn_mode: Ft
      });
      F(on => {
        if (on.remoteControlSpawnMode === Ft) {
          return on;
        }
        return {
          ...on,
          remoteControlSpawnMode: Ft
        };
      });
    }
    let Q;
    let Z;
    if (h) {
      Z = "single-session";
      Q = "resume";
    } else if (l !== undefined) {
      Z = l;
      Q = "flag";
    } else if (J !== undefined) {
      Z = J;
      Q = "saved";
    } else {
      Z = "same-dir";
      Q = "gate_default";
    }
    let ne = Z === "single-session" ? 1 : c ?? 32;
    let oe = u ?? true;
    let ee;
    let re;
    let se;
    let ae = false;
    if (!h && oe) {
      let {
        readBridgePointer: vt
      } = await Promise.resolve().then(() => (dBe(), uBe));
      let yt = await vt(y);
      if (yt) {
        let {
          isProcessRunning: gt,
          isSameProcessAsync: Ft
        } = await Promise.resolve().then(() => (Tb(), ust));
        if (yt.pid !== undefined && yt.pid !== process.pid && gt(yt.pid) && (await Ft(yt.pid, yt.procStart))) {
          ae = true;
          logForDebugging(`[bridge:init] Pointer writer pid ${yt.pid} still running; registering a fresh env and deferring pointer write`);
        } else if (yt.source === "standalone") {
          ee = yt.environmentId;
          re = yt.sessionId;
          logForDebugging(`[bridge:init] Found prior environment ${ee} in pointer (ageMs=${yt.ageMs}); requesting reuse on registration`);
        }
      }
    }
    if (Z === "worktree" && !K) {
      console.error("Error: Worktree mode requires a git repository or WorktreeCreate hooks configured. Use --spawn=session for single-session mode.");
      process.exit(1);
    }
    let de = await N();
    let be = await W();
    let fe = G8o.hostname();
    let me = Atn.randomUUID();
    let {
      handleOAuth401Error: Te
    } = await Promise.resolve().then(() => (no(), v2));
    let ue = O8o({
      baseUrl: H,
      getAccessToken: k,
      runnerVersion: {
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION,
      onDebug: logForDebugging,
      onAuth401: Te,
      getTrustedDeviceToken: getTrustedDeviceToken,
      useCcrV2Routing: isCcrV2SendEventsEnabled
    });
    let ce = ee;
    let le = {
      dir: y,
      machineName: fe,
      branch: de,
      gitRepoUrl: be,
      maxSessions: ne,
      spawnMode: Z,
      verbose: n,
      sandbox: r,
      bridgeId: me,
      workerType: "claude_code",
      environmentId: Atn.randomUUID(),
      reuseEnvironmentId: ce,
      apiBaseUrl: H,
      sessionIngressUrl: U,
      debugFile: o,
      livePreviewPorts: m ? new Set(f) : undefined
    };
    logForDebugging(`[bridge:init] bridgeId=${me}${ce ? ` reuseEnvironmentId=${ce}` : ""} dir=${y} branch=${de} gitRepoUrl=${z(be)} machine=${fe}`);
    logForDebugging(`[bridge:init] apiBaseUrl=${H} sessionIngressUrl=${U}`);
    logForDebugging(`[bridge:init] sandbox=${r}${o ? ` debugFile=${o}` : ""}`);
    let pe;
    let ve;
    try {
      let vt = await ue.registerBridgeEnvironment(le);
      pe = vt.environment_id;
      ve = vt.environment_secret;
    } catch (vt) {
      logEvent("tengu_bridge_registration_failed", {
        status: vt instanceof J3 ? vt.status : undefined
      });
      console.error(vt instanceof J3 && vt.status === 404 ? "Remote Control environments are not available for your account." : vt instanceof J3 && vt.status !== 401 && wtn(vt.errorType) ? `Error: ${Duc(vt.message)}` : `Error: ${he(vt)}`);
      process.exit(1);
    }
    if (ee) {
      if (pe !== ee) {
        logForDebugging(`Bridge env reuse mismatch: requested ${ee}, backend returned ${pe}.`, {
          level: "warn"
        });
        console.warn("Warning: Could not reuse the previous environment. Existing claude.ai/code sessions from the previous run will not reconnect.");
        let {
          clearBridgePointer: vt
        } = await Promise.resolve().then(() => (dBe(), uBe));
        await vt(y);
      } else {
        let {
          writeBridgePointer: vt,
          readBridgePointer: yt
        } = await Promise.resolve().then(() => (dBe(), uBe));
        let {
          ownProcStartAsync: gt
        } = await Promise.resolve().then(() => (Tb(), ust));
        if (le.preserveOnShutdown = await vt(y, {
          sessionId: re ?? "",
          environmentId: pe,
          source: "standalone",
          pid: process.pid,
          procStart: await gt()
        }), le.preserveOnShutdown) {
          let Ft = await yt(y, {
            noClear: true
          });
          if (Ft && Ft.pid !== undefined && Ft.pid !== process.pid) {
            logForDebugging(`[bridge:init] Lost pointer write race to pid ${Ft.pid}; backing off`, {
              level: "error"
            });
            console.error(`Error: Another \`claude remote-control\` instance (pid ${Ft.pid}) is already running in this directory. Exiting to avoid a split-brain conflict.`);
            process.exit(1);
          }
        }
        if (se = re, se) {
          let Ft = toInfraSessionId(se);
          let on = Ft === se ? [se] : [se, Ft];
          let rn = false;
          let Sn = [];
          for (let jn of on) {
            try {
              await ue.reconnectSession(pe, jn);
              logForDebugging(`[bridge:init] Adopted session ${jn} re-queued via bridge/reconnect`);
              rn = true;
              break;
            } catch (Xr) {
              Sn.push(Xr);
              logForDebugging(`[bridge:init] reconnectSession(${jn}) failed: ${he(Xr)}`);
            }
          }
          if (!rn) {
            if (Sn.length > 0 && Sn.every(jn => jn instanceof J3)) {
              se = undefined;
            } else {
              logForDebugging("[bridge:init] reconnectSession transient failure; session will be picked up passively once its lease expires", {
                level: "warn"
              });
            }
          }
        }
      }
    }
    let _e;
    logForDebugging(`[bridge:init] Registered, server environmentId=${pe}`);
    let xe = lBe();
    logEvent("tengu_bridge_started", {
      max_sessions: le.maxSessions,
      has_debug_file: !!le.debugFile,
      sandbox: le.sandbox,
      verbose: le.verbose,
      heartbeat_interval_ms: xe.non_exclusive_heartbeat_interval_ms,
      spawn_mode: le.spawnMode,
      spawn_mode_source: Q,
      pre_create_session: oe,
      worktree_available: K
    });
    wn("info", "bridge_started", {
      max_sessions: le.maxSessions,
      sandbox: le.sandbox,
      spawn_mode: le.spawnMode
    });
    let ke = F8o({
      execPath: process.execPath,
      scriptArgs: Muc(),
      env: process.env,
      verbose: n,
      sandbox: r,
      debugFile: o,
      permissionMode: s,
      onDebug: logForDebugging,
      onActivity: (vt, yt) => {
        logForDebugging(`[bridge:activity] sessionId=${vt} ${yt.type} ${yt.summary}`);
      },
      onPermissionRequest: (vt, yt, gt) => {
        logForDebugging(`[bridge:perm] sessionId=${vt} tool=${yt.request.tool_name} request_id=${yt.request_id} (not auto-approving)`);
      }
    });
    let Ie = buc({
      verbose: n
    });
    let {
      parseGitHubRepository: Ue
    } = await Promise.resolve().then(() => (bI(), iMt));
    let Ge = be ? Ue(be) : null;
    let Be = Ge ? Ge.split("/").pop() : pBe.basename(y);
    Ie.setRepoInfo(Be, de);
    let We = Z !== "single-session" && K;
    if (We) {
      Ie.setSpawnModeDisplay(Z);
    }
    let Ze = vt => {
      if (vt[0] === 3 || vt[0] === 4) {
        process.emit("SIGINT");
        return;
      }
      if (vt[0] === 32) {
        Ie.toggleQr();
        return;
      }
      if (vt[0] === 119) {
        if (!We) {
          return;
        }
        let yt = le.spawnMode === "same-dir" ? "worktree" : "same-dir";
        le.spawnMode = yt;
        logEvent("tengu_bridge_spawn_mode_toggled", {
          spawn_mode: yt
        });
        Ie.logStatus(yt === "worktree" ? "Spawn mode: worktree (new sessions get isolated git worktrees)" : "Spawn mode: same-dir (new sessions share the current directory)");
        Ie.setSpawnModeDisplay(yt);
        Ie.refreshDisplay();
        F(gt => {
          if (gt.remoteControlSpawnMode === yt) {
            return gt;
          }
          return {
            ...gt,
            remoteControlSpawnMode: yt
          };
        });
        return;
      }
    };
    if (process.stdin.isTTY) {
      PI(process.stdin, true);
      process.stdin.resume();
      process.stdin.on("data", Ze);
    }
    let Tt = new AbortController();
    let kt = () => {
      logForDebugging("[bridge:shutdown] SIGINT received, shutting down");
      Tt.abort();
    };
    let Ye = () => {
      logForDebugging("[bridge:shutdown] SIGTERM received, shutting down");
      Tt.abort();
    };
    process.on("SIGINT", kt);
    process.on("SIGTERM", Ye);
    let ht = se ?? null;
    let It;
    if (oe && true && !se) {
      let vt = i ?? `${getBridgeSessionNamePrefix()}-${cst()}`;
      let {
        createBridgeSession: yt
      } = await Promise.resolve().then(() => (TFe(), S7e));
      try {
        if (ht = await yt({
          environmentId: pe,
          title: vt,
          events: [],
          gitRepoUrl: be,
          branch: de,
          signal: Tt.signal,
          baseUrl: H,
          getAccessToken: k,
          permissionMode: s,
          tags: ["remote-control-cli"]
        }), ht) {
          if (!i) {
            It = vt;
          }
          logForDebugging(`[bridge:init] Created initial session ${ht}`);
        }
      } catch (gt) {
        logForDebugging(`[bridge:init] Session creation failed (non-fatal): ${he(gt)}`);
      }
    }
    let Rt = null;
    let wt = ht ?? (le.preserveOnShutdown ? re ?? "" : null);
    if (wt !== null && !ae) {
      let {
        writeBridgePointer: vt
      } = await Promise.resolve().then(() => (dBe(), uBe));
      let {
        ownProcStartAsync: yt
      } = await Promise.resolve().then(() => (Tb(), ust));
      let gt = {
        sessionId: wt,
        environmentId: pe,
        source: "standalone",
        pid: process.pid,
        procStart: await yt()
      };
      if (await vt(le.dir, gt)) {
        le.preserveOnShutdown = true;
        Rt = setInterval((Ft, on, rn, Sn) => void on().then(jn => Ft(rn, {
          ...Sn,
          procStart: jn
        })), 3600000, vt, yt, le.dir, gt);
        Rt.unref?.();
      }
    }
    try {
      await runBridgeLoop(le, pe, ve, ue, ke, Ie, Tt.signal, undefined, ht ?? undefined, async () => (x(), await A(), k()), It);
    } finally {
      if (Rt !== null) {
        clearInterval(Rt);
      }
      if (process.off("SIGINT", kt), process.off("SIGTERM", Ye), process.stdin.off("data", Ze), process.stdin.isTTY) {
        PI(process.stdin, false);
      }
      process.stdin.pause();
    }
    process.exit(0);
  }
  function remoteControlPolicyError(e, t) {
    if (!e) {
      return null;
    }
    let n = t ?? "Remote Control is disabled by your organization\u2019s policy.";
    if (e === "org_denied") {
      return new BridgeHeadlessPermanentError(n);
    }
    return new Po(n, "Remote Control denied: policy cache miss (transient)");
  }
  async function runBridgeHeadless(e, t) {
    let {
      dir: n,
      log: r
    } = e;
    process.chdir(n);
    let {
      setOriginalCwd: o,
      setCwdState: s
    } = await Promise.resolve().then(() => (at(), dxe));
    o(n);
    s(n);
    let {
      enableConfigs: i,
      checkHasTrustDialogAccepted: a
    } = await Promise.resolve().then(() => (Jn(), bz));
    i();
    let {
      initSinks: l
    } = await Promise.resolve().then(() => (TJe(), KCt));
    l();
    let {
      getSettingsWithErrors: c
    } = await Promise.resolve().then(() => (mr(), yY));
    if (c().settings.disableRemoteControl === true) {
      throw new BridgeHeadlessPermanentError("Remote Control is disabled by your organization's policy (managed setting `disableRemoteControl`).");
    }
    let {
      loadPolicyLimits: u
    } = await Promise.resolve().then(() => (q$(), G6t));
    let {
      policyDeniedReason: d,
      policyDenyKind: p
    } = await Promise.resolve().then(() => (Kc(), f$t));
    await u();
    let m = remoteControlPolicyError(p("allow_remote_control"), d("allow_remote_control", "Remote Control", "is"));
    if (m) {
      throw m;
    }
    if (!a()) {
      throw new BridgeHeadlessPermanentError(`Workspace not trusted: ${n}. Run \`claude\` in that directory first to accept the trust dialog.`);
    }
    if (!e.getAccessToken()) {
      throw Error("Error: You must be logged in to use Remote Control.\n\nRemote Control is only available with claude.ai subscriptions. Please use `/login` to sign in with your claude.ai account.");
    }
    let {
      getBridgeBaseUrl: f
    } = await Promise.resolve().then(() => (wZ(), VFo));
    let h = f();
    if (h.startsWith("http://") && !h.includes("localhost") && !h.includes("127.0.0.1")) {
      throw new BridgeHeadlessPermanentError("Remote Control base URL uses HTTP. Only HTTPS or localhost HTTP is allowed.");
    }
    let g = h;
    let {
      getBranch: y,
      getRemoteUrlForBridge: _,
      findGitRoot: b
    } = await Promise.resolve().then(() => (na(), Fgn));
    let {
      hasWorktreeCreateHook: S
    } = await Promise.resolve().then(() => (lWe(), BQr));
    if (e.spawnMode === "worktree") {
      if (!(S() || b(n) !== null)) {
        throw new BridgeHeadlessPermanentError(`Worktree mode requires a git repository or WorktreeCreate hooks. Directory ${n} has neither.`);
      }
    }
    let E = await y();
    let C = await _();
    let x = G8o.hostname();
    let A = Atn.randomUUID();
    let k;
    let I = false;
    {
      let {
        readBridgePointer: W
      } = await Promise.resolve().then(() => (dBe(), uBe));
      let j = await W(n);
      if (j) {
        let {
          isProcessRunning: z,
          isSameProcessAsync: V
        } = await Promise.resolve().then(() => (Tb(), ust));
        if (j.pid !== undefined && j.pid !== process.pid && z(j.pid) && (await V(j.pid, j.procStart))) {
          I = true;
          r(`pointer writer pid ${j.pid} still running; registering fresh env, deferring pointer write`);
        } else if (j.source === "standalone") {
          k = j.environmentId;
          r(`found prior environment ${k} in pointer (ageMs=${j.ageMs}); requesting reuse on registration`);
        }
      }
    }
    let O = {
      dir: n,
      machineName: x,
      branch: E,
      gitRepoUrl: C,
      maxSessions: e.capacity,
      spawnMode: e.spawnMode,
      verbose: false,
      sandbox: e.sandbox,
      bridgeId: A,
      workerType: "claude_code",
      environmentId: Atn.randomUUID(),
      reuseEnvironmentId: k,
      apiBaseUrl: h,
      sessionIngressUrl: g
    };
    let M = O8o({
      baseUrl: h,
      getAccessToken: e.getAccessToken,
      runnerVersion: {
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION,
      onDebug: r,
      onAuth401: e.onAuth401,
      getTrustedDeviceToken: getTrustedDeviceToken,
      useCcrV2Routing: isCcrV2SendEventsEnabled
    });
    let L;
    let P;
    try {
      let W = await M.registerBridgeEnvironment(O);
      L = W.environment_id;
      P = W.environment_secret;
    } catch (W) {
      throw Error(`Bridge registration failed: ${he(W)}`, {
        cause: W
      });
    }
    let F = F8o({
      execPath: process.execPath,
      scriptArgs: Muc(),
      env: process.env,
      verbose: false,
      sandbox: e.sandbox,
      permissionMode: e.permissionMode,
      onDebug: r
    });
    let H = Alf(r);
    H.printBanner(O, L);
    let U;
    if (e.createSessionOnStart) {
      let {
        createBridgeSession: W
      } = await Promise.resolve().then(() => (TFe(), S7e));
      try {
        let j = await W({
          environmentId: L,
          title: e.name,
          events: [],
          gitRepoUrl: C,
          branch: E,
          signal: t,
          baseUrl: h,
          getAccessToken: e.getAccessToken,
          permissionMode: e.permissionMode,
          tags: ["remote-control-auto"]
        });
        if (j) {
          U = j;
          r(`created initial session ${j}`);
        }
      } catch (j) {
        r(`session pre-creation failed (non-fatal): ${he(j)}`);
      }
    }
    let N = null;
    if (!I) {
      if (k && L !== k) {
        r(`env reuse mismatch: requested ${k}, backend returned ${L}; existing sessions will not reconnect`);
      }
      let {
        writeBridgePointer: W
      } = await Promise.resolve().then(() => (dBe(), uBe));
      let {
        ownProcStartAsync: j
      } = await Promise.resolve().then(() => (Tb(), ust));
      let z = {
        sessionId: U ?? "",
        environmentId: L,
        source: "standalone",
        pid: process.pid,
        procStart: await j()
      };
      if (O.preserveOnShutdown = await W(n, z), O.preserveOnShutdown) {
        N = setInterval((V, K, J, Q) => void K().then(Z => V(J, {
          ...Q,
          procStart: Z
        })), 3600000, W, j, n, z);
        N.unref?.();
      }
    }
    try {
      await runBridgeLoop(O, L, P, M, F, H, t, undefined, U, async () => e.getAccessToken());
    } finally {
      if (N) {
        clearInterval(N);
      }
    }
  }
  function Alf(e) {
    let t = () => {};
    return {
      printBanner: (n, r) => e(`registered environmentId=${r} dir=${n.dir} spawnMode=${n.spawnMode} capacity=${n.maxSessions}`),
      logSessionStart: (n, r) => e(`session start ${n}`),
      logSessionComplete: (n, r) => e(`session complete ${n} (${r}ms)`),
      logSessionFailed: (n, r) => e(`session failed ${n}: ${r}`),
      logStatus: e,
      logVerbose: e,
      logError: n => e(`error: ${n}`),
      logReconnected: n => e(`reconnected after ${n}ms`),
      addSession: (n, r) => e(`session attached ${n}`),
      removeSession: n => e(`session detached ${n}`),
      updateIdleStatus: t,
      updateReconnectingStatus: t,
      updateSessionStatus: t,
      updateSessionActivity: t,
      updateSessionCount: t,
      updateFailedStatus: t,
      setSpawnModeDisplay: t,
      setRepoInfo: t,
      setDebugLogPath: t,
      setAttached: t,
      setSessionTitle: t,
      clearStatus: t,
      toggleQr: t,
      refreshDisplay: t
    };
  }
  var Atn;
  var G8o;
  var pBe;
  var hlf;
  var _lf;
  var blf;
  var BridgeHeadlessPermanentError;
  var Ldr = __lazy(() => {
    ln();
    Ot();
    Adr();
    je();
    Zm();
    gn();
    dt();
    cs();
    Rn();
    qQ();
    Wd();
    aPe();
    Zn();
    BC();
    kqe();
    iP();
    yuc();
    wZ();
    Ox();
    yse();
    Suc();
    Ipe();
    k8e();
    Aot();
    M8o();
    N8o();
    Ruc();
    CQ();
    Odr();
    Atn = require("crypto");
    G8o = require("os");
    pBe = require("path");
    hlf = {
      connInitialMs: 2000,
      connCapMs: 120000,
      connGiveUpMs: 600000,
      generalInitialMs: 500,
      generalCapMs: 30000,
      generalGiveUpMs: 600000
    };
    _lf = new Set(["ECONNREFUSED", "ECONNRESET", "ETIMEDOUT", "ENETUNREACH", "EHOSTUNREACH"]);
    blf = ["session", "same-dir", "worktree"];
    BridgeHeadlessPermanentError = class EJe extends Error {
      constructor(e) {
        super(e);
        this.name = "BridgeHeadlessPermanentError";
      }
    };
  });
  async function Fdr(e, t) {
    return vl("daemon_rc_add", async () => {
      let n = "added";
      await BCt(r => {
        let o = t8o(r.remoteControl);
        let s = o.findIndex(i => i.dir === e.dir);
        if (s >= 0) {
          let i = d_u(e, a => a !== undefined);
          o[s] = {
            ...o[s],
            ...i
          };
          n = "updated";
        } else {
          o.push(e);
          n = "added";
        }
        r.remoteControl = o;
      }, t);
      return n;
    });
  }
  async function Udr(e, t) {
    return vl("daemon_rc_remove", async () => {
      await BCt(n => {
        let r = t8o(n.remoteControl);
        let o = r.filter(s => s.dir !== e);
        if (o.length === r.length) {
          return false;
        }
        if (o.length === 0) {
          delete n.remoteControl;
        } else {
          n.remoteControl = o;
        }
      }, t);
    });
  }
  var z8o;
  var Buc = async (e, t, n, r) => {
    let o = z8o().parse(e);
    let {
      initializeErrorLogSink: s
    } = await Promise.resolve().then(() => (gtn(), ydr));
    let {
      initializeAnalyticsSink: i
    } = await Promise.resolve().then(() => (TEe(), dht));
    s();
    i();
    let a = () => getBridgeTokenOverride() ?? r.getAccessToken();
    if (!a()) {
      n("Error: You must be logged in to use Remote Control.\n\nRemote Control is only available with claude.ai subscriptions. Please use `/login` to sign in with your claude.ai account.");
      process.exit(1);
    }
    let {
      runBridgeHeadless: l,
      BridgeHeadlessPermanentError: c
    } = await Promise.resolve().then(() => (Ldr(), Ndr));
    try {
      await l({
        dir: o.dir,
        name: o.name,
        spawnMode: o.spawnMode,
        capacity: o.capacity,
        permissionMode: o.permissionMode,
        sandbox: o.sandbox,
        createSessionOnStart: o.createSessionOnStart,
        getAccessToken: a,
        onAuth401: r.reportAuth401,
        log: n
      }, t);
    } catch (u) {
      if (u instanceof c) {
        n(u.message);
        process.exit(78);
      }
      throw u;
    }
  };
  var Bdr = __lazy(() => {
    ZL();
    wZ();
    ln();
    n8o();
    z8o = we(() => v.object({
      dir: v.string(),
      name: v.string().optional(),
      spawnMode: v.enum(["same-dir", "worktree"]).default("same-dir"),
      capacity: v.number().int().positive().default(32),
      permissionMode: v.enum(EXTERNAL_PERMISSION_MODES).optional(),
      sandbox: v.boolean().default(false),
      sessionTimeoutSeconds: v.number().int().positive().optional(),
      createSessionOnStart: v.boolean().default(false)
    }).strict());
  });
  var Wuc = {};