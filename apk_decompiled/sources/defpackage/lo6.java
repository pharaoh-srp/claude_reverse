package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lo6 extends vp4 {
    public oo6 E;
    public ns5 F;
    public /* synthetic */ Object G;
    public final /* synthetic */ oo6 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo6(oo6 oo6Var, vp4 vp4Var) {
        super(vp4Var);
        this.H = oo6Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.d(null, this);
    }
}
