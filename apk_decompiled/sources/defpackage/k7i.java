package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k7i extends vp4 {
    public e9d E;
    public String F;
    public String[] G;
    public int H;
    public int I;
    public int J;
    public /* synthetic */ Object K;
    public final /* synthetic */ o7i L;
    public int M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7i(o7i o7iVar, vp4 vp4Var) {
        super(vp4Var);
        this.L = o7iVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.K = obj;
        this.M |= Integer.MIN_VALUE;
        return o7i.c(this.L, null, 0, this);
    }
}
