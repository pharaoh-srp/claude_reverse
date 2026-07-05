package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.anthropic.claude.R;
import com.anthropic.claude.firebase.fcm.AnthropicFirebaseMessagingService;
import com.anthropic.claude.sessions.types.RequiresActionDetails;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k34 {
    public static final Set a = mp0.Z0(new String[]{RequiresActionDetails.ASK_USER_QUESTION, "ExitPlanMode"});

    public static final void a(o7c o7cVar, AnthropicFirebaseMessagingService anthropicFirebaseMessagingService, String str, String str2, String str3, String str4, String str5, xe2 xe2Var, int i) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        xe2Var.getClass();
        String str6 = xe2Var.a;
        String str7 = xe2Var.c;
        RemoteViews remoteViews = new RemoteViews(anthropicFirebaseMessagingService.getPackageName(), R.layout.notification_ccr_permission_expanded);
        remoteViews.setTextViewText(R.id.ccr_title, str4);
        String str8 = !bsg.I0(str5) ? str5 : null;
        if (str8 != null) {
            remoteViews.setTextViewText(R.id.ccr_context, str8);
            remoteViews.setViewVisibility(R.id.ccr_context, 0);
        }
        String str9 = xe2Var.d;
        if (str9 != null) {
            String strConcat = bsg.I0(str9) ? null : str9;
            if (strConcat != null) {
                if (x44.r(str7, "Bash")) {
                    strConcat = "$ ".concat(strConcat);
                }
                remoteViews.setTextViewText(R.id.ccr_body, strConcat);
                remoteViews.setViewVisibility(R.id.ccr_body, 0);
            }
        }
        o7cVar.f = o7c.d(str5);
        o7cVar.j(2, true);
        o7cVar.j(16, false);
        o7cVar.w = 300000L;
        o7cVar.o(new t7c());
        o7cVar.u = remoteViews;
        if (str7 != null && str7.length() != 0 && !a.contains(str7)) {
            rw1 rw1Var = new rw1(anthropicFirebaseMessagingService.getString(R.string.notification_action_approve), b(anthropicFirebaseMessagingService, str, str2, str3, xe2Var, i, "com.anthropic.claude.action.CCR_PERMISSION_APPROVE"));
            rw1Var.c = true;
            o7cVar.b(rw1Var.a());
        }
        o7cVar.a(0, b(anthropicFirebaseMessagingService, str, str2, str3, xe2Var, i, "com.anthropic.claude.action.CCR_PERMISSION_DENY"), anthropicFirebaseMessagingService.getString(R.string.notification_action_deny));
        Intent intent = new Intent("com.anthropic.claude.action.CCR_PERMISSION_DENY_WITH_COMMENT");
        intent.setPackage(anthropicFirebaseMessagingService.getPackageName());
        intent.putExtra("com.anthropic.claude.intent.extra.SESSION_ID", str);
        intent.putExtra("com.anthropic.claude.intent.extra.ACCOUNT_ID", str2);
        intent.putExtra("com.anthropic.claude.intent.extra.ORGANIZATION_ID", str3);
        intent.putExtra("com.anthropic.claude.intent.extra.CCR_REQUEST_ID", str6);
        intent.putExtra("com.anthropic.claude.intent.extra.CCR_TOOL_NAME", str7);
        intent.putExtra("com.anthropic.claude.intent.extra.CCR_TOOL_USE_ID", xe2Var.b);
        intent.putExtra("com.anthropic.claude.intent.extra.NOTIFICATION_ID", i);
        PendingIntent broadcast = PendingIntent.getBroadcast(anthropicFirebaseMessagingService, (str6.hashCode() * 31) + 1515043533, intent, (Build.VERSION.SDK_INT >= 31 ? 33554432 : 0) | 134217728);
        bfe bfeVar = new bfe("ccr_comment", anthropicFirebaseMessagingService.getString(R.string.ccr_notification_comment_hint), null, true, 0, new Bundle(), new HashSet());
        rw1 rw1Var2 = new rw1(anthropicFirebaseMessagingService.getString(R.string.ccr_notification_deny_with_comment), broadcast);
        rw1Var2.h = new ArrayList();
        ((ArrayList) rw1Var2.h).add(bfeVar);
        rw1Var2.a = false;
        o7cVar.b(rw1Var2.a());
    }

    public static final PendingIntent b(AnthropicFirebaseMessagingService anthropicFirebaseMessagingService, String str, String str2, String str3, xe2 xe2Var, int i, String str4) {
        Intent intent = new Intent(str4);
        intent.setPackage(anthropicFirebaseMessagingService.getPackageName());
        intent.putExtra("com.anthropic.claude.intent.extra.SESSION_ID", str);
        intent.putExtra("com.anthropic.claude.intent.extra.ACCOUNT_ID", str2);
        intent.putExtra("com.anthropic.claude.intent.extra.ORGANIZATION_ID", str3);
        intent.putExtra("com.anthropic.claude.intent.extra.CCR_REQUEST_ID", xe2Var.a);
        intent.putExtra("com.anthropic.claude.intent.extra.CCR_TOOL_NAME", xe2Var.c);
        intent.putExtra("com.anthropic.claude.intent.extra.CCR_TOOL_USE_ID", xe2Var.b);
        intent.putExtra("com.anthropic.claude.intent.extra.NOTIFICATION_ID", i);
        PendingIntent broadcast = PendingIntent.getBroadcast(anthropicFirebaseMessagingService, str4.hashCode() + (xe2Var.a.hashCode() * 31), intent, 201326592);
        broadcast.getClass();
        return broadcast;
    }
}
