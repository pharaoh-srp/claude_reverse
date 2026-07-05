package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class yzh extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ q0i F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yzh(q0i q0iVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = q0iVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.b(null, this);
    }
}
