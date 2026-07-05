package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mh5 extends vp4 {
    public jxb E;
    public /* synthetic */ Object F;
    public final /* synthetic */ bi5 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh5(bi5 bi5Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = bi5Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return bi5.c(this.G, this);
    }
}
