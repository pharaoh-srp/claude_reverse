package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ti5 extends vp4 {
    public String E;
    public String F;
    public String G;
    public dae H;
    public int I;
    public /* synthetic */ Object J;
    public final /* synthetic */ bj5 K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti5(bj5 bj5Var, vp4 vp4Var) {
        super(vp4Var);
        this.K = bj5Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.J = obj;
        this.L |= Integer.MIN_VALUE;
        return this.K.k(null, null, null, null, this);
    }
}
