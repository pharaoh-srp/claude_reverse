package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import defpackage.e6j;
import defpackage.mnk;
import defpackage.mzk;
import defpackage.o0l;
import defpackage.oxk;
import defpackage.qgk;
import defpackage.t08;
import defpackage.umk;
import defpackage.w9h;

/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementService extends Service implements mzk {
    public w9h E;

    @Override // defpackage.mzk
    public final void a(Intent intent) {
        e6j.a(intent);
    }

    @Override // defpackage.mzk
    public final void b(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final w9h c() {
        if (this.E == null) {
            this.E = new w9h(this);
        }
        return this.E;
    }

    @Override // defpackage.mzk
    public final boolean d(int i) {
        return stopSelfResult(i);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        w9h w9hVarC = c();
        if (intent == null) {
            w9hVarC.i().J.b("onBind called with null intent");
            return null;
        }
        w9hVarC.getClass();
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new mnk(o0l.g((Service) w9hVarC.E));
        }
        w9hVarC.i().M.c("onBind received unknown action", action);
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        qgk qgkVar = umk.a((Service) c().E, null, null).M;
        umk.d(qgkVar);
        qgkVar.R.b("Local AppMeasurementService is starting up");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        qgk qgkVar = umk.a((Service) c().E, null, null).M;
        umk.d(qgkVar);
        qgkVar.R.b("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        w9h w9hVarC = c();
        if (intent == null) {
            w9hVarC.i().J.b("onRebind called with null intent");
            return;
        }
        w9hVarC.getClass();
        w9hVarC.i().R.c("onRebind called. action", intent.getAction());
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        w9h w9hVarC = c();
        qgk qgkVar = umk.a((Service) w9hVarC.E, null, null).M;
        umk.d(qgkVar);
        if (intent == null) {
            qgkVar.M.b("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        qgkVar.R.a(Integer.valueOf(i2), action, "Local AppMeasurementService called. startId, action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        oxk oxkVar = new oxk(w9hVarC, i2, qgkVar, intent);
        o0l o0lVarG = o0l.g((Service) w9hVarC.E);
        o0lVarG.O().T0(new t08(o0lVarG, 18, oxkVar));
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        w9h w9hVarC = c();
        if (intent == null) {
            w9hVarC.i().J.b("onUnbind called with null intent");
            return true;
        }
        w9hVarC.getClass();
        w9hVarC.i().R.c("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
