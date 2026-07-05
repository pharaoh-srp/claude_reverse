package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class koh {
    public static final xe4 a = new xe4(new nlh(11));

    public static final void a(final iqb iqbVar, final kqc kqcVar, final fj0 fj0Var, final hoh hohVar, final ta4 ta4Var, rz7 rz7Var, vpc vpcVar, final sz7 sz7Var, ta4 ta4Var2, ld4 ld4Var, int i) {
        rz7 rz7Var2;
        final ta4 ta4Var3;
        e18 e18Var;
        vpc vpcVarK;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1879465207);
        int i2 = (i & 6) == 0 ? (e18Var2.f(iqbVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= e18Var2.f(kqcVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.f(fj0Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.f(hohVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.h(ta4Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            rz7Var2 = rz7Var;
            i2 |= e18Var2.h(rz7Var2) ? 131072 : 65536;
        } else {
            rz7Var2 = rz7Var;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var2.f(vpcVar) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= e18Var2.h(sz7Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            ta4Var3 = ta4Var2;
            i2 |= e18Var2.h(ta4Var3) ? 67108864 : 33554432;
        } else {
            ta4Var3 = ta4Var2;
        }
        if (e18Var2.Q(i2 & 1, (38347923 & i2) != 38347922)) {
            lz1 lz1Var = jd4.a;
            if (vpcVar == null) {
                e18Var2.a0(-2015143297);
                boolean z = (i2 & 896) == 256;
                Object objN = e18Var2.N();
                if (z || objN == lz1Var) {
                    objN = new u8a(fj0Var, 2);
                    e18Var2.k0(objN);
                }
                vpcVarK = v40.K((zy7) objN, sz7Var != null, e18Var2);
                e18Var2.p(false);
            } else {
                e18Var2.a0(-2015144351);
                e18Var2.p(false);
                vpcVarK = vpcVar;
            }
            fu9 fu9Var = (fu9) e18Var2.j(ve4.n);
            boolean zD = ((i2 & 7168) == 2048) | e18Var2.d(fu9Var.ordinal());
            Object objN2 = e18Var2.N();
            if (zD || objN2 == lz1Var) {
                objN2 = fu9Var == fu9.F ? new hoh(hohVar.b, hohVar.a) : hohVar;
                e18Var2.k0(objN2);
            }
            hoh hohVar2 = (hoh) objN2;
            eae eaeVarG = knk.G(goh.d, e18Var2);
            if (!x44.r((toh) ((gff) fj0Var.E).G.getValue(), fj0Var.x())) {
                toh tohVar = (toh) ((gff) fj0Var.E).G.getValue();
                toh tohVarX = fj0Var.x();
                hohVar2.getClass();
                eqc[] eqcVarArr = new eqc[3];
                int i3 = 0;
                for (int i4 = 3; i3 < i4; i4 = 3) {
                    int i5 = i3;
                    eqcVarArr[i5] = new eqc(0);
                    i3 = i5 + 1;
                }
                ArrayList arrayList = new ArrayList(3);
                int i6 = 0;
                for (int i7 = 3; i6 < i7; i7 = 3) {
                    arrayList.add(zp3.L);
                    i6++;
                }
                bae baeVar = new bae();
                baeVar.E = 3;
                bae baeVar2 = new bae();
                baeVar2.E = 3;
                bae baeVar3 = new bae();
                baeVar3.E = -1;
                bae baeVar4 = new bae();
                baeVar4.E = -1;
                hohVar2.a(new mq0(eqcVarArr, tohVar, tohVarX, baeVar, baeVar3, arrayList, baeVar2, baeVar4, 5));
                z9e z9eVar = new z9e();
                z9e z9eVar2 = new z9e();
                bae baeVar5 = new bae();
                baeVar5.E = 3;
                bae baeVar6 = new bae();
                baeVar6.E = -1;
                hohVar2.a(new jqc(baeVar, baeVar2, baeVar3, baeVar4, eqcVarArr, arrayList, z9eVar, baeVar5, z9eVar2, baeVar6));
                hohVar2.a(new mq0(baeVar, baeVar3, baeVar5, baeVar6, eqcVarArr, arrayList, z9eVar, z9eVar2, 6));
                hohVar2.a(new lpa(eqcVarArr, 17, arrayList));
                eaeVarG.a = new goh((dqc) arrayList.get(hohVar2.b(ooh.E)), (dqc) arrayList.get(hohVar2.b(ooh.F)), (dqc) arrayList.get(hohVar2.b(ooh.G)));
            }
            final goh gohVar = (goh) eaeVarG.a;
            Object objN3 = e18Var2.N();
            if (objN3 == lz1Var) {
                objN3 = new moh();
                e18Var2.k0(objN3);
            }
            final moh mohVar = (moh) objN3;
            mohVar.e = fj0Var;
            mohVar.a = hohVar2;
            int i8 = mohVar.h;
            for (int i9 = 0; i9 < i8; i9++) {
                ooh oohVarC = mohVar.c(i9);
                fqc fqcVarA = mohVar.a(i9);
                fqcVarA.a.setValue(gohVar.a(oohVarC));
                fqcVarA.g = false;
            }
            e18Var2.a0(407832974);
            final a6i a6iVarA0 = nai.a0((gff) fj0Var.E, "ThreePaneScaffoldState", e18Var2, 56, 0);
            e18Var2.p(false);
            Object objN4 = e18Var2.N();
            if (objN4 == lz1Var) {
                objN4 = new roh(mohVar);
                e18Var2.k0(objN4);
            }
            final roh rohVar = (roh) objN4;
            rohVar.G = fj0Var;
            rohVar.F = a6iVarA0;
            final a5f a5fVarY0 = wd6.y0(e18Var2);
            final vpc vpcVar2 = vpcVarK;
            final rz7 rz7Var3 = rz7Var2;
            e18Var = e18Var2;
            wd6.Q(fd9.q0(-2135424586, new rz7() { // from class: ioh
                @Override // defpackage.rz7
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    toh tohVar2;
                    ta4 ta4Var4;
                    ta4 ta4Var5;
                    mma mmaVar = (mma) obj;
                    ((Integer) obj3).getClass();
                    e18 e18Var3 = (e18) ((ld4) obj2);
                    boolean zF = e18Var3.f(a6iVarA0) | e18Var3.f(mmaVar);
                    Object objN5 = e18Var3.N();
                    lz1 lz1Var2 = jd4.a;
                    if (zF || objN5 == lz1Var2) {
                        objN5 = new qoh(rohVar, mmaVar, a5fVarY0, sta.h0(new cpc(ooh.E, new bt7()), new cpc(ooh.F, new bt7()), new cpc(ooh.G, new bt7())));
                        e18Var3.k0(objN5);
                    }
                    final qoh qohVar = (qoh) objN5;
                    fj0 fj0Var2 = fj0Var;
                    final toh tohVarX2 = fj0Var2.x();
                    tu5 tu5Var = (tu5) e18Var3.j(koh.a);
                    final int i10 = 0;
                    final ta4 ta4Var6 = ta4Var3;
                    final goh gohVar2 = gohVar;
                    ta4 ta4VarQ0 = fd9.q0(-1811043880, new pz7() { // from class: joh
                        @Override // defpackage.pz7
                        public final Object invoke(Object obj4, Object obj5) {
                            int i11 = i10;
                            iei ieiVar = iei.a;
                            toh tohVar3 = tohVarX2;
                            goh gohVar3 = gohVar2;
                            qoh qohVar2 = qohVar;
                            ta4 ta4Var7 = ta4Var6;
                            ld4 ld4Var2 = (ld4) obj4;
                            int iIntValue = ((Integer) obj5).intValue();
                            switch (i11) {
                                case 0:
                                    e18 e18Var4 = (e18) ld4Var2;
                                    if (!e18Var4.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        e18Var4.T();
                                    } else {
                                        ooh oohVar = ooh.E;
                                        ta4Var7.invoke(dgj.N(oohVar, qohVar2, gohVar3.a(oohVar), fd9.f0(tohVar3, oohVar), e18Var4), e18Var4, 0);
                                    }
                                    break;
                                default:
                                    e18 e18Var5 = (e18) ld4Var2;
                                    if (!e18Var5.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        e18Var5.T();
                                    } else {
                                        ooh oohVar2 = ooh.F;
                                        ta4Var7.invoke(dgj.N(oohVar2, qohVar2, gohVar3.a(oohVar2), fd9.f0(tohVar3, oohVar2), e18Var5), e18Var5, 0);
                                    }
                                    break;
                            }
                            return ieiVar;
                        }
                    }, e18Var3);
                    final int i11 = 1;
                    final ta4 ta4Var7 = ta4Var;
                    ta4 ta4VarQ02 = fd9.q0(1603374775, new pz7() { // from class: joh
                        @Override // defpackage.pz7
                        public final Object invoke(Object obj4, Object obj5) {
                            int i112 = i11;
                            iei ieiVar = iei.a;
                            toh tohVar3 = tohVarX2;
                            goh gohVar3 = gohVar2;
                            qoh qohVar2 = qohVar;
                            ta4 ta4Var72 = ta4Var7;
                            ld4 ld4Var2 = (ld4) obj4;
                            int iIntValue = ((Integer) obj5).intValue();
                            switch (i112) {
                                case 0:
                                    e18 e18Var4 = (e18) ld4Var2;
                                    if (!e18Var4.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        e18Var4.T();
                                    } else {
                                        ooh oohVar = ooh.E;
                                        ta4Var72.invoke(dgj.N(oohVar, qohVar2, gohVar3.a(oohVar), fd9.f0(tohVar3, oohVar), e18Var4), e18Var4, 0);
                                    }
                                    break;
                                default:
                                    e18 e18Var5 = (e18) ld4Var2;
                                    if (!e18Var5.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        e18Var5.T();
                                    } else {
                                        ooh oohVar2 = ooh.F;
                                        ta4Var72.invoke(dgj.N(oohVar2, qohVar2, gohVar3.a(oohVar2), fd9.f0(tohVar3, oohVar2), e18Var5), e18Var5, 0);
                                    }
                                    break;
                            }
                            return ieiVar;
                        }
                    }, e18Var3);
                    rz7 rz7Var4 = rz7Var3;
                    if (rz7Var4 == null) {
                        e18Var3.a0(-1647365771);
                        e18Var3.p(false);
                        ta4Var4 = null;
                        tohVar2 = tohVarX2;
                    } else {
                        e18Var3.a0(-1647314837);
                        tohVar2 = tohVarX2;
                        ta4 ta4VarQ03 = fd9.q0(70089074, new f73(rz7Var4, qohVar, gohVar2, tohVarX2, 10), e18Var3);
                        e18Var3.p(false);
                        ta4Var4 = ta4VarQ03;
                    }
                    sz7 sz7Var2 = sz7Var;
                    if (sz7Var2 == null) {
                        e18Var3.a0(-1646612843);
                        e18Var3.p(false);
                        ta4Var5 = null;
                    } else {
                        e18Var3.a0(-1646573069);
                        ta4 ta4VarQ04 = fd9.q0(-1977328982, new bu2(sz7Var2, 8, qohVar), e18Var3);
                        e18Var3.p(false);
                        ta4Var5 = ta4VarQ04;
                    }
                    tu5Var.a(new g5c(iqbVar, kqcVar, fj0Var2, hohVar, ta4VarQ0, ta4VarQ02, ta4Var4, vpcVar2, ta4Var5, mohVar, 1), e18Var3, 0);
                    tohVar2.getClass();
                    boolean zH = e18Var3.h(qohVar) | e18Var3.f(tohVar2);
                    Object objN6 = e18Var3.N();
                    if (zH || objN6 == lz1Var2) {
                        objN6 = new ab0(qohVar, tohVar2, null, 21);
                        e18Var3.k0(objN6);
                    }
                    fd9.i(e18Var3, (pz7) objN6, null);
                    return iei.a;
                }
            }, e18Var), e18Var, 6);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new q8a(iqbVar, kqcVar, fj0Var, hohVar, ta4Var, rz7Var, vpcVar, sz7Var, ta4Var2, i);
        }
    }
}
