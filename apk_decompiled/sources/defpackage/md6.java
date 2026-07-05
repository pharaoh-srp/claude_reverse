package defpackage;

import androidx.compose.runtime.b;

/* JADX INFO: loaded from: classes3.dex */
public final class md6 extends ts9 implements rz7 {
    public final /* synthetic */ Object F;
    public final /* synthetic */ zy7 G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ bz7 I;
    public final /* synthetic */ pz7 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md6(Object obj, zy7 zy7Var, boolean z, bz7 bz7Var, pz7 pz7Var) {
        super(3);
        this.F = obj;
        this.G = zy7Var;
        this.H = z;
        this.I = bz7Var;
        this.J = pz7Var;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        iqb iqbVar = (iqb) obj;
        ((Number) obj3).intValue();
        iqbVar.getClass();
        e18 e18Var = (e18) ((ld4) obj2);
        e18Var.a0(251188795);
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (objN == lz1Var) {
            b bVar = new b(fd9.O(im6.E, e18Var));
            e18Var.k0(bVar);
            objN = bVar;
        }
        l45 l45Var = ((b) objN).E;
        e18Var.a0(-98755228);
        Object objN2 = e18Var.N();
        if (objN2 == lz1Var) {
            objN2 = mpk.P(null);
            e18Var.k0(objN2);
        }
        nwb nwbVar = (nwb) objN2;
        e18Var.p(false);
        e18Var.a0(-98752659);
        Object objN3 = e18Var.N();
        if (objN3 == lz1Var) {
            objN3 = mpk.P(Boolean.FALSE);
            e18Var.k0(objN3);
        }
        nwb nwbVar2 = (nwb) objN3;
        e18Var.p(false);
        e18Var.a0(-98750263);
        boolean zH = e18Var.h(l45Var) | e18Var.f(null);
        zy7 zy7Var = this.G;
        boolean zF = zH | e18Var.f(zy7Var);
        Object objN4 = e18Var.N();
        if (zF || objN4 == lz1Var) {
            ek5 ek5Var = new ek5(zy7Var, nwbVar2, nwbVar, l45Var, 1);
            e18Var.k0(ek5Var);
            objN4 = ek5Var;
        }
        e18Var.p(false);
        fd9.d(this.F, (bz7) objN4, e18Var);
        boolean z = this.H;
        Boolean boolValueOf = Boolean.valueOf(z);
        e18Var.a0(-98735032);
        boolean zG = e18Var.g(z) | e18Var.h(l45Var) | e18Var.f(null);
        bz7 bz7Var = this.I;
        boolean zF2 = zG | e18Var.f(bz7Var) | e18Var.f(zy7Var);
        pz7 pz7Var = this.J;
        boolean zF3 = zF2 | e18Var.f(pz7Var);
        Object objN5 = e18Var.N();
        if (zF3 || objN5 == lz1Var) {
            iz2 iz2Var = new iz2(this.H, pz7Var, bz7Var, nwbVar2, l45Var, nwbVar, zy7Var, (tp4) null);
            e18Var.k0(iz2Var);
            objN5 = iz2Var;
        }
        e18Var.p(false);
        t7d t7dVar = a0h.a;
        iqb iqbVarB = iqbVar.B(new yzg(this.F, boolValueOf, null, new zzg((pz7) objN5), 4));
        e18Var.p(false);
        return iqbVarB;
    }
}
