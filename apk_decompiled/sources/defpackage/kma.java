package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kma extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ lma G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kma(lma lmaVar, int i) {
        super(0);
        this.F = i;
        this.G = lmaVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        hma hmaVarF1;
        int i = this.F;
        iei ieiVar = iei.a;
        lma lmaVar = this.G;
        switch (i) {
            case 0:
                ev9 ev9Var = lmaVar.J;
                ev9Var.h = 0;
                wwb wwbVarM = ev9Var.a.M();
                Object[] objArr = wwbVarM.E;
                int i2 = wwbVarM.G;
                for (int i3 = 0; i3 < i2; i3++) {
                    lma lmaVar2 = ((av9) objArr[i3]).t().q;
                    lmaVar2.getClass();
                    lmaVar2.L = lmaVar2.M;
                    lmaVar2.M = Integer.MAX_VALUE;
                    if (lmaVar2.N == xu9.F) {
                        lmaVar2.N = xu9.G;
                    }
                }
                av9 av9Var = ev9Var.a;
                av9 av9Var2 = ev9Var.a;
                wwb wwbVarM2 = av9Var.M();
                Object[] objArr2 = wwbVarM2.E;
                int i4 = wwbVarM2.G;
                for (int i5 = 0; i5 < i4; i5++) {
                    lma lmaVar3 = ((av9) objArr2[i5]).t().q;
                    lmaVar3.getClass();
                    lmaVar3.W.d = false;
                }
                y39 y39Var = lmaVar.d().z0;
                if (y39Var != null) {
                    boolean z = y39Var.O;
                    List listQ = av9Var2.q();
                    int size = listQ.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        hma hmaVarF12 = ((m5c) ((av9) ((vwb) listQ).get(i6)).k0.I).f1();
                        if (hmaVarF12 != null) {
                            hmaVarF12.O = z;
                        }
                    }
                }
                y39 y39Var2 = lmaVar.d().z0;
                y39Var2.getClass();
                y39Var2.x0().d();
                if (lmaVar.d().z0 != null) {
                    List listQ2 = av9Var2.q();
                    int size2 = listQ2.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        hma hmaVarF13 = ((m5c) ((av9) ((vwb) listQ2).get(i7)).k0.I).f1();
                        if (hmaVarF13 != null) {
                            hmaVarF13.O = false;
                        }
                    }
                }
                wwb wwbVarM3 = av9Var2.M();
                Object[] objArr3 = wwbVarM3.E;
                int i8 = wwbVarM3.G;
                for (int i9 = 0; i9 < i8; i9++) {
                    lma lmaVar4 = ((av9) objArr3[i9]).t().q;
                    lmaVar4.getClass();
                    int i10 = lmaVar4.L;
                    int i11 = lmaVar4.M;
                    if (i10 != i11 && i11 == Integer.MAX_VALUE) {
                        lmaVar4.i0(true);
                    }
                }
                wwb wwbVarM4 = av9Var2.M();
                Object[] objArr4 = wwbVarM4.E;
                int i12 = wwbVarM4.G;
                for (int i13 = 0; i13 < i12; i13++) {
                    lma lmaVar5 = ((av9) objArr4[i13]).t().q;
                    lmaVar5.getClass();
                    bv9 bv9Var = lmaVar5.W;
                    bv9Var.e = bv9Var.d;
                }
                break;
            case 1:
                ev9 ev9Var2 = lmaVar.J;
                b3d placementScope = null;
                if (fd9.g0(ev9Var2.a) || ev9Var2.c) {
                    m5c m5cVar = ev9Var2.a().W;
                    if (m5cVar != null) {
                        placementScope = m5cVar.P;
                    }
                } else {
                    m5c m5cVar2 = ev9Var2.a().W;
                    if (m5cVar2 != null && (hmaVarF1 = m5cVar2.f1()) != null) {
                        placementScope = hmaVarF1.P;
                    }
                }
                if (placementScope == null) {
                    placementScope = dv9.a(ev9Var2.a).getPlacementScope();
                }
                hma hmaVarF14 = ev9Var2.a().f1();
                hmaVarF14.getClass();
                b3d.j(placementScope, hmaVarF14, lmaVar.S);
                break;
            default:
                hma hmaVarF15 = lmaVar.J.a().f1();
                hmaVarF15.getClass();
                hmaVarF15.u(lmaVar.d0);
                break;
        }
        return ieiVar;
    }
}
