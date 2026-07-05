package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public final class rbk extends a4 {
    public static final Parcelable.Creator<rbk> CREATOR = new pak(5);
    public final int E;
    public final ConnectionConfiguration F;

    public rbk(int i, ConnectionConfiguration connectionConfiguration) {
        this.E = i;
        this.F = connectionConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.E);
        xn5.E0(parcel, 3, this.F, i);
        xn5.L0(parcel, iK0);
    }
}
