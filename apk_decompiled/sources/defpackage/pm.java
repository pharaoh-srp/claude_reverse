package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pm implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ vm F;

    public /* synthetic */ pm(vm vmVar, int i) {
        this.E = i;
        this.F = vmVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        vm vmVar = this.F;
        switch (i) {
            case 0:
                vmVar.J.setValue((String) obj);
                break;
            default:
                ek6 ek6Var = (ek6) obj;
                ek6Var.getClass();
                int iOrdinal = ek6Var.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        vmVar.q(false);
                    } else if (iOrdinal != 2) {
                        wg6.i();
                    } else {
                        vmVar.q(false);
                        vmVar.p(xk.E);
                    }
                }
                break;
        }
        return ieiVar;
    }
}
