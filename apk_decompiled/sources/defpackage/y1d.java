package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class y1d extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ ggc H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y1d(ggc ggcVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = ggcVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        ggc ggcVar = this.H;
        switch (i) {
            case 0:
                y1d y1dVar = new y1d(ggcVar, tp4Var, 0);
                y1dVar.G = obj;
                return y1dVar;
            default:
                y1d y1dVar2 = new y1d(ggcVar, tp4Var, 1);
                y1dVar2.G = obj;
                return y1dVar2;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        vt6 vt6Var = (vt6) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((y1d) create(vt6Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        ggc ggcVar = this.H;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                vt6 vt6Var = (vt6) this.G;
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    zy1 zy1Var = ggcVar.a.m;
                    this.G = null;
                    this.F = 1;
                    if (zy1Var.b(this, vt6Var) == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                vt6 vt6Var2 = (vt6) this.G;
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    zy1 zy1Var2 = ggcVar.a.m;
                    this.G = null;
                    this.F = 1;
                    if (zy1Var2.b(this, vt6Var2) == m45Var) {
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
