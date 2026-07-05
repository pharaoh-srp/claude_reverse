package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class m3k extends hmj {
    public fe1 j;
    public final int k;

    public m3k(fe1 fe1Var, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 1);
        this.j = fe1Var;
        this.k = i;
    }

    @Override // defpackage.hmj
    public final boolean E(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i2 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) xyj.a(parcel, Bundle.CREATOR);
            xyj.c(parcel);
            dgj.w("onPostInitComplete can be called only once per call to getRemoteService", this.j);
            this.j.z(i2, strongBinder, bundle, this.k);
            this.j = null;
        } else if (i == 2) {
            parcel.readInt();
            xyj.c(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            drk drkVar = (drk) xyj.a(parcel, drk.CREATOR);
            xyj.c(parcel);
            fe1 fe1Var = this.j;
            dgj.w("onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService", fe1Var);
            dgj.v(drkVar);
            fe1Var.Z = drkVar;
            if (fe1Var.B()) {
                sh4 sh4Var = drkVar.H;
                ive iveVarR = ive.r();
                jve jveVar = sh4Var == null ? null : sh4Var.E;
                synchronized (iveVarR) {
                    if (jveVar == null) {
                        jveVar = ive.H;
                    } else {
                        jve jveVar2 = (jve) iveVarR.F;
                        if (jveVar2 == null || jveVar2.E < jveVar.E) {
                        }
                    }
                    iveVarR.F = jveVar;
                }
            }
            Bundle bundle2 = drkVar.E;
            dgj.w("onPostInitComplete can be called only once per call to getRemoteService", this.j);
            this.j.z(i3, strongBinder2, bundle2, this.k);
            this.j = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
