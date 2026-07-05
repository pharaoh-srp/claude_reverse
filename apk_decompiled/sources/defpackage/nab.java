package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class nab implements Parcelable {

    @Deprecated
    public static final Parcelable.Creator<nab> CREATOR = new s38(7);
    public final String E;
    public final Map F;

    public nab(String str, Map map) {
        this.E = str;
        this.F = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nab)) {
            return false;
        }
        nab nabVar = (nab) obj;
        return x44.r(this.E, nabVar.E) && x44.r(this.F, nabVar.F);
    }

    public final int hashCode() {
        return this.F.hashCode() + (this.E.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.E + ", extras=" + this.F + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.E);
        Map map = this.F;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }
}
