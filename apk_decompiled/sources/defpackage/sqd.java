package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sqd extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ wqd F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sqd(wqd wqdVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = wqdVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.v(null, null, this);
    }
}
