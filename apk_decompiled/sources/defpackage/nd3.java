package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nd3 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ vd3 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd3(vd3 vd3Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = vd3Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.p(null, null, this);
    }
}
