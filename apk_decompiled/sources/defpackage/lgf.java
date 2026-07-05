package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class lgf {
    public static final lgf E;
    public static final lgf F;
    public static final lgf G;
    public static final lgf H;
    public static final /* synthetic */ lgf[] I;

    static {
        lgf lgfVar = new lgf("BottomSpacer", 0);
        E = lgfVar;
        lgf lgfVar2 = new lgf("LoadingItems", 1);
        F = lgfVar2;
        lgf lgfVar3 = new lgf("EmptyState", 2);
        G = lgfVar3;
        lgf lgfVar4 = new lgf("PaginationLoading", 3);
        H = lgfVar4;
        I = new lgf[]{lgfVar, lgfVar2, lgfVar3, lgfVar4};
    }

    public static lgf valueOf(String str) {
        return (lgf) Enum.valueOf(lgf.class, str);
    }

    public static lgf[] values() {
        return (lgf[]) I.clone();
    }
}
