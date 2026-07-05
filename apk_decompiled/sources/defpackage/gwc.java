package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class gwc extends a4 {
    public static final Parcelable.Creator<gwc> CREATOR = new s38(10);
    public final PendingIntent E;

    public gwc(PendingIntent pendingIntent) {
        pendingIntent.getClass();
        this.E = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int iK0 = xn5.K0(parcel, 20293);
        xn5.E0(parcel, 1, this.E, i);
        xn5.L0(parcel, iK0);
    }
}
