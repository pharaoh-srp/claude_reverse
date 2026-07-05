package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hi1 extends vp4 {
    public s51 E;
    public /* synthetic */ Object F;
    public final /* synthetic */ ki1 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi1(ki1 ki1Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = ki1Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.b(this);
    }
}
