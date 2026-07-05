package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lb5 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ nb5 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb5(nb5 nb5Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = nb5Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return nb5.b(this.F, this);
    }
}
