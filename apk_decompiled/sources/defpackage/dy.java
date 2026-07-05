package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dy extends vp4 {
    public Object E;
    public /* synthetic */ Object F;
    public final /* synthetic */ dp G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy(dp dpVar, tp4 tp4Var) {
        super(tp4Var);
        this.G = dpVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.g(null, this);
    }
}
