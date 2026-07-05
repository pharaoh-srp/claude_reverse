package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class na0 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ isc F;

    public /* synthetic */ na0(isc iscVar, int i) {
        this.E = i;
        this.F = iscVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        isc iscVar = this.F;
        switch (i) {
            case 0:
                iscVar.i((int) (((g79) obj).a & 4294967295L));
                break;
            case 1:
                cu9 cu9Var = (cu9) obj;
                cu9Var.getClass();
                iscVar.i((int) (cu9Var.k() & 4294967295L));
                break;
            case 2:
                iscVar.i(((Integer) obj).intValue());
                break;
            case 3:
                iscVar.i(((Integer) obj).intValue());
                break;
            default:
                cu9 cu9Var2 = (cu9) obj;
                cu9Var2.getClass();
                iscVar.i((int) (cu9Var2.k() & 4294967295L));
                break;
        }
        return ieiVar;
    }
}
