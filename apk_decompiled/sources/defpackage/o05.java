package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o05 extends vp4 {
    public dae E;
    public /* synthetic */ Object F;
    public final /* synthetic */ p05 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o05(p05 p05Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = p05Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        Object objY = this.G.Y(null, null, null, this);
        return objY == m45.E ? objY : new jre(objY);
    }
}
