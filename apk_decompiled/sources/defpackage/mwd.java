package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mwd extends vp4 {
    public nf0 E;
    public long F;
    public /* synthetic */ Object G;
    public final /* synthetic */ pwd H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mwd(pwd pwdVar, vp4 vp4Var) {
        super(vp4Var);
        this.H = pwdVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return pwd.S(this.H, null, this);
    }
}
