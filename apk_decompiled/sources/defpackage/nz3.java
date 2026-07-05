package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nz3 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ oz3 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz3(oz3 oz3Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = oz3Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.a(this);
    }
}
