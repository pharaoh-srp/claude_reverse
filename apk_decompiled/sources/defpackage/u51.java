package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class u51 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ x51 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u51(x51 x51Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = x51Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.b(this);
    }
}
