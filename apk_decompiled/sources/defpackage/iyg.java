package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class iyg {
    public static final iyg E;
    public static final iyg F;
    public static final iyg G;
    public static final iyg H;
    public static final iyg I;
    public static final /* synthetic */ iyg[] J;

    static {
        iyg iygVar = new iyg("NeedsInput", 0);
        E = iygVar;
        iyg iygVar2 = new iyg("NeedsInputQuestion", 1);
        F = iygVar2;
        iyg iygVar3 = new iyg("NeedsInputPermission", 2);
        G = iygVar3;
        iyg iygVar4 = new iyg("Working", 3);
        H = iygVar4;
        iyg iygVar5 = new iyg("Normal", 4);
        I = iygVar5;
        J = new iyg[]{iygVar, iygVar2, iygVar3, iygVar4, iygVar5};
    }

    public static iyg valueOf(String str) {
        return (iyg) Enum.valueOf(iyg.class, str);
    }

    public static iyg[] values() {
        return (iyg[]) J.clone();
    }
}
