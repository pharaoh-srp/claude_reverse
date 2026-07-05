package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o79 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ q79 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o79(q79 q79Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = q79Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.c(this);
    }
}
