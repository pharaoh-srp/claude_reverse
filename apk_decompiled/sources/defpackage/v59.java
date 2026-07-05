package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class v59 implements ServiceConnection {
    public final /* synthetic */ int E;
    public final Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ v59(Object obj, int i, Object obj2) {
        this.E = i;
        this.G = obj;
        this.F = obj2;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object lt8Var;
        int i = this.E;
        Object obj = this.G;
        switch (i) {
            case 0:
                wvk.j("Install Referrer service connected.");
                o5l o5lVar = (o5l) obj;
                int i2 = mt8.i;
                if (iBinder == null) {
                    lt8Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                    lt8Var = iInterfaceQueryLocalInterface instanceof nt8 ? (nt8) iInterfaceQueryLocalInterface : new lt8(iBinder);
                }
                o5lVar.H = lt8Var;
                o5lVar.F = 2;
                ((c61) this.F).D(0);
                break;
            default:
                fkk fkkVar = (fkk) obj;
                if (iBinder == null) {
                    qgk qgkVar = fkkVar.b.M;
                    umk.d(qgkVar);
                    qgkVar.M.b("Install Referrer connection returned with null binder");
                } else {
                    try {
                        int i3 = zxj.i;
                        IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                        cyj czjVar = iInterfaceQueryLocalInterface2 instanceof cyj ? (cyj) iInterfaceQueryLocalInterface2 : new czj(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 8);
                        qgk qgkVar2 = fkkVar.b.M;
                        umk.d(qgkVar2);
                        qgkVar2.R.b("Install Referrer Service connected");
                        wlk wlkVar = fkkVar.b.N;
                        umk.d(wlkVar);
                        wlkVar.T0(new t08(this, czjVar, this));
                    } catch (RuntimeException e) {
                        qgk qgkVar3 = fkkVar.b.M;
                        umk.d(qgkVar3);
                        qgkVar3.M.c("Exception occurred while calling Install Referrer API", e);
                    }
                }
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i = this.E;
        Object obj = this.G;
        switch (i) {
            case 0:
                wvk.k("Install Referrer service disconnected.");
                o5l o5lVar = (o5l) obj;
                o5lVar.H = null;
                o5lVar.F = 0;
                break;
            default:
                qgk qgkVar = ((fkk) obj).b.M;
                umk.d(qgkVar);
                qgkVar.R.b("Install Referrer Service disconnected");
                break;
        }
    }
}
