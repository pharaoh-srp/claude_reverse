package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.agog.mathdisplay.render.MTTypesetterKt;
import defpackage.ij0;
import defpackage.jke;
import defpackage.u95;
import io.sentry.a1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.b2;
import io.sentry.h1;
import io.sentry.n0;
import io.sentry.n4;
import io.sentry.n7;
import io.sentry.p;
import io.sentry.protocol.h0;
import io.sentry.r1;
import io.sentry.s7;
import io.sentry.t5;
import io.sentry.t7;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g implements GestureDetector.OnGestureListener {
    public final WeakReference a;
    public final h1 b;
    public final SentryAndroidOptions c;
    public io.sentry.internal.gestures.c d = null;
    public r1 e = null;
    public e f;
    public final f g;

    public g(Activity activity, n4 n4Var, SentryAndroidOptions sentryAndroidOptions) {
        e eVar = e.Unknown;
        this.f = eVar;
        f fVar = new f();
        fVar.a = eVar;
        fVar.c = MTTypesetterKt.kLineSkipLimitMultiplier;
        fVar.d = MTTypesetterKt.kLineSkipLimitMultiplier;
        this.g = fVar;
        this.a = new WeakReference(activity);
        this.b = n4Var;
        this.c = sentryAndroidOptions;
    }

    public final void a(io.sentry.internal.gestures.c cVar, e eVar, Map map, MotionEvent motionEvent) {
        if (this.c.isEnableUserInteractionBreadcrumbs()) {
            int i = d.a[eVar.ordinal()];
            String str = i != 1 ? i != 2 ? i != 3 ? "unknown" : "swipe" : "scroll" : "click";
            n0 n0Var = new n0();
            n0Var.d("android:motionEvent", motionEvent);
            n0Var.d("android:view", cVar.a.get());
            String str2 = cVar.c;
            String str3 = cVar.b;
            String str4 = cVar.d;
            io.sentry.g gVar = new io.sentry.g();
            gVar.I = "user";
            gVar.K = "ui.".concat(str);
            if (str2 != null) {
                gVar.c("view.id", str2);
            }
            if (str3 != null) {
                gVar.c("view.class", str3);
            }
            if (str4 != null) {
                gVar.c("view.tag", str4);
            }
            for (Map.Entry entry : map.entrySet()) {
                gVar.J.put((String) entry.getKey(), entry.getValue());
            }
            gVar.M = t5.INFO;
            this.b.j(gVar, n0Var);
        }
    }

    public final View b(String str) {
        Activity activity = (Activity) this.a.get();
        SentryAndroidOptions sentryAndroidOptions = this.c;
        if (activity == null) {
            sentryAndroidOptions.getLogger().h(t5.DEBUG, ij0.j("Activity is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            sentryAndroidOptions.getLogger().h(t5.DEBUG, ij0.j("Window is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView != null) {
            return viewPeekDecorView;
        }
        sentryAndroidOptions.getLogger().h(t5.DEBUG, ij0.j("DecorView is null in ", str, ". No breadcrumb captured."), new Object[0]);
        return null;
    }

    public final void c(io.sentry.internal.gestures.c cVar, e eVar) {
        boolean z = eVar == e.Click || !(eVar == this.f && cVar.equals(this.d));
        SentryAndroidOptions sentryAndroidOptions = this.c;
        boolean zIsTracingEnabled = sentryAndroidOptions.isTracingEnabled();
        h1 h1Var = this.b;
        if (!zIsTracingEnabled || !sentryAndroidOptions.isEnableUserInteractionTracing()) {
            if (z) {
                if (sentryAndroidOptions.isEnableAutoTraceIdGeneration()) {
                    h1Var.w(new b2(13));
                }
                this.d = cVar;
                this.f = eVar;
                return;
            }
            return;
        }
        Activity activity = (Activity) this.a.get();
        if (activity == null) {
            sentryAndroidOptions.getLogger().h(t5.DEBUG, "Activity is null, no transaction captured.", new Object[0]);
            return;
        }
        String str = cVar.c;
        if (str == null) {
            str = cVar.d;
            p.v("UiElement.tag can't be null", str);
        }
        r1 r1Var = this.e;
        if (r1Var != null) {
            if (!z && !r1Var.h()) {
                sentryAndroidOptions.getLogger().h(t5.DEBUG, ij0.j("The view with id: ", str, " already has an ongoing transaction assigned. Rescheduling finish"), new Object[0]);
                if (sentryAndroidOptions.getIdleTimeout() != null) {
                    this.e.w();
                    return;
                }
                return;
            }
            d(n7.OK);
        }
        String str2 = activity.getClass().getSimpleName() + "." + str;
        int i = d.a[eVar.ordinal()];
        String strConcat = "ui.action.".concat(i != 1 ? i != 2 ? i != 3 ? "unknown" : "swipe" : "scroll" : "click");
        t7 t7Var = new t7();
        t7Var.h = true;
        long deadlineTimeout = sentryAndroidOptions.getDeadlineTimeout();
        t7Var.j = deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout);
        t7Var.i = sentryAndroidOptions.getIdleTimeout();
        t7Var.b = true;
        t7Var.f = "auto.ui.gesture_listener." + cVar.e;
        r1 r1VarT = h1Var.t(new s7(str2, h0.COMPONENT, strConcat, null), t7Var);
        h1Var.w(new u95(this, 27, r1VarT));
        this.e = r1VarT;
        this.d = cVar;
        this.f = eVar;
    }

    public final void d(n7 n7Var) {
        r1 r1Var = this.e;
        if (r1Var != null) {
            n7 n7VarE = r1Var.e();
            r1 r1Var2 = this.e;
            if (n7VarE == null) {
                r1Var2.m(n7Var);
            } else {
                r1Var2.p();
            }
        }
        this.b.w(new jke(18, this));
        this.e = null;
        if (this.d != null) {
            this.d = null;
        }
        this.f = e.Unknown;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        f fVar = this.g;
        fVar.b = null;
        fVar.a = e.Unknown;
        fVar.c = MTTypesetterKt.kLineSkipLimitMultiplier;
        fVar.d = MTTypesetterKt.kLineSkipLimitMultiplier;
        fVar.c = motionEvent.getX();
        fVar.d = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.g.a = e.Swipe;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        View viewB = b("onScroll");
        if (viewB != null && motionEvent != null) {
            f fVar = this.g;
            if (fVar.a == e.Unknown) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                io.sentry.internal.gestures.b bVar = io.sentry.internal.gestures.b.SCROLLABLE;
                SentryAndroidOptions sentryAndroidOptions = this.c;
                io.sentry.internal.gestures.c cVarA = j.a(sentryAndroidOptions, viewB, x, y, bVar);
                if (cVarA == null) {
                    sentryAndroidOptions.getLogger().h(t5.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
                    fVar.a = e.Scroll;
                    return false;
                }
                a1 logger = sentryAndroidOptions.getLogger();
                t5 t5Var = t5.DEBUG;
                String str = cVarA.c;
                if (str == null) {
                    str = cVarA.d;
                    p.v("UiElement.tag can't be null", str);
                }
                logger.h(t5Var, "Scroll target found: ".concat(str), new Object[0]);
                fVar.b = cVarA;
                fVar.a = e.Scroll;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        View viewB = b("onSingleTapUp");
        if (viewB != null && motionEvent != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            io.sentry.internal.gestures.b bVar = io.sentry.internal.gestures.b.CLICKABLE;
            SentryAndroidOptions sentryAndroidOptions = this.c;
            io.sentry.internal.gestures.c cVarA = j.a(sentryAndroidOptions, viewB, x, y, bVar);
            if (cVarA == null) {
                sentryAndroidOptions.getLogger().h(t5.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            e eVar = e.Click;
            a(cVarA, eVar, Collections.EMPTY_MAP, motionEvent);
            c(cVarA, eVar);
        }
        return false;
    }
}
