package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ph5 extends vp4 {
    public boolean E;
    public ulg F;
    public /* synthetic */ Object G;
    public final /* synthetic */ bi5 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph5(bi5 bi5Var, tp4 tp4Var) {
        super(tp4Var);
        this.H = bi5Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.g(false, this);
    }
}
