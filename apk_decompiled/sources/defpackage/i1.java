package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i1 extends vp4 {
    public x2f E;
    public /* synthetic */ Object F;
    public final /* synthetic */ b3f G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(b3f b3fVar, tp4 tp4Var) {
        super(tp4Var);
        this.G = b3fVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.a(null, this);
    }
}
