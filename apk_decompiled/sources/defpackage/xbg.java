package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xbg extends vp4 {
    public fcg E;
    public hxb F;
    public /* synthetic */ Object G;
    public final /* synthetic */ ybg H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xbg(ybg ybgVar, tp4 tp4Var) {
        super(tp4Var);
        this.H = ybgVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.a(null, this);
    }
}
