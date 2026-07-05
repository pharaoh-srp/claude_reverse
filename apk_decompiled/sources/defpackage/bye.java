package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class bye implements View.OnAttachStateChangeListener, ViewTreeObserver.OnDrawListener {
    public final bm7 E;
    public final Activity F;
    public final h99 G;
    public final h35 H;
    public final n78 I;
    public final Handler J;
    public boolean K;
    public boolean L;

    public bye(bm7 bm7Var, Activity activity, h99 h99Var, h35 h35Var, n78 n78Var, Handler handler) {
        h99Var.getClass();
        this.E = bm7Var;
        this.F = activity;
        this.G = h99Var;
        this.H = h35Var;
        this.I = n78Var;
        this.J = handler;
        View viewPeekDecorView = activity.getWindow().peekDecorView();
        if (viewPeekDecorView != null) {
            if (this.K) {
                return;
            }
            if (viewPeekDecorView.isAttachedToWindow()) {
                a(viewPeekDecorView);
                return;
            } else {
                viewPeekDecorView.addOnAttachStateChangeListener(this);
                return;
            }
        }
        WeakHashMap weakHashMap = (WeakHashMap) n78Var.F;
        Object obj = weakHashMap.get(activity);
        if (obj == null) {
            Window window = activity.getWindow();
            window.getClass();
            Window.Callback callback = window.getCallback();
            callback.getClass();
            eze ezeVar = new eze(callback);
            window.setCallback(ezeVar);
            weakHashMap.put(activity, ezeVar);
            obj = ezeVar;
        }
        tk5 tk5Var = ((eze) obj).G;
        tk5Var.getClass();
        ((CopyOnWriteArraySet) tk5Var.F).add(this);
    }

    public final void a(View view) {
        if (!this.K && view.getViewTreeObserver().isAlive()) {
            try {
                view.getViewTreeObserver().addOnDrawListener(this);
            } catch (IllegalStateException e) {
                dch.H(this.G, 4, g99.G, uxe.N, e, false, 48);
            }
        }
    }

    public final void b(View view) {
        if (view.getViewTreeObserver().isAlive()) {
            try {
                view.getViewTreeObserver().removeOnDrawListener(this);
            } catch (IllegalStateException e) {
                dch.H(this.G, 4, g99.G, uxe.O, e, false, 48);
            }
        }
    }

    public final void c() {
        if (this.K) {
            return;
        }
        this.K = true;
        n78 n78Var = this.I;
        Activity activity = this.F;
        n78Var.R(activity, this);
        View viewPeekDecorView = activity.getWindow().peekDecorView();
        if (viewPeekDecorView != null) {
            viewPeekDecorView.removeOnAttachStateChangeListener(this);
            b(viewPeekDecorView);
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.L) {
            return;
        }
        this.L = true;
        y0 y0Var = new y0(9, this);
        Handler handler = this.J;
        Message messageObtain = Message.obtain(handler, y0Var);
        messageObtain.setAsynchronous(true);
        handler.sendMessageAtFrontOfQueue(messageObtain);
        View decorView = this.F.getWindow().getDecorView();
        decorView.getClass();
        handler.post(new j01(this, 14, decorView));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        View decorView = this.F.getWindow().getDecorView();
        decorView.getClass();
        a(decorView);
        decorView.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
    }
}
