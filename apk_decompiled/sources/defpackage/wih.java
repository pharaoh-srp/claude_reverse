package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wih extends hqb implements oe4, pu9 {
    public final tkh S;
    public ubi T;
    public uih U;

    public wih(tkh tkhVar) {
        this.S = tkhVar;
    }

    @Override // defpackage.pu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        uih uihVar = this.U;
        if (uihVar == null) {
            throw vb7.x("Min size state is not set.");
        }
        lsc lscVar = uihVar.f;
        ubi ubiVar = this.T;
        if (ubiVar == null) {
            throw vb7.x("Font resolution state is not set.");
        }
        Object value = ubiVar.getValue();
        if (!x44.r(value, uihVar.e)) {
            uihVar.e = value;
            lscVar.setValue(Boolean.TRUE);
        }
        if (((Boolean) lscVar.getValue()).booleanValue()) {
            uihVar.g = agh.a(uihVar.d, uihVar.b, uihVar.c, agh.a, 1);
            lscVar.setValue(Boolean.FALSE);
        }
        long j2 = uihVar.g;
        c3d c3dVarU = h5bVar.u(sl4.e(j, sl4.b((int) (j2 >> 32), 0, (int) (j2 & 4294967295L), 0, 10)));
        return q5bVar.U(c3dVarU.E, c3dVarU.F, nm6.E, new mf1(c3dVarU, 7));
    }

    @Override // defpackage.hqb
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.nw5
    public final void f() {
        uih uihVar = this.U;
        if (uihVar != null) {
            uih.a(uihVar, null, yfd.W(this).d0, null, 29);
        }
        yfd.W(this).T();
    }

    @Override // defpackage.nw5
    public final void f0() {
        uih uihVar = this.U;
        if (uihVar != null) {
            uih.a(uihVar, yfd.W(this).e0, null, null, 30);
        }
        yfd.W(this).T();
    }

    @Override // defpackage.hqb
    public final void h1() {
        tkh tkhVarY = yfd.Y(this.S, yfd.W(this).e0);
        wt7 wt7Var = (wt7) yb5.o(this, ve4.k);
        p1(tkhVarY, wt7Var);
        fu9 fu9Var = yfd.W(this).e0;
        cz5 cz5Var = yfd.W(this).d0;
        ubi ubiVar = this.T;
        if (ubiVar == null) {
            throw vb7.x("Font resolution state is not set.");
        }
        this.U = new uih(fu9Var, cz5Var, wt7Var, tkhVarY, ubiVar.getValue());
    }

    @Override // defpackage.hqb
    public final void i1() {
        this.T = null;
        this.U = null;
    }

    public final void p1(tkh tkhVar, wt7 wt7Var) {
        egg eggVar = tkhVar.a;
        xt7 xt7Var = eggVar.f;
        dv7 dv7Var = eggVar.c;
        if (dv7Var == null) {
            dv7Var = dv7.J;
        }
        wu7 wu7Var = eggVar.d;
        int i = wu7Var != null ? wu7Var.a : 0;
        xu7 xu7Var = eggVar.e;
        this.T = ((zt7) wt7Var).b(xt7Var, dv7Var, i, xu7Var != null ? xu7Var.a : 65535);
        yfd.W(this).T();
    }
}
