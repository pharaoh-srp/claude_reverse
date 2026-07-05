package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class raa implements View.OnTouchListener {
    public static final int V = ViewConfiguration.getTapTimeout();
    public final e81 E;
    public final AccelerateInterpolator F;
    public final dh6 G;
    public k51 H;
    public final float[] I;
    public final float[] J;
    public final int K;
    public final int L;
    public final float[] M;
    public final float[] N;
    public final float[] O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public final dh6 U;

    public raa(dh6 dh6Var) {
        e81 e81Var = new e81();
        e81Var.e = Long.MIN_VALUE;
        e81Var.g = -1L;
        e81Var.f = 0L;
        this.E = e81Var;
        this.F = new AccelerateInterpolator();
        float[] fArr = {MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier};
        this.I = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.J = fArr2;
        float[] fArr3 = {MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier};
        this.M = fArr3;
        float[] fArr4 = {MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier};
        this.N = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.O = fArr5;
        this.G = dh6Var;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.K = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.L = V;
        e81Var.a = 500;
        e81Var.b = 500;
        this.U = dh6Var;
    }

    public static float b(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.I
            r0 = r0[r4]
            float[] r1 = r3.J
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.F
            if (r6 >= 0) goto L25
            float r5 = -r5
            float r5 = r0.getInterpolation(r5)
            float r5 = -r5
            goto L2d
        L25:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L36
            float r5 = r0.getInterpolation(r5)
        L2d:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L37
        L36:
            r5 = r2
        L37:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.M
            r0 = r0[r4]
            float[] r1 = r3.N
            r1 = r1[r4]
            float[] r3 = r3.O
            r3 = r3[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L51
            float r5 = r5 * r0
            float r3 = b(r5, r1, r3)
            return r3
        L51:
            float r4 = -r5
            float r4 = r4 * r0
            float r3 = b(r4, r1, r3)
            float r3 = -r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.raa.a(int, float, float, float):float");
    }

    public final float c(float f, float f2) {
        if (f2 != MTTypesetterKt.kLineSkipLimitMultiplier) {
            int i = this.K;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= MTTypesetterKt.kLineSkipLimitMultiplier) {
                        return 1.0f - (f / f2);
                    }
                    if (this.S && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < MTTypesetterKt.kLineSkipLimitMultiplier) {
                return f / (-f2);
            }
        }
        return MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    public final void d() {
        int i = 0;
        if (this.Q) {
            this.S = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        e81 e81Var = this.E;
        int i2 = (int) (jCurrentAnimationTimeMillis - e81Var.e);
        int i3 = e81Var.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        e81Var.i = i;
        e81Var.h = e81Var.a(jCurrentAnimationTimeMillis);
        e81Var.g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        dh6 dh6Var;
        int count;
        e81 e81Var = this.E;
        float f = e81Var.d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(e81Var.c);
        if (iAbs != 0 && (count = (dh6Var = this.U).getCount()) != 0) {
            int childCount = dh6Var.getChildCount();
            int firstVisiblePosition = dh6Var.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && dh6Var.getChildAt(0).getTop() >= 0)) : !(i >= count && dh6Var.getChildAt(childCount - 1).getBottom() <= dh6Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.T
            r1 = 0
            if (r0 != 0) goto L7
            goto L7c
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7c
        L17:
            r7.d()
            return r1
        L1b:
            r7.R = r2
            r7.P = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            dh6 r4 = r7.G
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r2, r9, r8, r3)
            e81 r9 = r7.E
            r9.c = r0
            r9.d = r8
            boolean r8 = r7.S
            if (r8 != 0) goto L7c
            boolean r8 = r7.e()
            if (r8 == 0) goto L7c
            k51 r8 = r7.H
            if (r8 != 0) goto L60
            k51 r8 = new k51
            r8.<init>(r2, r7)
            r7.H = r8
        L60:
            r7.S = r2
            r7.Q = r2
            boolean r8 = r7.P
            if (r8 != 0) goto L75
            int r8 = r7.L
            if (r8 <= 0) goto L75
            k51 r9 = r7.H
            long r5 = (long) r8
            java.util.WeakHashMap r8 = defpackage.mvi.a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7a
        L75:
            k51 r8 = r7.H
            r8.run()
        L7a:
            r7.P = r2
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.raa.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
