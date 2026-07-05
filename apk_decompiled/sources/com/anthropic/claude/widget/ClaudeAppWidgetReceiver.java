package com.anthropic.claude.widget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.os.Bundle;
import defpackage.ft5;
import defpackage.g86;
import defpackage.gb9;
import defpackage.ive;
import defpackage.ix5;
import defpackage.l45;
import defpackage.n68;
import defpackage.tp4;
import defpackage.vo;
import defpackage.vtk;
import defpackage.w14;

/* JADX INFO: loaded from: classes2.dex */
public final class ClaudeAppWidgetReceiver extends AppWidgetProvider {
    public final ft5 a = g86.a;
    public final ive b = new ive(20);

    public static final void a(ClaudeAppWidgetReceiver claudeAppWidgetReceiver, l45 l45Var, Context context) {
        gb9.D(l45Var, null, null, new ix5(context, claudeAppWidgetReceiver, null, 11), 3);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        vtk.j(this, this.a, new vo(this, context, i, bundle, null, 3));
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] iArr) {
        vtk.j(this, this.a, new n68(this, context, iArr, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0080 A[Catch: all -> 0x00a7, CancellationException -> 0x00b0, TryCatch #2 {CancellationException -> 0x00b0, all -> 0x00a7, blocks: (B:3:0x0002, B:5:0x0008, B:12:0x001f, B:15:0x0028, B:17:0x0030, B:19:0x0039, B:21:0x0048, B:22:0x004f, B:23:0x0050, B:24:0x0057, B:25:0x0058, B:41:0x00a3, B:31:0x006e, B:33:0x0080, B:35:0x008b, B:37:0x0097, B:36:0x0093, B:39:0x009b, B:40:0x00a2, B:28:0x0063), top: B:47:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b A[Catch: all -> 0x00a7, CancellationException -> 0x00b0, TryCatch #2 {CancellationException -> 0x00b0, all -> 0x00a7, blocks: (B:3:0x0002, B:5:0x0008, B:12:0x001f, B:15:0x0028, B:17:0x0030, B:19:0x0039, B:21:0x0048, B:22:0x004f, B:23:0x0050, B:24:0x0057, B:25:0x0058, B:41:0x00a3, B:31:0x006e, B:33:0x0080, B:35:0x008b, B:37:0x0097, B:36:0x0093, B:39:0x009b, B:40:0x00a2, B:28:0x0063), top: B:47:0x0002 }] */
    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r9, android.content.Intent r10) {
        /*
            r8 = this;
            java.lang.String r0 = "appWidgetIds"
            java.lang.String r1 = r10.getAction()     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb0
            if (r1 == 0) goto L1b
            int r2 = r1.hashCode()     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb0
            r3 = -19011148(0xfffffffffedde9b4, float:-1.4748642E38)
            if (r2 == r3) goto L63
            r3 = 649033583(0x26af776f, float:1.2175437E-15)
            if (r2 == r3) goto L58
            r0 = 1989767543(0x76997177, float:1.5560991E33)
            if (r2 == r0) goto L1f
        L1b:
            r2 = r8
            r3 = r9
            goto La3
        L1f:
            java.lang.String r0 = "ACTION_TRIGGER_LAMBDA"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb0
            if (r0 != 0) goto L28
            goto L1b
        L28:
            java.lang.String r0 = "EXTRA_ACTION_KEY"
            java.lang.String r5 = r10.getStringExtra(r0)     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb0
            if (r5 == 0) goto L50
            java.lang.String r0 = "EXTRA_APPWIDGET_ID"
            r1 = -1
            int r4 = r10.getIntExtra(r0, r1)     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb0
            if (r4 == r1) goto L48
            ft5 r10 = r8.a     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb0
            vo r1 = new vo     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb0
            r6 = 0
            r7 = 4
            r2 = r8
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb0
            defpackage.vtk.j(r2, r10, r1)     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb0
            return
        L48:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb0
            java.lang.String r9 = "Intent is missing AppWidgetId extra"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb0
            throw r8     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb0
        L50:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb0
            java.lang.String r9 = "Intent is missing ActionKey extra"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb0
            throw r8     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb0
        L58:
            r2 = r8
            r3 = r9
            java.lang.String r8 = "androidx.glance.appwidget.action.DEBUG_UPDATE"
            boolean r8 = r1.equals(r8)     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb0
            if (r8 != 0) goto L6e
            goto La3
        L63:
            r2 = r8
            r3 = r9
            java.lang.String r8 = "android.intent.action.LOCALE_CHANGED"
            boolean r8 = r1.equals(r8)     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb0
            if (r8 != 0) goto L6e
            goto La3
        L6e:
            android.appwidget.AppWidgetManager r8 = android.appwidget.AppWidgetManager.getInstance(r3)     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb0
            java.lang.String r9 = r3.getPackageName()     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb0
            java.lang.Class r1 = r2.getClass()     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb0
            java.lang.String r1 = r1.getCanonicalName()     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb0
            if (r1 == 0) goto L9b
            android.content.ComponentName r4 = new android.content.ComponentName     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb0
            r4.<init>(r9, r1)     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb0
            boolean r9 = r10.hasExtra(r0)     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb0
            if (r9 == 0) goto L93
            int[] r9 = r10.getIntArrayExtra(r0)     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb0
            r9.getClass()     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb0
            goto L97
        L93:
            int[] r9 = r8.getAppWidgetIds(r4)     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb0
        L97:
            r2.onUpdate(r3, r8, r9)     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb0
            return
        L9b:
            java.lang.String r8 = "no canonical name"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb0
            r9.<init>(r8)     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb0
            throw r9     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb0
        La3:
            super.onReceive(r3, r10)     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb0
            return
        La7:
            r0 = move-exception
            r8 = r0
            java.lang.String r9 = "GlanceAppWidget"
            java.lang.String r10 = "Error in Glance App Widget"
            android.util.Log.e(r9, r10, r8)
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.widget.ClaudeAppWidgetReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        vtk.j(this, this.a, new w14(this, context, iArr, (tp4) null, 24));
    }
}
