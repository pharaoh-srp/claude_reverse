package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import androidx.compose.ui.graphics.vector.VectorPainter;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.koin.android.error.MissingAndroidContextException;
import org.koin.core.error.NoDefinitionFoundException;

/* JADX INFO: loaded from: classes.dex */
public abstract class yb5 {
    public static final o54 A;
    public static final o54 B;
    public static final o54 C;
    public static final o54 D;
    public static final o54 E;
    public static final o54 F;
    public static final o54 G;
    public static final o54 H;
    public static final o54 I;
    public static final o54 J;
    public static final o54 K;
    public static final o54 L;
    public static final o54 M;
    public static final o54 N;
    public static final o54 O;
    public static final o54 P;
    public static final o54 Q;
    public static final float R = 44.0f;
    public static final float S = 20.0f;
    public static final q0g T;
    public static final q0g U;
    public static final float V;
    public static final byte[] W;
    public static Context b;
    public static Bundle c;
    public static final o54 g;
    public static final o54 h;
    public static final o54 i;
    public static final q0g j;
    public static final o54 k;
    public static final float l;
    public static final o54 m;
    public static final float n;
    public static final o54 o;
    public static final float p;
    public static final o54 q;
    public static final float r;
    public static final o54 s;
    public static final float t;
    public static final o54 u;
    public static final float v;
    public static final o54 w;
    public static final o54 x;
    public static final o54 y;
    public static final o54 z;
    public static final Object a = new Object();
    public static final Type[] d = new Type[0];
    public static final ta4 e = new ta4(-1238361030, false, new ej3(2));
    public static final ta4 f = new ta4(1165465020, false, new eb4(6));

    static {
        o54 o54Var = o54.M;
        g = o54Var;
        o54 o54Var2 = o54.P;
        h = o54Var2;
        i = o54.X;
        j = q0g.H;
        o54 o54Var3 = o54.L;
        k = o54Var3;
        l = 0.38f;
        m = o54Var3;
        n = 0.38f;
        o = o54Var3;
        p = 0.38f;
        q = o54Var3;
        r = 0.38f;
        s = o54Var3;
        t = 0.38f;
        u = o54Var3;
        v = 0.38f;
        o54 o54Var4 = o54.E;
        w = o54Var4;
        x = o54Var4;
        y = o54Var3;
        z = o54Var4;
        A = o54Var;
        B = o54Var4;
        C = o54Var4;
        D = o54Var2;
        E = o54Var3;
        F = o54Var2;
        G = o54Var;
        H = o54Var;
        I = o54Var;
        J = o54Var3;
        K = o54Var;
        L = o54Var;
        M = o54Var;
        N = o54Var;
        O = o54Var;
        P = o54Var;
        Q = o54Var;
        T = q0g.L;
        U = q0g.G;
        V = 20.0f;
        W = new byte[0];
    }

    public static final j7g A(yr9 yr9Var) {
        yr9Var.getClass();
        fhi fhiVarK0 = yr9Var.k0();
        if (fhiVarK0 instanceof sn7) {
            return ((sn7) fhiVarK0).F;
        }
        if (fhiVarK0 instanceof j7g) {
            return (j7g) fhiVarK0;
        }
        mr9.b();
        return null;
    }

    public static final VectorPainter B(py8 py8Var, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        cz5 cz5Var = (cz5) e18Var.j(ve4.h);
        boolean zE = e18Var.e((((long) Float.floatToRawIntBits(cz5Var.getDensity())) & 4294967295L) | (((long) Float.floatToRawIntBits(py8Var.j)) << 32));
        Object objN = e18Var.N();
        if (zE || objN == jd4.a) {
            bb8 bb8Var = new bb8();
            n(bb8Var, py8Var.f);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(cz5Var.q0(py8Var.b))) << 32) | (((long) Float.floatToRawIntBits(cz5Var.q0(py8Var.c))) & 4294967295L);
            float fIntBitsToFloat = py8Var.d;
            float fIntBitsToFloat2 = py8Var.e;
            if (Float.isNaN(fIntBitsToFloat)) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            }
            if (Float.isNaN(fIntBitsToFloat2)) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
            VectorPainter vectorPainter = new VectorPainter(bb8Var);
            String str = py8Var.a;
            long j2 = py8Var.g;
            hr1 hr1Var = j2 != 16 ? new hr1(j2, py8Var.h) : null;
            boolean z2 = py8Var.i;
            vectorPainter.J.setValue(new k8g(jFloatToRawIntBits));
            vectorPainter.K.setValue(Boolean.valueOf(z2));
            nri nriVar = vectorPainter.L;
            nriVar.g.setValue(hr1Var);
            nriVar.i.setValue(new k8g(jFloatToRawIntBits2));
            nriVar.c = str;
            e18Var.k0(vectorPainter);
            objN = vectorPainter;
        }
        return (VectorPainter) objN;
    }

    public static final String C(sxb sxbVar) {
        sxbVar.getClass();
        String strB = sxbVar.b();
        strB.getClass();
        if (!jq9.a.contains(strB)) {
            for (int i2 = 0; i2 < strB.length(); i2++) {
                char cCharAt = strB.charAt(i2);
                if (Character.isLetterOrDigit(cCharAt) || cCharAt == '_') {
                }
            }
            String strB2 = sxbVar.b();
            strB2.getClass();
            return strB2;
        }
        String strB3 = sxbVar.b();
        strB3.getClass();
        return "`".concat(strB3).concat("`");
    }

    public static final String D(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sxb sxbVar = (sxb) it.next();
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(C(sxbVar));
        }
        return sb.toString();
    }

    public static final String E(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str3.getClass();
        if (!isg.q0(str, str2, false) || !isg.q0(str3, str4, false)) {
            return null;
        }
        String strSubstring = str.substring(str2.length());
        String strSubstring2 = str3.substring(str4.length());
        String strConcat = str5.concat(strSubstring);
        if (strSubstring.equals(strSubstring2)) {
            return strConcat;
        }
        if (Q(strSubstring, strSubstring2)) {
            return strConcat.concat("!");
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013a A[EDGE_INSN: B:85:0x013a->B:79:0x013a BREAK  A[LOOP:0: B:3:0x0002->B:88:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[LOOP:0: B:3:0x0002->B:88:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v3, types: [c] */
    /* JADX WARN: Type inference failed for: r11v4, types: [c] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Type F(java.lang.reflect.Type r9, java.lang.Class r10, java.lang.reflect.Type r11, java.util.HashMap r12) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yb5.F(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.HashMap):java.lang.reflect.Type");
    }

    public static final float G(long j2, float f2, cz5 cz5Var) {
        if (clh.a(j2, clh.c)) {
            return f2;
        }
        long jB = clh.b(j2);
        if (dlh.a(jB, 4294967296L)) {
            return cz5Var.W0(j2);
        }
        if (dlh.a(jB, 8589934592L)) {
            return clh.c(j2) * f2;
        }
        return Float.NaN;
    }

    public static final float H(long j2, float f2, cz5 cz5Var) {
        float fC;
        long jB = clh.b(j2);
        if (dlh.a(jB, 4294967296L)) {
            if (cz5Var.k0() <= 1.05d) {
                return cz5Var.W0(j2);
            }
            fC = clh.c(j2) / clh.c(cz5Var.W(f2));
        } else {
            if (!dlh.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = clh.c(j2);
        }
        return fC * f2;
    }

    public static final void I(z4f z4fVar, HashSet hashSet, ld4 ld4Var, int i2) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2131060952);
        if ((((e18Var.h(z4fVar) ? 4 : 2) | i2 | (e18Var.h(hashSet) ? 32 : 16)) & 19) == 18 && e18Var.C()) {
            e18Var.T();
        } else {
            e18Var.a0(941409598);
            boolean zF = e18Var.f(z4fVar);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            Object obj = objN;
            if (zF || objN == lz1Var) {
                zp9 zp9Var = new zp9();
                zp9Var.a = hashSet;
                e18Var.k0(zp9Var);
                obj = zp9Var;
            }
            zp9 zp9Var2 = (zp9) obj;
            e18Var.p(false);
            e18Var.a0(941412240);
            boolean zH = e18Var.h(zp9Var2) | e18Var.h(hashSet) | e18Var.h(z4fVar);
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var) {
                objN2 = new nf1(zp9Var2, hashSet, z4fVar, 6);
                e18Var.k0(objN2);
            }
            e18Var.p(false);
            fd9.e(z4fVar, hashSet, (bz7) objN2, e18Var);
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ow1(z4fVar, hashSet, i2, 10);
        }
    }

    public static final Object J(pz7 pz7Var) {
        Thread.interrupted();
        return gb9.V(im6.E, new ab0(pz7Var, (tp4) null, 17));
    }

    public static String K(String str) {
        if (str != null && str.length() <= 64 && dl8.T.f(str) && !dl8.U.a(str)) {
            return str;
        }
        return null;
    }

    public static final void L(Spannable spannable, long j2, int i2, int i3) {
        if (j2 != 16) {
            spannable.setSpan(new ForegroundColorSpan(d4c.n0(j2)), i2, i3, 33);
        }
    }

    public static final void M(Spannable spannable, long j2, cz5 cz5Var, int i2, int i3) {
        long jB = clh.b(j2);
        if (dlh.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(mwa.L(cz5Var.W0(j2)), false), i2, i3, 33);
        } else if (dlh.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(clh.c(j2)), i2, i3, 33);
        }
    }

    public static final long N(String str, long j2, long j3, long j4) {
        String property;
        int i2 = u1h.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j2;
        }
        Long lT0 = isg.t0(property);
        if (lT0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lT0.longValue();
        if (j3 <= jLongValue && jLongValue <= j4) {
            return jLongValue;
        }
        StringBuilder sbW = vb7.w("System property '", str, "' should be in range ", j3);
        ij0.u(j4, "..", ", but is '", sbW);
        sbW.append(jLongValue);
        sbW.append('\'');
        throw new IllegalStateException(sbW.toString().toString());
    }

    public static int O(int i2, int i3, String str) {
        return (int) N(str, i2, 1L, (i3 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static String P(int i2) {
        return i2 == 0 ? "Clear" : i2 == 1 ? "Src" : i2 == 2 ? "Dst" : i2 == 3 ? "SrcOver" : i2 == 4 ? "DstOver" : i2 == 5 ? "SrcIn" : i2 == 6 ? "DstIn" : i2 == 7 ? "SrcOut" : i2 == 8 ? "DstOut" : i2 == 9 ? "SrcAtop" : i2 == 10 ? "DstAtop" : i2 == 11 ? "Xor" : i2 == 12 ? "Plus" : i2 == 13 ? "Modulate" : i2 == 14 ? "Screen" : i2 == 15 ? "Overlay" : i2 == 16 ? "Darken" : i2 == 17 ? "Lighten" : i2 == 18 ? "ColorDodge" : i2 == 19 ? "ColorBurn" : i2 == 20 ? "HardLight" : i2 == 21 ? "Softlight" : i2 == 22 ? "Difference" : i2 == 23 ? "Exclusion" : i2 == 24 ? "Multiply" : i2 == 25 ? "Hue" : i2 == 26 ? "Saturation" : i2 == 27 ? "Color" : i2 == 28 ? "Luminosity" : "Unknown";
    }

    public static final boolean Q(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (str.equals(isg.n0(str2, "?", "", false))) {
            return true;
        }
        if (isg.h0(str2, "?", false) && str.concat("?").equals(str2)) {
            return true;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(str);
        sb.append(")?");
        return sb.toString().equals(str2);
    }

    public static String R(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static final j7g S(yr9 yr9Var) {
        yr9Var.getClass();
        fhi fhiVarK0 = yr9Var.k0();
        if (fhiVarK0 instanceof sn7) {
            return ((sn7) fhiVarK0).G;
        }
        if (fhiVarK0 instanceof j7g) {
            return (j7g) fhiVarK0;
        }
        mr9.b();
        return null;
    }

    public static nb0 a(float f2, float f3, int i2) {
        if ((i2 & 2) != 0) {
            f3 = MTTypesetterKt.kLineSkipLimitMultiplier;
        }
        return new nb0(dgj.f, Float.valueOf(f2), new ob0(f3), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final void b(bf3 bf3Var, iqb iqbVar, ojg ojgVar, ta4 ta4Var, ld4 ld4Var, int i2) {
        int i3;
        ojg wm6Var;
        bf3Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1655887121);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.h(bf3Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? e18Var.f(ojgVar) : e18Var.h(ojgVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i2 & 3072) == 0) {
            i3 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i3 & 1171) == 1170 && e18Var.C()) {
            e18Var.T();
        } else {
            a5f a5fVarY0 = wd6.y0(e18Var);
            r48 r48Var = bf3Var.c;
            HashSet hashSet = new HashSet();
            Iterator<E> it = r48Var.iterator();
            while (it.hasNext()) {
                hashSet.add(((ke3) it.next()).b());
            }
            I(a5fVarY0, hashSet, e18Var, 0);
            pjg pjgVar = (pjg) e18Var.j(qjg.a);
            e18Var.a0(1536070947);
            if (ojgVar == null) {
                e18Var.a0(1536071350);
                boolean zF = e18Var.f(pjgVar);
                Object objN = e18Var.N();
                if (zF || objN == jd4.a) {
                    pjgVar.getClass();
                    objN = null;
                    e18Var.k0(null);
                }
                wm6Var = (ojg) objN;
                e18Var.p(false);
            } else {
                wm6Var = ojgVar;
            }
            e18Var.p(false);
            if (wm6Var == null) {
                wm6Var = new wm6();
            }
            wm6Var.a(bf3Var, iqbVar, fd9.q0(-995173764, new ff3(a5fVarY0, ta4Var), e18Var), e18Var, (i3 & 14) | 384 | (i3 & 112));
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new df3(bf3Var, iqbVar, ojgVar, ta4Var, i2, 0);
        }
    }

    public static final void c(int i2, int i3, ld4 ld4Var, zy7 zy7Var, boolean z2) {
        int i4;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1377896914);
        int i5 = i3 & 1;
        int i6 = 4;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (e18Var.g(z2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        if (e18Var.Q(i4 & 1, (i4 & 19) != 18)) {
            if (i5 != 0) {
                z2 = true;
            }
            nwb nwbVarZ = mpk.Z(zy7Var, e18Var);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = dch.b(new fg1(9, nwbVarZ), z2, 30);
                e18Var.k0(objN);
            }
            wa1 wa1Var = (wa1) objN;
            boolean zH = e18Var.h(wa1Var) | ((i4 & 14) == 4);
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var) {
                objN2 = new rf1(wa1Var, z2, i6);
                e18Var.k0(objN2);
            }
            fd9.s((zy7) objN2, e18Var);
            bb1 bb1VarD = ((swe) e18Var.j(twe.a)).a.d();
            boolean zH2 = e18Var.h(bb1VarD) | e18Var.h(wa1Var);
            Object objN3 = e18Var.N();
            if (zH2 || objN3 == lz1Var) {
                objN3 = new vk3(bb1VarD, 3, wa1Var);
                e18Var.k0(objN3);
            }
            fd9.d(bb1VarD, (bz7) objN3, e18Var);
        } else {
            e18Var.T();
        }
        boolean z3 = z2;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ib1(i2, i3, 1, zy7Var, z3);
        }
    }

    public static final void d(int i2, int i3, ld4 ld4Var, zy7 zy7Var, iqb iqbVar, boolean z2) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-521183631);
        int i4 = (e18Var.g(z2) ? 4 : 2) | i2;
        int i5 = i4 | 48;
        int i6 = i3 & 4;
        if (i6 != 0) {
            i5 = i4 | 432;
        } else if ((i2 & 384) == 0) {
            i5 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i7 = 1;
        if (e18Var.Q(i5 & 1, (i5 & 147) != 146)) {
            if (i6 != 0) {
                zy7Var = null;
            }
            z8i z8iVarN = kxk.N(100, 0, null, 6);
            wd6.M(z2, null, gp6.e(z8iVarN, 2), gp6.f(z8iVarN, 2), null, fd9.q0(-106025319, new mb1(i7, zy7Var), e18Var), e18Var, (i5 & 14) | 200064, 18);
            iqbVar = fqb.E;
        } else {
            e18Var.T();
        }
        zy7 zy7Var2 = zy7Var;
        iqb iqbVar2 = iqbVar;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new e23(i2, i3, zy7Var2, iqbVar2, z2);
        }
    }

    public static final long e(float f2, float f3) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
        int i2 = d5i.c;
        return jFloatToRawIntBits;
    }

    public static final void f(iqb iqbVar, yc6 yc6Var, uc6 uc6Var, xc6 xc6Var, zub zubVar, ld4 ld4Var, int i2) {
        yc6 yc6Var2;
        uc6 uc6Var2;
        xc6 xc6Var2;
        uc6 uc6Var3;
        xc6 xc6Var3;
        zub zubVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1693656835);
        int i3 = 4;
        int i4 = i2 | (e18Var.f(iqbVar) ? 4 : 2) | 1168;
        int i5 = 1;
        if (e18Var.Q(i4 & 1, (i4 & 9363) != 9362)) {
            e18Var.V();
            if ((i2 & 1) == 0 || e18Var.A()) {
                yc6Var2 = yti.a;
                umg umgVar = jwa.a;
                n54 n54Var = ((gwa) e18Var.j(umgVar)).a;
                uc6 uc6Var4 = n54Var.b0;
                if (uc6Var4 == null) {
                    uc6Var3 = new uc6(p54.c(n54Var, dch.b), p54.c(n54Var, dch.h), p54.c(n54Var, dch.c));
                    n54Var.b0 = uc6Var3;
                } else {
                    uc6Var3 = uc6Var4;
                }
                j1g j1gVar = ((gwa) e18Var.j(umgVar)).c;
                xc6Var3 = j1gVar.i;
                if (xc6Var3 == null) {
                    xc6Var3 = new xc6(k1g.a(j1gVar, dch.l), k1g.a(j1gVar, dch.j), k1g.a(j1gVar, dch.e));
                    j1gVar.i = xc6Var3;
                }
            } else {
                e18Var.T();
                yc6Var2 = yc6Var;
                uc6Var3 = uc6Var;
                xc6Var3 = xc6Var;
            }
            e18Var.q();
            lz1 lz1Var = jd4.a;
            if (zubVar == null) {
                e18Var.a0(-1544621928);
                Object objN = e18Var.N();
                if (objN == lz1Var) {
                    objN = vb7.f(e18Var);
                }
                zubVar2 = (zub) objN;
                e18Var.p(false);
            } else {
                e18Var.a0(-188374497);
                e18Var.p(false);
                zubVar2 = zubVar;
            }
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = mpk.P(Boolean.FALSE);
                e18Var.k0(objN2);
            }
            nwb nwbVar = (nwb) objN2;
            boolean zF = e18Var.f(zubVar2);
            Object objN3 = e18Var.N();
            if (zF || objN3 == lz1Var) {
                objN3 = new kb6(zubVar2, nwbVar, null, i5);
                e18Var.k0(objN3);
            }
            fd9.i(e18Var, (pz7) objN3, zubVar2);
            Object objN4 = e18Var.N();
            if (objN4 == lz1Var) {
                objN4 = mpk.P(Boolean.FALSE);
                e18Var.k0(objN4);
            }
            nwb nwbVar2 = (nwb) objN4;
            mo8 mo8Var = z79.a;
            iqb iqbVarT = x44.T(iqbVar.B(pkb.E), zubVar2);
            Object objN5 = e18Var.N();
            if (objN5 == lz1Var) {
                objN5 = new fg1(10, nwbVar2);
                e18Var.k0(objN5);
            }
            zy7 zy7Var = (zy7) objN5;
            Object objN6 = e18Var.N();
            int i6 = 11;
            if (objN6 == lz1Var) {
                objN6 = new fg1(i6, nwbVar2);
                e18Var.k0(objN6);
            }
            iqb iqbVarA = a0h.a(iqbVarT, zubVar2, new vc6(zy7Var, (zy7) objN6));
            boolean zF2 = e18Var.f(nwbVar) | e18Var.f(xc6Var3);
            Object objN7 = e18Var.N();
            if (zF2 || objN7 == lz1Var) {
                objN7 = new nf1((Object) xc6Var3, (Object) nwbVar, nwbVar2, i6);
                e18Var.k0(objN7);
            }
            iqb iqbVarI0 = xn5.i0(iqbVarA, (bz7) objN7);
            boolean zF3 = e18Var.f(nwbVar) | e18Var.f(yc6Var2);
            Object objN8 = e18Var.N();
            if (zF3 || objN8 == lz1Var) {
                objN8 = new wt2(yc6Var2, nwbVar, nwbVar2, i3);
                e18Var.k0(objN8);
            }
            iqb iqbVarH0 = fd9.h0(iqbVarI0, (rz7) objN8);
            boolean zF4 = e18Var.f(nwbVar) | e18Var.f(uc6Var3);
            Object objN9 = e18Var.N();
            if (zF4 || objN9 == lz1Var) {
                objN9 = new nf1((Object) uc6Var3, (Object) nwbVar, nwbVar2, 12);
                e18Var.k0(objN9);
            }
            dw1.a(d19.a(zni.s(iqbVarH0, (bz7) objN9), zubVar2, due.a(false, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, null, false, 255)), e18Var, 0);
            xc6Var2 = xc6Var3;
            uc6Var2 = uc6Var3;
        } else {
            e18Var.T();
            yc6Var2 = yc6Var;
            uc6Var2 = uc6Var;
            xc6Var2 = xc6Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new g73(iqbVar, yc6Var2, uc6Var2, xc6Var2, zubVar, i2, 1);
        }
    }

    public static final Context g(m7f m7fVar) throws MissingAndroidContextException {
        m7fVar.getClass();
        try {
            return (Context) m7fVar.a(jce.a.b(Context.class), null, null);
        } catch (NoDefinitionFoundException unused) {
            throw new MissingAndroidContextException();
        }
    }

    public static final zg9 h(Decoder decoder) {
        decoder.getClass();
        zg9 zg9Var = decoder instanceof zg9 ? (zg9) decoder : null;
        if (zg9Var != null) {
            return zg9Var;
        }
        sz6.j(sq6.t(jce.a, decoder.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ")));
        return null;
    }

    public static final gh9 i(Encoder encoder) {
        encoder.getClass();
        gh9 gh9Var = encoder instanceof gh9 ? (gh9) encoder : null;
        if (gh9Var != null) {
            return gh9Var;
        }
        sz6.j(sq6.t(jce.a, encoder.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ")));
        return null;
    }

    public static Type j(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(j(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static void k(Type type) {
        ez1.w(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    public static nb0 l(nb0 nb0Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = ((Number) nb0Var.F.getValue()).floatValue();
        }
        if ((i2 & 2) != 0) {
            f3 = ((ob0) nb0Var.G).a;
        }
        return new nb0(nb0Var.E, Float.valueOf(f2), new ob0(f3), nb0Var.H, nb0Var.I, nb0Var.J);
    }

    public static tbd m(List list, l45 l45Var, zy7 zy7Var) {
        list.getClass();
        kj7 kj7Var = new kj7(k2e.L, new px2(11, zy7Var));
        c45 c45VarR0 = l45Var.getCoroutineContext().x0(dd8.J) == null ? l45Var.getCoroutineContext().r0(knk.g()) : l45Var.getCoroutineContext();
        c45VarR0.getClass();
        return new tbd(new tbd(new bi5(kj7Var, x44.W(new dx(w44.a1(lm6.E, list), (tp4) null, 19)), new a5(26), c45VarR0)));
    }

    public static final void n(bb8 bb8Var, zri zriVar) {
        List list = zriVar.N;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            bsi bsiVar = (bsi) list.get(i2);
            if (bsiVar instanceof csi) {
                puc pucVar = new puc();
                csi csiVar = (csi) bsiVar;
                pucVar.d = csiVar.F;
                pucVar.n = true;
                pucVar.c();
                pucVar.s.k(csiVar.G);
                pucVar.c();
                pucVar.c();
                pucVar.b = csiVar.H;
                pucVar.c();
                pucVar.c = csiVar.I;
                pucVar.c();
                pucVar.g = csiVar.J;
                pucVar.c();
                pucVar.e = csiVar.K;
                pucVar.c();
                pucVar.f = csiVar.L;
                pucVar.o = true;
                pucVar.c();
                pucVar.h = csiVar.M;
                pucVar.o = true;
                pucVar.c();
                pucVar.i = csiVar.N;
                pucVar.o = true;
                pucVar.c();
                pucVar.j = csiVar.O;
                pucVar.o = true;
                pucVar.c();
                pucVar.k = csiVar.P;
                pucVar.p = true;
                pucVar.c();
                pucVar.l = csiVar.Q;
                pucVar.p = true;
                pucVar.c();
                pucVar.m = csiVar.R;
                pucVar.p = true;
                pucVar.c();
                bb8Var.e(i2, pucVar);
            } else if (bsiVar instanceof zri) {
                bb8 bb8Var2 = new bb8();
                zri zriVar2 = (zri) bsiVar;
                bb8Var2.k = zriVar2.E;
                bb8Var2.c();
                bb8Var2.l = zriVar2.F;
                bb8Var2.s = true;
                bb8Var2.c();
                bb8Var2.o = zriVar2.I;
                bb8Var2.s = true;
                bb8Var2.c();
                bb8Var2.p = zriVar2.J;
                bb8Var2.s = true;
                bb8Var2.c();
                bb8Var2.q = zriVar2.K;
                bb8Var2.s = true;
                bb8Var2.c();
                bb8Var2.r = zriVar2.L;
                bb8Var2.s = true;
                bb8Var2.c();
                bb8Var2.m = zriVar2.G;
                bb8Var2.s = true;
                bb8Var2.c();
                bb8Var2.n = zriVar2.H;
                bb8Var2.s = true;
                bb8Var2.c();
                bb8Var2.f = zriVar2.M;
                bb8Var2.g = true;
                bb8Var2.c();
                n(bb8Var2, zriVar2);
                bb8Var.e(i2, bb8Var2);
            }
        }
    }

    public static final Object o(oe4 oe4Var, fvd fvdVar) {
        if (!oe4Var.x0().R) {
            b39.c("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        hyc hycVar = (hyc) yfd.W(oe4Var).g0;
        hycVar.getClass();
        return u00.I(hycVar, fvdVar);
    }

    public static boolean p(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return p(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    public static ua q(qh9 qh9Var) {
        try {
            return new ua(qh9Var.s("count").k());
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type LongTask", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type LongTask", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type LongTask", e4);
            return null;
        }
    }

    public static Type r(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i2 = 0; i2 < length; i2++) {
                Class<?> cls3 = interfaces[i2];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i2];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return r(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return r(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Bundle s(Context context) {
        Bundle bundle;
        ServiceInfo serviceInfo;
        Bundle bundle2;
        Context applicationContext = context.getApplicationContext();
        synchronized (a) {
            if (applicationContext != b) {
                swc.e("CronetManifest#getMetaData fetching info");
                try {
                    try {
                        serviceInfo = applicationContext.getPackageManager().getServiceInfo(new ComponentName(applicationContext, "android.net.http.MetaDataHolder"), 787072);
                    } finally {
                    }
                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                    serviceInfo = null;
                }
                if (serviceInfo == null || (bundle2 = serviceInfo.metaData) == null) {
                    bundle2 = new Bundle();
                }
                c = bundle2;
                b = applicationContext;
                Trace.endSection();
            }
            bundle = c;
        }
        return bundle;
    }

    public static final ua2 t(tp4 tp4Var) {
        if (!(tp4Var instanceof z76)) {
            return new ua2(1, tp4Var);
        }
        ua2 ua2VarJ = ((z76) tp4Var).j();
        if (ua2VarJ != null) {
            if (!ua2VarJ.D()) {
                ua2VarJ = null;
            }
            if (ua2VarJ != null) {
                return ua2VarJ;
            }
        }
        return new ua2(2, tp4Var);
    }

    public static Class u(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            ez1.w(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) u(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return u(((WildcardType) type).getUpperBounds()[0]);
        }
        pmf.i("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
        return null;
    }

    public static zmf v(pz7 pz7Var) {
        zmf zmfVar = new zmf();
        zmfVar.c(zni.p(zmfVar, zmfVar, pz7Var));
        return zmfVar;
    }

    public static kw9 w(w1a w1aVar, zy7 zy7Var) {
        lja ljaVar = lja.d0;
        zy7Var.getClass();
        int iOrdinal = w1aVar.ordinal();
        if (iOrdinal == 0) {
            return new u0h(zy7Var);
        }
        if (iOrdinal == 1) {
            l3f l3fVar = new l3f();
            l3fVar.E = zy7Var;
            l3fVar.F = ljaVar;
            return l3fVar;
        }
        if (iOrdinal != 2) {
            mr9.b();
            return null;
        }
        vfi vfiVar = new vfi();
        vfiVar.E = zy7Var;
        vfiVar.F = ljaVar;
        return vfiVar;
    }

    public static u0h x(zy7 zy7Var) {
        zy7Var.getClass();
        return new u0h(zy7Var);
    }

    public static final iqb y(iqb iqbVar, y20 y20Var, m2a m2aVar, zhh zhhVar) {
        return iqbVar.B(new d2a(y20Var, m2aVar, zhhVar));
    }

    public static void z(gx gxVar, String str) {
        sq6.a(3);
        dch.P(gx.Companion, str, 3);
    }
}
