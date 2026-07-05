package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class n53 extends vp4 {
    public m02 E;
    public boolean F;
    public /* synthetic */ Object G;
    public final /* synthetic */ t53 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n53(t53 t53Var, vp4 vp4Var) {
        super(vp4Var);
        this.H = t53Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return t53.i0(this.H, null, null, false, this);
    }
}
