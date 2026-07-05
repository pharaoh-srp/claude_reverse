package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r99 {
    public static final yig a = kxk.K(0.75f, 400.0f, null, 4);
    public static final y5f b = new y5f(new e69(1), new uw8(5));

    public static final void a(zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        fu9 fu9Var;
        nwb nwbVar;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(813436294);
        int i2 = (e18Var.h(zy7Var) ? 4 : 2) | i | 48;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            fu9 fu9Var2 = (fu9) e18Var.j(ve4.n);
            cz5 cz5Var = (cz5) e18Var.j(ve4.h);
            WeakHashMap weakHashMap = gdj.x;
            fei feiVar = s4i.d(e18Var).l;
            int iD = feiVar.d(cz5Var, fu9Var2);
            int iA = feiVar.a(cz5Var);
            int iB = feiVar.b(cz5Var, fu9Var2);
            int iC = feiVar.c(cz5Var);
            Object[] objArr = new Object[0];
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new m99(2);
                e18Var.k0(objN);
            }
            nwb nwbVarH = iuj.H(objArr, b, (zy7) objN, e18Var);
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = mpk.P(l9e.e);
                e18Var.k0(objN2);
            }
            nwb nwbVar2 = (nwb) objN2;
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = mpk.P(Boolean.FALSE);
                e18Var.k0(objN3);
            }
            nwb nwbVar3 = (nwb) objN3;
            Object objN4 = e18Var.N();
            if (objN4 == lz1Var) {
                objN4 = zh4.a(MTTypesetterKt.kLineSkipLimitMultiplier);
                e18Var.k0(objN4);
            }
            a80 a80Var = (a80) objN4;
            Object objN5 = e18Var.N();
            if (objN5 == lz1Var) {
                objN5 = zh4.a(MTTypesetterKt.kLineSkipLimitMultiplier);
                e18Var.k0(objN5);
            }
            a80 a80Var2 = (a80) objN5;
            l9e l9eVar = (l9e) nwbVar2.getValue();
            boolean zH = e18Var.h(a80Var) | e18Var.h(a80Var2) | e18Var.f(nwbVarH) | e18Var.d(fu9Var2.ordinal());
            Object objN6 = e18Var.N();
            if (zH || objN6 == lz1Var) {
                fu9Var = fu9Var2;
                nwbVar = nwbVarH;
                objN6 = new n99(a80Var, a80Var2, nwbVar2, nwbVar3, nwbVar, fu9Var, null);
                e18Var.k0(objN6);
            } else {
                fu9Var = fu9Var2;
                nwbVar = nwbVarH;
            }
            fd9.i(e18Var, (pz7) objN6, l9eVar);
            boolean zD = e18Var.d(iD) | e18Var.d(iA) | e18Var.d(iB) | e18Var.d(iC);
            Object objN7 = e18Var.N();
            if (zD || objN7 == lz1Var) {
                nwb nwbVar4 = nwbVar;
                q99 q99Var = new q99(iD, iA, iB, iC, a80Var, a80Var2, nwbVar2, nwbVar3, nwbVar4, fu9Var);
                a80Var = a80Var;
                a80Var2 = a80Var2;
                nwbVar2 = nwbVar2;
                nwbVar = nwbVar4;
                e18Var.k0(q99Var);
                objN7 = q99Var;
            }
            u40.a((q99) objN7, null, null, fd9.q0(1245543336, new uo(a80Var, a80Var2, zy7Var, nwbVar, nwbVar2), e18Var), e18Var, 3072, 6);
            iqbVar2 = fqb.E;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xh(zy7Var, iqbVar2, i, 8);
        }
    }

    public static final long b(fu9 fu9Var, l9e l9eVar) {
        float f = fu9Var == fu9.E ? l9eVar.c : l9eVar.a;
        return (((long) Float.floatToRawIntBits(l9eVar.d)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
    }
}
