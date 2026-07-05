package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class p1d extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ q1d G;
    public final /* synthetic */ String H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1d(q1d q1dVar, String str, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = q1dVar;
        this.H = str;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        String str = this.H;
        q1d q1dVar = this.G;
        switch (i) {
            case 0:
                p1d p1dVar = new p1d(q1dVar, str, tp4Var, 0);
                p1dVar.F = obj;
                return p1dVar;
            case 1:
                p1d p1dVar2 = new p1d(q1dVar, str, tp4Var, 1);
                p1dVar2.F = obj;
                return p1dVar2;
            case 2:
                p1d p1dVar3 = new p1d(q1dVar, str, tp4Var, 2);
                p1dVar3.F = obj;
                return p1dVar3;
            case 3:
                p1d p1dVar4 = new p1d(q1dVar, str, tp4Var, 3);
                p1dVar4.F = obj;
                return p1dVar4;
            default:
                p1d p1dVar5 = new p1d(q1dVar, str, tp4Var, 4);
                p1dVar5.F = obj;
                return p1dVar5;
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
        return ((p1d) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0151 A[Catch: Exception -> 0x015f, TRY_LEAVE, TryCatch #0 {Exception -> 0x015f, blocks: (B:47:0x0117, B:49:0x0123, B:59:0x0151, B:51:0x0130, B:52:0x0139, B:54:0x013d, B:57:0x0145), top: B:114:0x0117, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01bc A[ORIG_RETURN, RETURN] */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p1d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
