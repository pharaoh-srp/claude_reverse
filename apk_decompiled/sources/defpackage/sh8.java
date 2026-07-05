package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sh8 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ th8 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh8(th8 th8Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = th8Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.g(null, this);
    }
}
