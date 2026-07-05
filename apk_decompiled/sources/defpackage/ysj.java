package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.anthropic.claude.R;
import com.anthropic.claude.firebase.fcm.AnthropicFirebaseMessagingService;
import java.net.UnknownHostException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ysj {
    public static final Object a = new Object();
    public static final Object b = new Object();

    /* JADX WARN: Removed duplicated region for block: B:100:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.zy7 r20, defpackage.iqb r21, defpackage.a12 r22, defpackage.h12 r23, defpackage.z02 r24, long r25, defpackage.mnc r27, defpackage.zub r28, defpackage.ta4 r29, defpackage.ld4 r30, int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ysj.a(zy7, iqb, a12, h12, z02, long, mnc, zub, ta4, ld4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(int r15, int r16, defpackage.ld4 r17, defpackage.zy7 r18, defpackage.zy7 r19, defpackage.iqb r20) {
        /*
            r18.getClass()
            r19.getClass()
            r7 = r17
            e18 r7 = (defpackage.e18) r7
            r0 = -399325881(0xffffffffe832c547, float:-3.3768814E24)
            r7.c0(r0)
            r0 = r15 & 6
            r2 = r18
            if (r0 != 0) goto L21
            boolean r0 = r7.h(r2)
            if (r0 == 0) goto L1e
            r0 = 4
            goto L1f
        L1e:
            r0 = 2
        L1f:
            r0 = r0 | r15
            goto L22
        L21:
            r0 = r15
        L22:
            r1 = r15 & 48
            r10 = r19
            if (r1 != 0) goto L34
            boolean r1 = r7.h(r10)
            if (r1 == 0) goto L31
            r1 = 32
            goto L33
        L31:
            r1 = 16
        L33:
            r0 = r0 | r1
        L34:
            r1 = r16 & 4
            if (r1 == 0) goto L3d
            r0 = r0 | 384(0x180, float:5.38E-43)
        L3a:
            r3 = r20
            goto L4f
        L3d:
            r3 = r15 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L3a
            r3 = r20
            boolean r4 = r7.f(r3)
            if (r4 == 0) goto L4c
            r4 = 256(0x100, float:3.59E-43)
            goto L4e
        L4c:
            r4 = 128(0x80, float:1.8E-43)
        L4e:
            r0 = r0 | r4
        L4f:
            r4 = r0 & 147(0x93, float:2.06E-43)
            r5 = 146(0x92, float:2.05E-43)
            if (r4 == r5) goto L57
            r4 = 1
            goto L58
        L57:
            r4 = 0
        L58:
            r5 = r0 & 1
            boolean r4 = r7.Q(r5, r4)
            if (r4 == 0) goto La6
            if (r1 == 0) goto L66
            fqb r1 = defpackage.fqb.E
            r4 = r1
            goto L67
        L66:
            r4 = r3
        L67:
            u0h r1 = defpackage.drg.r0
            java.lang.Object r1 = r1.getValue()
            nrg r1 = (defpackage.nrg) r1
            java.lang.String r6 = defpackage.gik.l(r1, r7)
            u0h r1 = defpackage.drg.q0
            java.lang.Object r1 = r1.getValue()
            nrg r1 = (defpackage.nrg) r1
            java.lang.String r1 = defpackage.gik.l(r1, r7)
            u0h r3 = defpackage.drg.s0
            java.lang.Object r3 = r3.getValue()
            nrg r3 = (defpackage.nrg) r3
            java.lang.String r3 = defpackage.gik.l(r3, r7)
            int r0 = r0 << 6
            r5 = r0 & 896(0x380, float:1.256E-42)
            r8 = 196608(0x30000, float:2.75506E-40)
            r5 = r5 | r8
            r8 = r0 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 | r8
            r8 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r8
            r8 = r5 | r0
            r9 = 0
            ta4 r5 = defpackage.xkk.a
            r0 = r1
            r1 = r3
            r3 = r10
            defpackage.xuk.c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r11 = r4
            goto Laa
        La6:
            r7.T()
            r11 = r3
        Laa:
            r7e r0 = r7.s()
            if (r0 == 0) goto Lbf
            zh r8 = new zh
            r14 = 4
            r12 = r15
            r13 = r16
            r9 = r18
            r10 = r19
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r0.d = r8
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ysj.b(int, int, ld4, zy7, zy7, iqb):void");
    }

    public static ArrayList c(Notification notification) {
        bfe[] bfeVarArr;
        IconCompat iconCompatJ;
        k7c k7cVar;
        int i;
        Notification.Action[] actionArr = notification.actions;
        b79 b79VarH0 = wd6.H0(0, actionArr != null ? actionArr.length : 0);
        ArrayList arrayList = new ArrayList();
        Iterator it = b79VarH0.iterator();
        while (true) {
            a79 a79Var = (a79) it;
            if (!a79Var.G) {
                return arrayList;
            }
            Notification.Action action = notification.actions[a79Var.nextInt()];
            RemoteInput[] remoteInputs = action.getRemoteInputs();
            if (remoteInputs == null) {
                bfeVarArr = null;
            } else {
                bfe[] bfeVarArr2 = new bfe[remoteInputs.length];
                for (int i2 = 0; i2 < remoteInputs.length; i2++) {
                    RemoteInput remoteInput = remoteInputs[i2];
                    bfeVarArr2[i2] = new bfe(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), Build.VERSION.SDK_INT >= 29 ? le0.c(remoteInput) : 0, remoteInput.getExtras(), null);
                }
                bfeVarArr = bfeVarArr2;
            }
            boolean z = action.getExtras().getBoolean("android.support.allowGeneratedReplies") || action.getAllowGeneratedReplies();
            boolean z2 = action.getExtras().getBoolean("android.support.action.showsUserInterface", true);
            int i3 = Build.VERSION.SDK_INT;
            int iJ = i3 >= 28 ? ke0.j(action) : action.getExtras().getInt("android.support.action.semanticAction", 0);
            boolean zF = i3 >= 29 ? le0.f(action) : false;
            boolean zF2 = i3 >= 31 ? oe0.f(action) : false;
            if (action.getIcon() != null || (i = action.icon) == 0) {
                if (action.getIcon() == null) {
                    iconCompatJ = null;
                } else {
                    Icon icon = action.getIcon();
                    PorterDuff.Mode mode = IconCompat.k;
                    iconCompatJ = (ltk.o(icon) == 2 && ltk.l(icon) == 0) ? null : ltk.j(icon);
                }
                k7cVar = new k7c(iconCompatJ, action.title, action.actionIntent, action.getExtras(), bfeVarArr, z, iJ, z2, zF, zF2);
            } else {
                k7cVar = new k7c(i == 0 ? null : IconCompat.c(null, "", i), action.title, action.actionIntent, action.getExtras(), bfeVarArr, z, iJ, z2, zF, zF2);
            }
            arrayList.add(k7cVar);
        }
    }

    public static void d(Context context, int i, long j) {
        StatusBarNotification statusBarNotification;
        Notification notification;
        a8c a8cVar;
        context.getClass();
        synchronized (a) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (notificationManager == null) {
                    return;
                }
                StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
                activeNotifications.getClass();
                int length = activeNotifications.length;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        statusBarNotification = null;
                        break;
                    }
                    statusBarNotification = activeNotifications[i3];
                    if (statusBarNotification.getId() == i) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (statusBarNotification == null || (notification = statusBarNotification.getNotification()) == null) {
                    return;
                }
                a8c a8cVarF = a8c.f(notification);
                String channelId = notification.getChannelId();
                if (a8cVarF != null && channelId != null) {
                    String string = context.getString(R.string.notification_reply_send_failed);
                    string.getClass();
                    ArrayList arrayList = a8cVarF.e;
                    arrayList.getClass();
                    Iterator it = arrayList.iterator();
                    int i4 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i4 = -1;
                            break;
                        }
                        z7c z7cVar = (z7c) it.next();
                        z7cVar.getClass();
                        if (p(z7cVar, j)) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (i4 >= 0) {
                        a8c a8cVar2 = new a8c(a8cVarF.g);
                        a8cVar2.h = a8cVarF.h;
                        ArrayList arrayList2 = a8cVarF.e;
                        arrayList2.getClass();
                        for (Object obj : arrayList2) {
                            int i5 = i2 + 1;
                            if (i2 < 0) {
                                x44.n0();
                                throw null;
                            }
                            z7c z7cVar2 = (z7c) obj;
                            a8cVar2.e(z7cVar2);
                            if (i2 == i4) {
                                a8cVar2.e(new z7c(string, z7cVar2.b + 1, null));
                            }
                            i2 = i5;
                        }
                        a8cVar = a8cVar2;
                    } else {
                        a8cVarF.e(new z7c(string, System.currentTimeMillis(), null));
                        a8cVar = a8cVarF;
                    }
                    t(context, notificationManager, i, notification, channelId, a8cVar, c(notification));
                    return;
                }
                notificationManager.notify(i, notification);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String e(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (b) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                        } else {
                            cause = cause.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        return str + "\n  " + strReplace.replace("\n", "\n  ") + '\n';
    }

    public static SpannableString f(long j, Context context, String str) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
        spannableString.setSpan(new ForegroundColorSpan(context.getColor(R.color.text500)), 0, spannableString.length(), 33);
        spannableString.setSpan(new Annotation("pendingReply", String.valueOf(j)), 0, spannableString.length(), 33);
        return spannableString;
    }

    public static a8c g(AnthropicFirebaseMessagingService anthropicFirebaseMessagingService, NotificationManager notificationManager, int i, String str, String str2, String str3, String str4, String str5, long j) {
        uzc uzcVar;
        StatusBarNotification statusBarNotification;
        if (str4 != null) {
            uzcVar = new uzc();
            uzcVar.a = str4;
            uzcVar.b = null;
            uzcVar.c = null;
            uzcVar.d = str5;
            uzcVar.e = false;
            uzcVar.f = false;
        } else {
            CharSequence charSequenceLoadLabel = anthropicFirebaseMessagingService.getApplicationInfo().loadLabel(anthropicFirebaseMessagingService.getPackageManager());
            IconCompat iconCompatB = IconCompat.b(anthropicFirebaseMessagingService, R.drawable.claude_spark);
            uzcVar = new uzc();
            uzcVar.a = charSequenceLoadLabel;
            uzcVar.b = iconCompatB;
            uzcVar.c = null;
            uzcVar.d = null;
            uzcVar.e = false;
            uzcVar.f = false;
        }
        StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
        activeNotifications.getClass();
        int length = activeNotifications.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                statusBarNotification = null;
                break;
            }
            statusBarNotification = activeNotifications[i2];
            if (statusBarNotification.getId() == i) {
                break;
            }
            i2++;
        }
        a8c a8cVarF = statusBarNotification != null ? a8c.f(statusBarNotification.getNotification()) : null;
        if (a8cVarF == null) {
            if (str3 == null) {
                str3 = anthropicFirebaseMessagingService.getString(R.string.notification_sender_self);
                str3.getClass();
            }
            uzc uzcVar2 = new uzc();
            uzcVar2.a = str3;
            uzcVar2.b = null;
            uzcVar2.c = null;
            uzcVar2.d = null;
            uzcVar2.e = false;
            uzcVar2.f = false;
            a8cVarF = new a8c(uzcVar2);
        }
        a8cVarF.h = str;
        a8cVarF.e(new z7c(str2, j, uzcVar));
        return a8cVarF;
    }

    public static k7c h(AnthropicFirebaseMessagingService anthropicFirebaseMessagingService, String str, String str2, String str3, int i) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        Intent intent = new Intent("com.anthropic.claude.action.SESSION_REPLY");
        intent.setPackage(anthropicFirebaseMessagingService.getPackageName());
        intent.putExtra("com.anthropic.claude.intent.extra.SESSION_ID", str);
        intent.putExtra("com.anthropic.claude.intent.extra.ACCOUNT_ID", str2);
        intent.putExtra("com.anthropic.claude.intent.extra.ORGANIZATION_ID", str3);
        intent.putExtra("com.anthropic.claude.intent.extra.NOTIFICATION_ID", i);
        PendingIntent broadcast = PendingIntent.getBroadcast(anthropicFirebaseMessagingService, 1380994137 ^ i, intent, (Build.VERSION.SDK_INT >= 31 ? 33554432 : 0) | 134217728);
        bfe bfeVar = new bfe("com.anthropic.claude.intent.extra.REPLY_TEXT", anthropicFirebaseMessagingService.getString(R.string.notification_reply_hint), null, true, 0, new Bundle(), new HashSet());
        rw1 rw1Var = new rw1(anthropicFirebaseMessagingService.getString(R.string.notification_action_reply), broadcast);
        rw1Var.h = new ArrayList();
        ((ArrayList) rw1Var.h).add(bfeVar);
        rw1Var.a = false;
        return rw1Var.a();
    }

    public static void i(String str) {
        synchronized (b) {
            e(str, null);
        }
    }

    public static void j(String str, String str2) {
        synchronized (b) {
            Log.e(str, e(str2, null));
        }
    }

    public static void k(String str, String str2, Throwable th) {
        synchronized (b) {
            Log.e(str, e(str2, th));
        }
    }

    public static gp9 l(String str) throws GeneralSecurityException {
        Map mapUnmodifiableMap;
        AtomicReference atomicReference = tde.a;
        synchronized (tde.class) {
            mapUnmodifiableMap = Collections.unmodifiableMap(tde.d);
        }
        gp9 gp9Var = (gp9) mapUnmodifiableMap.get(str);
        if (gp9Var != null) {
            return gp9Var;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }

    public static PendingIntent m(Context context, Intent intent) {
        return PendingIntent.getActivity(context, 0, intent, 201326592);
    }

    public static void n(String str, String str2) {
        synchronized (b) {
            Log.i(str, e(str2, null));
        }
    }

    public static boolean o(byte b2) {
        return b2 > -65;
    }

    public static boolean p(z7c z7cVar, long j) {
        CharSequence charSequence = z7cVar.a;
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (spanned != null) {
            Object[] spans = spanned.getSpans(0, spanned.length(), Annotation.class);
            spans.getClass();
            for (Object obj : spans) {
                Annotation annotation = (Annotation) obj;
                if (x44.r(annotation.getKey(), "pendingReply") && x44.r(annotation.getValue(), String.valueOf(j))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final tzf q(tzf tzfVar, tzf tzfVar2, float f) {
        if (tzfVar == null && tzfVar2 == null) {
            return null;
        }
        if (tzfVar != null) {
            return tzfVar2 == null ? r(tzfVar, new tzf(tzfVar.a, d54.g, tzfVar.b, tzfVar.c, tzfVar.g, tzfVar.d), f) : r(tzfVar, tzfVar2, f);
        }
        tzfVar2.getClass();
        return r(new tzf(tzfVar2.a, d54.g, tzfVar2.b, tzfVar2.c, tzfVar2.g, tzfVar2.d), tzfVar2, f);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.tzf r(defpackage.tzf r13, defpackage.tzf r14, float r15) {
        /*
            tzf r0 = new tzf
            float r1 = r13.a
            float r2 = r14.a
            float r1 = defpackage.d4c.W(r1, r2, r15)
            float r2 = r13.b
            float r3 = r14.b
            float r2 = defpackage.d4c.W(r2, r3, r15)
            long r3 = r13.c
            long r5 = r14.c
            float r7 = defpackage.ya6.a(r3)
            float r8 = defpackage.ya6.a(r5)
            float r7 = defpackage.d4c.W(r7, r8, r15)
            float r3 = defpackage.ya6.b(r3)
            float r4 = defpackage.ya6.b(r5)
            float r3 = defpackage.d4c.W(r3, r4, r15)
            int r4 = java.lang.Float.floatToRawIntBits(r7)
            long r4 = (long) r4
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r6 = (long) r3
            r3 = 32
            long r3 = r4 << r3
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r6 & r8
            long r3 = r3 | r5
            long r5 = r13.e
            long r7 = r14.e
            long r5 = defpackage.d4c.Y(r15, r5, r7)
            jy1 r7 = r13.f
            jy1 r8 = r14.f
            boolean r9 = defpackage.x44.r(r7, r8)
            r10 = 0
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r9 == 0) goto L5e
            int r9 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r9 >= 0) goto L82
            goto L85
        L5e:
            boolean r9 = r7 instanceof defpackage.na9
            if (r9 == 0) goto L6a
            r9 = r7
            na9 r9 = (defpackage.na9) r9
            java.lang.Object r9 = r9.b(r8, r15)
            goto L6b
        L6a:
            r9 = r10
        L6b:
            if (r9 != 0) goto L7b
            boolean r12 = r8 instanceof defpackage.na9
            if (r12 == 0) goto L7b
            r9 = r8
            na9 r9 = (defpackage.na9) r9
            r12 = 1065353216(0x3f800000, float:1.0)
            float r12 = r12 - r15
            java.lang.Object r9 = r9.b(r7, r12)
        L7b:
            if (r9 != 0) goto L84
            int r9 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r9 >= 0) goto L82
            goto L85
        L82:
            r7 = r8
            goto L85
        L84:
            r7 = r9
        L85:
            boolean r8 = r7 instanceof defpackage.jy1
            if (r8 == 0) goto L8c
            r10 = r7
            jy1 r10 = (defpackage.jy1) r10
        L8c:
            r7 = r10
            float r8 = r13.g
            float r9 = r14.g
            float r8 = defpackage.d4c.W(r8, r9, r15)
            int r15 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r15 >= 0) goto L9a
            goto L9b
        L9a:
            r13 = r14
        L9b:
            int r9 = r13.d
            r0.<init>(r1, r2, r3, r5, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ysj.r(tzf, tzf, float):tzf");
    }

    public static void s(Context context, int i, String str, long j) {
        StatusBarNotification statusBarNotification;
        Notification notification;
        context.getClass();
        str.getClass();
        synchronized (a) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (notificationManager == null) {
                    return;
                }
                StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
                activeNotifications.getClass();
                int length = activeNotifications.length;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        statusBarNotification = null;
                        break;
                    }
                    statusBarNotification = activeNotifications[i3];
                    if (statusBarNotification.getId() == i) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (statusBarNotification == null || (notification = statusBarNotification.getNotification()) == null) {
                    return;
                }
                a8c a8cVarF = a8c.f(notification);
                if (a8cVarF == null) {
                    return;
                }
                String channelId = notification.getChannelId();
                if (channelId == null) {
                    return;
                }
                ArrayList arrayList = a8cVarF.e;
                arrayList.getClass();
                Iterator it = arrayList.iterator();
                int i4 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i4 = -1;
                        break;
                    }
                    z7c z7cVar = (z7c) it.next();
                    z7cVar.getClass();
                    if (p(z7cVar, j)) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i4 < 0) {
                    return;
                }
                a8c a8cVar = new a8c(a8cVarF.g);
                a8cVar.h = a8cVarF.h;
                ArrayList arrayList2 = a8cVarF.e;
                arrayList2.getClass();
                for (Object obj : arrayList2) {
                    int i5 = i2 + 1;
                    if (i2 < 0) {
                        x44.n0();
                        throw null;
                    }
                    z7c z7cVar2 = (z7c) obj;
                    if (i2 == i4) {
                        a8cVar.e(new z7c(str, z7cVar2.b, z7cVar2.c));
                    } else {
                        a8cVar.e(z7cVar2);
                    }
                    i2 = i5;
                }
                t(context, notificationManager, i, notification, channelId, a8cVar, c(notification));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void t(Context context, NotificationManager notificationManager, int i, Notification notification, String str, a8c a8cVar, ArrayList arrayList) {
        o7c o7cVar = new o7c(context, str);
        o7cVar.z.icon = R.drawable.claude_spark;
        int i2 = notification.color;
        if (i2 != 0) {
            o7cVar.s = i2;
        }
        o7cVar.j(16, true);
        o7cVar.g = notification.contentIntent;
        o7cVar.j = 1;
        o7cVar.j(8, true);
        o7cVar.o(a8cVar);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o7cVar.b((k7c) it.next());
        }
        notificationManager.notify(i, o7cVar.c());
    }

    public static void u(String str, String str2) {
        synchronized (b) {
            Log.w(str, e(str2, null));
        }
    }

    public static void v(String str, String str2, Throwable th) {
        synchronized (b) {
            Log.w(str, e(str2, th));
        }
    }
}
