package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qc2 extends xzg implements pz7 {
    public final /* synthetic */ int E = 0;
    public int F;
    public final /* synthetic */ a80 G;
    public final /* synthetic */ float H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ v79 J;
    public final /* synthetic */ Object K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc2(a80 a80Var, float f, boolean z, rc2 rc2Var, v79 v79Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = a80Var;
        this.H = f;
        this.I = z;
        this.K = rc2Var;
        this.J = v79Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.K;
        switch (i) {
            case 0:
                v79 v79Var = this.J;
                return new qc2(this.G, this.H, this.I, (rc2) obj2, v79Var, tp4Var);
            default:
                return new qc2(this.G, this.H, this.I, this.J, (nwb) obj2, tp4Var);
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
        return ((qc2) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (r5.g(r12, r13) == r4) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (defpackage.lk6.a(r5, r6, r13, r10, r12) == r4) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return r4;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qc2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc2(a80 a80Var, float f, boolean z, v79 v79Var, nwb nwbVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = a80Var;
        this.H = f;
        this.I = z;
        this.J = v79Var;
        this.K = nwbVar;
    }
}
