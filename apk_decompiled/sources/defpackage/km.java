package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class km extends vp4 {
    public String E;
    public String F;
    public lwc G;
    public boolean H;
    public boolean I;
    public int J;
    public /* synthetic */ Object K;
    public final /* synthetic */ vm L;
    public int M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km(vm vmVar, vp4 vp4Var) {
        super(vp4Var);
        this.L = vmVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.K = obj;
        this.M |= Integer.MIN_VALUE;
        return this.L.l(null, false, false, this);
    }
}
