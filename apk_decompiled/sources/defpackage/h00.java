package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h00 extends vp4 {
    public yub E;
    public sy1 F;
    public /* synthetic */ Object G;
    public final /* synthetic */ k00 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h00(k00 k00Var, vp4 vp4Var) {
        super(vp4Var);
        this.H = k00Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.g(this);
    }
}
