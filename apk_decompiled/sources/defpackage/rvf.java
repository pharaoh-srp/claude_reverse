package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rvf extends vp4 {
    public /* synthetic */ Object E;
    public int F;
    public final /* synthetic */ hr7 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rvf(hr7 hr7Var, tp4 tp4Var) {
        super(tp4Var);
        this.G = hr7Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.F |= Integer.MIN_VALUE;
        return this.G.a(null, this);
    }
}
