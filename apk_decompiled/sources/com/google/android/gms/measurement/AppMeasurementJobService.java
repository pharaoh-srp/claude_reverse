package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import defpackage.ije;
import defpackage.mzk;
import defpackage.o0l;
import defpackage.qgk;
import defpackage.t08;
import defpackage.umk;
import defpackage.w9h;

/* JADX INFO: loaded from: classes3.dex */
public final class AppMeasurementJobService extends JobService implements mzk {
    public w9h E;

    @Override // defpackage.mzk
    public final void a(Intent intent) {
    }

    @Override // defpackage.mzk
    public final void b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final w9h c() {
        if (this.E == null) {
            this.E = new w9h(this);
        }
        return this.E;
    }

    @Override // defpackage.mzk
    public final boolean d(int i) {
        throw new UnsupportedOperationException();
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

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        w9h w9hVarC = c();
        qgk qgkVar = umk.a((Service) w9hVarC.E, null, null).M;
        umk.d(qgkVar);
        String string = jobParameters.getExtras().getString("action");
        qgkVar.R.c("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        ije ijeVar = new ije(14);
        ijeVar.F = w9hVarC;
        ijeVar.G = qgkVar;
        ijeVar.H = jobParameters;
        o0l o0lVarG = o0l.g((Service) w9hVarC.E);
        o0lVarG.O().T0(new t08(o0lVarG, 18, ijeVar));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
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
