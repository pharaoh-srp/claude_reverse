package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ln3 extends xzg implements pz7 {
    public final /* synthetic */ int E = 1;
    public int F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ boolean H;
    public /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln3(boolean z, boolean z2, nxd nxdVar, isc iscVar, nwb nwbVar, nwb nwbVar2, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = z;
        this.H = z2;
        this.I = nxdVar;
        this.J = iscVar;
        this.K = nwbVar;
        this.L = nwbVar2;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.L;
        Object obj3 = this.K;
        Object obj4 = this.J;
        switch (i) {
            case 0:
                return new ln3(this.G, this.H, (nxd) this.I, (isc) obj4, (nwb) obj3, (nwb) obj2, tp4Var);
            default:
                ln3 ln3Var = new ln3((iqf) obj4, (String) obj3, this.G, this.H, (Boolean) obj2, tp4Var);
                ln3Var.I = obj;
                return ln3Var;
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
        return ((ln3) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dd, code lost:
    
        if (defpackage.d4c.K(r2, r14) == r7) goto L45;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ln3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln3(iqf iqfVar, String str, boolean z, boolean z2, Boolean bool, tp4 tp4Var) {
        super(2, tp4Var);
        this.J = iqfVar;
        this.K = str;
        this.G = z;
        this.H = z2;
        this.L = bool;
    }
}
