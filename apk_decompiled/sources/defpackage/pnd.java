package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pnd extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ qnd G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pnd(qnd qndVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = qndVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        qnd qndVar = this.G;
        switch (i) {
            case 0:
                return new pnd(qndVar, tp4Var, 0);
            case 1:
                return new pnd(qndVar, tp4Var, 1);
            default:
                return new pnd(qndVar, tp4Var, 2);
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
        return ((pnd) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        gnd gndVar = qnd.i;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        qnd qndVar = this.G;
        tp4 tp4Var = null;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 != 0) {
                    if (i2 == 1) {
                        sf5.h0(obj);
                        return ieiVar;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                kp7 kp7VarY = j8.y(mpk.d0(new ond(qndVar, 1)), 200L);
                kza kzaVar = new kza(qndVar, tp4Var, 22);
                this.F = 1;
                return j8.u(kp7VarY, kzaVar, this) == m45Var ? m45Var : ieiVar;
            case 1:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    wqd wqdVar = qndVar.b;
                    this.F = 1;
                    return wqdVar.o(gndVar, this) == m45Var ? m45Var : ieiVar;
                }
                if (i3 == 1) {
                    sf5.h0(obj);
                    return ieiVar;
                }
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    wqd wqdVar2 = qndVar.b;
                    this.F = 1;
                    wqdVar2.getClass();
                    if (fd9.N(new kza(wqdVar2, gndVar, tp4Var, 24), this) == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i4 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                qndVar.g.setValue(Boolean.TRUE);
                return ieiVar;
        }
    }
}
