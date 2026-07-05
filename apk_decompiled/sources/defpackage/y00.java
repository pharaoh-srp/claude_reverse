package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y00 extends vp4 {
    public sy1 E;
    public /* synthetic */ Object F;
    public final /* synthetic */ a10 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y00(a10 a10Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = a10Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.a(this);
    }
}
