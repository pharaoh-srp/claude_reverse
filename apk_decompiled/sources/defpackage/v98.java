package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class v98 extends a4 {
    public static final Parcelable.Creator<v98> CREATOR = new gqj(1);
    public final boolean E;

    public v98(boolean z) {
        this.E = z;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof v98) && this.E == ((v98) obj).E;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.E)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E ? 1 : 0);
        xn5.L0(parcel, iK0);
    }
}
