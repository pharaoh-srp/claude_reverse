package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class x94 implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public final long E = SystemClock.uptimeMillis() + 10000;
    public Runnable F;
    public boolean G;
    public final /* synthetic */ ba4 H;

    public x94(ba4 ba4Var) {
        this.H = ba4Var;
    }

    public final void a(View view) {
        if (this.G) {
            return;
        }
        this.G = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.F = runnable;
        View decorView = this.H.getWindow().getDecorView();
        decorView.getClass();
        if (!this.G) {
            decorView.postOnAnimation(new y0(3, this));
        } else if (x44.r(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        ba4 ba4Var = this.H;
        Runnable runnable = this.F;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.E) {
                this.G = false;
                ba4Var.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.F = null;
        xy7 xy7Var = (xy7) ba4Var.K.getValue();
        synchronized (xy7Var.c) {
            z = xy7Var.f;
        }
        if (z) {
            this.G = false;
            ba4Var.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.H.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
