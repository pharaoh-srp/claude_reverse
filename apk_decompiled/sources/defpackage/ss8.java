package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ss8 extends vp4 {
    public ts8 E;
    public j4e F;
    public Object G;
    public /* synthetic */ Object H;
    public final /* synthetic */ ts8 I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss8(ts8 ts8Var, vp4 vp4Var) {
        super(vp4Var);
        this.I = ts8Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return this.I.a(this);
    }
}
