package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zk3 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ ive F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk3(ive iveVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = iveVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        this.F.y(this);
        return m45.E;
    }
}
