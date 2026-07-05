package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class ob0 extends sb0 {
    public float a;

    public ob0(float f) {
        this.a = f;
    }

    @Override // defpackage.sb0
    public final float a(int i) {
        return i == 0 ? this.a : MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    @Override // defpackage.sb0
    public final int b() {
        return 1;
    }

    @Override // defpackage.sb0
    public final sb0 c() {
        return new ob0(MTTypesetterKt.kLineSkipLimitMultiplier);
    }

    @Override // defpackage.sb0
    public final void d() {
        this.a = MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    @Override // defpackage.sb0
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ob0) && ((ob0) obj).a == this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
