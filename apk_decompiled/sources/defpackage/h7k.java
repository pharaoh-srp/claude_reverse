package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class h7k implements ServiceConnection {
    public final int E;
    public final /* synthetic */ fe1 F;

    public h7k(fe1 fe1Var, int i) {
        this.F = fe1Var;
        this.E = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        fe1 fe1Var = this.F;
        if (iBinder == null) {
            synchronized (fe1Var.K) {
                i = fe1Var.R;
            }
            if (i == 3) {
                fe1Var.Y = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            luj lujVar = fe1Var.J;
            lujVar.sendMessage(lujVar.obtainMessage(i2, fe1Var.a0.get(), 16));
            return;
        }
        synchronized (fe1Var.L) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                fe1Var.M = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ipj)) ? new ipj(iBinder) : (ipj) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        fe1 fe1Var2 = this.F;
        int i3 = this.E;
        fe1Var2.getClass();
        gfk gfkVar = new gfk(fe1Var2, 0, null);
        luj lujVar2 = fe1Var2.J;
        lujVar2.sendMessage(lujVar2.obtainMessage(7, i3, -1, gfkVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        fe1 fe1Var = this.F;
        synchronized (fe1Var.L) {
            fe1Var.M = null;
        }
        fe1 fe1Var2 = this.F;
        int i = this.E;
        luj lujVar = fe1Var2.J;
        lujVar.sendMessage(lujVar.obtainMessage(6, i, 1));
    }
}
