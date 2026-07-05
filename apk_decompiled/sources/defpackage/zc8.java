package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zc8 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ ad8 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc8(ad8 ad8Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = ad8Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.u(this);
    }
}
