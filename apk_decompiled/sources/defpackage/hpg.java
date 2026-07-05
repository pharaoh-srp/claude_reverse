package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hpg extends vp4 {
    public /* synthetic */ Object E;
    public int F;
    public final /* synthetic */ lpg G;
    public lpg H;
    public Object I;
    public Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hpg(lpg lpgVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = lpgVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.F |= Integer.MIN_VALUE;
        return this.G.b(null, null, this);
    }
}
