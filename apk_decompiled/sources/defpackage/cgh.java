package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class cgh {
    public static final cgh E;
    public static final cgh F;
    public static final /* synthetic */ cgh[] G;

    static {
        cgh cghVar = new cgh("MergeIfPossible", 0);
        E = cghVar;
        cgh cghVar2 = new cgh("ClearHistory", 1);
        cgh cghVar3 = new cgh("NeverMerge", 2);
        F = cghVar3;
        G = new cgh[]{cghVar, cghVar2, cghVar3};
    }

    public static cgh valueOf(String str) {
        return (cgh) Enum.valueOf(cgh.class, str);
    }

    public static cgh[] values() {
        return (cgh[]) G.clone();
    }
}
