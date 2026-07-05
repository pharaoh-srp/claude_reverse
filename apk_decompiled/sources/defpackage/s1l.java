package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class s1l extends dmj {
    public s1l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 6);
    }

    public final lu8 O(cbc cbcVar, String str, int i) {
        Parcel parcelH = H();
        xyj.b(parcelH, cbcVar);
        parcelH.writeString(str);
        parcelH.writeInt(i);
        Parcel parcelE = E(parcelH, 2);
        lu8 lu8VarF = cbc.F(parcelE.readStrongBinder());
        parcelE.recycle();
        return lu8VarF;
    }

    public final int P(cbc cbcVar, String str, boolean z) {
        Parcel parcelH = H();
        xyj.b(parcelH, cbcVar);
        parcelH.writeString(str);
        parcelH.writeInt(z ? 1 : 0);
        Parcel parcelE = E(parcelH, 3);
        int i = parcelE.readInt();
        parcelE.recycle();
        return i;
    }

    public final lu8 Q(cbc cbcVar, String str, int i) {
        Parcel parcelH = H();
        xyj.b(parcelH, cbcVar);
        parcelH.writeString(str);
        parcelH.writeInt(i);
        Parcel parcelE = E(parcelH, 4);
        lu8 lu8VarF = cbc.F(parcelE.readStrongBinder());
        parcelE.recycle();
        return lu8VarF;
    }

    public final int R(cbc cbcVar, String str, boolean z) {
        Parcel parcelH = H();
        xyj.b(parcelH, cbcVar);
        parcelH.writeString(str);
        parcelH.writeInt(z ? 1 : 0);
        Parcel parcelE = E(parcelH, 5);
        int i = parcelE.readInt();
        parcelE.recycle();
        return i;
    }

    public final int S() {
        Parcel parcelE = E(H(), 6);
        int i = parcelE.readInt();
        parcelE.recycle();
        return i;
    }

    public final lu8 T(cbc cbcVar, String str, boolean z, long j) {
        Parcel parcelH = H();
        xyj.b(parcelH, cbcVar);
        parcelH.writeString(str);
        parcelH.writeInt(z ? 1 : 0);
        parcelH.writeLong(j);
        Parcel parcelE = E(parcelH, 7);
        lu8 lu8VarF = cbc.F(parcelE.readStrongBinder());
        parcelE.recycle();
        return lu8VarF;
    }

    public final lu8 U(cbc cbcVar, String str, int i, cbc cbcVar2) {
        Parcel parcelH = H();
        xyj.b(parcelH, cbcVar);
        parcelH.writeString(str);
        parcelH.writeInt(i);
        xyj.b(parcelH, cbcVar2);
        Parcel parcelE = E(parcelH, 8);
        lu8 lu8VarF = cbc.F(parcelE.readStrongBinder());
        parcelE.recycle();
        return lu8VarF;
    }
}
