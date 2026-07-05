package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class vb1 implements Parcelable {
    public static final Parcelable.Creator<vb1> CREATOR = new dpj(6);
    public final ArrayList E;
    public final ArrayList F;

    public vb1(Parcel parcel) {
        this.E = parcel.createStringArrayList();
        this.F = parcel.createTypedArrayList(ub1.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.E);
        parcel.writeTypedList(this.F);
    }
}
