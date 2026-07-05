package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class lwh {
    public static final lwh E;
    public static final lwh F;
    public static final lwh G;
    public static final lwh H;
    public static final lwh I;
    public static final lwh J;
    public static final lwh K;
    public static final lwh L;
    public static final lwh M;
    public static final lwh N;
    public static final lwh O;
    public static final /* synthetic */ lwh[] P;

    static {
        lwh lwhVar = new lwh("RequestHeading", 0);
        E = lwhVar;
        lwh lwhVar2 = new lwh("RequestSection", 1);
        F = lwhVar2;
        lwh lwhVar3 = new lwh("ResponseHeading", 2);
        G = lwhVar3;
        lwh lwhVar4 = new lwh("ResponseSection", 3);
        H = lwhVar4;
        lwh lwhVar5 = new lwh("CodeBlock", 4);
        I = lwhVar5;
        lwh lwhVar6 = new lwh("JsonBlock", 5);
        J = lwhVar6;
        lwh lwhVar7 = new lwh("RichItem", 6);
        K = lwhVar7;
        lwh lwhVar8 = new lwh("RichLink", 7);
        L = lwhVar8;
        lwh lwhVar9 = new lwh("TableRow", 8);
        M = lwhVar9;
        lwh lwhVar10 = new lwh("Text", 9);
        N = lwhVar10;
        lwh lwhVar11 = new lwh("Unknown", 10);
        O = lwhVar11;
        P = new lwh[]{lwhVar, lwhVar2, lwhVar3, lwhVar4, lwhVar5, lwhVar6, lwhVar7, lwhVar8, lwhVar9, lwhVar10, lwhVar11};
    }

    public static lwh valueOf(String str) {
        return (lwh) Enum.valueOf(lwh.class, str);
    }

    public static lwh[] values() {
        return (lwh[]) P.clone();
    }
}
