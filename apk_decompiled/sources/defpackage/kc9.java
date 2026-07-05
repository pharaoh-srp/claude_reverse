package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class kc9 {
    public static final kc9 E;
    public static final kc9 F;
    public static final /* synthetic */ kc9[] G;

    static {
        kc9 kc9Var = new kc9("HEADER", 0);
        E = kc9Var;
        kc9 kc9Var2 = new kc9("SHARED_LINK_ITEM", 1);
        F = kc9Var2;
        G = new kc9[]{kc9Var, kc9Var2};
    }

    public static kc9 valueOf(String str) {
        return (kc9) Enum.valueOf(kc9.class, str);
    }

    public static kc9[] values() {
        return (kc9[]) G.clone();
    }
}
