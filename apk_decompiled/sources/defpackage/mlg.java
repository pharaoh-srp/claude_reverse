package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mlg {
    public final String a;
    public final String b;
    public final int c;
    public final String d;

    public mlg(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mlg)) {
            return false;
        }
        mlg mlgVar = (mlg) obj;
        return this.a.equals(mlgVar.a) && this.b.equals(mlgVar.b) && this.c == mlgVar.c && this.d.equals(mlgVar.d);
    }

    public final int hashCode() {
        return ((this.d.hashCode() + ((((Integer.hashCode(this.c) + kgh.l(this.a.hashCode() * 31, 31, this.b)) * 31) - 558281036) * 31)) * 31) - 928853451;
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("StarterProject(id=", this.a, ", emoji=", this.b, ", titleRes=");
        sbR.append(this.c);
        sbR.append(", repoUrl=https://github.com/anthropics/ccr-onboarding, prefillPrompt=");
        sbR.append(this.d);
        sbR.append(", appendSystemPrompt=This is the user's first Claude Code session. Optimize for a fast,\nvisual first impression on a phone:\n\n1. Read the existing `index.html` template before editing it.\n2. Build or change something small and visible. Prefer editing the\n   existing example over scaffolding from scratch. Keep diffs under\n   ~30 lines.\n3. Serve it locally on port 4000 in the background:\n   `bash serve.sh &` (or `python3 -m http.server 4000 &` if there is\n   no serve.sh). Don't wait on it — background it and move on.\n4. Save the result as a self-contained `index.html` (no build step,\n   no external CDNs) and send it to the user with the SendUserFile\n   tool BEFORE explaining what you did.\n5. After the file is sent, narrate in at most 2 sentences.\n6. Then call AskUserQuestion with exactly 4 single-select options:\n   one to tweak what you built, one to build something different,\n   one to learn more about what you can do, and one labeled\n   \"Work on my real code\".\n7. Don't run lengthy installs, don't open PRs, don't push branches.\n   Stay in the sandbox.)");
        return sbR.toString();
    }
}
