package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hqd extends vp4 {
    public String E;
    public z9e F;
    public /* synthetic */ Object G;
    public final /* synthetic */ wqd H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqd(wqd wqdVar, vp4 vp4Var) {
        super(vp4Var);
        this.H = wqdVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return wqd.b(this.H, null, this);
    }
}
