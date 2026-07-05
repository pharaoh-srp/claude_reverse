package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lwd extends vp4 {
    public long E;
    public nf0 F;
    public /* synthetic */ Object G;
    public final /* synthetic */ pwd H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lwd(pwd pwdVar, vp4 vp4Var) {
        super(vp4Var);
        this.H = pwdVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return pwd.P(this.H, this);
    }
}
