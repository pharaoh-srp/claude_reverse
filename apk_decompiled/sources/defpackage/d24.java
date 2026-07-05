package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class d24 extends vp4 {
    public /* synthetic */ Object E;
    public int F;
    public final /* synthetic */ vn G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d24(vn vnVar, tp4 tp4Var) {
        super(tp4Var);
        this.G = vnVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.F |= Integer.MIN_VALUE;
        return this.G.g(null, this);
    }
}
