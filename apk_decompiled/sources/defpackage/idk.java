package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class idk extends a4 {
    public static final Parcelable.Creator<idk> CREATOR = new pak(11);
    public final int E;
    public final List F;

    public idk(int i, ArrayList arrayList) {
        this.E = i;
        this.F = arrayList;
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
