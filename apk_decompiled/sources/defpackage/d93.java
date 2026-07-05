package defpackage;

import android.content.Context;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.InputMode;
import com.anthropic.claude.api.chat.messages.ApiHelpline;
import com.anthropic.claude.types.strings.MessageId;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class d93 implements sz7 {
    public final /* synthetic */ List E;
    public final /* synthetic */ g93 F;
    public final /* synthetic */ m83 G;
    public final /* synthetic */ f93 H;
    public final /* synthetic */ qi3 I;
    public final /* synthetic */ bl2 J;
    public final /* synthetic */ nwb K;
    public final /* synthetic */ nwb L;
    public final /* synthetic */ nwb M;
    public final /* synthetic */ kg3 N;
    public final /* synthetic */ lvh O;

    public d93(List list, g93 g93Var, m83 m83Var, f93 f93Var, qi3 qi3Var, bl2 bl2Var, nwb nwbVar, nwb nwbVar2, nwb nwbVar3, kg3 kg3Var, lvh lvhVar) {
        this.E = list;
        this.F = g93Var;
        this.G = m83Var;
        this.H = f93Var;
        this.I = qi3Var;
        this.J = bl2Var;
        this.K = nwbVar;
        this.L = nwbVar2;
        this.M = nwbVar3;
        this.N = kg3Var;
        this.O = lvhVar;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        e18 e18Var;
        Object eqVar;
        u0h u0hVar;
        boolean z;
        String str;
        iei ieiVar;
        uhd uhdVar;
        fqb fqbVar;
        b13 b13Var;
        boolean z2;
        nwb nwbVar;
        uhd uhdVar2;
        b13 b13Var2;
        fqb fqbVar2;
        boolean z3;
        boolean z4;
        mtc mtcVar;
        boolean z5;
        b13 b13Var3;
        fqb fqbVar3;
        boolean z6;
        Context context;
        boolean z7;
        Object objA;
        z80 z80Var;
        boolean z8;
        px9 px9Var = (px9) obj;
        int iIntValue = ((Number) obj2).intValue();
        ld4 ld4Var = (ld4) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        int i = (iIntValue2 & 6) == 0 ? (((e18) ld4Var).f(px9Var) ? 4 : 2) | iIntValue2 : iIntValue2;
        if ((iIntValue2 & 48) == 0) {
            i |= ((e18) ld4Var).d(iIntValue) ? 32 : 16;
        }
        e18 e18Var2 = (e18) ld4Var;
        boolean zQ = e18Var2.Q(i & 1, (i & 147) != 146);
        iei ieiVar2 = iei.a;
        if (!zQ) {
            e18Var2.T();
            return ieiVar2;
        }
        whd whdVar = (whd) this.E.get(iIntValue);
        e18Var2.a0(563641334);
        boolean z9 = whdVar instanceof vhd;
        fqb fqbVar4 = fqb.E;
        lz1 lz1Var = jd4.a;
        m83 m83Var = this.G;
        if (z9) {
            e18Var2.a0(563290041);
            Object[] objArr = new Object[0];
            Object objN = e18Var2.N();
            if (objN == lz1Var) {
                objN = bw.I;
                e18Var2.k0(objN);
            }
            nwb nwbVar2 = (nwb) iuj.I(objArr, (zy7) objN, e18Var2, 48);
            xo1 xo1Var = lja.G;
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, fqbVar4);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            z80 z80Var2 = cd4.f;
            d4c.i0(e18Var2, z80Var2, o5bVarD);
            z80 z80Var3 = cd4.e;
            d4c.i0(e18Var2, z80Var3, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var4 = cd4.g;
            d4c.i0(e18Var2, z80Var4, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var2, bxVar);
            z80 z80Var5 = cd4.d;
            d4c.i0(e18Var2, z80Var5, iqbVarE);
            vhd vhdVar = (vhd) whdVar;
            String str2 = vhdVar.e;
            List list = vhdVar.f;
            List list2 = vhdVar.g;
            InputMode inputMode = vhdVar.c;
            iqb iqbVar = e93.a;
            iqb iqbVarN = gb9.N(iIntValue == 0 ? fqbVar4 : e93.a, 36.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 14);
            String strJ0 = d4c.j0(R.string.generic_button_open_menu, e18Var2);
            boolean zF = e18Var2.f(nwbVar2);
            Object objN2 = e18Var2.N();
            if (zF || objN2 == lz1Var) {
                z80Var = z80Var5;
                objN2 = new u83(0, nwbVar2);
                e18Var2.k0(objN2);
            } else {
                z80Var = z80Var5;
            }
            zy7 zy7Var = (zy7) objN2;
            iqbVarN.getClass();
            zy7Var.getClass();
            iqb iqbVarP = kxk.p(iqbVarN, new fo3(zy7Var, strJ0));
            iqbVarP.getClass();
            iqb iqbVarA = a0h.a(iqbVarP, ieiVar2, new io3(1, zy7Var));
            boolean zF2 = e18Var2.f(m83Var);
            Object objN3 = e18Var2.N();
            if (zF2 || objN3 == lz1Var) {
                objN3 = new v83(m83Var, 0);
                e18Var2.k0(objN3);
            }
            bz7 bz7Var = (bz7) objN3;
            boolean zF3 = e18Var2.f(m83Var);
            Object objN4 = e18Var2.N();
            if (zF3 || objN4 == lz1Var) {
                objN4 = new v83(m83Var, 1);
                e18Var2.k0(objN4);
            }
            bz7 bz7Var2 = (bz7) objN4;
            boolean zF4 = e18Var2.f(m83Var);
            Object objN5 = e18Var2.N();
            if (zF4 || objN5 == lz1Var) {
                objN5 = new v83(m83Var, 2);
                e18Var2.k0(objN5);
            }
            bz7 bz7Var3 = (bz7) objN5;
            boolean zF5 = e18Var2.f(m83Var);
            Object objN6 = e18Var2.N();
            if (zF5 || objN6 == lz1Var) {
                objN6 = new v83(m83Var, 3);
                e18Var2.k0(objN6);
            }
            dtk.d(str2, list, list2, inputMode, bz7Var, bz7Var2, bz7Var3, (bz7) objN6, iqbVarA, 8.0f, e18Var2, 805306368);
            iqb iqbVarA2 = nw1.a.a(fqbVar4, lja.O);
            o5b o5bVarD2 = dw1.d(xo1Var, false);
            int iHashCode2 = Long.hashCode(e18Var2.T);
            hyc hycVarL2 = e18Var2.l();
            iqb iqbVarE2 = kxk.E(e18Var2, iqbVarA2);
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, z80Var2, o5bVarD2);
            d4c.i0(e18Var2, z80Var3, hycVarL2);
            ij0.t(iHashCode2, e18Var2, z80Var4, e18Var2, bxVar);
            d4c.i0(e18Var2, z80Var, iqbVarE2);
            ta4 ta4Var = m83Var.b;
            Boolean bool = (Boolean) nwbVar2.getValue();
            bool.getClass();
            boolean zF6 = e18Var2.f(nwbVar2);
            Object objN7 = e18Var2.N();
            if (zF6 || objN7 == lz1Var) {
                z8 = true;
                objN7 = new u83(1, nwbVar2);
                e18Var2.k0(objN7);
            } else {
                z8 = true;
            }
            ta4Var.m(whdVar, bool, (zy7) objN7, e18Var2, 0);
            e18Var = e18Var2;
            ij0.w(e18Var, z8, z8, false);
            ieiVar = ieiVar2;
            z7 = false;
        } else {
            e18Var = e18Var2;
            if (!(whdVar instanceof uhd)) {
                throw ebh.u(e18Var, -1505838675, false);
            }
            e18Var.a0(565485895);
            boolean z10 = iIntValue == 0;
            g93 g93Var = this.F;
            String str3 = g93Var.f;
            b13 b13Var4 = g93Var.h;
            uhd uhdVar3 = (uhd) whdVar;
            u0h u0hVar2 = uhdVar3.l;
            String str4 = uhdVar3.a;
            int i2 = i;
            List<mtc> list3 = uhdVar3.e;
            boolean zM1054equalsimpl0 = str3 == null ? false : MessageId.m1054equalsimpl0(str3, str4);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
            int iHashCode3 = Long.hashCode(e18Var.T);
            hyc hycVarL3 = e18Var.l();
            iqb iqbVarE3 = kxk.E(e18Var, fqbVar4);
            dd4.e.getClass();
            re4 re4Var2 = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var2);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL3);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode3));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE3);
            boolean zF7 = e18Var.f(g93Var) | e18Var.g(zM1054equalsimpl0) | ((((i2 & 112) ^ 48) > 32 && e18Var.d(iIntValue)) || (i2 & 48) == 32);
            Object objN8 = e18Var.N();
            if (zF7 || objN8 == lz1Var) {
                u0hVar = u0hVar2;
                z = zM1054equalsimpl0;
                str = str4;
                ieiVar = ieiVar2;
                uhdVar = uhdVar3;
                fqbVar = fqbVar4;
                eqVar = new eq(this.F, z, iIntValue, this.K, this.L, (tp4) null);
                e18Var.k0(eqVar);
            } else {
                z = zM1054equalsimpl0;
                eqVar = objN8;
                u0hVar = u0hVar2;
                str = str4;
                ieiVar = ieiVar2;
                uhdVar = uhdVar3;
                fqbVar = fqbVar4;
            }
            fd9.i(e18Var, (pz7) eqVar, ieiVar);
            nwb nwbVar3 = this.K;
            Integer num = (Integer) nwbVar3.getValue();
            if (num != null && num.intValue() == iIntValue) {
                b13Var = b13Var4;
                z2 = true;
            } else {
                b13Var = b13Var4;
                z2 = false;
            }
            wd6.H(s64.a, z2, null, null, null, null, fd9.q0(1477724228, new w83(m83Var, this.L, nwbVar3, 0), e18Var), e18Var, 1572870, 30);
            boolean z11 = z && b13Var.b();
            Object objN9 = e18Var.N();
            f93 f93Var = this.H;
            if (objN9 == lz1Var) {
                if (z11) {
                    objA = lm6.E;
                } else {
                    f93Var.getClass();
                    list3.getClass();
                    objA = f93.a(list3);
                }
                objN9 = mpk.P(objA);
                e18Var.k0(objN9);
            }
            nwb nwbVar4 = (nwb) objN9;
            Object objN10 = e18Var.N();
            if (objN10 == lz1Var) {
                objN10 = z11 ? null : list3;
                e18Var.k0(objN10);
            }
            List list4 = (List) objN10;
            boolean zF8 = e18Var.f(whdVar) | e18Var.h(list4) | e18Var.h(f93Var);
            Object objN11 = e18Var.N();
            if (zF8 || objN11 == lz1Var) {
                nwbVar = nwbVar4;
                uhd uhdVar4 = uhdVar;
                objN11 = new tm(uhdVar4, list4, nwbVar, this.H, (tp4) null, 17);
                uhdVar2 = uhdVar4;
                e18Var.k0(objN11);
            } else {
                nwbVar = nwbVar4;
                uhdVar2 = uhdVar;
            }
            fd9.i(e18Var, (pz7) objN11, list3);
            bz7 bz7Var4 = m83Var.u;
            Object objN12 = e18Var.N();
            if (objN12 == lz1Var) {
                objN12 = new cv(16, this.M);
                e18Var.k0(objN12);
            }
            boolean z12 = z;
            nwb nwbVar5 = nwbVar;
            boolean z13 = z10;
            uhd uhdVar5 = uhdVar2;
            boolean z14 = z13;
            boolean z15 = z12;
            nuk.c(bz7Var4, new cs7((bz7) objN12), fd9.q0(896901389, new z83(nwbVar5, z13, m83Var, uhdVar5, this.N, z12, this.F, this.O), e18Var), e18Var, 384);
            float f = 20.0f;
            if (uhdVar5.i == null && uhdVar5.j) {
                e18Var.a0(-1592290842);
                e18Var.p(false);
                z3 = false;
                b13Var2 = b13Var;
                fqbVar2 = fqbVar;
                z4 = z15;
            } else {
                e18Var.a0(-1594939358);
                Context context2 = (Context) e18Var.j(w00.b);
                for (mtc mtcVar2 : list3) {
                    if (mtcVar2 instanceof ftc) {
                        mtcVar = mtcVar2;
                        ftc ftcVar = (ftc) mtcVar;
                        if (ftcVar.i instanceof swh) {
                            e18Var.a0(-1464873253);
                            boolean zB = b13Var.b();
                            String str5 = uhdVar5.a;
                            iqb iqbVar2 = e93.a;
                            z5 = z14;
                            b13Var3 = b13Var;
                            fqb fqbVar5 = fqbVar;
                            fqbVar3 = fqbVar5;
                            osk.l(ftcVar, this.O, zB, str5, z15, gb9.L(fqbVar5, f, MTTypesetterKt.kLineSkipLimitMultiplier, 2).B(z5 ? fqbVar5 : e93.a), e18Var, 0);
                            e18Var.p(false);
                            z6 = z15;
                            context = context2;
                        }
                        b13Var = b13Var3;
                        z15 = z6;
                        context2 = context;
                        f = 20.0f;
                        fqbVar = fqbVar3;
                        z14 = z5;
                    } else {
                        mtcVar = mtcVar2;
                    }
                    z5 = z14;
                    b13Var3 = b13Var;
                    boolean z16 = z15;
                    fqbVar3 = fqbVar;
                    if (mtcVar instanceof ltc) {
                        e18Var.a0(-1463942633);
                        Iterator it = ((ltc) mtcVar).a.iterator();
                        while (it.hasNext()) {
                            iaj iajVar = (iaj) it.next();
                            String str6 = iajVar.a;
                            String strB = uaj.b(context2, str6);
                            boolean z17 = z16;
                            int iA = uaj.a(iajVar.a);
                            iqb iqbVar3 = e93.a;
                            Context context3 = context2;
                            Iterator it2 = it;
                            iqb iqbVarB = gb9.L(fqbVar3, 20.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2).B(z5 ? fqbVar3 : e93.a);
                            boolean zF9 = e18Var.f(m83Var) | e18Var.f(iajVar);
                            Object objN13 = e18Var.N();
                            if (zF9 || objN13 == lz1Var) {
                                objN13 = new p4(m83Var, 8, iajVar);
                                e18Var.k0(objN13);
                            }
                            rlk.a(str6, strB, iA, (zy7) objN13, iqbVarB, null, e18Var, 196608, 0);
                            z16 = z17;
                            context2 = context3;
                            it = it2;
                        }
                        z6 = z16;
                        context = context2;
                        e18Var.p(false);
                    } else {
                        z6 = z16;
                        context = context2;
                        e18Var.a0(-1155561887);
                        e18Var.p(false);
                    }
                    b13Var = b13Var3;
                    z15 = z6;
                    context2 = context;
                    f = 20.0f;
                    fqbVar = fqbVar3;
                    z14 = z5;
                }
                b13Var2 = b13Var;
                fqbVar2 = fqbVar;
                z3 = false;
                z4 = z15;
                e18Var.p(false);
            }
            if (z4 && b13Var2.b()) {
                e18Var.a0(-1589932858);
                e18Var.p(z3);
            } else {
                e18Var.a0(-1592030721);
                Set set = (Set) u0hVar.getValue();
                String str7 = uhdVar5.a;
                ApiHelpline apiHelpline = uhdVar5.g;
                iqb iqbVar4 = e93.a;
                iqb iqbVarL = gb9.L(fqbVar2, 20.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                iqb iqbVar5 = e93.a;
                iqb iqbVarB2 = iqbVarL.B(iqbVar5);
                boolean zF10 = e18Var.f(whdVar) | e18Var.f(m83Var);
                Object objN14 = e18Var.N();
                if (zF10 || objN14 == lz1Var) {
                    objN14 = new p4(uhdVar5, 9, m83Var);
                    e18Var.k0(objN14);
                }
                zy7 zy7Var2 = (zy7) objN14;
                bl2 bl2Var = this.J;
                boolean zH = e18Var.h(bl2Var) | e18Var.f(whdVar);
                Object objN15 = e18Var.N();
                if (zH || objN15 == lz1Var) {
                    objN15 = new a93(bl2Var, uhdVar5, 0);
                    e18Var.k0(objN15);
                }
                jwk.c(set, str7, this.I, iqbVarB2, apiHelpline, zy7Var2, (zy7) objN15, e18Var, 0);
                Set set2 = (Set) u0hVar.getValue();
                String str8 = uhdVar5.a;
                ApiHelpline apiHelpline2 = uhdVar5.g;
                iqb iqbVarB3 = gb9.L(fqbVar2, 20.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2).B(iqbVar5);
                boolean zH2 = e18Var.h(bl2Var) | e18Var.f(whdVar);
                Object objN16 = e18Var.N();
                if (zH2 || objN16 == lz1Var) {
                    objN16 = new a93(bl2Var, uhdVar5, 1);
                    e18Var.k0(objN16);
                }
                hvj.a(set2, str8, this.I, iqbVarB3, apiHelpline2, (zy7) objN16, e18Var, 0);
                e18Var.p(false);
            }
            if (whdVar.d()) {
                z7 = false;
                e18Var.a0(-1588556954);
                e18Var.p(false);
            } else {
                e18Var.a0(-1589553511);
                boolean zB2 = b13Var2.b();
                String str9 = g93Var.p;
                e93.a(uhdVar5, z4, zB2, str9 == null ? false : MessageId.m1054equalsimpl0(str9, str), g93Var.q, g93Var.m, g93Var.r, g93Var.n, g93Var.o, g93Var.s, this.J, null, e18Var, 0);
                z7 = false;
                e18Var.p(false);
            }
            e18Var.p(true);
            e18Var.p(z7);
        }
        e18Var.p(z7);
        return ieiVar;
    }
}
