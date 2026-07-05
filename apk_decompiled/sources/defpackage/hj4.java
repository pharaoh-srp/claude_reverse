package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hj4 extends vp4 {
    public hxb E;
    public cj4 F;
    public /* synthetic */ Object G;
    public final /* synthetic */ ij4 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj4(ij4 ij4Var, vp4 vp4Var) {
        super(vp4Var);
        this.H = ij4Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.c(this);
    }
}
