package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cld extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ ild F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cld(ild ildVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = ildVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return ild.O(this.F, this);
    }
}
