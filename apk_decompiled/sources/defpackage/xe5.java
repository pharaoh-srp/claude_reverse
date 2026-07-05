package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xe5 extends xzg implements pz7 {
    public int E;
    public final /* synthetic */ c45 F;
    public final /* synthetic */ cve G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ bz7 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe5(c45 c45Var, cve cveVar, boolean z, boolean z2, bz7 bz7Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = c45Var;
        this.G = cveVar;
        this.H = z;
        this.I = z2;
        this.J = bz7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new xe5(this.F, this.G, this.H, this.I, this.J, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((xe5) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.E;
        if (i != 0) {
            if (i == 1) {
                sf5.h0(obj);
                return obj;
            }
            sz6.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sf5.h0(obj);
        we5 we5Var = new we5(this.G, this.H, this.I, this.J, (tp4) null);
        this.E = 1;
        Object objC0 = gb9.c0(this.F, we5Var, this);
        m45 m45Var = m45.E;
        return objC0 == m45Var ? m45Var : objC0;
    }
}
