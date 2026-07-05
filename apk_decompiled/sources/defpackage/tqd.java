package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tqd extends vp4 {
    public String E;
    public String F;
    public String G;
    public nf0 H;
    public nf0 I;
    public /* synthetic */ Object J;
    public final /* synthetic */ wqd K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tqd(wqd wqdVar, vp4 vp4Var) {
        super(vp4Var);
        this.K = wqdVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.J = obj;
        this.L |= Integer.MIN_VALUE;
        return this.K.w(null, null, this);
    }
}
