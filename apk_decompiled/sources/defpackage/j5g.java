package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class j5g {
    public static final yl4 F;
    public static final j5g G;
    public static final j5g H;
    public static final /* synthetic */ j5g[] I;
    public static final /* synthetic */ gq6 J;
    public final String E;

    static {
        j5g j5gVar = new j5g("ARTIFACT_IN_CHAT", 0, "ARTIFACT_IN_CHAT");
        G = j5gVar;
        j5g j5gVar2 = new j5g("CHAT", 1, "CHAT");
        H = j5gVar2;
        j5g[] j5gVarArr = {j5gVar, j5gVar2};
        I = j5gVarArr;
        J = new gq6(j5gVarArr);
        F = new yl4();
    }

    public j5g(String str, int i, String str2) {
        this.E = str2;
    }

    public static j5g valueOf(String str) {
        return (j5g) Enum.valueOf(j5g.class, str);
    }

    public static j5g[] values() {
        return (j5g[]) I.clone();
    }

    public final String a() {
        return this.E;
    }
}
