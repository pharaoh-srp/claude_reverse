package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ju extends vp4 {
    public String E;
    public boolean F;
    public /* synthetic */ Object G;
    public final /* synthetic */ lu H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju(lu luVar, vp4 vp4Var) {
        super(vp4Var);
        this.H = luVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return lu.O(this.H, null, this);
    }
}
