package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.AppTheme;

/* JADX INFO: loaded from: classes3.dex */
public final class u8k extends a4 {
    public static final Parcelable.Creator<u8k> CREATOR = new zwj(23);
    public final int E;
    public final AppTheme F;

    public u8k(int i, AppTheme appTheme) {
        this.E = i;
        this.F = appTheme;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.E);
        xn5.E0(parcel, 3, this.F, i);
        xn5.L0(parcel, iK0);
    }
}
