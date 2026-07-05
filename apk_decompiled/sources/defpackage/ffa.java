package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ffa {
    public static final ffa E;
    public static final ffa F;
    public static final ffa G;
    public static final /* synthetic */ ffa[] H;

    static {
        ffa ffaVar = new ffa("NOT_COMPUTED", 0);
        E = ffaVar;
        ffa ffaVar2 = new ffa("COMPUTING", 1);
        F = ffaVar2;
        ffa ffaVar3 = new ffa("RECURSION_WAS_DETECTED", 2);
        G = ffaVar3;
        H = new ffa[]{ffaVar, ffaVar2, ffaVar3};
    }

    public static ffa valueOf(String str) {
        return (ffa) Enum.valueOf(ffa.class, str);
    }

    public static ffa[] values() {
        return (ffa[]) H.clone();
    }
}
