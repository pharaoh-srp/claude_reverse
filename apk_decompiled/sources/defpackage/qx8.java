package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qx8 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ he6 H;
    public final /* synthetic */ np5 I;
    public final /* synthetic */ cz5 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qx8(he6 he6Var, np5 np5Var, cz5 cz5Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = he6Var;
        this.I = np5Var;
        this.J = cz5Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                qx8 qx8Var = new qx8(this.H, this.I, this.J, tp4Var, 0);
                qx8Var.G = obj;
                return qx8Var;
            default:
                qx8 qx8Var2 = new qx8(this.H, this.I, this.J, tp4Var, 1);
                qx8Var2.G = obj;
                return qx8Var2;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        xne xneVar = (xne) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
            case 0:
                ((qx8) create(xneVar, tp4Var)).invokeSuspend(ieiVar);
                return m45.E;
            default:
                return ((qx8) create(xneVar, tp4Var)).invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        np5 np5Var = this.I;
        he6 he6Var = this.H;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                xne xneVar = (xne) this.G;
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    String str = aoe.a(he6Var, xneVar).b;
                    ed8 ed8Var = new ed8(20);
                    this.G = null;
                    this.F = 1;
                    epk epkVar = rx8.d;
                    px8 px8Var = new px8(ed8Var, np5Var, str, null);
                    epkVar.getClass();
                    obj = fd9.N(new ky0(epkVar, str, px8Var, null), this);
                    if (obj == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i2 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                throw ij0.e(obj);
            default:
                xne xneVar2 = (xne) this.G;
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    String str2 = aoe.a(he6Var, xneVar2).b;
                    he2 he2Var = new he2(1, this.J);
                    this.G = null;
                    this.F = 1;
                    epk epkVar2 = rx8.d;
                    px8 px8Var2 = new px8(he2Var, np5Var, str2, null);
                    epkVar2.getClass();
                    obj = fd9.N(new ky0(epkVar2, str2, px8Var2, null), this);
                    if (obj == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i3 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                obj.getClass();
                return ((cw8) obj).a;
        }
    }
}
