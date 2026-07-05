package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class boa extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ coa F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public boa(coa coaVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = coaVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.c(null, this);
    }
}
