package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d78 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ g78 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d78(g78 g78Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = g78Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.b(this);
    }
}
