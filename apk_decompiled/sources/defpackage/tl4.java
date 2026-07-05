package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tl4 extends vp4 {
    public dae E;
    public /* synthetic */ Object F;
    public final /* synthetic */ ul4 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl4(ul4 ul4Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = ul4Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.c(this);
    }
}
