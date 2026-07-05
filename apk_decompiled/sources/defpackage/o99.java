package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o99 extends gre implements pz7 {
    public final /* synthetic */ int F = 1;
    public int G;
    public /* synthetic */ Object H;
    public final /* synthetic */ l45 I;
    public Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ qz7 L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o99(l45 l45Var, mdd mddVar, bz7 bz7Var, bz7 bz7Var2, rz7 rz7Var, bz7 bz7Var3, tp4 tp4Var) {
        super(2, tp4Var);
        this.I = l45Var;
        this.J = mddVar;
        this.K = bz7Var;
        this.L = bz7Var2;
        this.M = rz7Var;
        this.N = bz7Var3;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.F;
        Object obj2 = this.N;
        Object obj3 = this.M;
        qz7 qz7Var = this.L;
        Object obj4 = this.K;
        switch (i) {
            case 0:
                o99 o99Var = new o99(this.I, (z9e) obj4, (zy7) qz7Var, (a80) obj3, (a80) obj2, tp4Var);
                o99Var.H = obj;
                return o99Var;
            default:
                o99 o99Var2 = new o99(this.I, (mdd) this.J, (bz7) obj4, (bz7) qz7Var, (rz7) obj3, (bz7) obj2, tp4Var);
                o99Var2.H = obj;
                return o99Var2;
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
        return ((o99) create(d0hVar, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d8  */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o99.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o99(l45 l45Var, z9e z9eVar, zy7 zy7Var, a80 a80Var, a80 a80Var2, tp4 tp4Var) {
        super(2, tp4Var);
        this.I = l45Var;
        this.K = z9eVar;
        this.L = zy7Var;
        this.M = a80Var;
        this.N = a80Var2;
    }
}
