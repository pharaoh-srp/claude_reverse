package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gi7 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ ii7 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi7(ii7 ii7Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = ii7Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return ii7.a(this.F, this);
    }
}
