package defpackage;

import com.anthropic.claude.code.remote.NewCodeSessionPrefill;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vu0 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ bz7 F;
    public final /* synthetic */ nwb G;

    public /* synthetic */ vu0(bz7 bz7Var, nwb nwbVar, int i) {
        this.E = i;
        this.F = bz7Var;
        this.G = nwbVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        boolean zBooleanValue;
        int i = this.E;
        iei ieiVar = iei.a;
        bz7 bz7Var = this.F;
        nwb nwbVar = this.G;
        switch (i) {
            case 0:
                ((jp9) obj).getClass();
                if (!bsg.I0((String) nwbVar.getValue())) {
                    bz7Var.invoke((String) nwbVar.getValue());
                }
                return ieiVar;
            case 1:
                mlg mlgVar = (mlg) obj;
                mlgVar.getClass();
                nwbVar.setValue(Boolean.TRUE);
                bz7Var.invoke(new NewCodeSessionPrefill(mlgVar.d, null, null, null, null, "This is the user's first Claude Code session. Optimize for a fast,\nvisual first impression on a phone:\n\n1. Read the existing `index.html` template before editing it.\n2. Build or change something small and visible. Prefer editing the\n   existing example over scaffolding from scratch. Keep diffs under\n   ~30 lines.\n3. Serve it locally on port 4000 in the background:\n   `bash serve.sh &` (or `python3 -m http.server 4000 &` if there is\n   no serve.sh). Don't wait on it — background it and move on.\n4. Save the result as a self-contained `index.html` (no build step,\n   no external CDNs) and send it to the user with the SendUserFile\n   tool BEFORE explaining what you did.\n5. After the file is sent, narrate in at most 2 sentences.\n6. Then call AskUserQuestion with exactly 4 single-select options:\n   one to tweak what you built, one to build something different,\n   one to learn more about what you can do, and one labeled\n   \"Work on my real code\".\n7. Don't run lengthy installs, don't open PRs, don't push branches.\n   Stay in the sandbox.", "https://github.com/anthropics/ccr-onboarding", true, false, null, null, null, false, false, 16158, null));
                return ieiVar;
            case 2:
                fcc fccVar = (fcc) obj;
                yjh yjhVar = (yjh) nwbVar.getValue();
                if (yjhVar != null) {
                    zBooleanValue = ((Boolean) bz7Var.invoke(Integer.valueOf(yjhVar.b.g(fccVar.a)))).booleanValue();
                } else {
                    zBooleanValue = false;
                }
                return Boolean.valueOf(zBooleanValue);
            default:
                yjh yjhVar2 = (yjh) obj;
                yjhVar2.getClass();
                nwbVar.setValue(yjhVar2);
                bz7Var.invoke(yjhVar2);
                return ieiVar;
        }
    }

    public /* synthetic */ vu0(nwb nwbVar, bz7 bz7Var, int i) {
        this.E = i;
        this.G = nwbVar;
        this.F = bz7Var;
    }
}
