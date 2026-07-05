package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class du5 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public eu5 F;
    public fu5 G;
    public int H;
    public final /* synthetic */ eu5 I;
    public final /* synthetic */ fu5 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ du5(eu5 eu5Var, fu5 fu5Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.I = eu5Var;
        this.J = fu5Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        fu5 fu5Var = this.J;
        eu5 eu5Var = this.I;
        switch (i) {
            case 0:
                return new du5(eu5Var, fu5Var, tp4Var, 0);
            default:
                return new du5(eu5Var, fu5Var, tp4Var, 1);
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
        return ((du5) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        eu5 eu5Var;
        int i = this.E;
        fu5 fu5Var = this.J;
        eu5 eu5Var2 = this.I;
        m45 m45Var = m45.E;
        iei ieiVar = iei.a;
        int i2 = 3;
        int i3 = 2;
        int i4 = 0;
        tp4 tp4Var = null;
        int i5 = 1;
        switch (i) {
            case 0:
                int i6 = this.H;
                if (i6 == 0) {
                    sf5.h0(obj);
                    xv8 xv8Var = eu5Var2.i;
                    if (xv8Var != null) {
                        this.F = eu5Var2;
                        this.G = fu5Var;
                        this.H = 1;
                        Object objN = fd9.N(new z40(new pz7[]{new zt5(xv8Var, tp4Var, i2), new zt5(xv8Var, tp4Var, 4), new zt5(xv8Var, tp4Var, 5)}, tp4Var, i5), this);
                        if (objN != m45Var) {
                            objN = ieiVar;
                        }
                        if (objN != m45Var) {
                            eu5Var = eu5Var2;
                        }
                    }
                    eu5Var2.g.b.a();
                } else if (i6 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fu5Var = this.G;
                    eu5Var = this.F;
                    sf5.h0(obj);
                }
                eu5Var.i = null;
                bz7 bz7Var = eu5Var.h;
                bf3 bf3Var = eu5Var.e;
                bf3Var.getClass();
                List list = bf3Var.b;
                bz7Var.invoke(fu5Var.e(new bf3((ie3) w44.U0(list), w44.J0(1, list)), null));
                eu5Var2.g.b.a();
                break;
            default:
                int i7 = this.H;
                if (i7 == 0) {
                    sf5.h0(obj);
                    xv8 xv8Var2 = eu5Var2.i;
                    if (xv8Var2 != null) {
                        this.F = eu5Var2;
                        this.G = fu5Var;
                        this.H = 1;
                        Object objN2 = fd9.N(new z40(new pz7[]{new zt5(xv8Var2, tp4Var, i4), new zt5(xv8Var2, tp4Var, i5), new zt5(xv8Var2, tp4Var, i3)}, tp4Var, i5), this);
                        if (objN2 != m45Var) {
                            objN2 = ieiVar;
                        }
                        if (objN2 == m45Var) {
                        }
                    }
                } else if (i7 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fu5Var = this.G;
                    eu5Var2 = this.F;
                    sf5.h0(obj);
                }
                eu5Var2.i = null;
                eu5Var2.h.invoke(fu5Var.e(eu5Var2.e, null));
                break;
        }
        return ieiVar;
    }
}
