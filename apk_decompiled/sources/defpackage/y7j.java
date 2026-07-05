package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class y7j extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ z7j F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7j(z7j z7jVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = z7jVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        this.F.a(null, this);
        return m45.E;
    }
}
