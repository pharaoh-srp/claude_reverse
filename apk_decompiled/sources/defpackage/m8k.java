package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class m8k extends a4 {
    public static final Parcelable.Creator<m8k> CREATOR = new zwj(21);
    public final int E;
    public final List F;

    public m8k(int i, ArrayList arrayList) {
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
