package io.sentry.android.core;

import android.content.BroadcastReceiver;
import defpackage.sd6;

/* JADX INFO: loaded from: classes.dex */
public final class z1 extends BroadcastReceiver {
    public final io.sentry.h1 a;
    public final SentryAndroidOptions b;
    public final sd6 c = new sd6(60000, 0);
    public final char[] d = new char[64];
    public final /* synthetic */ SystemEventsBreadcrumbsIntegration e;

    public z1(SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration, io.sentry.h1 h1Var, SentryAndroidOptions sentryAndroidOptions) {
        this.e = systemEventsBreadcrumbsIntegration;
        this.a = h1Var;
        this.b = sentryAndroidOptions;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
    
        r2 = r11;
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r11, android.content.Intent r12) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.z1.onReceive(android.content.Context, android.content.Intent):void");
    }
}
