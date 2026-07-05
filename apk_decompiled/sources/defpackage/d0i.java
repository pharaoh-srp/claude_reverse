package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d0i extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ q0i G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0i(q0i q0iVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = q0iVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        q0i q0iVar = this.G;
        switch (i) {
            case 0:
                return new d0i(q0iVar, tp4Var, 0);
            case 1:
                return new d0i(q0iVar, tp4Var, 1);
            case 2:
                return new d0i(q0iVar, tp4Var, 2);
            case 3:
                return new d0i(q0iVar, tp4Var, 3);
            case 4:
                return new d0i(q0iVar, tp4Var, 4);
            case 5:
                return new d0i(q0iVar, tp4Var, 5);
            default:
                return new d0i(q0iVar, tp4Var, 6);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((d0i) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a0, code lost:
    
        if (r13 == r4) goto L31;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d0i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
