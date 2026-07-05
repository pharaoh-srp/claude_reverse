package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class y61 extends a4 {
    public static final Parcelable.Creator<y61> CREATOR = new zwj(4);
    public final mqi E;
    public final ebk F;
    public final z61 G;
    public final rjk H;
    public final String I;

    public y61(mqi mqiVar, ebk ebkVar, z61 z61Var, rjk rjkVar, String str) {
        this.E = mqiVar;
        this.F = ebkVar;
        this.G = z61Var;
        this.H = rjkVar;
        this.I = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y61)) {
            return false;
        }
        y61 y61Var = (y61) obj;
        return gb9.v(this.E, y61Var.E) && gb9.v(this.F, y61Var.F) && gb9.v(this.G, y61Var.G) && gb9.v(this.H, y61Var.H) && gb9.v(this.I, y61Var.I);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, this.F, this.G, this.H, this.I});
    }

    public final JSONObject l0() {
        try {
            JSONObject jSONObject = new JSONObject();
            z61 z61Var = this.G;
            if (z61Var != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", z61Var.E);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e);
                }
            }
            mqi mqiVar = this.E;
            if (mqiVar != null) {
                jSONObject.put("uvm", mqiVar.l0());
            }
            rjk rjkVar = this.H;
            if (rjkVar != null) {
                jSONObject.put("prf", rjkVar.l0());
            }
            String str = this.I;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e2) {
            xh6.f("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e2);
            return null;
        }
    }

    public final String toString() {
        return ij0.j("AuthenticationExtensionsClientOutputs{", l0().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.E0(parcel, 1, this.E, i);
        xn5.E0(parcel, 2, this.F, i);
        xn5.E0(parcel, 3, this.G, i);
        xn5.E0(parcel, 4, this.H, i);
        xn5.F0(parcel, 5, this.I);
        xn5.L0(parcel, iK0);
    }
}
