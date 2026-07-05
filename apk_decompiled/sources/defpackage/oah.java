package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class oah extends vp4 {
    public String E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ uah H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oah(uah uahVar, vp4 vp4Var) {
        super(vp4Var);
        this.H = uahVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.e(null, this);
    }
}
