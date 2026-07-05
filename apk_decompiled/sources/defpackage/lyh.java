package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lyh extends vp4 {
    public dlb E;
    public /* synthetic */ Object F;
    public final /* synthetic */ myh G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lyh(myh myhVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = myhVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.f(null, null, null, null, this);
    }
}
