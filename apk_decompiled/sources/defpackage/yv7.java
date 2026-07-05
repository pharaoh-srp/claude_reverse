package defpackage;

import android.app.Notification;

/* JADX INFO: loaded from: classes2.dex */
public final class yv7 {
    public final int a;
    public final int b;
    public final Notification c;

    public yv7(int i, Notification notification, int i2) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yv7.class != obj.getClass()) {
            return false;
        }
        yv7 yv7Var = (yv7) obj;
        if (this.a == yv7Var.a && this.b == yv7Var.b) {
            return this.c.equals(yv7Var.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}
