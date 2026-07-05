package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class idg extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ pz7 H;
    public final /* synthetic */ nwb I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ idg(pz7 pz7Var, nwb nwbVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = pz7Var;
        this.I = nwbVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                idg idgVar = new idg(this.H, this.I, tp4Var, 0);
                idgVar.G = obj;
                return idgVar;
            default:
                idg idgVar2 = new idg(this.H, this.I, tp4Var, 1);
                idgVar2.G = obj;
                return idgVar2;
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
        return ((idg) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
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
            default:
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
        }
        return m45Var;
    }
}
