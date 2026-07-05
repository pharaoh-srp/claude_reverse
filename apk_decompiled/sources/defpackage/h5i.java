package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h5i extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ i5i F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5i(i5i i5iVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = i5iVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        this.F.b(null, this);
        return m45.E;
    }
}
