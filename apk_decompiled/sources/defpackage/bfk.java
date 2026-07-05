package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class bfk extends a4 {
    public static final Parcelable.Creator<bfk> CREATOR = new pak(22);
    public final List E;

    public bfk(ArrayList arrayList) {
        this.E = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bfk) {
            return Objects.equals(this.E, ((bfk) obj).E);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.E);
    }

    public final String toString() {
        lrb lrbVar = new lrb(getClass().getSimpleName(), 24);
        lrbVar.U("dataItemFilters", this.E);
        return lrbVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.I0(parcel, 1, this.E);
        xn5.L0(parcel, iK0);
    }
}
