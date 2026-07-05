  __export(_eo, {
    stopCapturingEarlyInput: () => stopCapturingEarlyInput,
    startCapturingEarlyInput: () => startCapturingEarlyInput,
    seedEarlyInput: () => seedEarlyInput,
    processChunk: () => processChunk,
    isCapturingEarlyInput: () => isCapturingEarlyInput,
    hasEarlyInput: () => hasEarlyInput,
    consumeEarlyInput: () => consumeEarlyInput
  });
  function startCapturingEarlyInput() {
    if (!process.stdin.isTTY || Ult || process.argv.includes("-p") || process.argv.includes("--print")) {
      return;
    }
    Ult = true;
    dre = "";
    try {
      process.stdin.setEncoding("utf8");
      process.stdin.setRawMode(true);
      process.stdin.ref();
      sHt = () => {
        let e = process.stdin.read();
        while (e !== null) {
          if (typeof e === "string") {
            processChunk(e);
          }
          e = process.stdin.read();
        }
      };
      process.stdin.on("readable", sHt);
    } catch {
      Ult = false;
    }
  }
  function processChunk(e) {
    let t = 0;
    while (t < e.length) {
      let n = e[t];
      let r = n.charCodeAt(0);
      if (r === 3) {
        stopCapturingEarlyInput();
        process.exit(130);
        return;
      }
      if (r === 4) {
        stopCapturingEarlyInput();
        return;
      }
      if (r === 127 || r === 8) {
        if (dre.length > 0) {
          let o = L7(dre);
          dre = dre.slice(0, -(o.length || 1));
        }
        t++;
        continue;
      }
      if (r === 27) {
        t++;
        let o = t < e.length ? e.charCodeAt(t) : -1;
        if (o === 91) {
          t++;
          while (t < e.length && e.charCodeAt(t) < 64) {
            t++;
          }
          if (t < e.length) {
            t++;
          }
        } else if (o === 93 || o === 80 || o === 88 || o === 94 || o === 95) {
          t++;
          while (t < e.length) {
            let s = e.charCodeAt(t);
            if (s === 7) {
              t++;
              break;
            }
            if (s === 27 && t + 1 < e.length && e.charCodeAt(t + 1) === 92) {
              t += 2;
              break;
            }
            t++;
          }
        } else if (o === 79) {
          t += 2;
        } else if (o !== -1 && o !== 27) {
          t++;
        }
        continue;
      }
      if (r < 32 && r !== 9 && r !== 10 && r !== 13) {
        t++;
        continue;
      }
      if (r === 13) {
        dre += `
`;
        t++;
        continue;
      }
      dre += n;
      t++;
    }
  }
  function stopCapturingEarlyInput() {
    if (!Ult) {
      return;
    }
    if (Ult = false, sHt) {
      process.stdin.removeListener("readable", sHt);
      sHt = null;
    }
  }
  function consumeEarlyInput() {
    stopCapturingEarlyInput();
    let e = dre.trim();
    dre = "";
    return e;
  }
  function hasEarlyInput() {
    return dre.trim().length > 0;
  }
  function seedEarlyInput(e) {
    dre = e;
  }
  function isCapturingEarlyInput() {
    return Ult;
  }
  var dre = "";
  var Ult = false;
  var sHt = null;
  var cPe = __lazy(() => {
    PP();
  });
  var TerminalFocusEvent;
  var beo = __lazy(() => {
    TerminalFocusEvent = class Blt extends Event_export {
      type;
      constructor(e) {
        super();
        this.type = e;
      }
    };
  });
  var j9i;
  var rVd;