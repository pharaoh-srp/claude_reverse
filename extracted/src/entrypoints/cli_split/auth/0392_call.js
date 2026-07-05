  __export(j5l, {
    call: () => call_export34
  });
  function m5m(e) {
    let [t] = XZ.useState(() => getAnthropicApiKeySafe());
    let [n, r] = XZ.useState({
      ...p5m,
      useExistingKey: !!t,
      selectedApiKeyOption: t ? "existing" : isAnthropicAuthEnabled() ? "oauth" : "new"
    });
    let o = useClock();
    Eg();
    jo({
      "confirm:no": () => e.onDone("Installation cancelled by user")
    }, {
      context: "Settings",
      isActive: n.step !== "success" && n.step !== "error" && n.step !== "oauth-flow"
    });
    XZ.useEffect(() => {
      logEvent("tengu_install_github_app_started", {});
    }, []);
    let s = XZ.useCallback(async () => {
      let k = [];
      if ((await yI("gh --version", {
        reject: false
      })).exitCode !== 0) {
        k.push({
          title: "GitHub CLI not found",
          message: "GitHub CLI (gh) does not appear to be installed or accessible.",
          instructions: ["Install GitHub CLI from https://cli.github.com/", "macOS: brew install gh", "Windows: winget install --id GitHub.cli", "Linux: See installation instructions at https://github.com/cli/cli#installation"]
        });
      }
      let O = await yI("gh auth status -a", {
        reject: false
      });
      if (O.exitCode !== 0) {
        k.push({
          title: "GitHub CLI not authenticated",
          message: "GitHub CLI does not appear to be authenticated.",
          instructions: ["Run: gh auth login", "Follow the prompts to authenticate with GitHub", "Or set up authentication using environment variables or other methods"]
        });
      } else {
        let L = O.stdout.match(/Token scopes:.*$/m);
        if (L) {
          let P = L[0];
          let F = [];
          if (!P.includes("repo")) {
            F.push("repo");
          }
          if (!P.includes("workflow")) {
            F.push("workflow");
          }
          if (F.length > 0) {
            r(H => ({
              ...H,
              step: "error",
              error: `GitHub CLI is missing required permissions: ${F.join(", ")}.`,
              errorReason: "Missing required scopes",
              errorInstructions: [`Your GitHub CLI authentication is missing the "${F.join('" and "')}" ${un(F.length, "scope")} needed to manage GitHub Actions and secrets.`, "", "To fix this, run:", "  gh auth refresh -h github.com -s repo,workflow", "", "This will add the necessary permissions to manage workflows and secrets."]
            }));
            return;
          }
        }
      }
      let M = (await getGithubRepo()) ?? "";
      logEvent("tengu_install_github_app_step_completed", {
        step: "check-gh"
      });
      r(L => ({
        ...L,
        warnings: k,
        currentRepo: M,
        selectedRepoName: M,
        useCurrentRepo: !!M,
        step: k.length > 0 ? "warnings" : "choose-repo"
      }));
    }, []);
    XZ.useEffect(() => {
      if (n.step === "check-gh") {
        s();
      }
    }, [n.step, s]);
    let i = XZ.useCallback(async (k, I) => {
      r(O => ({
        ...O,
        step: "creating",
        currentWorkflowInstallStep: 0
      }));
      try {
        await F5l(n.selectedRepoName, k, I, () => {
          r(O => ({
            ...O,
            currentWorkflowInstallStep: O.currentWorkflowInstallStep + 1
          }));
        }, n.workflowAction === "skip", n.selectedWorkflows, n.authType, {
          useCurrentRepo: n.useCurrentRepo,
          workflowExists: n.workflowExists,
          secretExists: n.secretExists
        });
        logEvent("tengu_install_github_app_step_completed", {
          step: "creating"
        });
        r(O => ({
          ...O,
          step: "success"
        }));
      } catch (O) {
        let M = O instanceof Error ? O.message : "Failed to set up GitHub Actions";
        if (M.includes("workflow file already exists")) {
          logEvent("tengu_install_github_app_error", {
            reason: "workflow_file_exists"
          });
          r(L => ({
            ...L,
            step: "error",
            error: "A Claude workflow file already exists in this repository.",
            errorReason: "Workflow file conflict",
            errorInstructions: ["The file .github/workflows/claude.yml already exists", "You can either:", "  1. Delete the existing file and run this command again", "  2. Update the existing file manually using the template from:", `     ${Ufe}`]
          }));
        } else {
          logEvent("tengu_install_github_app_error", {
            reason: "setup_github_actions_failed"
          });
          r(L => ({
            ...L,
            step: "error",
            error: M,
            errorReason: "GitHub Actions setup failed",
            errorInstructions: []
          }));
        }
      }
    }, [n.selectedRepoName, n.workflowAction, n.selectedWorkflows, n.useCurrentRepo, n.workflowExists, n.secretExists, n.authType]);
    async function a() {
      await Ac("https://github.com/apps/claude");
    }
    async function l(k) {
      try {
        let I = await execFileNoThrow("gh", ["api", `repos/${k}`, "--jq", ".permissions.admin"]);
        if (I.code === 0) {
          return {
            hasAccess: I.stdout.trim() === "true"
          };
        }
        if (I.stderr.includes("404") || I.stderr.includes("Not Found")) {
          return {
            hasAccess: false,
            error: "repository_not_found"
          };
        }
        return {
          hasAccess: false
        };
      } catch {
        return {
          hasAccess: false
        };
      }
    }
    async function c(k) {
      return (await execFileNoThrow("gh", ["api", `repos/${k}/contents/.github/workflows/claude.yml`, "--jq", ".sha"])).code === 0;
    }
    async function u() {
      let k = await execFileNoThrow("gh", ["secret", "list", "--app", "actions", "--repo", n.selectedRepoName]);
      if (k.code === 0) {
        if (k.stdout.split(`
`).some(M => /^ANTHROPIC_API_KEY\s+/.test(M))) {
          r(M => ({
            ...M,
            secretExists: true,
            step: "check-existing-secret"
          }));
        } else if (t) {
          r(M => ({
            ...M,
            apiKeyOrOAuthToken: t,
            useExistingKey: true
          }));
          await i(t, n.secretName);
        } else {
          r(M => ({
            ...M,
            step: "api-key"
          }));
        }
      } else if (t) {
        r(I => ({
          ...I,
          apiKeyOrOAuthToken: t,
          useExistingKey: true
        }));
        await i(t, n.secretName);
      } else {
        r(I => ({
          ...I,
          step: "api-key"
        }));
      }
    }
    let d = async () => {
      if (n.step === "warnings") {
        logEvent("tengu_install_github_app_step_completed", {
          step: "warnings"
        });
        r(k => ({
          ...k,
          step: "install-app"
        }));
        o.setTimeout(a, 0);
      } else if (n.step === "choose-repo") {
        let k = n.useCurrentRepo ? n.currentRepo : n.selectedRepoName;
        if (!k.trim()) {
          return;
        }
        let I = [];
        {
          let L;
          let P;
          if (k.includes("://")) {
            try {
              let F = new URL(k);
              L = F.hostname;
              P = F.pathname.replace(/^\/+/, "");
            } catch {}
          } else {
            let F = k.match(/^[^@]+@([^:]+):(.+)$/);
            if (F) {
              L = F[1];
              P = F[2];
            } else {
              let H = k.search(/[:/]/);
              if (H > 0) {
                L = k.slice(0, H);
                P = k.slice(H + 1);
              }
            }
          }
          if (L && ef(L)) {
            let F = P?.match(/^([^/]+\/[^/]+?)(?:\.git)?\/?$/);
            if (F?.[1]) {
              k = F[1];
            } else {
              I.push({
                title: "Invalid GitHub URL format",
                message: "The repository URL format appears to be invalid.",
                instructions: [`Use format: owner/repo or https://${"github.com"}/owner/repo`, "Example: anthropics/claude-cli"]
              });
            }
          }
        }
        if (!k.includes("/")) {
          I.push({
            title: "Repository format warning",
            message: 'Repository should be in format "owner/repo"',
            instructions: ["Use format: owner/repo", "Example: anthropics/claude-cli"]
          });
        }
        let O = await l(k);
        if (O.error === "repository_not_found") {
          I.push({
            title: "Repository not found",
            message: `Repository ${k} was not found or you don't have access.`,
            instructions: [`Check that the repository name is correct: ${k}`, "Ensure you have access to this repository", 'For private repositories, make sure your GitHub token has the "repo" scope', "You can add the repo scope with: gh auth refresh -h github.com -s repo,workflow"]
          });
        } else if (!O.hasAccess) {
          I.push({
            title: "Admin permissions required",
            message: `You might need admin permissions on ${k} to set up GitHub Actions.`,
            instructions: ["Repository admins can install GitHub Apps and set secrets", "Ask a repository admin to run this command if setup fails", "Alternatively, you can use the manual setup instructions"]
          });
        }
        let M = await c(k);
        if (I.length > 0) {
          let L = [...n.warnings, ...I];
          r(P => ({
            ...P,
            selectedRepoName: k,
            workflowExists: M,
            warnings: L,
            step: "warnings"
          }));
        } else {
          logEvent("tengu_install_github_app_step_completed", {
            step: "choose-repo"
          });
          r(L => ({
            ...L,
            selectedRepoName: k,
            workflowExists: M,
            step: "install-app"
          }));
          o.setTimeout(a, 0);
        }
      } else if (n.step === "install-app") {
        logEvent("tengu_install_github_app_step_completed", {
          step: "install-app"
        });
        r(k => ({
          ...k,
          step: "setup-actions-prompt"
        }));
      } else if (n.step === "check-existing-workflow") {
        return;
      } else if (n.step === "select-workflows") {
        return;
      } else if (n.step === "check-existing-secret") {
        if (logEvent("tengu_install_github_app_step_completed", {
          step: "check-existing-secret"
        }), n.useExistingSecret) {
          await i(null, n.secretName);
        } else {
          await i(n.apiKeyOrOAuthToken, n.secretName);
        }
      } else if (n.step === "api-key") {
        if (n.selectedApiKeyOption === "oauth") {
          return;
        }
        let k = n.selectedApiKeyOption === "existing" ? t : n.apiKeyOrOAuthToken;
        if (!k) {
          logEvent("tengu_install_github_app_error", {
            reason: "api_key_missing"
          });
          r(O => ({
            ...O,
            step: "error",
            error: "API key is required"
          }));
          return;
        }
        r(O => ({
          ...O,
          apiKeyOrOAuthToken: k,
          useExistingKey: n.selectedApiKeyOption === "existing"
        }));
        let I = await execFileNoThrow("gh", ["secret", "list", "--app", "actions", "--repo", n.selectedRepoName]);
        if (I.code === 0) {
          if (I.stdout.split(`
`).some(L => /^ANTHROPIC_API_KEY\s+/.test(L))) {
            logEvent("tengu_install_github_app_step_completed", {
              step: "api-key"
            });
            r(L => ({
              ...L,
              secretExists: true,
              step: "check-existing-secret"
            }));
          } else {
            logEvent("tengu_install_github_app_step_completed", {
              step: "api-key"
            });
            await i(k, n.secretName);
          }
        } else {
          logEvent("tengu_install_github_app_step_completed", {
            step: "api-key"
          });
          await i(k, n.secretName);
        }
      }
    };
    let p = k => {
      r(I => ({
        ...I,
        selectedRepoName: k
      }));
    };
    let m = k => {
      r(I => ({
        ...I,
        apiKeyOrOAuthToken: k
      }));
    };
    let f = k => {
      r(I => ({
        ...I,
        selectedApiKeyOption: k
      }));
    };
    let h = XZ.useCallback(() => {
      logEvent("tengu_install_github_app_step_completed", {
        step: "api-key"
      });
      r(k => ({
        ...k,
        step: "oauth-flow"
      }));
    }, []);
    let g = XZ.useCallback(k => {
      logEvent("tengu_install_github_app_step_completed", {
        step: "oauth-flow"
      });
      r(I => ({
        ...I,
        apiKeyOrOAuthToken: k,
        useExistingKey: false,
        secretName: "CLAUDE_CODE_OAUTH_TOKEN",
        authType: "oauth_token"
      }));
      i(k, "CLAUDE_CODE_OAUTH_TOKEN");
    }, [i]);
    let y = XZ.useCallback(() => {
      r(k => ({
        ...k,
        step: "api-key"
      }));
    }, []);
    let _ = k => {
      if (k && !/^[a-zA-Z0-9_]+$/.test(k)) {
        return;
      }
      r(I => ({
        ...I,
        secretName: k
      }));
    };
    let b = k => {
      r(I => ({
        ...I,
        useCurrentRepo: k,
        selectedRepoName: k ? I.currentRepo : ""
      }));
    };
    let S = k => {
      r(I => ({
        ...I,
        useExistingKey: k
      }));
    };
    let E = k => {
      r(I => ({
        ...I,
        useExistingSecret: k,
        secretName: k ? "ANTHROPIC_API_KEY" : ""
      }));
    };
    let C = k => {
      if (logEvent("tengu_install_github_app_step_completed", {
        step: "setup-actions-prompt",
        action: k
      }), k === "skip") {
        r(I => ({
          ...I,
          step: "success",
          appOnlyInstall: true
        }));
      } else if (n.workflowExists) {
        r(I => ({
          ...I,
          step: "check-existing-workflow"
        }));
      } else {
        r(I => ({
          ...I,
          step: "select-workflows"
        }));
      }
    };
    let x = async k => {
      if (k === "exit") {
        e.onDone("Installation cancelled by user");
        return;
      }
      if (logEvent("tengu_install_github_app_step_completed", {
        step: "check-existing-workflow"
      }), r(I => ({
        ...I,
        workflowAction: k
      })), k === "skip" || k === "update") {
        if (t) {
          await u();
        } else {
          r(I => ({
            ...I,
            step: "api-key"
          }));
        }
      }
    };
    function A(k) {
      if (k.preventDefault(), n.step === "success") {
        logEvent("tengu_install_github_app_completed", {});
      }
      e.onDone(n.step === "success" ? n.appOnlyInstall ? "GitHub App installed!" : "GitHub Actions setup complete!" : n.error ? `Couldn't install GitHub App: ${n.error}
For manual setup instructions, see: ${"https://github.com/anthropics/claude-code-action/blob/main/docs/setup.md"}` : `GitHub App installation failed
For manual setup instructions, see: ${"https://github.com/anthropics/claude-code-action/blob/main/docs/setup.md"}`);
    }
    switch (n.step) {
      case "check-gh":
        return oB.jsx(u5l, {});
      case "warnings":
        return oB.jsx($5l, {
          warnings: n.warnings,
          onContinue: d
        });
      case "choose-repo":
        return oB.jsx(m5l, {
          currentRepo: n.currentRepo,
          useCurrentRepo: n.useCurrentRepo,
          repoUrl: n.selectedRepoName,
          onRepoUrlChange: p,
          onToggleUseCurrentRepo: b,
          onSubmit: d
        });
      case "install-app":
        return oB.jsx(C5l, {
          repoUrl: n.selectedRepoName,
          onSubmit: d
        });
      case "setup-actions-prompt":
        return oB.jsx(O5l, {
          onSelect: C,
          onCancel: () => e.onDone("Installation cancelled by user")
        });
      case "check-existing-workflow":
        return oB.jsx(E5l, {
          repoName: n.selectedRepoName,
          onSelectAction: x
        });
      case "check-existing-secret":
        return oB.jsx(a5l, {
          useExistingSecret: n.useExistingSecret,
          secretName: n.secretName,
          onToggleUseExistingSecret: E,
          onSecretNameChange: _,
          onSubmit: d
        });
      case "api-key":
        return oB.jsx(r5l, {
          existingApiKey: t,
          useExistingKey: n.useExistingKey,
          apiKeyOrOAuthToken: n.apiKeyOrOAuthToken,
          onApiKeyChange: m,
          onToggleUseExistingKey: S,
          onSubmit: d,
          onCreateOAuthToken: isAnthropicAuthEnabled() ? h : undefined,
          selectedOption: n.selectedApiKeyOption,
          onSelectOption: f
        });
      case "creating":
        return oB.jsx(g5l, {
          currentWorkflowInstallStep: n.currentWorkflowInstallStep,
          secretExists: n.secretExists,
          useExistingSecret: n.useExistingSecret,
          secretName: n.secretName,
          skipWorkflow: n.workflowAction === "skip",
          selectedWorkflows: n.selectedWorkflows
        });
      case "success":
        return oB.jsx(gXd, {
          tabIndex: 0,
          autoFocus: true,
          onKeyDown: A,
          children: oB.jsx(N5l, {
            secretExists: n.secretExists,
            useExistingSecret: n.useExistingSecret,
            secretName: n.secretName,
            skipWorkflow: n.workflowAction === "skip",
            appOnlyInstall: n.appOnlyInstall
          })
        });
      case "error":
        return oB.jsx(gXd, {
          tabIndex: 0,
          autoFocus: true,
          onKeyDown: A,
          children: oB.jsx(b5l, {
            error: n.error,
            errorReason: n.errorReason,
            errorInstructions: n.errorInstructions
          })
        });
      case "select-workflows":
        return oB.jsx(Y9l, {
          defaultSelections: n.selectedWorkflows,
          onSubmit: k => {
            if (logEvent("tengu_install_github_app_step_completed", {
              step: "select-workflows"
            }), r(I => ({
              ...I,
              selectedWorkflows: k
            })), t) {
              u();
            } else {
              r(I => ({
                ...I,
                step: "api-key"
              }));
            }
          }
        });
      case "oauth-flow":
        return oB.jsx(A5l, {
          onSuccess: g,
          onCancel: y
        });
    }
  }
  async function call_export34(e) {
    return oB.jsx(m5m, {
      onDone: e
    });
  }
  var XZ;
  var oB;
  var p5m;
  var q5l = __lazy(() => {
    Ot();
    J9l();
    mO();
    et();
    Bs();
    no();
    ky();
    ji();
    na();
    fk();
    oF();
    Zn();
    o5l();
    l5l();
    d5l();
    f5l();
    y5l();
    S5l();
    v5l();
    R5l();
    I5l();
    D5l();
    L5l();
    U5l();
    H5l();
    XZ = __toESM(ot(), 1);
    oB = __toESM(ie(), 1);
    p5m = {
      step: "check-gh",
      selectedRepoName: "",
      currentRepo: "",
      useCurrentRepo: false,
      apiKeyOrOAuthToken: "",
      useExistingKey: true,
      currentWorkflowInstallStep: 0,
      errorInstructions: [],
      warnings: [],
      secretExists: false,
      secretName: "ANTHROPIC_API_KEY",
      useExistingSecret: true,
      workflowExists: false,
      selectedWorkflows: ["claude", "claude-review"],
      selectedApiKeyOption: "new",
      authType: "api_key"
    };
  });
  var h5m;
  var z5l = {};