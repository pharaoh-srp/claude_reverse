package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class r05 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ s05 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r05(s05 s05Var, tp4 tp4Var) {
        super(tp4Var);
        this.F = s05Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.i(null, null, null, this);
    }
}
