package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yog extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ bpg F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yog(bpg bpgVar, tp4 tp4Var) {
        super(tp4Var);
        this.F = bpgVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.f(null, this);
    }
}
