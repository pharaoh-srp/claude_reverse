package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public final class mqi extends a4 {
    public static final Parcelable.Creator<mqi> CREATOR = new gqj(28);
    public final List E;

    public mqi(ArrayList arrayList) {
        this.E = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mqi)) {
            return false;
        }
        List list = ((mqi) obj).E;
        List list2 = this.E;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        List list = this.E;
        return Arrays.hashCode(new Object[]{list == null ? null : new HashSet(list)});
    }

    public final JSONArray l0() {
        try {
            JSONArray jSONArray = new JSONArray();
            List list = this.E;
            if (list != null) {
                for (int i = 0; i < list.size(); i++) {
                    nqi nqiVar = (nqi) list.get(i);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) nqiVar.G);
                    jSONArray2.put((int) nqiVar.F);
                    jSONArray2.put((int) nqiVar.G);
                    jSONArray.put(i, jSONArray2);
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            xh6.f("Error encoding UvmEntries to JSON object", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.I0(parcel, 1, this.E);
        xn5.L0(parcel, iK0);
    }
}
