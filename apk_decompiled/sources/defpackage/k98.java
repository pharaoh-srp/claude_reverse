package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class k98 extends vp4 {
    public String E;
    public of0 F;
    public /* synthetic */ Object G;
    public final /* synthetic */ m98 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k98(m98 m98Var, vp4 vp4Var) {
        super(vp4Var);
        this.H = m98Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.h(null, this);
    }
}
