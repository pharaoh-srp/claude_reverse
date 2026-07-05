package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xn8 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ yn8 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn8(yn8 yn8Var, tp4 tp4Var) {
        super(tp4Var);
        this.F = yn8Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.A(null, this);
    }
}
