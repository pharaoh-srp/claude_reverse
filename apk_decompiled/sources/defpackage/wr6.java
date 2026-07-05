package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.ErrorCode$UnsupportedErrorCodeException;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public enum wr6 implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);

    public static final Parcelable.Creator<wr6> CREATOR = new o1l(12);
    public final int E;

    wr6(int i) {
        this.E = i;
    }

    public static wr6 a(int i) throws ErrorCode$UnsupportedErrorCodeException {
        for (wr6 wr6Var : values()) {
            if (i == wr6Var.E) {
                return wr6Var;
            }
        }
        Locale locale = Locale.US;
        throw new ErrorCode$UnsupportedErrorCodeException(grc.u("Error code ", i, " is not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.E);
    }
}
