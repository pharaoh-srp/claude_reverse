package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class vqb extends a4 {
    public static final Parcelable.Creator<vqb> CREATOR = new s38(26);
    public final PendingIntent E;

    public vqb(PendingIntent pendingIntent) {
        this.E = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.E0(parcel, 1, this.E, i);
        xn5.L0(parcel, iK0);
    }
}
