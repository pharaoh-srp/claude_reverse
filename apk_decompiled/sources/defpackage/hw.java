package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hw extends vp4 {
    public ybg E;
    public String F;
    public /* synthetic */ Object G;
    public final /* synthetic */ jw H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw(jw jwVar, vp4 vp4Var) {
        super(vp4Var);
        this.H = jwVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.a(null, null, this);
    }
}
