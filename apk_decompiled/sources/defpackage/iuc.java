package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class iuc extends vp4 {
    public String E;
    public bz7 F;
    public /* synthetic */ Object G;
    public final /* synthetic */ juc H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iuc(juc jucVar, vp4 vp4Var) {
        super(vp4Var);
        this.H = jucVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.b(null, null, this);
    }
}
