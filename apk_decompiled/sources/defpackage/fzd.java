package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fzd extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ kzd F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzd(kzd kzdVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = kzdVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.P(this);
    }
}
