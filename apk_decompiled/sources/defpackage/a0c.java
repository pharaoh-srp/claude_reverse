package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class a0c extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ b0c F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0c(b0c b0cVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = b0cVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.b(0L, this);
    }
}
