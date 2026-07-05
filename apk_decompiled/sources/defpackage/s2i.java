package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class s2i {
    public static final y5f d = dgj.K(new r2i(0), new hzh(1));
    public float a;
    public final hsc b;
    public final hsc c;

    public s2i(float f, float f2, float f3) {
        this.a = f;
        this.b = new hsc(f3);
        this.c = new hsc(f2);
    }

    public final float a() {
        return this.a == MTTypesetterKt.kLineSkipLimitMultiplier ? MTTypesetterKt.kLineSkipLimitMultiplier : this.c.h() / this.a;
    }

    public final float b() {
        return this.c.h();
    }

    public final float c() {
        return this.a;
    }

    public final void d(float f) {
        this.c.i(wd6.d0(f, this.a, MTTypesetterKt.kLineSkipLimitMultiplier));
    }

    public final void e(float f) {
        this.a = f;
    }
}
