package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public final class q8c implements wxc {
    public final Context a;

    public q8c(Context context) {
        context.getClass();
        this.a = context;
    }

    @Override // defpackage.wxc
    public final zxc e() {
        NotificationManager notificationManager;
        Context context = this.a;
        context.getClass();
        boolean z = true;
        if (Build.VERSION.SDK_INT < 33 ? (notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class)) == null || !notificationManager.areNotificationsEnabled() : x44.x(context, "android.permission.POST_NOTIFICATIONS") != 0) {
            z = false;
        }
        return z ? yxc.a : new xxc(false);
    }

    @Override // defpackage.wxc
    public final void f() {
        Context context = this.a;
        context.getClass();
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        intent.setFlags(268435456);
        context.startActivity(intent);
    }
}
