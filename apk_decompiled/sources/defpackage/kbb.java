package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kbb extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ lbb G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kbb(lbb lbbVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = lbbVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        lbb lbbVar = this.G;
        switch (i) {
            case 0:
                return new kbb(lbbVar, tp4Var, 0);
            default:
                return new kbb(lbbVar, tp4Var, 1);
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
        return ((kbb) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e1, code lost:
    
        if (r12.b(r11, defpackage.jbb.a) == r4) goto L39;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kbb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
