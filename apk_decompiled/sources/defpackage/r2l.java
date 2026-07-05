package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r2l extends rlj implements q3l {
    public r2l() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", 4);
    }

    @Override // defpackage.rlj
    public final boolean G(Parcel parcel, int i) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            a();
            return true;
        }
        hxk hxkVar = (hxk) zyj.a(parcel, hxk.CREATOR);
        zyj.c(parcel);
        r(hxkVar);
        return true;
    }
}
