package io.sentry.android.core;

import android.content.Context;
import android.content.IntentFilter;
import android.os.HandlerThread;
import defpackage.pya;
import io.sentry.n4;
import io.sentry.t5;
import io.sentry.w6;
import java.io.Closeable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class SystemEventsBreadcrumbsIntegration implements io.sentry.x1, Closeable, c0 {
    public final Context E;
    public volatile z1 F;
    public SentryAndroidOptions G;
    public n4 H;
    public final String[] I;
    public volatile boolean J = false;
    public volatile boolean K = false;
    public volatile IntentFilter L = null;
    public volatile HandlerThread M = null;
    public final AtomicBoolean N = new AtomicBoolean(false);
    public final io.sentry.util.a O = new io.sentry.util.a();
    public y1 P;

    public SystemEventsBreadcrumbsIntegration(Context context) {
        String[] strArr = {"android.intent.action.ACTION_SHUTDOWN", "android.intent.action.AIRPLANE_MODE", "android.intent.action.BATTERY_CHANGED", "android.intent.action.CAMERA_BUTTON", "android.intent.action.CONFIGURATION_CHANGED", "android.intent.action.DATE_CHANGED", "android.intent.action.DEVICE_STORAGE_LOW", "android.intent.action.DEVICE_STORAGE_OK", "android.intent.action.DOCK_EVENT", "android.intent.action.DREAMING_STARTED", "android.intent.action.DREAMING_STOPPED", "android.intent.action.INPUT_METHOD_CHANGED", "android.intent.action.LOCALE_CHANGED", "android.intent.action.SCREEN_OFF", "android.intent.action.SCREEN_ON", "android.intent.action.TIMEZONE_CHANGED", "android.intent.action.TIME_SET", "android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.POWER_SAVE_MODE_CHANGED"};
        Context applicationContext = context.getApplicationContext();
        this.E = applicationContext == null ? context : applicationContext;
        this.I = strArr;
    }

    @Override // io.sentry.x1
    public final void H(w6 w6Var) {
        SentryAndroidOptions sentryAndroidOptions = w6Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) w6Var : null;
        io.sentry.p.v("SentryAndroidOptions is required", sentryAndroidOptions);
        this.G = sentryAndroidOptions;
        this.H = n4.a;
        sentryAndroidOptions.getLogger().h(t5.DEBUG, "SystemEventsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.G.isEnableSystemEventBreadcrumbs()));
        if (this.G.isEnableSystemEventBreadcrumbs()) {
            f0.I.c(this);
            if (p0.f()) {
                c(this.H, this.G);
            }
        }
    }

    public final void c(n4 n4Var, SentryAndroidOptions sentryAndroidOptions) {
        if (sentryAndroidOptions.isEnableSystemEventBreadcrumbs() && !this.J && !this.K && this.F == null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(new i1(this, n4Var, sentryAndroidOptions));
            } catch (Throwable unused) {
                sentryAndroidOptions.getLogger().h(t5.WARNING, "Failed to start SystemEventsBreadcrumbsIntegration on executor thread.", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.v vVarA = this.O.a();
        try {
            this.J = true;
            this.L = null;
            if (this.M != null) {
                this.M.quit();
            }
            this.M = null;
            vVarA.close();
            f0.I.f(this);
            SentryAndroidOptions sentryAndroidOptions = this.G;
            if (sentryAndroidOptions != null) {
                try {
                    sentryAndroidOptions.getExecutorService().submit(new pya(21, this));
                } catch (RejectedExecutionException unused) {
                    d(this.G);
                }
            }
            SentryAndroidOptions sentryAndroidOptions2 = this.G;
            if (sentryAndroidOptions2 != null) {
                sentryAndroidOptions2.getLogger().h(t5.DEBUG, "SystemEventsBreadcrumbsIntegration removed.", new Object[0]);
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

    public final void d(SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.v vVarA = this.O.a();
        try {
            this.K = true;
            z1 z1Var = this.F;
            this.F = null;
            vVarA.close();
            if (z1Var != null) {
                try {
                    this.E.unregisterReceiver(z1Var);
                } catch (Throwable th) {
                    sentryAndroidOptions.getLogger().b(t5.ERROR, th, "Failed to unregister SystemEventsBroadcastReceiver", new Object[0]);
                }
            }
        } catch (Throwable th2) {
            try {
                vVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.android.core.c0
    public final void i() {
        if (this.H == null || this.G == null) {
            return;
        }
        this.K = false;
        c(this.H, this.G);
    }

    @Override // io.sentry.android.core.c0
    public final void x() {
        SentryAndroidOptions sentryAndroidOptions = this.G;
        if (sentryAndroidOptions == null) {
            return;
        }
        try {
            sentryAndroidOptions.getExecutorService().submit(new pya(21, this));
        } catch (RejectedExecutionException unused) {
            d(this.G);
        }
    }
}
