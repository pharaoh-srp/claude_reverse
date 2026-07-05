package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import defpackage.am4;
import defpackage.bgj;
import defpackage.cbf;
import defpackage.h57;
import defpackage.hlg;
import defpackage.hr5;
import defpackage.ij0;
import defpackage.ke0;
import defpackage.ljk;
import defpackage.nga;
import defpackage.oe0;
import defpackage.sz6;
import defpackage.xfj;
import defpackage.xhd;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements h57 {
    public static final String I = nga.e("SystemJobService");
    public bgj E;
    public final HashMap F = new HashMap();
    public final hr5 G = new hr5(1);
    public cbf H;

    public static void a(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        sz6.j(ij0.j("Cannot invoke ", str, " on a background thread"));
    }

    public static xfj c(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new xfj(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.h57
    public final void b(xfj xfjVar, boolean z) {
        a("onExecuted");
        nga.c().getClass();
        JobParameters jobParameters = (JobParameters) this.F.remove(xfjVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            bgj bgjVarD = bgj.d(getApplicationContext());
            this.E = bgjVarD;
            xhd xhdVar = bgjVarD.f;
            this.H = new cbf(xhdVar, bgjVarD.d);
            xhdVar.a(this);
        } catch (IllegalStateException e) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
            nga.c().f(I, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        bgj bgjVar = this.E;
        if (bgjVar != null) {
            xhd xhdVar = bgjVar.f;
            synchronized (xhdVar.k) {
                xhdVar.j.remove(this);
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        a("onStartJob");
        if (this.E == null) {
            nga.c().getClass();
            jobFinished(jobParameters, true);
            return false;
        }
        xfj xfjVarC = c(jobParameters);
        if (xfjVarC == null) {
            nga.c().a(I, "WorkSpec id not found!");
            return false;
        }
        HashMap map = this.F;
        if (map.containsKey(xfjVarC)) {
            nga ngaVarC = nga.c();
            xfjVarC.toString();
            ngaVarC.getClass();
            return false;
        }
        nga ngaVarC2 = nga.c();
        xfjVarC.toString();
        ngaVarC2.getClass();
        map.put(xfjVarC, jobParameters);
        am4 am4Var = new am4(26);
        if (ljk.e(jobParameters) != null) {
            Arrays.asList(ljk.e(jobParameters));
        }
        if (ljk.d(jobParameters) != null) {
            Arrays.asList(ljk.d(jobParameters));
        }
        if (Build.VERSION.SDK_INT >= 28) {
            ke0.g(jobParameters);
        }
        this.H.n(this.G.c(xfjVarC), am4Var);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        a("onStopJob");
        if (this.E == null) {
            nga.c().getClass();
            return true;
        }
        xfj xfjVarC = c(jobParameters);
        if (xfjVarC == null) {
            nga.c().a(I, "WorkSpec id not found!");
            return false;
        }
        nga ngaVarC = nga.c();
        xfjVarC.toString();
        ngaVarC.getClass();
        this.F.remove(xfjVarC);
        hlg hlgVar = (hlg) this.G.a.remove(xfjVarC);
        if (hlgVar != null) {
            int iE = Build.VERSION.SDK_INT >= 31 ? oe0.e(jobParameters) : -512;
            cbf cbfVar = this.H;
            cbfVar.getClass();
            cbfVar.o(hlgVar, iE);
        }
        xhd xhdVar = this.E.f;
        String strB = xfjVarC.b();
        synchronized (xhdVar.k) {
            zContains = xhdVar.i.contains(strB);
        }
        return !zContains;
    }
}
