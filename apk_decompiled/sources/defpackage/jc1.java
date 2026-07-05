package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class jc1 {
    public static final jc1 E;
    public static final jc1 F;
    public static final /* synthetic */ jc1[] G;

    static {
        jc1 jc1Var = new jc1("EXPONENTIAL", 0);
        E = jc1Var;
        jc1 jc1Var2 = new jc1("LINEAR", 1);
        F = jc1Var2;
        G = new jc1[]{jc1Var, jc1Var2};
    }

    public static jc1 valueOf(String str) {
        return (jc1) Enum.valueOf(jc1.class, str);
    }

    public static jc1[] values() {
        return (jc1[]) G.clone();
    }
}
