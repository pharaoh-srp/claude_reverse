package defpackage;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gyk implements Runnable {
    public final /* synthetic */ int E = 1;
    public /* synthetic */ hyk F;

    public /* synthetic */ gyk(hyk hykVar) {
        this.F = hykVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        hyk hykVar = this.F;
        switch (i) {
            case 0:
                pfk pfkVar = hykVar.H;
                if (pfkVar == null) {
                    hykVar.b0().J.b("Failed to send storage consent settings to service");
                } else {
                    try {
                        pfkVar.C(hykVar.d1(false));
                        hykVar.c1();
                    } catch (RemoteException e) {
                        hykVar.b0().J.c("Failed to send storage consent settings to the service", e);
                        return;
                    }
                }
                break;
            default:
                pfk pfkVar2 = hykVar.H;
                if (pfkVar2 == null) {
                    hykVar.b0().J.b("Failed to send Dma consent settings to service");
                } else {
                    try {
                        pfkVar2.l(hykVar.d1(false));
                        hykVar.c1();
                    } catch (RemoteException e2) {
                        hykVar.b0().J.c("Failed to send Dma consent settings to the service", e2);
                    }
                }
                break;
        }
    }

    public /* synthetic */ gyk() {
    }
}
