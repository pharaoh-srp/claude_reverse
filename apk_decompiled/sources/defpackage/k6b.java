package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class k6b extends vp4 {
    public hxb E;
    public /* synthetic */ Object F;
    public final /* synthetic */ m6b G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6b(m6b m6bVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = m6bVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.d(this);
    }
}
