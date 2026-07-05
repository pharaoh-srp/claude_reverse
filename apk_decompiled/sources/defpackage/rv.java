package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rv extends vp4 {
    public gnd E;
    public /* synthetic */ Object F;
    public final /* synthetic */ uv G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv(uv uvVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = uvVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return uv.O(this.G, null, this);
    }
}
