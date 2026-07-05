package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class dwb {
    public float a = MTTypesetterKt.kLineSkipLimitMultiplier;
    public float b = MTTypesetterKt.kLineSkipLimitMultiplier;
    public float c = MTTypesetterKt.kLineSkipLimitMultiplier;
    public float d = MTTypesetterKt.kLineSkipLimitMultiplier;

    public final void a(float f, float f2, float f3, float f4) {
        this.a = Math.max(f, this.a);
        this.b = Math.max(f2, this.b);
        this.c = Math.min(f3, this.c);
        this.d = Math.min(f4, this.d);
    }

    public final boolean b() {
        return (this.a >= this.c) | (this.b >= this.d);
    }

    public final void c(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        this.a += fIntBitsToFloat;
        this.b += fIntBitsToFloat2;
        this.c += fIntBitsToFloat;
        this.d += fIntBitsToFloat2;
    }

    public final String toString() {
        return "MutableRect(" + kpk.i(this.a) + ", " + kpk.i(this.b) + ", " + kpk.i(this.c) + ", " + kpk.i(this.d) + ')';
    }
}
