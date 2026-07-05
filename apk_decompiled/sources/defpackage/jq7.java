package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jq7 extends vp4 {
    public /* synthetic */ Object E;
    public int F;
    public final /* synthetic */ kq7 G;
    public Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq7(kq7 kq7Var, tp4 tp4Var) {
        super(tp4Var);
        this.G = kq7Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.F |= Integer.MIN_VALUE;
        return this.G.a(null, this);
    }
}
