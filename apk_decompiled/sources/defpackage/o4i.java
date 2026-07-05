package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o4i extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ p4i F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4i(p4i p4iVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = p4iVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return p4i.d(this.F, null, null, this);
    }
}
