package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class xvd implements Parcelable {

    /* JADX INFO: Fake field, exist only in values array */
    xvd EF5;
    public static final /* synthetic */ xvd[] E = {new xvd("PUBLIC_KEY", 0)};
    public static final Parcelable.Creator<xvd> CREATOR = new gqj(17);

    public static xvd a(String str) throws PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException {
        for (xvd xvdVar : values()) {
            xvdVar.getClass();
            if (str.equals("public-key")) {
                return xvdVar;
            }
        }
        throw new PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException(ij0.j("PublicKeyCredentialType ", str, " not supported"));
    }

    public static xvd valueOf(String str) {
        return (xvd) Enum.valueOf(xvd.class, str);
    }

    public static xvd[] values() {
        return (xvd[]) E.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "public-key";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString("public-key");
    }
}
