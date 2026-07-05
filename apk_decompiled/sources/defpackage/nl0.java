package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nl0 extends vp4 {
    public String E;
    public /* synthetic */ Object F;
    public final /* synthetic */ tl0 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nl0(tl0 tl0Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = tl0Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.b(null, this);
    }
}
