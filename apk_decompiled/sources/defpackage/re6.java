package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class re6 {
    public static final re6 E;
    public static final /* synthetic */ re6[] F;
    public static final /* synthetic */ gq6 G;

    static {
        re6 re6Var = new re6("COWORK_REMOTE", 0);
        E = re6Var;
        re6[] re6VarArr = {re6Var};
        F = re6VarArr;
        G = new gq6(re6VarArr);
    }

    public static re6 valueOf(String str) {
        return (re6) Enum.valueOf(re6.class, str);
    }

    public static re6[] values() {
        return (re6[]) F.clone();
    }
}
