package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nj4 extends vp4 {
    public /* synthetic */ Object E;
    public int F;
    public final /* synthetic */ pj4 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj4(pj4 pj4Var, tp4 tp4Var) {
        super(tp4Var);
        this.G = pj4Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.F |= Integer.MIN_VALUE;
        return this.G.a(null, this);
    }
}
