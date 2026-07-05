package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class arf extends vp4 {
    public String E;
    public String F;
    public v84 G;
    public /* synthetic */ Object H;
    public final /* synthetic */ jrf I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arf(jrf jrfVar, tp4 tp4Var) {
        super(tp4Var);
        this.I = jrfVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return this.I.w(null, this);
    }
}
