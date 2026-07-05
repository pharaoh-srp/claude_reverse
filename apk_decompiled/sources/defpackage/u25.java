package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u25 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ m2a F;

    public /* synthetic */ u25(m2a m2aVar, int i) {
        this.E = i;
        this.F = m2aVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        m2a m2aVar = this.F;
        switch (i) {
            case 0:
                cu9 cu9Var = (cu9) obj;
                zjh zjhVarD = m2aVar.d();
                if (zjhVarD != null) {
                    zjhVarD.c = cu9Var;
                }
                return ieiVar;
            case 1:
                lsc lscVar = m2aVar.t;
                cjh cjhVar = (cjh) obj;
                String str = cjhVar.a.F;
                zb0 zb0Var = m2aVar.j;
                if (!x44.r(str, zb0Var != null ? zb0Var.F : null)) {
                    m2aVar.k.setValue(we8.E);
                    if (((Boolean) lscVar.getValue()).booleanValue()) {
                        lscVar.setValue(Boolean.FALSE);
                    } else {
                        m2aVar.s.setValue(Boolean.FALSE);
                    }
                }
                long j = kkh.b;
                m2aVar.f(j);
                m2aVar.e(j);
                m2aVar.u.invoke(cjhVar);
                r7e r7eVar = m2aVar.b;
                le4 le4Var = r7eVar.a;
                if (le4Var != null) {
                    le4Var.s(r7eVar, null);
                }
                return ieiVar;
            case 2:
                m2aVar.r.b(((ty8) obj).a);
                return ieiVar;
            case 3:
                return Boolean.valueOf(m2aVar.r.b(((ty8) obj).a));
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                m2aVar.q.setValue(bool);
                return ieiVar;
        }
    }
}
