package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class d7d extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ e7d F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7d(e7d e7dVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = e7dVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        this.F.a(this);
        return m45.E;
    }
}
