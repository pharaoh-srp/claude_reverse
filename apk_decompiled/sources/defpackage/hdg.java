package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hdg extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ pz7 H;
    public final /* synthetic */ nwb I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hdg(pz7 pz7Var, nwb nwbVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = pz7Var;
        this.I = nwbVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                hdg hdgVar = new hdg(this.H, this.I, tp4Var, 0);
                hdgVar.G = obj;
                return hdgVar;
            case 1:
                hdg hdgVar2 = new hdg(this.H, this.I, tp4Var, 1);
                hdgVar2.G = obj;
                return hdgVar2;
            default:
                hdg hdgVar3 = new hdg(this.H, this.I, tp4Var, 2);
                hdgVar3.G = obj;
                return hdgVar3;
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
        return ((hdg) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        nwb nwbVar = this.I;
        pz7 pz7Var = this.H;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    zhd zhdVar = new zhd(nwbVar, ((l45) this.G).getCoroutineContext());
                    this.F = 1;
                    if (pz7Var.invoke(zhdVar, this) == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 1:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    zhd zhdVar2 = new zhd(nwbVar, ((l45) this.G).getCoroutineContext());
                    this.F = 1;
                    if (pz7Var.invoke(zhdVar2, this) == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    zhd zhdVar3 = new zhd(nwbVar, ((l45) this.G).getCoroutineContext());
                    this.F = 1;
                    if (pz7Var.invoke(zhdVar3, this) == m45Var) {
                    }
                } else if (i4 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }
}
