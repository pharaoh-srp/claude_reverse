package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class zef {
    public long a;
    public dsi b;
    public boolean c;
    public float d;
    public final ob0 e = new ob0(MTTypesetterKt.kLineSkipLimitMultiplier);
    public ob0 f;
    public long g;
    public long h;

    public final dsi a() {
        return this.b;
    }

    public final long b() {
        return this.h;
    }

    public final long c() {
        return this.g;
    }

    public final ob0 d() {
        return this.f;
    }

    public final long e() {
        return this.a;
    }

    public final ob0 f() {
        return this.e;
    }

    public final float g() {
        return this.d;
    }

    public final boolean h() {
        return this.c;
    }

    public final void i(gsi gsiVar) {
        this.b = gsiVar;
    }

    public final void j(long j) {
        this.h = j;
    }

    public final void k(boolean z) {
        this.c = z;
    }

    public final void l(long j) {
        this.g = j;
    }

    public final void m(ob0 ob0Var) {
        this.f = ob0Var;
    }

    public final void n(long j) {
        this.a = j;
    }

    public final void o(float f) {
        this.d = f;
    }

    public final String toString() {
        return "progress nanos: " + this.a + ", animationSpec: " + this.b + ", isComplete: " + this.c + ", value: " + this.d + ", start: " + this.e + ", initialVelocity: " + this.f + ", durationNanos: " + this.g + ", animationSpecDuration: " + this.h;
    }
}
