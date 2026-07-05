package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dm2 extends vp4 {
    public n78 E;
    public /* synthetic */ Object F;
    public final /* synthetic */ em2 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm2(em2 em2Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = em2Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return em2.d(this.G, null, this);
    }
}
