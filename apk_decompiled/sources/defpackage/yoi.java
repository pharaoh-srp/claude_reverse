package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.zzbc;

/* JADX INFO: loaded from: classes3.dex */
public enum yoi implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_REQUIRED("required"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_PREFERRED("preferred"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_DISCOURAGED("discouraged");

    public static final Parcelable.Creator<yoi> CREATOR = new gqj(27);
    public final String E;

    yoi(String str) {
        this.E = str;
    }

    public static yoi a(String str) throws zzbc {
        for (yoi yoiVar : values()) {
            if (str.equals(yoiVar.E)) {
                return yoiVar;
            }
        }
        throw new zzbc(ij0.j("User verification requirement ", str, " not supported"));
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
