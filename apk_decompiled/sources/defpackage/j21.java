package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j21 extends vp4 {
    public si7 E;
    public /* synthetic */ Object F;
    public final /* synthetic */ k21 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j21(k21 k21Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = k21Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.b(null, this);
    }
}
