package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class d9h extends vp4 {
    public String E;
    public String F;
    public uh6 G;
    public /* synthetic */ Object H;
    public final /* synthetic */ e9h I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9h(e9h e9hVar, vp4 vp4Var) {
        super(vp4Var);
        this.I = e9hVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return this.I.b(null, null, null, this);
    }
}
