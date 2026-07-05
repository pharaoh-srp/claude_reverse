package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bo1 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ co1 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo1(co1 co1Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = co1Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return co1.a(this.F, null, null, this);
    }
}
