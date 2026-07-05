package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hs5 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ is5 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs5(is5 is5Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = is5Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.b(this);
    }
}
