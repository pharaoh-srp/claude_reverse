package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class wvb implements wxc {
    public final String a;
    public final Context b;
    public final Activity c;
    public final lsc d;
    public zh4 e;

    public wvb(String str, Context context, Activity activity) {
        str.getClass();
        this.a = str;
        this.b = context;
        this.c = activity;
        this.d = mpk.P(a());
    }

    public final zxc a() {
        boolean zJ;
        String str = this.a;
        str.getClass();
        if (x44.x(this.b, str) == 0) {
            return yxc.a;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            Activity activity = this.c;
            zJ = (i < 32 && i == 31) ? gmk.j(activity, str) : activity.shouldShowRequestPermissionRationale(str);
        } else {
            zJ = false;
        }
        return new xxc(zJ);
    }

    public final void b() {
        this.d.setValue(a());
    }

    @Override // defpackage.wxc
    public final zxc e() {
        return (zxc) this.d.getValue();
    }

    @Override // defpackage.wxc
    public final void f() {
        zh4 zh4Var = this.e;
        if (zh4Var != null) {
            zh4Var.t(this.a);
        } else {
            sz6.j("ActivityResultLauncher cannot be null");
        }
    }
}
