package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c9d extends vp4 {
    public long E;
    public zy7 F;
    public dae G;
    public /* synthetic */ Object H;
    public final /* synthetic */ d9d I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9d(d9d d9dVar, vp4 vp4Var) {
        super(vp4Var);
        this.I = d9dVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return this.I.b(0L, null, this);
    }
}
