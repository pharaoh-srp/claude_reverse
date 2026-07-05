package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fr7 extends vp4 {
    public dae E;
    public /* synthetic */ Object F;
    public final /* synthetic */ ba0 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr7(ba0 ba0Var, tp4 tp4Var) {
        super(tp4Var);
        this.G = ba0Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.g(null, this);
    }
}
