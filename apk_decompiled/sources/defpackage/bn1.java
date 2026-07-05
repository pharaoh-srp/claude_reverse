package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bn1 extends vp4 {
    public Integer E;
    public tn1 F;
    public /* synthetic */ Object G;
    public final /* synthetic */ dn1 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn1(dn1 dn1Var, vp4 vp4Var) {
        super(vp4Var);
        this.H = dn1Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.c(null, this);
    }
}
