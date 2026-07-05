package defpackage;

import android.R;
import android.content.ClipDescription;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.io.IOException;
import java.text.NumberFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vok {
    public static final ta4 a = new ta4(1886245054, false, new tb4(5));
    public static final ta4 b = new ta4(826552578, false, new tb4(6));
    public static final ta4 c = new ta4(201878601, false, new sb4(23));

    public static final void a(iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1302501069);
        if (e18Var.Q(i & 1, (i & 3) != 2)) {
            q64 q64VarA = p64.a(new ho0(12.0f, true, new sz6(1)), lja.S, e18Var, 6);
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
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new oob(19);
                e18Var.k0(objN);
            }
            ghk.a((zy7) objN, null, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, iik.j, e18Var, 100663302, 254);
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new oob(19);
                e18Var.k0(objN2);
            }
            ghk.a((zy7) objN2, null, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, iik.k, iik.l, e18Var, 113246214, 126);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fl(i, 11, iqbVar);
        }
    }

    public static final void b(iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1797118410);
        int i2 = i | 6;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            olh.a(false, null, null, fd9.q0(-191608589, new m14(6), e18Var), e18Var, 3072, 7);
            iqbVar = fqb.E;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fl(i, 9, iqbVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    public static final void c(iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        fqb fqbVar;
        wo1 wo1Var = lja.Q;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1582556246);
        boolean z = false;
        ?? r13 = 1;
        if (e18Var2.Q(i & 1, (i & 3) != 2)) {
            float f = 12.0f;
            q64 q64VarA = p64.a(new ho0(12.0f, true, new sz6(1)), lja.S, e18Var2, 6);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVar);
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
            e18Var2.a0(1048176574);
            Iterator<E> it = ef2.J.iterator();
            e18 e18Var3 = e18Var2;
            while (true) {
                boolean zHasNext = it.hasNext();
                fqbVar = fqb.E;
                if (!zHasNext) {
                    break;
                }
                ef2 ef2Var = (ef2) it.next();
                cxe cxeVarA = axe.a(new ho0(f, r13, new sz6(r13)), wo1Var, e18Var3, 54);
                int iHashCode2 = Long.hashCode(e18Var3.T);
                hyc hycVarL2 = e18Var3.l();
                iqb iqbVarE2 = kxk.E(e18Var3, fqbVar);
                dd4.e.getClass();
                zy7 zy7Var2 = cd4.b;
                e18Var3.e0();
                if (e18Var3.S) {
                    e18Var3.k(zy7Var2);
                } else {
                    e18Var3.n0();
                }
                d4c.i0(e18Var3, cd4.f, cxeVarA);
                d4c.i0(e18Var3, cd4.e, hycVarL2);
                d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode2));
                d4c.h0(e18Var3, cd4.h);
                d4c.i0(e18Var3, cd4.d, iqbVarE2);
                e18Var3.a0(1591860236);
                for (ud0 ud0Var : x44.X(ud0.k1, ud0.n1, ud0.r1, ud0.v0)) {
                    ud0 ud0Var2 = ud0.d;
                    iv1.b(ud0Var, null, null, ef2Var, 0L, e18Var3, 48, 20);
                }
                e18Var3.p(z);
                e18 e18Var4 = e18Var3;
                boolean z2 = r13;
                tjh.b(ef2Var.name() + " (" + ((int) ef2Var.E) + "dp)", null, gm3.a(e18Var3).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var3).e.E).i, e18Var4, 0, 0, 131066);
                e18 e18Var5 = e18Var4;
                e18Var5.p(z2);
                r13 = z2 ? 1 : 0;
                f = f;
                z = false;
                e18Var3 = e18Var5;
            }
            boolean z3 = r13;
            e18Var3.p(z);
            cxe cxeVarA2 = axe.a(new ho0(f, z3, new sz6(z3 ? 1 : 0)), wo1Var, e18Var3, 54);
            int iHashCode3 = Long.hashCode(e18Var3.T);
            hyc hycVarL3 = e18Var3.l();
            iqb iqbVarE3 = kxk.E(e18Var3, fqbVar);
            dd4.e.getClass();
            zy7 zy7Var3 = cd4.b;
            e18Var3.e0();
            if (e18Var3.S) {
                e18Var3.k(zy7Var3);
            } else {
                e18Var3.n0();
            }
            d4c.i0(e18Var3, cd4.f, cxeVarA2);
            d4c.i0(e18Var3, cd4.e, hycVarL3);
            d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode3));
            d4c.h0(e18Var3, cd4.h);
            d4c.i0(e18Var3, cd4.d, iqbVarE3);
            iv1.b(ud0.r1, null, null, null, gm3.a(e18Var3).c, e18Var3, 48, 12);
            e18 e18Var6 = e18Var3;
            tjh.b("Custom tint", null, gm3.a(e18Var3).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var3).e.E).i, e18Var6, 6, 0, 131066);
            e18 e18Var7 = e18Var6;
            e18Var7.p(z3);
            e18Var7.p(z3);
            e18Var = e18Var7;
        } else {
            e18Var2.T();
            e18Var = e18Var2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fl(i, 10, iqbVar);
        }
    }

    public static final void d(iqb iqbVar, ld4 ld4Var, int i) {
        wo1 wo1Var = lja.Q;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(809703203);
        if (e18Var.Q(i & 1, (i & 3) != 2)) {
            q64 q64VarA = p64.a(new ho0(16.0f, true, new sz6(1)), lja.S, e18Var, 6);
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
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, q64VarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            cxe cxeVarA = axe.a(new ho0(16.0f, true, new sz6(1)), wo1Var, e18Var, 54);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            fqb fqbVar = fqb.E;
            iqb iqbVarE2 = kxk.E(e18Var, fqbVar);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, cxeVarA);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            e18Var.a0(-1782522057);
            Iterator<E> it = vf2.L.iterator();
            while (it.hasNext()) {
                e18 e18Var2 = e18Var;
                ez1.a(null, (vf2) it.next(), 0L, e18Var2, 0, 5);
                e18Var = e18Var2;
            }
            e18Var.p(false);
            e18Var.p(true);
            cxe cxeVarA2 = axe.a(new ho0(16.0f, true, new sz6(1)), wo1Var, e18Var, 54);
            int iHashCode3 = Long.hashCode(e18Var.T);
            hyc hycVarL3 = e18Var.l();
            iqb iqbVarE3 = kxk.E(e18Var, fqbVar);
            dd4.e.getClass();
            re4 re4Var2 = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var2);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, cxeVarA2);
            d4c.i0(e18Var, cd4.e, hycVarL3);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode3));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE3);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new wt3(29);
                e18Var.k0(objN);
            }
            ez1.b((zy7) objN, null, null, 0L, e18Var, 6);
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new wt3(27);
                e18Var.k0(objN2);
            }
            ez1.b((zy7) objN2, null, null, 0L, e18Var, 6);
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = new wt3(28);
                e18Var.k0(objN3);
            }
            ez1.b((zy7) objN3, null, null, 0L, e18Var, 6);
            e18Var.p(true);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fl(i, 6, iqbVar);
        }
    }

    public static final void e(iqb iqbVar, ld4 ld4Var, int i) throws IOException {
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1413495355);
        int i2 = 1;
        if (e18Var.Q(i & 1, (i & 3) != 2)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = vb7.g(0, e18Var);
            }
            isc iscVar = (isc) objN;
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = vb7.g(0, e18Var);
            }
            isc iscVar2 = (isc) objN2;
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = new gl3(iscVar, iscVar2, null, i2);
                e18Var.k0(objN3);
            }
            fd9.i(e18Var, (pz7) objN3, iei.a);
            boolean zD = e18Var.d(iscVar.h()) | e18Var.d(iscVar2.h());
            Object objN4 = e18Var.N();
            if (zD || objN4 == lz1Var) {
                objN4 = (iscVar.h() / 4) + "s · " + NumberFormat.getIntegerInstance().format(iscVar2.h()) + " tokens";
                e18Var.k0(objN4);
            }
            iqbVar2 = iqbVar;
            thk.a((String) objN4, iqbVar2, null, ((jm3) gm3.c(e18Var).e.E).i, gm3.a(e18Var).N, e18Var, 48);
        } else {
            iqbVar2 = iqbVar;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fl(i, 8, iqbVar2);
        }
    }

    public static final void f(iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-759556330);
        if (e18Var.Q(i & 1, (i & 3) != 2)) {
            View view = (View) e18Var.j(w00.f);
            cxe cxeVarA = axe.a(new ho0(8.0f, true, new sz6(1)), lja.Q, e18Var, 54);
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
            d4c.i0(e18Var, cd4.f, cxeVarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            boolean zH = e18Var.h(view);
            Object objN = e18Var.N();
            if (zH || objN == jd4.a) {
                objN = new o74(view, 0);
                e18Var.k0(objN);
            }
            uhk.b((zy7) ((jm9) objN), null, null, null, iik.i, e18Var, 24576, 14);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fl(i, 14, iqbVar);
        }
    }

    public static final void g(iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2004974678);
        int i2 = i | 6;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            qnc qncVar = qf2.a;
            ho0 ho0Var = new ho0(12.0f, true, new sz6(1));
            fqb fqbVar = fqb.E;
            iqb iqbVarL = gb9.L(yfd.p(b.c(fqbVar, 1.0f), gm3.a(e18Var).o, zni.b), MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, 1);
            vo1 vo1Var = lja.S;
            q64 q64VarA = p64.a(ho0Var, vo1Var, e18Var, 0);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarL);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, q64VarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            q64 q64VarA2 = p64.a(ko0.c, vo1Var, e18Var, 0);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, fqbVar);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, q64VarA2);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            yhk.b(6, 2, e18Var, null, "Heading");
            yhk.a(null, iik.g, e18Var, 48);
            e18Var.p(true);
            yhk.a(null, iik.h, e18Var, 48);
            e18Var.p(true);
            iqbVar = fqbVar;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fl(i, 7, iqbVar);
        }
    }

    public static final void h(iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1565718190);
        if (e18Var.Q(i & 1, (i & 3) != 2)) {
            View view = (View) e18Var.j(w00.f);
            q64 q64VarA = p64.a(new ho0(4.0f, true, new sz6(1)), lja.S, e18Var, 6);
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
            boolean zH = e18Var.h(view);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zH || objN == lz1Var) {
                objN = new o74(view, 1);
                e18Var.k0(objN);
            }
            lnk.d((zy7) ((jm9) objN), null, false, null, null, null, null, iik.b, e18Var, 805306368, 510);
            boolean zH2 = e18Var.h(view);
            Object objN2 = e18Var.N();
            if (zH2 || objN2 == lz1Var) {
                objN2 = new o74(view, 2);
                e18Var.k0(objN2);
            }
            lnk.d((zy7) ((jm9) objN2), null, false, null, null, null, ((jm3) gm3.c(e18Var).e.E).c, iik.c, e18Var, 805306368, 254);
            boolean zH3 = e18Var.h(view);
            Object objN3 = e18Var.N();
            if (zH3 || objN3 == lz1Var) {
                objN3 = new o74(view, 3);
                e18Var.k0(objN3);
            }
            lnk.d((zy7) ((jm9) objN3), null, false, null, null, null, ((jm3) gm3.c(e18Var).e.E).e, iik.d, e18Var, 805306752, 250);
            boolean zH4 = e18Var.h(view);
            Object objN4 = e18Var.N();
            if (zH4 || objN4 == lz1Var) {
                objN4 = new o74(view, 4);
                e18Var.k0(objN4);
            }
            lnk.b((zy7) ((jm9) objN4), true, null, false, null, null, null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, iik.e, e18Var, 48, 4092);
            e18Var = e18Var;
            boolean zH5 = e18Var.h(view);
            Object objN5 = e18Var.N();
            if (zH5 || objN5 == lz1Var) {
                objN5 = new o74(view, 5);
                e18Var.k0(objN5);
            }
            lnk.d((zy7) ((jm9) objN5), null, false, null, null, null, null, iik.f, e18Var, 805306368, 510);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fl(i, 13, iqbVar);
        }
    }

    public static final void i(iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(349658748);
        if (e18Var.Q(i & 1, (i & 3) != 2)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P(Boolean.FALSE);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            boolean zBooleanValue = ((Boolean) nwbVar.getValue()).booleanValue();
            ta4 ta4VarQ0 = fd9.q0(-1477317091, new jj2(3, nwbVar), e18Var);
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new dy2(21, nwbVar);
                e18Var.k0(objN2);
            }
            iqbVar2 = iqbVar;
            bik.a(zBooleanValue, ta4VarQ0, iik.m, (zy7) objN2, iqbVar2, 0L, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, 28080, 480);
        } else {
            iqbVar2 = iqbVar;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fl(i, 12, iqbVar2);
        }
    }

    public static final iqb j(iqb iqbVar, zhh zhhVar, l45 l45Var) {
        return uwj.b(iqbVar, new ufe(zhhVar, 24, l45Var));
    }

    public static boolean k(y7e y7eVar, aqh aqhVar) {
        Instant instant;
        y7eVar.getClass();
        if (y7eVar instanceof ys1) {
            ys1 ys1Var = (ys1) y7eVar;
            return msk.f(ys1Var.a, aqhVar, ys1Var.b);
        }
        if (y7eVar instanceof qac) {
            if (((qac) y7eVar).L != null && p((sa9) y7eVar, aqhVar) > 0.0d) {
                return true;
            }
        } else {
            if (!(y7eVar instanceof jof)) {
                sz6.k("Unsupported record type for aggregation fallback: ", (String) i9e.a.get(jce.a.b(y7eVar.getClass())));
                return false;
            }
            jof jofVar = (jof) y7eVar;
            List listD = jofVar.d();
            if (!(listD instanceof Collection) || !listD.isEmpty()) {
                Iterator it = listD.iterator();
                do {
                    if (it.hasNext()) {
                        Object next = it.next();
                        next.getClass();
                        if (next instanceof se5) {
                            instant = ((se5) next).a;
                        } else if (next instanceof cig) {
                            instant = ((cig) next).a;
                        } else if (next instanceof lng) {
                            instant = ((lng) next).a;
                        } else {
                            sz6.j(ij0.B("Unsupported type for time: ", next));
                        }
                    }
                } while (!msk.f(instant, aqhVar, jofVar.g()));
                return true;
            }
        }
        return false;
    }

    public static hoe l(qh9 qh9Var) {
        try {
            return new hoe(qh9Var.s("duration").k(), qh9Var.s("start").k());
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Connect", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Connect", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Connect", e3);
            return null;
        }
    }

    public static double m(Object obj) {
        obj.getClass();
        if (obj instanceof se5) {
            return ((se5) obj).b;
        }
        if (obj instanceof cig) {
            return ((cig) obj).b.a();
        }
        if (obj instanceof lng) {
            return ((lng) obj).b;
        }
        sz6.j(ij0.B("Unsupported type for value: ", obj));
        return 0.0d;
    }

    public static final Boolean n(zhh zhhVar) {
        ClipDescription primaryClipDescription;
        op3 op3Var = zhhVar.h;
        boolean z = false;
        if (op3Var != null && (primaryClipDescription = ((mz) op3Var).a.a().getPrimaryClipDescription()) != null && primaryClipDescription.hasMimeType("text/*")) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final boolean o(zhh zhhVar, boolean z) {
        cu9 cu9VarC;
        m2a m2aVar = zhhVar.d;
        if (m2aVar == null || (cu9VarC = m2aVar.c()) == null) {
            return false;
        }
        return u00.j(zhhVar.r(z), u00.R(cu9VarC));
    }

    public static double p(sa9 sa9Var, aqh aqhVar) {
        Instant instantH;
        Instant instantH2;
        sa9Var.getClass();
        aqhVar.getClass();
        boolean z = aqhVar instanceof h69;
        if (z) {
            instantH = ((h69) aqhVar).a;
        } else {
            if (!(aqhVar instanceof cea)) {
                wg6.i();
                return 0.0d;
            }
            instantH = msk.h(((cea) aqhVar).a, sa9Var.g());
        }
        if (z) {
            instantH2 = ((h69) aqhVar).b;
        } else {
            if (!(aqhVar instanceof cea)) {
                wg6.i();
                return 0.0d;
            }
            instantH2 = msk.h(((cea) aqhVar).b, sa9Var.f());
        }
        Instant instant = (Instant) nai.V(sa9Var.e(), instantH2);
        Instant instantB = sa9Var.b();
        instantB.getClass();
        if (instantB.compareTo(instantH) >= 0) {
            instantH = instantB;
        }
        Duration.between(instantH, instant).getClass();
        Instant instantE = sa9Var.e();
        Instant instantB2 = sa9Var.b();
        instantE.getClass();
        instantB2.getClass();
        Duration.between(instantB2, instantE).getClass();
        return Math.max(0.0d, r6.toMillis() / r5.toMillis());
    }

    public static final iqb q(zhh zhhVar) {
        boolean zA = ipa.a();
        fqb fqbVar = fqb.E;
        return !zA ? fqbVar : kxk.p(fqbVar, new lca(17, zhhVar));
    }

    public static int r(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static jqj s(jqj jqjVar, c61 c61Var, osj osjVar, Boolean bool, Boolean bool2) {
        jqj jqjVar2 = new jqj();
        Iterator itW = jqjVar.w();
        while (itW.hasNext()) {
            int iIntValue = ((Integer) itW.next()).intValue();
            if (jqjVar.v(iIntValue)) {
                lsj lsjVarC = osjVar.c(c61Var, Arrays.asList(jqjVar.p(iIntValue), new yqj(Double.valueOf(iIntValue)), jqjVar));
                if (lsjVarC.k().equals(bool)) {
                    break;
                }
                if (bool2 == null || lsjVarC.k().equals(bool2)) {
                    jqjVar2.u(iIntValue, lsjVarC);
                }
            }
        }
        return jqjVar2;
    }

    public static lsj t(jqj jqjVar, c61 c61Var, ArrayList arrayList, boolean z) {
        lsj lsjVarC;
        gqk.r(arrayList, 1, "reduce");
        gqk.u(2, "reduce", arrayList);
        lsj lsjVarN = ((mvd) c61Var.G).n(c61Var, (lsj) arrayList.get(0));
        if (!(lsjVarN instanceof nrj)) {
            sz6.p("Callback should be a method");
            return null;
        }
        if (arrayList.size() == 2) {
            lsjVarC = ((mvd) c61Var.G).n(c61Var, (lsj) arrayList.get(1));
            if (lsjVarC instanceof drj) {
                sz6.p("Failed to parse initial value");
                return null;
            }
        } else {
            if (jqjVar.r() == 0) {
                sz6.j("Empty array with no initial value error");
                return null;
            }
            lsjVarC = null;
        }
        nrj nrjVar = (nrj) lsjVarN;
        int iR = jqjVar.r();
        int i = z ? 0 : iR - 1;
        int i2 = z ? iR - 1 : 0;
        int i3 = z ? 1 : -1;
        if (lsjVarC == null) {
            lsjVarC = jqjVar.p(i);
            i += i3;
        }
        while ((i2 - i) * i3 >= 0) {
            if (jqjVar.v(i)) {
                lsjVarC = nrjVar.c(c61Var, Arrays.asList(lsjVarC, jqjVar.p(i), new yqj(Double.valueOf(i)), jqjVar));
                if (lsjVarC instanceof drj) {
                    sz6.j("Reduce operation failed");
                    return null;
                }
                i += i3;
            } else {
                i += i3;
            }
        }
        return lsjVarC;
    }
}
