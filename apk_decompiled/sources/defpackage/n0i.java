package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class n0i extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ l0i F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0i(l0i l0iVar, tp4 tp4Var) {
        super(tp4Var);
        this.F = l0iVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.d(null, false, this);
    }
}
