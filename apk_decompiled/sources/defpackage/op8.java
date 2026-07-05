package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class op8 extends vp4 {
    public lp8 E;
    public /* synthetic */ Object F;
    public final /* synthetic */ rp8 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op8(rp8 rp8Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = rp8Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return rp8.p1(this.G, this);
    }
}
