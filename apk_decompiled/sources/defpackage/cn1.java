package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cn1 extends vp4 {
    public tn1 E;
    public /* synthetic */ Object F;
    public final /* synthetic */ dn1 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn1(dn1 dn1Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = dn1Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.d(this);
    }
}
