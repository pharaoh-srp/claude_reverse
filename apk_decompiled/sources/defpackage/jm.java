package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jm extends vp4 {
    public String E;
    public /* synthetic */ Object F;
    public final /* synthetic */ vm G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm(vm vmVar, tp4 tp4Var) {
        super(tp4Var);
        this.G = vmVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return vm.b(this.G, null, this);
    }
}
