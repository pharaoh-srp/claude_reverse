package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class npj extends dmj implements zpj {
    public final boolean O() {
        Parcel parcelE = E(H(), 7);
        int i = xyj.a;
        boolean z = parcelE.readInt() != 0;
        parcelE.recycle();
        return z;
    }
}
