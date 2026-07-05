package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zjb extends vp4 {
    public bkb E;
    public /* synthetic */ Object F;
    public final /* synthetic */ akb G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjb(akb akbVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = akbVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.i(null, null, this);
    }
}
