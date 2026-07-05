package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tfh extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ vfh G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tfh(vfh vfhVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = vfhVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        vfh vfhVar = this.G;
        switch (i) {
            case 0:
                return new tfh(vfhVar, tp4Var, 0);
            case 1:
                return new tfh(vfhVar, tp4Var, 1);
            case 2:
                return new tfh(vfhVar, tp4Var, 2);
            default:
                return new tfh(vfhVar, tp4Var, 3);
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
        return ((tfh) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        vfh vfhVar = this.G;
        m45 m45Var = m45.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    sih sihVar = vfhVar.W;
                    this.F = 1;
                    sihVar.j(true, this);
                    if (ieiVar == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i2 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                return ieiVar;
            case 1:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    sih sihVar2 = vfhVar.W;
                    this.F = 1;
                    sihVar2.k(this);
                    if (ieiVar == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i3 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                return ieiVar;
            case 2:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    sih sihVar3 = vfhVar.W;
                    this.F = 1;
                    if (sihVar3.y(this) == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i4 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                return ieiVar;
            default:
                int i5 = this.F;
                if (i5 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    Object objA = j8.g0(new v70(mpk.d0(new qfh(vfhVar, 2)), 1), 1).a(new i7(23, vfhVar), this);
                    if (objA != m45Var) {
                        objA = ieiVar;
                    }
                    if (objA == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i5 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                return ieiVar;
        }
    }
}
