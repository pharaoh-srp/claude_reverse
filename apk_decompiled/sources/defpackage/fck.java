package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fck extends a4 {
    public static final Parcelable.Creator<fck> CREATOR = new pak(7);
    public final int E;
    public final List F;

    public fck(int i, ArrayList arrayList) {
        this.E = i;
        this.F = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.E);
        xn5.I0(parcel, 3, this.F);
        xn5.L0(parcel, iK0);
    }
}
