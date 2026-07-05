package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class t1h implements x6f {
    public static final String J = nga.e("SystemJobScheduler");
    public final Context E;
    public final JobScheduler F;
    public final s1h G;
    public final WorkDatabase H;
    public final fg4 I;

    public t1h(Context context, WorkDatabase workDatabase, fg4 fg4Var) {
        JobScheduler jobSchedulerA = of9.a(context);
        s1h s1hVar = new s1h(context, fg4Var.d, fg4Var.l);
        this.E = context;
        this.F = jobSchedulerA;
        this.G = s1hVar;
        this.H = workDatabase;
        this.I = fg4Var;
    }

    public static void a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            nga.c().b(J, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static ArrayList b(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        String str = of9.a;
        jobScheduler.getClass();
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
            allPendingJobs.getClass();
        } catch (Throwable th) {
            nga.c().b(of9.a, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static xfj f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new xfj(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.x6f
    public final boolean c() {
        return true;
    }

    @Override // defpackage.x6f
    public final void d(String str) {
        ArrayList arrayList;
        Context context = this.E;
        JobScheduler jobScheduler = this.F;
        ArrayList<JobInfo> arrayListB = b(context, jobScheduler);
        if (arrayListB == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            for (JobInfo jobInfo : arrayListB) {
                xfj xfjVarF = f(jobInfo);
                if (xfjVarF != null && str.equals(xfjVarF.b())) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a(jobScheduler, ((Integer) it.next()).intValue());
        }
        m1h m1hVarT = this.H.t();
        m1hVarT.getClass();
        str.getClass();
        u00.E(m1hVarT.a, false, true, new cm5(str, 28));
    }

    @Override // defpackage.x6f
    public final void e(tgj... tgjVarArr) {
        int iIntValue;
        fg4 fg4Var = this.I;
        WorkDatabase workDatabase = this.H;
        final ax5 ax5Var = new ax5(workDatabase);
        for (tgj tgjVar : tgjVarArr) {
            workDatabase.b();
            try {
                ahj ahjVarW = workDatabase.w();
                String str = tgjVar.a;
                tgj tgjVarD = ahjVarW.d(str);
                String str2 = J;
                if (tgjVarD == null) {
                    nga.c().f(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.p();
                } else if (tgjVarD.b != zfj.E) {
                    nga.c().f(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.p();
                } else {
                    xfj xfjVarD = amk.d(tgjVar);
                    l1h l1hVarA = workDatabase.t().a(xfjVarD);
                    if (l1hVarA != null) {
                        iIntValue = l1hVarA.c;
                    } else {
                        fg4Var.getClass();
                        final int i = fg4Var.i;
                        WorkDatabase workDatabase2 = (WorkDatabase) ax5Var.F;
                        Callable callable = new Callable() { // from class: pv8
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                WorkDatabase workDatabase3 = (WorkDatabase) ax5Var.F;
                                Long lA = workDatabase3.s().a("next_job_scheduler_id");
                                int i2 = 0;
                                int iLongValue = lA != null ? (int) lA.longValue() : 0;
                                int i3 = iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1;
                                sbd sbdVarS = workDatabase3.s();
                                u00.E(sbdVarS.a, false, true, new vk3(sbdVarS, 24, new rbd(Long.valueOf(i3), "next_job_scheduler_id")));
                                if (iLongValue < 0 || iLongValue > i) {
                                    sbd sbdVarS2 = workDatabase3.s();
                                    u00.E(sbdVarS2.a, false, true, new vk3(sbdVarS2, 24, new rbd(1L, "next_job_scheduler_id")));
                                } else {
                                    i2 = iLongValue;
                                }
                                return Integer.valueOf(i2);
                            }
                        };
                        workDatabase2.getClass();
                        Object objO = workDatabase2.o(new pza(21, callable));
                        objO.getClass();
                        iIntValue = ((Number) objO).intValue();
                    }
                    if (l1hVarA == null) {
                        l1h l1hVarD = hjk.d(xfjVarD, iIntValue);
                        m1h m1hVarT = workDatabase.t();
                        m1hVarT.getClass();
                        u00.E(m1hVarT.a, false, true, new nif(m1hVarT, 12, l1hVarD));
                    }
                    g(tgjVar, iIntValue);
                    workDatabase.p();
                }
            } finally {
                workDatabase.f();
            }
        }
    }

    public final void g(tgj tgjVar, int i) throws IOException {
        int i2;
        List<JobInfo> allPendingJobs;
        String strH;
        String str = J;
        s1h s1hVar = this.G;
        s1hVar.getClass();
        ql4 ql4Var = tgjVar.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str2 = tgjVar.a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str2);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", tgjVar.c());
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", tgjVar.j());
        JobInfo.Builder extras = new JobInfo.Builder(i, s1hVar.a).setRequiresCharging(ql4Var.i()).setRequiresDeviceIdle(ql4Var.j()).setExtras(persistableBundle);
        NetworkRequest networkRequestD = ql4Var.d();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 28 || networkRequestD == null) {
            t1c t1cVarF = ql4Var.f();
            if (i3 < 30 || t1cVarF != t1c.J) {
                int iOrdinal = t1cVarF.ordinal();
                if (iOrdinal == 0) {
                    i2 = 0;
                } else if (iOrdinal != 1) {
                    i2 = 2;
                    if (iOrdinal != 2) {
                        i2 = 3;
                        if (iOrdinal != 3) {
                            if (iOrdinal != 4) {
                                nga ngaVarC = nga.c();
                                t1cVarF.toString();
                                ngaVarC.getClass();
                                i2 = 1;
                            } else {
                                i2 = 4;
                            }
                        }
                    }
                } else {
                    i2 = 1;
                }
                extras.setRequiredNetworkType(i2);
            } else {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        } else {
            ijk.k(extras, networkRequestD);
        }
        if (!ql4Var.j()) {
            extras.setBackoffCriteria(tgjVar.m, tgjVar.l == jc1.F ? 0 : 1);
        }
        long jA = tgjVar.a();
        s1hVar.b.getClass();
        long jMax = Math.max(jA - System.currentTimeMillis(), 0L);
        if (i3 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!tgjVar.q && s1hVar.c) {
            extras.setImportantWhileForeground(true);
        }
        if (ql4Var.g()) {
            for (pl4 pl4Var : ql4Var.c()) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(pl4Var.a(), pl4Var.b() ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(ql4Var.b());
            extras.setTriggerContentMaxDelay(ql4Var.a());
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(ql4Var.h());
        extras.setRequiresStorageNotLow(ql4Var.k());
        boolean z = tgjVar.k > 0;
        boolean z2 = jMax > 0;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31 && tgjVar.q && !z && !z2) {
            extras.setExpedited(true);
        }
        if (i4 >= 35 && (strH = tgjVar.h()) != null) {
            extras.setTraceTag(strH);
        }
        JobInfo jobInfoBuild = extras.build();
        nga.c().getClass();
        try {
            if (this.F.schedule(jobInfoBuild) == 0) {
                nga.c().f(str, "Unable to schedule work ID " + str2);
                if (tgjVar.q && tgjVar.r == xkc.E) {
                    tgjVar.q = false;
                    nga.c().getClass();
                    g(tgjVar, i);
                }
            }
        } catch (IllegalStateException e) {
            String str3 = of9.a;
            Context context = this.E;
            context.getClass();
            WorkDatabase workDatabase = this.H;
            workDatabase.getClass();
            fg4 fg4Var = this.I;
            fg4Var.getClass();
            int i5 = Build.VERSION.SDK_INT;
            int i6 = i5 >= 31 ? 150 : 100;
            int size = ((List) u00.E(workDatabase.w().a, true, false, new f9j(4))).size();
            String strS0 = "<faulty JobScheduler failed to getPendingJobs>";
            if (i5 >= 34) {
                JobScheduler jobSchedulerA = of9.a(context);
                try {
                    allPendingJobs = jobSchedulerA.getAllPendingJobs();
                    allPendingJobs.getClass();
                } catch (Throwable th) {
                    nga.c().b(of9.a, "getAllPendingJobs() is not reliable on this device.", th);
                    allPendingJobs = null;
                }
                if (allPendingJobs != null) {
                    ArrayList arrayListB = b(context, jobSchedulerA);
                    int size2 = arrayListB != null ? allPendingJobs.size() - arrayListB.size() : 0;
                    String str4 = size2 == 0 ? null : size2 + " of which are not owned by WorkManager";
                    Object systemService = context.getSystemService("jobscheduler");
                    systemService.getClass();
                    ArrayList arrayListB2 = b(context, (JobScheduler) systemService);
                    int size3 = arrayListB2 != null ? arrayListB2.size() : 0;
                    strS0 = w44.S0(mp0.C0(new String[]{allPendingJobs.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str4, size3 != 0 ? size3 + " from WorkManager in the default namespace" : null}), ",\n", null, null, null, 62);
                }
            } else {
                ArrayList arrayListB3 = b(context, of9.a(context));
                if (arrayListB3 != null) {
                    strS0 = arrayListB3.size() + " jobs from WorkManager";
                }
            }
            StringBuilder sb = new StringBuilder("JobScheduler ");
            sb.append(i6);
            sb.append(" job limit exceeded.\nIn JobScheduler there are ");
            sb.append(strS0);
            sb.append(".\nThere are ");
            sb.append(size);
            sb.append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
            String strR = vb7.r(sb, fg4Var.k, '.');
            nga.c().a(str, strR);
            throw new IllegalStateException(strR, e);
        } catch (Throwable th2) {
            nga.c().b(str, "Unable to schedule " + tgjVar, th2);
        }
    }
}
