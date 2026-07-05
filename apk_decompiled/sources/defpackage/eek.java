package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class eek extends a4 {
    public static final Parcelable.Creator<eek> CREATOR = new pak(14);
    public final int E;
    public final List F;
    public final List G;

    public eek(int i, ArrayList arrayList, ArrayList arrayList2) {
        this.E = i;
        this.F = arrayList;
        this.G = arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E);
        xn5.G0(parcel, 2, this.F);
        xn5.G0(parcel, 3, this.G);
        xn5.L0(parcel, iK0);
    }
}
