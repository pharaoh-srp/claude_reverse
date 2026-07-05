package io.sentry.android.replay;

import android.graphics.Point;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import defpackage.b54;
import defpackage.csg;
import defpackage.w44;
import defpackage.x44;
import io.sentry.t5;
import io.sentry.w6;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements g, Closeable {
    public final w6 E;
    public final ReplayIntegration F;
    public final ReplayIntegration G;
    public final io.sentry.d H;
    public final ScheduledExecutorService I;
    public final AtomicBoolean J;
    public final ArrayList K;
    public final Point L;
    public final WeakHashMap M;
    public final io.sentry.util.a N;
    public final io.sentry.util.a O;
    public final io.sentry.util.a P;
    public volatile e0 Q;
    public volatile HandlerThread R;
    public volatile Handler S;

    public h0(w6 w6Var, ReplayIntegration replayIntegration, ReplayIntegration replayIntegration2, io.sentry.d dVar, io.sentry.android.replay.util.d dVar2) {
        dVar.getClass();
        dVar2.getClass();
        this.E = w6Var;
        this.F = replayIntegration;
        this.G = replayIntegration2;
        this.H = dVar;
        this.I = dVar2;
        this.J = new AtomicBoolean(false);
        this.K = new ArrayList();
        this.L = new Point();
        this.M = new WeakHashMap();
        this.N = new io.sentry.util.a();
        this.O = new io.sentry.util.a();
        this.P = new io.sentry.util.a();
    }

    @Override // io.sentry.android.replay.g
    public final void c(View view, boolean z) throws Exception {
        x xVar;
        x xVar2;
        x xVar3;
        view.getClass();
        io.sentry.v vVarA = this.N.a();
        int i = 0;
        try {
            if (!z) {
                View.OnLayoutChangeListener onLayoutChangeListener = (View.OnLayoutChangeListener) this.M.remove(view);
                if (onLayoutChangeListener != null) {
                    view.removeOnLayoutChangeListener(onLayoutChangeListener);
                }
                e0 e0Var = this.Q;
                if (e0Var != null && (xVar2 = e0Var.G) != null) {
                    xVar2.c(view);
                }
                b54.w0(new g0(view, i), this.K);
                WeakReference weakReference = (WeakReference) w44.V0(this.K);
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && !view.equals(view2)) {
                    e0 e0Var2 = this.Q;
                    if (e0Var2 != null && (xVar = e0Var2.G) != null) {
                        xVar.a(view2);
                    }
                    d(view2);
                    WeakHashMap weakHashMap = this.M;
                    if (!weakHashMap.containsKey(view2)) {
                        View.OnLayoutChangeListener onLayoutChangeListener2 = new View.OnLayoutChangeListener() { // from class: io.sentry.android.replay.d0
                            @Override // android.view.View.OnLayoutChangeListener
                            public final void onLayoutChange(View view3, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                                int i10 = i5 - i3;
                                int i11 = i9 - i7;
                                if (i4 - i2 == i8 - i6 && i10 == i11) {
                                    return;
                                }
                                h0 h0Var = this.a;
                                WeakReference weakReference2 = (WeakReference) w44.V0(h0Var.K);
                                if (x44.r(view3, weakReference2 != null ? (View) weakReference2.get() : null)) {
                                    view3.getClass();
                                    h0Var.d(view3);
                                }
                            }
                        };
                        weakHashMap.put(view2, onLayoutChangeListener2);
                        view2.addOnLayoutChangeListener(onLayoutChangeListener2);
                    }
                }
            } else {
                if (io.sentry.config.a.s(view) == null) {
                    this.E.getLogger().h(t5.WARNING, "Root view does not have a phone window, skipping.", new Object[0]);
                    csg.o(vVarA, null);
                    return;
                }
                this.K.add(new WeakReference(view));
                e0 e0Var3 = this.Q;
                if (e0Var3 != null && (xVar3 = e0Var3.G) != null) {
                    xVar3.a(view);
                }
                d(view);
                WeakHashMap weakHashMap2 = this.M;
                if (!weakHashMap2.containsKey(view)) {
                    View.OnLayoutChangeListener onLayoutChangeListener3 = new View.OnLayoutChangeListener() { // from class: io.sentry.android.replay.d0
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view3, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                            int i10 = i5 - i3;
                            int i11 = i9 - i7;
                            if (i4 - i2 == i8 - i6 && i10 == i11) {
                                return;
                            }
                            h0 h0Var = this.a;
                            WeakReference weakReference2 = (WeakReference) w44.V0(h0Var.K);
                            if (x44.r(view3, weakReference2 != null ? (View) weakReference2.get() : null)) {
                                view3.getClass();
                                h0Var.d(view3);
                            }
                        }
                    };
                    weakHashMap2.put(view, onLayoutChangeListener3);
                    view.addOnLayoutChangeListener(onLayoutChangeListener3);
                }
            }
            csg.o(vVarA, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                csg.o(vVarA, th);
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Exception {
        reset();
        io.sentry.d dVar = this.H;
        e0 e0Var = this.Q;
        Handler handler = (Handler) dVar.E;
        if (e0Var != null) {
            handler.removeCallbacks(e0Var);
        }
        io.sentry.v vVarA = this.P.a();
        try {
            Handler handler2 = this.S;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
            }
            HandlerThread handlerThread = this.R;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            csg.o(vVarA, null);
            x();
        } finally {
        }
    }

    public final void d(View view) {
        view.getClass();
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            f0 f0Var = new f0(this, view);
            if (view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
                return;
            }
            try {
                view.getViewTreeObserver().addOnPreDrawListener(f0Var);
                return;
            } catch (IllegalStateException unused) {
                return;
            }
        }
        int width = view.getWidth();
        Point point = this.L;
        if (width == point.x && view.getHeight() == point.y) {
            return;
        }
        point.set(view.getWidth(), view.getHeight());
        this.G.b0(view.getWidth(), view.getHeight());
    }

    public final Handler e() throws Exception {
        if (this.S == null) {
            io.sentry.v vVarA = this.P.a();
            try {
                if (this.S == null) {
                    this.R = new HandlerThread("SentryReplayBackgroundProcessing");
                    HandlerThread handlerThread = this.R;
                    if (handlerThread != null) {
                        handlerThread.start();
                    }
                    HandlerThread handlerThread2 = this.R;
                    handlerThread2.getClass();
                    this.S = new Handler(handlerThread2.getLooper());
                }
                csg.o(vVarA, null);
            } finally {
            }
        }
        Handler handler = this.S;
        handler.getClass();
        return handler;
    }

    public final void f(y yVar) {
        e0 e0Var;
        x xVar;
        if (this.J.get()) {
            if (this.Q == null) {
                io.sentry.v vVarA = this.O.a();
                try {
                    if (this.Q == null) {
                        this.Q = new e0(this.E, this.H);
                    }
                    csg.o(vVarA, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        csg.o(vVarA, th);
                        throw th2;
                    }
                }
            }
            e0 e0Var2 = this.Q;
            if (e0Var2 != null) {
                e0Var2.H = yVar;
            }
            e0 e0Var3 = this.Q;
            if (e0Var3 != null) {
                e0Var3.G = new x(this.E, this.F, yVar, this);
            }
            WeakReference weakReference = (WeakReference) w44.V0(this.K);
            View view = weakReference != null ? (View) weakReference.get() : null;
            if (view != null && (e0Var = this.Q) != null && (xVar = e0Var.G) != null) {
                xVar.a(view);
            }
            io.sentry.d dVar = this.H;
            e0 e0Var4 = this.Q;
            Handler handler = (Handler) dVar.E;
            if (e0Var4 != null) {
                handler.removeCallbacks(e0Var4);
            }
            io.sentry.d dVar2 = this.H;
            e0 e0Var5 = this.Q;
            if (e0Var5 == null ? false : ((Handler) dVar2.E).postDelayed(e0Var5, 100L)) {
                return;
            }
            this.E.getLogger().h(t5.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
        }
    }

    public final void i() {
        e0 e0Var = this.Q;
        if (e0Var != null) {
            x xVar = e0Var.G;
            if (xVar != null) {
                xVar.G.set(false);
                WeakReference weakReference = xVar.F;
                xVar.c(weakReference != null ? (View) weakReference.get() : null);
            }
            e0Var.I.getAndSet(false);
        }
    }

    public final void j() {
        View view;
        e0 e0Var = this.Q;
        if (e0Var != null) {
            io.sentry.d dVar = e0Var.F;
            w6 w6Var = e0Var.E;
            if (w6Var.getSessionReplay().m) {
                w6Var.getLogger().h(t5.DEBUG, "Resuming the capture runnable.", new Object[0]);
            }
            x xVar = e0Var.G;
            if (xVar != null) {
                WeakReference weakReference = xVar.F;
                if (weakReference != null && (view = (View) weakReference.get()) != null && view.getViewTreeObserver() != null && view.getViewTreeObserver().isAlive()) {
                    try {
                        view.getViewTreeObserver().addOnDrawListener(xVar);
                    } catch (IllegalStateException unused) {
                    }
                }
                xVar.G.set(true);
            }
            e0Var.I.getAndSet(true);
            ((Handler) dVar.E).removeCallbacks(e0Var);
            if (((Handler) dVar.E).post(e0Var)) {
                return;
            }
            w6Var.getLogger().h(t5.WARNING, "Failed to post the capture runnable, main looper is not ready.", new Object[0]);
        }
    }

    public final void n() {
        this.J.getAndSet(true);
    }

    public final void reset() throws Exception {
        x xVar;
        this.L.set(0, 0);
        io.sentry.v vVarA = this.N.a();
        try {
            Iterator it = this.K.iterator();
            while (it.hasNext()) {
                View view = (View) ((WeakReference) it.next()).get();
                if (view != null) {
                    View.OnLayoutChangeListener onLayoutChangeListener = (View.OnLayoutChangeListener) this.M.remove(view);
                    if (onLayoutChangeListener != null) {
                        view.removeOnLayoutChangeListener(onLayoutChangeListener);
                    }
                    e0 e0Var = this.Q;
                    if (e0Var != null && (xVar = e0Var.G) != null) {
                        xVar.c(view);
                    }
                }
            }
            this.K.clear();
            csg.o(vVarA, null);
        } finally {
        }
    }

    public final void x() throws Exception {
        e0 e0Var = this.Q;
        if (e0Var != null) {
            x xVar = e0Var.G;
            if (xVar != null) {
                xVar.G.set(false);
                WeakReference weakReference = xVar.F;
                xVar.c(weakReference != null ? (View) weakReference.get() : null);
                WeakReference weakReference2 = xVar.F;
                if (weakReference2 != null) {
                    weakReference2.clear();
                }
                xVar.I.close();
            }
            e0Var.G = null;
            e0Var.I.getAndSet(false);
        }
        io.sentry.v vVarA = this.O.a();
        try {
            this.Q = null;
            csg.o(vVarA, null);
            this.J.set(false);
        } finally {
        }
    }
}
