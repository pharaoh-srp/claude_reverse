package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class jj7 {
    public static final jj7 E;
    public static final jj7 F;
    public static final jj7 G;
    public static final jj7 H;
    public static final /* synthetic */ jj7[] I;

    static {
        jj7 jj7Var = new jj7("MODIFIED", 0);
        E = jj7Var;
        jj7 jj7Var2 = new jj7("ADDED", 1);
        F = jj7Var2;
        jj7 jj7Var3 = new jj7("DELETED", 2);
        G = jj7Var3;
        jj7 jj7Var4 = new jj7("RENAMED", 3);
        H = jj7Var4;
        I = new jj7[]{jj7Var, jj7Var2, jj7Var3, jj7Var4, new jj7("BINARY", 4)};
    }

    public static jj7 valueOf(String str) {
        return (jj7) Enum.valueOf(jj7.class, str);
    }

    public static jj7[] values() {
        return (jj7[]) I.clone();
    }
}
