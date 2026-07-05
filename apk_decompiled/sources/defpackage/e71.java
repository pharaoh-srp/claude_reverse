package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.Attachment$UnsupportedAttachmentException;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement$UnsupportedResidentKeyRequirementException;
import com.google.android.gms.fido.fido2.api.common.zzbc;
import io.sentry.e0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class e71 extends a4 {
    public static final Parcelable.Creator<e71> CREATOR = new xok(23);
    public final b21 E;
    public final Boolean F;
    public final yoi G;
    public final ome H;

    public e71(Boolean bool, String str, String str2, String str3) {
        b21 b21VarA;
        if (str == null) {
            b21VarA = null;
        } else {
            try {
                b21VarA = b21.a(str);
            } catch (Attachment$UnsupportedAttachmentException | ResidentKeyRequirement$UnsupportedResidentKeyRequirementException | zzbc e) {
                e0.i(e);
                throw null;
            }
        }
        this.E = b21VarA;
        this.F = bool;
        this.G = str2 == null ? null : yoi.a(str2);
        this.H = str3 == null ? null : ome.a(str3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e71)) {
            return false;
        }
        e71 e71Var = (e71) obj;
        return gb9.v(this.E, e71Var.E) && gb9.v(this.F, e71Var.F) && gb9.v(this.G, e71Var.G) && gb9.v(l0(), e71Var.l0());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, this.F, this.G, l0()});
    }

    public final ome l0() {
        ome omeVar = this.H;
        if (omeVar == null) {
            omeVar = null;
            Boolean bool = this.F;
            if (bool != null) {
                if (bool.booleanValue()) {
                    return ome.RESIDENT_KEY_REQUIRED;
                }
                return null;
            }
        }
        return omeVar;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.E);
        String strValueOf2 = String.valueOf(this.G);
        String strValueOf3 = String.valueOf(this.H);
        StringBuilder sbX = sq6.x("AuthenticatorSelectionCriteria{\n attachment=", strValueOf, ", \n requireResidentKey=");
        sbX.append(this.F);
        sbX.append(", \n requireUserVerification=");
        sbX.append(strValueOf2);
        sbX.append(", \n residentKeyRequirement=");
        return ij0.m(sbX, strValueOf3, "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        b21 b21Var = this.E;
        xn5.F0(parcel, 2, b21Var == null ? null : b21Var.E);
        Boolean bool = this.F;
        if (bool != null) {
            xn5.J0(parcel, 3, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        yoi yoiVar = this.G;
        xn5.F0(parcel, 4, yoiVar == null ? null : yoiVar.E);
        ome omeVarL0 = l0();
        xn5.F0(parcel, 5, omeVarL0 != null ? omeVarL0.E : null);
        xn5.L0(parcel, iK0);
    }
}
