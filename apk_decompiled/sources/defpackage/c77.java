package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class c77 {
    public static final c77 E;
    public static final c77 F;
    public static final c77 G;
    public static final c77 H;
    public static final /* synthetic */ c77[] I;

    static {
        c77 c77Var = new c77("REPLACE", 0);
        E = c77Var;
        c77 c77Var2 = new c77("KEEP", 1);
        F = c77Var2;
        c77 c77Var3 = new c77("APPEND", 2);
        G = c77Var3;
        c77 c77Var4 = new c77("APPEND_OR_REPLACE", 3);
        H = c77Var4;
        I = new c77[]{c77Var, c77Var2, c77Var3, c77Var4};
    }

    public static c77 valueOf(String str) {
        return (c77) Enum.valueOf(c77.class, str);
    }

    public static c77[] values() {
        return (c77[]) I.clone();
    }
}
