package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xv2 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ hw2 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv2(hw2 hw2Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = hw2Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.V(this);
    }
}
