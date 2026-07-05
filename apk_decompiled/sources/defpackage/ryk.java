package defpackage;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class ryk implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ u1l F;
    public final /* synthetic */ hyk G;

    public /* synthetic */ ryk(hyk hykVar, u1l u1lVar, int i) {
        this.E = i;
        this.F = u1lVar;
        this.G = hykVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        hyk hykVar = this.G;
        u1l u1lVar = this.F;
        switch (i) {
            case 0:
                pfk pfkVar = hykVar.H;
                if (pfkVar != null) {
                    try {
                        pfkVar.u(u1lVar);
                    } catch (RemoteException e) {
                        hykVar.b0().J.c("Failed to reset data on the service: remote exception", e);
                    }
                    hykVar.c1();
                } else {
                    hykVar.b0().J.b("Failed to reset data on the service: not connected to service");
                }
                break;
            default:
                pfk pfkVar2 = hykVar.H;
                if (pfkVar2 == null) {
                    hykVar.b0().J.b("Failed to send consent settings to service");
                } else {
                    try {
                        pfkVar2.g(u1lVar);
                        hykVar.c1();
                    } catch (RemoteException e2) {
                        hykVar.b0().J.c("Failed to send consent settings to the service", e2);
                    }
                }
                break;
        }
    }
}
