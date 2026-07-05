package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ly8 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ my8 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly8(my8 my8Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = my8Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.a(null, 0, this);
    }
}
