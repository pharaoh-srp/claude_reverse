package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class yhh extends vp4 {
    public zhh E;
    public /* synthetic */ Object F;
    public final /* synthetic */ zhh G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yhh(zhh zhhVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = zhhVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.z(this);
    }
}
