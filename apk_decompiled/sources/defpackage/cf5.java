package defpackage;

import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class cf5 {
    public static final AtomicLongFieldUpdater j = AtomicLongFieldUpdater.newUpdater(cf5.class, "f");
    public final nyj a;
    public final zfg b;
    public final df5 c;
    public final boolean d;
    public final long e;
    public volatile long f;
    public volatile Object g;
    public volatile int h = 0;
    public final CopyOnWriteArrayList i;

    static {
        AtomicReferenceFieldUpdater.newUpdater(cf5.class, Object.class, "g");
        vf4.O1.E1.m(Arrays.asList("legacy"), "", ".e2e.duration.enabled", false);
    }

    public cf5(df5 df5Var, h99 h99Var) {
        this.c = df5Var;
        zfg zfgVar = (j69.D.g ? xfg.F : wfg.o).get();
        this.b = zfgVar;
        zfgVar.b();
        this.e = df5Var.E.h();
        this.d = false;
        this.i = new CopyOnWriteArrayList();
        nyj nyjVar = new nyj(cf5.class.getSimpleName(), h99Var);
        this.a = nyjVar;
        nyjVar.E("Started span: {}", this);
    }

    public final void a(long j2) {
        mwc mwcVar;
        if (!j.compareAndSet(this, 0L, Math.max(1L, j2))) {
            this.a.E("Already finished: {}", this);
            return;
        }
        int i = -this.h;
        if (this.h >= 0) {
            this.h = i;
        }
        this.b.a();
        nwc nwcVar = this.c.E;
        if (!nwcVar.c.d()) {
            nwcVar.f.addFirst(this);
        }
        nwc.r.incrementAndGet(nwcVar);
        boolean z = this == nwcVar.m;
        int iDecrementAndGet = nwc.s.decrementAndGet(nwcVar);
        boolean z2 = nwcVar.d;
        if (z2 && iDecrementAndGet < 0) {
            sz6.j(grc.u("Pending reference count ", iDecrementAndGet, " is negative"));
            return;
        }
        int i2 = nwcVar.b.V;
        if (iDecrementAndGet == 0 && (z2 || !nwcVar.n)) {
            nwcVar.k(false);
            mwcVar = mwc.E;
        } else if (z) {
            nwcVar.c.c(nwcVar);
            mwcVar = mwc.G;
        } else if (i2 > 0 && nwcVar.g > i2) {
            nwcVar.k(true);
            nwcVar.a.getClass();
            mwcVar = mwc.F;
        } else if (nwcVar.n) {
            nwcVar.c.c(nwcVar);
            mwcVar = mwc.H;
        } else {
            mwcVar = mwc.I;
        }
        nyj nyjVar = this.a;
        ((rl) ((h99) nyjVar.F)).L(2, g99.F, new ka1(nyjVar, mwcVar, this, 16), null, false, null);
    }

    public final Object b(String str) {
        df5 df5Var;
        Object obj;
        df5Var = this.c;
        switch (str) {
            case "thread.id":
                return Long.valueOf(df5Var.J);
            case "http.status_code":
                if (df5Var.L == 0) {
                    return null;
                }
                return Integer.valueOf(df5Var.L);
            case "thread.name":
                return df5Var.K.E;
            default:
                synchronized (df5Var.M) {
                    obj = df5Var.M.get(str);
                    break;
                }
                if (obj == null) {
                    return null;
                }
                return "http.url".equals(str) ? obj.toString() : obj;
        }
    }

    public final Integer c() {
        int i = this.c.d().U;
        if (i == -128) {
            return null;
        }
        return Integer.valueOf(i);
    }

    public final void d(int i, String str, double d, int i2) {
        df5 df5Var = this.c;
        if (df5Var.H(i, i2)) {
            df5Var.j(Double.valueOf(d), str);
        }
    }

    public final String toString() {
        return this.c.toString() + ", duration_ns=" + this.f + ", forceKeep=false, links=" + this.i;
    }
}
