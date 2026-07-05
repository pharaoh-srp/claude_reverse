package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class k5h extends vp4 {
    public String E;
    public /* synthetic */ Object F;
    public final /* synthetic */ l5h G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5h(l5h l5hVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = l5hVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.O(null, null, this);
    }
}
