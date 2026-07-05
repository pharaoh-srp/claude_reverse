package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kdd extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ mdd F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kdd(mdd mddVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = mddVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.E(this);
    }
}
