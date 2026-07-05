package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uhf implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ mif F;

    public /* synthetic */ uhf(mif mifVar, int i) {
        this.E = i;
        this.F = mifVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        nhf nhfVar;
        nhf nhfVar2;
        int i = this.E;
        iei ieiVar = iei.a;
        mif mifVar = this.F;
        switch (i) {
            case 0:
                break;
            case 1:
                if (mifVar.a.a().b(((Long) obj).longValue())) {
                    mifVar.n();
                    mifVar.r(null);
                }
                break;
            case 2:
                long jLongValue = ((Long) obj).longValue();
                ohf ohfVarJ = mifVar.j();
                if (ohfVarJ != null && (nhfVar2 = ohfVarJ.a) != null && jLongValue == nhfVar2.c) {
                    mifVar.q.setValue(null);
                }
                ohf ohfVarJ2 = mifVar.j();
                if (ohfVarJ2 != null && (nhfVar = ohfVarJ2.b) != null && jLongValue == nhfVar.c) {
                    mifVar.r.setValue(null);
                }
                if (mifVar.a.a().b(jLongValue)) {
                    mifVar.u();
                }
                break;
            case 3:
                cu9 cu9Var = (cu9) obj;
                l9e l9eVar = (l9e) mifVar.k.getValue();
                if (l9eVar != null) {
                    cu9 cu9Var2 = mifVar.m;
                    if (cu9Var2 == null) {
                        e39.d("Required value was null.");
                        sz6.r();
                    }
                    break;
                }
                break;
            case 4:
                cu9 cu9Var3 = (cu9) obj;
                mifVar.m = cu9Var3;
                if (((Boolean) mifVar.j.getValue()).booleanValue() && mifVar.j() != null) {
                    fcc fccVar = cu9Var3 != null ? new fcc(cu9Var3.b(0L)) : null;
                    if (!x44.r(mifVar.l, fccVar)) {
                        mifVar.l = fccVar;
                        mifVar.s();
                        mifVar.u();
                    }
                }
                break;
            case 5:
                lsc lscVar = mifVar.j;
                ft7 ft7Var = (ft7) obj;
                if (!ft7Var.a() && ((Boolean) lscVar.getValue()).booleanValue()) {
                    mifVar.n();
                }
                lscVar.setValue(Boolean.valueOf(ft7Var.a()));
                break;
            case 6:
                mifVar.q(((Boolean) obj).booleanValue());
                break;
            case 7:
                mifVar.r((ohf) obj);
                break;
            default:
                if (mifVar.a.a().b(((Long) obj).longValue())) {
                    mifVar.n.setValue(ieiVar);
                    mifVar.s();
                    mifVar.u();
                }
                break;
        }
        return ieiVar;
    }
}
