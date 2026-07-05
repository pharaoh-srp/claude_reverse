package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.design.icon.a;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sc2 {
    public static final vve a = xve.b(10.0f);

    public static final void a(int i, long j, long j2, ud0 ud0Var, ld4 ld4Var, iqb iqbVar) {
        iqb iqbVar2;
        long j3;
        long jB;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-492724541);
        int i2 = i | (e18Var.f(ud0Var) ? 4 : 2) | 48 | (e18Var.e(j) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.f(null) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.e(j2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.g(false) ? 131072 : 65536);
        if (e18Var.Q(i2 & 1, (74899 & i2) != 74898)) {
            if (j != 16) {
                e18Var.a0(-1061873241);
                e18Var.p(false);
                j3 = j;
            } else {
                e18Var.a0(-1061872310);
                long j4 = gm3.a(e18Var).O;
                e18Var.p(false);
                j3 = j4;
            }
            if (j != 16) {
                e18Var.a0(-1061865258);
                e18Var.p(false);
                jB = d54.b(0.12f, j);
            } else {
                e18Var.a0(-1061863864);
                jB = gm3.a(e18Var).q;
                e18Var.p(false);
            }
            o5b o5bVarD = dw1.d(lja.G, false);
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
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, o5bVarD);
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
            iqb iqbVarP = yfd.p(b.o(fqbVar, 36.0f), jB, a);
            o5b o5bVarD2 = dw1.d(xo1Var, false);
            long j5 = j3;
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarP);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, o5bVarD2);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            e18Var.a0(934705521);
            ud0 ud0Var2 = ud0.d;
            cv8.b(a.a(ud0Var, e18Var), null, b.o(fqbVar, 24.0f), j5, e18Var, 440, 0);
            e18Var.p(false);
            e18Var.p(true);
            e18Var.a0(1335312741);
            e18Var.p(false);
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new qc1(i, j, j2, ud0Var, iqbVar2);
        }
    }
}
