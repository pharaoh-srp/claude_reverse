package io.sentry.android.replay;

import android.view.View;
import android.view.ViewTreeObserver;
import defpackage.k2c;
import defpackage.wg6;
import io.sentry.t5;
import io.sentry.w6;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements ViewTreeObserver.OnDrawListener {
    public final w6 E;
    public WeakReference F;
    public final AtomicBoolean G = new AtomicBoolean(true);
    public final AtomicBoolean H;
    public final io.sentry.android.replay.screenshot.i I;

    public x(w6 w6Var, ReplayIntegration replayIntegration, y yVar, h0 h0Var) {
        io.sentry.android.replay.screenshot.i cVar;
        this.E = w6Var;
        io.sentry.android.replay.util.a aVar = new io.sentry.android.replay.util.a();
        this.H = new AtomicBoolean(false);
        int i = w.a[w6Var.getSessionReplay().n.ordinal()];
        if (i == 1) {
            cVar = new io.sentry.android.replay.screenshot.c(w6Var, replayIntegration, yVar, h0Var);
        } else {
            if (i != 2) {
                wg6.i();
                throw null;
            }
            cVar = new io.sentry.android.replay.screenshot.h(h0Var, replayIntegration, w6Var, yVar, aVar, new k2c(13, this));
        }
        this.I = cVar;
    }

    public final void a(View view) {
        view.getClass();
        WeakReference weakReference = this.F;
        c(weakReference != null ? (View) weakReference.get() : null);
        WeakReference weakReference2 = this.F;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.F = new WeakReference(view);
        if (view.getViewTreeObserver() != null && view.getViewTreeObserver().isAlive()) {
            try {
                view.getViewTreeObserver().addOnDrawListener(this);
            } catch (IllegalStateException unused) {
            }
        }
        this.H.set(true);
        this.I.onContentChanged();
    }

    public final void b() {
        w6 w6Var = this.E;
        boolean z = w6Var.getSessionReplay().m;
        AtomicBoolean atomicBoolean = this.G;
        if (z) {
            w6Var.getLogger().h(t5.DEBUG, "Capturing screenshot, isCapturing: %s", Boolean.valueOf(atomicBoolean.get()));
        }
        if (!atomicBoolean.get()) {
            if (w6Var.getSessionReplay().m) {
                w6Var.getLogger().h(t5.DEBUG, "ScreenshotRecorder is paused, not capturing screenshot", new Object[0]);
                return;
            }
            return;
        }
        boolean z2 = w6Var.getSessionReplay().m;
        io.sentry.android.replay.screenshot.i iVar = this.I;
        AtomicBoolean atomicBoolean2 = this.H;
        if (z2) {
            w6Var.getLogger().h(t5.DEBUG, "Capturing screenshot, contentChanged: %s, lastCaptureSuccessful: %s", Boolean.valueOf(atomicBoolean2.get()), Boolean.valueOf(iVar.a()));
        }
        if (!atomicBoolean2.get()) {
            iVar.c();
            return;
        }
        WeakReference weakReference = this.F;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
            w6Var.getLogger().h(t5.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        if (io.sentry.config.a.s(view) == null) {
            w6Var.getLogger().h(t5.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        try {
            atomicBoolean2.set(false);
            iVar.b(view);
        } catch (Throwable th) {
            w6Var.getLogger().d(t5.WARNING, "Failed to capture replay recording", th);
        }
    }

    public final void c(View view) {
        this.E.getReplayController().getClass();
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().removeOnDrawListener(this);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.G.get()) {
            WeakReference weakReference = this.F;
            View view = weakReference != null ? (View) weakReference.get() : null;
            if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
                this.E.getLogger().h(t5.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            } else {
                this.H.set(true);
                this.I.onContentChanged();
            }
        }
    }
}
