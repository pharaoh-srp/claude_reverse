package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tqk extends a4 {
    public static final Parcelable.Creator<tqk> CREATOR = new xok(10);
    public final int E;
    public final long F;
    public final List G;

    public tqk(int i, long j, ArrayList arrayList) {
        this.E = i;
        this.F = j;
        this.G = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.E);
        xn5.J0(parcel, 3, 8);
        parcel.writeLong(this.F);
        xn5.I0(parcel, 4, this.G);
        xn5.L0(parcel, iK0);
    }
}
