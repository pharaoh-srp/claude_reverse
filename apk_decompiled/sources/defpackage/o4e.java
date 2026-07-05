package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o4e extends vp4 {
    public cje E;
    public jx8 F;
    public tqh G;
    public wv8 H;
    public int I;
    public /* synthetic */ Object J;
    public final /* synthetic */ r4e K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4e(r4e r4eVar, vp4 vp4Var) {
        super(vp4Var);
        this.K = r4eVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.J = obj;
        this.L |= Integer.MIN_VALUE;
        return this.K.a(null, 0, this);
    }
}
