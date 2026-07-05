package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ke extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ nwb G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ke(int i, tp4 tp4Var, nwb nwbVar) {
        super(2, tp4Var);
        this.E = i;
        this.G = nwbVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        nwb nwbVar = this.G;
        switch (i) {
            case 0:
                return new ke(0, tp4Var, nwbVar);
            case 1:
                return new ke(1, tp4Var, nwbVar);
            default:
                return new ke(2, tp4Var, nwbVar);
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
        return ((ke) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        nwb nwbVar = this.G;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    if (((Boolean) nwbVar.getValue()).booleanValue()) {
                        this.F = 1;
                        if (d4c.K(500L, this) == m45Var) {
                        }
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                nwbVar.setValue(Boolean.FALSE);
                break;
            case 1:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    z74 z74Var = wp.a;
                    if (((Boolean) nwbVar.getValue()).booleanValue()) {
                        this.F = 1;
                        if (d4c.K(2000L, this) == m45Var) {
                        }
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                z74 z74Var2 = wp.a;
                nwbVar.setValue(Boolean.FALSE);
                break;
            default:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    nwbVar.setValue(Boolean.TRUE);
                    this.F = 1;
                    if (d4c.K(1500L, this) == m45Var) {
                    }
                } else if (i4 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                nwbVar.setValue(Boolean.FALSE);
                break;
        }
        return ieiVar;
    }
}
