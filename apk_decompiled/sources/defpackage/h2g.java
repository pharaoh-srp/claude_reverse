package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class h2g implements mee {
    public final lsc E = mpk.P(Boolean.FALSE);
    public final hsc F = new hsc(MTTypesetterKt.kLineSkipLimitMultiplier);
    public final lsc G;
    public final lsc H;
    public final lsc I;
    public final lsc J;
    public final lsc K;
    public final lsc L;
    public final lsc M;
    public c40 N;
    public h2g O;
    public s1g P;
    public final lsc Q;

    public h2g(g2g g2gVar, sv1 sv1Var, g3g g3gVar, l3g l3gVar, h3g h3gVar) {
        Boolean bool = Boolean.TRUE;
        this.G = mpk.P(bool);
        this.H = mpk.P(g2gVar);
        this.I = mpk.P(sv1Var);
        this.J = mpk.P(g3gVar);
        this.K = mpk.P(bool);
        this.L = mpk.P(l3gVar);
        this.M = mpk.P(h3gVar);
        this.Q = mpk.P(null);
    }

    @Override // defpackage.mee
    public final void a() {
    }

    @Override // defpackage.mee
    public final void b() {
        k3g k3gVar = d().b;
        g2g g2gVarD = d();
        g2gVarD.d.setValue(w44.X0(g2gVarD.b(), this));
        g2gVarD.e.setValue(w44.X0(g2gVarD.c(), this));
        g2gVarD.e();
        k3gVar.e();
        k3gVar.K.remove(this);
        if (g2gVarD.b().isEmpty()) {
            gb9.D(g2gVarD.b.F, null, null, new x1d(g2gVarD, this, null, 10), 3);
        }
        d().c.b();
    }

    public final sv1 c() {
        return (sv1) this.I.getValue();
    }

    public final g2g d() {
        return (g2g) this.H.getValue();
    }

    public final boolean e() {
        if (c().b()) {
            return true;
        }
        return (d().c.a().d() && !d().c.a().b()) || !((Boolean) this.K.getValue()).booleanValue();
    }

    public final boolean f() {
        return e() && d().c.a().d() && h() && ((Boolean) this.G.getValue()).booleanValue() && d().b.a();
    }

    @Override // defpackage.mee
    public final void g() {
        k3g k3gVar = d().b;
        g2g g2gVarD = d();
        g2gVarD.d.setValue(w44.b1(g2gVarD.b(), this));
        g2gVarD.e();
        k3gVar.e();
        kdg kdgVar = k3gVar.K;
        ListIterator listIterator = kdgVar.listIterator();
        int i = 0;
        while (true) {
            c8a c8aVar = (c8a) listIterator;
            if (!c8aVar.hasNext()) {
                i = -1;
                break;
            }
            h2g h2gVar = (h2g) c8aVar.next();
            if (h2gVar == null) {
                h2gVar = null;
            }
            if (x44.r(h2gVar != null ? h2gVar.d() : null, d())) {
                break;
            } else {
                i++;
            }
        }
        if (i == kdgVar.size() - 1 || i == -1) {
            kdgVar.add(this);
        } else {
            kdgVar.add(i + 1, this);
        }
        d().c.b();
    }

    public final boolean h() {
        h3g h3gVar = (h3g) this.M.getValue();
        if (!((Boolean) this.E.getValue()).booleanValue()) {
            return false;
        }
        ((b3g) h3gVar.b.getValue()).getClass();
        return true;
    }
}
