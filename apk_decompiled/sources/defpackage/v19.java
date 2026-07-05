package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class v19 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ w19 a;

    public v19(w19 w19Var) {
        this.a = w19Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        w19 w19Var = this.a;
        a00 a00Var = (a00) w19Var.c;
        if (!w19Var.a) {
            int i = w19Var.b;
            if (i == 1) {
                if (Math.abs(f) > Math.abs(f2)) {
                    ((ts7) a00Var.G.getFocusOwner()).i(f > MTTypesetterKt.kLineSkipLimitMultiplier ? 1 : 2, false);
                    return true;
                }
            } else if (i == 2 && Math.abs(f2) > Math.abs(f)) {
                ((ts7) a00Var.G.getFocusOwner()).i(f2 > MTTypesetterKt.kLineSkipLimitMultiplier ? 1 : 2, false);
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }
}
