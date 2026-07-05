package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class iih extends vp4 {
    public cae E;
    public cae F;
    public /* synthetic */ Object G;
    public final /* synthetic */ sih H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iih(sih sihVar, vp4 vp4Var) {
        super(vp4Var);
        this.H = sihVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return sih.a(this.H, null, this);
    }
}
