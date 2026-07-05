package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class crf extends vp4 {
    public String E;
    public String F;
    public /* synthetic */ Object G;
    public final /* synthetic */ jrf H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crf(jrf jrfVar, vp4 vp4Var) {
        super(vp4Var);
        this.H = jrfVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return jrf.r(this.H, null, this);
    }
}
