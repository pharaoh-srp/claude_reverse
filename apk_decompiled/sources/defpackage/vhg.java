package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class vhg extends vp4 {
    public a0f E;
    public lf9 F;
    public /* synthetic */ Object G;
    public final /* synthetic */ whg H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vhg(whg whgVar, vp4 vp4Var) {
        super(vp4Var);
        this.H = whgVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.b(false, this);
    }
}
