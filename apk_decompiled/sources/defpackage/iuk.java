package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class iuk extends a4 {
    public static final Parcelable.Creator<iuk> CREATOR = new xok(16);
    public final Uri E;
    public final int F;

    public iuk(Uri uri, int i) {
        this.E = uri;
        this.F = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof iuk)) {
            return false;
        }
        iuk iukVar = (iuk) obj;
        return Objects.equals(this.E, iukVar.E) && this.F == iukVar.F;
    }

    public final int hashCode() {
        return Objects.hash(this.E, Integer.valueOf(this.F));
    }

    public final String toString() {
        lrb lrbVar = new lrb(getClass().getSimpleName(), 24);
        lrbVar.U("uri", this.E);
        String strValueOf = String.valueOf(this.F);
        fqj fqjVar = new fqj(23, false);
        ((lrb) lrbVar.H).H = fqjVar;
        lrbVar.H = fqjVar;
        fqjVar.G = strValueOf;
        fqjVar.F = "filterType";
        return lrbVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.E0(parcel, 1, this.E, i);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.F);
        xn5.L0(parcel, iK0);
    }
}
