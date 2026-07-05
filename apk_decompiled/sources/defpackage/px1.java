package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class px1 extends vp4 {
    public l9e E;
    public Object[] F;
    public int G;
    public int H;
    public /* synthetic */ Object I;
    public final /* synthetic */ qx1 J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public px1(qx1 qx1Var, vp4 vp4Var) {
        super(vp4Var);
        this.J = qx1Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.K |= Integer.MIN_VALUE;
        return this.J.a(null, this);
    }
}
