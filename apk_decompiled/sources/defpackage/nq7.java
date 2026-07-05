package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nq7 extends vp4 {
    public /* synthetic */ Object E;
    public int F;
    public final /* synthetic */ gq7 G;
    public pq7 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq7(gq7 gq7Var, tp4 tp4Var) {
        super(tp4Var);
        this.G = gq7Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.F |= Integer.MIN_VALUE;
        return this.G.a(null, this);
    }
}
