package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class j72 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ n78 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j72(n78 n78Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = n78Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.G(this);
    }
}
