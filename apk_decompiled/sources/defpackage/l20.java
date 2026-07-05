package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class l20 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ m20 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l20(m20 m20Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = m20Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.a(null, this);
    }
}
