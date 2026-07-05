package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class h0l extends k0l {
    public final AlarmManager H;
    public uuk I;
    public Integer J;

    public h0l(o0l o0lVar) {
        super(o0lVar);
        this.H = (AlarmManager) ((umk) this.E).E.getSystemService("alarm");
    }

    @Override // defpackage.k0l
    public final boolean Q0() {
        umk umkVar = (umk) this.E;
        AlarmManager alarmManager = this.H;
        if (alarmManager != null) {
            Context context = umkVar.E;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), f2k.a));
        }
        JobScheduler jobScheduler = (JobScheduler) umkVar.E.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(S0());
        }
        return false;
    }

    public final void R0() {
        umk umkVar = (umk) this.E;
        O0();
        b0().R.b("Unscheduling upload");
        AlarmManager alarmManager = this.H;
        if (alarmManager != null) {
            Context context = umkVar.E;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), f2k.a));
        }
        T0().a();
        JobScheduler jobScheduler = (JobScheduler) umkVar.E.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(S0());
        }
    }

    public final int S0() {
        if (this.J == null) {
            this.J = Integer.valueOf(("measurement" + ((umk) this.E).E.getPackageName()).hashCode());
        }
        return this.J.intValue();
    }

    public final qtj T0() {
        if (this.I == null) {
            this.I = new uuk(this, this.F.P, 2);
        }
        return this.I;
    }
}
