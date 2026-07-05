package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tl7 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ ul7 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl7(ul7 ul7Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = ul7Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        Object objC = this.F.c(this);
        return objC == m45.E ? objC : new jre(objC);
    }
}
