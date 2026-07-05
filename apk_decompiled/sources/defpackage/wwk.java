package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.project.knowledge.DeleteProjectDocAlertDialogParams;
import com.anthropic.claude.project.knowledge.DeleteProjectFileAlertDialogParams;
import com.pvporbit.freetype.FreeTypeConstants;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wwk {
    public static final int[] a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] c = {64, 112, FreeTypeConstants.FT_LOAD_PEDANTIC, 192, 224, FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING, 384, 448, 512, 640, 768, 896, FreeTypeConstants.FT_LOAD_NO_RECURSE, 1152, 1280, 1536, 1920, FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, FreeTypeConstants.FT_LOAD_MONOCHROME, 6144, 7680};
    public static final int[] d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] e = {5, 8, 10, 12};
    public static final int[] f = {6, 9, 12, 15};
    public static final int[] g = {2, 4, 6, 8};
    public static final int[] h = {9, 11, 13, 16};
    public static final int[] i = {5, 8, 10, 12};
    public static c61 j;

    public static final void a(String str, String str2, zy7 zy7Var, zy7 zy7Var2, ld4 ld4Var, int i2) {
        int i3;
        zy7 zy7Var3;
        zy7 zy7Var4;
        str.getClass();
        str2.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-965407786);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.f(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            zy7Var3 = zy7Var;
            i3 |= e18Var.h(zy7Var3) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            zy7Var3 = zy7Var;
        }
        if ((i2 & 3072) == 0) {
            zy7Var4 = zy7Var2;
            i3 |= e18Var.h(zy7Var4) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        } else {
            zy7Var4 = zy7Var2;
        }
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            zy7 zy7Var5 = zy7Var4;
            rwk.d(q(new DeleteProjectDocAlertDialogParams(str, str2, null), e18Var), zy7Var5, zy7Var3, d4c.j0(R.string.project_knowledge_delete_doc_dialog_title, e18Var), d4c.j0(R.string.project_knowledge_delete_doc_button, e18Var), null, 0, e18Var, ((i3 >> 6) & 112) | (i3 & 896), 96);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new py5(str, str2, zy7Var, zy7Var2, i2, 1);
        }
    }

    public static final void b(String str, String str2, zy7 zy7Var, zy7 zy7Var2, ld4 ld4Var, int i2) {
        int i3;
        zy7 zy7Var3;
        zy7 zy7Var4;
        str.getClass();
        str2.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(978268279);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.f(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            zy7Var3 = zy7Var;
            i3 |= e18Var.h(zy7Var3) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            zy7Var3 = zy7Var;
        }
        if ((i2 & 3072) == 0) {
            zy7Var4 = zy7Var2;
            i3 |= e18Var.h(zy7Var4) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        } else {
            zy7Var4 = zy7Var2;
        }
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            zy7 zy7Var5 = zy7Var4;
            rwk.d(q(new DeleteProjectFileAlertDialogParams(str, str2, null), e18Var), zy7Var5, zy7Var3, d4c.j0(R.string.project_knowledge_delete_doc_dialog_title, e18Var), d4c.j0(R.string.project_knowledge_delete_doc_button, e18Var), null, 0, e18Var, ((i3 >> 6) & 112) | (i3 & 896), 96);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new py5(str, str2, zy7Var, zy7Var2, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(float r32, int r33, int r34, int r35, defpackage.b20 r36, defpackage.wo1 r37, defpackage.ta4 r38, defpackage.ld4 r39, defpackage.iqb r40, defpackage.yzb r41, defpackage.mnc r42, defpackage.unc r43, defpackage.koc r44, defpackage.kcg r45, defpackage.pcg r46, boolean r47) {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wwk.c(float, int, int, int, b20, wo1, ta4, ld4, iqb, yzb, mnc, unc, koc, kcg, pcg, boolean):void");
    }

    public static Type d(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        if (type instanceof Class) {
            return ((Class) type).getComponentType();
        }
        return null;
    }

    public static Type e(Type type) {
        if (!Collection.class.isAssignableFrom(Collection.class)) {
            mr9.y();
            return null;
        }
        Type typeJ = spi.j(type, Collection.class, spi.d(type, Collection.class, Collection.class));
        if (typeJ instanceof WildcardType) {
            typeJ = ((WildcardType) typeJ).getUpperBounds()[0];
        }
        return typeJ instanceof ParameterizedType ? ((ParameterizedType) typeJ).getActualTypeArguments()[0] : Object.class;
    }

    public static boolean f(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type2 instanceof GenericArrayType ? f(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType()) : type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return f(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType instanceof opi ? ((opi) parameterizedType).G : parameterizedType.getActualTypeArguments(), parameterizedType2 instanceof opi ? ((opi) parameterizedType2).G : parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return f(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (type2 instanceof GenericArrayType) {
                return f(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static final jh2 g(leb lebVar) {
        String str;
        if (x44.r(lebVar.c, "user")) {
            Object objG1 = w44.g1(lebVar.d);
            xdh xdhVar = objG1 instanceof xdh ? (xdh) objG1 : null;
            if (xdhVar != null && (str = xdhVar.a) != null) {
                String string = bsg.k1(str).toString();
                for (kh2 kh2Var : kh2.G) {
                    String strJ = ij0.j("<", kh2Var.E, ">");
                    String strJ2 = ij0.j("</", kh2Var.E, ">");
                    if (isg.q0(string, strJ, false) && isg.h0(string, strJ2, false)) {
                        return new jh2(kh2Var, bsg.k1(string.substring(strJ.length(), string.length() - strJ2.length())).toString());
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int h(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4f
            r2 = -1
            if (r1 == r2) goto L3e
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L20:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5e
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
        L36:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5e
        L3e:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
            goto L36
        L4f:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L20
        L5e:
            if (r0 == 0) goto L64
            int r7 = r7 * 16
            int r7 = r7 / 14
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wwk.h(byte[]):int");
    }

    public static final nj6 i(leb lebVar) {
        String str = lebVar.c;
        return x44.r(str, "assistant") ? nj6.F : (!x44.r(str, "user") || g(lebVar) == null) ? nj6.E : nj6.G;
    }

    public static int j(int i2) {
        if (i2 == 2147385345 || i2 == -25230976 || i2 == 536864768 || i2 == -14745368) {
            return 1;
        }
        if (i2 == 1683496997 || i2 == 622876772) {
            return 2;
        }
        if (i2 == 1078008818 || i2 == -233094848) {
            return 3;
        }
        return (i2 == 1908687592 || i2 == -398277519) ? 4 : 0;
    }

    public static Type k(Type type) {
        Class clsM = m(type);
        return spi.j(type, clsM, clsM.getGenericSuperclass());
    }

    public static dg2 l(byte[] bArr) {
        byte[] bArr2;
        byte b2 = bArr[0];
        if (b2 == 127 || b2 == 100 || b2 == 64 || b2 == 113) {
            return new dg2(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b3 = bArrCopyOf[0];
        if (b3 == -2 || b3 == -1 || b3 == 37 || b3 == -14 || b3 == -24) {
            for (int i2 = 0; i2 < bArrCopyOf.length - 1; i2 += 2) {
                byte b4 = bArrCopyOf[i2];
                int i3 = i2 + 1;
                bArrCopyOf[i2] = bArrCopyOf[i3];
                bArrCopyOf[i3] = b4;
            }
        }
        dg2 dg2Var = new dg2(bArrCopyOf, bArrCopyOf.length);
        if (bArrCopyOf[0] == 31) {
            dg2 dg2Var2 = new dg2(bArrCopyOf, bArrCopyOf.length);
            while (dg2Var2.b() >= 16) {
                dg2Var2.o(2);
                int iG = dg2Var2.g(14) & 16383;
                int iMin = Math.min(8 - dg2Var.d, 14);
                int i4 = dg2Var.d;
                int i5 = (8 - i4) - iMin;
                byte[] bArr3 = dg2Var.b;
                int i6 = dg2Var.c;
                byte b5 = (byte) (((65280 >> i4) | ((1 << i5) - 1)) & bArr3[i6]);
                bArr3[i6] = b5;
                int i7 = 14 - iMin;
                bArr3[i6] = (byte) (b5 | ((iG >>> i7) << i5));
                int i8 = i6 + 1;
                while (true) {
                    bArr2 = dg2Var.b;
                    if (i7 > 8) {
                        bArr2[i8] = (byte) (iG >>> (i7 - 8));
                        i7 -= 8;
                        i8++;
                    }
                }
                int i9 = 8 - i7;
                byte b6 = (byte) (bArr2[i8] & ((1 << i9) - 1));
                bArr2[i8] = b6;
                bArr2[i8] = (byte) (((iG & ((1 << i7) - 1)) << i9) | b6);
                dg2Var.o(14);
                dg2Var.a();
            }
        }
        dg2Var.l(bArrCopyOf, bArrCopyOf.length);
        return dg2Var;
    }

    public static Class m(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) m(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m(((WildcardType) type).getUpperBounds()[0]);
        }
        pmf.i("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
        return null;
    }

    public static Type[] n(Type type, Class cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        if (Map.class.isAssignableFrom(cls)) {
            Type typeJ = spi.j(type, cls, spi.d(type, cls, Map.class));
            return typeJ instanceof ParameterizedType ? ((ParameterizedType) typeJ).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        mr9.y();
        return null;
    }

    public static opi o(Class cls, Type... typeArr) {
        if (typeArr.length != 0) {
            return new opi(null, cls, typeArr);
        }
        sz6.p(grc.s(cls, "Missing type arguments for "));
        return null;
    }

    public static int p(dg2 dg2Var, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && dg2Var.f(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return dg2Var.g(iArr[i2]) + i4;
    }

    public static final ky5 q(qy5 qy5Var, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        m7f m7fVar = (m7f) e18Var.j(gr9.b);
        boolean zH = e18Var.h(qy5Var) | e18Var.h(m7fVar);
        Object objN = e18Var.N();
        if (zH || objN == jd4.a) {
            objN = new f25(qy5Var, 5, m7fVar);
            e18Var.k0(objN);
        }
        kce kceVar = jce.a;
        List listX = x44.X(oq5.B(kceVar.b(ky5.class)), qy5Var);
        return (ky5) fd9.r0(kceVar.b(ky5.class), listX, (bz7) objN, e18Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5 A[PHI: r0
      0x00a5: PHI (r0v11 int) = (r0v5 int), (r0v6 int), (r0v7 int), (r0v8 int) binds: [B:54:0x00a3, B:57:0x00a8, B:60:0x00ac, B:63:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(defpackage.jt7 r10, int r11, defpackage.bz7 r12) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wwk.r(jt7, int, bz7):java.lang.Object");
    }
}
