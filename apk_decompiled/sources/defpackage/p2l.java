package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class p2l extends dmj {
    public p2l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 6);
    }

    public final lu8 O(cbc cbcVar, String str, int i, cbc cbcVar2) {
        Parcel parcelH = H();
        xyj.b(parcelH, cbcVar);
        parcelH.writeString(str);
        parcelH.writeInt(i);
        xyj.b(parcelH, cbcVar2);
        Parcel parcelE = E(parcelH, 2);
        lu8 lu8VarF = cbc.F(parcelE.readStrongBinder());
        parcelE.recycle();
        return lu8VarF;
    }

    public final lu8 P(cbc cbcVar, String str, int i, cbc cbcVar2) {
        Parcel parcelH = H();
        xyj.b(parcelH, cbcVar);
        parcelH.writeString(str);
        parcelH.writeInt(i);
        xyj.b(parcelH, cbcVar2);
        Parcel parcelE = E(parcelH, 3);
        lu8 lu8VarF = cbc.F(parcelE.readStrongBinder());
        parcelE.recycle();
        return lu8VarF;
    }
}
