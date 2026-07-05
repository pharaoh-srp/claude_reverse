package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class v35 {
    public static final v35 E;
    public static final v35 F;
    public static final v35 G;
    public static final v35 H;
    public static final /* synthetic */ v35[] I;

    static {
        v35 v35Var = new v35("TopLeft", 0);
        E = v35Var;
        v35 v35Var2 = new v35("TopRight", 1);
        F = v35Var2;
        v35 v35Var3 = new v35("BottomRight", 2);
        G = v35Var3;
        v35 v35Var4 = new v35("BottomLeft", 3);
        H = v35Var4;
        I = new v35[]{v35Var, v35Var2, v35Var3, v35Var4};
    }

    public static v35 valueOf(String str) {
        return (v35) Enum.valueOf(v35.class, str);
    }

    public static v35[] values() {
        return (v35[]) I.clone();
    }
}
