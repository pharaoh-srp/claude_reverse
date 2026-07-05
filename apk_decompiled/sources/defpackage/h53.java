package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class h53 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ t53 G;
    public final /* synthetic */ dae H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h53(t53 t53Var, dae daeVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = t53Var;
        this.H = daeVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        dae daeVar = this.H;
        t53 t53Var = this.G;
        switch (i) {
            case 0:
                h53 h53Var = new h53(t53Var, daeVar, tp4Var, 0);
                h53Var.F = obj;
                return h53Var;
            default:
                h53 h53Var2 = new h53(t53Var, daeVar, tp4Var, 1);
                h53Var2.F = obj;
                return h53Var2;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        im2 im2Var = (im2) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
            case 0:
                ((h53) create(im2Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((h53) create(im2Var, tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h53.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
