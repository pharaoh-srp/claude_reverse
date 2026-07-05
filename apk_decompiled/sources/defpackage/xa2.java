package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xa2 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ y01 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa2(y01 y01Var, tp4 tp4Var) {
        super(tp4Var);
        this.F = y01Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.g(null, this);
    }
}
