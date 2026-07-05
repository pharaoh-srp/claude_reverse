package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class knj extends a4 implements kre {
    public static final Parcelable.Creator<knj> CREATOR = new zmj(3);
    public final List E;
    public final String F;

    public knj(String str, ArrayList arrayList) {
        this.E = arrayList;
        this.F = str;
    }

    @Override // defpackage.kre
    public final Status e() {
        return this.F != null ? Status.I : Status.M;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.G0(parcel, 1, this.E);
        xn5.F0(parcel, 2, this.F);
        xn5.L0(parcel, iK0);
    }
}
