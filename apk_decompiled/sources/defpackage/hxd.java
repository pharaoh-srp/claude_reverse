package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hxd extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ lxd F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hxd(lxd lxdVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = lxdVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return lxd.s1(this.F, this);
    }
}
