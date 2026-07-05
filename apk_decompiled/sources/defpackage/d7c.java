package defpackage;

import android.app.NotificationChannel;
import android.content.Context;
import com.anthropic.claude.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class d7c {
    public static final List a = x44.X("conway_notify", "orbit_insight", "voice_mode_notification_channel");

    public static NotificationChannel a(Context context) {
        context.getClass();
        NotificationChannel notificationChannel = new NotificationChannel("conway_notify_v2", context.getString(R.string.notification_channel_conway_name), 4);
        notificationChannel.setDescription(context.getString(R.string.notification_channel_conway_description));
        notificationChannel.setShowBadge(true);
        return notificationChannel;
    }
}
