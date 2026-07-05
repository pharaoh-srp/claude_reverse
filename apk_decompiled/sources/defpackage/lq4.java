package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lq4 extends vp4 {
    public xzg E;
    public hxb F;
    public /* synthetic */ Object G;
    public final /* synthetic */ el5 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq4(el5 el5Var, vp4 vp4Var) {
        super(vp4Var);
        this.H = el5Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.K(null, this);
    }
}
