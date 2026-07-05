package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qvc extends vp4 {
    public bz7 E;
    public /* synthetic */ Object F;
    public final /* synthetic */ a70 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qvc(a70 a70Var, tp4 tp4Var) {
        super(tp4Var);
        this.G = a70Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.b0(this, null);
    }
}
