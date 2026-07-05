package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class n8c {
    public static String d;
    public static m8c g;
    public final Context a;
    public final NotificationManager b;
    public static final Object c = new Object();
    public static HashSet e = new HashSet();
    public static final Object f = new Object();

    public n8c(Context context) {
        this.a = context;
        this.b = (NotificationManager) context.getSystemService("notification");
    }

    public static n8c b(Context context) {
        return new n8c(context);
    }

    public final boolean a() {
        return this.b.areNotificationsEnabled();
    }

    public final void c(Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            this.b.notify(null, 9200, notification);
            return;
        }
        j8c j8cVar = new j8c(this.a.getPackageName(), notification);
        synchronized (f) {
            try {
                if (g == null) {
                    g = new m8c(this.a.getApplicationContext());
                }
                g.F.obtainMessage(0, j8cVar).sendToTarget();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b.cancel(null, 9200);
    }
}
