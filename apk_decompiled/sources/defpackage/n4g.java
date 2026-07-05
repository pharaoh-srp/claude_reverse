package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class n4g extends vp4 {
    public long E;
    public /* synthetic */ Object F;
    public final /* synthetic */ p4g G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4g(p4g p4gVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = p4gVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.G(0L, 0L, this);
    }
}
