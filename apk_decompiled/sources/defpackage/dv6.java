package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dv6 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ ev6 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv6(ev6 ev6Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = ev6Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.c(null, this);
    }
}
