package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class rb0 extends sb0 {
    public float a;
    public float b;
    public float c;
    public float d;

    public rb0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.sb0
    public final float a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? MTTypesetterKt.kLineSkipLimitMultiplier : this.d : this.c : this.b : this.a;
    }

    @Override // defpackage.sb0
    public final int b() {
        return 4;
    }

    @Override // defpackage.sb0
    public final sb0 c() {
        return new rb0(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
    }

    @Override // defpackage.sb0
    public final void d() {
        this.a = MTTypesetterKt.kLineSkipLimitMultiplier;
        this.b = MTTypesetterKt.kLineSkipLimitMultiplier;
        this.c = MTTypesetterKt.kLineSkipLimitMultiplier;
        this.d = MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    @Override // defpackage.sb0
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
            return;
        }
        if (i == 1) {
            this.b = f;
        } else if (i == 2) {
            this.c = f;
        } else {
            if (i != 3) {
                return;
            }
            this.d = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rb0)) {
            return false;
        }
        rb0 rb0Var = (rb0) obj;
        return rb0Var.a == this.a && rb0Var.b == this.b && rb0Var.c == this.c && rb0Var.d == this.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + vb7.b(this.c, vb7.b(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.a + ", v2 = " + this.b + ", v3 = " + this.c + ", v4 = " + this.d;
    }
}
