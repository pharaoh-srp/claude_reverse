package defpackage;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.r0;
import io.sentry.android.core.u0;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nj5 implements Callable {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ nj5(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.E;
        HashMap map = null;
        Object obj = this.G;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                qj5 qj5Var = (qj5) obj2;
                gbf gbfVar = (gbf) qj5Var.f.get((String) obj);
                nm6 nm6Var = nm6.E;
                if (gbfVar == null) {
                    return nm6Var;
                }
                Lock lock = gbfVar.m.readLock();
                lock.getClass();
                try {
                    lock.lock();
                    try {
                        map = new HashMap(gbfVar.n);
                    } finally {
                        lock.unlock();
                    }
                } catch (InterruptedException e) {
                    dch.I(qj5Var.k, 5, x44.X(g99.E, g99.G), new pj5(lock, 2), e, 48);
                }
                return map == null ? nm6Var : map;
            case 1:
                gbf gbfVar2 = (gbf) obj2;
                Set set = (Set) obj;
                if (gbfVar2.a.g.get()) {
                    return gbfVar2.b.b(set);
                }
                return null;
            default:
                return u0.c(((r0) obj2).E, (SentryAndroidOptions) obj);
        }
    }
}
