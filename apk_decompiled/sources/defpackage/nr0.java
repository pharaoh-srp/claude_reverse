package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nr0 {
    public static final ide a = new ide("^https://((?:[a-z0-9-]+\\.)?claude\\.ai)/code/(?:artifact|frame)/([0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12})(?:[/?#]|\\z)");
    public static final ide b = new ide("^https://((?:preview\\.)?claude-ai\\.staging\\.ant\\.dev)/code/(?:artifact|frame)/([0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12})(?:[/?#]|\\z)");
    public static final ide c = new ide("^https://([0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12})\\.frame\\.(staging\\.)?claudeusercontent\\.com(?:[/?#]|\\z)");
    public static final ide d = new ide("https://[^\\s<>\"')\\]]+");

    public static final mr0 a(String str) {
        str.getClass();
        ova ovaVarB = a.b(str);
        oq0 oq0Var = oq0.E;
        if (ovaVarB != null) {
            return new mr0(oq0Var, b((String) ((mva) ovaVarB.a()).get(1), (String) ((mva) ovaVarB.a()).get(2)));
        }
        ova ovaVarB2 = b.b(str);
        oq0 oq0Var2 = oq0.F;
        if (ovaVarB2 != null) {
            return new mr0(oq0Var2, b((String) ((mva) ovaVarB2.a()).get(1), (String) ((mva) ovaVarB2.a()).get(2)));
        }
        ova ovaVarB3 = c.b(str);
        if (ovaVarB3 == null) {
            return null;
        }
        boolean z = ((CharSequence) ((mva) ovaVarB3.a()).get(2)).length() > 0;
        if (z) {
            oq0Var = oq0Var2;
        }
        return new mr0(oq0Var, b(z ? "preview.claude-ai.staging.ant.dev" : "preview.claude.ai", (String) ((mva) ovaVarB3.a()).get(1)));
    }

    public static final String b(String str, String str2) {
        return ij0.k("https://", str, "/code/artifact/", str2);
    }
}
