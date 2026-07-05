package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nbb extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ obb F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbb(obb obbVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = obbVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.b(this);
    }
}
