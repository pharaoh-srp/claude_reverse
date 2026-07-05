package defpackage;

import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tw7 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float E;
    public final int F;
    public final int G;
    public final View H;
    public sw7 I;
    public sw7 J;
    public boolean K;
    public int L;
    public final int[] M = new int[2];

    public tw7(View view) {
        this.H = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.E = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.F = tapTimeout;
        this.G = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        sw7 sw7Var = this.J;
        View view = this.H;
        if (sw7Var != null) {
            view.removeCallbacks(sw7Var);
        }
        sw7 sw7Var2 = this.I;
        if (sw7Var2 != null) {
            view.removeCallbacks(sw7Var2);
        }
    }

    public abstract l5g b();

    public abstract boolean c();

    public boolean d() {
        l5g l5gVarB = b();
        if (l5gVarB == null || !l5gVarB.b()) {
            return true;
        }
        l5gVarB.dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fe  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tw7.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.K = false;
        this.L = -1;
        sw7 sw7Var = this.I;
        if (sw7Var != null) {
            this.H.removeCallbacks(sw7Var);
        }
    }
}
