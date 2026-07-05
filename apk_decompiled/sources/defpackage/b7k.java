package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.GoogleMapOptions;

/* JADX INFO: loaded from: classes3.dex */
public final class b7k extends dmj {
    public final fuj O() {
        fuj fujVar;
        Parcel parcelF = F(H(), 4);
        IBinder strongBinder = parcelF.readStrongBinder();
        if (strongBinder == null) {
            fujVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            fujVar = iInterfaceQueryLocalInterface instanceof fuj ? (fuj) iInterfaceQueryLocalInterface : new fuj(strongBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate", 3);
        }
        parcelF.recycle();
        return fujVar;
    }

    public final exk P(cbc cbcVar, GoogleMapOptions googleMapOptions) {
        exk exkVar;
        Parcel parcelH = H();
        gyj.d(parcelH, cbcVar);
        gyj.c(parcelH, googleMapOptions);
        Parcel parcelF = F(parcelH, 3);
        IBinder strongBinder = parcelF.readStrongBinder();
        if (strongBinder == null) {
            exkVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            exkVar = iInterfaceQueryLocalInterface instanceof exk ? (exk) iInterfaceQueryLocalInterface : new exk(strongBinder, "com.google.android.gms.maps.internal.IMapViewDelegate", 3);
        }
        parcelF.recycle();
        return exkVar;
    }

    public final kuk Q() {
        kuk gnkVar;
        Parcel parcelF = F(H(), 5);
        IBinder strongBinder = parcelF.readStrongBinder();
        int i = erk.j;
        if (strongBinder == null) {
            gnkVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            gnkVar = iInterfaceQueryLocalInterface instanceof kuk ? (kuk) iInterfaceQueryLocalInterface : new gnk(strongBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate", 3);
        }
        parcelF.recycle();
        return gnkVar;
    }
}
