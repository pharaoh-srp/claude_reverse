package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class av2 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ bv2 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av2(bv2 bv2Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = bv2Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        this.F.a(null, null, this);
        return m45.E;
    }
}
