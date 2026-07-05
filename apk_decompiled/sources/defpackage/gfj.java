package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class gfj {
    public static final gfj E;
    public static final gfj F;
    public static final gfj G;
    public static final gfj H;
    public static final gfj I;
    public static final gfj J;
    public static final gfj K;
    public static final gfj L;
    public static final gfj M;
    public static final /* synthetic */ gfj[] N;

    static {
        gfj gfjVar = new gfj("INT", 0);
        E = gfjVar;
        gfj gfjVar2 = new gfj("LONG", 1);
        F = gfjVar2;
        gfj gfjVar3 = new gfj("FLOAT", 2);
        G = gfjVar3;
        gfj gfjVar4 = new gfj("DOUBLE", 3);
        H = gfjVar4;
        gfj gfjVar5 = new gfj("BOOLEAN", 4);
        I = gfjVar5;
        gfj gfjVar6 = new gfj("STRING", 5);
        J = gfjVar6;
        i22 i22Var = i22.G;
        gfj gfjVar7 = new gfj("BYTE_STRING", 6);
        K = gfjVar7;
        gfj gfjVar8 = new gfj("ENUM", 7);
        L = gfjVar8;
        gfj gfjVar9 = new gfj("MESSAGE", 8);
        M = gfjVar9;
        N = new gfj[]{gfjVar, gfjVar2, gfjVar3, gfjVar4, gfjVar5, gfjVar6, gfjVar7, gfjVar8, gfjVar9};
    }

    public static gfj valueOf(String str) {
        return (gfj) Enum.valueOf(gfj.class, str);
    }

    public static gfj[] values() {
        return (gfj[]) N.clone();
    }
}
