package io.sentry;

import defpackage.cd;
import defpackage.hvd;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class i7 implements p1 {
    public a5 a;
    public a5 b;
    public final j7 c;
    public final f7 d;
    public Throwable e;
    public final h1 f;
    public final hvd i;
    public k7 j;
    public boolean g = false;
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final ConcurrentHashMap k = new ConcurrentHashMap();
    public final ConcurrentHashMap l = new ConcurrentHashMap();

    public i7(f7 f7Var, m4 m4Var, j7 j7Var, hvd hvdVar, cd cdVar) {
        new ConcurrentHashMap();
        new io.sentry.util.a();
        this.c = j7Var;
        j7Var.M = (String) hvdVar.f;
        this.d = f7Var;
        p.v("Scopes are required", m4Var);
        this.f = m4Var;
        this.i = hvdVar;
        this.j = cdVar;
        a5 a5Var = (a5) hvdVar.d;
        if (a5Var != null) {
            this.a = a5Var;
        } else {
            this.a = m4Var.r().getDateProvider().c();
        }
    }

    @Override // io.sentry.p1
    public final void A(n7 n7Var, a5 a5Var) {
        a5 a5Var2;
        a5 a5Var3;
        if (this.g || !this.h.compareAndSet(false, true)) {
            return;
        }
        j7 j7Var = this.c;
        j7Var.K = n7Var;
        m7 m7Var = j7Var.F;
        h1 h1Var = this.f;
        if (a5Var == null) {
            a5Var = h1Var.r().getDateProvider().c();
        }
        this.b = a5Var;
        hvd hvdVar = this.i;
        boolean z = hvdVar.a;
        f7 f7Var = this.d;
        if (z || hvdVar.b) {
            i7 i7Var = f7Var.b;
            CopyOnWriteArrayList<i7> copyOnWriteArrayList = f7Var.c;
            List<i7> list = copyOnWriteArrayList;
            if (!i7Var.c.F.equals(m7Var)) {
                ArrayList arrayList = new ArrayList();
                for (i7 i7Var2 : copyOnWriteArrayList) {
                    m7 m7Var2 = i7Var2.c.G;
                    if (m7Var2 != null && m7Var2.equals(m7Var)) {
                        arrayList.add(i7Var2);
                    }
                }
                list = arrayList;
            }
            a5 a5Var4 = null;
            a5 a5Var5 = null;
            for (i7 i7Var3 : list) {
                if (a5Var4 == null || i7Var3.a.b(a5Var4) < 0) {
                    a5Var4 = i7Var3.a;
                }
                if (a5Var5 == null || ((a5Var3 = i7Var3.b) != null && a5Var3.b(a5Var5) > 0)) {
                    a5Var5 = i7Var3.b;
                }
            }
            if (hvdVar.a && a5Var4 != null && this.a.b(a5Var4) < 0) {
                this.a = a5Var4;
            }
            if (hvdVar.b && a5Var5 != null && (((a5Var2 = this.b) == null || a5Var2.b(a5Var5) > 0) && this.b != null)) {
                this.b = a5Var5;
            }
        }
        Throwable th = this.e;
        if (th != null) {
            h1Var.i(th, this, f7Var.e);
        }
        k7 k7Var = this.j;
        if (k7Var != null) {
            k7Var.b(this);
        }
        this.g = true;
    }

    @Override // io.sentry.p1
    public final p1 B(String str, String str2) {
        if (this.g) {
            return k3.a;
        }
        m7 m7Var = this.c.F;
        f7 f7Var = this.d;
        f7Var.getClass();
        hvd hvdVar = new hvd();
        j7 j7Var = f7Var.b.c;
        j7 j7Var2 = new j7(j7Var.E, new m7(), m7Var, str, null, j7Var.H, null, "manual");
        j7Var2.J = str2;
        j7Var2.P = w1.SENTRY;
        return f7Var.G(j7Var2, hvdVar);
    }

    @Override // io.sentry.p1
    public final p1 C() {
        return B("http.client", null);
    }

    @Override // io.sentry.p1
    public final a5 D() {
        return this.a;
    }

    @Override // io.sentry.p1
    public final void a(n7 n7Var) {
        this.c.K = n7Var;
    }

    @Override // io.sentry.p1
    public final c7 c() {
        j7 j7Var = this.c;
        io.sentry.protocol.w wVar = j7Var.E;
        m7 m7Var = j7Var.F;
        r7 r7Var = j7Var.H;
        return new c7(wVar, m7Var, r7Var == null ? null : r7Var.a);
    }

    @Override // io.sentry.p1
    public final void d(String str, Boolean bool) {
        this.c.R.c(str, bool);
    }

    @Override // io.sentry.p1
    public final n7 e() {
        return this.c.K;
    }

    @Override // io.sentry.p1
    public final void f(String str, Object obj) {
        ConcurrentHashMap concurrentHashMap = this.k;
        if (obj == null) {
            concurrentHashMap.remove(str);
        } else {
            concurrentHashMap.put(str, obj);
        }
    }

    @Override // io.sentry.p1
    public final p1 g(String str, a5 a5Var, w1 w1Var) {
        return u("activity.load", str, a5Var, w1Var, new hvd());
    }

    @Override // io.sentry.p1
    public final String getDescription() {
        return this.c.J;
    }

    @Override // io.sentry.p1
    public final boolean h() {
        return this.g;
    }

    @Override // io.sentry.p1
    public final void j(Number number, String str) {
        if (this.g) {
            this.f.r().getLogger().h(t5.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.l.put(str, new io.sentry.protocol.n(number, null));
        f7 f7Var = this.d;
        i7 i7Var = f7Var.b;
        if (i7Var == this || i7Var.l.containsKey(str)) {
            return;
        }
        f7Var.j(number, str);
    }

    @Override // io.sentry.p1
    public final void k(Throwable th) {
        this.e = th;
    }

    @Override // io.sentry.p1
    public final boolean l() {
        return false;
    }

    @Override // io.sentry.p1
    public final void m(n7 n7Var) {
        A(n7Var, this.f.r().getDateProvider().c());
    }

    @Override // io.sentry.p1
    public final String n() {
        throw null;
    }

    @Override // io.sentry.p1
    public final d o(List list) {
        return this.d.o(list);
    }

    @Override // io.sentry.p1
    public final void p() {
        m(this.c.K);
    }

    @Override // io.sentry.p1
    public final void s(String str) {
        this.c.J = str;
    }

    @Override // io.sentry.p1
    public final p1 u(String str, String str2, a5 a5Var, w1 w1Var, hvd hvdVar) {
        if (this.g) {
            return k3.a;
        }
        m7 m7Var = this.c.F;
        f7 f7Var = this.d;
        j7 j7Var = f7Var.b.c;
        j7 j7Var2 = new j7(j7Var.E, new m7(), m7Var, str, null, j7Var.H, null, "manual");
        j7Var2.J = str2;
        j7Var2.P = w1Var;
        hvdVar.d = a5Var;
        return f7Var.G(j7Var2, hvdVar);
    }

    @Override // io.sentry.p1
    public final p1 v(String str, String str2, hvd hvdVar) {
        if (this.g) {
            return k3.a;
        }
        m7 m7Var = this.c.F;
        f7 f7Var = this.d;
        j7 j7Var = f7Var.b.c;
        j7 j7Var2 = new j7(j7Var.E, new m7(), m7Var, str, null, j7Var.H, null, "manual");
        j7Var2.J = str2;
        j7Var2.P = w1.SENTRY;
        return f7Var.G(j7Var2, hvdVar);
    }

    @Override // io.sentry.p1
    public final void x(String str, Long l, q2 q2Var) {
        if (this.g) {
            this.f.r().getLogger().h(t5.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.l.put(str, new io.sentry.protocol.n(l, q2Var.apiName()));
        f7 f7Var = this.d;
        i7 i7Var = f7Var.b;
        if (i7Var == this || i7Var.l.containsKey(str)) {
            return;
        }
        f7Var.x(str, l, q2Var);
    }

    @Override // io.sentry.p1
    public final j7 y() {
        return this.c;
    }

    @Override // io.sentry.p1
    public final a5 z() {
        return this.b;
    }

    public i7(s7 s7Var, f7 f7Var, m4 m4Var, t7 t7Var) {
        new ConcurrentHashMap();
        new io.sentry.util.a();
        this.c = s7Var;
        s7Var.M = (String) t7Var.f;
        this.d = f7Var;
        this.f = m4Var;
        this.j = null;
        a5 a5Var = (a5) t7Var.d;
        if (a5Var != null) {
            this.a = a5Var;
        } else {
            this.a = m4Var.r().getDateProvider().c();
        }
        this.i = t7Var;
    }
}
