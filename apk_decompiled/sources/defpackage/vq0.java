package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class vq0 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ xq0 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq0(xq0 xq0Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = xq0Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.P(null, this);
    }
}
