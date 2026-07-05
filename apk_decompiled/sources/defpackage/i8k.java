package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: loaded from: classes3.dex */
public final class i8k extends a4 {
    public static final Parcelable.Creator<i8k> CREATOR = new zwj(20);
    public final LocationRequest E;

    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i8k(com.google.android.gms.location.LocationRequest r11, java.util.ArrayList r12, boolean r13, boolean r14, boolean r15, boolean r16, long r17) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i8k.<init>(com.google.android.gms.location.LocationRequest, java.util.ArrayList, boolean, boolean, boolean, boolean, long):void");
    }

    public static i8k l0(LocationRequest locationRequest) {
        return new i8k(locationRequest, null, false, false, false, false, Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i8k) {
            return gb9.v(this.E, ((i8k) obj).E);
        }
        return false;
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    public final String toString() {
        return this.E.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.E0(parcel, 1, this.E, i);
        xn5.L0(parcel, iK0);
    }
}
