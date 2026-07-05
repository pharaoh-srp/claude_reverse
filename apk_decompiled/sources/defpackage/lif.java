package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lif implements zeh {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public lif(zhh zhhVar, boolean z) {
        this.c = zhhVar;
        this.b = z;
    }

    private final void f() {
    }

    private final void g(long j, phf phfVar) {
    }

    @Override // defpackage.zeh
    public final void a(long j, phf phfVar) {
        switch (this.a) {
            case 0:
                mif mifVar = (mif) this.c;
                if (mifVar.i() != null) {
                    ohf ohfVarJ = mifVar.j();
                    ohfVarJ.getClass();
                    boolean z = this.b;
                    Object objE = mifVar.a.c.e((z ? ohfVarJ.a : ohfVarJ.b).c);
                    if (objE == null) {
                        e39.d("SelectionRegistrar should contain the current selection's selectableIds");
                        sz6.r();
                        break;
                    } else {
                        ztb ztbVar = (ztb) objE;
                        cu9 cu9VarE = ztbVar.e();
                        if (cu9VarE == null) {
                            e39.d("Current selectable should have layout coordinates.");
                            sz6.r();
                            break;
                        } else {
                            long jB = ztbVar.b(ohfVarJ, z);
                            if ((9223372034707292159L & jB) != 9205357640488583168L) {
                                grc.x(mifVar.o().G(cu9VarE, hif.a(jB)), mifVar.o);
                                grc.x(0L, mifVar.p);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    @Override // defpackage.zeh
    public final void b() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                mif mifVar = (mif) obj;
                mifVar.y = true;
                mifVar.u();
                mifVar.s.setValue(null);
                mifVar.t.setValue(null);
                break;
            default:
                zhh zhhVar = (zhh) obj;
                zhhVar.s.setValue(null);
                zhhVar.t.setValue(null);
                zhhVar.A(true);
                break;
        }
    }

    @Override // defpackage.zeh
    public final void c() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                mif mifVar = (mif) obj;
                mifVar.y = true;
                mifVar.u();
                mifVar.s.setValue(null);
                mifVar.t.setValue(null);
                break;
            default:
                zhh zhhVar = (zhh) obj;
                zhhVar.s.setValue(null);
                zhhVar.t.setValue(null);
                zhhVar.A(true);
                break;
        }
    }

    @Override // defpackage.zeh
    public final void d() {
        ohf ohfVarJ;
        cu9 cu9VarE;
        zjh zjhVarD;
        int i = this.a;
        te8 te8Var = te8.G;
        te8 te8Var2 = te8.F;
        boolean z = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                mif mifVar = (mif) obj;
                if ((z ? (fcc) mifVar.q.getValue() : (fcc) mifVar.r.getValue()) != null && (ohfVarJ = mifVar.j()) != null) {
                    ztb ztbVarC = mifVar.c(z ? ohfVarJ.a : ohfVarJ.b);
                    if (ztbVarC != null && (cu9VarE = ztbVarC.e()) != null) {
                        long jB = ztbVarC.b(ohfVarJ, z);
                        if ((9223372034707292159L & jB) != 9205357640488583168L) {
                            mifVar.t.setValue(new fcc(mifVar.o().G(cu9VarE, hif.a(jB))));
                            if (z) {
                                te8Var = te8Var2;
                            }
                            mifVar.s.setValue(te8Var);
                            mifVar.y = false;
                            mifVar.u();
                            break;
                        }
                    }
                }
                break;
            default:
                zhh zhhVar = (zhh) obj;
                if (z) {
                    te8Var = te8Var2;
                }
                zhhVar.s.setValue(te8Var);
                long jA = hif.a(zhhVar.r(z));
                m2a m2aVar = zhhVar.d;
                if (m2aVar != null && (zjhVarD = m2aVar.d()) != null) {
                    long jE = zjhVarD.e(jA);
                    zhhVar.p = jE;
                    zhhVar.t.setValue(new fcc(jE));
                    zhhVar.r = 0L;
                    zhhVar.u = -1;
                    m2a m2aVar2 = zhhVar.d;
                    if (m2aVar2 != null) {
                        m2aVar2.q.setValue(Boolean.TRUE);
                    }
                    zhhVar.A(false);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.zeh
    public final void e(long j) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                mif mifVar = (mif) obj;
                lsc lscVar = mifVar.o;
                lsc lscVar2 = mifVar.p;
                if (mifVar.i() != null) {
                    lscVar2.setValue(new fcc(fcc.i(((fcc) lscVar2.getValue()).a, j)));
                    long jI = fcc.i(((fcc) lscVar.getValue()).a, ((fcc) lscVar2.getValue()).a);
                    if (mifVar.t(jI, ((fcc) mifVar.o.getValue()).a, this.b, unb.Q)) {
                        lscVar.setValue(new fcc(jI));
                        lscVar2.setValue(new fcc(0L));
                    }
                    break;
                }
                break;
            default:
                zhh zhhVar = (zhh) obj;
                long jI2 = fcc.i(zhhVar.r, j);
                zhhVar.r = jI2;
                zhhVar.t.setValue(new fcc(fcc.i(zhhVar.p, jI2)));
                cjh cjhVarT = zhhVar.t();
                fcc fccVarO = zhhVar.o();
                fccVarO.getClass();
                zhh.c(zhhVar, cjhVarT, fccVarO.a, false, this.b, unb.Q, true, new hf8(9));
                zhhVar.A(false);
                break;
        }
    }

    @Override // defpackage.zeh
    public final void onCancel() {
        switch (this.a) {
            case 0:
                mif mifVar = (mif) this.c;
                mifVar.y = true;
                mifVar.u();
                mifVar.s.setValue(null);
                mifVar.t.setValue(null);
                break;
        }
    }

    public lif(boolean z, mif mifVar) {
        this.b = z;
        this.c = mifVar;
    }
}
