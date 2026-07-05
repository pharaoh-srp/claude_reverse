package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class sve {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        gb9.f(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 0L);
    }

    public sve(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final float a() {
        return this.d - this.b;
    }

    public final float b() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sve)) {
            return false;
        }
        sve sveVar = (sve) obj;
        return Float.compare(this.a, sveVar.a) == 0 && Float.compare(this.b, sveVar.b) == 0 && Float.compare(this.c, sveVar.c) == 0 && Float.compare(this.d, sveVar.d) == 0 && ntk.f(this.e, sveVar.e) && ntk.f(this.f, sveVar.f) && ntk.f(this.g, sveVar.g) && ntk.f(this.h, sveVar.h);
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + vb7.e(vb7.e(vb7.e(vb7.b(this.d, vb7.b(this.c, vb7.b(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        String str = kpk.i(this.a) + ", " + kpk.i(this.b) + ", " + kpk.i(this.c) + ", " + kpk.i(this.d);
        long j = this.e;
        long j2 = this.f;
        boolean zF = ntk.f(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (!zF || !ntk.f(j2, j3) || !ntk.f(j3, j4)) {
            StringBuilder sbX = sq6.x("RoundRect(rect=", str, ", topLeft=");
            sbX.append((Object) ntk.l(j));
            sbX.append(", topRight=");
            sbX.append((Object) ntk.l(j2));
            sbX.append(", bottomRight=");
            sbX.append((Object) ntk.l(j3));
            sbX.append(", bottomLeft=");
            sbX.append((Object) ntk.l(j4));
            sbX.append(')');
            return sbX.toString();
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            StringBuilder sbX2 = sq6.x("RoundRect(rect=", str, ", radius=");
            sbX2.append(kpk.i(Float.intBitsToFloat(i)));
            sbX2.append(')');
            return sbX2.toString();
        }
        StringBuilder sbX3 = sq6.x("RoundRect(rect=", str, ", x=");
        sbX3.append(kpk.i(Float.intBitsToFloat(i)));
        sbX3.append(", y=");
        sbX3.append(kpk.i(Float.intBitsToFloat(i2)));
        sbX3.append(')');
        return sbX3.toString();
    }
}
