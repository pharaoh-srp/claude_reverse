package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gs5 extends vp4 {
    public boolean E;
    public /* synthetic */ Object F;
    public final /* synthetic */ is5 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs5(is5 is5Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = is5Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.a(null, false, this);
    }
}
