package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class rjk extends a4 {
    public static final Parcelable.Creator<rjk> CREATOR = new pak(26);
    public final boolean E;
    public final wik F;

    public rjk(boolean z, wik wikVar) {
        this.E = z;
        this.F = wikVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rjk)) {
            return false;
        }
        rjk rjkVar = (rjk) obj;
        return this.E == rjkVar.E && gb9.v(this.F, rjkVar.F);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.E), this.F});
    }

    public final JSONObject l0() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.E) {
                jSONObject.put("enabled", true);
            }
            wik wikVar = this.F;
            byte[] bArrO = wikVar == null ? null : wikVar.o();
            if (bArrO != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(bArrO, 32), 11));
                if (bArrO.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(bArrO, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e) {
            xh6.f("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e);
            return null;
        }
    }

    public final String toString() {
        return ij0.j("AuthenticationExtensionsPrfOutputs{", l0().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E ? 1 : 0);
        wik wikVar = this.F;
        xn5.z0(parcel, 2, wikVar == null ? null : wikVar.o());
        xn5.L0(parcel, iK0);
    }
}
