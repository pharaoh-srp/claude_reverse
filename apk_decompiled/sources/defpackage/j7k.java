package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class j7k extends a4 {
    public static final Parcelable.Creator<j7k> CREATOR = new pak(3);
    public final int E;
    public final String F;
    public final String G;
    public final String H;
    public final qak I;
    public final j7k J;

    static {
        Process.myUid();
        Process.myPid();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, uak] */
    /* JADX WARN: Type inference failed for: r7v5 */
    public j7k(int i, String str, String str2, String str3, ArrayList arrayList, j7k j7kVar) {
        str.getClass();
        if (j7kVar != null && j7kVar.J != null) {
            sz6.p("Failed requirement.");
            throw null;
        }
        this.E = i;
        this.F = str;
        this.G = str2;
        this.H = str3 == null ? j7kVar != null ? j7kVar.H : null : str3;
        if (arrayList == 0) {
            arrayList = j7kVar != null ? j7kVar.I : 0;
            if (arrayList == 0) {
                arrayList = qak.l();
                arrayList.getClass();
            }
        }
        qak qakVarM = qak.m(arrayList);
        qakVarM.getClass();
        this.I = qakVarM;
        this.J = j7kVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j7k)) {
            return false;
        }
        j7k j7kVar = (j7k) obj;
        return this.E == j7kVar.E && x44.r(this.F, j7kVar.F) && x44.r(this.G, j7kVar.G) && x44.r(this.H, j7kVar.H) && x44.r(this.J, j7kVar.J) && x44.r(this.I, j7kVar.I);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.E), this.F, this.G, this.H, this.J});
    }

    public final String toString() {
        String str = this.F;
        int length = str.length() + 18;
        String str2 = this.G;
        StringBuilder sb = new StringBuilder(length + (str2 != null ? str2.length() : 0));
        sb.append(this.E);
        sb.append("/");
        sb.append(str);
        if (str2 != null) {
            sb.append("[");
            if (isg.q0(str2, str, false)) {
                sb.append((CharSequence) str2, str.length(), str2.length());
            } else {
                sb.append(str2);
            }
            sb.append("]");
        }
        String str3 = this.H;
        if (str3 != null) {
            sb.append("/");
            sb.append(Integer.toHexString(str3.hashCode()));
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E);
        xn5.F0(parcel, 3, this.F);
        xn5.F0(parcel, 4, this.G);
        xn5.F0(parcel, 6, this.H);
        xn5.E0(parcel, 7, this.J, i);
        xn5.I0(parcel, 8, this.I);
        xn5.L0(parcel, iK0);
    }
}
