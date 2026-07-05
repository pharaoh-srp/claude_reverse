package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xhh implements zeh {
    public kkh b;
    public final /* synthetic */ zhh d;
    public boolean a = true;
    public phf c = unb.M;

    public xhh(zhh zhhVar) {
        this.d = zhhVar;
    }

    @Override // defpackage.zeh
    public final void a(long j, phf phfVar) {
        long j2;
        zjh zjhVarD;
        zjh zjhVarD2;
        zhh zhhVar = this.d;
        lsc lscVar = zhhVar.s;
        if (zhhVar.q() && ((te8) lscVar.getValue()) == null) {
            lscVar.setValue(te8.G);
            zhhVar.u = -1;
            this.a = true;
            this.c = phfVar;
            zhhVar.u();
            m2a m2aVar = zhhVar.d;
            if (m2aVar == null || (zjhVarD2 = m2aVar.d()) == null || !zjhVarD2.c(j)) {
                j2 = j;
                m2a m2aVar2 = zhhVar.d;
                if (m2aVar2 != null && (zjhVarD = m2aVar2.d()) != null) {
                    int iL = zhhVar.b.l(zjhVarD.b(j2, true));
                    cjh cjhVarJ = zhh.j(zhhVar.t().a, mwa.m(iL, iL));
                    zhhVar.m(false);
                    gf8 gf8Var = zhhVar.l;
                    if (gf8Var != null) {
                        gf8Var.a(0);
                    }
                    zhhVar.c.invoke(cjhVarJ);
                    zhhVar.x = new kkh(cjhVarJ.b);
                }
                this.a = false;
            } else {
                if (zhhVar.t().a.F.length() == 0) {
                    return;
                }
                zhhVar.m(false);
                long jC = zhh.c(zhhVar, cjh.a(zhhVar.t(), null, kkh.b, 5), j, true, false, this.c, true, hf8.a(0));
                j2 = j;
                zhhVar.q = new kkh(jC);
                this.b = new kkh(jC);
            }
            zhhVar.x(we8.E);
            zhhVar.p = j2;
            zhhVar.t.setValue(new fcc(j2));
            zhhVar.r = 0L;
        }
    }

    @Override // defpackage.zeh
    public final void b() {
        f();
    }

    @Override // defpackage.zeh
    public final void c() {
    }

    @Override // defpackage.zeh
    public final void d() {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    @Override // defpackage.zeh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r10) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xhh.e(long):void");
    }

    public final void f() {
        zhh zhhVar = this.d;
        zhhVar.s.setValue(null);
        zhhVar.t.setValue(null);
        this.c = unb.M;
        zhhVar.A(true);
        kkh kkhVar = this.b;
        boolean zD = kkh.d(kkhVar != null ? kkhVar.a : zhhVar.t().b);
        zhhVar.x(zD ? we8.G : we8.F);
        m2a m2aVar = zhhVar.d;
        if (m2aVar != null) {
            m2aVar.m.setValue(Boolean.valueOf(!zD && vok.o(zhhVar, true)));
        }
        m2a m2aVar2 = zhhVar.d;
        if (m2aVar2 != null) {
            m2aVar2.n.setValue(Boolean.valueOf(!zD && vok.o(zhhVar, false)));
        }
        m2a m2aVar3 = zhhVar.d;
        if (m2aVar3 != null) {
            m2aVar3.o.setValue(Boolean.valueOf(zD && vok.o(zhhVar, true)));
        }
        if (this.a) {
            zhh.b(zhhVar, zhhVar.q);
        }
        zhhVar.q = null;
    }

    @Override // defpackage.zeh
    public final void onCancel() {
        f();
    }
}
