package defpackage;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l2a {
    public static final boolean a;

    static {
        a = Build.VERSION.SDK_INT >= 29;
    }

    public static boolean a(Context context) {
        return a || x44.x(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }
}
