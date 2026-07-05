package defpackage;

import android.net.Uri;
import android.webkit.URLUtil;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ig3 {
    public static final String a;
    public static final ide b;

    static {
        String str = "claude-citation-" + knk.F();
        a = str;
        b = new ide(csg.V("\n            ([?&])" + str + "=([a-zA-Z0-9-]+)\n        "));
    }

    public static String a(String str) {
        str.getClass();
        if (URLUtil.isValidUrl(str)) {
            return Uri.parse(str).getQueryParameter(a);
        }
        return null;
    }

    public static boolean b(String str) {
        str.getClass();
        return a(str) != null;
    }

    public static String c(String str) {
        str.getClass();
        return !bsg.u0(str, a, false) ? str : b.h(str, "");
    }
}
