package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xm0 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ ym0 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm0(ym0 ym0Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = ym0Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        this.F.a(null, this);
        return m45.E;
    }
}
