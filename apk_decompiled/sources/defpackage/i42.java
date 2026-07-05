package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class i42 implements Parcelable {
    public static final Parcelable.Creator<i42> CREATOR = new o1l(1);
    public final ot E;

    public i42(ot otVar) {
        this.E = otVar;
    }

    public static i42 a(int i) throws COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException {
        ot otVar;
        if (i == -262) {
            otVar = v0e.RS1;
        } else {
            v0e[] v0eVarArrValues = v0e.values();
            int length = v0eVarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    for (ti6 ti6Var : ti6.values()) {
                        if (ti6Var.E == i) {
                            otVar = ti6Var;
                        }
                    }
                    throw new COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException(grc.u("Algorithm with COSE value ", i, " not supported"));
                }
                v0e v0eVar = v0eVarArrValues[i2];
                if (v0eVar.E == i) {
                    otVar = v0eVar;
                    break;
                }
                i2++;
            }
        }
        return new i42(otVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof i42) && this.E.a() == ((i42) obj).E.a();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E});
    }

    public final String toString() {
        return ij0.j("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.E), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.E.a());
    }
}
