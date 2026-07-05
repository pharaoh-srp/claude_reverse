package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yff extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ zff F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yff(zff zffVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = zffVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.f(this);
    }
}
