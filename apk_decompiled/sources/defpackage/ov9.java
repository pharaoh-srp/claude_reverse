package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ov9 {
    public static final ov9 E;
    public static final /* synthetic */ ov9[] F;

    static {
        ov9 ov9Var = new ov9("Horizontal", 0);
        E = ov9Var;
        F = new ov9[]{ov9Var, new ov9("Vertical", 1)};
    }

    public static ov9 valueOf(String str) {
        return (ov9) Enum.valueOf(ov9.class, str);
    }

    public static ov9[] values() {
        return (ov9[]) F.clone();
    }
}
