package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wm8 extends vp4 {
    public jxb E;
    public /* synthetic */ Object F;
    public final /* synthetic */ xm8 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm8(xm8 xm8Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = xm8Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.b(this);
    }
}
