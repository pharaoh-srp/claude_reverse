package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j9d extends vp4 {
    public Object E;
    public Throwable F;
    public int G;
    public /* synthetic */ Object H;
    public final /* synthetic */ l9d I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9d(l9d l9dVar, tp4 tp4Var) {
        super(tp4Var);
        this.I = l9dVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return this.I.g(null, null, this);
    }
}
