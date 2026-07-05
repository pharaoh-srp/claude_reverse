package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class sw7 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ tw7 F;

    public /* synthetic */ sw7(tw7 tw7Var, int i) {
        this.E = i;
        this.F = tw7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        tw7 tw7Var = this.F;
        switch (i) {
            case 0:
                ViewParent parent = tw7Var.H.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                tw7Var.a();
                View view = tw7Var.H;
                if (view.isEnabled() && !view.isLongClickable() && tw7Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    tw7Var.K = true;
                    break;
                }
                break;
        }
    }
}
