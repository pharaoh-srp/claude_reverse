package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sp7 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ o60 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp7(o60 o60Var, tp4 tp4Var) {
        super(tp4Var);
        this.F = o60Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.g(null, this);
    }
}
