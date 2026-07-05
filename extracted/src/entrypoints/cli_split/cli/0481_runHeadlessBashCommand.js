  __export(H6c, {
    runHeadlessBashCommand: () => runHeadlessBashCommand
  });
  async function runHeadlessBashCommand(e) {
    let {
      command: t
    } = e;
    let n = e.cwd ?? Nt();
    let {
      file: r,
      args: o
    } = Nfr() === "powershell" ? {
      file: "pwsh",
      args: ["-NoProfile", "-Command", t]
    } : {
      file: "/bin/sh",
      args: ["-c", t]
    };
    let {
      stdout: s,
      stderr: i,
      code: a,
      error: l
    } = await execFileNoThrowWithCwd(r, o, {
      abortSignal: e.abortSignal,
      cwd: n,
      preserveOutputOnError: true
    });
    let c = l && !l.startsWith(`Command failed with exit code ${a}`) ? l : "";
    if (c) {
      Ae("input_remote_bash", "spawn_failed");
    } else {
      Pe("input_remote_bash");
    }
    return {
      outputUuid: $6c.randomUUID(),
      outputText: `<${"bash-stdout"}>${$a(s)}</${"bash-stdout"}><${"bash-stderr"}>${$a(i || c)}</${"bash-stderr"}><${"bash-exit-code"}>${a}</${"bash-exit-code"}>`,
      exitCode: a
    };
  }
  var $6c;
  var j6c = __lazy(() => {
    np();
    ln();
    vo();
    ji();
    dJo();
    wx();
    $6c = require("crypto");
  });
  var T8c = {};