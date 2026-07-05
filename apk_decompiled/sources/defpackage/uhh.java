package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class uhh implements zeh {
    public final /* synthetic */ zhh a;

    public uhh(zhh zhhVar) {
        this.a = zhhVar;
    }

    @Override // defpackage.zeh
    public final void a(long j, phf phfVar) {
        zjh zjhVarD;
        zhh zhhVar = this.a;
        long jA = hif.a(zhhVar.r(true));
        m2a m2aVar = zhhVar.d;
        if (m2aVar == null || (zjhVarD = m2aVar.d()) == null) {
            return;
        }
        long jE = zjhVarD.e(jA);
        zhhVar.p = jE;
        zhhVar.t.setValue(new fcc(jE));
        zhhVar.r = 0L;
        zhhVar.s.setValue(te8.E);
        zhhVar.A(false);
    }

    @Override // defpackage.zeh
    public final void b() {
        zhh zhhVar = this.a;
        zhhVar.s.setValue(null);
        zhhVar.t.setValue(null);
    }

    @Override // defpackage.zeh
    public final void c() {
        zhh zhhVar = this.a;
        zhhVar.s.setValue(null);
        zhhVar.t.setValue(null);
    }

    @Override // defpackage.zeh
    public final void d() {
    }

    @Override // defpackage.zeh
    public final void e(long j) {
        zjh zjhVarD;
        gf8 gf8Var;
        zhh zhhVar = this.a;
        zhhVar.r = fcc.i(zhhVar.r, j);
        m2a m2aVar = zhhVar.d;
        if (m2aVar == null || (zjhVarD = m2aVar.d()) == null) {
            return;
        }
        zhhVar.t.setValue(new fcc(fcc.i(zhhVar.p, zhhVar.r)));
        occ occVar = zhhVar.b;
        fcc fccVarO = zhhVar.o();
        fccVarO.getClass();
        int iL = occVar.l(zjhVarD.b(fccVarO.a, true));
        long jM = mwa.m(iL, iL);
        if (kkh.c(jM, zhhVar.t().b)) {
            return;
        }
        m2a m2aVar2 = zhhVar.d;
        if ((m2aVar2 == null || ((Boolean) m2aVar2.q.getValue()).booleanValue()) && (gf8Var = zhhVar.l) != null) {
            gf8Var.a(9);
        }
        zhhVar.c.invoke(zhh.j(zhhVar.t().a, jM));
        zhhVar.x = new kkh(jM);
    }

    @Override // defpackage.zeh
    public final void onCancel() {
    }
}
