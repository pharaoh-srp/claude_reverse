package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class q4f extends vp4 {
    public String E;
    public /* synthetic */ Object F;
    public final /* synthetic */ t4f G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4f(t4f t4fVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = t4fVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return t4f.f(this.G, null, this);
    }
}
