package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class c8i extends vp4 {
    public String E;
    public String F;
    public Throwable G;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public /* synthetic */ Object M;
    public final /* synthetic */ j8i N;
    public int O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8i(j8i j8iVar, vp4 vp4Var) {
        super(vp4Var);
        this.N = j8iVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.M = obj;
        this.O |= Integer.MIN_VALUE;
        return this.N.e(null, null, false, this);
    }
}
