package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class b03 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ f03 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b03(f03 f03Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = f03Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        f03 f03Var = this.G;
        switch (i) {
            case 0:
                return new b03(f03Var, tp4Var, 0);
            case 1:
                return new b03(f03Var, tp4Var, 1);
            default:
                return new b03(f03Var, tp4Var, 2);
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
        return ((b03) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        f03 f03Var = this.G;
        m45 m45Var = m45.E;
        tp4 tp4Var = null;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    wqd wqdVar = f03Var.h;
                    gnd gndVar = (gnd) f03Var.r.getValue();
                    this.F = 1;
                    if (wqdVar.o(gndVar, this) == m45Var) {
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
                    q0i q0iVar = f03Var.i;
                    this.F = 1;
                    myh myhVar = q0iVar.o;
                    myhVar.p();
                    if (myhVar.o.c(this) == m45Var) {
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
                    wqd wqdVar2 = f03Var.h;
                    gnd gndVar2 = (gnd) f03Var.r.getValue();
                    this.F = 1;
                    wqdVar2.getClass();
                    if (fd9.N(new kza(wqdVar2, gndVar2, tp4Var, 24), this) == m45Var) {
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
