package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class h65 extends a4 {
    public static final Parcelable.Creator<h65> CREATOR = new dpj(14);
    public final PendingIntent E;
    public final k65 F;

    public h65(PendingIntent pendingIntent, k65 k65Var) {
        this.E = pendingIntent;
        this.F = k65Var;
        if (pendingIntent == null && k65Var == null) {
            sz6.p("pendingIntent or createCredentialResponse must be specified.");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int iK0 = xn5.K0(parcel, 20293);
        xn5.E0(parcel, 1, this.E, i);
        xn5.E0(parcel, 2, this.F, i);
        xn5.L0(parcel, iK0);
    }
}
