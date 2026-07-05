package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class md3 extends vp4 {
    public String E;
    public String F;
    public z9e G;
    public of0 H;
    public z9e I;
    public /* synthetic */ Object J;
    public final /* synthetic */ vd3 K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md3(vd3 vd3Var, vp4 vp4Var) {
        super(vp4Var);
        this.K = vd3Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.J = obj;
        this.L |= Integer.MIN_VALUE;
        return this.K.o(null, null, this);
    }
}
