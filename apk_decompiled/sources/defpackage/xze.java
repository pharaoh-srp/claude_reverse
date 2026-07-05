package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xze extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ a0f F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xze(a0f a0fVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = a0fVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        a0f.q(this.F, this);
        return m45.E;
    }
}
