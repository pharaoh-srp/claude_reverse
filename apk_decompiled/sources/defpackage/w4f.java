package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class w4f extends a4 {
    public static final Parcelable.Creator<w4f> CREATOR = new zmj(17);
    public final PendingIntent E;

    public w4f(PendingIntent pendingIntent) {
        dgj.v(pendingIntent);
        this.E = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w4f) {
            return gb9.v(this.E, ((w4f) obj).E);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.E0(parcel, 1, this.E, i);
        xn5.L0(parcel, iK0);
    }
}
