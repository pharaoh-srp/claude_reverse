package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class we5 extends xzg implements pz7 {
    public final /* synthetic */ int E = 0;
    public int F;
    public final /* synthetic */ cve G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ bz7 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we5(tp4 tp4Var, cve cveVar, boolean z, boolean z2, bz7 bz7Var) {
        super(2, tp4Var);
        this.G = cveVar;
        this.H = z;
        this.I = z2;
        this.J = bz7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new we5(this.G, this.H, this.I, this.J, tp4Var);
            default:
                return new we5(tp4Var, this.G, this.H, this.I, this.J);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((we5) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    cve cveVar = this.G;
                    boolean z = !(cveVar.k() && cveVar.l()) && this.H;
                    boolean z2 = this.I;
                    cve cveVar2 = this.G;
                    ve5 ve5Var = new ve5(z, z2, cveVar2, null, this.J, 0);
                    this.F = 1;
                    Object objQ = cveVar2.q(z2, ve5Var, this);
                    if (objQ == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    bz7 bz7Var = this.J;
                    boolean z3 = this.I;
                    boolean z4 = this.H;
                    cve cveVar3 = this.G;
                    ve5 ve5Var2 = new ve5(z3, z4, cveVar3, null, bz7Var, 1);
                    this.F = 1;
                    Object objQ2 = cveVar3.q(z4, ve5Var2, this);
                    if (objQ2 == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we5(cve cveVar, boolean z, boolean z2, bz7 bz7Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = cveVar;
        this.H = z;
        this.I = z2;
        this.J = bz7Var;
    }
}
