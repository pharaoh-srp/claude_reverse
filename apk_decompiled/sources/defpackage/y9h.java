package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class y9h extends vp4 {
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ aah G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9h(aah aahVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = aahVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return aah.O(this.G, 0, this);
    }
}
