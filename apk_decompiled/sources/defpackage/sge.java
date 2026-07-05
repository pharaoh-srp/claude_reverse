package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sge extends vp4 {
    public che E;
    public haf F;
    public /* synthetic */ Object G;
    public final /* synthetic */ che H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sge(che cheVar, vp4 vp4Var) {
        super(vp4Var);
        this.H = cheVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return che.a(this.H, null, this);
    }
}
