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
public final class wh7 {
    public static final wh7 F;
    public static final wh7 G;
    public static final wh7[] H;
    public static final /* synthetic */ wh7[] I;
    public final int E;

    /* JADX INFO: Fake field, exist only in values array */
    wh7 EF0;

    static {
        xe9 xe9Var = xe9.I;
        wh7 wh7Var = new wh7("DOUBLE", 0, 0, 1, xe9Var);
        xe9 xe9Var2 = xe9.H;
        wh7 wh7Var2 = new wh7("FLOAT", 1, 1, 1, xe9Var2);
        xe9 xe9Var3 = xe9.G;
        wh7 wh7Var3 = new wh7("INT64", 2, 2, 1, xe9Var3);
        wh7 wh7Var4 = new wh7("UINT64", 3, 3, 1, xe9Var3);
        xe9 xe9Var4 = xe9.F;
        wh7 wh7Var5 = new wh7("INT32", 4, 4, 1, xe9Var4);
        wh7 wh7Var6 = new wh7("FIXED64", 5, 5, 1, xe9Var3);
        wh7 wh7Var7 = new wh7("FIXED32", 6, 6, 1, xe9Var4);
        xe9 xe9Var5 = xe9.J;
        wh7 wh7Var8 = new wh7("BOOL", 7, 7, 1, xe9Var5);
        xe9 xe9Var6 = xe9.K;
        wh7 wh7Var9 = new wh7("STRING", 8, 8, 1, xe9Var6);
        xe9 xe9Var7 = xe9.N;
        wh7 wh7Var10 = new wh7("MESSAGE", 9, 9, 1, xe9Var7);
        xe9 xe9Var8 = xe9.L;
        wh7 wh7Var11 = new wh7("BYTES", 10, 10, 1, xe9Var8);
        wh7 wh7Var12 = new wh7("UINT32", 11, 11, 1, xe9Var4);
        xe9 xe9Var9 = xe9.M;
        wh7 wh7Var13 = new wh7("ENUM", 12, 12, 1, xe9Var9);
        wh7 wh7Var14 = new wh7("SFIXED32", 13, 13, 1, xe9Var4);
        wh7 wh7Var15 = new wh7("SFIXED64", 14, 14, 1, xe9Var3);
        wh7 wh7Var16 = new wh7("SINT32", 15, 15, 1, xe9Var4);
        wh7 wh7Var17 = new wh7("SINT64", 16, 16, 1, xe9Var3);
        wh7 wh7Var18 = new wh7("GROUP", 17, 17, 1, xe9Var7);
        wh7 wh7Var19 = new wh7("DOUBLE_LIST", 18, 18, 2, xe9Var);
        wh7 wh7Var20 = new wh7("FLOAT_LIST", 19, 19, 2, xe9Var2);
        wh7 wh7Var21 = new wh7("INT64_LIST", 20, 20, 2, xe9Var3);
        wh7 wh7Var22 = new wh7("UINT64_LIST", 21, 21, 2, xe9Var3);
        wh7 wh7Var23 = new wh7("INT32_LIST", 22, 22, 2, xe9Var4);
        wh7 wh7Var24 = new wh7("FIXED64_LIST", 23, 23, 2, xe9Var3);
        wh7 wh7Var25 = new wh7("FIXED32_LIST", 24, 24, 2, xe9Var4);
        wh7 wh7Var26 = new wh7("BOOL_LIST", 25, 25, 2, xe9Var5);
        wh7 wh7Var27 = new wh7("STRING_LIST", 26, 26, 2, xe9Var6);
        wh7 wh7Var28 = new wh7("MESSAGE_LIST", 27, 27, 2, xe9Var7);
        wh7 wh7Var29 = new wh7("BYTES_LIST", 28, 28, 2, xe9Var8);
        wh7 wh7Var30 = new wh7("UINT32_LIST", 29, 29, 2, xe9Var4);
        wh7 wh7Var31 = new wh7("ENUM_LIST", 30, 30, 2, xe9Var9);
        wh7 wh7Var32 = new wh7("SFIXED32_LIST", 31, 31, 2, xe9Var4);
        wh7 wh7Var33 = new wh7("SFIXED64_LIST", 32, 32, 2, xe9Var3);
        wh7 wh7Var34 = new wh7("SINT32_LIST", 33, 33, 2, xe9Var4);
        wh7 wh7Var35 = new wh7("SINT64_LIST", 34, 34, 2, xe9Var3);
        wh7 wh7Var36 = new wh7("DOUBLE_LIST_PACKED", 35, 35, 3, xe9Var);
        F = wh7Var36;
        wh7 wh7Var37 = new wh7("FLOAT_LIST_PACKED", 36, 36, 3, xe9Var2);
        wh7 wh7Var38 = new wh7("INT64_LIST_PACKED", 37, 37, 3, xe9Var3);
        wh7 wh7Var39 = new wh7("UINT64_LIST_PACKED", 38, 38, 3, xe9Var3);
        wh7 wh7Var40 = new wh7("INT32_LIST_PACKED", 39, 39, 3, xe9Var4);
        wh7 wh7Var41 = new wh7("FIXED64_LIST_PACKED", 40, 40, 3, xe9Var3);
        wh7 wh7Var42 = new wh7("FIXED32_LIST_PACKED", 41, 41, 3, xe9Var4);
        wh7 wh7Var43 = new wh7("BOOL_LIST_PACKED", 42, 42, 3, xe9Var5);
        wh7 wh7Var44 = new wh7("UINT32_LIST_PACKED", 43, 43, 3, xe9Var4);
        wh7 wh7Var45 = new wh7("ENUM_LIST_PACKED", 44, 44, 3, xe9Var9);
        wh7 wh7Var46 = new wh7("SFIXED32_LIST_PACKED", 45, 45, 3, xe9Var4);
        wh7 wh7Var47 = new wh7("SFIXED64_LIST_PACKED", 46, 46, 3, xe9Var3);
        wh7 wh7Var48 = new wh7("SINT32_LIST_PACKED", 47, 47, 3, xe9Var4);
        wh7 wh7Var49 = new wh7("SINT64_LIST_PACKED", 48, 48, 3, xe9Var3);
        G = wh7Var49;
        I = new wh7[]{wh7Var, wh7Var2, wh7Var3, wh7Var4, wh7Var5, wh7Var6, wh7Var7, wh7Var8, wh7Var9, wh7Var10, wh7Var11, wh7Var12, wh7Var13, wh7Var14, wh7Var15, wh7Var16, wh7Var17, wh7Var18, wh7Var19, wh7Var20, wh7Var21, wh7Var22, wh7Var23, wh7Var24, wh7Var25, wh7Var26, wh7Var27, wh7Var28, wh7Var29, wh7Var30, wh7Var31, wh7Var32, wh7Var33, wh7Var34, wh7Var35, wh7Var36, wh7Var37, wh7Var38, wh7Var39, wh7Var40, wh7Var41, wh7Var42, wh7Var43, wh7Var44, wh7Var45, wh7Var46, wh7Var47, wh7Var48, wh7Var49, new wh7("GROUP_LIST", 49, 49, 2, xe9Var7), new wh7("MAP", 50, 50, 4, xe9.E)};
        wh7[] wh7VarArrValues = values();
        H = new wh7[wh7VarArrValues.length];
        for (wh7 wh7Var50 : wh7VarArrValues) {
            H[wh7Var50.E] = wh7Var50;
        }
    }

    public wh7(String str, int i, int i2, int i3, xe9 xe9Var) {
        this.E = i2;
        int iF = sq6.F(i3);
        if (iF == 1 || iF == 3) {
            xe9Var.getClass();
        }
        if (i3 == 1) {
            xe9Var.ordinal();
        }
    }

    public static wh7 valueOf(String str) {
        return (wh7) Enum.valueOf(wh7.class, str);
    }

    public static wh7[] values() {
        return (wh7[]) I.clone();
    }
}
