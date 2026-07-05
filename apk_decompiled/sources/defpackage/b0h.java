package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class b0h extends vp4 {
    public fkg E;
    public /* synthetic */ Object F;
    public final /* synthetic */ d0h G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0h(d0h d0hVar, vd1 vd1Var) {
        super(vd1Var);
        this.G = d0hVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.d(0L, null, this);
    }
}
