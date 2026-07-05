package io.sentry;

import defpackage.cd;
import defpackage.hvd;
import java.util.List;
import java.util.ListIterator;
import java.util.Timer;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class f7 implements r1 {
    public final i7 b;
    public final m4 d;
    public final String e;
    public volatile d7 g;
    public volatile d7 h;
    public volatile Timer i;
    public final io.sentry.util.a j;
    public final io.sentry.util.a k;
    public final AtomicBoolean l;
    public final AtomicBoolean m;
    public final io.sentry.protocol.h0 n;
    public final w1 o;
    public final io.sentry.protocol.e p;
    public final n q;
    public final t7 r;
    public final io.sentry.protocol.w a = new io.sentry.protocol.w();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public e7 f = e7.c;

    public f7(s7 s7Var, m4 m4Var, t7 t7Var, n nVar) {
        this.i = null;
        io.sentry.util.a aVar = new io.sentry.util.a();
        this.j = aVar;
        this.k = new io.sentry.util.a();
        this.l = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.m = atomicBoolean;
        io.sentry.protocol.e eVar = new io.sentry.protocol.e();
        this.p = eVar;
        i7 i7Var = new i7(s7Var, this, m4Var, t7Var);
        this.b = i7Var;
        this.e = s7Var.T;
        this.o = s7Var.P;
        this.d = m4Var;
        Boolean bool = Boolean.TRUE;
        nVar = bool.equals(K()) ? nVar : null;
        this.q = nVar;
        this.n = s7Var.U;
        this.r = t7Var;
        L(i7Var);
        io.sentry.protocol.w wVarJ = J();
        if (!wVarJ.equals(io.sentry.protocol.w.F) && bool.equals(K())) {
            eVar.k("profile", new w3(wVarJ));
        }
        if (nVar != null) {
            nVar.e(this);
        }
        if (t7Var.i == null && t7Var.j == null) {
            return;
        }
        boolean z = true;
        this.i = new Timer(true);
        Long l = t7Var.j;
        if (l != null) {
            v vVarA = aVar.a();
            try {
                if (this.i != null) {
                    E();
                    atomicBoolean.set(true);
                    this.h = new d7(this, 1);
                    try {
                        this.i.schedule(this.h, l.longValue());
                    } catch (Throwable th) {
                        this.d.r().getLogger().d(t5.WARNING, "Failed to schedule finish timer", th);
                        n7 n7VarE = e();
                        if (n7VarE == null) {
                            n7VarE = n7.DEADLINE_EXCEEDED;
                        }
                        if (this.r.i == null) {
                            z = false;
                        }
                        i(n7VarE, z, null);
                        this.m.set(false);
                    }
                }
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
        w();
    }

    @Override // io.sentry.p1
    public final void A(n7 n7Var, a5 a5Var) {
        I(n7Var, a5Var, true, null);
    }

    @Override // io.sentry.p1
    public final p1 B(String str, String str2) {
        return H(str, str2, null, w1.SENTRY, new hvd());
    }

    @Override // io.sentry.p1
    public final p1 C() {
        return B("http.client", null);
    }

    @Override // io.sentry.p1
    public final a5 D() {
        return this.b.a;
    }

    public final void E() {
        v vVarA = this.j.a();
        try {
            if (this.h != null) {
                this.h.cancel();
                this.m.set(false);
                this.h = null;
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

    public final void F() {
        v vVarA = this.j.a();
        try {
            if (this.g != null) {
                this.g.cancel();
                this.l.set(false);
                this.g = null;
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

    public final p1 G(j7 j7Var, hvd hvdVar) {
        boolean z = this.b.g;
        k3 k3Var = k3.a;
        if (!z && this.o.equals(j7Var.P)) {
            m4 m4Var = this.d;
            if (!io.sentry.util.n.a((String) hvdVar.f, m4Var.r().getIgnoredSpanOrigins())) {
                m7 m7Var = j7Var.G;
                String str = j7Var.I;
                String str2 = j7Var.J;
                CopyOnWriteArrayList copyOnWriteArrayList = this.c;
                if (copyOnWriteArrayList.size() >= m4Var.r().getMaxSpans()) {
                    m4Var.r().getLogger().h(t5.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
                    return k3Var;
                }
                p.v("parentSpanId is required", m7Var);
                p.v("operation is required", str);
                F();
                i7 i7Var = new i7(this, this.d, j7Var, hvdVar, new cd(18, this));
                L(i7Var);
                copyOnWriteArrayList.add(i7Var);
                n nVar = this.q;
                if (nVar != null) {
                    nVar.d(i7Var);
                }
                return i7Var;
            }
        }
        return k3Var;
    }

    public final p1 H(String str, String str2, a5 a5Var, w1 w1Var, hvd hvdVar) {
        boolean z = this.b.g;
        k3 k3Var = k3.a;
        if (z || !this.o.equals(w1Var)) {
            return k3Var;
        }
        int size = this.c.size();
        m4 m4Var = this.d;
        if (size < m4Var.r().getMaxSpans()) {
            return this.b.u(str, str2, a5Var, w1Var, hvdVar);
        }
        m4Var.r().getLogger().h(t5.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
        return k3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(io.sentry.n7 r5, io.sentry.a5 r6, boolean r7, io.sentry.n0 r8) {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.f7.I(io.sentry.n7, io.sentry.a5, boolean, io.sentry.n0):void");
    }

    public final io.sentry.protocol.w J() {
        i7 i7Var = this.b;
        return !i7Var.c.S.equals(io.sentry.protocol.w.F) ? i7Var.c.S : this.d.r().getContinuousProfiler().f();
    }

    public final Boolean K() {
        r7 r7Var = this.b.c.H;
        if (r7Var == null) {
            return null;
        }
        return r7Var.a;
    }

    public final void L(i7 i7Var) {
        io.sentry.util.thread.a threadChecker = this.d.r().getThreadChecker();
        io.sentry.protocol.w wVarJ = J();
        if (!wVarJ.equals(io.sentry.protocol.w.F)) {
            Boolean bool = Boolean.TRUE;
            r7 r7Var = i7Var.c.H;
            if (bool.equals(r7Var == null ? null : r7Var.a)) {
                i7Var.f("profiler_id", wVarJ.toString());
            }
        }
        i7Var.f("thread.id", String.valueOf(threadChecker.b()));
        i7Var.f("thread.name", threadChecker.a());
    }

    public final void M(c cVar) {
        i7 i7Var = this.b;
        m4 m4Var = this.d;
        v vVarA = this.k.a();
        try {
            if (cVar.f) {
                AtomicReference atomicReference = new AtomicReference();
                m4Var.C(new cd(19, atomicReference));
                cVar.d(i7Var.c.E, (io.sentry.protocol.w) atomicReference.get(), m4Var.r(), i7Var.c.H, this.e, this.n);
                cVar.f = false;
            }
            vVarA.close();
        } finally {
        }
    }

    @Override // io.sentry.p1
    public final void a(n7 n7Var) {
        i7 i7Var = this.b;
        if (i7Var.g) {
            this.d.r().getLogger().h(t5.DEBUG, "The transaction is already finished. Status %s cannot be set", n7Var == null ? "null" : n7Var.name());
        } else {
            i7Var.c.K = n7Var;
        }
    }

    @Override // io.sentry.p1
    public final p7 b() {
        c cVar;
        if (!this.d.r().isTraceSampling() || (cVar = this.b.c.Q) == null) {
            return null;
        }
        M(cVar);
        return cVar.e();
    }

    @Override // io.sentry.p1
    public final c7 c() {
        return this.b.c();
    }

    @Override // io.sentry.p1
    public final void d(String str, Boolean bool) {
        this.b.d(str, bool);
    }

    @Override // io.sentry.p1
    public final n7 e() {
        return this.b.c.K;
    }

    @Override // io.sentry.p1
    public final void f(String str, Object obj) {
        i7 i7Var = this.b;
        if (i7Var.g) {
            this.d.r().getLogger().h(t5.DEBUG, "The transaction is already finished. Data %s cannot be set", str);
        } else {
            i7Var.f(str, obj);
        }
    }

    @Override // io.sentry.p1
    public final p1 g(String str, a5 a5Var, w1 w1Var) {
        return H("activity.load", str, a5Var, w1Var, new hvd());
    }

    @Override // io.sentry.p1
    public final String getDescription() {
        return this.b.c.J;
    }

    @Override // io.sentry.r1
    public final String getName() {
        return this.e;
    }

    @Override // io.sentry.p1
    public final boolean h() {
        return this.b.g;
    }

    @Override // io.sentry.r1
    public final void i(n7 n7Var, boolean z, n0 n0Var) {
        if (this.b.g) {
            return;
        }
        a5 a5VarC = this.d.r().getDateProvider().c();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(this.c);
        ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
        while (listIterator.hasPrevious()) {
            i7 i7Var = (i7) listIterator.previous();
            i7Var.j = null;
            i7Var.A(n7Var, a5VarC);
        }
        I(n7Var, a5VarC, z, n0Var);
    }

    @Override // io.sentry.p1
    public final void j(Number number, String str) {
        this.b.j(number, str);
    }

    @Override // io.sentry.p1
    public final void k(Throwable th) {
        i7 i7Var = this.b;
        if (i7Var.g) {
            this.d.r().getLogger().h(t5.DEBUG, "The transaction is already finished. Throwable cannot be set", new Object[0]);
        } else {
            i7Var.e = th;
        }
    }

    @Override // io.sentry.p1
    public final boolean l() {
        return false;
    }

    @Override // io.sentry.p1
    public final void m(n7 n7Var) {
        A(n7Var, null);
    }

    @Override // io.sentry.p1
    public final String n() {
        return this.b.c.I;
    }

    @Override // io.sentry.p1
    public final d o(List list) {
        c cVar;
        if (!this.d.r().isTraceSampling() || (cVar = this.b.c.Q) == null) {
            return null;
        }
        M(cVar);
        return d.g(cVar, list);
    }

    @Override // io.sentry.p1
    public final void p() {
        A(e(), null);
    }

    @Override // io.sentry.p1
    public final void q() {
        m4 m4Var = this.d;
        if (!m4Var.isEnabled()) {
            m4Var.r().getLogger().h(t5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            m4Var.e.V(null).Q(this);
        } catch (Throwable th) {
            m4Var.r().getLogger().d(t5.ERROR, "Error in the 'configureScope' callback.", th);
        }
    }

    @Override // io.sentry.r1
    public final p1 r() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(this.c);
        ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
        while (listIterator.hasPrevious()) {
            i7 i7Var = (i7) listIterator.previous();
            if (!i7Var.g) {
                return i7Var;
            }
        }
        return null;
    }

    @Override // io.sentry.p1
    public final void s(String str) {
        i7 i7Var = this.b;
        if (i7Var.g) {
            this.d.r().getLogger().h(t5.DEBUG, "The transaction is already finished. Description %s cannot be set", str);
        } else {
            i7Var.c.J = str;
        }
    }

    @Override // io.sentry.r1
    public final io.sentry.protocol.w t() {
        return this.a;
    }

    @Override // io.sentry.p1
    public final p1 u(String str, String str2, a5 a5Var, w1 w1Var, hvd hvdVar) {
        return H(str, str2, a5Var, w1Var, hvdVar);
    }

    @Override // io.sentry.p1
    public final p1 v(String str, String str2, hvd hvdVar) {
        return H(str, str2, null, w1.SENTRY, hvdVar);
    }

    @Override // io.sentry.r1
    public final void w() {
        Long l;
        v vVarA = this.j.a();
        try {
            if (this.i != null && (l = this.r.i) != null) {
                F();
                this.l.set(true);
                this.g = new d7(this, 0);
                try {
                    this.i.schedule(this.g, l.longValue());
                } catch (Throwable th) {
                    this.d.r().getLogger().d(t5.WARNING, "Failed to schedule finish timer", th);
                    n7 n7VarE = e();
                    if (n7VarE == null) {
                        n7VarE = n7.OK;
                    }
                    A(n7VarE, null);
                    this.l.set(false);
                }
            }
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

    @Override // io.sentry.p1
    public final void x(String str, Long l, q2 q2Var) {
        this.b.x(str, l, q2Var);
    }

    @Override // io.sentry.p1
    public final j7 y() {
        return this.b.c;
    }

    @Override // io.sentry.p1
    public final a5 z() {
        return this.b.b;
    }
}
