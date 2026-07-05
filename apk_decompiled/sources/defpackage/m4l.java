package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class m4l extends a4 {
    public static final Parcelable.Creator<m4l> CREATOR = new o1l(9);
    public final List E;

    public m4l(ArrayList arrayList) {
        dgj.v(arrayList);
        this.E = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m4l)) {
            return false;
        }
        List list = ((m4l) obj).E;
        List list2 = this.E;
        return list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.E)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.I0(parcel, 1, this.E);
        xn5.L0(parcel, iK0);
    }
}
