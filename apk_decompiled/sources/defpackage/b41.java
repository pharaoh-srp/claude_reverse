package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class b41 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ p41 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b41(p41 p41Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = p41Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.c(this);
    }
}
