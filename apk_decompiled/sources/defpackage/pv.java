package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pv extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ uv G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pv(uv uvVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = uvVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        uv uvVar = this.G;
        switch (i) {
            case 0:
                return new pv(uvVar, tp4Var, 0);
            case 1:
                return new pv(uvVar, tp4Var, 1);
            case 2:
                return new pv(uvVar, tp4Var, 2);
            case 3:
                return new pv(uvVar, tp4Var, 3);
            default:
                return new pv(uvVar, tp4Var, 4);
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
        return ((pv) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        uv uvVar = this.G;
        m45 m45Var = m45.E;
        int i2 = 1;
        tp4 tp4Var = null;
        switch (i) {
            case 0:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    zy1 zy1Var = uvVar.c.i;
                    zy1 zy1Var2 = uvVar.j;
                    this.F = 1;
                    if (x44.I(zy1Var, zy1Var2, this) == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 1:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    int i5 = 9;
                    er7 er7Var = new er7(j8.A(j8.y(mpk.d0(new ov(uvVar, 8)), 200L)), j8.A(mpk.d0(new ov(uvVar, i5))), new qv(3, tp4Var), 1);
                    m0 m0Var = new m0(uvVar, tp4Var, i5);
                    this.F = 1;
                    if (j8.u(er7Var, m0Var, this) == m45Var) {
                    }
                } else if (i4 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 2:
                int i6 = this.F;
                if (i6 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    int i7 = uv.x;
                    Object objN = fd9.N(new b9(uvVar, tp4Var, i2), this);
                    if (objN != m45Var) {
                        objN = ieiVar;
                    }
                    if (objN == m45Var) {
                    }
                } else if (i6 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 3:
                int i8 = this.F;
                if (i8 == 0) {
                    sf5.h0(obj);
                    vn5 vn5Var = uvVar.d;
                    long j = uv.w;
                    hm hmVar = new hm(uvVar, tp4Var, 2);
                    this.F = 1;
                    if (vn5Var.a(j, hmVar, this) == m45Var) {
                    }
                } else if (i8 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                int i9 = this.F;
                if (i9 == 0) {
                    sf5.h0(obj);
                    wqd wqdVar = uvVar.c;
                    this.F = 1;
                    wqdVar.getClass();
                    Object objN2 = fd9.N(new kza(wqdVar, gnd.F, tp4Var, 24), this);
                    if (objN2 == m45Var) {
                    }
                } else if (i9 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }
}
