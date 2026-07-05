package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x7g extends vp4 {
    public xzg E;
    public hxb F;
    public int G;
    public /* synthetic */ Object H;
    public final /* synthetic */ z7g I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7g(z7g z7gVar, vp4 vp4Var) {
        super(vp4Var);
        this.I = z7gVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return this.I.b(null, this);
    }
}
