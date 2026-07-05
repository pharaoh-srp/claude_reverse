package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes3.dex */
public class fua {
    public final crj a;

    public fua(crj crjVar) {
        dgj.v(crjVar);
        this.a = crjVar;
    }

    public final LatLng a() {
        try {
            tqj tqjVar = (tqj) this.a;
            Parcel parcelF = tqjVar.F(tqjVar.H(), 4);
            LatLng latLng = (LatLng) gyj.a(parcelF, LatLng.CREATOR);
            parcelF.recycle();
            return latLng;
        } catch (RemoteException e) {
            poc.q(e);
            return null;
        }
    }

    public final boolean b() {
        try {
            tqj tqjVar = (tqj) this.a;
            Parcel parcelF = tqjVar.F(tqjVar.H(), 13);
            int i = gyj.a;
            boolean z = parcelF.readInt() != 0;
            parcelF.recycle();
            return z;
        } catch (RemoteException e) {
            poc.q(e);
            return false;
        }
    }

    public final void c(Object obj) {
        try {
            crj crjVar = this.a;
            cbc cbcVar = new cbc(obj);
            tqj tqjVar = (tqj) crjVar;
            Parcel parcelH = tqjVar.H();
            gyj.d(parcelH, cbcVar);
            tqjVar.L(parcelH, 29);
        } catch (RemoteException e) {
            poc.q(e);
        }
    }

    public final void d() {
        try {
            tqj tqjVar = (tqj) this.a;
            tqjVar.L(tqjVar.H(), 11);
        } catch (RemoteException e) {
            poc.q(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fua)) {
            return false;
        }
        try {
            crj crjVar = this.a;
            crj crjVar2 = ((fua) obj).a;
            tqj tqjVar = (tqj) crjVar;
            Parcel parcelH = tqjVar.H();
            gyj.d(parcelH, crjVar2);
            Parcel parcelF = tqjVar.F(parcelH, 16);
            boolean z = parcelF.readInt() != 0;
            parcelF.recycle();
            return z;
        } catch (RemoteException e) {
            poc.q(e);
            return false;
        }
    }

    public final int hashCode() {
        try {
            tqj tqjVar = (tqj) this.a;
            Parcel parcelF = tqjVar.F(tqjVar.H(), 17);
            int i = parcelF.readInt();
            parcelF.recycle();
            return i;
        } catch (RemoteException e) {
            poc.q(e);
            return 0;
        }
    }
}
