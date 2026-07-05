package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gk6 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ ik6 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk6(ik6 ik6Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = ik6Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.b(this);
    }
}
