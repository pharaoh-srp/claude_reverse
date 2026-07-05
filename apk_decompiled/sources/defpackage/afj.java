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
public class afj {
    public static final kej F;
    public static final sej G;
    public static final /* synthetic */ afj[] H;
    public final efj E;

    /* JADX INFO: Fake field, exist only in values array */
    afj EF0;

    /* JADX INFO: Fake field, exist only in values array */
    afj EF1;

    /* JADX INFO: Fake field, exist only in values array */
    afj EF2;

    static {
        afj afjVar = new afj("DOUBLE", 0, efj.H, 1);
        afj afjVar2 = new afj("FLOAT", 1, efj.G, 5);
        efj efjVar = efj.F;
        afj afjVar3 = new afj("INT64", 2, efjVar, 0);
        afj afjVar4 = new afj("UINT64", 3, efjVar, 0);
        efj efjVar2 = efj.E;
        afj afjVar5 = new afj("INT32", 4, efjVar2, 0);
        afj afjVar6 = new afj("FIXED64", 5, efjVar, 1);
        afj afjVar7 = new afj("FIXED32", 6, efjVar2, 5);
        afj afjVar8 = new afj("BOOL", 7, efj.I, 0);
        kej kejVar = new kej("STRING", 8, efj.J, 2);
        F = kejVar;
        efj efjVar3 = efj.M;
        oej oejVar = new oej("GROUP", 9, efjVar3, 3);
        sej sejVar = new sej("MESSAGE", 10, efjVar3, 2);
        G = sejVar;
        H = new afj[]{afjVar, afjVar2, afjVar3, afjVar4, afjVar5, afjVar6, afjVar7, afjVar8, kejVar, oejVar, sejVar, new wej("BYTES", 11, efj.K, 2), new afj("UINT32", 12, efjVar2, 0), new afj("ENUM", 13, efj.L, 0), new afj("SFIXED32", 14, efjVar2, 5), new afj("SFIXED64", 15, efjVar, 1), new afj("SINT32", 16, efjVar2, 0), new afj("SINT64", 17, efjVar, 0)};
    }

    public afj(String str, int i, efj efjVar, int i2) {
        this.E = efjVar;
    }

    public static afj valueOf(String str) {
        return (afj) Enum.valueOf(afj.class, str);
    }

    public static afj[] values() {
        return (afj[]) H.clone();
    }
}
