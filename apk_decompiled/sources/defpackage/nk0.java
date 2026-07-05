package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nk0 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ ok0 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk0(ok0 ok0Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = ok0Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.b(null, this);
    }
}
