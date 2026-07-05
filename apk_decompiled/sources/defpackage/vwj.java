package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class vwj extends a4 {
    public static final Parcelable.Creator<vwj> CREATOR = new zwj(0);
    public final lzj E;
    public final int F;
    public final int G;
    public final int H;

    public vwj(lzj lzjVar, int i, int i2, int i3) {
        this.E = lzjVar;
        this.F = i;
        this.G = i2;
        this.H = i3;
    }

    public final void l0(hh2 hh2Var) {
        lzj lzjVar = this.E;
        int i = this.F;
        if (i == 1) {
            hh2Var.b(lzjVar);
            return;
        }
        if (i == 2) {
            hh2Var.d(lzjVar);
            return;
        }
        if (i == 3) {
            hh2Var.c(lzjVar);
            return;
        }
        if (i == 4) {
            hh2Var.a(lzjVar);
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 14);
        sb.append("Unknown type: ");
        sb.append(i);
        Log.w("ChannelEventParcelable", sb.toString());
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.E);
        int i = this.F;
        String string = i != 1 ? i != 2 ? i != 3 ? i != 4 ? Integer.toString(i) : "OUTPUT_CLOSED" : "INPUT_CLOSED" : "CHANNEL_CLOSED" : "CHANNEL_OPENED";
        int i2 = this.G;
        String string2 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? Integer.toString(i2) : "CLOSE_REASON_LOCAL_CLOSE" : "CLOSE_REASON_REMOTE_CLOSE" : "CLOSE_REASON_DISCONNECTED" : "CLOSE_REASON_NORMAL";
        int length = String.valueOf(string2).length() + String.valueOf(string).length() + strValueOf.length() + 40 + 14;
        int i3 = this.H;
        StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + length + 15 + 1);
        kgh.u(sb, "ChannelEventParcelable[, channel=", strValueOf, ", type=", string);
        sb.append(", closeReason=");
        sb.append(string2);
        sb.append(", appErrorCode=");
        sb.append(i3);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.E0(parcel, 2, this.E, i);
        xn5.J0(parcel, 3, 4);
        parcel.writeInt(this.F);
        xn5.J0(parcel, 4, 4);
        parcel.writeInt(this.G);
        xn5.J0(parcel, 5, 4);
        parcel.writeInt(this.H);
        xn5.L0(parcel, iK0);
    }
}
