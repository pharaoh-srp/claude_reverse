package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public class bfj {
    public static final bfj G;
    public static final bfj H;
    public static final pej I;
    public static final tej J;
    public static final bfj K;
    public static final /* synthetic */ bfj[] L;
    public final ffj E;
    public final int F;

    /* JADX INFO: Fake field, exist only in values array */
    bfj EF0;

    /* JADX INFO: Fake field, exist only in values array */
    bfj EF1;

    /* JADX INFO: Fake field, exist only in values array */
    bfj EF2;

    static {
        bfj bfjVar = new bfj("DOUBLE", 0, ffj.I, 1);
        bfj bfjVar2 = new bfj("FLOAT", 1, ffj.H, 5);
        ffj ffjVar = ffj.G;
        bfj bfjVar3 = new bfj("INT64", 2, ffjVar, 0);
        bfj bfjVar4 = new bfj("UINT64", 3, ffjVar, 0);
        ffj ffjVar2 = ffj.F;
        bfj bfjVar5 = new bfj("INT32", 4, ffjVar2, 0);
        G = bfjVar5;
        bfj bfjVar6 = new bfj("FIXED64", 5, ffjVar, 1);
        bfj bfjVar7 = new bfj("FIXED32", 6, ffjVar2, 5);
        bfj bfjVar8 = new bfj("BOOL", 7, ffj.J, 0);
        H = bfjVar8;
        lej lejVar = new lej("STRING", 8, ffj.K, 2);
        ffj ffjVar3 = ffj.N;
        pej pejVar = new pej("GROUP", 9, ffjVar3, 3);
        I = pejVar;
        tej tejVar = new tej("MESSAGE", 10, ffjVar3, 2);
        J = tejVar;
        xej xejVar = new xej("BYTES", 11, ffj.L, 2);
        bfj bfjVar9 = new bfj("UINT32", 12, ffjVar2, 0);
        bfj bfjVar10 = new bfj("ENUM", 13, ffj.M, 0);
        K = bfjVar10;
        L = new bfj[]{bfjVar, bfjVar2, bfjVar3, bfjVar4, bfjVar5, bfjVar6, bfjVar7, bfjVar8, lejVar, pejVar, tejVar, xejVar, bfjVar9, bfjVar10, new bfj("SFIXED32", 14, ffjVar2, 5), new bfj("SFIXED64", 15, ffjVar, 1), new bfj("SINT32", 16, ffjVar2, 0), new bfj("SINT64", 17, ffjVar, 0)};
    }

    public bfj(String str, int i, ffj ffjVar, int i2) {
        this.E = ffjVar;
        this.F = i2;
    }

    public static bfj valueOf(String str) {
        return (bfj) Enum.valueOf(bfj.class, str);
    }

    public static bfj[] values() {
        return (bfj[]) L.clone();
    }

    public boolean a() {
        return !(this instanceof lej);
    }
}
