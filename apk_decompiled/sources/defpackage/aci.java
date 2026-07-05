package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class aci {
    public static final aci E;
    public static final aci F;
    public static final aci G;
    public static final aci H;
    public static final aci I;
    public static final aci J;
    public static final aci K;
    public static final aci L;
    public static final aci M;
    public static final /* synthetic */ aci[] N;

    static {
        aci aciVar = new aci("BodyLarge", 0);
        E = aciVar;
        aci aciVar2 = new aci("BodyMedium", 1);
        F = aciVar2;
        aci aciVar3 = new aci("BodySmall", 2);
        G = aciVar3;
        aci aciVar4 = new aci("DisplayLarge", 3);
        aci aciVar5 = new aci("DisplayMedium", 4);
        aci aciVar6 = new aci("DisplaySmall", 5);
        aci aciVar7 = new aci("HeadlineLarge", 6);
        H = aciVar7;
        aci aciVar8 = new aci("HeadlineMedium", 7);
        aci aciVar9 = new aci("HeadlineSmall", 8);
        I = aciVar9;
        aci aciVar10 = new aci("LabelLarge", 9);
        J = aciVar10;
        aci aciVar11 = new aci("LabelMedium", 10);
        K = aciVar11;
        aci aciVar12 = new aci("LabelSmall", 11);
        L = aciVar12;
        aci aciVar13 = new aci("TitleLarge", 12);
        M = aciVar13;
        N = new aci[]{aciVar, aciVar2, aciVar3, aciVar4, aciVar5, aciVar6, aciVar7, aciVar8, aciVar9, aciVar10, aciVar11, aciVar12, aciVar13, new aci("TitleMedium", 13), new aci("TitleSmall", 14), new aci("BodyLargeEmphasized", 15), new aci("BodyMediumEmphasized", 16), new aci("BodySmallEmphasized", 17), new aci("DisplayLargeEmphasized", 18), new aci("DisplayMediumEmphasized", 19), new aci("DisplaySmallEmphasized", 20), new aci("HeadlineLargeEmphasized", 21), new aci("HeadlineMediumEmphasized", 22), new aci("HeadlineSmallEmphasized", 23), new aci("LabelLargeEmphasized", 24), new aci("LabelMediumEmphasized", 25), new aci("LabelSmallEmphasized", 26), new aci("TitleLargeEmphasized", 27), new aci("TitleMediumEmphasized", 28), new aci("TitleSmallEmphasized", 29)};
    }

    public static aci valueOf(String str) {
        return (aci) Enum.valueOf(aci.class, str);
    }

    public static aci[] values() {
        return (aci[]) N.clone();
    }
}
