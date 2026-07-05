package defpackage;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class lgb {
    public final Context a;
    public final i25 b;
    public final ze0 c;
    public final koi d;
    public final h86 e;

    public lgb(Context context, i25 i25Var, ze0 ze0Var, koi koiVar, h86 h86Var) {
        this.a = context;
        this.b = i25Var;
        this.c = ze0Var;
        this.d = koiVar;
        this.e = h86Var;
    }

    public static final DownloadManager.Request a(lgb lgbVar, String str, String str2) {
        i25 i25Var = lgbVar.b;
        us8 us8Var = new us8();
        us8Var.h(null, str);
        String strS0 = w44.S0(i25Var.b(us8Var.c()), "; ", null, null, new jua(15), 30);
        String strC = ikb.c(str2, "text/plain");
        DownloadManager.Request notificationVisibility = new DownloadManager.Request(Uri.parse(str)).setTitle(str2).addRequestHeader("Cookie", strS0).setAllowedOverMetered(true).setAllowedOverRoaming(true).setNotificationVisibility(1);
        boolean z = l2a.a;
        Context context = lgbVar.a;
        if (l2a.a(context)) {
            notificationVisibility.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        } else {
            notificationVisibility.setDestinationInExternalFilesDir(context, Environment.DIRECTORY_DOWNLOADS, str2);
        }
        DownloadManager.Request mimeType = notificationVisibility.setMimeType(strC);
        mimeType.getClass();
        return mimeType;
    }

    public static String b(String str) {
        String str2 = (String) w44.V0(bsg.Y0(str, new String[]{"/"}, 6));
        if (str2 != null) {
            if (str2.length() <= 0) {
                str2 = null;
            }
            if (str2 != null) {
                return str2;
            }
        }
        return "download_" + UUID.randomUUID();
    }

    public final Object c(String str, String str2, vp4 vp4Var) {
        return gb9.c0(this.e.b(), new zn(str2, this, str, null, 23), vp4Var);
    }

    public final Object d(String str, String str2, vp4 vp4Var) {
        return c(kgh.o(this.c.a(), lyk.l(this.d.e, str2, str)), b(str), vp4Var);
    }
}
