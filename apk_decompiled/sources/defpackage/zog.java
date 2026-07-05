package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zog extends vp4 {
    public bpg E;
    public wmi F;
    public /* synthetic */ Object G;
    public final /* synthetic */ bpg H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zog(bpg bpgVar, tp4 tp4Var) {
        super(tp4Var);
        this.H = bpgVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.g(null, this);
    }
}
