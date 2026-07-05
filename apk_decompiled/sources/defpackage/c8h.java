package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class c8h extends vp4 {
    public String E;
    public /* synthetic */ Object F;
    public final /* synthetic */ e8h G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8h(e8h e8hVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = e8hVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.b(null, this);
    }
}
