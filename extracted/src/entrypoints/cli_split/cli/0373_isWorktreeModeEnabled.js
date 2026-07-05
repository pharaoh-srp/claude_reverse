  __export(yDl, {
    isWorktreeModeEnabled: () => isWorktreeModeEnabled
  });
  function isWorktreeModeEnabled() {
    return true;
  }
  function _Dl(e) {
    return `${e.cron ?? ""}${e.prompt ? `: ${truncate(e.prompt, 60, true)}` : ""}`;
  }
  function bDl(e) {
    return mH.jsx(Vn, {
      children: mH.jsxs(Text, {
        children: ["Scheduled ", mH.jsx(Text, {
          bold: true,
          children: e.id
        }), " ", mH.jsxs(Text, {
          dimColor: true,
          children: ["(", e.humanSchedule, ")"]
        })]
      })
    });
  }
  function SDl(e) {
    return e.id ?? "";
  }
  function TDl(e) {
    return mH.jsx(Vn, {
      children: mH.jsxs(Text, {
        children: ["Cancelled ", mH.jsx(Text, {
          bold: true,
          children: e.id
        })]
      })
    });
  }
  function EDl() {
    return "";
  }
  function vDl(e) {
    if (e.jobs.length === 0) {
      return mH.jsx(Vn, {
        children: mH.jsx(sc, {
          children: "No scheduled jobs"
        })
      });
    }
    return mH.jsx(Vn, {
      children: mH.jsx(gXd, {
        flexDirection: "column",
        children: e.jobs.map(t => mH.jsxs(Text, {
          children: [mH.jsx(Text, {
            bold: true,
            children: t.id
          }), " ", mH.jsxs(Text, {
            dimColor: true,
            children: [t.humanSchedule, t.recurring ? " (recurring)" : " (one-shot)", t.durable === false ? " [session-only]" : "", t.prompt ? `: ${truncate(t.prompt, 60, true)}` : ""]
          })]
        }, t.id))
      })
    });
  }
  var mH;
  var ynr = __lazy(() => {
    xb();
    Wl();
    et();
    cs();
    mH = __toESM(ie(), 1);
  });
  var CDl = {};