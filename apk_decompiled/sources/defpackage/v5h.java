package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class v5h extends vp4 {
    public /* synthetic */ Object E;
    public int F;
    public final /* synthetic */ dp G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5h(dp dpVar, tp4 tp4Var) {
        super(tp4Var);
        this.G = dpVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.F |= Integer.MIN_VALUE;
        return this.G.g(null, this);
    }
}
