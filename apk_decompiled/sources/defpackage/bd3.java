package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bd3 extends vp4 {
    public String E;
    public of0 F;
    public /* synthetic */ Object G;
    public final /* synthetic */ vd3 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd3(vd3 vd3Var, vp4 vp4Var) {
        super(vp4Var);
        this.H = vd3Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.c(null, this);
    }
}
