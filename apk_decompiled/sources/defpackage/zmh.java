package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zmh extends vp4 {
    public String E;
    public String F;
    public String G;
    public /* synthetic */ Object H;
    public final /* synthetic */ dnh I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zmh(dnh dnhVar, vp4 vp4Var) {
        super(vp4Var);
        this.I = dnhVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return dnh.a(this.I, null, null, null, this);
    }
}
