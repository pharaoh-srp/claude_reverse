package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rg1 extends gre implements pz7 {
    public amg F;
    public u7d G;
    public long H;
    public int I;
    public /* synthetic */ Object J;
    public final /* synthetic */ l45 K;
    public final /* synthetic */ l2i L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg1(l45 l45Var, l2i l2iVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.K = l45Var;
        this.L = l2iVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        rg1 rg1Var = new rg1(this.K, this.L, tp4Var);
        rg1Var.J = obj;
        return rg1Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((rg1) create((d0h) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #1 {all -> 0x0019, blocks: (B:8:0x0014, B:41:0x00c1, B:43:0x00c5), top: B:50:0x0014 }] */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rg1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
