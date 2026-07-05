package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public final class uea extends a4 implements kre {
    public static final Parcelable.Creator<uea> CREATOR = new gqj(5);
    public final Status E;
    public final vea F;

    public uea(Status status, vea veaVar) {
        this.E = status;
        this.F = veaVar;
    }

    @Override // defpackage.kre
    public final Status e() {
        return this.E;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.E0(parcel, 1, this.E, i);
        xn5.E0(parcel, 2, this.F, i);
        xn5.L0(parcel, iK0);
    }
}
