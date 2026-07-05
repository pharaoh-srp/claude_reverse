package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.TokenBinding$UnsupportedTokenBindingStatusException;

/* JADX INFO: loaded from: classes3.dex */
public enum jsh implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    PRESENT("present"),
    /* JADX INFO: Fake field, exist only in values array */
    SUPPORTED("supported"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_SUPPORTED("not-supported");

    public static final Parcelable.Creator<jsh> CREATOR = new gqj(21);
    public final String E;

    jsh(String str) {
        this.E = str;
    }

    public static jsh a(String str) throws TokenBinding$UnsupportedTokenBindingStatusException {
        for (jsh jshVar : values()) {
            if (str.equals(jshVar.E)) {
                return jshVar;
            }
        }
        throw new TokenBinding$UnsupportedTokenBindingStatusException(ij0.j("TokenBindingStatus ", str, " not supported"));
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
