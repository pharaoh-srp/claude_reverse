package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kpg extends vp4 {
    public /* synthetic */ Object E;
    public int F;
    public final /* synthetic */ lpg G;
    public Object H;
    public Object I;
    public fpg J;
    public boolean K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kpg(lpg lpgVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = lpgVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.F |= Integer.MIN_VALUE;
        return this.G.f(null, null, false, null, null, this);
    }
}
