package defpackage;

import android.os.Looper;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class bvb {
    public static final Object k = new Object();
    public final Object a;
    public final h3f b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final m j;

    public bvb(int i) {
        zic zicVar = n78.K;
        this.a = new Object();
        this.b = new h3f();
        this.c = 0;
        this.f = k;
        this.j = new m(3, this);
        this.e = zicVar;
        this.g = 0;
    }

    public static void a(String str) {
        bo0.T().f.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        sz6.j(ij0.j("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(rba rbaVar) {
        if (rbaVar.F) {
            if (!rbaVar.e()) {
                rbaVar.a(false);
                return;
            }
            int i = rbaVar.G;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            rbaVar.G = i2;
            rbaVar.E.G(this.e);
        }
    }

    public final void c(rba rbaVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (rbaVar != null) {
                b(rbaVar);
                rbaVar = null;
            } else {
                h3f h3fVar = this.b;
                h3fVar.getClass();
                f3f f3fVar = new f3f(h3fVar);
                h3fVar.G.put(f3fVar, Boolean.FALSE);
                while (f3fVar.hasNext()) {
                    b((rba) ((Map.Entry) f3fVar.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final void d(m4a m4aVar, kbc kbcVar) {
        Object obj;
        a("observe");
        if (m4aVar.a().b() == a4a.E) {
            return;
        }
        qba qbaVar = new qba(this, m4aVar, kbcVar);
        h3f h3fVar = this.b;
        e3f e3fVarA = h3fVar.a(kbcVar);
        if (e3fVarA != null) {
            obj = e3fVarA.F;
        } else {
            e3f e3fVar = new e3f(kbcVar, qbaVar);
            h3fVar.H++;
            e3f e3fVar2 = h3fVar.F;
            if (e3fVar2 == null) {
                h3fVar.E = e3fVar;
                h3fVar.F = e3fVar;
            } else {
                e3fVar2.G = e3fVar;
                e3fVar.H = e3fVar2;
                h3fVar.F = e3fVar;
            }
            obj = null;
        }
        rba rbaVar = (rba) obj;
        if (rbaVar != null && !rbaVar.c(m4aVar)) {
            sz6.p("Cannot add the same observer with different lifecycles");
        } else {
            if (rbaVar != null) {
                return;
            }
            m4aVar.a().a(qbaVar);
        }
    }

    public void e() {
    }

    public void f() {
    }

    public final void g(Object obj) {
        boolean z;
        synchronized (this.a) {
            z = this.f == k;
            this.f = obj;
        }
        if (z) {
            bo0 bo0VarT = bo0.T();
            m mVar = this.j;
            mu5 mu5Var = bo0VarT.f;
            if (mu5Var.h == null) {
                synchronized (mu5Var.f) {
                    try {
                        if (mu5Var.h == null) {
                            mu5Var.h = mu5.T(Looper.getMainLooper());
                        }
                    } finally {
                    }
                }
            }
            mu5Var.h.post(mVar);
        }
    }

    public void h(kbc kbcVar) {
        a("removeObserver");
        rba rbaVar = (rba) this.b.b(kbcVar);
        if (rbaVar == null) {
            return;
        }
        rbaVar.b();
        rbaVar.a(false);
    }

    public void i(Object obj) {
        a("setValue");
        this.g++;
        this.e = obj;
        c(null);
    }

    public bvb() {
        this.a = new Object();
        this.b = new h3f();
        this.c = 0;
        Object obj = k;
        this.f = obj;
        this.j = new m(3, this);
        this.e = obj;
        this.g = -1;
    }
}
