package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class fzk implements ServiceConnection, ce1, de1 {
    public volatile boolean E;
    public volatile vgk F;
    public final /* synthetic */ hyk G;

    public fzk(hyk hykVar) {
        this.G = hykVar;
    }

    @Override // defpackage.de1
    public final void b(hh4 hh4Var) {
        dgj.r("MeasurementServiceConnection.onConnectionFailed");
        qgk qgkVar = ((umk) this.G.E).M;
        if (qgkVar == null || !qgkVar.F) {
            qgkVar = null;
        }
        if (qgkVar != null) {
            qgkVar.M.c("Service connection failed", hh4Var);
        }
        synchronized (this) {
            this.E = false;
            this.F = null;
        }
        this.G.O().T0(new gzk(this, 1));
    }

    @Override // defpackage.ce1
    public final void c(int i) {
        dgj.r("MeasurementServiceConnection.onConnectionSuspended");
        hyk hykVar = this.G;
        hykVar.b0().Q.b("Service connection suspended");
        hykVar.O().T0(new gzk(this, 0));
    }

    @Override // defpackage.ce1
    public final void d() {
        dgj.r("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                dgj.v(this.F);
                this.G.O().T0(new s2k(this, (pfk) this.F.t(), false, 23));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.F = null;
                this.E = false;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        dgj.r("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.E = false;
                this.G.b0().J.b("Service connected with null binder");
                return;
            }
            Object zfkVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    zfkVar = iInterfaceQueryLocalInterface instanceof pfk ? (pfk) iInterfaceQueryLocalInterface : new zfk(iBinder);
                    this.G.b0().R.b("Bound to IMeasurementService interface");
                } else {
                    this.G.b0().J.c("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.G.b0().J.b("Service connect failed to get IMeasurementService");
            }
            if (zfkVar == null) {
                this.E = false;
                try {
                    n78 n78VarK = n78.K();
                    hyk hykVar = this.G;
                    n78VarK.W(((umk) hykVar.E).E, hykVar.G);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.G.O().T0(new c5a(this, 12, zfkVar));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        dgj.r("MeasurementServiceConnection.onServiceDisconnected");
        hyk hykVar = this.G;
        hykVar.b0().Q.b("Service disconnected");
        hykVar.O().T0(new t08(this, componentName, false, 17));
    }
}
