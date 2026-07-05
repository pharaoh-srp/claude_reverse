package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class n88 {
    public final hfk a;
    public fnf b;

    public n88(hfk hfkVar) {
        new HashMap();
        new HashMap();
        dgj.v(hfkVar);
        this.a = hfkVar;
    }

    public final CameraPosition a() {
        try {
            hfk hfkVar = this.a;
            Parcel parcelF = hfkVar.F(hfkVar.H(), 1);
            CameraPosition cameraPosition = (CameraPosition) gyj.a(parcelF, CameraPosition.CREATOR);
            parcelF.recycle();
            return cameraPosition;
        } catch (RemoteException e) {
            poc.q(e);
            return null;
        }
    }

    public final fnf b() {
        gzj gzjVar;
        try {
            if (this.b == null) {
                hfk hfkVar = this.a;
                Parcel parcelF = hfkVar.F(hfkVar.H(), 25);
                IBinder strongBinder = parcelF.readStrongBinder();
                if (strongBinder == null) {
                    gzjVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    gzjVar = iInterfaceQueryLocalInterface instanceof gzj ? (gzj) iInterfaceQueryLocalInterface : new gzj(strongBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate", 3);
                }
                parcelF.recycle();
                this.b = new fnf(7, gzjVar);
            }
            return this.b;
        } catch (RemoteException e) {
            poc.q(e);
            return null;
        }
    }

    public final void c(poj pojVar) {
        try {
            hfk hfkVar = this.a;
            lu8 lu8Var = (lu8) pojVar.E;
            Parcel parcelH = hfkVar.H();
            gyj.d(parcelH, lu8Var);
            hfkVar.L(parcelH, 4);
        } catch (RemoteException e) {
            poc.q(e);
        }
    }

    public final void d(String str) {
        try {
            hfk hfkVar = this.a;
            Parcel parcelH = hfkVar.H();
            parcelH.writeString(str);
            hfkVar.L(parcelH, 61);
        } catch (RemoteException e) {
            poc.q(e);
        }
    }
}
