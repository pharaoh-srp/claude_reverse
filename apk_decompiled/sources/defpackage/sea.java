package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class sea extends a4 {
    public static final Parcelable.Creator<sea> CREATOR = new gsc(7);
    public final List E;
    public final boolean F;
    public final boolean G;

    public sea(ArrayList arrayList, boolean z, boolean z2) {
        this.E = arrayList;
        this.F = z;
        this.G = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.I0(parcel, 1, Collections.unmodifiableList(this.E));
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.F ? 1 : 0);
        xn5.J0(parcel, 3, 4);
        parcel.writeInt(this.G ? 1 : 0);
        xn5.L0(parcel, iK0);
    }
}
