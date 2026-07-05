package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class fdd {
    public static final fdd E;
    public static final fdd F;
    public static final fdd G;
    public static final fdd H;
    public static final fdd I;
    public static final fdd J;
    public static final fdd K;
    public static final fdd L;
    public static final fdd M;
    public static final fdd N;
    public static final /* synthetic */ fdd[] O;

    static {
        fdd fddVar = new fdd("none", 0);
        E = fddVar;
        fdd fddVar2 = new fdd("xMinYMin", 1);
        F = fddVar2;
        fdd fddVar3 = new fdd("xMidYMin", 2);
        G = fddVar3;
        fdd fddVar4 = new fdd("xMaxYMin", 3);
        H = fddVar4;
        fdd fddVar5 = new fdd("xMinYMid", 4);
        I = fddVar5;
        fdd fddVar6 = new fdd("xMidYMid", 5);
        J = fddVar6;
        fdd fddVar7 = new fdd("xMaxYMid", 6);
        K = fddVar7;
        fdd fddVar8 = new fdd("xMinYMax", 7);
        L = fddVar8;
        fdd fddVar9 = new fdd("xMidYMax", 8);
        M = fddVar9;
        fdd fddVar10 = new fdd("xMaxYMax", 9);
        N = fddVar10;
        O = new fdd[]{fddVar, fddVar2, fddVar3, fddVar4, fddVar5, fddVar6, fddVar7, fddVar8, fddVar9, fddVar10};
    }

    public static fdd valueOf(String str) {
        return (fdd) Enum.valueOf(fdd.class, str);
    }

    public static fdd[] values() {
        return (fdd[]) O.clone();
    }
}
