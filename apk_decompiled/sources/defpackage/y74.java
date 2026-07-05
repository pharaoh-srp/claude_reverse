package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y74 {
    public static final c88 a = new c88("CommonUtils", "");

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            String strConcat = "Exception thrown when trying to get app version ".concat(e.toString());
            c88 c88Var = a;
            if (!Log.isLoggable(c88Var.b, 6)) {
                return "";
            }
            String str = c88Var.c;
            if (str != null) {
                strConcat = str.concat(strConcat);
            }
            Log.e("CommonUtils", strConcat);
            return "";
        }
    }
}
