package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class yhf implements mee {
    public final long E;
    public final sif F;
    public final long G;
    public epk H = epk.H;
    public ztb I;
    public final iqb J;

    public yhf(long j, sif sifVar, long j2) {
        this.E = j;
        this.F = sifVar;
        this.G = j2;
        xhf xhfVar = new xhf(this, 2);
        zhf zhfVar = new zhf(xhfVar, sifVar, j);
        hw1 hw1Var = new hw1();
        hw1Var.G = xhfVar;
        hw1Var.H = sifVar;
        hw1Var.F = j;
        hw1Var.E = 0L;
        iqb iqbVarB = a0h.b(fqb.E, hw1Var, zhfVar, new c35(hw1Var, 4, zhfVar));
        x7d.a.getClass();
        this.J = eve.O(iqbVarB, csg.h);
    }

    @Override // defpackage.mee
    public final void a() {
        ztb ztbVar = this.I;
        if (ztbVar != null) {
            ((tif) this.F).e(ztbVar);
            this.I = null;
        }
    }

    @Override // defpackage.mee
    public final void b() {
        ztb ztbVar = this.I;
        if (ztbVar != null) {
            ((tif) this.F).e(ztbVar);
            this.I = null;
        }
    }

    public final void c(cv9 cv9Var) {
        ib2 ib2Var = cv9Var.E;
        ohf ohfVar = (ohf) ((tif) this.F).a().e(this.E);
        if (ohfVar == null) {
            return;
        }
        nhf nhfVar = ohfVar.b;
        nhf nhfVar2 = ohfVar.a;
        boolean z = ohfVar.c;
        int i = !z ? nhfVar2.b : nhfVar.b;
        int i2 = !z ? nhfVar.b : nhfVar2.b;
        if (i == i2) {
            return;
        }
        ztb ztbVar = this.I;
        int iC = ztbVar != null ? ztbVar.c() : 0;
        if (i > iC) {
            i = iC;
        }
        if (i2 > iC) {
            i2 = iC;
        }
        yjh yjhVar = (yjh) this.H.F;
        c40 c40VarJ = yjhVar != null ? yjhVar.j(i, i2) : null;
        if (c40VarJ == null) {
            return;
        }
        yjh yjhVar2 = (yjh) this.H.F;
        if (yjhVar2 == null || yjhVar2.a.f == 3 || !yjhVar2.d()) {
            xd6.c1(cv9Var, c40VarJ, this.G, MTTypesetterKt.kLineSkipLimitMultiplier, null, 60);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (ib2Var.g() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (ib2Var.g() & 4294967295L));
        fj0 fj0Var = ib2Var.F;
        long jW = fj0Var.w();
        fj0Var.p().g();
        try {
            ((efe) fj0Var.E).k(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, fIntBitsToFloat, fIntBitsToFloat2, 1);
            xd6.c1(cv9Var, c40VarJ, this.G, MTTypesetterKt.kLineSkipLimitMultiplier, null, 60);
        } finally {
            grc.y(fj0Var, jW);
        }
    }

    public final iqb d() {
        return this.J;
    }

    public final void e(yjh yjhVar) {
        uhf uhfVar;
        yjh yjhVar2 = (yjh) this.H.F;
        if (yjhVar2 != null && !x44.r(yjhVar2.a.a, yjhVar.a.a) && (uhfVar = ((tif) this.F).i) != null) {
            uhfVar.invoke(Long.valueOf(this.E));
        }
        this.H = epk.p(this.H, null, yjhVar, 1);
    }

    @Override // defpackage.mee
    public final void g() {
        xhf xhfVar = new xhf(this, 0);
        xhf xhfVar2 = new xhf(this, 1);
        long j = this.E;
        ztb ztbVar = new ztb(j, xhfVar, xhfVar2);
        tif tifVar = (tif) this.F;
        evb evbVar = tifVar.c;
        if (j == 0) {
            e39.a("The selectable contains an invalid id: " + j);
        }
        if (evbVar.b(j)) {
            e39.a("Another selectable with the id: " + ztbVar + ".selectableId has already subscribed.");
        }
        evbVar.h(j, ztbVar);
        tifVar.b.add(ztbVar);
        tifVar.a = false;
        this.I = ztbVar;
    }
}
