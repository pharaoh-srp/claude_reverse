package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z43 extends vp4 {
    public /* synthetic */ Object E;
    public int F;
    public final /* synthetic */ aj0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z43(aj0 aj0Var, tp4 tp4Var) {
        super(tp4Var);
        this.G = aj0Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.F |= Integer.MIN_VALUE;
        return this.G.a(null, this);
    }
}
