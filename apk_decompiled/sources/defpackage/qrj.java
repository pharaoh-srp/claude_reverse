package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class qrj extends a4 {
    public static final Parcelable.Creator<qrj> CREATOR = new gqj(9);
    public final int E;
    public final int F;
    public final long G;
    public final long H;

    public qrj(int i, int i2, long j, long j2) {
        this.E = i;
        this.F = i2;
        this.G = j;
        this.H = j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qrj) {
            qrj qrjVar = (qrj) obj;
            if (this.E == qrjVar.E && this.F == qrjVar.F && this.G == qrjVar.G && this.H == qrjVar.H) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.F), Integer.valueOf(this.E), Long.valueOf(this.H), Long.valueOf(this.G)});
    }

    public final String toString() {
        int i = this.E;
        int length = String.valueOf(i).length();
        int i2 = this.F;
        int length2 = String.valueOf(i2).length();
        long j = this.H;
        int length3 = String.valueOf(j).length();
        long j2 = this.G;
        StringBuilder sb = new StringBuilder(length + 50 + length2 + 18 + length3 + 17 + String.valueOf(j2).length());
        ij0.s(i, i2, "NetworkLocationStatus: Wifi status: ", " Cell status: ", sb);
        ij0.u(j, " elapsed time NS: ", " system time ms: ", sb);
        sb.append(j2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.F);
        xn5.J0(parcel, 3, 8);
        parcel.writeLong(this.G);
        xn5.J0(parcel, 4, 8);
        parcel.writeLong(this.H);
        xn5.L0(parcel, iK0);
    }
}
