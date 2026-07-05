package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement$UnsupportedResidentKeyRequirementException;

/* JADX INFO: loaded from: classes3.dex */
public enum ome implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    /* JADX INFO: Fake field, exist only in values array */
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");

    public static final Parcelable.Creator<ome> CREATOR = new gqj(19);
    public final String E;

    ome(String str) {
        this.E = str;
    }

    public static ome a(String str) throws ResidentKeyRequirement$UnsupportedResidentKeyRequirementException {
        for (ome omeVar : values()) {
            if (str.equals(omeVar.E)) {
                return omeVar;
            }
        }
        throw new ResidentKeyRequirement$UnsupportedResidentKeyRequirementException(ij0.j("Resident key requirement ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.E;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.E);
    }
}
