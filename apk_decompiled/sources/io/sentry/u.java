package io.sentry;

import defpackage.ij0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class u implements n {
    public final ArrayList d;
    public final ArrayList e;
    public final boolean f;
    public final w6 g;
    public final io.sentry.util.a a = new io.sentry.util.a();
    public volatile Timer b = null;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final AtomicBoolean h = new AtomicBoolean(false);
    public long i = 0;

    public u(w6 w6Var) {
        boolean z = false;
        p.v("The options object is required.", w6Var);
        this.g = w6Var;
        this.d = new ArrayList();
        this.e = new ArrayList();
        for (c1 c1Var : w6Var.getPerformanceCollectors()) {
            if (c1Var instanceof d1) {
                this.d.add((d1) c1Var);
            }
            if (c1Var instanceof io.sentry.android.core.x1) {
                this.e.add((io.sentry.android.core.x1) c1Var);
            }
        }
        if (this.d.isEmpty() && this.e.isEmpty()) {
            z = true;
        }
        this.f = z;
    }

    @Override // io.sentry.n
    public final List a(String str) {
        ConcurrentHashMap concurrentHashMap = this.c;
        t tVar = (t) concurrentHashMap.remove(str);
        this.g.getLogger().h(t5.DEBUG, ij0.i("stop collecting performance info for ", str), new Object[0]);
        if (concurrentHashMap.isEmpty()) {
            close();
        }
        if (tVar != null) {
            return tVar.a;
        }
        return null;
    }

    @Override // io.sentry.n
    public final void b(String str) {
        if (this.f) {
            this.g.getLogger().h(t5.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        if (!this.c.containsKey(str)) {
            this.c.put(str, new t(this, null));
        }
        if (this.h.getAndSet(true)) {
            return;
        }
        v vVarA = this.a.a();
        try {
            if (this.b == null) {
                this.b = new Timer(true);
            }
            this.b.schedule(new r(0, this), 0L);
            this.b.scheduleAtFixedRate(new s(this, new ArrayList()), 100L, 100L);
            vVarA.close();
        } finally {
        }
    }

    @Override // io.sentry.n
    public final void c(i7 i7Var) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.x1) it.next()).e(i7Var);
        }
    }

    @Override // io.sentry.n
    public final void close() {
        this.g.getLogger().h(t5.DEBUG, "stop collecting all performance info for transactions", new Object[0]);
        this.c.clear();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.x1) it.next()).d();
        }
        if (this.h.getAndSet(false)) {
            v vVarA = this.a.a();
            try {
                if (this.b != null) {
                    this.b.cancel();
                    this.b = null;
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
    }

    @Override // io.sentry.n
    public final void d(i7 i7Var) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.x1) it.next()).f(i7Var);
        }
    }

    @Override // io.sentry.n
    public final void e(f7 f7Var) {
        if (this.f) {
            this.g.getLogger().h(t5.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.x1) it.next()).f(f7Var);
        }
        String string = f7Var.a.toString();
        ConcurrentHashMap concurrentHashMap = this.c;
        if (!concurrentHashMap.containsKey(string)) {
            concurrentHashMap.put(string, new t(this, f7Var));
        }
        b(string);
    }

    @Override // io.sentry.n
    public final List f(r1 r1Var) {
        this.g.getLogger().h(t5.DEBUG, "stop collecting performance info for transactions %s (%s)", r1Var.getName(), r1Var.y().E.toString());
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.x1) it.next()).e(r1Var);
        }
        return a(r1Var.t().toString());
    }
}
