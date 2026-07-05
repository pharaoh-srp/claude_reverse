package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mih extends vp4 {
    public mi6 E;
    public /* synthetic */ Object F;
    public final /* synthetic */ sih G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mih(sih sihVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = sihVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.y(this);
    }
}
