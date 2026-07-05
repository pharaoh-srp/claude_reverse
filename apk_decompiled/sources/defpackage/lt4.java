package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lt4 extends vp4 {
    public long E;
    public /* synthetic */ Object F;
    public final /* synthetic */ vn G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt4(vn vnVar, tp4 tp4Var) {
        super(tp4Var);
        this.G = vnVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.a(0L, this);
    }
}
