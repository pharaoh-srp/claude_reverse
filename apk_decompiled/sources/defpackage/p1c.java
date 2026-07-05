package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p1c {
    public static final List a = x44.X(0, 10, 25, 50, 75, 100);
    public static final List b = x44.X(0, 100, 500, 1000, 2000, 5000, Integer.valueOf(yr6.INVALID_OWNERSHIP));

    public static final void a(zy7 zy7Var, iqb iqbVar, fk0 fk0Var, ld4 ld4Var, int i) {
        e18 e18Var;
        iqb iqbVar2;
        fk0 fk0Var2;
        fk0 fk0Var3;
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-301569475);
        int i2 = 2;
        int i3 = i | (e18Var2.h(zy7Var) ? 4 : 2) | 176;
        if (e18Var2.Q(i3 & 1, (i3 & 147) != 146)) {
            e18Var2.V();
            if ((i & 1) == 0 || e18Var2.A()) {
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
                Object objN = e18Var2.N();
                if (zF || objN == jd4.a) {
                    objN = m7fVarN.a(jce.a.b(fk0.class), null, null);
                    e18Var2.k0(objN);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                fk0Var3 = (fk0) objN;
                iqbVar2 = fqb.E;
            } else {
                e18Var2.T();
                iqbVar2 = iqbVar;
                fk0Var3 = fk0Var;
            }
            e18Var2.q();
            e18Var = e18Var2;
            v40.b(iqbVar2, null, fd9.q0(386635648, new sxa(zy7Var, 7, (byte) 0), e18Var2), null, null, null, 0, 0L, 0L, null, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(-541868557, new s99(fk0Var3, i2), e18Var2), e18Var, 390, 2042);
            fk0Var2 = fk0Var3;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
            fk0Var2 = fk0Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ra7(zy7Var, iqbVar2, fk0Var2, i, 19);
        }
    }

    public static final void b(String str, int i, bz7 bz7Var, String str2, List list, String str3, iqb iqbVar, ld4 ld4Var, int i2) {
        int i3;
        e18 e18Var;
        iqb iqbVar2;
        e18 e18Var2;
        long j;
        e18 e18Var3;
        e18 e18Var4 = (e18) ld4Var;
        e18Var4.c0(423934746);
        if ((i2 & 48) == 0) {
            i3 = (e18Var4.d(i) ? 32 : 16) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 384) == 0) {
            i3 |= e18Var4.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i2 & 3072) == 0) {
            i3 |= e18Var4.f(str2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i2 & 24576) == 0) {
            i3 |= e18Var4.f(list) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        int i4 = i3 | 1572864;
        if (e18Var4.Q(i4 & 1, (599187 & i4) != 599186)) {
            Iterator it = list.iterator();
            int size = 0;
            while (true) {
                if (!it.hasNext()) {
                    size = -1;
                    break;
                } else if (((Number) it.next()).intValue() >= i) {
                    break;
                } else {
                    size++;
                }
            }
            if (size == -1) {
                size = list.size() - 1;
            }
            int i5 = size;
            fqb fqbVar = fqb.E;
            iqb iqbVarL = gb9.L(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 1);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var4, 0);
            int iHashCode = Long.hashCode(e18Var4.T);
            hyc hycVarL = e18Var4.l();
            iqb iqbVarE = kxk.E(e18Var4, iqbVarL);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var4.e0();
            if (e18Var4.S) {
                e18Var4.k(re4Var);
            } else {
                e18Var4.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var4, z80Var, q64VarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var4, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var4, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var4, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var4, z80Var4, iqbVarE);
            wo1 wo1Var = lja.Q;
            iqb iqbVarC = b.c(fqbVar, 1.0f);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var4, 48);
            int iHashCode2 = Long.hashCode(e18Var4.T);
            hyc hycVarL2 = e18Var4.l();
            iqb iqbVarE2 = kxk.E(e18Var4, iqbVarC);
            e18Var4.e0();
            if (e18Var4.S) {
                e18Var4.k(re4Var);
            } else {
                e18Var4.n0();
            }
            d4c.i0(e18Var4, z80Var, cxeVarA);
            d4c.i0(e18Var4, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var4, z80Var3, e18Var4, bxVar);
            tjh.b(str, kgh.n(e18Var4, iqbVarE2, z80Var4, 1.0f, true), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var4, 6, 0, 262140);
            tjh.b(str2, null, gm3.a(e18Var4).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var4).e.E).i, e18Var4, (i4 >> 9) & 14, 0, 131066);
            e18Var4.p(true);
            float f = i5;
            fq3 fq3Var = new fq3(MTTypesetterKt.kLineSkipLimitMultiplier, list.size() - 1);
            int size2 = list.size() - 2;
            aag aagVar = aag.a;
            long j2 = gm3.a(e18Var4).c;
            long j3 = gm3.a(e18Var4).v;
            long j4 = d54.h;
            v9g v9gVarF = aag.f(((gwa) e18Var4.j(jwa.a)).a);
            if (j4 != 16) {
                e18Var2 = e18Var4;
                j = j4;
            } else {
                e18Var2 = e18Var4;
                j = v9gVarF.a;
            }
            if (j2 == 16) {
                j2 = v9gVarF.b;
            }
            long j5 = j2;
            long j6 = j4 != 16 ? j4 : v9gVarF.c;
            if (j3 == 16) {
                j3 = v9gVarF.d;
            }
            v9g v9gVar = new v9g(j, j5, j6, j3, j4 != 16 ? j4 : v9gVarF.e, j4 != 16 ? j4 : v9gVarF.f, j4 != 16 ? j4 : v9gVarF.g, j4 != 16 ? j4 : v9gVarF.h, j4 != 16 ? j4 : v9gVarF.i, j4 != 16 ? j4 : v9gVarF.j);
            iqb iqbVarC2 = b.c(fqbVar, 1.0f);
            boolean z = ((i4 & 896) == 256) | ((i4 & 57344) == 16384);
            Object objN = e18Var2.N();
            if (z || objN == jd4.a) {
                objN = new bs4(bz7Var, list);
                e18Var3 = e18Var2;
                e18Var3.k0(objN);
            } else {
                e18Var3 = e18Var2;
            }
            e18 e18Var5 = e18Var3;
            lag.b(f, (bz7) objN, iqbVarC2, false, null, v9gVar, null, size2, bqk.b, null, fq3Var, e18Var5, 100663680, 0, 600);
            tjh.b(str3, null, gm3.a(e18Var5).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var5).e.E).i, e18Var5, 6, 0, 131066);
            e18Var = e18Var5;
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var = e18Var4;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xk1(str, i, bz7Var, str2, list, str3, iqbVar2, i2);
        }
    }
}
