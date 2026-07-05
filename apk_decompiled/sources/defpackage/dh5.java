package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dh5 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ el5 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh5(el5 el5Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = el5Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.v(this);
    }
}
