package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class hwk extends a4 {
    public static final Parcelable.Creator<hwk> CREATOR = new pak(21);
    public final String E;
    public final int F;
    public final int G;

    public hwk(String str, int i, int i2) {
        this.E = str;
        this.F = i;
        this.G = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hwk.class == obj.getClass()) {
            hwk hwkVar = (hwk) obj;
            if (this.F == hwkVar.F && this.G == hwkVar.G && Objects.equals(this.E, hwkVar.E)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.E, Integer.valueOf(this.F), Integer.valueOf(this.G));
    }

    public final String toString() {
        Locale locale = Locale.US;
        return ij0.m(vb7.v("WebIconParcelable{", "x", this.F, this.G, " - "), this.E, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.F0(parcel, 1, this.E);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.F);
        xn5.J0(parcel, 3, 4);
        parcel.writeInt(this.G);
        xn5.L0(parcel, iK0);
    }
}
