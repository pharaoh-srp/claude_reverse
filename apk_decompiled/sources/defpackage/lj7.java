package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lj7 extends vp4 {
    public ij7 E;
    public boolean F;
    public /* synthetic */ Object G;
    public final /* synthetic */ nj7 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj7(nj7 nj7Var, vp4 vp4Var) {
        super(vp4Var);
        this.H = nj7Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.a(null, this);
    }
}
