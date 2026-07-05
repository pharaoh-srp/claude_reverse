package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.Attachment$UnsupportedAttachmentException;

/* JADX INFO: loaded from: classes3.dex */
public enum b21 implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    PLATFORM("platform"),
    /* JADX INFO: Fake field, exist only in values array */
    CROSS_PLATFORM("cross-platform");

    public static final Parcelable.Creator<b21> CREATOR = new zmj(23);
    public final String E;

    b21(String str) {
        this.E = str;
    }

    public static b21 a(String str) {
        for (b21 b21Var : values()) {
            if (str.equals(b21Var.E)) {
                return b21Var;
            }
        }
        throw new Attachment$UnsupportedAttachmentException(ij0.j("Attachment ", str, " not supported"));
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
