package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes.dex */
public final class l92 extends ConnectivityManager.NetworkCallback implements b1c {
    public final jz1 E;
    public final h99 F;
    public volatile a1c G;

    public l92(h99 h99Var) {
        jz1.a.getClass();
        hz1 hz1Var = iz1.b;
        h99Var.getClass();
        this.E = hz1Var;
        this.F = h99Var;
        this.G = new a1c(0, null, null, null, null, null, null, 127);
    }

    @Override // defpackage.b1c
    public final void a(Context context) {
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        g99 g99Var = g99.E;
        if (connectivityManager == null) {
            dch.H(this.F, 5, g99Var, n.a0, null, false, 56);
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(this);
        } catch (SecurityException e) {
            dch.H(this.F, 5, g99Var, n.b0, e, false, 48);
        } catch (RuntimeException e2) {
            dch.H(this.F, 5, g99Var, n.c0, e2, false, 48);
        }
    }

    @Override // defpackage.b1c
    public final void i(Context context) {
        int i;
        SecurityException securityException;
        g99 g99Var = g99.E;
        context.getClass();
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            dch.H(this.F, 5, g99Var, n.X, null, false, 56);
            return;
        }
        try {
            try {
                connectivityManager.registerDefaultNetworkCallback(this);
                try {
                    Network activeNetwork = connectivityManager.getActiveNetwork();
                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                    if (activeNetwork == null || networkCapabilities == null) {
                        return;
                    }
                    onCapabilitiesChanged(activeNetwork, networkCapabilities);
                } catch (SecurityException e) {
                    securityException = e;
                    i = 12;
                    dch.H(this.F, 5, g99Var, n.Y, securityException, false, 48);
                    this.G = new a1c(i, null, null, null, null, null, null, 126);
                }
            } catch (Exception e2) {
                dch.H(this.F, 5, g99Var, n.Z, e2, false, 48);
                this.G = new a1c(12, null, null, null, null, null, null, 126);
            }
        } catch (SecurityException e3) {
            i = 12;
            securityException = e3;
        }
    }

    @Override // defpackage.b1c
    public final a1c k() {
        return this.G;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        super.onCapabilitiesChanged(network, networkCapabilities);
        int i = 3;
        if (!networkCapabilities.hasTransport(1)) {
            i = 2;
            if (!networkCapabilities.hasTransport(3)) {
                i = networkCapabilities.hasTransport(0) ? 11 : networkCapabilities.hasTransport(2) ? 5 : 12;
            }
        }
        Long lValueOf = null;
        Long lValueOf2 = networkCapabilities.getLinkUpstreamBandwidthKbps() > 0 ? Long.valueOf(networkCapabilities.getLinkUpstreamBandwidthKbps()) : null;
        Long lValueOf3 = networkCapabilities.getLinkDownstreamBandwidthKbps() > 0 ? Long.valueOf(networkCapabilities.getLinkDownstreamBandwidthKbps()) : null;
        if (((hz1) this.E).f && networkCapabilities.getSignalStrength() != Integer.MIN_VALUE) {
            lValueOf = Long.valueOf(networkCapabilities.getSignalStrength());
        }
        this.G = new a1c(i, null, null, lValueOf2, lValueOf3, lValueOf, null, 70);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        super.onLost(network);
        this.G = new a1c(1, null, null, null, null, null, null, 126);
    }
}
