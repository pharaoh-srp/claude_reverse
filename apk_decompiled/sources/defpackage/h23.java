package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class h23 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ x0a G;
    public final /* synthetic */ nwb H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h23(x0a x0aVar, nwb nwbVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = x0aVar;
        this.H = nwbVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new h23(this.G, this.H, tp4Var, 0);
            case 1:
                return new h23(this.G, this.H, tp4Var, 1);
            case 2:
                return new h23(this.G, this.H, tp4Var, 2);
            default:
                return new h23(this.G, this.H, tp4Var, 3);
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
        return ((h23) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = 0;
        x0a x0aVar = this.G;
        nwb nwbVar = this.H;
        m45 m45Var = m45.E;
        int i3 = 1;
        switch (i) {
            case 0:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    n2g n2gVar = x0aVar.g.a;
                    g23 g23Var = new g23(x0aVar, nwbVar, i2);
                    this.F = 1;
                    n2gVar.a(g23Var, this);
                } else if (i4 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 1:
                int i5 = this.F;
                if (i5 == 0) {
                    sf5.h0(obj);
                    b3f b3fVarD0 = mpk.d0(new i23(x0aVar, i2));
                    bd2 bd2Var = new bd2(i3, nwbVar);
                    this.F = 1;
                    if (b3fVarD0.a(bd2Var, this) == m45Var) {
                    }
                } else if (i5 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 2:
                int i6 = this.F;
                if (i6 == 0) {
                    sf5.h0(obj);
                    nwbVar.setValue(Boolean.FALSE);
                    this.F = 1;
                    if (x0a.k(x0aVar, 0, this) == m45Var) {
                    }
                } else if (i6 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                int i7 = this.F;
                if (i7 == 0) {
                    sf5.h0(obj);
                    nwbVar.setValue(Boolean.FALSE);
                    this.F = 1;
                    if (x0a.k(x0aVar, 0, this) == m45Var) {
                    }
                } else if (i7 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }
}
