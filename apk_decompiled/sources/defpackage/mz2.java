package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mz2 extends vp4 {
    public poj E;
    public Object F;
    public Object G;
    public boolean H;
    public boolean I;
    public /* synthetic */ Object J;
    public final /* synthetic */ nz2 K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mz2(nz2 nz2Var, vp4 vp4Var) {
        super(vp4Var);
        this.K = nz2Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.J = obj;
        this.L |= Integer.MIN_VALUE;
        return this.K.h(null, false, false, null, null, null, this);
    }
}
