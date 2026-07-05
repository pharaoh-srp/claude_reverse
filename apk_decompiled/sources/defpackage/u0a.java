package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class u0a extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ x0a F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0a(x0a x0aVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = x0aVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.f(0, 0, this);
    }
}
