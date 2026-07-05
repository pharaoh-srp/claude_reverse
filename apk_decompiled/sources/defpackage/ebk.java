package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ebk extends a4 {
    public static final Parcelable.Creator<ebk> CREATOR = new pak(16);
    public final wik E;
    public final wik F;

    public ebk(wik wikVar, wik wikVar2) {
        this.E = wikVar;
        this.F = wikVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ebk)) {
            return false;
        }
        ebk ebkVar = (ebk) obj;
        return gb9.v(this.E, ebkVar.E) && gb9.v(this.F, ebkVar.F);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, this.F});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        wik wikVar = this.E;
        xn5.z0(parcel, 1, wikVar == null ? null : wikVar.o());
        wik wikVar2 = this.F;
        xn5.z0(parcel, 2, wikVar2 != null ? wikVar2.o() : null);
        xn5.L0(parcel, iK0);
    }
}
