package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kc6 extends gre implements pz7 {
    public final /* synthetic */ int F = 0;
    public int G;
    public /* synthetic */ Object H;
    public Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ qz7 K;
    public final /* synthetic */ qz7 L;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc6(fc6 fc6Var, nn nnVar, pz7 pz7Var, zy7 zy7Var, kw0 kw0Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.I = fc6Var;
        this.J = nnVar;
        this.K = pz7Var;
        this.L = zy7Var;
        this.M = kw0Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.F;
        Object obj2 = this.M;
        qz7 qz7Var = this.L;
        qz7 qz7Var2 = this.K;
        Object obj3 = this.J;
        switch (i) {
            case 0:
                kc6 kc6Var = new kc6((fc6) this.I, (nn) obj3, (pz7) qz7Var2, (zy7) qz7Var, (kw0) obj2, tp4Var);
                kc6Var.H = obj;
                return kc6Var;
            default:
                kc6 kc6Var2 = new kc6((l45) obj3, (rz7) qz7Var2, (bz7) qz7Var, (mdd) obj2, tp4Var);
                kc6Var2.H = obj;
                return kc6Var2;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.F;
        iei ieiVar = iei.a;
        d0h d0hVar = (d0h) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((kc6) create(d0hVar, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0091, code lost:
    
        if (r3 == r9) goto L20;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kc6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc6(l45 l45Var, rz7 rz7Var, bz7 bz7Var, mdd mddVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.J = l45Var;
        this.K = rz7Var;
        this.L = bz7Var;
        this.M = mddVar;
    }
}
