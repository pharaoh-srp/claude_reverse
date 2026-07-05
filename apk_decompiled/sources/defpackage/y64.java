package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class y64 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ z64 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y64(z64 z64Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = z64Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        z64 z64Var = this.G;
        switch (i) {
            case 0:
                return new y64(z64Var, tp4Var, 0);
            case 1:
                return new y64(z64Var, tp4Var, 1);
            default:
                return new y64(z64Var, tp4Var, 2);
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
        return ((y64) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        z64 z64Var = this.G;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    long jB = ((ovi) yb5.o(z64Var, ve4.u)).b();
                    this.F = 1;
                    if (d4c.K(jB, this) == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                zy7 zy7Var = z64Var.q0;
                if (zy7Var != null) {
                    zy7Var.a();
                }
                if (z64Var.r0) {
                    ((gf8) yb5.o(z64Var, ve4.l)).a(0);
                }
                z64Var.y0 = true;
                fkg fkgVar = z64Var.w0;
                if (fkgVar != null) {
                    fkgVar.d(null);
                }
                z64Var.w0 = null;
                z64Var.v0 = null;
                break;
            case 1:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    long jB2 = ((ovi) yb5.o(z64Var, ve4.u)).b();
                    this.F = 1;
                    if (d4c.K(jB2, this) == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                zy7 zy7Var2 = z64Var.q0;
                if (zy7Var2 != null) {
                    zy7Var2.a();
                }
                if (z64Var.r0) {
                    ((gf8) yb5.o(z64Var, ve4.l)).a(0);
                }
                z64Var.F0 = true;
                fkg fkgVar2 = z64Var.D0;
                if (fkgVar2 != null) {
                    fkgVar2.d(null);
                }
                z64Var.D0 = null;
                z64Var.C0 = null;
                break;
            default:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    long jB3 = ((ovi) yb5.o(z64Var, ve4.u)).b();
                    this.F = 1;
                    if (d4c.K(jB3, this) == m45Var) {
                    }
                } else if (i4 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                zy7 zy7Var3 = z64Var.q0;
                if (zy7Var3 != null) {
                    zy7Var3.a();
                }
                break;
        }
        return ieiVar;
    }
}
