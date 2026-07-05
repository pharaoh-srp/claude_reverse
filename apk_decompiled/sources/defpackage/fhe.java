package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class fhe {
    public static final fhe E;
    public static final fhe F;
    public static final /* synthetic */ fhe[] G;

    static {
        fhe fheVar = new fhe("Restart", 0);
        E = fheVar;
        fhe fheVar2 = new fhe("Reverse", 1);
        F = fheVar2;
        G = new fhe[]{fheVar, fheVar2};
    }

    public static fhe valueOf(String str) {
        return (fhe) Enum.valueOf(fhe.class, str);
    }

    public static fhe[] values() {
        return (fhe[]) G.clone();
    }
}
