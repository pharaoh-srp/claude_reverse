package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bp extends vp4 {
    public z9e E;
    public cae F;
    public /* synthetic */ Object G;
    public final /* synthetic */ ep H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp(ep epVar, vp4 vp4Var) {
        super(vp4Var);
        this.H = epVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return ep.O(this.H, this);
    }
}
