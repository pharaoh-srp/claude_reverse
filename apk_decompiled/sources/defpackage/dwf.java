package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dwf extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ jwf F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwf(jwf jwfVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = jwfVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.d(null, this);
    }
}
