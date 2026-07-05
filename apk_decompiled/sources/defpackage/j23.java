package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j23 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ x0a G;
    public final /* synthetic */ int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j23(int i, int i2, tp4 tp4Var, x0a x0aVar) {
        super(2, tp4Var);
        this.E = i2;
        this.G = x0aVar;
        this.H = i;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new j23(this.H, 0, tp4Var, this.G);
            default:
                return new j23(this.H, 1, tp4Var, this.G);
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
        return ((j23) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.H;
        m45 m45Var = m45.E;
        x0a x0aVar = this.G;
        switch (i) {
            case 0:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    y5f y5fVar = x0a.y;
                    if (x0aVar.f(i2 - 1, 0, this) == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                int i4 = this.F;
                if (i4 != 0) {
                    if (i4 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        sf5.h0(obj);
                    }
                    break;
                } else {
                    sf5.h0(obj);
                    if (!x0aVar.j.a() && ((isc) x0aVar.e.b).h() != i2) {
                        this.F = 1;
                        if (x0a.k(x0aVar, i2, this) == m45Var) {
                        }
                        break;
                    }
                }
                break;
        }
        return m45Var;
    }
}
