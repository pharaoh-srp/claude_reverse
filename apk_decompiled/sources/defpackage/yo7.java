package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class yo7 extends vp4 {
    public v79 E;
    public /* synthetic */ Object F;
    public final /* synthetic */ ap7 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo7(ap7 ap7Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = ap7Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.a(null, this);
    }
}
