package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lq7 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ mq7 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq7(mq7 mq7Var, tp4 tp4Var) {
        super(tp4Var);
        this.F = mq7Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.g(null, this);
    }
}
