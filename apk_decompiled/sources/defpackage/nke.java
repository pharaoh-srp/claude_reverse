package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nke extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ oke F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nke(oke okeVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = okeVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.c(this);
    }
}
