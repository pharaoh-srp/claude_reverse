package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class a2f {
    public final float a;
    public final float b;
    public float c;
    public float d;
    public boolean e = false;

    public a2f(float f, float f2, float f3, float f4) {
        this.c = MTTypesetterKt.kLineSkipLimitMultiplier;
        this.d = MTTypesetterKt.kLineSkipLimitMultiplier;
        this.a = f;
        this.b = f2;
        double dSqrt = Math.sqrt((f4 * f4) + (f3 * f3));
        if (dSqrt != 0.0d) {
            this.c = (float) (((double) f3) / dSqrt);
            this.d = (float) (((double) f4) / dSqrt);
        }
    }

    public final void a(float f, float f2) {
        float f3 = f - this.a;
        float f4 = f2 - this.b;
        double dSqrt = Math.sqrt((f4 * f4) + (f3 * f3));
        if (dSqrt != 0.0d) {
            f3 = (float) (((double) f3) / dSqrt);
            f4 = (float) (((double) f4) / dSqrt);
        }
        float f5 = this.c;
        if (f3 != (-f5) || f4 != (-this.d)) {
            this.c = f5 + f3;
            this.d += f4;
        } else {
            this.e = true;
            this.c = -f4;
            this.d = f3;
        }
    }

    public final void b(a2f a2fVar) {
        float f = a2fVar.c;
        float f2 = this.c;
        if (f == (-f2)) {
            float f3 = a2fVar.d;
            if (f3 == (-this.d)) {
                this.e = true;
                this.c = -f3;
                this.d = a2fVar.c;
                return;
            }
        }
        this.c = f2 + f;
        this.d += a2fVar.d;
    }

    public final String toString() {
        return "(" + this.a + "," + this.b + " " + this.c + "," + this.d + ")";
    }
}
