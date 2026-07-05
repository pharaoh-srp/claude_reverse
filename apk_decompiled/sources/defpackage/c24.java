package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class c24 extends vp4 {
    public /* synthetic */ Object E;
    public int F;
    public final /* synthetic */ e24 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c24(e24 e24Var, tp4 tp4Var) {
        super(tp4Var);
        this.G = e24Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.F |= Integer.MIN_VALUE;
        return this.G.a(null, this);
    }
}
