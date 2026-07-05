package com.anthropic.claude.code.remote.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.anthropic.claude.analytics.events.PushEvents$SessionReplyActionResult;
import com.anthropic.claude.analytics.events.PushEvents$SessionReplyActionSubmitted;
import com.anthropic.claude.analytics.events.PushEvents$SessionReplyOutcome;
import com.anthropic.claude.code.remote.notification.SessionReplyActionWorker;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.OrganizationId;
import com.anthropic.claude.types.strings.SessionId;
import defpackage.a8c;
import defpackage.bfe;
import defpackage.bgj;
import defpackage.bsg;
import defpackage.bw;
import defpackage.c77;
import defpackage.er9;
import defpackage.gb9;
import defpackage.hr9;
import defpackage.ij0;
import defpackage.k1c;
import defpackage.k7c;
import defpackage.kw9;
import defpackage.ozf;
import defpackage.qi3;
import defpackage.ql4;
import defpackage.s31;
import defpackage.t1c;
import defpackage.tgc;
import defpackage.tgj;
import defpackage.w1a;
import defpackage.w44;
import defpackage.x44;
import defpackage.xah;
import defpackage.xkc;
import defpackage.yb5;
import defpackage.ysj;
import defpackage.z7c;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class SessionReplyActionReceiver extends BroadcastReceiver implements hr9 {
    public final kw9 E = yb5.w(w1a.E, new bw(this, 13));

    public static final void a(SessionReplyActionReceiver sessionReplyActionReceiver, String str, String str2, String str3, Context context, int i, String str4, boolean z) {
        Notification notification;
        List list = xah.a;
        StatusBarNotification statusBarNotification = null;
        xah.e(6, "SessionReplyReceiver dropped: ".concat(str4), null, null);
        int i2 = 0;
        if (z) {
            SilentException.a(new SilentException("SessionReplyReceiver: ".concat(str4)), ozf.F, false, 2);
        }
        qi3 qi3Var = (qi3) sessionReplyActionReceiver.E.getValue();
        if (str == null) {
            str = "";
        }
        String str5 = str;
        if (str2 == null) {
            str2 = "";
        }
        String str6 = str2;
        if (str3 == null) {
            str3 = "";
        }
        qi3Var.e(new PushEvents$SessionReplyActionResult(str5, str6, str3, PushEvents$SessionReplyOutcome.DROPPED_RECEIVER, 0), PushEvents$SessionReplyActionResult.Companion.serializer());
        synchronized (ysj.a) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (notificationManager == null) {
                    return;
                }
                StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
                activeNotifications.getClass();
                int length = activeNotifications.length;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    StatusBarNotification statusBarNotification2 = activeNotifications[i2];
                    if (statusBarNotification2.getId() == i) {
                        statusBarNotification = statusBarNotification2;
                        break;
                    }
                    i2++;
                }
                if (statusBarNotification == null || (notification = statusBarNotification.getNotification()) == null) {
                    return;
                }
                notificationManager.notify(i, notification);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hr9
    public final /* bridge */ er9 e() {
        return gb9.y();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        CharSequence charSequence;
        String string;
        StatusBarNotification statusBarNotification;
        Notification notification;
        NotificationManager notificationManager;
        context.getClass();
        intent.getClass();
        if (x44.r(intent.getAction(), "com.anthropic.claude.action.SESSION_REPLY")) {
            int intExtra = intent.getIntExtra("com.anthropic.claude.intent.extra.NOTIFICATION_ID", 0);
            String stringExtra = intent.getStringExtra("com.anthropic.claude.intent.extra.SESSION_ID");
            String stringExtra2 = intent.getStringExtra("com.anthropic.claude.intent.extra.ACCOUNT_ID");
            String stringExtra3 = intent.getStringExtra("com.anthropic.claude.intent.extra.ORGANIZATION_ID");
            Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
            if (resultsFromIntent != null && (charSequence = resultsFromIntent.getCharSequence("com.anthropic.claude.intent.extra.REPLY_TEXT")) != null && (string = charSequence.toString()) != null) {
                String str = !bsg.I0(string) ? string : null;
                if (str != null) {
                    if (stringExtra == null) {
                        a(this, stringExtra3, stringExtra2, stringExtra, context, intExtra, "EXTRA_SESSION_ID missing", true);
                        return;
                    }
                    if (stringExtra2 == null) {
                        a(this, stringExtra3, stringExtra2, stringExtra, context, intExtra, "EXTRA_ACCOUNT_ID missing", true);
                        return;
                    }
                    if (stringExtra3 == null) {
                        a(this, stringExtra3, stringExtra2, stringExtra, context, intExtra, "EXTRA_ORGANIZATION_ID missing", true);
                        return;
                    }
                    Context context2 = context;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    SessionReplyActionWorker.Args args = new SessionReplyActionWorker.Args(SessionId.m1115constructorimpl(stringExtra), AccountId.m944constructorimpl(stringExtra2), OrganizationId.m1066constructorimpl(stringExtra3), intExtra, str, jCurrentTimeMillis, null);
                    s31 s31Var = new s31(SessionReplyActionWorker.class);
                    if (Build.VERSION.SDK_INT >= 31) {
                        xkc xkcVar = xkc.E;
                        tgj tgjVar = (tgj) s31Var.H;
                        tgjVar.q = true;
                        tgjVar.r = xkcVar;
                    }
                    s31Var.k(args.toWorkData());
                    String strM725getAccountIdislZJdo = args.m725getAccountIdislZJdo();
                    strM725getAccountIdislZJdo.getClass();
                    ((LinkedHashSet) s31Var.I).add("account:".concat(strM725getAccountIdislZJdo));
                    ((tgj) s31Var.H).j = new ql4(new k1c(null), t1c.F, false, false, false, false, -1L, -1L, w44.t1(new LinkedHashSet()));
                    tgc tgcVarB = s31Var.b();
                    bgj bgjVarD = bgj.d(context2);
                    bgjVarD.getClass();
                    bgjVarD.c(ij0.i("session-reply-", SessionId.m1119toStringimpl(args.m727getSessionIdOcx55TE())), c77.H, tgcVarB);
                    synchronized (ysj.a) {
                        try {
                            NotificationManager notificationManager2 = (NotificationManager) context2.getSystemService(NotificationManager.class);
                            if (notificationManager2 != null) {
                                StatusBarNotification[] activeNotifications = notificationManager2.getActiveNotifications();
                                activeNotifications.getClass();
                                int length = activeNotifications.length;
                                int i = 0;
                                while (true) {
                                    if (i >= length) {
                                        statusBarNotification = null;
                                        break;
                                    }
                                    statusBarNotification = activeNotifications[i];
                                    if (statusBarNotification.getId() == intExtra) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                                if (statusBarNotification != null && (notification = statusBarNotification.getNotification()) != null) {
                                    NotificationManager notificationManager3 = notificationManager2;
                                    a8c a8cVarF = a8c.f(notification);
                                    String channelId = notification.getChannelId();
                                    if (a8cVarF == null || channelId == null) {
                                        notificationManager3.notify(intExtra, notification);
                                    } else {
                                        a8cVarF.e(new z7c(ysj.f(jCurrentTimeMillis, context2, str), jCurrentTimeMillis, null));
                                        ArrayList arrayListC = ysj.c(notification);
                                        ArrayList arrayList = new ArrayList();
                                        for (Object obj : arrayListC) {
                                            bfe[] bfeVarArr = ((k7c) obj).c;
                                            if (bfeVarArr != null) {
                                                int length2 = bfeVarArr.length;
                                                int i2 = 0;
                                                while (i2 < length2) {
                                                    notificationManager = notificationManager3;
                                                    if (x44.r(bfeVarArr[i2].a, "com.anthropic.claude.intent.extra.REPLY_TEXT")) {
                                                        arrayList.add(obj);
                                                        break;
                                                    } else {
                                                        i2++;
                                                        notificationManager3 = notificationManager;
                                                    }
                                                }
                                                notificationManager = notificationManager3;
                                            } else {
                                                notificationManager = notificationManager3;
                                            }
                                            context2 = context;
                                            notificationManager3 = notificationManager;
                                        }
                                        ysj.t(context2, notificationManager3, intExtra, notification, channelId, a8cVarF, arrayList);
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    ((qi3) this.E.getValue()).e(new PushEvents$SessionReplyActionSubmitted(stringExtra3, stringExtra2, stringExtra), PushEvents$SessionReplyActionSubmitted.Companion.serializer());
                    return;
                }
            }
            a(this, stringExtra3, stringExtra2, stringExtra, context, intExtra, "replyText blank/null", false);
        }
    }
}
