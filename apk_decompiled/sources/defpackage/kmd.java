package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class kmd {
    public static final kmd E;
    public static final kmd F;
    public static final kmd G;
    public static final kmd H;
    public static final kmd I;
    public static final kmd J;
    public static final kmd K;
    public static final /* synthetic */ kmd[] L;
    public static final /* synthetic */ gq6 M;

    static {
        kmd kmdVar = new kmd("IS_CREATOR", 0);
        E = kmdVar;
        kmd kmdVar2 = new kmd("IS_SHARED_WITH_ORG", 1);
        F = kmdVar2;
        kmd kmdVar3 = new kmd("IS_SHARED_WITH_ME", 2);
        G = kmdVar3;
        kmd kmdVar4 = new kmd("STARRED", 3);
        H = kmdVar4;
        kmd kmdVar5 = new kmd("ALL", 4);
        I = kmdVar5;
        kmd kmdVar6 = new kmd("SEARCH", 5);
        J = kmdVar6;
        kmd kmdVar7 = new kmd("ARCHIVED", 6);
        K = kmdVar7;
        kmd[] kmdVarArr = {kmdVar, kmdVar2, kmdVar3, kmdVar4, kmdVar5, kmdVar6, kmdVar7};
        L = kmdVarArr;
        M = new gq6(kmdVarArr);
    }

    public static kmd valueOf(String str) {
        return (kmd) Enum.valueOf(kmd.class, str);
    }

    public static kmd[] values() {
        return (kmd[]) L.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        return (iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 6) ? false : true;
    }
}
