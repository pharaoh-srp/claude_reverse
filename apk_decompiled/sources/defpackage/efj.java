package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class efj {
    public static final efj E;
    public static final efj F;
    public static final efj G;
    public static final efj H;
    public static final efj I;
    public static final efj J;
    public static final efj K;
    public static final efj L;
    public static final efj M;
    public static final /* synthetic */ efj[] N;

    static {
        efj efjVar = new efj("INT", 0);
        E = efjVar;
        efj efjVar2 = new efj("LONG", 1);
        F = efjVar2;
        efj efjVar3 = new efj("FLOAT", 2);
        G = efjVar3;
        efj efjVar4 = new efj("DOUBLE", 3);
        H = efjVar4;
        efj efjVar5 = new efj("BOOLEAN", 4);
        I = efjVar5;
        efj efjVar6 = new efj("STRING", 5);
        J = efjVar6;
        h22 h22Var = h22.G;
        efj efjVar7 = new efj("BYTE_STRING", 6);
        K = efjVar7;
        efj efjVar8 = new efj("ENUM", 7);
        L = efjVar8;
        efj efjVar9 = new efj("MESSAGE", 8);
        M = efjVar9;
        N = new efj[]{efjVar, efjVar2, efjVar3, efjVar4, efjVar5, efjVar6, efjVar7, efjVar8, efjVar9};
    }

    public static efj valueOf(String str) {
        return (efj) Enum.valueOf(efj.class, str);
    }

    public static efj[] values() {
        return (efj[]) N.clone();
    }
}
