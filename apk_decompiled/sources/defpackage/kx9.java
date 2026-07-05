package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kx9 extends vp4 {
    public zwb E;
    public xzg F;
    public /* synthetic */ Object G;
    public final /* synthetic */ lx9 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx9(lx9 lx9Var, tp4 tp4Var) {
        super(tp4Var);
        this.H = lx9Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.c(null, null, this);
    }
}
