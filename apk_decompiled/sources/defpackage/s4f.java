package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class s4f extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ t4f F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4f(t4f t4fVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = t4fVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.i(null, this);
    }
}
