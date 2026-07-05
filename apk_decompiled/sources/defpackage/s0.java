package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class s0 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ u0 G;
    public final /* synthetic */ odd H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(u0 u0Var, odd oddVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = u0Var;
        this.H = oddVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        odd oddVar = this.H;
        u0 u0Var = this.G;
        switch (i) {
            case 0:
                return new s0(u0Var, oddVar, tp4Var, 0);
            case 1:
                return new s0(u0Var, oddVar, tp4Var, 1);
            case 2:
                return new s0(u0Var, oddVar, tp4Var, 2);
            default:
                return new s0(u0Var, oddVar, tp4Var, 3);
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
        return ((s0) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        odd oddVar = this.H;
        u0 u0Var = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    zub zubVar = u0Var.U;
                    if (zubVar != null) {
                        ndd nddVar = new ndd(oddVar);
                        this.F = 1;
                        if (zubVar.b(nddVar, this) == m45Var) {
                        }
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
                    zub zubVar2 = u0Var.U;
                    if (zubVar2 != null) {
                        ndd nddVar2 = new ndd(oddVar);
                        this.F = 1;
                        if (zubVar2.b(nddVar2, this) == m45Var) {
                        }
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 2:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    zub zubVar3 = u0Var.U;
                    if (zubVar3 != null) {
                        this.F = 1;
                        if (zubVar3.b(oddVar, this) == m45Var) {
                        }
                    }
                } else if (i4 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                int i5 = this.F;
                if (i5 == 0) {
                    sf5.h0(obj);
                    zub zubVar4 = u0Var.U;
                    if (zubVar4 != null) {
                        pdd pddVar = new pdd(oddVar);
                        this.F = 1;
                        if (zubVar4.b(pddVar, this) == m45Var) {
                        }
                    }
                } else if (i5 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }
}
