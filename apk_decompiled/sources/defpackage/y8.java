package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class y8 extends vp4 {
    public bz7 E;
    public bz7 F;
    public nf0 G;
    public /* synthetic */ Object H;
    public final /* synthetic */ f9 I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(f9 f9Var, tp4 tp4Var) {
        super(tp4Var);
        this.I = f9Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return this.I.c(null, null, this);
    }
}
