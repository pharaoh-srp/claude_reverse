package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.os.SystemClock;
import io.sentry.android.core.internal.util.c;
import io.sentry.s0;
import io.sentry.t0;
import io.sentry.t5;
import io.sentry.v;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d1c extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d1c(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void a() {
        ((c) this.b).O.set(false);
        v vVarA = ((c) this.b).J.a();
        try {
            ((c) this.b).L = null;
            ((c) this.b).M = null;
            c cVar = (c) this.b;
            cVar.H.getClass();
            cVar.N = SystemClock.uptimeMillis();
            ((c) this.b).F.getLogger().h(t5.DEBUG, "Cache cleared - network lost/unavailable", new Object[0]);
            Iterator it = ((c) this.b).I.iterator();
            while (it.hasNext()) {
                ((t0) it.next()).e(s0.DISCONNECTED);
            }
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

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.a) {
            case 1:
                ((c) this.b).M = network;
                if (((c) this.b).O.getAndSet(true)) {
                    return;
                }
                v vVarA = c.R.a();
                try {
                    Iterator it = c.S.iterator();
                    while (it.hasNext()) {
                        ((ConnectivityManager.NetworkCallback) it.next()).onAvailable(network);
                        break;
                    }
                    vVarA.close();
                    return;
                } catch (Throwable th) {
                    try {
                        vVarA.close();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            default:
                super.onAvailable(network);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007f A[Catch: all -> 0x0089, LOOP:3: B:33:0x0079->B:35:0x007f, LOOP_END, TRY_LEAVE, TryCatch #3 {all -> 0x0089, blocks: (B:32:0x006f, B:33:0x0079, B:35:0x007f), top: B:75:0x006f }] */
    @Override // android.net.ConnectivityManager.NetworkCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCapabilitiesChanged(android.net.Network r8, android.net.NetworkCapabilities r9) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d1c.onCapabilitiesChanged(android.net.Network, android.net.NetworkCapabilities):void");
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.a) {
            case 0:
                network.getClass();
                ((f1c) this.b).a.setValue(Boolean.FALSE);
                return;
            default:
                if (network.equals(((c) this.b).M)) {
                    a();
                    v vVarA = c.R.a();
                    try {
                        Iterator it = c.S.iterator();
                        while (it.hasNext()) {
                            ((ConnectivityManager.NetworkCallback) it.next()).onLost(network);
                            break;
                        }
                        vVarA.close();
                        return;
                    } catch (Throwable th) {
                        try {
                            vVarA.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        switch (this.a) {
            case 1:
                a();
                v vVarA = c.R.a();
                try {
                    Iterator it = c.S.iterator();
                    while (it.hasNext()) {
                        ((ConnectivityManager.NetworkCallback) it.next()).onUnavailable();
                        break;
                    }
                    vVarA.close();
                    return;
                } catch (Throwable th) {
                    try {
                        vVarA.close();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            default:
                super.onUnavailable();
                return;
        }
    }
}
