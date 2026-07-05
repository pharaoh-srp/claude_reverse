package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ew2 extends vp4 {
    public /* synthetic */ Object E;
    public int F;
    public final /* synthetic */ gw2 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew2(gw2 gw2Var, tp4 tp4Var) {
        super(tp4Var);
        this.G = gw2Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.F |= Integer.MIN_VALUE;
        return this.G.a(null, this);
    }
}
