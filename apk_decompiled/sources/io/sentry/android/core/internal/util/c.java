package io.sentry.android.core.internal.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.SystemClock;
import defpackage.d1c;
import io.sentry.a1;
import io.sentry.android.core.c0;
import io.sentry.android.core.f0;
import io.sentry.android.core.l0;
import io.sentry.android.core.p0;
import io.sentry.s0;
import io.sentry.t0;
import io.sentry.t5;
import io.sentry.u0;
import io.sentry.v;
import io.sentry.w6;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class c implements u0, c0 {
    public static volatile ConnectivityManager Q;
    public final Context E;
    public final w6 F;
    public final l0 G;
    public final d H;
    public final ArrayList I;
    public final io.sentry.util.a J;
    public volatile d1c K;
    public volatile NetworkCapabilities L;
    public volatile Network M;
    public volatile long N;
    public final AtomicBoolean O;
    public static final io.sentry.util.a P = new io.sentry.util.a();
    public static final io.sentry.util.a R = new io.sentry.util.a();
    public static final ArrayList S = new ArrayList();
    public static final int[] T = {1, 0, 3, 2};
    public static final int[] U = new int[2];

    public c(Context context, w6 w6Var, l0 l0Var) {
        d dVar = d.E;
        this.J = new io.sentry.util.a();
        this.N = 0L;
        this.O = new AtomicBoolean(false);
        Context applicationContext = context.getApplicationContext();
        this.E = applicationContext != null ? applicationContext : context;
        this.F = w6Var;
        this.G = l0Var;
        this.H = dVar;
        this.I = new ArrayList();
        int[] iArr = U;
        iArr[0] = 12;
        iArr[1] = 16;
        H(new b(this, 0));
        f0.I.c(this);
    }

    public static boolean c(Context context, a1 a1Var, l0 l0Var, ConnectivityManager.NetworkCallback networkCallback) {
        l0Var.getClass();
        if (!io.sentry.p.p(context)) {
            a1Var.h(t5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return false;
        }
        v vVarA = R.a();
        try {
            S.add(networkCallback);
            vVarA.close();
            return true;
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String f(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.hasTransport(3)) {
            return "ethernet";
        }
        if (networkCapabilities.hasTransport(1)) {
            return "wifi";
        }
        if (networkCapabilities.hasTransport(0)) {
            return "cellular";
        }
        return null;
    }

    public static ConnectivityManager n(Context context, a1 a1Var) {
        if (Q != null) {
            return Q;
        }
        v vVarA = P.a();
        try {
            if (Q != null) {
                ConnectivityManager connectivityManager = Q;
                vVarA.close();
                return connectivityManager;
            }
            Q = (ConnectivityManager) context.getSystemService("connectivity");
            if (Q == null) {
                a1Var.h(t5.INFO, "ConnectivityManager is null and cannot check network status", new Object[0]);
            }
            ConnectivityManager connectivityManager2 = Q;
            vVarA.close();
            return connectivityManager2;
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void H(Runnable runnable) {
        w6 w6Var = this.F;
        try {
            w6Var.getExecutorService().submit(runnable);
        } catch (Throwable th) {
            w6Var.getLogger().d(t5.ERROR, "AndroidConnectionStatusProvider submit failed", th);
        }
    }

    public final void K(boolean z) {
        v vVarA = this.J.a();
        if (z) {
            try {
                this.I.clear();
            } catch (Throwable th) {
                try {
                    vVarA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        d1c d1cVar = this.K;
        this.K = null;
        if (d1cVar != null) {
            Context context = this.E;
            a1 logger = this.F.getLogger();
            ConnectivityManager connectivityManagerN = n(context, logger);
            if (connectivityManagerN != null) {
                try {
                    connectivityManagerN.unregisterNetworkCallback(d1cVar);
                } catch (Throwable th3) {
                    logger.d(t5.WARNING, "unregisterNetworkCallback failed", th3);
                }
            }
        }
        this.L = null;
        this.M = null;
        this.N = 0L;
        vVarA.close();
        this.F.getLogger().h(t5.DEBUG, "Network callback unregistered", new Object[0]);
    }

    public final void P(NetworkCapabilities networkCapabilities) {
        v vVarA = this.J.a();
        try {
            if (networkCapabilities != null) {
                this.L = networkCapabilities;
            } else {
                if (!io.sentry.p.p(this.E)) {
                    this.F.getLogger().h(t5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                    this.L = null;
                    this.H.getClass();
                    this.N = SystemClock.uptimeMillis();
                    vVarA.close();
                    return;
                }
                this.G.getClass();
                ConnectivityManager connectivityManagerN = n(this.E, this.F.getLogger());
                if (connectivityManagerN != null) {
                    Network activeNetwork = connectivityManagerN.getActiveNetwork();
                    this.L = activeNetwork != null ? connectivityManagerN.getNetworkCapabilities(activeNetwork) : null;
                } else {
                    this.L = null;
                }
            }
            this.H.getClass();
            this.N = SystemClock.uptimeMillis();
            this.F.getLogger().h(t5.DEBUG, "Cache updated - Status: " + e() + ", Type: " + j(), new Object[0]);
        } catch (Throwable th) {
            try {
                this.F.getLogger().d(t5.WARNING, "Failed to update connection status cache", th);
                this.L = null;
                this.H.getClass();
                this.N = SystemClock.uptimeMillis();
            } catch (Throwable th2) {
                try {
                    vVarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        vVarA.close();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        H(new a(this, 0));
    }

    public final void d() {
        if (p0.f() && this.K == null) {
            v vVarA = this.J.a();
            try {
                if (this.K != null) {
                    vVarA.close();
                    return;
                }
                d1c d1cVar = new d1c(1, this);
                Context context = this.E;
                a1 logger = this.F.getLogger();
                this.G.getClass();
                ConnectivityManager connectivityManagerN = n(context, logger);
                if (connectivityManagerN != null) {
                    if (io.sentry.p.p(context)) {
                        try {
                            connectivityManagerN.registerDefaultNetworkCallback(d1cVar);
                            this.K = d1cVar;
                            this.F.getLogger().h(t5.DEBUG, "Network callback registered successfully", new Object[0]);
                        } catch (Throwable th) {
                            logger.d(t5.WARNING, "registerDefaultNetworkCallback failed", th);
                            this.F.getLogger().h(t5.WARNING, "Failed to register network callback", new Object[0]);
                        }
                        vVarA.close();
                    }
                    logger.h(t5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                }
                this.F.getLogger().h(t5.WARNING, "Failed to register network callback", new Object[0]);
                vVarA.close();
            } catch (Throwable th2) {
                try {
                    vVarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public final s0 e() {
        if (this.L != null) {
            NetworkCapabilities networkCapabilities = this.L;
            if (networkCapabilities != null) {
                boolean zHasCapability = networkCapabilities.hasCapability(12);
                this.G.getClass();
                if (zHasCapability && networkCapabilities.hasCapability(16)) {
                    for (int i : T) {
                        if (networkCapabilities.hasTransport(i)) {
                            return s0.CONNECTED;
                        }
                    }
                }
            }
            return s0.DISCONNECTED;
        }
        ConnectivityManager connectivityManagerN = n(this.E, this.F.getLogger());
        if (connectivityManagerN == null) {
            return s0.UNKNOWN;
        }
        Context context = this.E;
        a1 logger = this.F.getLogger();
        if (!io.sentry.p.p(context)) {
            logger.h(t5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return s0.NO_PERMISSION;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManagerN.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected() ? s0.CONNECTED : s0.DISCONNECTED;
            }
            logger.h(t5.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
            return s0.DISCONNECTED;
        } catch (Throwable th) {
            logger.d(t5.WARNING, "Could not retrieve Connection Status", th);
            return s0.UNKNOWN;
        }
    }

    @Override // io.sentry.u0
    public final s0 e0() {
        this.H.getClass();
        if (SystemClock.uptimeMillis() - this.N >= 120000) {
            P(null);
        }
        return e();
    }

    @Override // io.sentry.u0
    public final boolean h0(t0 t0Var) {
        v vVarA = this.J.a();
        try {
            this.I.add(t0Var);
            vVarA.close();
            d();
            return this.K != null;
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.android.core.c0
    public final void i() {
        if (this.K != null) {
            return;
        }
        H(new b(this, 1));
    }

    public final String j() {
        NetworkCapabilities networkCapabilities = this.L;
        if (networkCapabilities != null) {
            return f(networkCapabilities);
        }
        Context context = this.E;
        a1 logger = this.F.getLogger();
        l0 l0Var = this.G;
        ConnectivityManager connectivityManagerN = n(context, logger);
        if (connectivityManagerN != null) {
            if (!io.sentry.p.p(context)) {
                logger.h(t5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                return null;
            }
            try {
                l0Var.getClass();
                Network activeNetwork = connectivityManagerN.getActiveNetwork();
                if (activeNetwork == null) {
                    logger.h(t5.INFO, "Network is null and cannot check network status", new Object[0]);
                    return null;
                }
                NetworkCapabilities networkCapabilities2 = connectivityManagerN.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities2 == null) {
                    logger.h(t5.INFO, "NetworkCapabilities is null and cannot check network type", new Object[0]);
                    return null;
                }
                boolean zHasTransport = networkCapabilities2.hasTransport(3);
                boolean zHasTransport2 = networkCapabilities2.hasTransport(1);
                boolean zHasTransport3 = networkCapabilities2.hasTransport(0);
                if (zHasTransport) {
                    return "ethernet";
                }
                if (zHasTransport2) {
                    return "wifi";
                }
                if (zHasTransport3) {
                    return "cellular";
                }
            } catch (Throwable th) {
                logger.d(t5.ERROR, "Failed to retrieve network info", th);
                return null;
            }
        }
        return null;
    }

    @Override // io.sentry.u0
    public final String w() {
        this.H.getClass();
        if (SystemClock.uptimeMillis() - this.N >= 120000) {
            P(null);
        }
        return j();
    }

    @Override // io.sentry.android.core.c0
    public final void x() {
        if (this.K == null) {
            return;
        }
        H(new a(this, 1));
    }

    @Override // io.sentry.u0
    public final void y0(t0 t0Var) {
        v vVarA = this.J.a();
        try {
            this.I.remove(t0Var);
            vVarA.close();
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
