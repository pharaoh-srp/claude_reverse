package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class goi extends vp4 {
    public /* synthetic */ Object E;
    public int F;
    public final /* synthetic */ dw2 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public goi(dw2 dw2Var, tp4 tp4Var) {
        super(tp4Var);
        this.G = dw2Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.F |= Integer.MIN_VALUE;
        return this.G.a(null, this);
    }
}
