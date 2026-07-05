package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class qb0 extends sb0 {
    public float a;
    public float b;
    public float c;

    public qb0(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // defpackage.sb0
    public final float a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? MTTypesetterKt.kLineSkipLimitMultiplier : this.c : this.b : this.a;
    }

    @Override // defpackage.sb0
    public final int b() {
        return 3;
    }

    @Override // defpackage.sb0
    public final sb0 c() {
        return new qb0(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
    }

    @Override // defpackage.sb0
    public final void d() {
        this.a = MTTypesetterKt.kLineSkipLimitMultiplier;
        this.b = MTTypesetterKt.kLineSkipLimitMultiplier;
        this.c = MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    @Override // defpackage.sb0
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        } else if (i == 1) {
            this.b = f;
        } else {
            if (i != 2) {
                return;
            }
            this.c = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qb0)) {
            return false;
        }
        qb0 qb0Var = (qb0) obj;
        return qb0Var.a == this.a && qb0Var.b == this.b && qb0Var.c == this.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + vb7.b(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.a + ", v2 = " + this.b + ", v3 = " + this.c;
    }
}
