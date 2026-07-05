package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class un extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ vn F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un(vn vnVar, tp4 tp4Var) {
        super(tp4Var);
        this.F = vnVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.b(null, this);
    }
}
