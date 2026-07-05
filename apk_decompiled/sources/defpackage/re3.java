package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class re3 {
    public static final re3 E;
    public static final re3 F;
    public static final /* synthetic */ re3[] G;

    /* JADX INFO: Fake field, exist only in values array */
    re3 EF0;

    static {
        re3 re3Var = new re3("DESTROYED", 0);
        re3 re3Var2 = new re3("CREATED", 1);
        E = re3Var2;
        re3 re3Var3 = new re3("STARTED", 2);
        re3 re3Var4 = new re3("RESUMED", 3);
        F = re3Var4;
        G = new re3[]{re3Var, re3Var2, re3Var3, re3Var4};
    }

    public static re3 valueOf(String str) {
        return (re3) Enum.valueOf(re3.class, str);
    }

    public static re3[] values() {
        return (re3[]) G.clone();
    }
}
