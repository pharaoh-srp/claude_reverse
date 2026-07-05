package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ltf extends vp4 {
    public String E;
    public String F;
    public /* synthetic */ Object G;
    public final /* synthetic */ jud H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ltf(jud judVar, vp4 vp4Var) {
        super(vp4Var);
        this.H = judVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return jud.b(this.H, null, this);
    }
}
