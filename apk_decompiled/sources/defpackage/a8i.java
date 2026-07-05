package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class a8i extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ j8i F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8i(j8i j8iVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = j8iVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.a(null, this);
    }
}
