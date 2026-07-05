package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class f0e extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ h0e F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0e(h0e h0eVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = h0eVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.b(null, 0, null, null, this);
    }
}
