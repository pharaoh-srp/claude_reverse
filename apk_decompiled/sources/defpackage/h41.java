package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class h41 extends vp4 {
    public q51 E;
    public /* synthetic */ Object F;
    public final /* synthetic */ p41 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h41(p41 p41Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = p41Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.i(null, null, this);
    }
}
