package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ax1 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ bx1 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax1(bx1 bx1Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = bx1Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.d(this);
    }
}
