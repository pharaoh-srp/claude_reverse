package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k9d extends vp4 {
    public String E;
    public bz7 F;
    public vh4 G;
    public /* synthetic */ Object H;
    public final /* synthetic */ l9d I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9d(l9d l9dVar, vp4 vp4Var) {
        super(vp4Var);
        this.I = l9dVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return this.I.b(null, null, this);
    }
}
