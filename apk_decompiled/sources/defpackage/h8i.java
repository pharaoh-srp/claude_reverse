package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class h8i extends vp4 {
    public Object E;
    public Object F;
    public jxb G;
    public boolean H;
    public boolean I;
    public /* synthetic */ Object J;
    public final /* synthetic */ j8i K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8i(j8i j8iVar, vp4 vp4Var) {
        super(vp4Var);
        this.K = j8iVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.J = obj;
        this.L |= Integer.MIN_VALUE;
        return this.K.k(this);
    }
}
