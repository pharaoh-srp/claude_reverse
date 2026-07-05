package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class yw1 extends vp4 {
    public xw1 E;
    public /* synthetic */ Object F;
    public final /* synthetic */ bx1 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw1(bx1 bx1Var, tp4 tp4Var) {
        super(tp4Var);
        this.G = bx1Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.c(null, this);
    }
}
