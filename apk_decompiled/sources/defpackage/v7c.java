package defpackage;

import android.app.Notification;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v7c {
    public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
        return messagingStyle.addHistoricMessage(message);
    }
}
