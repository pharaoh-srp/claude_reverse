package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class b4g extends vp4 {
    public /* synthetic */ Object E;
    public int F;
    public final /* synthetic */ y01 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4g(y01 y01Var, tp4 tp4Var) {
        super(tp4Var);
        this.G = y01Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.F |= Integer.MIN_VALUE;
        return this.G.g(null, this);
    }
}
