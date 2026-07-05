package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.tasks.TaskStatus;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s6h {
    static {
        x44.X(new t6h(1, "Confirm grocery list"), new t6h(2, "Open Instacart"), new t6h(3, "Search and add items"), new t6h(4, "Review cart"), new t6h(5, "Checkout"));
    }

    public static final void a(final String str, final TaskStatus taskStatus, final boolean z, final boolean z2, final boolean z3, final boolean z4, ld4 ld4Var, final int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(233966037);
        int i2 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.d(taskStatus == null ? -1 : taskStatus.ordinal()) ? 32 : 16) | (e18Var.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.g(z2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.g(z3) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.g(z4) ? 131072 : 65536);
        if (e18Var.Q(i2 & 1, (74899 & i2) != 74898)) {
            wo1 wo1Var = lja.Q;
            ho0 ho0Var = new ho0(8.0f, true, new sz6(1));
            fqb fqbVar = fqb.E;
            iqb iqbVarC = b.c(fqbVar, 1.0f);
            cxe cxeVarA = axe.a(ho0Var, wo1Var, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarC);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, cxeVarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            tjh.b(str, new hw9(1.0f, true), gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).h, e18Var, i2 & 14, 0, 131064);
            e18Var = e18Var;
            d(taskStatus, z, e18Var, (i2 >> 3) & 126);
            ef2 ef2Var = ef2.F;
            if (z4) {
                e18Var.a0(-421928698);
                iv1.b(ud0.C, null, null, ef2Var, gm3.a(e18Var).O, e18Var, 3120, 4);
                e18Var.p(false);
            } else if (z3) {
                e18Var.a0(-194642507);
                iv1.b(ud0.B, null, xn5.j0(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, ((Number) n80.b(z2 ? 180.0f : MTTypesetterKt.kLineSkipLimitMultiplier, null, "chevron", e18Var, 3072, 22).getValue()).floatValue(), null, false, 524031), ef2Var, gm3.a(e18Var).O, e18Var, 3120, 0);
                e18Var.p(false);
            } else {
                e18Var.a0(-194029079);
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(str, taskStatus, z, z2, z3, z4, i) { // from class: q6h
                public final /* synthetic */ String E;
                public final /* synthetic */ TaskStatus F;
                public final /* synthetic */ boolean G;
                public final /* synthetic */ boolean H;
                public final /* synthetic */ boolean I;
                public final /* synthetic */ boolean J;

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(1);
                    s6h.a(this.E, this.F, this.G, this.H, this.I, this.J, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    public static final void b(t6h t6hVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(241864989);
        int i2 = i | (e18Var.f(t6hVar) ? 4 : 2);
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            ho0 ho0Var = new ho0(12.0f, true, new sz6(1));
            wo1 wo1Var = lja.Q;
            fqb fqbVar = fqb.E;
            iqb iqbVarC = b.c(fqbVar, 1.0f);
            cxe cxeVarA = axe.a(ho0Var, wo1Var, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarC);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, cxeVarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            xo1 xo1Var = lja.K;
            iqb iqbVarP = yfd.p(b.o(fqbVar, 30.0f), gm3.a(e18Var).p, xve.a);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarP);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, o5bVarD);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            tjh.b(String.valueOf(t6hVar.a), null, gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).h, e18Var, 0, 0, 131066);
            e18Var.p(true);
            tjh.b(t6hVar.b, new hw9(1.0f, true), gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 0, 131064);
            e18Var = e18Var;
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new jsg(t6hVar, i, 3);
        }
    }

    public static final void c(final String str, final List list, final TaskStatus taskStatus, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final zy7 zy7Var, final zy7 zy7Var2, final iqb iqbVar, final zy7 zy7Var3, final pz7 pz7Var, ld4 ld4Var, final int i, final int i2) {
        String str2;
        int i3;
        boolean z6;
        int i4;
        str.getClass();
        list.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2126947785);
        if ((i & 6) == 0) {
            str2 = str;
            i3 = (e18Var.f(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? e18Var.f(list) : e18Var.h(list) ? 32 : 16;
        }
        int i5 = i & 384;
        int i6 = FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
        if (i5 == 0) {
            i3 |= e18Var.d(taskStatus == null ? -1 : taskStatus.ordinal()) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i3 |= e18Var.g(z) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i3 |= e18Var.g(z2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            z6 = z3;
            i3 |= e18Var.g(z6) ? 131072 : 65536;
        } else {
            z6 = z3;
        }
        if ((i & 1572864) == 0) {
            i3 |= e18Var.g(z4) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= e18Var.g(z5) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= e18Var.h(zy7Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= e18Var.h(zy7Var2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (e18Var.f(iqbVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= e18Var.h(zy7Var3) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if (!e18Var.h(pz7Var)) {
                i6 = FreeTypeConstants.FT_LOAD_PEDANTIC;
            }
            i4 |= i6;
        }
        if (e18Var.Q(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 147) == 146) ? false : true)) {
            Object[] objArr = new Object[0];
            boolean z7 = (57344 & i3) == 16384;
            Object objN = e18Var.N();
            if (z7 || objN == jd4.a) {
                objN = new cz2(z2, 5);
                e18Var.k0(objN);
            }
            final nwb nwbVar = (nwb) iuj.I(objArr, (zy7) objN, e18Var, 0);
            final boolean z8 = !z && taskStatus == TaskStatus.PROPOSED && (z2 || ((Boolean) nwbVar.getValue()).booleanValue());
            boolean z9 = (z || taskStatus != TaskStatus.PROPOSED || z2) ? false : true;
            e0g e0gVar = gm3.b(e18Var).h;
            final boolean z10 = z9;
            nc2 nc2VarG = rwj.g(gm3.a(e18Var).n, 0L, 0L, 0L, e18Var, 24576, 14);
            qu1 qu1VarA = sf5.a(0.5f, gm3.a(e18Var).v);
            rc2 rc2VarH = rwj.h(62);
            iqb iqbVarC = b.c(iqbVar, 1.0f);
            final String str3 = str2;
            final boolean z11 = z6;
            ta4 ta4VarQ0 = fd9.q0(-175432059, new rz7() { // from class: o6h
                @Override // defpackage.rz7
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    zy7 zy7Var4;
                    iqb iqbVar2;
                    iqb iqbVar3;
                    ld4 ld4Var2 = (ld4) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((s64) obj).getClass();
                    e18 e18Var2 = (e18) ld4Var2;
                    if (e18Var2.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        e18Var2.a0(-1086481344);
                        iqb iqbVarB = fqb.E;
                        zy7 zy7Var5 = zy7Var3;
                        boolean z12 = z10;
                        boolean z13 = z8;
                        if (zy7Var5 != null) {
                            e18Var2.a0(1398393037);
                            e18Var2.p(false);
                            zy7Var4 = zy7Var5;
                            iqbVar2 = iqbVarB;
                            iqbVarB = androidx.compose.foundation.b.c(iqbVarB, false, null, null, null, zy7Var5, 15);
                        } else {
                            zy7Var4 = zy7Var5;
                            if (z12) {
                                e18Var2.a0(1398399213);
                                nwb nwbVar2 = nwbVar;
                                boolean zF = e18Var2.f(nwbVar2);
                                Object objN2 = e18Var2.N();
                                lz1 lz1Var = jd4.a;
                                if (zF || objN2 == lz1Var) {
                                    objN2 = new lxf(14, nwbVar2);
                                    e18Var2.k0(objN2);
                                }
                                iqb iqbVarC2 = androidx.compose.foundation.b.c(iqbVarB, false, null, null, null, (zy7) objN2, 15);
                                iqbVar2 = iqbVarB;
                                boolean zG = e18Var2.g(z13) | e18Var2.f(nwbVar2);
                                Object objN3 = e18Var2.N();
                                if (zG || objN3 == lz1Var) {
                                    objN3 = new xu0(z13, nwbVar2, 8);
                                    e18Var2.k0(objN3);
                                }
                                iqbVarB = tjf.b(iqbVarC2, false, (bz7) objN3);
                                e18Var2.p(false);
                            } else {
                                iqbVar2 = iqbVarB;
                                e18Var2.a0(1398410221);
                                e18Var2.p(false);
                            }
                        }
                        e18Var2.p(false);
                        iqb iqbVarJ = gb9.J(gb9.i(iqbVarB, null, 3), 16.0f);
                        vo1 vo1Var = lja.S;
                        q64 q64VarA = p64.a(ko0.c, vo1Var, e18Var2, 0);
                        int iHashCode = Long.hashCode(e18Var2.T);
                        hyc hycVarL = e18Var2.l();
                        iqb iqbVarE = kxk.E(e18Var2, iqbVarJ);
                        dd4.e.getClass();
                        re4 re4Var = cd4.b;
                        e18Var2.e0();
                        if (e18Var2.S) {
                            e18Var2.k(re4Var);
                        } else {
                            e18Var2.n0();
                        }
                        z80 z80Var = cd4.f;
                        d4c.i0(e18Var2, z80Var, q64VarA);
                        z80 z80Var2 = cd4.e;
                        d4c.i0(e18Var2, z80Var2, hycVarL);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        z80 z80Var3 = cd4.g;
                        d4c.i0(e18Var2, z80Var3, numValueOf);
                        bx bxVar = cd4.h;
                        d4c.h0(e18Var2, bxVar);
                        z80 z80Var4 = cd4.d;
                        d4c.i0(e18Var2, z80Var4, iqbVarE);
                        s6h.a(str3, taskStatus, z, z13, z12, zy7Var4 != null, e18Var2, 0);
                        if (z13) {
                            e18Var2.a0(1025129768);
                            ho0 ho0Var = new ho0(8.0f, true, new sz6(1));
                            iqb iqbVar4 = iqbVar2;
                            iqb iqbVarN = gb9.N(iqbVar4, MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13);
                            q64 q64VarA2 = p64.a(ho0Var, vo1Var, e18Var2, 6);
                            int iHashCode2 = Long.hashCode(e18Var2.T);
                            hyc hycVarL2 = e18Var2.l();
                            iqb iqbVarE2 = kxk.E(e18Var2, iqbVarN);
                            e18Var2.e0();
                            if (e18Var2.S) {
                                e18Var2.k(re4Var);
                            } else {
                                e18Var2.n0();
                            }
                            d4c.i0(e18Var2, z80Var, q64VarA2);
                            d4c.i0(e18Var2, z80Var2, hycVarL2);
                            ij0.t(iHashCode2, e18Var2, z80Var3, e18Var2, bxVar);
                            d4c.i0(e18Var2, z80Var4, iqbVarE2);
                            e18Var2.a0(1488340715);
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                s6h.b((t6h) it.next(), e18Var2, 0);
                            }
                            boolean z14 = false;
                            e18Var2.p(false);
                            e18Var2.p(true);
                            if (z11) {
                                e18Var2.a0(1025450308);
                                pz7 pz7Var2 = pz7Var;
                                if (pz7Var2 == null) {
                                    e18Var2.a0(1025666904);
                                    e18Var2.p(false);
                                    iqbVar3 = iqbVar4;
                                } else {
                                    e18Var2.a0(1025666905);
                                    iqb iqbVarN2 = gb9.N(iqbVar4, MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13);
                                    iqbVar3 = iqbVar4;
                                    o5b o5bVarD = dw1.d(lja.G, false);
                                    int iHashCode3 = Long.hashCode(e18Var2.T);
                                    hyc hycVarL3 = e18Var2.l();
                                    iqb iqbVarE3 = kxk.E(e18Var2, iqbVarN2);
                                    dd4.e.getClass();
                                    re4 re4Var2 = cd4.b;
                                    e18Var2.e0();
                                    if (e18Var2.S) {
                                        e18Var2.k(re4Var2);
                                    } else {
                                        e18Var2.n0();
                                    }
                                    d4c.i0(e18Var2, cd4.f, o5bVarD);
                                    d4c.i0(e18Var2, cd4.e, hycVarL3);
                                    d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode3));
                                    d4c.h0(e18Var2, cd4.h);
                                    d4c.i0(e18Var2, cd4.d, iqbVarE3);
                                    vb7.z(0, pz7Var2, e18Var2, true, false);
                                }
                                String strJ0 = d4c.j0(R.string.task_propose_start_cta, e18Var2);
                                boolean z15 = z5;
                                iqb iqbVarN3 = gb9.N(b.c(iqbVar3, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13);
                                boolean z16 = z4;
                                e12 e12Var = e12.a;
                                x02 x02Var = x02.a;
                                dxj.a(strJ0, z16, iqbVarN3, !z15, null, e12Var, x02Var, 0L, zy7Var, e18Var2, 1769856, 144);
                                dxj.a(d4c.j0(R.string.task_propose_reject_cta, e18Var2), z15, gb9.N(b.c(iqbVar3, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), !z16, null, f12.a, x02Var, 0L, zy7Var2, e18Var2, 1769856, 144);
                                e18Var2 = e18Var2;
                                z14 = false;
                                e18Var2.p(false);
                            } else {
                                e18Var2.a0(1026848563);
                                e18Var2.p(false);
                            }
                            e18Var2.p(z14);
                        } else {
                            e18Var2.a0(1026862451);
                            e18Var2.p(false);
                        }
                        e18Var2.p(true);
                    } else {
                        e18Var2.T();
                    }
                    return iei.a;
                }
            }, e18Var);
            e18Var = e18Var;
            twj.b(iqbVarC, e0gVar, nc2VarG, rc2VarH, qu1VarA, ta4VarQ0, e18Var, 196608, 0);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: p6h
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(i | 1);
                    int iP02 = x44.p0(i2);
                    s6h.c(str, list, taskStatus, z, z2, z3, z4, z5, zy7Var, zy7Var2, iqbVar, zy7Var3, pz7Var, (ld4) obj, iP0, iP02);
                    return iei.a;
                }
            };
        }
    }

    public static final void d(final TaskStatus taskStatus, final boolean z, ld4 ld4Var, final int i) {
        int i2;
        final TaskStatus taskStatus2;
        final boolean z2;
        final int i3;
        m6h m6hVar;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-768312691);
        if ((i & 6) == 0) {
            i2 = (e18Var.d(taskStatus == null ? -1 : taskStatus.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.g(z) ? 32 : 16;
        }
        final int i4 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            if (z) {
                e18Var.a0(-922400298);
                m6hVar = new m6h(gm3.a(e18Var).q, gm3.a(e18Var).O, d4c.j0(R.string.task_status_deleted, e18Var), false);
                e18Var.p(false);
            } else {
                e18Var.a0(-922124956);
                switch (taskStatus != null ? r6h.a[taskStatus.ordinal()] : -1) {
                    case -1:
                        e18Var.a0(-922148113);
                        e18Var.p(false);
                        e18Var.p(false);
                        r7e r7eVarS = e18Var.s();
                        if (r7eVarS != null) {
                            r7eVarS.d = new pz7() { // from class: n6h
                                @Override // defpackage.pz7
                                public final Object invoke(Object obj, Object obj2) {
                                    int i5 = i4;
                                    iei ieiVar = iei.a;
                                    int i6 = i;
                                    boolean z3 = z;
                                    TaskStatus taskStatus3 = taskStatus;
                                    ld4 ld4Var2 = (ld4) obj;
                                    ((Integer) obj2).intValue();
                                    switch (i5) {
                                        case 0:
                                            s6h.d(taskStatus3, z3, ld4Var2, x44.p0(i6 | 1));
                                            break;
                                        default:
                                            s6h.d(taskStatus3, z3, ld4Var2, x44.p0(i6 | 1));
                                            break;
                                    }
                                    return ieiVar;
                                }
                            };
                            return;
                        }
                        return;
                    case 0:
                    default:
                        throw ebh.u(e18Var, 385896030, false);
                    case 1:
                        e18Var.a0(385896701);
                        m6hVar = new m6h(gm3.a(e18Var).q, gm3.a(e18Var).O, d4c.j0(R.string.task_status_proposed, e18Var), false);
                        e18Var.p(false);
                        break;
                    case 2:
                        e18Var.a0(385904371);
                        m6hVar = new m6h(gm3.a(e18Var).m, gm3.a(e18Var).l, d4c.j0(R.string.task_status_running, e18Var), true);
                        e18Var.p(false);
                        break;
                    case 3:
                        e18Var.a0(385913001);
                        m6hVar = new m6h(gm3.a(e18Var).A, gm3.a(e18Var).x, d4c.j0(R.string.task_status_needs_attention, e18Var), true);
                        e18Var.p(false);
                        break;
                    case 4:
                        e18Var.a0(385921019);
                        m6hVar = new m6h(gm3.a(e18Var).q, gm3.a(e18Var).O, d4c.j0(R.string.task_status_paused, e18Var), false);
                        e18Var.p(false);
                        break;
                    case 5:
                        e18Var.a0(385928710);
                        m6hVar = new m6h(gm3.a(e18Var).E, gm3.a(e18Var).D, d4c.j0(R.string.task_status_completed, e18Var), false);
                        e18Var.p(false);
                        break;
                    case 6:
                        e18Var.a0(385936641);
                        m6hVar = new m6h(gm3.a(e18Var).A, gm3.a(e18Var).z, d4c.j0(R.string.task_status_failed, e18Var), false);
                        e18Var.p(false);
                        break;
                    case 7:
                        e18Var.a0(385944477);
                        m6hVar = new m6h(gm3.a(e18Var).q, gm3.a(e18Var).O, d4c.j0(R.string.task_status_rejected, e18Var), false);
                        e18Var.p(false);
                        break;
                }
                e18Var.p(false);
            }
            wo1 wo1Var = lja.Q;
            ho0 ho0Var = new ho0(4.0f, true, new sz6(1));
            vve vveVar = xve.a;
            fqb fqbVar = fqb.E;
            iqb iqbVarV = xn5.V(fqbVar, vveVar);
            wo8 wo8Var = zni.b;
            iqb iqbVarK = gb9.K(yfd.p(iqbVarV, m6hVar.a, wo8Var), 10.0f, 4.0f);
            cxe cxeVarA = axe.a(ho0Var, wo1Var, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarK);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, cxeVarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            long j = m6hVar.b;
            if (m6hVar.d) {
                e18Var.a0(-1887959744);
                dw1.a(yfd.p(xn5.V(b.o(fqbVar, 6.0f), vveVar), j, wo8Var), e18Var, 0);
                e18Var.p(false);
            } else {
                e18Var.a0(-1887781959);
                e18Var.p(false);
            }
            i3 = 0;
            tjh.b(m6hVar.c, null, j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).k, e18Var, 0, 0, 131066);
            e18Var = e18Var;
            e18Var.p(true);
            taskStatus2 = taskStatus;
            z2 = z;
        } else {
            taskStatus2 = taskStatus;
            z2 = z;
            i3 = 0;
            e18Var.T();
        }
        r7e r7eVarS2 = e18Var.s();
        if (r7eVarS2 != null) {
            r7eVarS2.d = new pz7() { // from class: n6h
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i3;
                    iei ieiVar = iei.a;
                    int i6 = i;
                    boolean z3 = z2;
                    TaskStatus taskStatus3 = taskStatus2;
                    ld4 ld4Var2 = (ld4) obj;
                    ((Integer) obj2).intValue();
                    switch (i5) {
                        case 0:
                            s6h.d(taskStatus3, z3, ld4Var2, x44.p0(i6 | 1));
                            break;
                        default:
                            s6h.d(taskStatus3, z3, ld4Var2, x44.p0(i6 | 1));
                            break;
                    }
                    return ieiVar;
                }
            };
        }
    }
}
