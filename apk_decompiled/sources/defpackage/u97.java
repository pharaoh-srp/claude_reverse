package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class u97 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ x97 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u97(x97 x97Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = x97Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.h(this);
    }
}
