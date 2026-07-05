package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nm extends vp4 {
    public String E;
    public vm F;
    public /* synthetic */ Object G;
    public final /* synthetic */ vm H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm(vm vmVar, vp4 vp4Var) {
        super(vp4Var);
        this.H = vmVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.n(null, this);
    }
}
