package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cl8 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ dl8 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl8(dl8 dl8Var, tp4 tp4Var) {
        super(tp4Var);
        this.F = dl8Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return dl8.c(this.F, null, this);
    }
}
