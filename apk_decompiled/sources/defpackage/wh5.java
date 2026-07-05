package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wh5 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ bi5 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh5(bi5 bi5Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = bi5Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return bi5.e(this.F, this);
    }
}
