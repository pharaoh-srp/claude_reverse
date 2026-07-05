package defpackage;

import androidx.compose.runtime.b;

/* JADX INFO: loaded from: classes3.dex */
public final class nge extends ts9 implements rz7 {
    public final /* synthetic */ oge F;
    public final /* synthetic */ bz7 G;
    public final /* synthetic */ zy7 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nge(oge ogeVar, bz7 bz7Var, zy7 zy7Var) {
        super(3);
        this.F = ogeVar;
        this.G = bz7Var;
        this.H = zy7Var;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        iqb iqbVar = (iqb) obj;
        ((Number) obj3).intValue();
        iqbVar.getClass();
        e18 e18Var = (e18) ((ld4) obj2);
        e18Var.a0(-1794533607);
        e18Var.a0(-1020129731);
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (objN == lz1Var) {
            objN = mpk.P(new fcc(0L));
            e18Var.k0(objN);
        }
        nwb nwbVar = (nwb) objN;
        e18Var.p(false);
        e18Var.a0(-1020127586);
        Object objN2 = e18Var.N();
        if (objN2 == lz1Var) {
            objN2 = mpk.P(new g79(0L));
            e18Var.k0(objN2);
        }
        nwb nwbVar2 = (nwb) objN2;
        e18Var.p(false);
        Object objN3 = e18Var.N();
        if (objN3 == lz1Var) {
            b bVar = new b(fd9.O(im6.E, e18Var));
            e18Var.k0(bVar);
            objN3 = bVar;
        }
        l45 l45Var = ((b) objN3).E;
        e18Var.a0(-1020123472);
        Object objN4 = e18Var.N();
        if (objN4 == lz1Var) {
            objN4 = new g4(nwbVar, 11, nwbVar2);
            e18Var.k0(objN4);
        }
        e18Var.p(false);
        iqb iqbVarP0 = xn5.p0(iqbVar, (bz7) objN4);
        oge ogeVar = this.F;
        che cheVar = ogeVar.a;
        Object obj4 = ogeVar.b;
        cheVar.getClass();
        obj4.getClass();
        boolean z = ((Boolean) mpk.w(new mx1(obj4, 14, cheVar)).getValue()).booleanValue() || !((Boolean) ogeVar.a.k.getValue()).booleanValue();
        e18Var.a0(-1020110929);
        boolean zH = e18Var.h(l45Var) | e18Var.f(ogeVar);
        bz7 bz7Var = this.G;
        boolean zF = zH | e18Var.f(bz7Var);
        Object objN5 = e18Var.N();
        if (zF || objN5 == lz1Var) {
            objN5 = new n40(l45Var, bz7Var, this.F, nwbVar, nwbVar2, 2);
            e18Var.k0(objN5);
        }
        bz7 bz7Var2 = (bz7) objN5;
        e18Var.p(false);
        e18Var.a0(-1020094176);
        boolean zF2 = e18Var.f(ogeVar);
        zy7 zy7Var = this.H;
        boolean zF3 = zF2 | e18Var.f(zy7Var);
        Object objN6 = e18Var.N();
        if (zF3 || objN6 == lz1Var) {
            objN6 = new xz(ogeVar, 17, zy7Var);
            e18Var.k0(objN6);
        }
        zy7 zy7Var2 = (zy7) objN6;
        e18Var.p(false);
        e18Var.a0(-1020089987);
        boolean zF4 = e18Var.f(ogeVar);
        Object objN7 = e18Var.N();
        if (zF4 || objN7 == lz1Var) {
            objN7 = new r10(3, ogeVar);
            e18Var.k0(objN7);
        }
        pz7 pz7Var = (pz7) objN7;
        e18Var.p(false);
        iqbVarP0.getClass();
        bz7Var2.getClass();
        zy7Var2.getClass();
        pz7Var.getClass();
        iqb iqbVarP = kxk.p(iqbVarP0, new md6(cheVar, zy7Var2, z, bz7Var2, pz7Var));
        e18Var.p(false);
        return iqbVarP;
    }
}
