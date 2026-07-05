package io.sentry.android.core;

import android.net.NetworkCapabilities;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class f1 {
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final boolean e;
    public final String f;

    public f1(NetworkCapabilities networkCapabilities, l0 l0Var, long j) {
        io.sentry.p.v("NetworkCapabilities is required", networkCapabilities);
        io.sentry.p.v("BuildInfoProvider is required", l0Var);
        this.a = networkCapabilities.getLinkDownstreamBandwidthKbps();
        this.b = networkCapabilities.getLinkUpstreamBandwidthKbps();
        int signalStrength = Build.VERSION.SDK_INT >= 29 ? networkCapabilities.getSignalStrength() : 0;
        this.c = signalStrength > -100 ? signalStrength : 0;
        this.e = networkCapabilities.hasTransport(4);
        String strF = io.sentry.android.core.internal.util.c.f(networkCapabilities);
        this.f = strF == null ? "" : strF;
        this.d = j;
    }
}
