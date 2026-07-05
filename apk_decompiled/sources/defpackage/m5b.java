package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m5b extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ n5b G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m5b(n5b n5bVar, int i) {
        super(0);
        this.F = i;
        this.G = n5bVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        b3d placementScope;
        int i = this.F;
        iei ieiVar = iei.a;
        n5b n5bVar = this.G;
        switch (i) {
            case 0:
                ev9 ev9Var = n5bVar.J;
                ev9Var.i = 0;
                wwb wwbVarM = ev9Var.a.M();
                Object[] objArr = wwbVarM.E;
                int i2 = wwbVarM.G;
                for (int i3 = 0; i3 < i2; i3++) {
                    n5b n5bVarA = ((av9) objArr[i3]).A();
                    n5bVarA.L = n5bVarA.M;
                    n5bVarA.M = Integer.MAX_VALUE;
                    n5bVarA.Y = false;
                    if (n5bVarA.P == xu9.F) {
                        n5bVarA.P = xu9.G;
                    }
                }
                av9 av9Var = ev9Var.a;
                av9 av9Var2 = ev9Var.a;
                wwb wwbVarM2 = av9Var.M();
                Object[] objArr2 = wwbVarM2.E;
                int i4 = wwbVarM2.G;
                for (int i5 = 0; i5 < i4; i5++) {
                    ((av9) objArr2[i5]).t().p.c0.d = false;
                }
                if (n5bVar.d().O) {
                    List listQ = av9Var2.q();
                    int size = listQ.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        ((m5c) ((av9) ((vwb) listQ).get(i6)).k0.I).O = true;
                    }
                }
                n5bVar.d().x0().d();
                if (n5bVar.d().O) {
                    List listQ2 = av9Var2.q();
                    int size2 = listQ2.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        ((m5c) ((av9) ((vwb) listQ2).get(i7)).k0.I).O = false;
                    }
                }
                wwb wwbVarM3 = av9Var2.M();
                Object[] objArr3 = wwbVarM3.E;
                int i8 = wwbVarM3.G;
                for (int i9 = 0; i9 < i8; i9++) {
                    av9 av9Var3 = (av9) objArr3[i9];
                    if (av9Var3.A().L != av9Var3.H()) {
                        av9Var2.l0();
                        av9Var2.Q();
                        if (av9Var3.H() == Integer.MAX_VALUE) {
                            if (av9Var3.t().c || fd9.g0(av9Var3)) {
                                lma lmaVarZ = av9Var3.z();
                                lmaVarZ.getClass();
                                lmaVarZ.i0(false);
                            }
                            av9Var3.A().j0();
                        }
                    }
                }
                wwb wwbVarM4 = av9Var2.M();
                Object[] objArr4 = wwbVarM4.E;
                int i10 = wwbVarM4.G;
                for (int i11 = 0; i11 < i10; i11++) {
                    bv9 bv9Var = ((av9) objArr4[i11]).t().p.c0;
                    bv9Var.e = bv9Var.d;
                }
                break;
            case 1:
                n5bVar.J.a().u(n5bVar.g0);
                break;
            default:
                ev9 ev9Var2 = n5bVar.J;
                m5c m5cVar = ev9Var2.a().W;
                if (m5cVar == null || (placementScope = m5cVar.P) == null) {
                    placementScope = dv9.a(ev9Var2.a).getPlacementScope();
                }
                bz7 bz7Var = n5bVar.l0;
                ja8 ja8Var = n5bVar.m0;
                if (ja8Var != null) {
                    m5c m5cVarA = ev9Var2.a();
                    long j = n5bVar.n0;
                    float f = n5bVar.o0;
                    placementScope.getClass();
                    b3d.a(placementScope, m5cVarA);
                    m5cVarA.a0(y69.d(j, m5cVarA.I), f, ja8Var);
                } else if (bz7Var == null) {
                    m5c m5cVarA2 = ev9Var2.a();
                    long j2 = n5bVar.n0;
                    float f2 = n5bVar.o0;
                    placementScope.getClass();
                    b3d.a(placementScope, m5cVarA2);
                    m5cVarA2.Z(y69.d(j2, m5cVarA2.I), f2, null);
                } else {
                    m5c m5cVarA3 = ev9Var2.a();
                    long j3 = n5bVar.n0;
                    float f3 = n5bVar.o0;
                    placementScope.getClass();
                    b3d.a(placementScope, m5cVarA3);
                    m5cVarA3.Z(y69.d(j3, m5cVarA3.I), f3, bz7Var);
                }
                break;
        }
        return ieiVar;
    }
}
