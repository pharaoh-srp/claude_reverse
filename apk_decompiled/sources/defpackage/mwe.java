package defpackage;

import com.anthropic.claude.api.model.ModelSelectorEntry;
import com.anthropic.claude.chat.bottomsheet.model.b;
import com.anthropic.claude.types.strings.ModelId;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mwe implements sz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ mwe(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z, int i) {
        this.E = i;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
        this.J = obj4;
        this.K = obj5;
        this.F = z;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        z4g z4gVar;
        a5g a5gVar;
        ta4 ta4VarQ0;
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj5 = this.K;
        Object obj6 = this.J;
        Object obj7 = this.I;
        Object obj8 = this.H;
        Object obj9 = this.G;
        final int i2 = 0;
        final int i3 = 1;
        switch (i) {
            case 0:
                rz7 rz7Var = (rz7) obj9;
                final t4g t4gVar = (t4g) obj8;
                ua9 ua9Var = (ua9) obj7;
                nwb nwbVar = (nwb) obj6;
                final z3g z3gVar = (z3g) obj5;
                ld4 ld4Var = (ld4) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((ia0) obj).getClass();
                obj2.getClass();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= (iIntValue & 64) == 0 ? ((e18) ld4Var).f(obj2) : ((e18) ld4Var).h(obj2) ? 32 : 16;
                }
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 145) != 144)) {
                    kwe kweVar = (kwe) rz7Var.invoke(obj2, e18Var, Integer.valueOf((iIntValue >> 3) & 14));
                    boolean zEquals = obj2.equals(((bf3) t4gVar.a.F.getValue()).a.a);
                    if (zEquals) {
                        e18Var.a0(-1442391806);
                        boolean zF = e18Var.f(kweVar);
                        Object objN = e18Var.N();
                        if (zF || objN == jd4.a) {
                            objN = new aac(nwbVar, 25, kweVar);
                            e18Var.k0(objN);
                        }
                        fd9.s((zy7) objN, e18Var);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(-1442282252);
                        e18Var.p(false);
                    }
                    iqb iqbVar = fqb.E;
                    if (ua9Var != null) {
                        iqb iqbVarV0 = !zEquals ? iqbVar : wd6.v0(fd9.h0(iqbVar, new ta9(ua9Var, 1)), new tl8(5, ua9Var));
                        if (iqbVarV0 != null) {
                            iqbVar = iqbVarV0;
                        }
                    }
                    o5b o5bVarD = dw1.d(lja.G, false);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVar);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    d4c.i0(e18Var, cd4.f, o5bVarD);
                    d4c.i0(e18Var, cd4.e, hycVarL);
                    d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var, cd4.h);
                    d4c.i0(e18Var, cd4.d, iqbVarE);
                    r4g r4gVar = t4gVar.b;
                    v4g v4gVar = r4gVar.a;
                    u4g u4gVar = r4gVar.b;
                    ta4 ta4VarQ02 = null;
                    cb9 cb9Var = zEquals ? r4gVar.d : null;
                    long j = z3gVar.a;
                    if (kweVar == null || (z4gVar = kweVar.b) == null) {
                        z4gVar = k4g.l;
                    }
                    z4g z4gVar2 = z4gVar;
                    if (kweVar == null || (a5gVar = kweVar.c) == null) {
                        a5gVar = k4g.j;
                    }
                    a5g a5gVar2 = a5gVar;
                    pz7 pz7Var = kweVar != null ? kweVar.d : null;
                    pz7 pz7Var2 = kweVar != null ? kweVar.e : null;
                    ie3 ie3Var = (ie3) w44.O0(1, ((bf3) t4gVar.a.F.getValue()).c);
                    if (obj2.equals(ie3Var != null ? ie3Var.a : null)) {
                        e18Var.a0(-1243578889);
                        ta4VarQ0 = fd9.q0(1740633246, new pz7() { // from class: nwe
                            @Override // defpackage.pz7
                            public final Object invoke(Object obj10, Object obj11) {
                                int i4 = i2;
                                iei ieiVar2 = iei.a;
                                lz1 lz1Var = jd4.a;
                                z3g z3gVar2 = z3gVar;
                                switch (i4) {
                                    case 0:
                                        ld4 ld4Var2 = (ld4) obj10;
                                        int iIntValue2 = ((Integer) obj11).intValue();
                                        e18 e18Var2 = (e18) ld4Var2;
                                        if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            e18Var2.T();
                                        } else {
                                            tqh tqhVar = tqh.T;
                                            wu8 wu8VarI = ntj.i(z3gVar2, e18Var2);
                                            t4g t4gVar2 = t4gVar;
                                            boolean zH = e18Var2.h(t4gVar2);
                                            Object objN2 = e18Var2.N();
                                            if (zH || objN2 == lz1Var) {
                                                mx5 mx5Var = new mx5(0, t4gVar2, t4g.class, "dismiss", "dismiss()V", 0, 28);
                                                e18Var2.k0(mx5Var);
                                                objN2 = mx5Var;
                                            }
                                            tqhVar.w(null, wu8VarI, (zy7) ((jm9) objN2), e18Var2, 3072, 1);
                                        }
                                        break;
                                    default:
                                        ld4 ld4Var3 = (ld4) obj10;
                                        int iIntValue3 = ((Integer) obj11).intValue();
                                        e18 e18Var3 = (e18) ld4Var3;
                                        if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            e18Var3.T();
                                        } else {
                                            tqh tqhVar2 = tqh.T;
                                            wu8 wu8VarI2 = ntj.i(z3gVar2, e18Var3);
                                            t4g t4gVar3 = t4gVar;
                                            boolean zH2 = e18Var3.h(t4gVar3);
                                            Object objN3 = e18Var3.N();
                                            if (zH2 || objN3 == lz1Var) {
                                                mx5 mx5Var2 = new mx5(0, t4gVar3, t4g.class, "pop", "pop()V", 0, 29);
                                                e18Var3.k0(mx5Var2);
                                                objN3 = mx5Var2;
                                            }
                                            tqhVar2.u(null, wu8VarI2, (zy7) ((jm9) objN3), e18Var3, 3072, 1);
                                        }
                                        break;
                                }
                                return ieiVar2;
                            }
                        }, e18Var);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(-1243423300);
                        ta4VarQ0 = fd9.q0(-2141225305, new pz7() { // from class: nwe
                            @Override // defpackage.pz7
                            public final Object invoke(Object obj10, Object obj11) {
                                int i4 = i3;
                                iei ieiVar2 = iei.a;
                                lz1 lz1Var = jd4.a;
                                z3g z3gVar2 = z3gVar;
                                switch (i4) {
                                    case 0:
                                        ld4 ld4Var2 = (ld4) obj10;
                                        int iIntValue2 = ((Integer) obj11).intValue();
                                        e18 e18Var2 = (e18) ld4Var2;
                                        if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            e18Var2.T();
                                        } else {
                                            tqh tqhVar = tqh.T;
                                            wu8 wu8VarI = ntj.i(z3gVar2, e18Var2);
                                            t4g t4gVar2 = t4gVar;
                                            boolean zH = e18Var2.h(t4gVar2);
                                            Object objN2 = e18Var2.N();
                                            if (zH || objN2 == lz1Var) {
                                                mx5 mx5Var = new mx5(0, t4gVar2, t4g.class, "dismiss", "dismiss()V", 0, 28);
                                                e18Var2.k0(mx5Var);
                                                objN2 = mx5Var;
                                            }
                                            tqhVar.w(null, wu8VarI, (zy7) ((jm9) objN2), e18Var2, 3072, 1);
                                        }
                                        break;
                                    default:
                                        ld4 ld4Var3 = (ld4) obj10;
                                        int iIntValue3 = ((Integer) obj11).intValue();
                                        e18 e18Var3 = (e18) ld4Var3;
                                        if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            e18Var3.T();
                                        } else {
                                            tqh tqhVar2 = tqh.T;
                                            wu8 wu8VarI2 = ntj.i(z3gVar2, e18Var3);
                                            t4g t4gVar3 = t4gVar;
                                            boolean zH2 = e18Var3.h(t4gVar3);
                                            Object objN3 = e18Var3.N();
                                            if (zH2 || objN3 == lz1Var) {
                                                mx5 mx5Var2 = new mx5(0, t4gVar3, t4g.class, "pop", "pop()V", 0, 29);
                                                e18Var3.k0(mx5Var2);
                                                objN3 = mx5Var2;
                                            }
                                            tqhVar2.u(null, wu8VarI2, (zy7) ((jm9) objN3), e18Var3, 3072, 1);
                                        }
                                        break;
                                }
                                return ieiVar2;
                            }
                        }, e18Var);
                        e18Var.p(false);
                    }
                    ta4 ta4Var = ta4VarQ0;
                    pz7 pz7Var3 = kweVar != null ? kweVar.f : null;
                    sz7 sz7Var = kweVar != null ? kweVar.g : null;
                    if (sz7Var == null) {
                        e18Var.a0(-1243099506);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(-1243099505);
                        ta4VarQ02 = fd9.q0(-110936055, new cf1(2, sz7Var), e18Var);
                        e18Var.p(false);
                    }
                    stj.g(v4gVar, u4gVar, cb9Var, j, z4gVar2, a5gVar2, pz7Var, pz7Var2, ta4Var, pz7Var3, ta4VarQ02, fd9.q0(1273289268, new s50(kweVar, this.F, 8), e18Var), e18Var, 512, 48);
                    e18Var.p(true);
                } else {
                    e18Var.T();
                }
                break;
            default:
                List<ModelSelectorEntry> list = (List) obj9;
                String str = (String) obj8;
                bz7 bz7Var = (bz7) obj7;
                zy7 zy7Var = (zy7) obj6;
                qnc qncVar = (qnc) obj5;
                ld4 ld4Var2 = (ld4) obj3;
                int iH = ebh.h((Integer) obj4, (s64) obj, (mnc) obj2);
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(iH & 1, (iH & 129) != 128)) {
                    for (ModelSelectorEntry modelSelectorEntry : list) {
                        b.a(modelSelectorEntry, str == null ? false : ModelId.m1061equalsimpl0(modelSelectorEntry.m364getIdi4oh0I(), str), bz7Var, zy7Var, qncVar, this.F, e18Var2, 0, 0);
                    }
                } else {
                    e18Var2.T();
                }
                break;
        }
        return ieiVar;
    }
}
