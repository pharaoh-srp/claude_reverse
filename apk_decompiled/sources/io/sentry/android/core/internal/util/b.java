package io.sentry.android.core.internal.util;

import android.net.ConnectivityManager;
import io.sentry.s0;
import io.sentry.t0;
import io.sentry.v;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ c F;

    public /* synthetic */ b(c cVar, int i) {
        this.E = i;
        this.F = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v vVarA;
        int i = this.E;
        c cVar = this.F;
        switch (i) {
            case 0:
                cVar.d();
                return;
            default:
                cVar.P(null);
                s0 s0VarE = cVar.e();
                if (s0VarE == s0.DISCONNECTED) {
                    cVar.O.set(false);
                    vVarA = c.R.a();
                    try {
                        Iterator it = c.S.iterator();
                        while (it.hasNext()) {
                            ((ConnectivityManager.NetworkCallback) it.next()).onLost(null);
                            break;
                        }
                        vVarA.close();
                    } finally {
                        try {
                            break;
                        } catch (Throwable th) {
                        }
                    }
                }
                vVarA = cVar.J.a();
                try {
                    Iterator it2 = cVar.I.iterator();
                    while (it2.hasNext()) {
                        ((t0) it2.next()).e(s0VarE);
                        break;
                    }
                    vVarA.close();
                    cVar.d();
                    return;
                } finally {
                    try {
                        break;
                    } catch (Throwable th2) {
                    }
                }
        }
    }
}
