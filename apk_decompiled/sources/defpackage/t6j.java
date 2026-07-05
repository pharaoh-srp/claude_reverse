package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class t6j extends vp4 {
    public si7 E;
    public /* synthetic */ Object F;
    public final /* synthetic */ u6j G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6j(u6j u6jVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = u6jVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.a(null, null, this);
    }
}
