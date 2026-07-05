package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ibh extends a4 {
    public static final Parcelable.Creator<ibh> CREATOR = new gsc(3);
    public final int E;
    public List F;

    public ibh(int i, List list) {
        this.E = i;
        this.F = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E);
        xn5.I0(parcel, 2, this.F);
        xn5.L0(parcel, iK0);
    }
}
