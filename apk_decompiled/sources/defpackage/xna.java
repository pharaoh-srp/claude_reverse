package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.Choreographer;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes2.dex */
public final class xna extends ValueAnimator implements Choreographer.FrameCallback {
    public bna P;
    public final CopyOnWriteArraySet E = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet F = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet G = new CopyOnWriteArraySet();
    public float H = 1.0f;
    public boolean I = false;
    public long J = 0;
    public float K = MTTypesetterKt.kLineSkipLimitMultiplier;
    public float L = MTTypesetterKt.kLineSkipLimitMultiplier;
    public int M = 0;
    public float N = -2.1474836E9f;
    public float O = 2.1474836E9f;
    public boolean Q = false;

    public final float a() {
        bna bnaVar = this.P;
        if (bnaVar == null) {
            return MTTypesetterKt.kLineSkipLimitMultiplier;
        }
        float f = this.L;
        float f2 = bnaVar.l;
        return (f - f2) / (bnaVar.m - f2);
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.F.add(animatorListener);
    }

    @Override // android.animation.Animator
    public final void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.G.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.E.add(animatorUpdateListener);
    }

    public final float b() {
        bna bnaVar = this.P;
        if (bnaVar == null) {
            return MTTypesetterKt.kLineSkipLimitMultiplier;
        }
        float f = this.O;
        return f == 2.1474836E9f ? bnaVar.m : f;
    }

    public final float c() {
        bna bnaVar = this.P;
        if (bnaVar == null) {
            return MTTypesetterKt.kLineSkipLimitMultiplier;
        }
        float f = this.N;
        return f == -2.1474836E9f ? bnaVar.l : f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        f(d());
        h(true);
    }

    public final boolean d() {
        return this.H < MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        boolean z = false;
        if (this.Q) {
            h(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        bna bnaVar = this.P;
        if (bnaVar == null || !this.Q) {
            return;
        }
        float fAbs = (this.J != 0 ? j - r2 : 0L) / ((1.0E9f / bnaVar.n) / Math.abs(this.H));
        float f = this.K;
        if (d()) {
            fAbs = -fAbs;
        }
        float f2 = f + fAbs;
        float fC = c();
        float fB = b();
        PointF pointF = vkb.a;
        if (f2 >= fC && f2 <= fB) {
            z = true;
        }
        float fB2 = vkb.b(f2, c(), b());
        this.K = fB2;
        this.L = fB2;
        this.J = j;
        if (z) {
            g();
        } else if (getRepeatCount() == -1 || this.M < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.I = !this.I;
                this.H = -this.H;
            } else {
                float fB3 = d() ? b() : c();
                this.K = fB3;
                this.L = fB3;
            }
            this.J = j;
            g();
            Iterator it = this.F.iterator();
            while (it.hasNext()) {
                ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
            }
            this.M++;
        } else {
            float fC2 = this.H < MTTypesetterKt.kLineSkipLimitMultiplier ? c() : b();
            this.K = fC2;
            this.L = fC2;
            h(true);
            g();
            f(d());
        }
        if (this.P == null) {
            return;
        }
        float f3 = this.L;
        float f4 = this.N;
        if (f3 < f4 || f3 > this.O) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(f4), Float.valueOf(this.O), Float.valueOf(this.L)));
        }
    }

    public final void f(boolean z) {
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationEnd(this, z);
        }
    }

    public final void g() {
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fC;
        float fB;
        float fC2;
        if (this.P == null) {
            return MTTypesetterKt.kLineSkipLimitMultiplier;
        }
        if (d()) {
            fC = b() - this.L;
            fB = b();
            fC2 = c();
        } else {
            fC = this.L - c();
            fB = b();
            fC2 = c();
        }
        return fC / (fB - fC2);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(a());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        bna bnaVar = this.P;
        if (bnaVar == null) {
            return 0L;
        }
        return (long) bnaVar.b();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public final void h(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.Q = false;
        }
    }

    public final void i(float f) {
        if (this.K == f) {
            return;
        }
        float fB = vkb.b(f, c(), b());
        this.K = fB;
        this.L = fB;
        this.J = 0L;
        g();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.Q;
    }

    public final void j(float f, float f2) {
        if (f > f2) {
            mr9.j("minFrame (", f, ") must be <= maxFrame (", f2, ")");
            return;
        }
        bna bnaVar = this.P;
        float f3 = bnaVar == null ? -3.4028235E38f : bnaVar.l;
        float f4 = bnaVar == null ? Float.MAX_VALUE : bnaVar.m;
        float fB = vkb.b(f, f3, f4);
        float fB2 = vkb.b(f2, f3, f4);
        if (fB == this.N && fB2 == this.O) {
            return;
        }
        this.N = fB;
        this.O = fB2;
        i((int) vkb.b(this.L, fB, fB2));
    }

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        this.F.clear();
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        this.E.clear();
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.F.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public final void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.G.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.E.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.I) {
            return;
        }
        this.I = false;
        this.H = -this.H;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ Animator setDuration(long j) {
        setDuration(j);
        throw null;
    }
}
