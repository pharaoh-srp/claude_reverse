package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class bdk {
    public static final bdk F;
    public static final bdk G;
    public static final bdk[] H;
    public static final /* synthetic */ bdk[] I;
    public final int E;

    /* JADX INFO: Fake field, exist only in values array */
    bdk EF0;

    static {
        yfk yfkVar = yfk.I;
        bdk bdkVar = new bdk("DOUBLE", 0, 0, 1, yfkVar);
        yfk yfkVar2 = yfk.H;
        bdk bdkVar2 = new bdk("FLOAT", 1, 1, 1, yfkVar2);
        yfk yfkVar3 = yfk.G;
        bdk bdkVar3 = new bdk("INT64", 2, 2, 1, yfkVar3);
        bdk bdkVar4 = new bdk("UINT64", 3, 3, 1, yfkVar3);
        yfk yfkVar4 = yfk.F;
        bdk bdkVar5 = new bdk("INT32", 4, 4, 1, yfkVar4);
        bdk bdkVar6 = new bdk("FIXED64", 5, 5, 1, yfkVar3);
        bdk bdkVar7 = new bdk("FIXED32", 6, 6, 1, yfkVar4);
        yfk yfkVar5 = yfk.J;
        bdk bdkVar8 = new bdk("BOOL", 7, 7, 1, yfkVar5);
        yfk yfkVar6 = yfk.K;
        bdk bdkVar9 = new bdk("STRING", 8, 8, 1, yfkVar6);
        yfk yfkVar7 = yfk.N;
        bdk bdkVar10 = new bdk("MESSAGE", 9, 9, 1, yfkVar7);
        yfk yfkVar8 = yfk.L;
        bdk bdkVar11 = new bdk("BYTES", 10, 10, 1, yfkVar8);
        bdk bdkVar12 = new bdk("UINT32", 11, 11, 1, yfkVar4);
        yfk yfkVar9 = yfk.M;
        bdk bdkVar13 = new bdk("ENUM", 12, 12, 1, yfkVar9);
        bdk bdkVar14 = new bdk("SFIXED32", 13, 13, 1, yfkVar4);
        bdk bdkVar15 = new bdk("SFIXED64", 14, 14, 1, yfkVar3);
        bdk bdkVar16 = new bdk("SINT32", 15, 15, 1, yfkVar4);
        bdk bdkVar17 = new bdk("SINT64", 16, 16, 1, yfkVar3);
        bdk bdkVar18 = new bdk("GROUP", 17, 17, 1, yfkVar7);
        bdk bdkVar19 = new bdk("DOUBLE_LIST", 18, 18, 2, yfkVar);
        bdk bdkVar20 = new bdk("FLOAT_LIST", 19, 19, 2, yfkVar2);
        bdk bdkVar21 = new bdk("INT64_LIST", 20, 20, 2, yfkVar3);
        bdk bdkVar22 = new bdk("UINT64_LIST", 21, 21, 2, yfkVar3);
        bdk bdkVar23 = new bdk("INT32_LIST", 22, 22, 2, yfkVar4);
        bdk bdkVar24 = new bdk("FIXED64_LIST", 23, 23, 2, yfkVar3);
        bdk bdkVar25 = new bdk("FIXED32_LIST", 24, 24, 2, yfkVar4);
        bdk bdkVar26 = new bdk("BOOL_LIST", 25, 25, 2, yfkVar5);
        bdk bdkVar27 = new bdk("STRING_LIST", 26, 26, 2, yfkVar6);
        bdk bdkVar28 = new bdk("MESSAGE_LIST", 27, 27, 2, yfkVar7);
        bdk bdkVar29 = new bdk("BYTES_LIST", 28, 28, 2, yfkVar8);
        bdk bdkVar30 = new bdk("UINT32_LIST", 29, 29, 2, yfkVar4);
        bdk bdkVar31 = new bdk("ENUM_LIST", 30, 30, 2, yfkVar9);
        bdk bdkVar32 = new bdk("SFIXED32_LIST", 31, 31, 2, yfkVar4);
        bdk bdkVar33 = new bdk("SFIXED64_LIST", 32, 32, 2, yfkVar3);
        bdk bdkVar34 = new bdk("SINT32_LIST", 33, 33, 2, yfkVar4);
        bdk bdkVar35 = new bdk("SINT64_LIST", 34, 34, 2, yfkVar3);
        bdk bdkVar36 = new bdk("DOUBLE_LIST_PACKED", 35, 35, 3, yfkVar);
        F = bdkVar36;
        bdk bdkVar37 = new bdk("FLOAT_LIST_PACKED", 36, 36, 3, yfkVar2);
        bdk bdkVar38 = new bdk("INT64_LIST_PACKED", 37, 37, 3, yfkVar3);
        bdk bdkVar39 = new bdk("UINT64_LIST_PACKED", 38, 38, 3, yfkVar3);
        bdk bdkVar40 = new bdk("INT32_LIST_PACKED", 39, 39, 3, yfkVar4);
        bdk bdkVar41 = new bdk("FIXED64_LIST_PACKED", 40, 40, 3, yfkVar3);
        bdk bdkVar42 = new bdk("FIXED32_LIST_PACKED", 41, 41, 3, yfkVar4);
        bdk bdkVar43 = new bdk("BOOL_LIST_PACKED", 42, 42, 3, yfkVar5);
        bdk bdkVar44 = new bdk("UINT32_LIST_PACKED", 43, 43, 3, yfkVar4);
        bdk bdkVar45 = new bdk("ENUM_LIST_PACKED", 44, 44, 3, yfkVar9);
        bdk bdkVar46 = new bdk("SFIXED32_LIST_PACKED", 45, 45, 3, yfkVar4);
        bdk bdkVar47 = new bdk("SFIXED64_LIST_PACKED", 46, 46, 3, yfkVar3);
        bdk bdkVar48 = new bdk("SINT32_LIST_PACKED", 47, 47, 3, yfkVar4);
        bdk bdkVar49 = new bdk("SINT64_LIST_PACKED", 48, 48, 3, yfkVar3);
        G = bdkVar49;
        I = new bdk[]{bdkVar, bdkVar2, bdkVar3, bdkVar4, bdkVar5, bdkVar6, bdkVar7, bdkVar8, bdkVar9, bdkVar10, bdkVar11, bdkVar12, bdkVar13, bdkVar14, bdkVar15, bdkVar16, bdkVar17, bdkVar18, bdkVar19, bdkVar20, bdkVar21, bdkVar22, bdkVar23, bdkVar24, bdkVar25, bdkVar26, bdkVar27, bdkVar28, bdkVar29, bdkVar30, bdkVar31, bdkVar32, bdkVar33, bdkVar34, bdkVar35, bdkVar36, bdkVar37, bdkVar38, bdkVar39, bdkVar40, bdkVar41, bdkVar42, bdkVar43, bdkVar44, bdkVar45, bdkVar46, bdkVar47, bdkVar48, bdkVar49, new bdk("GROUP_LIST", 49, 49, 2, yfkVar7), new bdk("MAP", 50, 50, 4, yfk.E)};
        bdk[] bdkVarArrValues = values();
        H = new bdk[bdkVarArrValues.length];
        for (bdk bdkVar50 : bdkVarArrValues) {
            H[bdkVar50.E] = bdkVar50;
        }
    }

    public bdk(String str, int i, int i2, int i3, yfk yfkVar) {
        this.E = i2;
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            yfkVar.getClass();
        }
        if (i3 == 1) {
            yfk yfkVar2 = yfk.E;
            yfkVar.ordinal();
        }
    }

    public static bdk[] values() {
        return (bdk[]) I.clone();
    }
}
