package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public final class ybk extends a4 {
    public static final Parcelable.Creator<ybk> CREATOR = new pak(6);
    public final int E;
    public final ConnectionConfiguration[] F;

    public ybk(int i, ConnectionConfiguration[] connectionConfigurationArr) {
        this.E = i;
        this.F = connectionConfigurationArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.E);
        xn5.H0(parcel, 3, this.F, i);
        xn5.L0(parcel, iK0);
    }
}
