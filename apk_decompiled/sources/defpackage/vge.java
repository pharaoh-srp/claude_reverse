package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vge extends vp4 {
    public che E;
    public Object F;
    public bhe G;
    public hxb H;
    public /* synthetic */ Object I;
    public final /* synthetic */ che J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vge(che cheVar, vp4 vp4Var) {
        super(vp4Var);
        this.J = cheVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.K |= Integer.MIN_VALUE;
        return che.b(this.J, null, null, this);
    }
}
