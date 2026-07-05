package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class rse extends r54 {
    public static final mr9 r = new mr9();
    public final v9j d;
    public final float e;
    public final float f;
    public final a5i g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final ka6 k;
    public final qse l;
    public final nse m;
    public final ka6 n;
    public final qse o;
    public final nse p;
    public final boolean q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0260  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public rse(java.lang.String r36, float[] r37, defpackage.v9j r38, float[] r39, defpackage.ka6 r40, defpackage.ka6 r41, float r42, float r43, defpackage.a5i r44, int r45) {
        /*
            Method dump skipped, instruction units count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rse.<init>(java.lang.String, float[], v9j, float[], ka6, ka6, float, float, a5i, int):void");
    }

    @Override // defpackage.r54
    public final float a(int i) {
        return this.f;
    }

    @Override // defpackage.r54
    public final float b(int i) {
        return this.e;
    }

    @Override // defpackage.r54
    public final boolean c() {
        return this.q;
    }

    @Override // defpackage.r54
    public final long d(float f, float f2, float f3) {
        double d = f;
        nse nseVar = this.p;
        float fA = (float) nseVar.a(d);
        float fA2 = (float) nseVar.a(f2);
        float fA3 = (float) nseVar.a(f3);
        float[] fArr = this.i;
        if (fArr.length < 9) {
            return 0L;
        }
        return (((long) Float.floatToRawIntBits((fArr[6] * fA3) + ((fArr[3] * fA2) + (fArr[0] * fA)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((fArr[7] * fA3) + (fArr[4] * fA2) + (fArr[1] * fA))));
    }

    @Override // defpackage.r54
    public final float e(float f, float f2, float f3) {
        double d = f;
        nse nseVar = this.p;
        float fA = (float) nseVar.a(d);
        float fA2 = (float) nseVar.a(f2);
        float fA3 = (float) nseVar.a(f3);
        float[] fArr = this.i;
        return (fArr[8] * fA3) + (fArr[5] * fA2) + (fArr[2] * fA);
    }

    @Override // defpackage.r54
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rse.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        rse rseVar = (rse) obj;
        if (Float.compare(rseVar.e, this.e) != 0 || Float.compare(rseVar.f, this.f) != 0 || !x44.r(this.d, rseVar.d) || !Arrays.equals(this.h, rseVar.h)) {
            return false;
        }
        a5i a5iVar = rseVar.g;
        a5i a5iVar2 = this.g;
        if (a5iVar2 != null) {
            return x44.r(a5iVar2, a5iVar);
        }
        if (a5iVar == null) {
            return true;
        }
        if (x44.r(this.k, rseVar.k)) {
            return x44.r(this.n, rseVar.n);
        }
        return false;
    }

    @Override // defpackage.r54
    public final long f(float f, float f2, float f3, float f4, r54 r54Var) {
        float[] fArr = this.j;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        nse nseVar = this.m;
        return d4c.l((float) nseVar.a(f5), (float) nseVar.a(f6), (float) nseVar.a(f7), f4, r54Var);
    }

    @Override // defpackage.r54
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.h) + ((this.d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.e;
        int iFloatToIntBits = (iHashCode + (f == MTTypesetterKt.kLineSkipLimitMultiplier ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == MTTypesetterKt.kLineSkipLimitMultiplier ? 0 : Float.floatToIntBits(f2))) * 31;
        a5i a5iVar = this.g;
        int iHashCode2 = iFloatToIntBits2 + (a5iVar != null ? a5iVar.hashCode() : 0);
        if (a5iVar != null) {
            return iHashCode2;
        }
        return this.n.hashCode() + ((this.k.hashCode() + (iHashCode2 * 31)) * 31);
    }

    public rse(String str, float[] fArr, v9j v9jVar, final a5i a5iVar, int i) {
        double d;
        ka6 ka6Var;
        ka6 ka6Var2;
        double d2 = a5iVar.a;
        final int i2 = 0;
        final int i3 = 1;
        boolean z = d2 == -3.0d;
        double d3 = a5iVar.g;
        double d4 = a5iVar.f;
        if (z) {
            d = -3.0d;
            final int i4 = 4;
            ka6Var = new ka6() { // from class: pse
                @Override // defpackage.ka6
                public final double a(double d5) {
                    int i5 = i4;
                    a5i a5iVar2 = a5iVar;
                    switch (i5) {
                        case 0:
                            float[] fArr2 = t54.a;
                            return t54.a(a5iVar2, d5);
                        case 1:
                            float[] fArr3 = t54.a;
                            return t54.c(a5iVar2, d5);
                        case 2:
                            double d6 = a5iVar2.b;
                            return d5 >= a5iVar2.e ? Math.pow((d6 * d5) + a5iVar2.c, a5iVar2.a) : a5iVar2.d * d5;
                        case 3:
                            double d7 = a5iVar2.b;
                            double d8 = a5iVar2.c;
                            double d9 = a5iVar2.d;
                            return d5 >= a5iVar2.e ? Math.pow((d7 * d5) + d8, a5iVar2.a) + a5iVar2.f : (d9 * d5) + a5iVar2.g;
                        case 4:
                            float[] fArr4 = t54.a;
                            return t54.b(a5iVar2, d5);
                        case 5:
                            float[] fArr5 = t54.a;
                            return t54.d(a5iVar2, d5);
                        case 6:
                            double d10 = a5iVar2.b;
                            double d11 = a5iVar2.c;
                            double d12 = a5iVar2.d;
                            return d5 >= a5iVar2.e * d12 ? (Math.pow(d5, 1.0d / a5iVar2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = a5iVar2.b;
                            double d14 = a5iVar2.c;
                            double d15 = a5iVar2.d;
                            return d5 >= a5iVar2.e * d15 ? (Math.pow(d5 - a5iVar2.f, 1.0d / a5iVar2.a) - d14) / d13 : (d5 - a5iVar2.g) / d15;
                    }
                }
            };
        } else {
            d = -3.0d;
            if (d2 == -2.0d) {
                final int i5 = 5;
                ka6Var = new ka6() { // from class: pse
                    @Override // defpackage.ka6
                    public final double a(double d5) {
                        int i52 = i5;
                        a5i a5iVar2 = a5iVar;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = t54.a;
                                return t54.a(a5iVar2, d5);
                            case 1:
                                float[] fArr3 = t54.a;
                                return t54.c(a5iVar2, d5);
                            case 2:
                                double d6 = a5iVar2.b;
                                return d5 >= a5iVar2.e ? Math.pow((d6 * d5) + a5iVar2.c, a5iVar2.a) : a5iVar2.d * d5;
                            case 3:
                                double d7 = a5iVar2.b;
                                double d8 = a5iVar2.c;
                                double d9 = a5iVar2.d;
                                return d5 >= a5iVar2.e ? Math.pow((d7 * d5) + d8, a5iVar2.a) + a5iVar2.f : (d9 * d5) + a5iVar2.g;
                            case 4:
                                float[] fArr4 = t54.a;
                                return t54.b(a5iVar2, d5);
                            case 5:
                                float[] fArr5 = t54.a;
                                return t54.d(a5iVar2, d5);
                            case 6:
                                double d10 = a5iVar2.b;
                                double d11 = a5iVar2.c;
                                double d12 = a5iVar2.d;
                                return d5 >= a5iVar2.e * d12 ? (Math.pow(d5, 1.0d / a5iVar2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = a5iVar2.b;
                                double d14 = a5iVar2.c;
                                double d15 = a5iVar2.d;
                                return d5 >= a5iVar2.e * d15 ? (Math.pow(d5 - a5iVar2.f, 1.0d / a5iVar2.a) - d14) / d13 : (d5 - a5iVar2.g) / d15;
                        }
                    }
                };
            } else if (d4 == 0.0d && d3 == 0.0d) {
                final int i6 = 6;
                ka6Var = new ka6() { // from class: pse
                    @Override // defpackage.ka6
                    public final double a(double d5) {
                        int i52 = i6;
                        a5i a5iVar2 = a5iVar;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = t54.a;
                                return t54.a(a5iVar2, d5);
                            case 1:
                                float[] fArr3 = t54.a;
                                return t54.c(a5iVar2, d5);
                            case 2:
                                double d6 = a5iVar2.b;
                                return d5 >= a5iVar2.e ? Math.pow((d6 * d5) + a5iVar2.c, a5iVar2.a) : a5iVar2.d * d5;
                            case 3:
                                double d7 = a5iVar2.b;
                                double d8 = a5iVar2.c;
                                double d9 = a5iVar2.d;
                                return d5 >= a5iVar2.e ? Math.pow((d7 * d5) + d8, a5iVar2.a) + a5iVar2.f : (d9 * d5) + a5iVar2.g;
                            case 4:
                                float[] fArr4 = t54.a;
                                return t54.b(a5iVar2, d5);
                            case 5:
                                float[] fArr5 = t54.a;
                                return t54.d(a5iVar2, d5);
                            case 6:
                                double d10 = a5iVar2.b;
                                double d11 = a5iVar2.c;
                                double d12 = a5iVar2.d;
                                return d5 >= a5iVar2.e * d12 ? (Math.pow(d5, 1.0d / a5iVar2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = a5iVar2.b;
                                double d14 = a5iVar2.c;
                                double d15 = a5iVar2.d;
                                return d5 >= a5iVar2.e * d15 ? (Math.pow(d5 - a5iVar2.f, 1.0d / a5iVar2.a) - d14) / d13 : (d5 - a5iVar2.g) / d15;
                        }
                    }
                };
            } else {
                final int i7 = 7;
                ka6Var = new ka6() { // from class: pse
                    @Override // defpackage.ka6
                    public final double a(double d5) {
                        int i52 = i7;
                        a5i a5iVar2 = a5iVar;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = t54.a;
                                return t54.a(a5iVar2, d5);
                            case 1:
                                float[] fArr3 = t54.a;
                                return t54.c(a5iVar2, d5);
                            case 2:
                                double d6 = a5iVar2.b;
                                return d5 >= a5iVar2.e ? Math.pow((d6 * d5) + a5iVar2.c, a5iVar2.a) : a5iVar2.d * d5;
                            case 3:
                                double d7 = a5iVar2.b;
                                double d8 = a5iVar2.c;
                                double d9 = a5iVar2.d;
                                return d5 >= a5iVar2.e ? Math.pow((d7 * d5) + d8, a5iVar2.a) + a5iVar2.f : (d9 * d5) + a5iVar2.g;
                            case 4:
                                float[] fArr4 = t54.a;
                                return t54.b(a5iVar2, d5);
                            case 5:
                                float[] fArr5 = t54.a;
                                return t54.d(a5iVar2, d5);
                            case 6:
                                double d10 = a5iVar2.b;
                                double d11 = a5iVar2.c;
                                double d12 = a5iVar2.d;
                                return d5 >= a5iVar2.e * d12 ? (Math.pow(d5, 1.0d / a5iVar2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = a5iVar2.b;
                                double d14 = a5iVar2.c;
                                double d15 = a5iVar2.d;
                                return d5 >= a5iVar2.e * d15 ? (Math.pow(d5 - a5iVar2.f, 1.0d / a5iVar2.a) - d14) / d13 : (d5 - a5iVar2.g) / d15;
                        }
                    }
                };
            }
        }
        if (d2 == d) {
            ka6Var2 = new ka6() { // from class: pse
                @Override // defpackage.ka6
                public final double a(double d5) {
                    int i52 = i2;
                    a5i a5iVar2 = a5iVar;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = t54.a;
                            return t54.a(a5iVar2, d5);
                        case 1:
                            float[] fArr3 = t54.a;
                            return t54.c(a5iVar2, d5);
                        case 2:
                            double d6 = a5iVar2.b;
                            return d5 >= a5iVar2.e ? Math.pow((d6 * d5) + a5iVar2.c, a5iVar2.a) : a5iVar2.d * d5;
                        case 3:
                            double d7 = a5iVar2.b;
                            double d8 = a5iVar2.c;
                            double d9 = a5iVar2.d;
                            return d5 >= a5iVar2.e ? Math.pow((d7 * d5) + d8, a5iVar2.a) + a5iVar2.f : (d9 * d5) + a5iVar2.g;
                        case 4:
                            float[] fArr4 = t54.a;
                            return t54.b(a5iVar2, d5);
                        case 5:
                            float[] fArr5 = t54.a;
                            return t54.d(a5iVar2, d5);
                        case 6:
                            double d10 = a5iVar2.b;
                            double d11 = a5iVar2.c;
                            double d12 = a5iVar2.d;
                            return d5 >= a5iVar2.e * d12 ? (Math.pow(d5, 1.0d / a5iVar2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = a5iVar2.b;
                            double d14 = a5iVar2.c;
                            double d15 = a5iVar2.d;
                            return d5 >= a5iVar2.e * d15 ? (Math.pow(d5 - a5iVar2.f, 1.0d / a5iVar2.a) - d14) / d13 : (d5 - a5iVar2.g) / d15;
                    }
                }
            };
        } else if (d2 == -2.0d) {
            ka6Var2 = new ka6() { // from class: pse
                @Override // defpackage.ka6
                public final double a(double d5) {
                    int i52 = i3;
                    a5i a5iVar2 = a5iVar;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = t54.a;
                            return t54.a(a5iVar2, d5);
                        case 1:
                            float[] fArr3 = t54.a;
                            return t54.c(a5iVar2, d5);
                        case 2:
                            double d6 = a5iVar2.b;
                            return d5 >= a5iVar2.e ? Math.pow((d6 * d5) + a5iVar2.c, a5iVar2.a) : a5iVar2.d * d5;
                        case 3:
                            double d7 = a5iVar2.b;
                            double d8 = a5iVar2.c;
                            double d9 = a5iVar2.d;
                            return d5 >= a5iVar2.e ? Math.pow((d7 * d5) + d8, a5iVar2.a) + a5iVar2.f : (d9 * d5) + a5iVar2.g;
                        case 4:
                            float[] fArr4 = t54.a;
                            return t54.b(a5iVar2, d5);
                        case 5:
                            float[] fArr5 = t54.a;
                            return t54.d(a5iVar2, d5);
                        case 6:
                            double d10 = a5iVar2.b;
                            double d11 = a5iVar2.c;
                            double d12 = a5iVar2.d;
                            return d5 >= a5iVar2.e * d12 ? (Math.pow(d5, 1.0d / a5iVar2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = a5iVar2.b;
                            double d14 = a5iVar2.c;
                            double d15 = a5iVar2.d;
                            return d5 >= a5iVar2.e * d15 ? (Math.pow(d5 - a5iVar2.f, 1.0d / a5iVar2.a) - d14) / d13 : (d5 - a5iVar2.g) / d15;
                    }
                }
            };
        } else if (d4 == 0.0d && d3 == 0.0d) {
            final int i8 = 2;
            ka6Var2 = new ka6() { // from class: pse
                @Override // defpackage.ka6
                public final double a(double d5) {
                    int i52 = i8;
                    a5i a5iVar2 = a5iVar;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = t54.a;
                            return t54.a(a5iVar2, d5);
                        case 1:
                            float[] fArr3 = t54.a;
                            return t54.c(a5iVar2, d5);
                        case 2:
                            double d6 = a5iVar2.b;
                            return d5 >= a5iVar2.e ? Math.pow((d6 * d5) + a5iVar2.c, a5iVar2.a) : a5iVar2.d * d5;
                        case 3:
                            double d7 = a5iVar2.b;
                            double d8 = a5iVar2.c;
                            double d9 = a5iVar2.d;
                            return d5 >= a5iVar2.e ? Math.pow((d7 * d5) + d8, a5iVar2.a) + a5iVar2.f : (d9 * d5) + a5iVar2.g;
                        case 4:
                            float[] fArr4 = t54.a;
                            return t54.b(a5iVar2, d5);
                        case 5:
                            float[] fArr5 = t54.a;
                            return t54.d(a5iVar2, d5);
                        case 6:
                            double d10 = a5iVar2.b;
                            double d11 = a5iVar2.c;
                            double d12 = a5iVar2.d;
                            return d5 >= a5iVar2.e * d12 ? (Math.pow(d5, 1.0d / a5iVar2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = a5iVar2.b;
                            double d14 = a5iVar2.c;
                            double d15 = a5iVar2.d;
                            return d5 >= a5iVar2.e * d15 ? (Math.pow(d5 - a5iVar2.f, 1.0d / a5iVar2.a) - d14) / d13 : (d5 - a5iVar2.g) / d15;
                    }
                }
            };
        } else {
            final int i9 = 3;
            ka6Var2 = new ka6() { // from class: pse
                @Override // defpackage.ka6
                public final double a(double d5) {
                    int i52 = i9;
                    a5i a5iVar2 = a5iVar;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = t54.a;
                            return t54.a(a5iVar2, d5);
                        case 1:
                            float[] fArr3 = t54.a;
                            return t54.c(a5iVar2, d5);
                        case 2:
                            double d6 = a5iVar2.b;
                            return d5 >= a5iVar2.e ? Math.pow((d6 * d5) + a5iVar2.c, a5iVar2.a) : a5iVar2.d * d5;
                        case 3:
                            double d7 = a5iVar2.b;
                            double d8 = a5iVar2.c;
                            double d9 = a5iVar2.d;
                            return d5 >= a5iVar2.e ? Math.pow((d7 * d5) + d8, a5iVar2.a) + a5iVar2.f : (d9 * d5) + a5iVar2.g;
                        case 4:
                            float[] fArr4 = t54.a;
                            return t54.b(a5iVar2, d5);
                        case 5:
                            float[] fArr5 = t54.a;
                            return t54.d(a5iVar2, d5);
                        case 6:
                            double d10 = a5iVar2.b;
                            double d11 = a5iVar2.c;
                            double d12 = a5iVar2.d;
                            return d5 >= a5iVar2.e * d12 ? (Math.pow(d5, 1.0d / a5iVar2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = a5iVar2.b;
                            double d14 = a5iVar2.c;
                            double d15 = a5iVar2.d;
                            return d5 >= a5iVar2.e * d15 ? (Math.pow(d5 - a5iVar2.f, 1.0d / a5iVar2.a) - d14) / d13 : (d5 - a5iVar2.g) / d15;
                    }
                }
            };
        }
        this(str, fArr, v9jVar, null, ka6Var, ka6Var2, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f, a5iVar, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public rse(String str, float[] fArr, v9j v9jVar, final double d, float f, float f2, int i) {
        ka6 ka6Var;
        ka6 ka6Var2 = r;
        if (d == 1.0d) {
            ka6Var = ka6Var2;
        } else {
            final int i2 = 0;
            ka6Var = new ka6() { // from class: ose
                @Override // defpackage.ka6
                public final double a(double d2) {
                    switch (i2) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        if (d != 1.0d) {
            final int i3 = 1;
            ka6Var2 = new ka6() { // from class: ose
                @Override // defpackage.ka6
                public final double a(double d2) {
                    switch (i3) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        ka6 ka6Var3 = ka6Var2;
        this(str, fArr, v9jVar, null, ka6Var, ka6Var3, f, f2, new a5i(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }
}
