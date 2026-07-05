package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eff extends vp4 {
    public Object E;
    public /* synthetic */ Object F;
    public final /* synthetic */ gff G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eff(gff gffVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = gffVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return gff.N0(this.G, this);
    }
}
