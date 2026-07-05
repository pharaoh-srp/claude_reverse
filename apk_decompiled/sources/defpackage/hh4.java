package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.proto.g;
import java.util.Arrays;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class hh4 extends a4 {
    public final int E;
    public final int F;
    public final PendingIntent G;
    public final String H;
    public final Integer I;
    public static final hh4 J = new hh4(0, null, null);
    public static final Parcelable.Creator<hh4> CREATOR = new gsc(5);

    public hh4(int i, int i2, PendingIntent pendingIntent, String str, Integer num) {
        this.E = i;
        this.F = i2;
        this.G = pendingIntent;
        this.H = str;
        this.I = num;
    }

    public static String l0(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case g.MAX_FIELD_NUMBER /* 17 */:
                        return "SIGN_IN_FAILED";
                    case g.AVG_FIELD_NUMBER /* 18 */:
                        return "SERVICE_UPDATING";
                    case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return "SERVICE_MISSING_PERMISSION";
                    case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case BuildConfig.VERSION_CODE /* 25 */:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hh4)) {
            return false;
        }
        hh4 hh4Var = (hh4) obj;
        return this.F == hh4Var.F && gb9.v(this.G, hh4Var.G) && gb9.v(this.H, hh4Var.H) && gb9.v(this.I, hh4Var.I);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.F), this.G, this.H, this.I});
    }

    public final String toString() {
        q28 q28Var = new q28(this);
        q28Var.c("statusCode", l0(this.F));
        q28Var.c("resolution", this.G);
        q28Var.c("message", this.H);
        q28Var.c("clientMethodKey", this.I);
        return q28Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.J0(parcel, 1, 4);
        parcel.writeInt(this.E);
        xn5.J0(parcel, 2, 4);
        parcel.writeInt(this.F);
        xn5.E0(parcel, 3, this.G, i);
        xn5.F0(parcel, 4, this.H);
        xn5.C0(parcel, 5, this.I);
        xn5.L0(parcel, iK0);
    }

    public hh4(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str, null);
    }
}
