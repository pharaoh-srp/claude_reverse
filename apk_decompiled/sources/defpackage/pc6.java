package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pc6 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ tc6 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc6(tc6 tc6Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = tc6Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return tc6.s1(this.F, this);
    }
}
