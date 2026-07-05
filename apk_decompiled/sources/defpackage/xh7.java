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
public final class xh7 {
    public static final xh7 F;
    public static final xh7 G;
    public static final xh7[] H;
    public static final /* synthetic */ xh7[] I;
    public final int E;

    /* JADX INFO: Fake field, exist only in values array */
    xh7 EF0;

    static {
        ye9 ye9Var = ye9.I;
        xh7 xh7Var = new xh7("DOUBLE", 0, 0, 1, ye9Var);
        ye9 ye9Var2 = ye9.H;
        xh7 xh7Var2 = new xh7("FLOAT", 1, 1, 1, ye9Var2);
        ye9 ye9Var3 = ye9.G;
        xh7 xh7Var3 = new xh7("INT64", 2, 2, 1, ye9Var3);
        xh7 xh7Var4 = new xh7("UINT64", 3, 3, 1, ye9Var3);
        ye9 ye9Var4 = ye9.F;
        xh7 xh7Var5 = new xh7("INT32", 4, 4, 1, ye9Var4);
        xh7 xh7Var6 = new xh7("FIXED64", 5, 5, 1, ye9Var3);
        xh7 xh7Var7 = new xh7("FIXED32", 6, 6, 1, ye9Var4);
        ye9 ye9Var5 = ye9.J;
        xh7 xh7Var8 = new xh7("BOOL", 7, 7, 1, ye9Var5);
        ye9 ye9Var6 = ye9.K;
        xh7 xh7Var9 = new xh7("STRING", 8, 8, 1, ye9Var6);
        ye9 ye9Var7 = ye9.N;
        xh7 xh7Var10 = new xh7("MESSAGE", 9, 9, 1, ye9Var7);
        ye9 ye9Var8 = ye9.L;
        xh7 xh7Var11 = new xh7("BYTES", 10, 10, 1, ye9Var8);
        xh7 xh7Var12 = new xh7("UINT32", 11, 11, 1, ye9Var4);
        ye9 ye9Var9 = ye9.M;
        xh7 xh7Var13 = new xh7("ENUM", 12, 12, 1, ye9Var9);
        xh7 xh7Var14 = new xh7("SFIXED32", 13, 13, 1, ye9Var4);
        xh7 xh7Var15 = new xh7("SFIXED64", 14, 14, 1, ye9Var3);
        xh7 xh7Var16 = new xh7("SINT32", 15, 15, 1, ye9Var4);
        xh7 xh7Var17 = new xh7("SINT64", 16, 16, 1, ye9Var3);
        xh7 xh7Var18 = new xh7("GROUP", 17, 17, 1, ye9Var7);
        xh7 xh7Var19 = new xh7("DOUBLE_LIST", 18, 18, 2, ye9Var);
        xh7 xh7Var20 = new xh7("FLOAT_LIST", 19, 19, 2, ye9Var2);
        xh7 xh7Var21 = new xh7("INT64_LIST", 20, 20, 2, ye9Var3);
        xh7 xh7Var22 = new xh7("UINT64_LIST", 21, 21, 2, ye9Var3);
        xh7 xh7Var23 = new xh7("INT32_LIST", 22, 22, 2, ye9Var4);
        xh7 xh7Var24 = new xh7("FIXED64_LIST", 23, 23, 2, ye9Var3);
        xh7 xh7Var25 = new xh7("FIXED32_LIST", 24, 24, 2, ye9Var4);
        xh7 xh7Var26 = new xh7("BOOL_LIST", 25, 25, 2, ye9Var5);
        xh7 xh7Var27 = new xh7("STRING_LIST", 26, 26, 2, ye9Var6);
        xh7 xh7Var28 = new xh7("MESSAGE_LIST", 27, 27, 2, ye9Var7);
        xh7 xh7Var29 = new xh7("BYTES_LIST", 28, 28, 2, ye9Var8);
        xh7 xh7Var30 = new xh7("UINT32_LIST", 29, 29, 2, ye9Var4);
        xh7 xh7Var31 = new xh7("ENUM_LIST", 30, 30, 2, ye9Var9);
        xh7 xh7Var32 = new xh7("SFIXED32_LIST", 31, 31, 2, ye9Var4);
        xh7 xh7Var33 = new xh7("SFIXED64_LIST", 32, 32, 2, ye9Var3);
        xh7 xh7Var34 = new xh7("SINT32_LIST", 33, 33, 2, ye9Var4);
        xh7 xh7Var35 = new xh7("SINT64_LIST", 34, 34, 2, ye9Var3);
        xh7 xh7Var36 = new xh7("DOUBLE_LIST_PACKED", 35, 35, 3, ye9Var);
        F = xh7Var36;
        xh7 xh7Var37 = new xh7("FLOAT_LIST_PACKED", 36, 36, 3, ye9Var2);
        xh7 xh7Var38 = new xh7("INT64_LIST_PACKED", 37, 37, 3, ye9Var3);
        xh7 xh7Var39 = new xh7("UINT64_LIST_PACKED", 38, 38, 3, ye9Var3);
        xh7 xh7Var40 = new xh7("INT32_LIST_PACKED", 39, 39, 3, ye9Var4);
        xh7 xh7Var41 = new xh7("FIXED64_LIST_PACKED", 40, 40, 3, ye9Var3);
        xh7 xh7Var42 = new xh7("FIXED32_LIST_PACKED", 41, 41, 3, ye9Var4);
        xh7 xh7Var43 = new xh7("BOOL_LIST_PACKED", 42, 42, 3, ye9Var5);
        xh7 xh7Var44 = new xh7("UINT32_LIST_PACKED", 43, 43, 3, ye9Var4);
        xh7 xh7Var45 = new xh7("ENUM_LIST_PACKED", 44, 44, 3, ye9Var9);
        xh7 xh7Var46 = new xh7("SFIXED32_LIST_PACKED", 45, 45, 3, ye9Var4);
        xh7 xh7Var47 = new xh7("SFIXED64_LIST_PACKED", 46, 46, 3, ye9Var3);
        xh7 xh7Var48 = new xh7("SINT32_LIST_PACKED", 47, 47, 3, ye9Var4);
        xh7 xh7Var49 = new xh7("SINT64_LIST_PACKED", 48, 48, 3, ye9Var3);
        G = xh7Var49;
        I = new xh7[]{xh7Var, xh7Var2, xh7Var3, xh7Var4, xh7Var5, xh7Var6, xh7Var7, xh7Var8, xh7Var9, xh7Var10, xh7Var11, xh7Var12, xh7Var13, xh7Var14, xh7Var15, xh7Var16, xh7Var17, xh7Var18, xh7Var19, xh7Var20, xh7Var21, xh7Var22, xh7Var23, xh7Var24, xh7Var25, xh7Var26, xh7Var27, xh7Var28, xh7Var29, xh7Var30, xh7Var31, xh7Var32, xh7Var33, xh7Var34, xh7Var35, xh7Var36, xh7Var37, xh7Var38, xh7Var39, xh7Var40, xh7Var41, xh7Var42, xh7Var43, xh7Var44, xh7Var45, xh7Var46, xh7Var47, xh7Var48, xh7Var49, new xh7("GROUP_LIST", 49, 49, 2, ye9Var7), new xh7("MAP", 50, 50, 4, ye9.E)};
        xh7[] xh7VarArrValues = values();
        H = new xh7[xh7VarArrValues.length];
        for (xh7 xh7Var50 : xh7VarArrValues) {
            H[xh7Var50.E] = xh7Var50;
        }
    }

    public xh7(String str, int i, int i2, int i3, ye9 ye9Var) {
        this.E = i2;
        int iF = sq6.F(i3);
        if (iF == 1 || iF == 3) {
            ye9Var.getClass();
        }
        if (i3 == 1) {
            ye9Var.ordinal();
        }
    }

    public static xh7 valueOf(String str) {
        return (xh7) Enum.valueOf(xh7.class, str);
    }

    public static xh7[] values() {
        return (xh7[]) I.clone();
    }
}
