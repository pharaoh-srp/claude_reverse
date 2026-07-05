package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jaf extends vp4 {
    public maf E;
    public iaf F;
    public haf G;
    public zy7 H;
    public float I;
    public /* synthetic */ Object J;
    public final /* synthetic */ maf K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jaf(maf mafVar, vp4 vp4Var) {
        super(vp4Var);
        this.K = mafVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.J = obj;
        this.L |= Integer.MIN_VALUE;
        return maf.a(this.K, this);
    }
}
