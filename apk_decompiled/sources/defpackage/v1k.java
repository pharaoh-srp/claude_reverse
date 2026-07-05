package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class v1k extends a4 {
    public static final Parcelable.Creator<v1k> CREATOR = new zwj(9);
    public final int E;
    public final String F;

    public v1k(int i, String str) {
        this.E = i;
        this.F = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1k)) {
            return false;
        }
        v1k v1kVar = (v1k) obj;
        return this.E == v1kVar.E && Objects.equals(this.F, v1kVar.F);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.E), this.F);
    }

    public final String toString() {
        String strG;
        int i = this.E;
        switch (i) {
            case -9:
                strG = "Migration was cancelled";
                break;
            case -8:
                strG = "Another migration is already in progress";
                break;
            case -7:
                strG = "Connect message malformed";
                break;
            case -6:
                strG = "Migration status mismatch between watch and phone";
                break;
            case -5:
                strG = "Phone switching feature disabled";
                break;
            case -4:
                strG = "Did not receive connect msg";
                break;
            case -3:
                strG = "No bluetooth connection";
                break;
            case -2:
                strG = "Accounts mismatch";
                break;
            case -1:
                strG = "Unknown failure";
                break;
            case 0:
                strG = "Connected";
                break;
            case 1:
                strG = "Connection handshake in progress";
                break;
            case 2:
                strG = "Connection handshake complete";
                break;
            case 3:
                strG = "Sync with old node suspended";
                break;
            case 4:
                strG = "Control plane transport connected";
                break;
            case 5:
                strG = "Accounts Matched";
                break;
            case 6:
                strG = "Association to watch terminated";
                break;
            default:
                strG = ij0.g(i, "Unrecognized state value: ", new StringBuilder(String.valueOf(i).length() + 26));
                break;
        }
        return ij0.k("ConnectionStateEvent: address: ", this.F, ", state: ", strG);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E);
        xn5.F0(parcel, 2, this.F);
        xn5.L0(parcel, iK0);
    }
}
