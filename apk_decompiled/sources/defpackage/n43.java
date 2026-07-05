package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class n43 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ t53 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n43(t53 t53Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = t53Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return t53.b0(this.F, this);
    }
}
