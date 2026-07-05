package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tv extends vp4 {
    public String E;
    public gnd F;
    public /* synthetic */ Object G;
    public final /* synthetic */ uv H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv(uv uvVar, vp4 vp4Var) {
        super(vp4Var);
        this.H = uvVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.S(null, null, false, this);
    }
}
