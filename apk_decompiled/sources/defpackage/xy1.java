package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xy1 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ zy1 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy1(zy1 zy1Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = zy1Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        Object objK = zy1.K(this.F, this);
        return objK == m45.E ? objK : new ai2(objK);
    }
}
