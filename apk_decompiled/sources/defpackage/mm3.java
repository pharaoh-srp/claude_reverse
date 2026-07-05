package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mm3 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ nm3 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mm3(nm3 nm3Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = nm3Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        this.F.a(this);
        return m45.E;
    }
}
