package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y39 extends hma {
    @Override // defpackage.h5b
    public final int Q(int i) {
        q28 q28VarF = this.S.S.F();
        o5b o5bVarR = q28VarF.r();
        av9 av9Var = (av9) q28VarF.F;
        return o5bVarR.e((m5c) av9Var.k0.I, av9Var.o(), i);
    }

    @Override // defpackage.hma
    public final void R0() {
        lma lmaVarZ = this.S.S.z();
        lmaVarZ.getClass();
        lmaVarZ.s0();
    }

    @Override // defpackage.h5b
    public final int a(int i) {
        q28 q28VarF = this.S.S.F();
        o5b o5bVarR = q28VarF.r();
        av9 av9Var = (av9) q28VarF.F;
        return o5bVarR.d((m5c) av9Var.k0.I, av9Var.o(), i);
    }

    @Override // defpackage.fma
    public final int i0(ut utVar) {
        lma lmaVar = this.S.S.t().q;
        lmaVar.getClass();
        bv9 bv9Var = lmaVar.W;
        if (!lmaVar.O) {
            ev9 ev9Var = lmaVar.J;
            if (ev9Var.d == vu9.F) {
                bv9Var.f = true;
                if (bv9Var.b) {
                    ev9Var.f = true;
                    ev9Var.g = true;
                }
            } else {
                bv9Var.g = true;
            }
        }
        y39 y39Var = lmaVar.d().z0;
        if (y39Var != null) {
            y39Var.O = true;
        }
        lmaVar.C();
        y39 y39Var2 = lmaVar.d().z0;
        if (y39Var2 != null) {
            y39Var2.O = false;
        }
        Integer num = (Integer) bv9Var.i.get(utVar);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.X.h(iIntValue, utVar);
        return iIntValue;
    }

    @Override // defpackage.h5b
    public final int l(int i) {
        q28 q28VarF = this.S.S.F();
        o5b o5bVarR = q28VarF.r();
        av9 av9Var = (av9) q28VarF.F;
        return o5bVarR.c((m5c) av9Var.k0.I, av9Var.o(), i);
    }

    @Override // defpackage.h5b
    public final int o(int i) {
        q28 q28VarF = this.S.S.F();
        o5b o5bVarR = q28VarF.r();
        av9 av9Var = (av9) q28VarF.F;
        return o5bVarR.a((m5c) av9Var.k0.I, av9Var.o(), i);
    }

    @Override // defpackage.h5b
    public final c3d u(long j) {
        d0(j);
        m5c m5cVar = this.S;
        wwb wwbVarM = m5cVar.S.M();
        Object[] objArr = wwbVarM.E;
        int i = wwbVarM.G;
        for (int i2 = 0; i2 < i; i2++) {
            lma lmaVarZ = ((av9) objArr[i2]).z();
            lmaVarZ.getClass();
            lmaVarZ.N = xu9.G;
        }
        av9 av9Var = m5cVar.S;
        hma.N0(this, av9Var.b0.b(this, av9Var.o(), j));
        return this;
    }
}
