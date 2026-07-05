package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class l70 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ long G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l70(long j, d0h d0hVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 2;
        this.G = j;
        this.H = d0hVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.H;
        switch (i) {
            case 0:
                return new l70((n70) obj2, this.G, tp4Var, 0);
            case 1:
                return new l70((che) obj2, this.G, tp4Var, 1);
            case 2:
                return new l70(this.G, (d0h) obj2, tp4Var);
            case 3:
                return new l70((hhh) obj2, this.G, tp4Var, 3);
            default:
                return new l70((qkj) obj2, this.G, tp4Var, 4);
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
        return ((l70) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
    
        if (defpackage.d4c.K(8, r18) == r8) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0108, code lost:
    
        if (defpackage.a80.c(r0, r2, r3, null, r18, 12) == r8) goto L51;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l70.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l70(Object obj, long j, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = obj;
        this.G = j;
    }
}
