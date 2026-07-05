package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class ssi {
    public final boolean a;
    public final rsi b;
    public final int c;
    public final dg5[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    public ssi(boolean z, rsi rsiVar) {
        int i;
        this.a = z;
        this.b = rsiVar;
        if (z && rsiVar.equals(rsi.E)) {
            sz6.j("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int iOrdinal = rsiVar.ordinal();
        if (iOrdinal == 0) {
            i = 3;
        } else {
            if (iOrdinal != 1) {
                wg6.i();
                throw null;
            }
            i = 2;
        }
        this.c = i;
        this.d = new dg5[20];
        this.f = new float[20];
        this.g = new float[20];
        this.h = new float[3];
    }

    public final void a(float f, long j) {
        int i = (this.e + 1) % 20;
        this.e = i;
        dg5[] dg5VarArr = this.d;
        dg5 dg5Var = dg5VarArr[i];
        if (dg5Var != null) {
            dg5Var.a = j;
            dg5Var.b = f;
        } else {
            dg5 dg5Var2 = new dg5();
            dg5Var2.a = j;
            dg5Var2.b = f;
            dg5VarArr[i] = dg5Var2;
        }
    }

    public final float b(float f) {
        rsi rsiVar;
        float[] fArr;
        float[] fArr2;
        float f2;
        boolean z;
        int i;
        float f3;
        float fSignum;
        float f4 = MTTypesetterKt.kLineSkipLimitMultiplier;
        if (f <= MTTypesetterKt.kLineSkipLimitMultiplier) {
            b39.c("maximumVelocity should be a positive value. You specified=" + f);
        }
        int i2 = this.e;
        dg5[] dg5VarArr = this.d;
        dg5 dg5Var = dg5VarArr[i2];
        if (dg5Var == null) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            int i3 = 0;
            dg5 dg5Var2 = dg5Var;
            while (true) {
                dg5 dg5Var3 = dg5VarArr[i2];
                boolean z2 = this.a;
                rsiVar = this.b;
                fArr = this.f;
                fArr2 = this.g;
                if (dg5Var3 == null) {
                    f2 = f4;
                    z = z2;
                    i = 1;
                    break;
                }
                long j = dg5Var.a;
                f2 = f4;
                int i4 = i2;
                long j2 = dg5Var3.a;
                float f5 = j - j2;
                z = z2;
                i = 1;
                float fAbs = Math.abs(j2 - dg5Var2.a);
                dg5Var2 = (rsiVar == rsi.E || z) ? dg5Var3 : dg5Var;
                if (f5 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i3] = dg5Var3.b;
                fArr2[i3] = -f5;
                i2 = (i4 == 0 ? 20 : i4) - 1;
                i3++;
                if (i3 >= 20) {
                    break;
                }
                f4 = f2;
            }
            if (i3 >= this.c) {
                int iOrdinal = rsiVar.ordinal();
                if (iOrdinal == 0) {
                    try {
                        float[] fArr3 = this.h;
                        nvj.j(fArr2, fArr, i3, fArr3);
                        fSignum = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        fSignum = f2;
                    }
                } else {
                    if (iOrdinal != i) {
                        wg6.i();
                        return f2;
                    }
                    int i5 = i3 - i;
                    float f6 = fArr2[i5];
                    int i6 = i5;
                    float fAbs2 = f2;
                    while (i6 > 0) {
                        int i7 = i6 - 1;
                        float f7 = fArr2[i7];
                        if (f6 != f7) {
                            float f8 = (z ? -fArr[i7] : fArr[i6] - fArr[i7]) / (f6 - f7);
                            fAbs2 += Math.abs(f8) * (f8 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2.0f))));
                            if (i6 == i5) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i6--;
                        f6 = f7;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2.0f));
                }
                f3 = fSignum * 1000.0f;
            } else {
                f3 = f2;
            }
        }
        if (f3 == f2 || Float.isNaN(f3)) {
            return f2;
        }
        if (f3 <= f2) {
            float f9 = -f;
            if (f3 < f9) {
                return f9;
            }
        } else if (f3 > f) {
            f3 = f;
        }
        return f3;
    }

    public /* synthetic */ ssi() {
        this(false, rsi.E);
    }

    public ssi(int i) {
        this(true, rsi.F);
    }
}
