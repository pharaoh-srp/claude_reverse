package defpackage;

import android.graphics.Color;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class ga2 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public ga2(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public static ga2 a(int i) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        b(i, xyi.k, fArr, fArr2);
        return new ga2(fArr2[0], fArr2[1], fArr[0], fArr[4], fArr[5], fArr[6]);
    }

    public static void b(int i, xyi xyiVar, float[] fArr, float[] fArr2) {
        float fL = usj.l(Color.red(i));
        float fL2 = usj.l(Color.green(i));
        float fL3 = usj.l(Color.blue(i));
        float[][] fArr3 = usj.d;
        float[] fArr4 = fArr3[0];
        float f = (fArr4[2] * fL3) + (fArr4[1] * fL2) + (fArr4[0] * fL);
        fArr2[0] = f;
        float[] fArr5 = fArr3[1];
        float f2 = (fArr5[2] * fL3) + (fArr5[1] * fL2) + (fArr5[0] * fL);
        fArr2[1] = f2;
        float[] fArr6 = fArr3[2];
        float f3 = (fL3 * fArr6[2]) + (fL2 * fArr6[1]) + (fL * fArr6[0]);
        fArr2[2] = f3;
        float[][] fArr7 = usj.a;
        float[] fArr8 = fArr7[0];
        float f4 = (fArr8[2] * f3) + (fArr8[1] * f2) + (fArr8[0] * f);
        float[] fArr9 = fArr7[1];
        float f5 = (fArr9[2] * f3) + (fArr9[1] * f2) + (fArr9[0] * f);
        float[] fArr10 = fArr7[2];
        float f6 = (f3 * fArr10[2]) + (f2 * fArr10[1]) + (f * fArr10[0]);
        float[] fArr11 = xyiVar.g;
        float f7 = xyiVar.i;
        float f8 = xyiVar.d;
        float f9 = xyiVar.a;
        float f10 = fArr11[0] * f4;
        float f11 = fArr11[1] * f5;
        float f12 = fArr11[2] * f6;
        float f13 = xyiVar.h;
        float fPow = (float) Math.pow(((double) (Math.abs(f10) * f13)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f11) * f13)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f12) * f13)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f10) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f11) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f12) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float f14 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d)) / 11.0f;
        float f15 = ((float) (((double) (fSignum + fSignum2)) - (d * 2.0d))) / 9.0f;
        float f16 = fSignum2 * 20.0f;
        float f17 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f16)) / 20.0f;
        float f18 = (((fSignum * 40.0f) + f16) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f15, f14)) * 180.0f) / 3.1415927f;
        if (fAtan2 < MTTypesetterKt.kLineSkipLimitMultiplier) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f19 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f18 * xyiVar.b) / f9, xyiVar.j * f8)) * 100.0f;
        float fSqrt = (4.0f / f8) * ((float) Math.sqrt(fPow4 / 100.0f)) * (f9 + 4.0f) * f7;
        float fSqrt2 = ((float) Math.sqrt(((double) fPow4) / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, xyiVar.f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? fAtan2 + 360.0f : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * xyiVar.e) * xyiVar.c) * ((float) Math.sqrt((f15 * f15) + (f14 * f14)))) / (f17 + 0.305f), 0.9d));
        float f20 = fSqrt2 * f7;
        float fSqrt3 = ((float) Math.sqrt((r0 * f8) / r10)) * 50.0f;
        float f21 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * f20) + 1.0f)) * 43.85965f;
        double d2 = f19;
        float fCos = ((float) Math.cos(d2)) * fLog;
        float fSin = fLog * ((float) Math.sin(d2));
        fArr2[0] = fAtan2;
        fArr2[1] = fSqrt2;
        if (fArr != null) {
            fArr[0] = fPow4;
            fArr[1] = fSqrt;
            fArr[2] = f20;
            fArr[3] = fSqrt3;
            fArr[4] = f21;
            fArr[5] = fCos;
            fArr[6] = fSin;
        }
    }

    public static ga2 c(float f, float f2, float f3) {
        xyi xyiVar = xyi.k;
        float f4 = xyiVar.d;
        Math.sqrt(((double) f) / 100.0d);
        float f5 = xyiVar.a + 4.0f;
        float f6 = xyiVar.i * f2;
        Math.sqrt(((f2 / ((float) Math.sqrt(r1))) * xyiVar.d) / f5);
        float f7 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((((double) f6) * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f3) / 180.0f;
        return new ga2(f3, f2, f, f7, fLog * ((float) Math.cos(d)), fLog * ((float) Math.sin(d)));
    }

    public static int d(float f, float f2, float f3) {
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        xyi xyiVar = xyi.k;
        float f10 = f2;
        if (f10 < 1.0d || Math.round(f3) <= 0.0d || Math.round(f3) >= 100.0d) {
            return usj.i(f3);
        }
        float f11 = MTTypesetterKt.kLineSkipLimitMultiplier;
        float fMin = f < MTTypesetterKt.kLineSkipLimitMultiplier ? 0.0f : Math.min(360.0f, f);
        float f12 = 0.0f;
        boolean z = true;
        ga2 ga2Var = null;
        float f13 = f10;
        while (Math.abs(f12 - f10) >= 0.4f) {
            float f14 = 100.0f;
            float f15 = 1000.0f;
            float f16 = f11;
            float f17 = 1000.0f;
            ga2 ga2Var2 = null;
            while (true) {
                if (Math.abs(f16 - f14) <= 0.01f) {
                    f4 = fMin;
                    f5 = f10;
                    f6 = f11;
                    f7 = f13;
                    f8 = 2.0f;
                    break;
                }
                float f18 = ((f14 - f16) / 2.0f) + f16;
                f6 = f11;
                int iE = c(f18, f13, fMin).e(xyi.k);
                float fK = usj.k(iE);
                float fAbs = Math.abs(f3 - fK);
                if (fAbs < 0.2f) {
                    ga2 ga2VarA = a(iE);
                    f8 = 2.0f;
                    f5 = f10;
                    ga2 ga2VarC = c(ga2VarA.c, ga2VarA.b, fMin);
                    f4 = fMin;
                    float f19 = ga2VarA.d - ga2VarC.d;
                    float f20 = ga2VarA.e - ga2VarC.e;
                    float f21 = ga2VarA.f - ga2VarC.f;
                    double dSqrt = Math.sqrt((f21 * f21) + (f20 * f20) + (f19 * f19));
                    f9 = fK;
                    f7 = f13;
                    float fPow = (float) (Math.pow(dSqrt, 0.63d) * 1.41d);
                    if (fPow <= 1.0f) {
                        f17 = fPow;
                        ga2Var2 = ga2VarA;
                        f15 = fAbs;
                    }
                } else {
                    f4 = fMin;
                    f5 = f10;
                    f9 = fK;
                    f7 = f13;
                    f8 = 2.0f;
                }
                if (f15 == f6 && f17 == f6) {
                    break;
                }
                if (f9 < f3) {
                    f16 = f18;
                } else {
                    f14 = f18;
                }
                f13 = f7;
                f11 = f6;
                f10 = f5;
                fMin = f4;
            }
            if (!z) {
                if (ga2Var2 == null) {
                    f10 = f7;
                } else {
                    f12 = f7;
                    ga2Var = ga2Var2;
                    f10 = f5;
                }
                f13 = ((f10 - f12) / f8) + f12;
                f11 = f6;
            } else {
                if (ga2Var2 != null) {
                    return ga2Var2.e(xyiVar);
                }
                f13 = ((f5 - f12) / f8) + f12;
                z = false;
                f11 = f6;
                f10 = f5;
            }
            fMin = f4;
        }
        return ga2Var == null ? usj.i(f3) : ga2Var.e(xyiVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e(defpackage.xyi r20) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ga2.e(xyi):int");
    }
}
