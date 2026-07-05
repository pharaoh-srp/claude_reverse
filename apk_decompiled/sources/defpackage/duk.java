package defpackage;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public final class duk extends yoj {
    public p7k j;

    @Override // defpackage.yoj
    public final void H(jqk jqkVar) {
        String strR;
        int i = jqkVar.E;
        switch (i) {
            case 4000:
                strR = "TARGET_NODE_NOT_CONNECTED";
                break;
            case 4001:
                strR = "DUPLICATE_LISTENER";
                break;
            case 4002:
                strR = "UNKNOWN_LISTENER";
                break;
            case 4003:
                strR = "DATA_ITEM_TOO_LARGE";
                break;
            case 4004:
                strR = "INVALID_TARGET_NODE";
                break;
            case 4005:
                strR = "ASSET_UNAVAILABLE";
                break;
            case 4006:
                strR = "DUPLICATE_CAPABILITY";
                break;
            case 4007:
                strR = "UNKNOWN_CAPABILITY";
                break;
            case 4008:
                strR = "WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED";
                break;
            case 4009:
                strR = "UNSUPPORTED_BY_TARGET";
                break;
            case 4010:
                strR = "ACCOUNT_KEY_CREATION_FAILED";
                break;
            case 4011:
            default:
                strR = okk.r(i);
                break;
            case 4012:
                strR = "MIGRATION_NOT_CANCELLABLE";
                break;
            case 4013:
                strR = "NO_MIGRATION_FOUND_TO_CANCEL";
                break;
            case 4014:
                strR = "FEATURE_DISABLED";
                break;
            case 4015:
                strR = "WIFI_CONNECTION_FAILED";
                break;
        }
        Status status = new Status(i, strR, null, null);
        int i2 = jqkVar.F;
        p7k p7kVar = this.j;
        if (p7kVar != null) {
            kkk.g(status, Integer.valueOf(i2), p7kVar.E);
            this.j = null;
        }
    }
}
