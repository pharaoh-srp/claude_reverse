package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import defpackage.bgd;
import defpackage.fj0;
import defpackage.fw4;
import defpackage.g91;
import defpackage.n6i;
import defpackage.wk;
import defpackage.yw5;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int E = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        n6i.b(getApplicationContext());
        fj0 fj0VarA = g91.a();
        fj0VarA.J(string);
        fj0VarA.G = bgd.b(i);
        if (string2 != null) {
            fj0VarA.F = Base64.decode(string2, 0);
        }
        wk wkVar = n6i.a().d;
        ((Executor) wkVar.g).execute(new fw4(wkVar, fj0VarA.h(), i2, new yw5(this, 8, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
