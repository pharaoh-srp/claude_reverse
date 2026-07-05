package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class x67 {
    public static final x67 E;
    public static final /* synthetic */ x67[] F;

    /* JADX INFO: Fake field, exist only in values array */
    x67 EF0;

    static {
        x67 x67Var = new x67("IGNORE", 0);
        x67 x67Var2 = new x67("RESPECT_PERFORMANCE", 1);
        E = x67Var2;
        F = new x67[]{x67Var, x67Var2, new x67("RESPECT_ALL", 2)};
    }

    public static x67 valueOf(String str) {
        return (x67) Enum.valueOf(x67.class, str);
    }

    public static x67[] values() {
        return (x67[]) F.clone();
    }
}
