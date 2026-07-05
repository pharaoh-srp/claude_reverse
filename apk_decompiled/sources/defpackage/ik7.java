package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ik7 {
    public static final ik7 E;
    public static final ik7 F;
    public static final /* synthetic */ ik7[] G;

    static {
        ik7 ik7Var = new ik7("EMPTY_STATE", 0);
        E = ik7Var;
        ik7 ik7Var2 = new ik7("FILE_ITEM", 1);
        F = ik7Var2;
        G = new ik7[]{ik7Var, ik7Var2};
    }

    public static ik7 valueOf(String str) {
        return (ik7) Enum.valueOf(ik7.class, str);
    }

    public static ik7[] values() {
        return (ik7[]) G.clone();
    }
}
