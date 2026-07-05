package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class alg {
    public static final bm4 E;
    public static final alg F;
    public static final alg G;
    public static final alg H;
    public static final alg I;
    public static final /* synthetic */ alg[] J;
    public static final /* synthetic */ gq6 K;

    static {
        alg algVar = new alg("DEFAULT", 0);
        F = algVar;
        alg algVar2 = new alg("CAMERA", 1);
        G = algVar2;
        alg algVar3 = new alg("VOICE", 2);
        H = algVar3;
        alg algVar4 = new alg("BELL_MODE", 3);
        I = algVar4;
        alg[] algVarArr = {algVar, algVar2, algVar3, algVar4};
        J = algVarArr;
        K = new gq6(algVarArr);
        E = new bm4();
    }

    public static alg valueOf(String str) {
        return (alg) Enum.valueOf(alg.class, str);
    }

    public static alg[] values() {
        return (alg[]) J.clone();
    }
}
