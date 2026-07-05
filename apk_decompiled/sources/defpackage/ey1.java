package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import androidx.health.platform.client.proto.g;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes3.dex */
public final class ey1 extends znh implements b1c {
    public static final Set K = mp0.Z0(new Integer[]{0, 4, 5, 2, 3});
    public static final Set L = mp0.Z0(new Integer[]{1, 2, 4, 7, 11, 16});
    public static final Set M = mp0.Z0(new Integer[]{3, 5, 6, 8, 9, 10, 12, 14, 15, 17});
    public static final Set N = mp0.Z0(new Integer[]{13, 18, 19});
    public static final Set O = sf5.f0(20);
    public final h99 G;
    public final ThreadPoolExecutor H;
    public final jz1 I;
    public volatile a1c J;

    public ey1(h99 h99Var, ThreadPoolExecutor threadPoolExecutor) {
        jz1.a.getClass();
        hz1 hz1Var = iz1.b;
        h99Var.getClass();
        this.G = h99Var;
        this.H = threadPoolExecutor;
        this.I = hz1Var;
        this.J = new a1c(0, null, null, null, null, null, null, 127);
    }

    @Override // defpackage.b1c
    public final void a(Context context) {
        if (this.F.compareAndSet(true, false)) {
            context.unregisterReceiver(this);
        }
    }

    public final void c(Context context) {
        a1c a1cVar;
        String str;
        String str2;
        Object simCarrierIdName;
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            a1cVar = new a1c(1, null, null, null, null, null, null, 126);
        } else if (activeNetworkInfo.getType() == 1) {
            a1cVar = new a1c(3, null, null, null, null, null, null, 126);
        } else {
            int i = 9;
            if (activeNetworkInfo.getType() == 9) {
                a1cVar = new a1c(2, null, null, null, null, null, null, 126);
            } else if (K.contains(Integer.valueOf(activeNetworkInfo.getType()))) {
                int subtype = activeNetworkInfo.getSubtype();
                if (L.contains(Integer.valueOf(subtype))) {
                    i = 6;
                } else if (M.contains(Integer.valueOf(subtype))) {
                    i = 7;
                } else if (N.contains(Integer.valueOf(subtype))) {
                    i = 8;
                } else if (!O.contains(Integer.valueOf(subtype))) {
                    i = 10;
                }
                int i2 = i;
                switch (subtype) {
                    case 1:
                        str = "GPRS";
                        str2 = str;
                        break;
                    case 2:
                        str = "Edge";
                        str2 = str;
                        break;
                    case 3:
                        str = "UMTS";
                        str2 = str;
                        break;
                    case 4:
                        str = "CDMA";
                        str2 = str;
                        break;
                    case 5:
                        str = "CDMAEVDORev0";
                        str2 = str;
                        break;
                    case 6:
                        str = "CDMAEVDORevA";
                        str2 = str;
                        break;
                    case 7:
                        str = "CDMA1x";
                        str2 = str;
                        break;
                    case 8:
                        str = "HSDPA";
                        str2 = str;
                        break;
                    case 9:
                        str = "HSUPA";
                        str2 = str;
                        break;
                    case 10:
                        str = "HSPA";
                        str2 = str;
                        break;
                    case 11:
                        str = "iDen";
                        str2 = str;
                        break;
                    case 12:
                        str = "CDMAEVDORevB";
                        str2 = str;
                        break;
                    case 13:
                        str = "LTE";
                        str2 = str;
                        break;
                    case 14:
                        str = "eHRPD";
                        str2 = str;
                        break;
                    case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                        str = "HSPA+";
                        str2 = str;
                        break;
                    case 16:
                        str = "GSM";
                        str2 = str;
                        break;
                    case g.MAX_FIELD_NUMBER /* 17 */:
                        str = "TD_SCDMA";
                        str2 = str;
                        break;
                    case g.AVG_FIELD_NUMBER /* 18 */:
                        str = "IWLAN";
                        str2 = str;
                        break;
                    case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        str = "LTE_CA";
                        str2 = str;
                        break;
                    case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                        str = "New Radio";
                        str2 = str;
                        break;
                    default:
                        str2 = null;
                        break;
                }
                if (((hz1) this.I).e) {
                    Object systemService2 = context.getSystemService("phone");
                    TelephonyManager telephonyManager = systemService2 instanceof TelephonyManager ? (TelephonyManager) systemService2 : null;
                    if (telephonyManager == null || (simCarrierIdName = telephonyManager.getSimCarrierIdName()) == null) {
                        simCarrierIdName = "Unknown Carrier Name";
                    }
                    a1cVar = new a1c(i2, simCarrierIdName.toString(), telephonyManager != null ? Long.valueOf(telephonyManager.getSimCarrierId()) : null, null, null, null, str2, 56);
                } else {
                    a1cVar = new a1c(i2, null, null, null, null, null, str2, 62);
                }
            } else {
                a1cVar = new a1c(12, null, null, null, null, null, null, 126);
            }
        }
        this.J = a1cVar;
    }

    @Override // defpackage.b1c
    public final void i(Context context) {
        context.getClass();
        b(context, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        c(context);
    }

    @Override // defpackage.b1c
    public final a1c k() {
        return this.J;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        v40.p(this.H, "BroadcastReceiverNetworkInfoProvider.handleIntent", this.G, new fd(this, 9, context));
    }
}
