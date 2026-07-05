package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uq7 extends vp4 {
    public /* synthetic */ Object E;
    public int F;
    public final /* synthetic */ vq7 G;
    public Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq7(vq7 vq7Var, tp4 tp4Var) {
        super(tp4Var);
        this.G = vq7Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.F |= Integer.MIN_VALUE;
        return this.G.g(null, this);
    }
}
