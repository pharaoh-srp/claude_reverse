package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class jk7 {
    public static final jk7 E;
    public static final /* synthetic */ jk7[] F;

    /* JADX INFO: Fake field, exist only in values array */
    jk7 EF0;

    static {
        jk7 jk7Var = new jk7("TOP_DOWN", 0);
        jk7 jk7Var2 = new jk7("BOTTOM_UP", 1);
        E = jk7Var2;
        F = new jk7[]{jk7Var, jk7Var2};
    }

    public static jk7 valueOf(String str) {
        return (jk7) Enum.valueOf(jk7.class, str);
    }

    public static jk7[] values() {
        return (jk7[]) F.clone();
    }
}
