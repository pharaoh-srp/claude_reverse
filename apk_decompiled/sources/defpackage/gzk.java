package defpackage;

import android.content.ComponentName;

/* JADX INFO: loaded from: classes3.dex */
public final class gzk implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ fzk F;

    public /* synthetic */ gzk(fzk fzkVar, int i) {
        this.E = i;
        this.F = fzkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        fzk fzkVar = this.F;
        switch (i) {
            case 0:
                hyk hykVar = fzkVar.G;
                ComponentName componentName = new ComponentName(((umk) hykVar.E).E, "com.google.android.gms.measurement.AppMeasurementService");
                hykVar.K0();
                if (hykVar.H != null) {
                    hykVar.H = null;
                    hykVar.b0().R.c("Disconnected from device MeasurementService", componentName);
                    hykVar.K0();
                    hykVar.W0();
                }
                break;
            default:
                hyk hykVar2 = fzkVar.G;
                hykVar2.H = null;
                hykVar2.b1();
                break;
        }
    }
}
