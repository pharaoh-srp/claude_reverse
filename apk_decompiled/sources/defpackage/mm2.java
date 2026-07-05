package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mm2 extends vp4 {
    public String E;
    public /* synthetic */ Object F;
    public final /* synthetic */ nm2 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mm2(nm2 nm2Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = nm2Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return nm2.a(this.G, null, null, null, null, null, 0, null, false, this);
    }
}
