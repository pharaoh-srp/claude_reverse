package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class p1l extends a4 {
    public static final Parcelable.Creator<p1l> CREATOR = new o1l(3);
    public final int E;
    public final List F;
    public final hwk G;

    public p1l(int i, ArrayList arrayList, hwk hwkVar) {
        this.E = i;
        this.F = arrayList;
        this.G = hwkVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E);
        xn5.I0(parcel, 2, this.F);
        xn5.E0(parcel, 3, this.G, i);
        xn5.L0(parcel, iK0);
    }
}
