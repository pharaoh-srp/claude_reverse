package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oq7 extends vp4 {
    public /* synthetic */ Object E;
    public int F;
    public final /* synthetic */ pq7 G;
    public Object H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq7(pq7 pq7Var, tp4 tp4Var) {
        super(tp4Var);
        this.G = pq7Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.F |= Integer.MIN_VALUE;
        return this.G.g(null, this);
    }
}
