package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ni8 extends vp4 {
    public sk8 E;
    public /* synthetic */ Object F;
    public final /* synthetic */ oi8 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni8(oi8 oi8Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = oi8Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.i(null, null, null, null, null, this);
    }
}
