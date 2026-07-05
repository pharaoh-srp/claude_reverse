package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zi1 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ ej1 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi1(ej1 ej1Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = ej1Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return ej1.a(this.F, this);
    }
}
