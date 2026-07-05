package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class v4f extends a4 {
    public static final Parcelable.Creator<v4f> CREATOR = new zmj(16);
    public final l6g E;
    public final String F;
    public final int G;

    public v4f(l6g l6gVar, String str, int i) {
        dgj.v(l6gVar);
        this.E = l6gVar;
        this.F = str;
        this.G = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v4f)) {
            return false;
        }
        v4f v4fVar = (v4f) obj;
        return gb9.v(this.E, v4fVar.E) && gb9.v(this.F, v4fVar.F) && this.G == v4fVar.G;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, this.F});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.E0(parcel, 1, this.E, i);
        xn5.F0(parcel, 2, this.F);
        xn5.J0(parcel, 3, 4);
        parcel.writeInt(this.G);
        xn5.L0(parcel, iK0);
    }
}
