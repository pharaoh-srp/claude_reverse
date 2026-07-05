package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class xqi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new yqi(null, new t29(parcel.createByteArray()));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new yqi[i];
    }
}
