package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class e1c extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ f1c F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1c(f1c f1cVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = f1cVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.a(this);
    }
}
