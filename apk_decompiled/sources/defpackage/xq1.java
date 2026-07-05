package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xq1 extends vp4 {
    public Object E;
    public jkf F;
    public /* synthetic */ Object G;
    public final /* synthetic */ zq1 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xq1(zq1 zq1Var, vp4 vp4Var) {
        super(vp4Var);
        this.H = zq1Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.a(this);
    }
}
