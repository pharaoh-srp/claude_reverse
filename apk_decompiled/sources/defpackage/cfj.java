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
public class cfj {
    public static final mej G;
    public static final qej H;
    public static final uej I;
    public static final /* synthetic */ cfj[] J;
    public final gfj E;
    public final int F;

    /* JADX INFO: Fake field, exist only in values array */
    cfj EF0;

    /* JADX INFO: Fake field, exist only in values array */
    cfj EF1;

    /* JADX INFO: Fake field, exist only in values array */
    cfj EF2;

    static {
        cfj cfjVar = new cfj("DOUBLE", 0, gfj.H, 1);
        cfj cfjVar2 = new cfj("FLOAT", 1, gfj.G, 5);
        gfj gfjVar = gfj.F;
        cfj cfjVar3 = new cfj("INT64", 2, gfjVar, 0);
        cfj cfjVar4 = new cfj("UINT64", 3, gfjVar, 0);
        gfj gfjVar2 = gfj.E;
        cfj cfjVar5 = new cfj("INT32", 4, gfjVar2, 0);
        cfj cfjVar6 = new cfj("FIXED64", 5, gfjVar, 1);
        cfj cfjVar7 = new cfj("FIXED32", 6, gfjVar2, 5);
        cfj cfjVar8 = new cfj("BOOL", 7, gfj.I, 0);
        mej mejVar = new mej("STRING", 8, gfj.J, 2);
        G = mejVar;
        gfj gfjVar3 = gfj.M;
        qej qejVar = new qej("GROUP", 9, gfjVar3, 3);
        H = qejVar;
        uej uejVar = new uej("MESSAGE", 10, gfjVar3, 2);
        I = uejVar;
        J = new cfj[]{cfjVar, cfjVar2, cfjVar3, cfjVar4, cfjVar5, cfjVar6, cfjVar7, cfjVar8, mejVar, qejVar, uejVar, new yej("BYTES", 11, gfj.K, 2), new cfj("UINT32", 12, gfjVar2, 0), new cfj("ENUM", 13, gfj.L, 0), new cfj("SFIXED32", 14, gfjVar2, 5), new cfj("SFIXED64", 15, gfjVar, 1), new cfj("SINT32", 16, gfjVar2, 0), new cfj("SINT64", 17, gfjVar, 0)};
    }

    public cfj(String str, int i, gfj gfjVar, int i2) {
        this.E = gfjVar;
        this.F = i2;
    }

    public static cfj valueOf(String str) {
        return (cfj) Enum.valueOf(cfj.class, str);
    }

    public static cfj[] values() {
        return (cfj[]) J.clone();
    }
}
