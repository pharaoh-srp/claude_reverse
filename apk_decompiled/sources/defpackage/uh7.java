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
/* JADX INFO: loaded from: classes2.dex */
public final class uh7 {
    public static final uh7 F;
    public static final uh7 G;
    public static final uh7[] H;
    public static final /* synthetic */ uh7[] I;
    public final int E;

    /* JADX INFO: Fake field, exist only in values array */
    uh7 EF0;

    static {
        ve9 ve9Var = ve9.I;
        uh7 uh7Var = new uh7("DOUBLE", 0, 0, 1, ve9Var);
        ve9 ve9Var2 = ve9.H;
        uh7 uh7Var2 = new uh7("FLOAT", 1, 1, 1, ve9Var2);
        ve9 ve9Var3 = ve9.G;
        uh7 uh7Var3 = new uh7("INT64", 2, 2, 1, ve9Var3);
        uh7 uh7Var4 = new uh7("UINT64", 3, 3, 1, ve9Var3);
        ve9 ve9Var4 = ve9.F;
        uh7 uh7Var5 = new uh7("INT32", 4, 4, 1, ve9Var4);
        uh7 uh7Var6 = new uh7("FIXED64", 5, 5, 1, ve9Var3);
        uh7 uh7Var7 = new uh7("FIXED32", 6, 6, 1, ve9Var4);
        ve9 ve9Var5 = ve9.J;
        uh7 uh7Var8 = new uh7("BOOL", 7, 7, 1, ve9Var5);
        ve9 ve9Var6 = ve9.K;
        uh7 uh7Var9 = new uh7("STRING", 8, 8, 1, ve9Var6);
        ve9 ve9Var7 = ve9.N;
        uh7 uh7Var10 = new uh7("MESSAGE", 9, 9, 1, ve9Var7);
        ve9 ve9Var8 = ve9.L;
        uh7 uh7Var11 = new uh7("BYTES", 10, 10, 1, ve9Var8);
        uh7 uh7Var12 = new uh7("UINT32", 11, 11, 1, ve9Var4);
        ve9 ve9Var9 = ve9.M;
        uh7 uh7Var13 = new uh7("ENUM", 12, 12, 1, ve9Var9);
        uh7 uh7Var14 = new uh7("SFIXED32", 13, 13, 1, ve9Var4);
        uh7 uh7Var15 = new uh7("SFIXED64", 14, 14, 1, ve9Var3);
        uh7 uh7Var16 = new uh7("SINT32", 15, 15, 1, ve9Var4);
        uh7 uh7Var17 = new uh7("SINT64", 16, 16, 1, ve9Var3);
        uh7 uh7Var18 = new uh7("GROUP", 17, 17, 1, ve9Var7);
        uh7 uh7Var19 = new uh7("DOUBLE_LIST", 18, 18, 2, ve9Var);
        uh7 uh7Var20 = new uh7("FLOAT_LIST", 19, 19, 2, ve9Var2);
        uh7 uh7Var21 = new uh7("INT64_LIST", 20, 20, 2, ve9Var3);
        uh7 uh7Var22 = new uh7("UINT64_LIST", 21, 21, 2, ve9Var3);
        uh7 uh7Var23 = new uh7("INT32_LIST", 22, 22, 2, ve9Var4);
        uh7 uh7Var24 = new uh7("FIXED64_LIST", 23, 23, 2, ve9Var3);
        uh7 uh7Var25 = new uh7("FIXED32_LIST", 24, 24, 2, ve9Var4);
        uh7 uh7Var26 = new uh7("BOOL_LIST", 25, 25, 2, ve9Var5);
        uh7 uh7Var27 = new uh7("STRING_LIST", 26, 26, 2, ve9Var6);
        uh7 uh7Var28 = new uh7("MESSAGE_LIST", 27, 27, 2, ve9Var7);
        uh7 uh7Var29 = new uh7("BYTES_LIST", 28, 28, 2, ve9Var8);
        uh7 uh7Var30 = new uh7("UINT32_LIST", 29, 29, 2, ve9Var4);
        uh7 uh7Var31 = new uh7("ENUM_LIST", 30, 30, 2, ve9Var9);
        uh7 uh7Var32 = new uh7("SFIXED32_LIST", 31, 31, 2, ve9Var4);
        uh7 uh7Var33 = new uh7("SFIXED64_LIST", 32, 32, 2, ve9Var3);
        uh7 uh7Var34 = new uh7("SINT32_LIST", 33, 33, 2, ve9Var4);
        uh7 uh7Var35 = new uh7("SINT64_LIST", 34, 34, 2, ve9Var3);
        uh7 uh7Var36 = new uh7("DOUBLE_LIST_PACKED", 35, 35, 3, ve9Var);
        F = uh7Var36;
        uh7 uh7Var37 = new uh7("FLOAT_LIST_PACKED", 36, 36, 3, ve9Var2);
        uh7 uh7Var38 = new uh7("INT64_LIST_PACKED", 37, 37, 3, ve9Var3);
        uh7 uh7Var39 = new uh7("UINT64_LIST_PACKED", 38, 38, 3, ve9Var3);
        uh7 uh7Var40 = new uh7("INT32_LIST_PACKED", 39, 39, 3, ve9Var4);
        uh7 uh7Var41 = new uh7("FIXED64_LIST_PACKED", 40, 40, 3, ve9Var3);
        uh7 uh7Var42 = new uh7("FIXED32_LIST_PACKED", 41, 41, 3, ve9Var4);
        uh7 uh7Var43 = new uh7("BOOL_LIST_PACKED", 42, 42, 3, ve9Var5);
        uh7 uh7Var44 = new uh7("UINT32_LIST_PACKED", 43, 43, 3, ve9Var4);
        uh7 uh7Var45 = new uh7("ENUM_LIST_PACKED", 44, 44, 3, ve9Var9);
        uh7 uh7Var46 = new uh7("SFIXED32_LIST_PACKED", 45, 45, 3, ve9Var4);
        uh7 uh7Var47 = new uh7("SFIXED64_LIST_PACKED", 46, 46, 3, ve9Var3);
        uh7 uh7Var48 = new uh7("SINT32_LIST_PACKED", 47, 47, 3, ve9Var4);
        uh7 uh7Var49 = new uh7("SINT64_LIST_PACKED", 48, 48, 3, ve9Var3);
        G = uh7Var49;
        I = new uh7[]{uh7Var, uh7Var2, uh7Var3, uh7Var4, uh7Var5, uh7Var6, uh7Var7, uh7Var8, uh7Var9, uh7Var10, uh7Var11, uh7Var12, uh7Var13, uh7Var14, uh7Var15, uh7Var16, uh7Var17, uh7Var18, uh7Var19, uh7Var20, uh7Var21, uh7Var22, uh7Var23, uh7Var24, uh7Var25, uh7Var26, uh7Var27, uh7Var28, uh7Var29, uh7Var30, uh7Var31, uh7Var32, uh7Var33, uh7Var34, uh7Var35, uh7Var36, uh7Var37, uh7Var38, uh7Var39, uh7Var40, uh7Var41, uh7Var42, uh7Var43, uh7Var44, uh7Var45, uh7Var46, uh7Var47, uh7Var48, uh7Var49, new uh7("GROUP_LIST", 49, 49, 2, ve9Var7), new uh7("MAP", 50, 50, 4, ve9.E)};
        uh7[] uh7VarArrValues = values();
        H = new uh7[uh7VarArrValues.length];
        for (uh7 uh7Var50 : uh7VarArrValues) {
            H[uh7Var50.E] = uh7Var50;
        }
    }

    public uh7(String str, int i, int i2, int i3, ve9 ve9Var) {
        this.E = i2;
        int iF = sq6.F(i3);
        if (iF == 1 || iF == 3) {
            ve9Var.getClass();
        }
        if (i3 == 1) {
            ve9Var.ordinal();
        }
    }

    public static uh7 valueOf(String str) {
        return (uh7) Enum.valueOf(uh7.class, str);
    }

    public static uh7[] values() {
        return (uh7[]) I.clone();
    }
}
