package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sm8 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ um8 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm8(um8 um8Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = um8Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return um8.a(this.F, null, null, this);
    }
}
