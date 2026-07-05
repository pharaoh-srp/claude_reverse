package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r0a extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ ba0 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0a(ba0 ba0Var, tp4 tp4Var) {
        super(tp4Var);
        this.F = ba0Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.a(0, this);
    }
}
