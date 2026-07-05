package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b9d extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ d9d F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9d(d9d d9dVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = d9dVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.a(this);
    }
}
