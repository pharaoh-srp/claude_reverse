package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ao extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ gh2 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ao(gh2 gh2Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = gh2Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        gh2 gh2Var = this.H;
        switch (i) {
            case 0:
                ao aoVar = new ao(gh2Var, tp4Var, 0);
                aoVar.G = obj;
                return aoVar;
            case 1:
                ao aoVar2 = new ao(gh2Var, tp4Var, 1);
                aoVar2.G = obj;
                return aoVar2;
            default:
                ao aoVar3 = new ao(gh2Var, tp4Var, 2);
                aoVar3.G = obj;
                return aoVar3;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((ao) create((vt6) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 1:
                return ((ao) create((vt6) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((ao) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        lf9 lf9Var;
        int i = this.E;
        iei ieiVar = iei.a;
        gh2 gh2Var = this.H;
        m45 m45Var = m45.E;
        tp4 tp4Var = null;
        switch (i) {
            case 0:
                vt6 vt6Var = (vt6) this.G;
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    this.G = null;
                    this.F = 1;
                    return gh2Var.b(this, vt6Var) == m45Var ? m45Var : ieiVar;
                }
                if (i2 == 1) {
                    sf5.h0(obj);
                    return ieiVar;
                }
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                vt6 vt6Var2 = (vt6) this.G;
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    this.G = null;
                    this.F = 1;
                    return gh2Var.b(this, vt6Var2) == m45Var ? m45Var : ieiVar;
                }
                if (i3 == 1) {
                    sf5.h0(obj);
                    return ieiVar;
                }
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i4 = this.F;
                if (i4 != 0) {
                    if (i4 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    lf9Var = (lf9) this.G;
                    try {
                        sf5.h0(obj);
                        lf9Var.d(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        lf9Var.d(null);
                        throw th;
                    }
                }
                sf5.h0(obj);
                fkg fkgVarD = gb9.D((l45) this.G, null, null, new al8(2, tp4Var), 3);
                try {
                    this.G = fkgVarD;
                    this.F = 1;
                    Object objP = gh2Var.p(this);
                    if (objP == m45Var) {
                        return m45Var;
                    }
                    obj = objP;
                    lf9Var = fkgVarD;
                    lf9Var.d(null);
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    lf9Var = fkgVarD;
                    lf9Var.d(null);
                    throw th;
                }
        }
    }
}
