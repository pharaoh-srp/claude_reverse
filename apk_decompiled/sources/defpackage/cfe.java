package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class cfe extends a4 {
    public static final Parcelable.Creator<cfe> CREATOR = new s38(19);
    public final Bundle E;
    public bp0 F;
    public yzd G;

    public cfe(Bundle bundle) {
        this.E = bundle;
    }

    public final Map l0() {
        if (this.F == null) {
            bp0 bp0Var = new bp0(0);
            Bundle bundle = this.E;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        bp0Var.put(str, str2);
                    }
                }
            }
            this.F = bp0Var;
        }
        return this.F;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.y0(parcel, 2, this.E);
        xn5.L0(parcel, iK0);
    }
}
