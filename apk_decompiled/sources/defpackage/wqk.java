package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes3.dex */
public final class wqk implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ x4k F;
    public final /* synthetic */ AppMeasurementDynamiteService G;

    public /* synthetic */ wqk(AppMeasurementDynamiteService appMeasurementDynamiteService, x4k x4kVar, int i) {
        this.E = i;
        this.F = x4kVar;
        this.G = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        switch (this.E) {
            case 0:
                hyk hykVarN = this.G.i.n();
                x4k x4kVar = this.F;
                hykVarN.K0();
                hykVarN.O0();
                hykVarN.R0(new ije((Object) hykVarN, (a4) hykVarN.d1(false), (Object) x4kVar, 12));
                break;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.G;
                h1l h1lVar = appMeasurementDynamiteService.i.P;
                umk.c(h1lVar);
                x4k x4kVar2 = this.F;
                umk umkVar = appMeasurementDynamiteService.i;
                if (umkVar.e0 != null && umkVar.e0.booleanValue()) {
                    z = true;
                }
                h1lVar.l1(x4kVar2, z);
                break;
        }
    }
}
