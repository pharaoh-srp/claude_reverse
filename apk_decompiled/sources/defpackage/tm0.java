package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tm0 extends vp4 {
    public wm0 E;
    public /* synthetic */ Object F;
    public final /* synthetic */ wm0 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm0(wm0 wm0Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = wm0Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return wm0.c(this.G, null, null, this);
    }
}
