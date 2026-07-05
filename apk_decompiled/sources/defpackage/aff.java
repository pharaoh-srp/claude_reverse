package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aff extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ gff F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aff(gff gffVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = gffVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return gff.M0(this.F, this);
    }
}
