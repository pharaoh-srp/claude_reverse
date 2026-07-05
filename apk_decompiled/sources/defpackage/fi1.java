package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fi1 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ ki1 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fi1(ki1 ki1Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = ki1Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        ki1 ki1Var = this.H;
        switch (i) {
            case 0:
                fi1 fi1Var = new fi1(ki1Var, tp4Var, 0);
                fi1Var.G = obj;
                return fi1Var;
            default:
                fi1 fi1Var2 = new fi1(ki1Var, tp4Var, 1);
                fi1Var2.G = obj;
                return fi1Var2;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((fi1) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((fi1) create((List) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = 1;
        tp4 tp4Var = null;
        switch (this.E) {
            case 0:
                ki1 ki1Var = this.H;
                l45 l45Var = (l45) this.G;
                m45 m45Var = m45.E;
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    p41 p41Var = ki1Var.d;
                    k92 k92VarQ = j8.q(new l41(i, p41Var, tp4Var));
                    te teVar = new te(7);
                    u9e u9eVar = j8.e;
                    nai.n(2, teVar);
                    kp7 kp7VarK = j8.K(j8.B(k92VarQ, u9eVar, teVar), p41Var.a.b());
                    o0 o0Var = new o0(l45Var, ki1Var, tp4Var, 20);
                    this.G = null;
                    this.F = 1;
                    if (j8.u(kp7VarK, o0Var, this) == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                List list = (List) this.G;
                m45 m45Var2 = m45.E;
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    this.H.x.setValue(list);
                    s51 s51Var = this.H.k;
                    if (s51Var != null && !list.contains(s51Var)) {
                        this.H.k = null;
                        if (!this.H.a.d()) {
                            dkb dkbVar = this.H.b;
                            this.G = null;
                            this.F = 1;
                            if (dkbVar.a(this) == m45Var2) {
                            }
                        }
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return iei.a;
    }
}
