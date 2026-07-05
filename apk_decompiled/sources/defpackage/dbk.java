package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class dbk extends epj {
    public final IBinder g;
    public final /* synthetic */ fe1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbk(fe1 fe1Var, int i, IBinder iBinder, Bundle bundle) {
        super(fe1Var, i, bundle);
        this.h = fe1Var;
        this.g = iBinder;
    }

    @Override // defpackage.epj
    public final boolean a() {
        IBinder iBinder = this.g;
        try {
            dgj.v(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            fe1 fe1Var = this.h;
            if (!fe1Var.u().equals(interfaceDescriptor)) {
                String strU = fe1Var.u();
                Log.w("GmsClient", vb7.t(new StringBuilder(strU.length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", strU, " vs. ", interfaceDescriptor));
                return false;
            }
            IInterface iInterfaceN = fe1Var.n(iBinder);
            if (iInterfaceN == null || !(fe1Var.C(2, 4, iInterfaceN) || fe1Var.C(3, 4, iInterfaceN))) {
                return false;
            }
            fe1Var.X = null;
            ce1 ce1Var = fe1Var.S;
            if (ce1Var == null) {
                return true;
            }
            ce1Var.d();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // defpackage.epj
    public final void b(hh4 hh4Var) {
        de1 de1Var = this.h.T;
        if (de1Var != null) {
            de1Var.b(hh4Var);
        }
        System.currentTimeMillis();
    }
}
