package com.anthropic.claude.bell;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.view.View;
import com.anthropic.claude.R;
import com.anthropic.claude.bell.BellOverlayDestination;
import defpackage.a2g;
import defpackage.fv;
import defpackage.iei;
import defpackage.iv1;
import defpackage.lp7;
import defpackage.o7c;
import defpackage.ovh;
import defpackage.rwe;
import defpackage.tp4;
import defpackage.x44;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements lp7 {
    public final /* synthetic */ rwe E;
    public final /* synthetic */ View F;

    public a(rwe rweVar, View view) {
        this.E = rweVar;
        this.F = view;
    }

    @Override // defpackage.lp7
    public final Object g(Object obj, tp4 tp4Var) {
        ovh ovhVar = (ovh) obj;
        rwe rweVar = this.E;
        if (ovhVar != null) {
            rweVar.E.m(new fv(3, new BellOverlayDestination[]{new BellOverlayDestination.ToolApproval(ovhVar.a, ovhVar.b, ovhVar.e, ovhVar.c, ovhVar.d, null)}), new a2g(11));
            Context context = this.F.getContext();
            if (Build.VERSION.SDK_INT < 33 || x44.x(context, "android.permission.POST_NOTIFICATIONS") == 0) {
                Object systemService = context.getSystemService("notification");
                NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
                NotificationChannel notificationChannel = new NotificationChannel("voice_tool_approval", context.getString(R.string.voice_tool_approval_channel_name), 4);
                notificationChannel.setDescription(context.getString(R.string.voice_tool_approval_channel_description));
                if (notificationManager != null) {
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                PendingIntent activity = PendingIntent.getActivity(context, 0, context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()), 201326592);
                o7c o7cVar = new o7c(context, "voice_tool_approval");
                o7cVar.z.icon = R.drawable.claude_spark;
                o7cVar.e = o7c.d(context.getString(R.string.voice_tool_approval_notification_title));
                o7cVar.f = o7c.d(context.getString(R.string.voice_tool_approval_notification_text));
                o7cVar.g = activity;
                o7cVar.j = 1;
                o7cVar.j(16, true);
                Notification notificationC = o7cVar.c();
                notificationC.getClass();
                if (notificationManager != null) {
                    notificationManager.notify(9001, notificationC);
                }
            }
        } else if (iv1.t(rweVar) instanceof BellOverlayDestination.ToolApproval) {
            b.r(rweVar);
        }
        return iei.a;
    }
}
