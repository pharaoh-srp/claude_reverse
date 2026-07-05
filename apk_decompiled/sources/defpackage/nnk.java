package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: loaded from: classes3.dex */
public final class nnk extends a4 {
    public static final Parcelable.Creator<nnk> CREATOR = new pak(24);
    public final String E;
    public final DataHolder F;

    public nnk(String str, DataHolder dataHolder) {
        this.E = str;
        this.F = dataHolder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.F0(parcel, 1, this.E);
        xn5.E0(parcel, 2, this.F, i);
        xn5.L0(parcel, iK0);
    }
}
