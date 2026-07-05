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
public final class vh7 {
    public static final vh7 F;
    public static final vh7 G;
    public static final vh7[] H;
    public static final /* synthetic */ vh7[] I;
    public final int E;

    /* JADX INFO: Fake field, exist only in values array */
    vh7 EF0;

    static {
        we9 we9Var = we9.I;
        vh7 vh7Var = new vh7("DOUBLE", 0, 0, 1, we9Var);
        we9 we9Var2 = we9.H;
        vh7 vh7Var2 = new vh7("FLOAT", 1, 1, 1, we9Var2);
        we9 we9Var3 = we9.G;
        vh7 vh7Var3 = new vh7("INT64", 2, 2, 1, we9Var3);
        vh7 vh7Var4 = new vh7("UINT64", 3, 3, 1, we9Var3);
        we9 we9Var4 = we9.F;
        vh7 vh7Var5 = new vh7("INT32", 4, 4, 1, we9Var4);
        vh7 vh7Var6 = new vh7("FIXED64", 5, 5, 1, we9Var3);
        vh7 vh7Var7 = new vh7("FIXED32", 6, 6, 1, we9Var4);
        we9 we9Var5 = we9.J;
        vh7 vh7Var8 = new vh7("BOOL", 7, 7, 1, we9Var5);
        we9 we9Var6 = we9.K;
        vh7 vh7Var9 = new vh7("STRING", 8, 8, 1, we9Var6);
        we9 we9Var7 = we9.N;
        vh7 vh7Var10 = new vh7("MESSAGE", 9, 9, 1, we9Var7);
        we9 we9Var8 = we9.L;
        vh7 vh7Var11 = new vh7("BYTES", 10, 10, 1, we9Var8);
        vh7 vh7Var12 = new vh7("UINT32", 11, 11, 1, we9Var4);
        we9 we9Var9 = we9.M;
        vh7 vh7Var13 = new vh7("ENUM", 12, 12, 1, we9Var9);
        vh7 vh7Var14 = new vh7("SFIXED32", 13, 13, 1, we9Var4);
        vh7 vh7Var15 = new vh7("SFIXED64", 14, 14, 1, we9Var3);
        vh7 vh7Var16 = new vh7("SINT32", 15, 15, 1, we9Var4);
        vh7 vh7Var17 = new vh7("SINT64", 16, 16, 1, we9Var3);
        vh7 vh7Var18 = new vh7("GROUP", 17, 17, 1, we9Var7);
        vh7 vh7Var19 = new vh7("DOUBLE_LIST", 18, 18, 2, we9Var);
        vh7 vh7Var20 = new vh7("FLOAT_LIST", 19, 19, 2, we9Var2);
        vh7 vh7Var21 = new vh7("INT64_LIST", 20, 20, 2, we9Var3);
        vh7 vh7Var22 = new vh7("UINT64_LIST", 21, 21, 2, we9Var3);
        vh7 vh7Var23 = new vh7("INT32_LIST", 22, 22, 2, we9Var4);
        vh7 vh7Var24 = new vh7("FIXED64_LIST", 23, 23, 2, we9Var3);
        vh7 vh7Var25 = new vh7("FIXED32_LIST", 24, 24, 2, we9Var4);
        vh7 vh7Var26 = new vh7("BOOL_LIST", 25, 25, 2, we9Var5);
        vh7 vh7Var27 = new vh7("STRING_LIST", 26, 26, 2, we9Var6);
        vh7 vh7Var28 = new vh7("MESSAGE_LIST", 27, 27, 2, we9Var7);
        vh7 vh7Var29 = new vh7("BYTES_LIST", 28, 28, 2, we9Var8);
        vh7 vh7Var30 = new vh7("UINT32_LIST", 29, 29, 2, we9Var4);
        vh7 vh7Var31 = new vh7("ENUM_LIST", 30, 30, 2, we9Var9);
        vh7 vh7Var32 = new vh7("SFIXED32_LIST", 31, 31, 2, we9Var4);
        vh7 vh7Var33 = new vh7("SFIXED64_LIST", 32, 32, 2, we9Var3);
        vh7 vh7Var34 = new vh7("SINT32_LIST", 33, 33, 2, we9Var4);
        vh7 vh7Var35 = new vh7("SINT64_LIST", 34, 34, 2, we9Var3);
        vh7 vh7Var36 = new vh7("DOUBLE_LIST_PACKED", 35, 35, 3, we9Var);
        F = vh7Var36;
        vh7 vh7Var37 = new vh7("FLOAT_LIST_PACKED", 36, 36, 3, we9Var2);
        vh7 vh7Var38 = new vh7("INT64_LIST_PACKED", 37, 37, 3, we9Var3);
        vh7 vh7Var39 = new vh7("UINT64_LIST_PACKED", 38, 38, 3, we9Var3);
        vh7 vh7Var40 = new vh7("INT32_LIST_PACKED", 39, 39, 3, we9Var4);
        vh7 vh7Var41 = new vh7("FIXED64_LIST_PACKED", 40, 40, 3, we9Var3);
        vh7 vh7Var42 = new vh7("FIXED32_LIST_PACKED", 41, 41, 3, we9Var4);
        vh7 vh7Var43 = new vh7("BOOL_LIST_PACKED", 42, 42, 3, we9Var5);
        vh7 vh7Var44 = new vh7("UINT32_LIST_PACKED", 43, 43, 3, we9Var4);
        vh7 vh7Var45 = new vh7("ENUM_LIST_PACKED", 44, 44, 3, we9Var9);
        vh7 vh7Var46 = new vh7("SFIXED32_LIST_PACKED", 45, 45, 3, we9Var4);
        vh7 vh7Var47 = new vh7("SFIXED64_LIST_PACKED", 46, 46, 3, we9Var3);
        vh7 vh7Var48 = new vh7("SINT32_LIST_PACKED", 47, 47, 3, we9Var4);
        vh7 vh7Var49 = new vh7("SINT64_LIST_PACKED", 48, 48, 3, we9Var3);
        G = vh7Var49;
        I = new vh7[]{vh7Var, vh7Var2, vh7Var3, vh7Var4, vh7Var5, vh7Var6, vh7Var7, vh7Var8, vh7Var9, vh7Var10, vh7Var11, vh7Var12, vh7Var13, vh7Var14, vh7Var15, vh7Var16, vh7Var17, vh7Var18, vh7Var19, vh7Var20, vh7Var21, vh7Var22, vh7Var23, vh7Var24, vh7Var25, vh7Var26, vh7Var27, vh7Var28, vh7Var29, vh7Var30, vh7Var31, vh7Var32, vh7Var33, vh7Var34, vh7Var35, vh7Var36, vh7Var37, vh7Var38, vh7Var39, vh7Var40, vh7Var41, vh7Var42, vh7Var43, vh7Var44, vh7Var45, vh7Var46, vh7Var47, vh7Var48, vh7Var49, new vh7("GROUP_LIST", 49, 49, 2, we9Var7), new vh7("MAP", 50, 50, 4, we9.E)};
        vh7[] vh7VarArrValues = values();
        H = new vh7[vh7VarArrValues.length];
        for (vh7 vh7Var50 : vh7VarArrValues) {
            H[vh7Var50.E] = vh7Var50;
        }
    }

    public vh7(String str, int i, int i2, int i3, we9 we9Var) {
        this.E = i2;
        int iF = sq6.F(i3);
        if (iF == 1 || iF == 3) {
            we9Var.getClass();
        }
        if (i3 == 1) {
            we9Var.ordinal();
        }
    }

    public static vh7 valueOf(String str) {
        return (vh7) Enum.valueOf(vh7.class, str);
    }

    public static vh7[] values() {
        return (vh7[]) I.clone();
    }
}
