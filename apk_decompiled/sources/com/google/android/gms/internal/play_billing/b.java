package com.google.android.gms.internal.play_billing;

import defpackage.c2k;
import defpackage.j1k;
import defpackage.l4k;
import defpackage.x0k;
import defpackage.x3k;
import defpackage.y0k;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Runnable {
    public l4k E;

    @Override // java.lang.Runnable
    public final void run() {
        x3k x3kVar;
        a aVar;
        l4k l4kVar = this.E;
        if (l4kVar == null || (x3kVar = l4kVar.L) == null) {
            return;
        }
        this.E = null;
        if (x3kVar.isDone()) {
            Object obj = l4kVar.E;
            if (obj == null) {
                if (x3kVar.isDone()) {
                    if (j1k.K.l(l4kVar, null, l4k.h(x3kVar))) {
                        l4k.j(l4kVar);
                        return;
                    }
                    return;
                }
                y0k y0kVar = new y0k(l4kVar, x3kVar);
                if (j1k.K.l(l4kVar, null, y0kVar)) {
                    try {
                        x3kVar.c(y0kVar, c2k.E);
                        return;
                    } catch (Throwable th) {
                        try {
                            aVar = new a(th);
                        } catch (Error | Exception unused) {
                            aVar = a.b;
                        }
                        j1k.K.l(l4kVar, y0kVar, aVar);
                        return;
                    }
                }
                obj = l4kVar.E;
            }
            if (obj instanceof x0k) {
                x3kVar.cancel(((x0k) obj).a);
                return;
            }
            return;
        }
        try {
            ScheduledFuture scheduledFuture = l4kVar.M;
            l4kVar.M = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th2) {
                    if (j1k.K.l(l4kVar, null, new a(new zzdf(str)))) {
                        l4k.j(l4kVar);
                    }
                    throw th2;
                }
            }
            if (j1k.K.l(l4kVar, null, new a(new zzdf(str + ": " + x3kVar.toString())))) {
                l4k.j(l4kVar);
            }
        } finally {
            x3kVar.cancel(true);
        }
    }
}
