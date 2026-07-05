package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qq7 extends vp4 {
    public /* synthetic */ Object E;
    public int F;
    public final /* synthetic */ um G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq7(um umVar, tp4 tp4Var) {
        super(tp4Var);
        this.G = umVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.F |= Integer.MIN_VALUE;
        return this.G.g(null, this);
    }
}
