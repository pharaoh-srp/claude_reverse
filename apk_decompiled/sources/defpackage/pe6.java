package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pe6 {
    public final fg1 a;
    public final fg1 b;
    public final dx c;
    public final ig1 d;
    public final l45 e;
    public final lsc f;
    public final lsc g;
    public final lsc h;

    public pe6(ag6 ag6Var, fg1 fg1Var, fg1 fg1Var2, dx dxVar, ig1 ig1Var, l45 l45Var) {
        l45Var.getClass();
        this.a = fg1Var;
        this.b = fg1Var2;
        this.c = dxVar;
        this.d = ig1Var;
        this.e = l45Var;
        this.f = mpk.P(ag6Var);
        this.g = mpk.P(null);
        this.h = mpk.P(null);
    }

    public final uf6 a() {
        lsc lscVar = this.g;
        uf6 uf6Var = (uf6) lscVar.getValue();
        if (uf6Var == null) {
            return b();
        }
        List list = uf6Var.a;
        lscVar.setValue(null);
        uf6 uf6Var2 = (uf6) this.h.getValue();
        if (uf6Var2 == null) {
            uf6Var2 = (uf6) this.a.a();
        }
        if (x44.r(list, (List) uf6Var2.a((List) this.b.a()).E) && x44.r(uf6Var.b, uf6Var2.b) && uf6Var.c == uf6Var2.c) {
            return uf6Var2;
        }
        d(uf6Var);
        pf6 pf6Var = (pf6) w44.N0(list);
        if (pf6Var != null) {
            this.d.invoke(pf6Var);
        }
        return uf6Var;
    }

    public final uf6 b() {
        uf6 uf6Var = (uf6) this.g.getValue();
        return (uf6Var == null && (uf6Var = (uf6) this.h.getValue()) == null) ? (uf6) this.a.a() : uf6Var;
    }

    public final ag6 c() {
        return (ag6) this.f.getValue();
    }

    public final void d(uf6 uf6Var) {
        this.h.setValue(uf6Var);
        gb9.D(this.e, null, null, new ix5(this, uf6Var, null, 1), 3);
    }
}
