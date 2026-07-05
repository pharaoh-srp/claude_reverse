package defpackage;

import android.graphics.BitmapShader;
import android.graphics.Color;
import android.graphics.LinearGradient;
import com.anthropic.claude.R;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class usj {
    public static final float[][] a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] c = {95.047f, 100.0f, 108.883f};
    public static final float[][] d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final ax5 e = new ax5(15, new zl4(10));
    public static final int f = 9;
    public static final int g = 10;
    public static final int h = 12;

    public static final void a(int i, int i2, ld4 ld4Var, iqb iqbVar) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(304759726);
        int i3 = (e18Var.d(i) ? 4 : 2) | i2 | (e18Var.f(iqbVar) ? 32 : 16);
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            xo1 xo1Var = lja.K;
            iqb iqbVarJ = gb9.J(yfd.p(iqbVar, d54.b(0.1f, gm3.a(e18Var).k), xve.b(6.0f)), 6.0f);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarJ);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            tjh.b(d4c.k0(R.string.upgrade_to_pro_discount_tag_save_x_percent, new Object[]{Integer.valueOf(i)}, e18Var), null, gm3.a(e18Var).j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 0, 131066);
            e18Var = e18Var;
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new i10(i, i2, 7, iqbVar);
        }
    }

    public static final void b(long j, long j2, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        iqb iqbVarB;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-831935122);
        int i2 = i | (e18Var.e(j) ? 4 : 2) | (e18Var.e(j2) ? 32 : 16) | 3072;
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = ((((i2 & 112) ^ 48) > 32 && e18Var.e(j2)) || (i2 & 48) == 32) | ((((i2 & 14) ^ 6) > 4 && e18Var.e(j)) || (i2 & 6) == 4);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (z || objN == lz1Var) {
                objN = Integer.valueOf(j >= j2 ? 0 : (int) (((j2 - j) * 100) / j2));
                e18Var.k0(objN);
            }
            int iIntValue = ((Number) objN).intValue();
            boolean z2 = iIntValue > 5;
            fqb fqbVar = fqb.E;
            if (z2) {
                e18Var.a0(2077555356);
                e18Var.p(false);
                iqbVarB = fqbVar;
            } else {
                e18Var.a0(2077594137);
                Object objN2 = e18Var.N();
                if (objN2 == lz1Var) {
                    objN2 = new ic4(18);
                    e18Var.k0(objN2);
                }
                iqbVarB = fd9.h0(fqbVar, (rz7) objN2).B(fqbVar);
                e18Var.p(false);
            }
            if (!z2) {
                iIntValue = 10;
            }
            a(iIntValue, 0, e18Var, iqbVarB);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new k66(j, j2, iqbVar2, i, 0);
        }
    }

    public static BitmapShader c(r20 r20Var) {
        return new BitmapShader(yfd.l(r20Var), zni.b0(0), zni.b0(0));
    }

    public static final LinearGradient d(int i, long j, long j2, List list, List list2) {
        sqk.i(list, list2);
        return new LinearGradient(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), sqk.f(list), sqk.g(list2, list), zni.b0(i));
    }

    public static final le4 e(cdi cdiVar, ge4 ge4Var) {
        return new le4(ge4Var, cdiVar);
    }

    public static final boolean f(int i, int i2) {
        return i == i2;
    }

    public static b02 g() {
        return b02.e;
    }

    public static long h() {
        return b02.d;
    }

    public static int i(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = c;
        return x54.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static boolean j(byte b2) {
        return b2 > -65;
    }

    public static float k(int i) {
        float fL = l(Color.red(i));
        float fL2 = l(Color.green(i));
        float fL3 = l(Color.blue(i));
        float[] fArr = d[1];
        float f2 = ((fL3 * fArr[2]) + ((fL2 * fArr[1]) + (fL * fArr[0]))) / 100.0f;
        return f2 <= 0.008856452f ? f2 * 903.2963f : (((float) Math.cbrt(f2)) * 116.0f) - 16.0f;
    }

    public static float l(int i) {
        float f2 = i / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static float m() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }
}
