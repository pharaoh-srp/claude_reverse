package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class vl1 extends vp4 {
    public /* synthetic */ Object E;
    public int F;
    public final /* synthetic */ xl1 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl1(xl1 xl1Var, tp4 tp4Var) {
        super(tp4Var);
        this.G = xl1Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.F |= Integer.MIN_VALUE;
        return this.G.a(null, this);
    }
}
