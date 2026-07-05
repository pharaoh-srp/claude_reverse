package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q93 extends vp4 {
    public String E;
    public /* synthetic */ Object F;
    public final /* synthetic */ r93 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q93(r93 r93Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = r93Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.l(null, this);
    }
}
