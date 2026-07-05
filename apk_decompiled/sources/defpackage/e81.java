package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class e81 {
    public int a;
    public int b;
    public float c;
    public float d;
    public long e;
    public long f;
    public long g;
    public float h;
    public int i;

    public final float a(long j) {
        if (j < this.e) {
            return MTTypesetterKt.kLineSkipLimitMultiplier;
        }
        long j2 = this.g;
        if (j2 < 0 || j < j2) {
            return raa.b((j - r0) / this.a, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f) * 0.5f;
        }
        float f = this.h;
        return (raa.b((j - j2) / this.i, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f) * f) + (1.0f - f);
    }
}
