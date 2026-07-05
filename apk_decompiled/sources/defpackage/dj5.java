package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dj5 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ jj5 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj5(jj5 jj5Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = jj5Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.d(null, this);
    }
}
