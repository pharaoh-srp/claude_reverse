package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lz2 extends vp4 {
    public mtc E;
    public hj2 F;
    public hj2 G;
    public boolean H;
    public /* synthetic */ Object I;
    public final /* synthetic */ nz2 J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz2(nz2 nz2Var, vp4 vp4Var) {
        super(vp4Var);
        this.J = nz2Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.K |= Integer.MIN_VALUE;
        return this.J.g(null, false, null, null, this);
    }
}
