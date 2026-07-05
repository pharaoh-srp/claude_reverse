package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class l7i extends vp4 {
    public e9d E;
    public String F;
    public String[] G;
    public int H;
    public int I;
    public /* synthetic */ Object J;
    public final /* synthetic */ o7i K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7i(o7i o7iVar, vp4 vp4Var) {
        super(vp4Var);
        this.K = o7iVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.J = obj;
        this.L |= Integer.MIN_VALUE;
        return o7i.d(this.K, null, 0, this);
    }
}
