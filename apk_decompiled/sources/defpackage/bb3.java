package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bb3 extends vp4 {
    public boolean E;
    public nf0 F;
    public nf0 G;
    public /* synthetic */ Object H;
    public final /* synthetic */ db3 I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb3(db3 db3Var, vp4 vp4Var) {
        super(vp4Var);
        this.I = db3Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return this.I.Q(false, this);
    }
}
