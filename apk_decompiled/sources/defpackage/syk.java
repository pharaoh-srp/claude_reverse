package defpackage;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class syk implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ u1l F;
    public final /* synthetic */ hyk G;

    public /* synthetic */ syk(hyk hykVar, u1l u1lVar, int i) {
        this.E = i;
        this.F = u1lVar;
        this.G = hykVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.E;
        hyk hykVar = this.G;
        u1l u1lVar = this.F;
        switch (i) {
            case 0:
                pfk pfkVar = hykVar.H;
                if (pfkVar == null) {
                    hykVar.b0().J.b("Discarding data. Failed to send app launch");
                } else {
                    try {
                        pfkVar.q(u1lVar);
                        ((umk) hykVar.E).l().U0();
                        hykVar.U0(pfkVar, null, u1lVar);
                        hykVar.c1();
                    } catch (RemoteException e) {
                        hykVar.b0().J.c("Failed to send app launch to the service", e);
                        return;
                    }
                }
                break;
            default:
                pfk pfkVar2 = hykVar.H;
                if (pfkVar2 == null) {
                    hykVar.b0().J.b("Failed to send measurementEnabled to service");
                } else {
                    try {
                        pfkVar2.A(u1lVar);
                        hykVar.c1();
                    } catch (RemoteException e2) {
                        hykVar.b0().J.c("Failed to send measurementEnabled to the service", e2);
                    }
                }
                break;
        }
    }
}
