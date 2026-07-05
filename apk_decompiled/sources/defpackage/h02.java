package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.UserManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class h02 {
    public static PackageInfo a(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }

    public static Object b(Bundle bundle, String str, Class cls) {
        return bundle.getParcelable(str, cls);
    }

    public static ArrayList c(String str, Bundle bundle) {
        return bundle.getParcelableArrayList(str, Bundle.class);
    }

    public static final int d(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("user");
        systemService.getClass();
        return (((UserManager) systemService).isProfile() || context.getSystemService("healthconnect") == null) ? 1 : 3;
    }
}
