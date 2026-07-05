package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ia8 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ ja8 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia8(ja8 ja8Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = ja8Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.k(this);
    }
}
