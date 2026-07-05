package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class se3 {
    public static final se3 E;
    public static final /* synthetic */ se3[] F;

    static {
        se3 se3Var = new se3("SINGLE", 0);
        E = se3Var;
        F = new se3[]{se3Var, new se3("DUAL", 1), new se3("TRIPLE", 2)};
    }

    public static se3 valueOf(String str) {
        return (se3) Enum.valueOf(se3.class, str);
    }

    public static se3[] values() {
        return (se3[]) F.clone();
    }
}
