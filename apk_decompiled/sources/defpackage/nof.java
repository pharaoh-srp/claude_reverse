package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nof extends vp4 {
    public tdg E;
    public /* synthetic */ Object F;
    public final /* synthetic */ oof G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nof(oof oofVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = oofVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.b(this);
    }
}
