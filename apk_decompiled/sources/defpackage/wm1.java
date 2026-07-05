package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wm1 extends vp4 {
    public dhg E;
    public /* synthetic */ Object F;
    public final /* synthetic */ xm1 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm1(xm1 xm1Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = xm1Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.c(null, this);
    }
}
