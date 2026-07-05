package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class kq9 {
    public static final kq9 E;
    public static final kq9 F;
    public static final kq9 G;
    public static final /* synthetic */ kq9[] H;

    static {
        kq9 kq9Var = new kq9("Singleton", 0);
        E = kq9Var;
        kq9 kq9Var2 = new kq9("Factory", 1);
        F = kq9Var2;
        kq9 kq9Var3 = new kq9("Scoped", 2);
        G = kq9Var3;
        H = new kq9[]{kq9Var, kq9Var2, kq9Var3};
    }

    public static kq9 valueOf(String str) {
        return (kq9) Enum.valueOf(kq9.class, str);
    }

    public static kq9[] values() {
        return (kq9[]) H.clone();
    }
}
