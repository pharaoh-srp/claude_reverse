package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class u5h extends vp4 {
    public /* synthetic */ Object E;
    public int F;
    public final /* synthetic */ w5h G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5h(w5h w5hVar, tp4 tp4Var) {
        super(tp4Var);
        this.G = w5hVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.F |= Integer.MIN_VALUE;
        return this.G.a(null, this);
    }
}
