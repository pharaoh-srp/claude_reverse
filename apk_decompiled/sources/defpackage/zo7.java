package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zo7 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ ap7 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo7(ap7 ap7Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = ap7Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.b(this);
    }
}
