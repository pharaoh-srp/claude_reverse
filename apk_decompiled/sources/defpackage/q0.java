package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q0 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ zub G;
    public final /* synthetic */ odd H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(odd oddVar, zub zubVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 0;
        this.H = oddVar;
        this.G = zubVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        odd oddVar = this.H;
        zub zubVar = this.G;
        switch (i) {
            case 0:
                return new q0(oddVar, zubVar, tp4Var);
            case 1:
                return new q0(zubVar, oddVar, tp4Var, 1);
            default:
                return new q0(zubVar, oddVar, tp4Var, 2);
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
        return ((q0) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        odd oddVar = this.H;
        zub zubVar = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    pdd pddVar = new pdd(oddVar);
                    this.F = 1;
                    if (zubVar.b(pddVar, this) == m45Var) {
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
                    this.F = 1;
                    if (zubVar.b(oddVar, this) == m45Var) {
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
                    this.F = 1;
                    if (zubVar.b(oddVar, this) == m45Var) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(zub zubVar, odd oddVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = zubVar;
        this.H = oddVar;
    }
}
