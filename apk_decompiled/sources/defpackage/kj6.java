package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class kj6 {
    public static final kj6 E;
    public static final kj6 F;
    public static final /* synthetic */ kj6[] G;

    static {
        kj6 kj6Var = new kj6("Close", 0);
        E = kj6Var;
        kj6 kj6Var2 = new kj6("UnknownError", 1);
        F = kj6Var2;
        G = new kj6[]{kj6Var, kj6Var2};
    }

    public static kj6 valueOf(String str) {
        return (kj6) Enum.valueOf(kj6.class, str);
    }

    public static kj6[] values() {
        return (kj6[]) G.clone();
    }
}
