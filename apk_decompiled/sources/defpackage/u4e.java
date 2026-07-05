package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class u4e extends vp4 {
    public ns5 E;
    public oo6 F;
    public /* synthetic */ Object G;
    public final /* synthetic */ ns5 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4e(ns5 ns5Var, vp4 vp4Var) {
        super(vp4Var);
        this.H = ns5Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.j(null, this);
    }
}
