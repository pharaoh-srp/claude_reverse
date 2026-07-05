package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class f7b {
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    static {
        new e7b().a();
        tpi.w(0);
        tpi.w(1);
        tpi.w(2);
        tpi.w(3);
        tpi.w(4);
    }

    public f7b(e7b e7bVar) {
        long j = e7bVar.a;
        long j2 = e7bVar.b;
        long j3 = e7bVar.c;
        float f = e7bVar.d;
        float f2 = e7bVar.e;
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = f;
        this.e = f2;
    }

    public final e7b a() {
        e7b e7bVar = new e7b();
        e7bVar.a = this.a;
        e7bVar.b = this.b;
        e7bVar.c = this.c;
        e7bVar.d = this.d;
        e7bVar.e = this.e;
        return e7bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7b)) {
            return false;
        }
        f7b f7bVar = (f7b) obj;
        return this.a == f7bVar.a && this.b == f7bVar.b && this.c == f7bVar.c && this.d == f7bVar.d && this.e == f7bVar.e;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.c;
        int i2 = (i + ((int) ((j3 >>> 32) ^ j3))) * 31;
        float f = this.d;
        int iFloatToIntBits = (i2 + (f != MTTypesetterKt.kLineSkipLimitMultiplier ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.e;
        return iFloatToIntBits + (f2 != MTTypesetterKt.kLineSkipLimitMultiplier ? Float.floatToIntBits(f2) : 0);
    }
}
