package defpackage;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class yg0 extends ContentFrameLayout {
    public final /* synthetic */ ah0 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg0(ah0 ah0Var, np4 np4Var) {
        super(np4Var);
        this.M = ah0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.M.j(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                ah0 ah0Var = this.M;
                ah0Var.i(ah0Var.p(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(xn5.c0(getContext(), i));
    }
}
