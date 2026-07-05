package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qc6 extends vp4 {
    public bc6 E;
    public ad6 F;
    public /* synthetic */ Object G;
    public final /* synthetic */ tc6 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc6(tc6 tc6Var, vp4 vp4Var) {
        super(vp4Var);
        this.H = tc6Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return tc6.t1(this.H, null, this);
    }
}
