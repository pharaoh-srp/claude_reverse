package io.sentry.android.core;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import io.sentry.b5;
import io.sentry.n4;
import io.sentry.t5;

/* JADX INFO: loaded from: classes.dex */
public final class g1 extends ConnectivityManager.NetworkCallback {
    public final l0 b;
    public final b5 e;
    public NetworkCapabilities c = null;
    public long d = 0;
    public final n4 a = n4.a;

    public g1(l0 l0Var, b5 b5Var) {
        io.sentry.p.v("BuildInfoProvider is required", l0Var);
        this.b = l0Var;
        io.sentry.p.v("SentryDateProvider is required", b5Var);
        this.e = b5Var;
    }

    public static io.sentry.g a(String str) {
        io.sentry.g gVar = new io.sentry.g();
        gVar.I = "system";
        gVar.K = "network.event";
        gVar.c("action", str);
        gVar.M = t5.INFO;
        return gVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.a.m(a("NETWORK_AVAILABLE"));
        this.c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00de  */
    @Override // android.net.ConnectivityManager.NetworkCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCapabilitiesChanged(android.net.Network r20, android.net.NetworkCapabilities r21) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.g1.onCapabilitiesChanged(android.net.Network, android.net.NetworkCapabilities):void");
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.a.m(a("NETWORK_LOST"));
        this.c = null;
    }
}
