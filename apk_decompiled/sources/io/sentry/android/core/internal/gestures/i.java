package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.Window;
import com.agog.mathdisplay.render.MTTypesetterKt;
import io.sentry.t5;
import io.sentry.v;
import io.sentry.w6;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class i extends k {
    public final Window.Callback F;
    public final g G;
    public final c H;
    public final w6 I;
    public final h J;
    public volatile boolean K;

    public i(Window.Callback callback, Activity activity, g gVar, w6 w6Var) {
        c cVar = new c(activity, gVar);
        h hVar = new h();
        super(callback);
        this.F = callback;
        this.G = gVar;
        this.I = w6Var;
        this.H = cVar;
        this.J = hVar;
    }

    public final void a(MotionEvent motionEvent) {
        if (this.K) {
            return;
        }
        c cVar = this.H;
        int i = cVar.c;
        g gVar = cVar.a;
        v vVarA = cVar.m.a();
        try {
            int actionMasked = motionEvent.getActionMasked();
            if (cVar.l == null) {
                cVar.l = VelocityTracker.obtain();
            }
            cVar.l.addMovement(motionEvent);
            if (actionMasked == 0) {
                cVar.g = motionEvent.getX();
                float y = motionEvent.getY();
                cVar.h = y;
                cVar.i = cVar.g;
                cVar.j = y;
                cVar.e = true;
                cVar.f = false;
                MotionEvent motionEvent2 = cVar.k;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                cVar.k = MotionEvent.obtain(motionEvent);
                gVar.onDown(motionEvent);
            } else if (actionMasked != 1) {
                if (actionMasked == 2) {
                    float x = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    float f = x - cVar.g;
                    float f2 = y2 - cVar.h;
                    if ((f2 * f2) + (f * f) > cVar.b) {
                        gVar.onScroll(cVar.k, motionEvent, cVar.i - x, cVar.j - y2);
                        cVar.e = false;
                        cVar.i = x;
                        cVar.j = y2;
                    }
                } else if (actionMasked == 3) {
                    cVar.a();
                } else if (actionMasked == 5) {
                    cVar.e = false;
                    cVar.f = true;
                }
            } else if (cVar.f) {
                cVar.a();
            } else {
                if (cVar.e) {
                    gVar.onSingleTapUp(motionEvent);
                } else {
                    int pointerId = motionEvent.getPointerId(0);
                    cVar.l.computeCurrentVelocity(1000, cVar.d);
                    float xVelocity = cVar.l.getXVelocity(pointerId);
                    float yVelocity = cVar.l.getYVelocity(pointerId);
                    float f3 = i;
                    if (Math.abs(xVelocity) > f3 || Math.abs(yVelocity) > f3) {
                        gVar.onFling(cVar.k, motionEvent, xVelocity, yVelocity);
                    }
                }
                cVar.a();
            }
            vVarA.close();
            if (motionEvent.getActionMasked() == 1) {
                g gVar2 = this.G;
                View viewB = gVar2.b("onUp");
                f fVar = gVar2.g;
                io.sentry.internal.gestures.c cVar2 = fVar.b;
                if (viewB == null || cVar2 == null) {
                    return;
                }
                e eVar = fVar.a;
                e eVar2 = e.Unknown;
                if (eVar == eVar2) {
                    gVar2.c.getLogger().h(t5.DEBUG, "Unable to define scroll type. No breadcrumb captured.", new Object[0]);
                    return;
                }
                float x2 = motionEvent.getX() - fVar.c;
                float y3 = motionEvent.getY() - fVar.d;
                gVar2.a(cVar2, fVar.a, Collections.singletonMap("direction", Math.abs(x2) > Math.abs(y3) ? x2 > MTTypesetterKt.kLineSkipLimitMultiplier ? "right" : "left" : y3 > MTTypesetterKt.kLineSkipLimitMultiplier ? "down" : "up"), motionEvent);
                gVar2.c(cVar2, fVar.a);
                fVar.b = null;
                fVar.a = eVar2;
                fVar.c = MTTypesetterKt.kLineSkipLimitMultiplier;
                fVar.d = MTTypesetterKt.kLineSkipLimitMultiplier;
            }
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.android.core.internal.gestures.k, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        w6 w6Var;
        if (motionEvent != null) {
            this.J.getClass();
            try {
                a(MotionEvent.obtain(motionEvent));
            } finally {
                if (w6Var != null) {
                    try {
                    } finally {
                    }
                }
            }
        }
        return this.E.dispatchTouchEvent(motionEvent);
    }
}
