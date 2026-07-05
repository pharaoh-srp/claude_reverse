package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class laf extends vp4 {
    public maf E;
    public /* synthetic */ Object F;
    public final /* synthetic */ maf G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public laf(maf mafVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = mafVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.c(this);
    }
}
