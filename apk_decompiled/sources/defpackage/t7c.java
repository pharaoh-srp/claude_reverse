package defpackage;

import android.app.Notification;

/* JADX INFO: loaded from: classes2.dex */
public final class t7c extends f8c {
    @Override // defpackage.f8c
    public final void b(c61 c61Var) {
        ((Notification.Builder) c61Var.G).setStyle(s7c.a());
    }

    @Override // defpackage.f8c
    public final String c() {
        return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
    }
}
