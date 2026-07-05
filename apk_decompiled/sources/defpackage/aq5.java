package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.PowerManager;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class aq5 implements i29 {
    public final Context E;
    public final iuj F;
    public final PowerManager G;
    public final BatteryManager H;
    public final int I;
    public volatile Float J;
    public volatile Boolean K;
    public final AtomicLong L;
    public final cy1 M;

    public aq5(Context context, iuj iujVar) {
        Object systemService = context.getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        Object systemService2 = context.getSystemService("batterymanager");
        BatteryManager batteryManager = systemService2 instanceof BatteryManager ? (BatteryManager) systemService2 : null;
        context.getClass();
        iujVar.getClass();
        this.E = context;
        this.F = iujVar;
        this.G = powerManager;
        this.H = batteryManager;
        this.I = 60000;
        this.L = new AtomicLong(Long.MIN_VALUE);
        cy1 cy1Var = new cy1(1, this);
        this.M = cy1Var;
        context.registerReceiver(cy1Var, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    @Override // defpackage.i29
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.c29 a() {
        /*
            r6 = this;
            monitor-enter(r6)
            iuj r0 = r6.F     // Catch: java.lang.Throwable -> L5d
            r0.getClass()     // Catch: java.lang.Throwable -> L5d
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L5d
            int r2 = r6.I     // Catch: java.lang.Throwable -> L5d
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L5d
            long r2 = r0 - r2
            java.util.concurrent.atomic.AtomicLong r4 = r6.L     // Catch: java.lang.Throwable -> L5d
            long r4 = r4.get()     // Catch: java.lang.Throwable -> L5d
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            if (r2 < 0) goto L5f
            java.util.concurrent.atomic.AtomicLong r2 = r6.L     // Catch: java.lang.Throwable -> L5d
            r2.set(r0)     // Catch: java.lang.Throwable -> L5d
            android.os.BatteryManager r0 = r6.H     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto L2d
            r1 = 4
            int r0 = r0.getIntProperty(r1)     // Catch: java.lang.Throwable -> L5d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L5d
            goto L2e
        L2d:
            r0 = r3
        L2e:
            if (r0 == 0) goto L46
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L5d
            android.content.Context r1 = r6.E     // Catch: java.lang.Throwable -> L5d
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()     // Catch: java.lang.Throwable -> L5d
            int r1 = r1.targetSdkVersion     // Catch: java.lang.Throwable -> L5d
            r2 = 28
            if (r1 < r2) goto L43
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L44
        L43:
            r1 = 0
        L44:
            if (r0 != r1) goto L48
        L46:
            r0 = r3
            goto L50
        L48:
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L5d
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r1
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch: java.lang.Throwable -> L5d
        L50:
            if (r0 == 0) goto L5f
            float r0 = r0.floatValue()     // Catch: java.lang.Throwable -> L5d
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch: java.lang.Throwable -> L5d
            r6.J = r0     // Catch: java.lang.Throwable -> L5d
            goto L5f
        L5d:
            r0 = move-exception
            goto L7c
        L5f:
            java.lang.Boolean r0 = r6.K     // Catch: java.lang.Throwable -> L5d
            if (r0 != 0) goto L71
            android.os.PowerManager r0 = r6.G     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto L6f
            boolean r0 = r0.isPowerSaveMode()     // Catch: java.lang.Throwable -> L5d
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L5d
        L6f:
            r6.K = r3     // Catch: java.lang.Throwable -> L5d
        L71:
            nh1 r0 = new nh1     // Catch: java.lang.Throwable -> L5d
            java.lang.Float r1 = r6.J     // Catch: java.lang.Throwable -> L5d
            java.lang.Boolean r2 = r6.K     // Catch: java.lang.Throwable -> L5d
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r6)
            return r0
        L7c:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aq5.a():c29");
    }

    @Override // defpackage.i29
    public final void c() {
        try {
            this.E.unregisterReceiver(this.M);
        } catch (IllegalArgumentException unused) {
        }
    }
}
