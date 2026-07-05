package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cnk extends a4 {
    public static final Parcelable.Creator<cnk> CREATOR = new xok(8);
    public final List E;
    public final List F;
    public final List G;

    public cnk(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.E = arrayList;
        this.F = arrayList2;
        this.G = arrayList3;
    }

    public final String toString() {
        lrb lrbVar = new lrb(getClass().getSimpleName(), 24);
        lrbVar.U("allowedDataItemFilters", this.E);
        lrbVar.U("allowedCapabilities", this.F);
        lrbVar.U("allowedPackages", this.G);
        return lrbVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.I0(parcel, 1, this.E);
        xn5.G0(parcel, 2, this.F);
        xn5.G0(parcel, 3, this.G);
        xn5.L0(parcel, iK0);
    }
}
