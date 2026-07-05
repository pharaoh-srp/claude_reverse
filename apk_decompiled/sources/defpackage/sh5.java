package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sh5 extends vp4 {
    public boolean E;
    public xzg F;
    public /* synthetic */ Object G;
    public final /* synthetic */ bi5 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh5(bi5 bi5Var, vp4 vp4Var) {
        super(vp4Var);
        this.H = bi5Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return bi5.d(this.H, false, null, this);
    }
}
