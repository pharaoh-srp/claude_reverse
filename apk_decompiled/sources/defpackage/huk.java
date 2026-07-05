package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.tool.model.KnowledgeSource;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class huk {
    public static final ta4 a = new ta4(1997837288, false, new ya4(21));

    public static final void a(int i, ld4 ld4Var, zy7 zy7Var, boolean z) {
        int i2;
        boolean z2;
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1190058842);
        if ((i & 6) == 0) {
            i2 = (e18Var2.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.h(zy7Var) ? 32 : 16;
        }
        int i3 = 0;
        if (e18Var2.Q(i2 & 1, (i2 & 19) != 18)) {
            jl3 jl3VarA = gm3.a(e18Var2);
            boolean z3 = (i2 & 112) == 32;
            Object objN = e18Var2.N();
            if (z3 || objN == jd4.a) {
                objN = new kw0(i3, zy7Var);
                e18Var2.k0(objN);
            }
            z2 = z;
            ckk.a(z2, (bz7) objN, null, false, akk.d(jl3VarA.c, jl3VarA.v, jl3VarA.M, e18Var2, 56), e18Var2, i2 & 14, 44);
            e18Var = e18Var2;
        } else {
            z2 = z;
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lw0(z2, zy7Var, i, i3);
        }
    }

    public static final void b(final ru0 ru0Var, final int i, final int i2, final boolean z, bz7 bz7Var, final boolean z2, final boolean z3, final String str, final bz7 bz7Var2, final zy7 zy7Var, final bz7 bz7Var3, final zy7 zy7Var2, final zy7 zy7Var3, final iqb iqbVar, ld4 ld4Var, final int i3, final int i4) {
        bz7 bz7Var4;
        e18 e18Var;
        fqb fqbVar;
        int i5;
        boolean z4;
        int i6;
        int i7;
        long j;
        ArrayList arrayList;
        long jB;
        wo1 wo1Var = lja.P;
        ArrayList arrayList2 = ru0Var.c;
        bz7Var.getClass();
        bz7Var2.getClass();
        zy7Var.getClass();
        bz7Var3.getClass();
        zy7Var2.getClass();
        zy7Var3.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(833712497);
        int i8 = i3 | (e18Var2.h(ru0Var) ? 4 : 2) | (e18Var2.d(i) ? 32 : 16);
        boolean zD = e18Var2.d(i2);
        int i9 = FreeTypeConstants.FT_LOAD_PEDANTIC;
        int i10 = i8 | (zD ? 256 : 128);
        boolean zG = e18Var2.g(z);
        int i11 = FreeTypeConstants.FT_LOAD_NO_RECURSE;
        int i12 = i10 | (zG ? 2048 : 1024) | (e18Var2.h(bz7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var2.g(z2) ? 131072 : 65536) | (e18Var2.g(z3) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var2.f(str) ? 8388608 : 4194304) | (e18Var2.h(bz7Var2) ? 67108864 : 33554432) | (e18Var2.h(zy7Var) ? 536870912 : 268435456);
        int i13 = (i4 & 6) == 0 ? i4 | (e18Var2.h(bz7Var3) ? 4 : 2) : i4;
        if ((i4 & 48) == 0) {
            i13 |= e18Var2.h(zy7Var2) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            if (e18Var2.h(zy7Var3)) {
                i9 = 256;
            }
            i13 |= i9;
        }
        if ((i4 & 3072) == 0) {
            if (e18Var2.f(iqbVar)) {
                i11 = 2048;
            }
            i13 |= i11;
        }
        int i14 = i13;
        if (e18Var2.Q(i12 & 1, ((i12 & 306783379) == 306783378 && (i14 & 1171) == 1170) ? false : true)) {
            jl3 jl3VarA = gm3.a(e18Var2);
            jm3 jm3Var = (jm3) gm3.c(e18Var2).e.E;
            iqb iqbVarV = xn5.V(b.c(iqbVar, 1.0f), xve.b(12.0f));
            long j2 = jl3VarA.v;
            long j3 = jl3VarA.v;
            iqb iqbVarJ = gb9.J(ez1.t(iqbVarV, 1.0f, j2, xve.b(12.0f)), 12.0f);
            ho0 ho0Var = new ho0(12.0f, true, new sz6(1));
            vo1 vo1Var = lja.S;
            q64 q64VarA = p64.a(ho0Var, vo1Var, e18Var2, 6);
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
            long j4 = j3;
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var2, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var2, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var2, z80Var4, iqbVarE);
            fqb fqbVar2 = fqb.E;
            ArrayList arrayList3 = arrayList2;
            iqb iqbVarC = b.c(fqbVar2, 1.0f);
            cxe cxeVarA = axe.a(ko0.g, wo1Var, e18Var2, 54);
            int iHashCode2 = Long.hashCode(e18Var2.T);
            hyc hycVarL2 = e18Var2.l();
            iqb iqbVarE2 = kxk.E(e18Var2, iqbVarC);
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, z80Var, cxeVarA);
            d4c.i0(e18Var2, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var2, z80Var3, e18Var2, bxVar);
            d4c.i0(e18Var2, z80Var4, iqbVarE2);
            tjh.b(ru0Var.a, new hw9(1.0f, true), jl3VarA.M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jm3Var.e, e18Var2, 0, 0, 131064);
            if (i2 > 1) {
                e18Var2.a0(1690891378);
                fqbVar = fqbVar2;
                tjh.b(d4c.k0(R.string.ccr_ask_question_progress, new Object[]{Integer.valueOf(i + 1), Integer.valueOf(i2)}, e18Var2), gb9.N(fqbVar2, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 14), jl3VarA.O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jm3Var.i, e18Var2, 48, 0, 131064);
                i5 = 0;
                e18Var2.p(false);
            } else {
                fqbVar = fqbVar2;
                i5 = 0;
                e18Var2.a0(1691279095);
                e18Var2.p(false);
            }
            e18Var2.p(true);
            iqb iqbVarC2 = b.c(fqbVar, 1.0f);
            q64 q64VarA2 = p64.a(ko0.c, vo1Var, e18Var2, i5);
            fqb fqbVar3 = fqbVar;
            int iHashCode3 = Long.hashCode(e18Var2.T);
            hyc hycVarL3 = e18Var2.l();
            iqb iqbVarE3 = kxk.E(e18Var2, iqbVarC2);
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, z80Var, q64VarA2);
            d4c.i0(e18Var2, z80Var2, hycVarL3);
            ij0.t(iHashCode3, e18Var2, z80Var3, e18Var2, bxVar);
            d4c.i0(e18Var2, z80Var4, iqbVarE3);
            e18Var2.a0(-1342230609);
            int i15 = 0;
            for (Object obj : arrayList3) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    x44.n0();
                    throw null;
                }
                su0 su0Var = (su0) obj;
                boolean zBooleanValue = ((Boolean) bz7Var.invoke(su0Var.a)).booleanValue();
                if (i15 > 0) {
                    e18Var2.a0(209003086);
                    arrayList = arrayList3;
                    boolean zBooleanValue2 = ((Boolean) bz7Var.invoke(((su0) arrayList.get(i15 - 1)).a)).booleanValue();
                    if (zBooleanValue || zBooleanValue2) {
                        j = j4;
                        jB = d54.b(MTTypesetterKt.kLineSkipLimitMultiplier, j);
                    } else {
                        j = j4;
                        jB = j;
                    }
                    iuj.e(null, MTTypesetterKt.kLineSkipLimitMultiplier, jB, e18Var2, 0, 3);
                    e18Var2.p(false);
                } else {
                    j = j4;
                    arrayList = arrayList3;
                    e18Var2.a0(209283698);
                    e18Var2.p(false);
                }
                boolean z5 = ru0Var.d;
                boolean zF = e18Var2.f(su0Var) | ((i12 & 234881024) == 67108864);
                Object objN = e18Var2.N();
                if (zF || objN == jd4.a) {
                    arrayList3 = arrayList;
                    objN = new k6(bz7Var2, 19, su0Var);
                    e18Var2.k0(objN);
                } else {
                    arrayList3 = arrayList;
                }
                c(su0Var, zBooleanValue, z5, (zy7) objN, null, e18Var2, 0);
                i15 = i16;
                j4 = j;
            }
            bz7Var4 = bz7Var;
            long jB2 = j4;
            e18Var2.p(false);
            su0 su0Var2 = (su0) w44.V0(arrayList3);
            if ((su0Var2 != null ? ((Boolean) bz7Var4.invoke(su0Var2.a)).booleanValue() : false) || z2) {
                jB2 = d54.b(MTTypesetterKt.kLineSkipLimitMultiplier, jB2);
            }
            iuj.e(null, MTTypesetterKt.kLineSkipLimitMultiplier, jB2, e18Var2, 0, 3);
            int i17 = i12 >> 15;
            d((i17 & 910) | ((i14 << 9) & 7168) | (i17 & 57344), e18Var2, zy7Var, bz7Var3, null, str, z2, ru0Var.d);
            e18Var2.p(true);
            iqb iqbVarC3 = b.c(fqbVar3, 1.0f);
            cxe cxeVarA2 = axe.a(new ho0(12.0f, true, new sz6(1)), wo1Var, e18Var2, 6);
            int iHashCode4 = Long.hashCode(e18Var2.T);
            hyc hycVarL4 = e18Var2.l();
            iqb iqbVarE4 = kxk.E(e18Var2, iqbVarC3);
            dd4.e.getClass();
            re4 re4Var2 = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var2);
            } else {
                e18Var2.n0();
            }
            z80 z80Var5 = cd4.f;
            d4c.i0(e18Var2, z80Var5, cxeVarA2);
            z80 z80Var6 = cd4.e;
            d4c.i0(e18Var2, z80Var6, hycVarL4);
            Integer numValueOf2 = Integer.valueOf(iHashCode4);
            z80 z80Var7 = cd4.g;
            d4c.i0(e18Var2, z80Var7, numValueOf2);
            bx bxVar2 = cd4.h;
            d4c.h0(e18Var2, bxVar2);
            z80 z80Var8 = cd4.d;
            d4c.i0(e18Var2, z80Var8, iqbVarE4);
            if (1.0f <= 0.0d) {
                z29.a("invalid weight; must be greater than zero");
            }
            hw9 hw9Var = new hw9(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode5 = Long.hashCode(e18Var2.T);
            hyc hycVarL5 = e18Var2.l();
            iqb iqbVarE5 = kxk.E(e18Var2, hw9Var);
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var2);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, z80Var5, o5bVarD);
            d4c.i0(e18Var2, z80Var6, hycVarL5);
            ij0.t(iHashCode5, e18Var2, z80Var7, e18Var2, bxVar2);
            d4c.i0(e18Var2, z80Var8, iqbVarE5);
            if (i > 0) {
                e18Var2.a0(-989454841);
                dtj.a(d4c.j0(R.string.ccr_ask_question_previous, e18Var2), b.c(fqbVar3, 1.0f), false, null, new c12(new mw0(0, jl3VarA)), null, 0L, zy7Var2, e18Var2, 48 | ((i14 << 18) & 29360128), 108);
                z4 = false;
                e18Var2.p(false);
            } else {
                z4 = false;
                e18Var2.a0(-989141958);
                e18Var2.p(false);
            }
            e18Var2.p(true);
            if (!z3) {
                i6 = -2017811958;
                i7 = R.string.ccr_ask_question_skip;
            } else if (z) {
                i6 = -2017700792;
                i7 = R.string.ccr_ask_question_submit;
            } else {
                i6 = -2017607606;
                i7 = R.string.ccr_ask_question_next;
            }
            String strN = vb7.n(e18Var2, i6, i7, e18Var2, z4);
            h12 h12Var = z3 ? e12.a : f12.a;
            if (1.0f <= 0.0d) {
                z29.a("invalid weight; must be greater than zero");
            }
            dtj.a(strN, new hw9(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, null, h12Var, null, 0L, zy7Var3, e18Var2, (i14 << 15) & 29360128, 108);
            e18Var = e18Var2;
            e18Var.p(true);
            e18Var.p(true);
        } else {
            bz7Var4 = bz7Var;
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final bz7 bz7Var5 = bz7Var4;
            r7eVarS.d = new pz7(i, i2, z, bz7Var5, z2, z3, str, bz7Var2, zy7Var, bz7Var3, zy7Var2, zy7Var3, iqbVar, i3, i4) { // from class: hw0
                public final /* synthetic */ int F;
                public final /* synthetic */ int G;
                public final /* synthetic */ boolean H;
                public final /* synthetic */ bz7 I;
                public final /* synthetic */ boolean J;
                public final /* synthetic */ boolean K;
                public final /* synthetic */ String L;
                public final /* synthetic */ bz7 M;
                public final /* synthetic */ zy7 N;
                public final /* synthetic */ bz7 O;
                public final /* synthetic */ zy7 P;
                public final /* synthetic */ zy7 Q;
                public final /* synthetic */ iqb R;
                public final /* synthetic */ int S;

                {
                    this.S = i4;
                }

                @Override // defpackage.pz7
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP0 = x44.p0(9);
                    int iP02 = x44.p0(this.S);
                    huk.b(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, (ld4) obj2, iP0, iP02);
                    return iei.a;
                }
            };
        }
    }

    public static final void c(su0 su0Var, boolean z, boolean z2, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        iqb iqbVar2;
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-273633083);
        int i2 = i | (e18Var2.f(su0Var) ? 4 : 2) | (e18Var2.g(z) ? 32 : 16) | (e18Var2.g(z2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | 24576;
        if (e18Var2.Q(i2 & 1, (i2 & 9363) != 9362)) {
            jl3 jl3VarA = gm3.a(e18Var2);
            jm3 jm3Var = (jm3) gm3.c(e18Var2).e.E;
            fqb fqbVar = fqb.E;
            iqb iqbVarK = gb9.K(gb9.L(androidx.compose.foundation.b.c(b.c(fqbVar, 1.0f), false, null, null, null, zy7Var, 15), MTTypesetterKt.kLineSkipLimitMultiplier, 2.0f, 1).B(z ? yfd.p(fqbVar, jl3VarA.p, xve.b(12.0f)) : fqbVar), 12.0f, 10.0f);
            cxe cxeVarA = axe.a(new ho0(12.0f, true, new sz6(1)), lja.Q, e18Var2, 54);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarK);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var2, z80Var, cxeVarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var2, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var2, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var2, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var2, z80Var4, iqbVarE);
            if (z2) {
                e18Var2.a0(1984153122);
                a(((i2 >> 3) & 14) | ((i2 >> 6) & 112), e18Var2, zy7Var, z);
                e18Var2.p(false);
            } else {
                e18Var2.a0(1984236729);
                e18Var2.p(false);
            }
            hw9 hw9Var = new hw9(1.0f, true);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var2, 0);
            int iHashCode2 = Long.hashCode(e18Var2.T);
            hyc hycVarL2 = e18Var2.l();
            iqb iqbVarE2 = kxk.E(e18Var2, hw9Var);
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, z80Var, q64VarA);
            d4c.i0(e18Var2, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var2, z80Var3, e18Var2, bxVar);
            d4c.i0(e18Var2, z80Var4, iqbVarE2);
            tjh.b(su0Var.a, null, z ? jl3VarA.M : jl3VarA.N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jm3Var.g, e18Var2, 0, 0, 131066);
            e18Var = e18Var2;
            String str = su0Var.b;
            if (str == null) {
                e18Var.a0(-334674528);
                e18Var.p(false);
            } else {
                e18Var.a0(-334674527);
                tjh.b(str, gb9.N(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 4.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), z ? jl3VarA.M : jl3VarA.O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jm3Var.i, e18Var, 48, 0, 131064);
                e18Var = e18Var;
                e18Var.p(false);
            }
            e18Var.p(true);
            if (!z || z2) {
                e18Var.a0(1984916249);
                e18Var.p(false);
            } else {
                e18Var.a0(1984869160);
                e(0, e18Var);
                e18Var.p(false);
            }
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new iw0(su0Var, z, z2, zy7Var, iqbVar2, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final void d(int i, ld4 ld4Var, zy7 zy7Var, bz7 bz7Var, iqb iqbVar, String str, boolean z, boolean z2) {
        int i2;
        iqb iqbVar2;
        e18 e18Var;
        ?? r4;
        bz7Var.getClass();
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-539071478);
        if ((i & 6) == 0) {
            i2 = (e18Var2.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.g(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.f(str) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.h(bz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.h(zy7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        int i3 = i2 | 196608;
        if (e18Var2.Q(i3 & 1, (74899 & i3) != 74898)) {
            jl3 jl3VarA = gm3.a(e18Var2);
            jm3 jm3Var = (jm3) gm3.c(e18Var2).e.E;
            Object objN = e18Var2.N();
            Object obj = jd4.a;
            if (objN == obj) {
                objN = ij0.d(e18Var2);
            }
            bt7 bt7Var = (bt7) objN;
            Boolean boolValueOf = Boolean.valueOf(z);
            int i4 = i3 & 14;
            boolean z3 = i4 == 4;
            Object objN2 = e18Var2.N();
            if (z3 || objN2 == obj) {
                objN2 = new nw0(z, bt7Var, (tp4) null, 0);
                e18Var2.k0(objN2);
            }
            fd9.i(e18Var2, (pz7) objN2, boolValueOf);
            fqb fqbVar = fqb.E;
            iqb iqbVarK = gb9.K(gb9.K(androidx.compose.foundation.b.c(b.c(fqbVar, 1.0f), false, null, null, null, zy7Var, 15), 4.0f, 2.0f).B(z ? yfd.p(fqbVar, jl3VarA.p, xve.b(8.0f)) : fqbVar), 8.0f, 10.0f);
            cxe cxeVarA = axe.a(new ho0(12.0f, true, new sz6(1)), lja.Q, e18Var2, 54);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarK);
            dd4.e.getClass();
            zy7 zy7Var2 = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(zy7Var2);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, cd4.f, cxeVarA);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            if (z2) {
                e18Var2.a0(-262905923);
                a(((i3 >> 9) & 112) | i4, e18Var2, zy7Var, z);
                r4 = 0;
                e18Var2.p(false);
            } else {
                r4 = 0;
                e18Var2.a0(-262822316);
                e18Var2.p(false);
            }
            iqbVar2 = fqbVar;
            bg1.c(str, bz7Var, iv1.s(new hw9(1.0f, true), bt7Var), z, false, tkh.b(jm3Var.g, jl3VarA.M, 0L, null, null, null, 0L, null, 0, 0L, null, 0, 16777214), null, null, false, 0, 0, null, null, null, new eeg(jl3VarA.M), fd9.q0(2004200747, new ye(str, jm3Var, jl3VarA, 7), e18Var2), e18Var2, ((i3 >> 6) & 126) | ((i3 << 9) & 7168), 16336);
            e18 e18Var3 = e18Var2;
            if (!z || z2) {
                e18Var3.a0(-261917612);
                e18Var3.p(r4);
            } else {
                e18Var3.a0(-261964701);
                e(r4, e18Var3);
                e18Var3.p(r4);
            }
            e18Var3.p(true);
            e18Var = e18Var3;
        } else {
            e18 e18Var4 = e18Var2;
            e18Var4.T();
            iqbVar2 = iqbVar;
            e18Var = e18Var4;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new jw0(z, z2, str, bz7Var, zy7Var, iqbVar2, i);
        }
    }

    public static final void e(int i, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1801557911);
        if (e18Var.Q(i & 1, i != 0)) {
            cv8.b(a.a(ud0.L, e18Var), null, b.o(fqb.E, 20.0f), gm3.a(e18Var).c, e18Var, 440, 0);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new te(i, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v2 */
    public static final void f(ArrayList arrayList, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        vo1 vo1Var = lja.S;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1212209865);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? e18Var2.f(arrayList) : e18Var2.h(arrayList) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.f(iqbVar) ? 32 : 16;
        }
        boolean z = 1;
        if (e18Var2.Q(i2 & 1, (i2 & 19) != 18)) {
            jl3 jl3VarA = gm3.a(e18Var2);
            jm3 jm3Var = (jm3) gm3.c(e18Var2).e.E;
            iqb iqbVarJ = gb9.J(yfd.p(xn5.V(b.c(iqbVar, 1.0f), xve.b(12.0f)), jl3VarA.q, zni.b), 16.0f);
            int i3 = 6;
            q64 q64VarA = p64.a(new ho0(12.0f, true, new sz6(1)), vo1Var, e18Var2, 6);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarJ);
            dd4.e.getClass();
            zy7 zy7Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(zy7Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, cd4.f, q64VarA);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            e18Var2.a0(-1798349198);
            Iterator it = arrayList.iterator();
            e18 e18Var3 = e18Var2;
            while (it.hasNext()) {
                qu0 qu0Var = (qu0) it.next();
                q64 q64VarA2 = p64.a(new ho0(4.0f, z, new sz6(z)), vo1Var, e18Var3, i3);
                int iHashCode2 = Long.hashCode(e18Var3.T);
                hyc hycVarL2 = e18Var3.l();
                iqb iqbVarE2 = kxk.E(e18Var3, fqb.E);
                dd4.e.getClass();
                zy7 zy7Var2 = cd4.b;
                e18Var3.e0();
                if (e18Var3.S) {
                    e18Var3.k(zy7Var2);
                } else {
                    e18Var3.n0();
                }
                d4c.i0(e18Var3, cd4.f, q64VarA2);
                d4c.i0(e18Var3, cd4.e, hycVarL2);
                d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode2));
                d4c.h0(e18Var3, cd4.h);
                d4c.i0(e18Var3, cd4.d, iqbVarE2);
                e18 e18Var4 = e18Var3;
                jm3 jm3Var2 = jm3Var;
                jl3 jl3Var = jl3VarA;
                boolean z2 = z;
                tjh.b(qu0Var.a, null, jl3VarA.N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jm3Var.i, e18Var4, 0, 0, 131066);
                tjh.b(qu0Var.b, null, jl3Var.M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jm3Var2.i, e18Var4, 0, 0, 131066);
                e18Var4.p(z2);
                jm3Var = jm3Var2;
                e18Var3 = e18Var4;
                z = z2 ? 1 : 0;
                jl3VarA = jl3Var;
                i3 = i3;
                vo1Var = vo1Var;
            }
            e18 e18Var5 = e18Var3;
            e18Var5.p(false);
            e18Var5.p(z);
            e18Var = e18Var5;
        } else {
            e18 e18Var6 = e18Var2;
            e18Var6.T();
            e18Var = e18Var6;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new qq(arrayList, iqbVar, i, 3);
        }
    }

    public static final void g(ud0 ud0Var, String str, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1286113960);
        int i2 = i | (e18Var.f(ud0Var) ? 4 : 2) | (e18Var.f(str) ? 32 : 16);
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            cxe cxeVarA = axe.a(new ho0(16.0f, true, new sz6(1)), lja.Q, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            fqb fqbVar = fqb.E;
            iqb iqbVarE = kxk.E(e18Var, fqbVar);
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
            ud0 ud0Var2 = ud0.d;
            cv8.b(a.a(ud0Var, e18Var), null, b.o(fqbVar, 24.0f), gm3.a(e18Var).N, e18Var, 440, 0);
            tjh.b(str, new hw9(1.0f, true), gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, (i2 >> 3) & 14, 0, 131064);
            e18Var = e18Var;
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v55(i, ud0Var, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(defpackage.zy7 r21, defpackage.iqb r22, defpackage.ml3 r23, defpackage.qi3 r24, defpackage.ld4 r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.huk.h(zy7, iqb, ml3, qi3, ld4, int, int):void");
    }

    public static final void i(KnowledgeSource knowledgeSource, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar, ld4 ld4Var, int i) {
        knowledgeSource.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(89741906);
        int i2 = (e18Var.f(knowledgeSource) ? 4 : 2) | i | (e18Var.h(zy7Var) ? 32 : 16) | (e18Var.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            q64 q64VarA = p64.a(new ho0(16.0f, true, new sz6(1)), lja.T, e18Var, 54);
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
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            tkh tkhVar = ((jm3) gm3.c(e18Var).e.E).h;
            qnc qncVarB = gb9.b(MTTypesetterKt.kLineSkipLimitMultiplier, 6.0f, 1);
            fqb fqbVar = fqb.E;
            int i3 = i2;
            etj.e(knowledgeSource, b.c(fqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 0L, tkhVar, 2, null, null, 5, qncVarB, e18Var, (i2 & 14) | 906166320, 204);
            e18Var = e18Var;
            dtj.a(d4c.j0(R.string.copy_link, e18Var), b.c(fqbVar, 1.0f), false, null, f12.a, null, 0L, zy7Var, e18Var, ((i3 << 18) & 29360128) | 24624, 108);
            dtj.a(d4c.j0(R.string.visit_link, e18Var), b.c(fqbVar, 1.0f), false, null, null, null, 0L, zy7Var2, e18Var, ((i3 << 15) & 29360128) | 48, 124);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new p3h(i, 3, zy7Var2, iqbVar, knowledgeSource, zy7Var);
        }
    }

    public static final Collection k(Collection collection, Collection collection2) {
        collection2.getClass();
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final pbg m(ArrayList arrayList) {
        pbg pbgVar = new pbg();
        for (Object obj : arrayList) {
            fab fabVar = (fab) obj;
            if (fabVar != null && fabVar != eab.b) {
                pbgVar.add(obj);
            }
        }
        return pbgVar;
    }

    public abstract void j(e92 e92Var);

    public abstract void l(e92 e92Var, e92 e92Var2);

    public void n(e92 e92Var, e92 e92Var2) {
        l(e92Var, e92Var2);
    }

    public void o(e92 e92Var, Collection collection) {
        e92Var.getClass();
        e92Var.d0(collection);
    }
}
