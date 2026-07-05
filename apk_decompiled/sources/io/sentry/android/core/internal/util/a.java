package io.sentry.android.core.internal.util;

import io.sentry.android.core.f0;
import io.sentry.v;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ c F;

    public /* synthetic */ a(c cVar, int i) {
        this.E = i;
        this.F = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        c cVar = this.F;
        switch (i) {
            case 0:
                cVar.K(true);
                v vVarA = c.R.a();
                try {
                    c.S.clear();
                    vVarA.close();
                    vVarA = c.P.a();
                    try {
                        c.Q = null;
                        vVarA.close();
                        f0.I.f(cVar);
                        return;
                    } finally {
                        try {
                            break;
                        } catch (Throwable th) {
                        }
                    }
                } finally {
                    try {
                        break;
                    } catch (Throwable th2) {
                    }
                }
            default:
                cVar.K(false);
                return;
        }
    }
}
