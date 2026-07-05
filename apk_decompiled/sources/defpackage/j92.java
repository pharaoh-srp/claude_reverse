package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j92 extends vp4 {
    public aid E;
    public /* synthetic */ Object F;
    public final /* synthetic */ k92 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j92(k92 k92Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = k92Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.g(null, this);
    }
}
