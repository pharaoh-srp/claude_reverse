package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class z4l extends a4 {
    public static final Parcelable.Creator<z4l> CREATOR = new o1l(11);
    public final int E;
    public final boolean F;

    public z4l(int i, boolean z) {
        this.E = i;
        this.F = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4l)) {
            return false;
        }
        z4l z4lVar = (z4l) obj;
        return this.E == z4lVar.E && this.F == z4lVar.F;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.E), Boolean.valueOf(this.F));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.F ? 1 : 0);
        xn5.L0(parcel, iK0);
    }
}
