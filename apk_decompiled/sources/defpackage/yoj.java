package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import androidx.health.platform.client.proto.g;
import com.pvporbit.freetype.FreeTypeConstants;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yoj extends rlj implements IInterface {
    public yoj() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks", 7);
    }

    @Override // defpackage.rlj
    public final boolean F(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                throw fsh.q(parcel);
            case 3:
                throw fsh.q(parcel);
            case 4:
                throw fsh.q(parcel);
            case 5:
                throw fsh.q(parcel);
            case 6:
                throw fsh.q(parcel);
            case 7:
                jqk jqkVar = (jqk) lyj.a(parcel, jqk.CREATOR);
                lyj.b(parcel);
                H(jqkVar);
                break;
            case 8:
                throw fsh.q(parcel);
            case 9:
                throw fsh.q(parcel);
            case 10:
                throw fsh.q(parcel);
            case 11:
                lyj.b(parcel);
                I();
                break;
            case 12:
                throw fsh.q(parcel);
            case 13:
                throw fsh.q(parcel);
            case 14:
                throw fsh.q(parcel);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                throw fsh.q(parcel);
            case 16:
                throw fsh.q(parcel);
            case g.MAX_FIELD_NUMBER /* 17 */:
                throw fsh.q(parcel);
            case g.AVG_FIELD_NUMBER /* 18 */:
                throw fsh.q(parcel);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                throw fsh.q(parcel);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                throw fsh.q(parcel);
            case 21:
            case 24:
            case BuildConfig.VERSION_CODE /* 25 */:
            case 31:
            case FreeTypeConstants.FT_LOAD_FORCE_AUTOHINT /* 32 */:
            case 33:
            case 44:
            case 45:
            default:
                return false;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                throw fsh.q(parcel);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                throw fsh.q(parcel);
            case 26:
                throw fsh.q(parcel);
            case 27:
                throw fsh.q(parcel);
            case 28:
                throw fsh.q(parcel);
            case 29:
                throw fsh.q(parcel);
            case 30:
                throw fsh.q(parcel);
            case 34:
                throw fsh.q(parcel);
            case 35:
                throw fsh.q(parcel);
            case 36:
                throw fsh.q(parcel);
            case 37:
                throw fsh.q(parcel);
            case 38:
                throw fsh.q(parcel);
            case 39:
                throw fsh.q(parcel);
            case 40:
                throw fsh.q(parcel);
            case 41:
                throw fsh.q(parcel);
            case 42:
                throw fsh.q(parcel);
            case 43:
                throw fsh.q(parcel);
            case 46:
                throw fsh.q(parcel);
            case 47:
                throw fsh.q(parcel);
            case mdj.f /* 48 */:
                throw fsh.q(parcel);
            case 49:
                throw fsh.q(parcel);
            case 50:
                throw fsh.q(parcel);
            case 51:
                throw fsh.q(parcel);
            case 52:
                throw fsh.q(parcel);
        }
        parcel2.writeNoException();
        return true;
    }

    public void H(jqk jqkVar) {
        throw new UnsupportedOperationException();
    }

    public void I() {
        throw new UnsupportedOperationException();
    }
}
