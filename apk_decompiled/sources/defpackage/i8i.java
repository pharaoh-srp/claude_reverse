package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class i8i extends vp4 {
    public String E;
    public String F;
    public String G;
    public t5e H;
    public int I;
    public long J;
    public /* synthetic */ Object K;
    public final /* synthetic */ j8i L;
    public int M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8i(j8i j8iVar, vp4 vp4Var) {
        super(vp4Var);
        this.L = j8iVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.K = obj;
        this.M |= Integer.MIN_VALUE;
        return this.L.m(this);
    }
}
