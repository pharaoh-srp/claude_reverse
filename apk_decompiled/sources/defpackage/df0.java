package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
public final class df0 extends a4 {
    public static final Parcelable.Creator<df0> CREATOR = new s38(29);
    public final List E;
    public final boolean F;
    public final String G;
    public final String H;

    public df0(String str, String str2, ArrayList arrayList, boolean z) {
        dgj.v(arrayList);
        this.E = arrayList;
        this.F = z;
        this.G = str;
        this.H = str2;
    }

    public static df0 l0(List list, boolean z) {
        TreeSet treeSet = new TreeSet(mt7.L);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((njc) it.next()).c());
        }
        return new df0(null, null, new ArrayList(treeSet), z);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof df0)) {
            return false;
        }
        df0 df0Var = (df0) obj;
        return this.F == df0Var.F && gb9.v(this.E, df0Var.E) && gb9.v(this.G, df0Var.G) && gb9.v(this.H, df0Var.H);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.F), this.E, this.G, this.H});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.I0(parcel, 1, this.E);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.F ? 1 : 0);
        xn5.F0(parcel, 3, this.G);
        xn5.F0(parcel, 4, this.H);
        xn5.L0(parcel, iK0);
    }
}
