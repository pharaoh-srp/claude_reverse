package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ar1 extends vp4 {
    public ns5 E;
    public /* synthetic */ Object F;
    public final /* synthetic */ br1 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar1(br1 br1Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = br1Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.a(null, this);
    }
}
