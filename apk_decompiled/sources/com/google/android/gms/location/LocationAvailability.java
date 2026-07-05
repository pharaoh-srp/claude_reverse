package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a4;
import defpackage.qrj;
import defpackage.xn5;
import defpackage.zmj;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class LocationAvailability extends a4 implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new zmj(26);
    public final int E;
    public final int F;
    public final long G;
    public final int H;
    public final qrj[] I;

    public LocationAvailability(int i, int i2, int i3, long j, qrj[] qrjVarArr) {
        this.H = i < 1000 ? 0 : 1000;
        this.E = i2;
        this.F = i3;
        this.G = j;
        this.I = qrjVarArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.E == locationAvailability.E && this.F == locationAvailability.F && this.G == locationAvailability.G && this.H == locationAvailability.H && Arrays.equals(this.I, locationAvailability.I)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.H)});
    }

    public final String toString() {
        boolean z = this.H < 1000;
        StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 22);
        sb.append("LocationAvailability[");
        sb.append(z);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.F);
        xn5.J0(parcel, 3, 8);
        parcel.writeLong(this.G);
        xn5.J0(parcel, 4, 4);
        int i2 = this.H;
        parcel.writeInt(i2);
        xn5.H0(parcel, 5, this.I, i);
        int i3 = i2 >= 1000 ? 0 : 1;
        xn5.J0(parcel, 6, 4);
        parcel.writeInt(i3);
        xn5.L0(parcel, iK0);
    }
}
