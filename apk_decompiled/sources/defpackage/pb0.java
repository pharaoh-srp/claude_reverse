package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class pb0 extends sb0 {
    public float a;
    public float b;

    public pb0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.sb0
    public final float a(int i) {
        return i != 0 ? i != 1 ? MTTypesetterKt.kLineSkipLimitMultiplier : this.b : this.a;
    }

    @Override // defpackage.sb0
    public final int b() {
        return 2;
    }

    @Override // defpackage.sb0
    public final sb0 c() {
        return new pb0(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
    }

    @Override // defpackage.sb0
    public final void d() {
        this.a = MTTypesetterKt.kLineSkipLimitMultiplier;
        this.b = MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    @Override // defpackage.sb0
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pb0)) {
            return false;
        }
        pb0 pb0Var = (pb0) obj;
        return pb0Var.a == this.a && pb0Var.b == this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
