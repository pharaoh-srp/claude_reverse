package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class jc9 {
    public static final jc9 E;
    public static final /* synthetic */ jc9[] F;

    static {
        jc9 jc9Var = new jc9("BottomSpacer", 0);
        E = jc9Var;
        F = new jc9[]{jc9Var};
    }

    public static jc9 valueOf(String str) {
        return (jc9) Enum.valueOf(jc9.class, str);
    }

    public static jc9[] values() {
        return (jc9[]) F.clone();
    }
}
