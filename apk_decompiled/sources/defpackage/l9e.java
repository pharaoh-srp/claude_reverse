package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class l9e {
    public static final l9e e = new l9e(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public l9e(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public static l9e b(l9e l9eVar, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = l9eVar.a;
        }
        float f4 = (i & 2) != 0 ? l9eVar.b : Float.NEGATIVE_INFINITY;
        if ((i & 4) != 0) {
            f2 = l9eVar.c;
        }
        if ((i & 8) != 0) {
            f3 = l9eVar.d;
        }
        return new l9e(f, f4, f2, f3);
    }

    public final boolean a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat >= this.a) & (fIntBitsToFloat < this.c) & (fIntBitsToFloat2 >= this.b) & (fIntBitsToFloat2 < this.d);
    }

    public final long c() {
        float f = this.c;
        float f2 = this.a;
        return (((long) Float.floatToRawIntBits(((f - f2) / 2.0f) + f2)) << 32) | (((long) Float.floatToRawIntBits(this.d)) & 4294967295L);
    }

    public final long d() {
        return (((long) Float.floatToRawIntBits(this.a)) << 32) | (((long) Float.floatToRawIntBits(this.d)) & 4294967295L);
    }

    public final long e() {
        return (((long) Float.floatToRawIntBits(this.c)) << 32) | (((long) Float.floatToRawIntBits(this.d)) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9e)) {
            return false;
        }
        l9e l9eVar = (l9e) obj;
        return Float.compare(this.a, l9eVar.a) == 0 && Float.compare(this.b, l9eVar.b) == 0 && Float.compare(this.c, l9eVar.c) == 0 && Float.compare(this.d, l9eVar.d) == 0;
    }

    public final long f() {
        float f = this.c;
        float f2 = this.a;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.d;
        float f5 = this.b;
        return (((long) Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public final long g() {
        float f = this.c - this.a;
        return (((long) Float.floatToRawIntBits(this.d - this.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final long h() {
        return (((long) Float.floatToRawIntBits(this.a)) << 32) | (((long) Float.floatToRawIntBits(this.b)) & 4294967295L);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + vb7.b(this.c, vb7.b(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final l9e i(l9e l9eVar) {
        return new l9e(Math.max(this.a, l9eVar.a), Math.max(this.b, l9eVar.b), Math.min(this.c, l9eVar.c), Math.min(this.d, l9eVar.d));
    }

    public final boolean j() {
        return (this.a >= this.c) | (this.b >= this.d);
    }

    public final boolean k(l9e l9eVar) {
        return (this.a < l9eVar.c) & (l9eVar.a < this.c) & (this.b < l9eVar.d) & (l9eVar.b < this.d);
    }

    public final l9e l(float f, float f2) {
        return new l9e(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final l9e m(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new l9e(Float.intBitsToFloat(i) + this.a, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + kpk.i(this.a) + ", " + kpk.i(this.b) + ", " + kpk.i(this.c) + ", " + kpk.i(this.d) + ')';
    }
}
