package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a4;
import defpackage.dgj;
import defpackage.ij0;
import defpackage.xn5;
import defpackage.zwj;

/* JADX INFO: loaded from: classes3.dex */
public class DataItemAssetParcelable extends a4 implements ReflectedParcelable {
    public static final Parcelable.Creator<DataItemAssetParcelable> CREATOR = new zwj(13);
    public final String E;
    public final String F;

    public DataItemAssetParcelable(DataItemAssetParcelable dataItemAssetParcelable) {
        String str = dataItemAssetParcelable.E;
        dgj.v(str);
        this.E = str;
        String str2 = dataItemAssetParcelable.F;
        dgj.v(str2);
        this.F = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataItemAssetParcelable[@");
        sb.append(Integer.toHexString(hashCode()));
        String str = this.E;
        if (str == null) {
            sb.append(",noid");
        } else {
            sb.append(",");
            sb.append(str);
        }
        sb.append(", key=");
        return ij0.m(sb, this.F, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.F0(parcel, 2, this.E);
        xn5.F0(parcel, 3, this.F);
        xn5.L0(parcel, iK0);
    }

    public DataItemAssetParcelable(String str, String str2) {
        this.E = str;
        this.F = str2;
    }
}
