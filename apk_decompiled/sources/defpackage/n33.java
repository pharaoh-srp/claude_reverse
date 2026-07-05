package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class n33 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ t53 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n33(t53 t53Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = t53Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        t53 t53Var = this.H;
        switch (i) {
            case 0:
                n33 n33Var = new n33(t53Var, tp4Var, 0);
                n33Var.G = obj;
                return n33Var;
            default:
                n33 n33Var2 = new n33(t53Var, tp4Var, 1);
                n33Var2.G = obj;
                return n33Var2;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((n33) create((cpc) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((n33) create((vt6) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        t53 t53Var = this.H;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                cpc cpcVar = (cpc) this.G;
                int i2 = this.F;
                if (i2 != 0) {
                    if (i2 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        sf5.h0(obj);
                    }
                    break;
                } else {
                    sf5.h0(obj);
                    Set set = (Set) cpcVar.E;
                    if (((Boolean) cpcVar.F).booleanValue() && !set.isEmpty()) {
                        zn znVar = new zn(set, t53Var, (tp4) null, 5);
                        this.G = null;
                        this.F = 1;
                        if (iuj.N(znVar, this) == m45Var) {
                        }
                        break;
                    }
                }
                break;
            default:
                vt6 vt6Var = (vt6) this.G;
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    zy1 zy1Var = t53Var.j0;
                    this.G = null;
                    this.F = 1;
                    if (zy1Var.b(this, vt6Var) == m45Var) {
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
