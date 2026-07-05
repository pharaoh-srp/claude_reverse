package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class d34 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ w04 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d34(w04 w04Var, tp4 tp4Var) {
        super(tp4Var);
        this.F = w04Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.a(null, this);
    }
}
