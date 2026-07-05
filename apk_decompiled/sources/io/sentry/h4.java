package io.sentry;

import defpackage.ij0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h4 implements f1 {
    public t5 a;
    public r1 b;
    public final WeakReference c;
    public io.sentry.protocol.i0 d;
    public String e;
    public io.sentry.protocol.r f;
    public ArrayList g;
    public volatile Queue h;
    public final ConcurrentHashMap i;
    public final ConcurrentHashMap j;
    public final ConcurrentHashMap k;
    public final CopyOnWriteArrayList l;
    public volatile w6 m;
    public volatile h7 n;
    public final io.sentry.util.a o;
    public final io.sentry.util.a p;
    public final io.sentry.util.a q;
    public final io.sentry.protocol.e r;
    public final CopyOnWriteArrayList s;
    public m t;
    public io.sentry.protocol.w u;
    public k1 v;
    public final Map w;
    public final io.sentry.featureflags.c x;

    public h4(h4 h4Var) {
        io.sentry.protocol.i0 i0Var;
        io.sentry.protocol.r rVar;
        this.c = new WeakReference(null);
        this.g = new ArrayList();
        this.i = new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
        this.k = new ConcurrentHashMap();
        this.l = new CopyOnWriteArrayList();
        this.o = new io.sentry.util.a();
        this.p = new io.sentry.util.a();
        this.q = new io.sentry.util.a();
        this.r = new io.sentry.protocol.e();
        this.s = new CopyOnWriteArrayList();
        this.u = io.sentry.protocol.w.F;
        this.v = g3.a;
        this.w = Collections.synchronizedMap(new WeakHashMap());
        this.b = h4Var.b;
        this.c = h4Var.c;
        this.n = h4Var.n;
        this.m = h4Var.m;
        this.a = h4Var.a;
        this.v = h4Var.v;
        io.sentry.protocol.i0 i0Var2 = h4Var.d;
        if (i0Var2 != null) {
            i0Var = new io.sentry.protocol.i0();
            i0Var.E = i0Var2.E;
            i0Var.G = i0Var2.G;
            i0Var.F = i0Var2.F;
            i0Var.H = i0Var2.H;
            i0Var.I = i0Var2.I;
            i0Var.J = i0Var2.J;
            i0Var.K = p.r(i0Var2.K);
            i0Var.L = p.r(i0Var2.L);
        } else {
            i0Var = null;
        }
        this.d = i0Var;
        this.e = h4Var.e;
        this.u = h4Var.u;
        io.sentry.protocol.r rVar2 = h4Var.f;
        if (rVar2 != null) {
            rVar = new io.sentry.protocol.r();
            rVar.E = rVar2.E;
            rVar.I = rVar2.I;
            rVar.F = rVar2.F;
            rVar.G = rVar2.G;
            rVar.J = p.r(rVar2.J);
            rVar.K = p.r(rVar2.K);
            rVar.M = p.r(rVar2.M);
            rVar.P = p.r(rVar2.P);
            rVar.H = rVar2.H;
            rVar.N = rVar2.N;
            rVar.L = rVar2.L;
            rVar.O = rVar2.O;
        } else {
            rVar = null;
        }
        this.f = rVar;
        this.g = new ArrayList(h4Var.g);
        this.l = new CopyOnWriteArrayList(h4Var.l);
        g[] gVarArr = (g[]) h4Var.h.toArray(new g[0]);
        Queue queueB = b(h4Var.m.getMaxBreadcrumbs());
        for (g gVar : gVarArr) {
            queueB.add(new g(gVar));
        }
        this.h = queueB;
        ConcurrentHashMap concurrentHashMap = h4Var.i;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (entry != null) {
                concurrentHashMap2.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        this.i = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = h4Var.j;
        ConcurrentHashMap concurrentHashMap4 = new ConcurrentHashMap();
        for (Map.Entry entry2 : concurrentHashMap3.entrySet()) {
            if (entry2 != null) {
                String str = (String) entry2.getKey();
                ij0.x(entry2.getValue());
                concurrentHashMap4.put(str, null);
            }
        }
        this.j = concurrentHashMap4;
        ConcurrentHashMap concurrentHashMap5 = h4Var.k;
        ConcurrentHashMap concurrentHashMap6 = new ConcurrentHashMap();
        for (Map.Entry entry3 : concurrentHashMap5.entrySet()) {
            if (entry3 != null) {
                concurrentHashMap6.put((String) entry3.getKey(), entry3.getValue());
            }
        }
        this.k = concurrentHashMap6;
        this.r = new io.sentry.protocol.e(h4Var.r);
        this.s = new CopyOnWriteArrayList(h4Var.s);
        this.x = h4Var.x.clone();
        this.t = new m(h4Var.t);
    }

    public static Queue b(int i) {
        return i > 0 ? new o7(new i(i)) : new d0();
    }

    @Override // io.sentry.f1
    public final Queue A() {
        return this.h;
    }

    @Override // io.sentry.f1
    public final void B(m mVar) {
        this.t = mVar;
        j7 j7Var = new j7((io.sentry.protocol.w) mVar.b, (m7) mVar.c, "default", null);
        j7Var.M = "auto";
        Iterator<g1> it = this.m.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().v(j7Var, this);
        }
    }

    @Override // io.sentry.f1
    public final t5 C() {
        return this.a;
    }

    @Override // io.sentry.f1
    public final m D() {
        return this.t;
    }

    @Override // io.sentry.f1
    public final h7 E(f4 f4Var) {
        v vVarA = this.o.a();
        try {
            f4Var.b(this.n);
            h7 h7VarClone = this.n != null ? this.n.clone() : null;
            vVarA.close();
            return h7VarClone;
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.f1
    public final void F(String str) {
        this.e = str;
        io.sentry.protocol.e eVar = this.r;
        io.sentry.protocol.a aVarD = eVar.d();
        if (aVarD == null) {
            aVarD = new io.sentry.protocol.a();
            eVar.m(aVarD);
        }
        if (str == null) {
            aVarD.M = null;
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            aVarD.M = arrayList;
        }
        Iterator<g1> it = this.m.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().x(eVar);
        }
    }

    @Override // io.sentry.f1
    public final k1 G() {
        return this.v;
    }

    @Override // io.sentry.f1
    public final Map H() {
        return p.r(this.i);
    }

    @Override // io.sentry.f1
    public final void I() {
        this.h.clear();
        Iterator<g1> it = this.m.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().n(this.h);
        }
    }

    @Override // io.sentry.f1
    public final List J() {
        return this.l;
    }

    @Override // io.sentry.f1
    public final void K(j5 j5Var) {
        p1 p1Var;
        if (!this.m.isTracingEnabled() || j5Var.b() == null) {
            return;
        }
        Map map = this.w;
        Throwable thB = j5Var.b();
        p.v("throwable cannot be null", thB);
        while (thB.getCause() != null && thB.getCause() != thB) {
            thB = thB.getCause();
        }
        io.sentry.util.j jVar = (io.sentry.util.j) map.get(thB);
        if (jVar != null) {
            WeakReference weakReference = jVar.a;
            if (j5Var.F.i() == null && (p1Var = (p1) weakReference.get()) != null) {
                j5Var.F.v(p1Var.y());
            }
            String str = (String) jVar.b;
            if (j5Var.Z != null || str == null) {
                return;
            }
            j5Var.Z = str;
        }
    }

    @Override // io.sentry.f1
    public final io.sentry.protocol.e L() {
        return this.r;
    }

    @Override // io.sentry.f1
    public final m M(e4 e4Var) {
        v vVarA = this.q.a();
        try {
            e4Var.g(this.t);
            m mVar = new m(this.t);
            vVarA.close();
            return mVar;
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.f1
    public final String N() {
        return this.e;
    }

    @Override // io.sentry.f1
    public final void O(g4 g4Var) {
        v vVarA = this.p.a();
        try {
            g4Var.c(this.b);
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

    @Override // io.sentry.f1
    public final void P(io.sentry.protocol.w wVar) {
    }

    @Override // io.sentry.f1
    public final void Q(r1 r1Var) {
        v vVarA = this.p.a();
        try {
            this.b = r1Var;
            for (g1 g1Var : this.m.getScopeObservers()) {
                if (r1Var != null) {
                    g1Var.z(r1Var.getName());
                    g1Var.v(r1Var.y(), this);
                } else {
                    g1Var.z(null);
                    g1Var.v(null, this);
                }
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

    @Override // io.sentry.f1
    public final List R() {
        return this.g;
    }

    @Override // io.sentry.f1
    public final io.sentry.protocol.i0 S() {
        return this.d;
    }

    @Override // io.sentry.f1
    public final List T() {
        return io.sentry.config.a.M(this.l);
    }

    @Override // io.sentry.f1
    public final String U() {
        r1 r1Var = this.b;
        if (r1Var != null) {
            return r1Var.getName();
        }
        return null;
    }

    @Override // io.sentry.f1
    public final io.sentry.protocol.r a() {
        return this.f;
    }

    @Override // io.sentry.f1
    public final p1 c() {
        p1 p1VarR;
        p1 p1Var = (p1) this.c.get();
        if (p1Var != null) {
            return p1Var;
        }
        r1 r1Var = this.b;
        return (r1Var == null || (p1VarR = r1Var.r()) == null) ? r1Var : p1VarR;
    }

    @Override // io.sentry.f1
    public final void clear() {
        this.a = null;
        this.d = null;
        this.f = null;
        this.e = null;
        this.g.clear();
        I();
        this.i.clear();
        this.j.clear();
        this.k.clear();
        this.l.clear();
        x();
        this.s.clear();
        Iterator<g1> it = this.m.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().r();
        }
        this.x.clear();
    }

    @Override // io.sentry.f1
    public final f1 clone() {
        return new h4(this);
    }

    @Override // io.sentry.f1
    public final void d(String str, Boolean bool) {
        this.x.c(str, bool);
    }

    @Override // io.sentry.f1
    public final void e(io.sentry.protocol.i0 i0Var) {
        this.d = i0Var;
        Iterator<g1> it = this.m.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().e(i0Var);
        }
    }

    @Override // io.sentry.f1
    public final void f(String str, String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            t(str);
            return;
        }
        this.i.put(str, str2);
        for (g1 g1Var : this.m.getScopeObservers()) {
            g1Var.f(str, str2);
            g1Var.u(this.i);
        }
    }

    @Override // io.sentry.f1
    public final List getAttachments() {
        return new CopyOnWriteArrayList(this.s);
    }

    @Override // io.sentry.f1
    public final Map getExtras() {
        return this.k;
    }

    @Override // io.sentry.f1
    public final void i(Throwable th, i7 i7Var, String str) {
        p.v("throwable is required", th);
        p.v("transactionName is required", str);
        while (th.getCause() != null && th.getCause() != th) {
            th = th.getCause();
        }
        Map map = this.w;
        if (map.containsKey(th)) {
            return;
        }
        map.put(th, new io.sentry.util.j(new WeakReference(i7Var), str));
    }

    @Override // io.sentry.f1
    public final void j(g gVar, n0 n0Var) {
        if (gVar == null || (this.h instanceof d0)) {
            return;
        }
        if (n0Var == null) {
            n0Var = new n0();
        }
        h6 beforeBreadcrumb = this.m.getBeforeBreadcrumb();
        if (beforeBreadcrumb != null) {
            try {
                gVar = beforeBreadcrumb.i(gVar, n0Var);
            } catch (Throwable th) {
                this.m.getLogger().d(t5.ERROR, "The BeforeBreadcrumbCallback callback threw an exception. Exception details will be added to the breadcrumb.", th);
                if (th.getMessage() != null) {
                    gVar.c("sentry:message", th.getMessage());
                }
            }
        }
        if (gVar == null) {
            this.m.getLogger().h(t5.INFO, "Breadcrumb was dropped by beforeBreadcrumb", new Object[0]);
            return;
        }
        this.h.add(gVar);
        for (g1 g1Var : this.m.getScopeObservers()) {
            g1Var.m(gVar);
            g1Var.n(this.h);
        }
    }

    @Override // io.sentry.f1
    public final io.sentry.protocol.j k() {
        return this.x.k();
    }

    @Override // io.sentry.f1
    public final io.sentry.protocol.w n() {
        return this.u;
    }

    @Override // io.sentry.f1
    public final void o(List list) {
        this.g = new ArrayList(list);
        Iterator<g1> it = this.m.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().o(list);
        }
    }

    @Override // io.sentry.f1
    public final void p(String str, String str2) {
        if (str == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.k;
        if (str2 == null) {
            concurrentHashMap.remove(str);
            for (g1 g1Var : this.m.getScopeObservers()) {
                g1Var.s(str);
                g1Var.y(this.k);
            }
            return;
        }
        concurrentHashMap.put(str, str2);
        for (g1 g1Var2 : this.m.getScopeObservers()) {
            g1Var2.p(str, str2);
            g1Var2.y(this.k);
        }
    }

    @Override // io.sentry.f1
    public final void q(io.sentry.protocol.w wVar) {
        this.u = wVar;
        Iterator<g1> it = this.m.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().q(wVar);
        }
    }

    @Override // io.sentry.f1
    public final w6 r() {
        return this.m;
    }

    @Override // io.sentry.f1
    public final r1 s() {
        return this.b;
    }

    @Override // io.sentry.f1
    public final void t(String str) {
        if (str == null) {
            return;
        }
        this.i.remove(str);
        for (g1 g1Var : this.m.getScopeObservers()) {
            g1Var.t(str);
            g1Var.u(this.i);
        }
    }

    @Override // io.sentry.f1
    public final h7 u() {
        v vVarA = this.o.a();
        try {
            h7 h7Var = null;
            if (this.n != null) {
                h7 h7Var2 = this.n;
                h7Var2.getClass();
                h7Var2.b(p.k());
                this.m.getContinuousProfiler().e();
                h7 h7VarClone = this.n.clone();
                this.n = null;
                h7Var = h7VarClone;
            }
            vVarA.close();
            return h7Var;
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.f1
    public final io.sentry.internal.debugmeta.c v() {
        v vVarA = this.o.a();
        try {
            if (this.n != null) {
                h7 h7Var = this.n;
                h7Var.getClass();
                h7Var.b(p.k());
                this.m.getContinuousProfiler().e();
            }
            h7 h7Var2 = this.n;
            io.sentry.internal.debugmeta.c cVar = null;
            if (this.m.getRelease() != null) {
                String distinctId = this.m.getDistinctId();
                io.sentry.protocol.i0 i0Var = this.d;
                this.n = new h7(g7.Ok, p.k(), p.k(), 0, distinctId, p.i(), Boolean.TRUE, null, null, i0Var != null ? i0Var.H : null, null, this.m.getEnvironment(), this.m.getRelease(), null);
                cVar = new io.sentry.internal.debugmeta.c(this.n.clone(), h7Var2 != null ? h7Var2.clone() : null);
            } else {
                this.m.getLogger().h(t5.WARNING, "Release is not set on SentryOptions. Session could not be started", new Object[0]);
            }
            vVarA.close();
            return cVar;
        } catch (Throwable th) {
            try {
                vVarA.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // io.sentry.f1
    public final void w(t5 t5Var) {
        this.a = t5Var;
        Iterator<g1> it = this.m.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().w(t5Var);
        }
    }

    @Override // io.sentry.f1
    public final void x() {
        v vVarA = this.p.a();
        try {
            this.b = null;
            vVarA.close();
            for (g1 g1Var : this.m.getScopeObservers()) {
                g1Var.z(null);
                g1Var.v(null, this);
            }
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.f1
    public final io.sentry.featureflags.c y() {
        return this.x;
    }

    @Override // io.sentry.f1
    public final h7 z() {
        return this.n;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final Object m1186clone() {
        return new h4(this);
    }

    public h4(w6 w6Var) {
        io.sentry.featureflags.c bVar;
        this.c = new WeakReference(null);
        this.g = new ArrayList();
        this.i = new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
        this.k = new ConcurrentHashMap();
        this.l = new CopyOnWriteArrayList();
        this.o = new io.sentry.util.a();
        this.p = new io.sentry.util.a();
        this.q = new io.sentry.util.a();
        this.r = new io.sentry.protocol.e();
        this.s = new CopyOnWriteArrayList();
        this.u = io.sentry.protocol.w.F;
        this.v = g3.a;
        this.w = Collections.synchronizedMap(new WeakHashMap());
        p.v("SentryOptions is required.", w6Var);
        this.m = w6Var;
        this.h = b(this.m.getMaxBreadcrumbs());
        int maxFeatureFlags = w6Var.getMaxFeatureFlags();
        if (maxFeatureFlags > 0) {
            bVar = new io.sentry.featureflags.b(maxFeatureFlags);
        } else {
            bVar = io.sentry.featureflags.d.E;
        }
        this.x = bVar;
        this.t = new m();
    }
}
