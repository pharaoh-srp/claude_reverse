package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ind {
    public static final ind E;
    public static final ind F;
    public static final ind G;
    public static final ind H;
    public static final ind I;
    public static final ind J;
    public static final /* synthetic */ ind[] K;

    static {
        ind indVar = new ind("EMPTY_STATE", 0);
        E = indVar;
        ind indVar2 = new ind("PROJECT", 1);
        F = indVar2;
        ind indVar3 = new ind("END_SPACER", 2);
        G = indVar3;
        ind indVar4 = new ind("STUDENT_CTA", 3);
        H = indVar4;
        ind indVar5 = new ind("SEARCH_LOADING", 4);
        I = indVar5;
        ind indVar6 = new ind("PAGINATION_LOADING", 5);
        J = indVar6;
        K = new ind[]{indVar, indVar2, indVar3, indVar4, indVar5, indVar6};
    }

    public static ind valueOf(String str) {
        return (ind) Enum.valueOf(ind.class, str);
    }

    public static ind[] values() {
        return (ind[]) K.clone();
    }
}
