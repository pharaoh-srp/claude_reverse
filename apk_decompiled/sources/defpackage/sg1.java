package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sg1 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ e8d H;
    public final /* synthetic */ l2i I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sg1(e8d e8dVar, l2i l2iVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = e8dVar;
        this.I = l2iVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                sg1 sg1Var = new sg1(this.H, this.I, tp4Var, 0);
                sg1Var.G = obj;
                return sg1Var;
            default:
                sg1 sg1Var2 = new sg1(this.H, this.I, tp4Var, 1);
                sg1Var2.G = obj;
                return sg1Var2;
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
        return ((sg1) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        l2i l2iVar = this.I;
        e8d e8dVar = this.H;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    rg1 rg1Var = new rg1((l45) this.G, l2iVar, null);
                    this.F = 1;
                    if (pok.f(e8dVar, rg1Var, this) == m45Var) {
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
                    ug1 ug1Var = new ug1((l45) this.G, l2iVar, null, 0);
                    this.F = 1;
                    if (((e0h) e8dVar).p1(ug1Var, this) == m45Var) {
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
