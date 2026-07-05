package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bca extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ fca F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bca(fca fcaVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = fcaVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.Q(this);
    }
}
