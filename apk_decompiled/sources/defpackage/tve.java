package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class tve {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final float f;
    public final float g;
    public final float h;
    public long i;

    public tve(long j, long j2, long j3, r35 r35Var) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        long jL = yfd.L(j, j2);
        long jL2 = yfd.L(j3, j2);
        float fB = yfd.B(jL);
        float fB2 = yfd.B(jL2);
        if (fB <= MTTypesetterKt.kLineSkipLimitMultiplier || fB2 <= MTTypesetterKt.kLineSkipLimitMultiplier) {
            this.d = so7.a(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
            this.e = so7.a(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
            this.f = MTTypesetterKt.kLineSkipLimitMultiplier;
            this.g = MTTypesetterKt.kLineSkipLimitMultiplier;
            this.h = MTTypesetterKt.kLineSkipLimitMultiplier;
        } else {
            long jW = yfd.w(fB, jL);
            this.d = jW;
            long jW2 = yfd.w(fB2, jL2);
            this.e = jW2;
            float f = r35Var.a;
            this.f = f;
            this.g = MTTypesetterKt.kLineSkipLimitMultiplier;
            float fX = yfd.x(jW, jW2);
            float f2 = bqi.b;
            float fSqrt = (float) Math.sqrt(1.0f - (fX * fX));
            this.h = ((double) fSqrt) > 0.001d ? ((fX + 1.0f) * f) / fSqrt : 0.0f;
        }
        this.i = so7.a(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
    }

    public static zc5 b(float f, float f2, long j, long j2, long j3, long j4, long j5, float f3) {
        long jL = yfd.L(j2, j);
        float fB = yfd.B(jL);
        so7 so7Var = null;
        if (fB <= MTTypesetterKt.kLineSkipLimitMultiplier) {
            sz6.p("Can't get the direction of a 0-length vector");
            return null;
        }
        long jW = yfd.w(fB, jL);
        long jO = yfd.O(j, yfd.i0(1.0f + f2, yfd.i0(f, jW)));
        long jW2 = yfd.w(2.0f, yfd.O(j3, j4));
        long jA = so7.a(bqi.b(yfd.E(j3), yfd.E(jW2), f2), bqi.b(yfd.F(j3), yfd.F(jW2), f2));
        long jO2 = yfd.O(j5, yfd.i0(f3, bqi.a(yfd.E(jA) - yfd.E(j5), yfd.F(jA) - yfd.F(j5))));
        long jL2 = yfd.L(jO2, j5);
        long jA2 = so7.a(-yfd.F(jL2), yfd.E(jL2));
        long jA3 = so7.a(-yfd.F(jA2), yfd.E(jA2));
        float fX = yfd.x(jW, jA3);
        if (Math.abs(fX) >= 1.0E-4f) {
            float fX2 = yfd.x(yfd.L(jO2, j2), jA3);
            if (Math.abs(fX) >= Math.abs(fX2) * 1.0E-4f) {
                so7Var = new so7(yfd.O(j2, yfd.i0(fX2 / fX, jW)));
            }
        }
        long j6 = so7Var != null ? so7Var.a : j3;
        long jW3 = yfd.w(3.0f, yfd.O(jO, yfd.i0(2.0f, j6)));
        return new zc5(new float[]{yfd.E(jO), yfd.F(jO), yfd.E(jW3), yfd.F(jW3), yfd.E(j6), yfd.F(j6), yfd.E(jO2), yfd.F(jO2)});
    }

    public final float a(float f) {
        float fC = c();
        float f2 = this.g;
        if (f > fC) {
            return f2;
        }
        float f3 = this.h;
        return f > f3 ? ((f - f3) * f2) / (c() - f3) : MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    public final float c() {
        return (1.0f + this.g) * this.h;
    }
}
