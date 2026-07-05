package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ag7 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ bg7 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag7(bg7 bg7Var, tp4 tp4Var) {
        super(tp4Var);
        this.F = bg7Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return bg7.f(this.F, null, this);
    }
}
