package io.sentry.android.core.internal.gestures;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import io.sentry.v;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final g a;
    public final int b;
    public final int c;
    public final int d;
    public boolean e;
    public boolean f;
    public float g;
    public float h;
    public float i;
    public float j;
    public MotionEvent k;
    public VelocityTracker l;
    public final io.sentry.util.a m = new io.sentry.util.a();

    public c(Context context, g gVar) {
        this.a = gVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.b = scaledTouchSlop * scaledTouchSlop;
        this.c = viewConfiguration.getScaledMinimumFlingVelocity();
        this.d = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    public final void a() {
        v vVarA = this.m.a();
        try {
            MotionEvent motionEvent = this.k;
            this.k = null;
            VelocityTracker velocityTracker = this.l;
            this.l = null;
            vVarA.close();
            if (motionEvent != null) {
                motionEvent.recycle();
            }
            if (velocityTracker != null) {
                velocityTracker.recycle();
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
}
