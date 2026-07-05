package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class g88 {
    public static final int a;
    public static final g88 b;

    static {
        AtomicBoolean atomicBoolean = z88.a;
        a = 12451000;
        b = new g88();
    }

    public static int a(Context context) {
        AtomicBoolean atomicBoolean = z88.a;
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    public static void d(Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        AtomicBoolean atomicBoolean = z88.a;
        g88 g88Var = b;
        int iC = g88Var.c(context, 11925000);
        if (iC != 0) {
            Intent intentB = g88Var.b(iC, context, "e");
            StringBuilder sb = new StringBuilder(String.valueOf(iC).length() + 46);
            sb.append("GooglePlayServices not available due to error ");
            sb.append(iC);
            Log.e("GooglePlayServicesUtil", sb.toString());
            if (intentB != null) {
                throw new GooglePlayServicesRepairableException("Google Play Services not available");
            }
            throw new GooglePlayServicesNotAvailableException(iC);
        }
    }

    public Intent b(int i, Context context, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && nai.P(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(nij.a(context).E(0, context.getPackageName()).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public int c(Context context, int i) {
        int iB = z88.b(context, i);
        boolean z = true;
        if (iB != 18) {
            if (iB == 1) {
                try {
                    Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = context.getPackageManager().getApplicationInfo("com.google.android.gms", FreeTypeConstants.FT_LOAD_LINEAR_DESIGN).enabled;
                            break;
                        }
                        if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                            break;
                        }
                    }
                } catch (PackageManager.NameNotFoundException | Exception unused) {
                    z = false;
                }
            } else {
                z = false;
            }
        }
        if (z) {
            return 18;
        }
        return iB;
    }
}
