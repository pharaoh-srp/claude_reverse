package defpackage;

import com.anthropic.claude.ui.components.error.a;

/* JADX INFO: loaded from: classes2.dex */
public final class mj4 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ uj4 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mj4(uj4 uj4Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = uj4Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        uj4 uj4Var = this.G;
        switch (i) {
            case 0:
                return new mj4(uj4Var, tp4Var, 0);
            case 1:
                return new mj4(uj4Var, tp4Var, 1);
            case 2:
                return new mj4(uj4Var, tp4Var, 2);
            default:
                return new mj4(uj4Var, tp4Var, 3);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
            case 0:
                ((mj4) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ((mj4) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = 0;
        uj4 uj4Var = this.G;
        m45 m45Var = m45.E;
        tp4 tp4Var = null;
        int i3 = 1;
        switch (i) {
            case 0:
                int i4 = this.F;
                if (i4 != 0) {
                    if (i4 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        sf5.h0(obj);
                    }
                    break;
                } else {
                    sf5.h0(obj);
                    a4e a4eVar = uj4Var.d.g;
                    lj4 lj4Var = new lj4(uj4Var, i2);
                    this.F = 1;
                    if (a4eVar.E.a(lj4Var, this) == m45Var) {
                    }
                }
                sz6.r();
                break;
            case 1:
                int i5 = this.F;
                if (i5 == 0) {
                    sf5.h0(obj);
                    kp7 kp7VarA = j8.A(new hr7(new kp7[]{j8.A(new pj4(0, new aj0(4, new tp7(new fc4(6), new z01(uj4Var.g, 5), null)))), uj4Var.h, uj4Var.i}, 0, new ey(4, tp4Var, i3)));
                    w14 w14Var = new w14(uj4Var, (tp4) null);
                    this.F = 1;
                    if (j8.u(kp7VarA, w14Var, this) == m45Var) {
                    }
                } else if (i5 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 2:
                int i6 = this.F;
                if (i6 == 0) {
                    sf5.h0(obj);
                    ij4 ij4Var = uj4Var.b;
                    this.F = 1;
                    obj = ij4Var.c(this);
                    if (obj != m45Var) {
                    }
                } else if (i6 == 1) {
                    sf5.h0(obj);
                } else if (i6 != 2) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                nf0 nf0Var = (nf0) obj;
                if (nf0Var != null) {
                    zy1 zy1Var = uj4Var.f;
                    vt6 vt6VarB = a.b(nf0Var);
                    this.F = 2;
                    if (zy1Var.b(this, vt6VarB) != m45Var) {
                    }
                }
                break;
            default:
                int i7 = this.F;
                if (i7 == 0) {
                    sf5.h0(obj);
                    ij4 ij4Var2 = uj4Var.b;
                    g56 g56Var = (g56) ij4Var2.h.getValue();
                    this.F = 1;
                    if (ij4Var2.a(g56Var, this) == m45Var) {
                    }
                } else if (i7 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }
}
