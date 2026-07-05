package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException;

/* JADX INFO: loaded from: classes3.dex */
public enum k31 implements Parcelable {
    NONE("none"),
    /* JADX INFO: Fake field, exist only in values array */
    INDIRECT("indirect"),
    /* JADX INFO: Fake field, exist only in values array */
    DIRECT("direct");

    public static final Parcelable.Creator<k31> CREATOR = new gqj(25);
    public final String E;

    k31(String str) {
        this.E = str;
    }

    public static k31 a(String str) throws AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException {
        for (k31 k31Var : values()) {
            if (str.equals(k31Var.E)) {
                return k31Var;
            }
        }
        throw new AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException(ij0.j("Attestation conveyance preference ", str, " not supported"));
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
