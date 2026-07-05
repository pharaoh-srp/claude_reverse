package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cqd extends vp4 {
    public String E;
    public of0 F;
    public /* synthetic */ Object G;
    public final /* synthetic */ wqd H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqd(wqd wqdVar, vp4 vp4Var) {
        super(vp4Var);
        this.H = wqdVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.g(null, this);
    }
}
