package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.conway.protocol.ConwayForkMeta;
import com.anthropic.claude.types.strings.ForkId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class aw4 {
    static {
        x44.X(new ConwayForkMeta(ForkId.m1022constructorimpl("fork_a"), "Q3 memo · devil's advocate", 1L, (Long) null, (String) null, (String) null, 56, (mq5) null), new ConwayForkMeta(ForkId.m1022constructorimpl("fork_b"), "Risks deep-dive", 2L, (Long) null, (String) null, (String) null, 56, (mq5) null));
    }

    public static final void a(dw4 dw4Var, zv4 zv4Var, boolean z, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        long jB;
        boolean z2;
        boolean z3;
        dw4Var.getClass();
        List list = dw4Var.a;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2007145891);
        int i2 = i | (e18Var.f(dw4Var) ? 4 : 2) | (e18Var.f(zv4Var) ? 32 : 16) | (e18Var.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        int i3 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            boolean zM1026isMainimpl = ForkId.m1026isMainimpl(dw4Var.b);
            boolean z4 = zM1026isMainimpl ? z : zv4Var != null && zv4Var.f;
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = zh4.a(1.0f);
                e18Var.k0(objN);
            }
            a80 a80Var = (a80) objN;
            Boolean boolValueOf = Boolean.valueOf(z4);
            boolean zG = e18Var.g(z4) | e18Var.h(a80Var);
            Object objN2 = e18Var.N();
            tp4 tp4Var = null;
            if (zG || objN2 == lz1Var) {
                objN2 = new mk1(z4, a80Var, tp4Var, i3);
                e18Var.k0(objN2);
            }
            fd9.i(e18Var, (pz7) objN2, boolValueOf);
            vve vveVarB = xve.b(20.0f);
            long j = gm3.a(e18Var).c;
            wo1 wo1Var = lja.Q;
            ho0 ho0Var = new ho0(8.0f, true, new sz6(1));
            iqb iqbVarV = xn5.V(b.g(iqbVar, 48.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), vveVarB);
            long j2 = gm3.a(e18Var).n;
            wo8 wo8Var = zni.b;
            iqb iqbVarP = yfd.p(iqbVarV, j2, wo8Var);
            fqb fqbVar = fqb.E;
            iqb iqbVarB = iqbVarP.B(zM1026isMainimpl ? fqbVar : yfd.p(fqbVar, d54.b(0.04f, j), wo8Var));
            if (zM1026isMainimpl) {
                e18Var.a0(-426829082);
                jB = gm3.a(e18Var).v;
                e18Var.p(false);
            } else {
                e18Var.a0(-426828368);
                e18Var.p(false);
                jB = d54.b(0.15f, j);
            }
            iqb iqbVarK = gb9.K(androidx.compose.foundation.b.c(ez1.t(iqbVarB, 0.5f, jB, vveVarB), false, d4c.j0(R.string.conway_forks_pill_open, e18Var), new vue(0), null, zy7Var, 9), 14.0f, 10.0f);
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
            ud0 ud0Var = zM1026isMainimpl ? ud0.n : ud0.C;
            boolean zH = e18Var.h(a80Var);
            Object objN3 = e18Var.N();
            if (zH || objN3 == lz1Var) {
                z2 = true;
                objN3 = new hk1(a80Var, 1);
                e18Var.k0(objN3);
            } else {
                z2 = true;
            }
            boolean z5 = z2;
            iv1.b(ud0Var, null, xn5.i0(fqbVar, (bz7) objN3), ef2.F, j, e18Var, 3120, 0);
            fxe fxeVar = fxe.a;
            if (zM1026isMainimpl) {
                e18Var.a0(-495193300);
                tjh.b(d4c.j0(R.string.conway_forks_pill_main_label, e18Var), null, gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).j, e18Var, 0, 0, 131066);
                tjh.b(d4c.f0(R.plurals.conway_forks_active_count, list.size(), new Object[]{Integer.valueOf(list.size())}, e18Var), null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 0, 131066);
                kxk.g(e18Var, fxeVar.a(fqbVar, 1.0f, z5));
                tjh.b(d4c.j0(R.string.conway_forks_tap_to_view, e18Var), null, gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 0, 131066);
                e18Var = e18Var;
                e18Var.p(false);
            } else {
                e18Var.a0(-494337483);
                String strN = zv4Var != null ? zv4Var.b : null;
                if (strN == null) {
                    strN = vb7.n(e18Var, -570129549, R.string.conway_fork_label_pending, e18Var, false);
                } else {
                    e18Var.a0(-570130169);
                    e18Var.p(false);
                }
                tjh.b(strN, fxeVar.a(fqbVar, 1.0f, false), j, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var).e.E).j, e18Var, 0, 24960, 110584);
                e18Var = e18Var;
                String str = zv4Var != null ? zv4Var.c : null;
                if (str == null) {
                    e18Var.a0(-493798673);
                    z3 = false;
                    e18Var.p(false);
                } else {
                    e18Var.a0(-493798672);
                    tjh.b(b(str, e18Var), fxeVar.a(fqbVar, 1.0f, false), d54.b(0.7f, j), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 24960, 110584);
                    e18Var = e18Var;
                    z3 = false;
                    e18Var.p(false);
                }
                e18Var.p(z3);
            }
            e18Var.p(z5);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bv(i, 4, dw4Var, zv4Var, zy7Var, iqbVar, z);
        }
    }

    public static final String b(String str, ld4 ld4Var) {
        str.getClass();
        if (str.equals("working")) {
            e18 e18Var = (e18) ld4Var;
            return vb7.n(e18Var, -1021085275, R.string.conway_fork_status_working, e18Var, false);
        }
        if (str.equals("error")) {
            e18 e18Var2 = (e18) ld4Var;
            return vb7.n(e18Var2, -1021082973, R.string.conway_fork_status_error, e18Var2, false);
        }
        e18 e18Var3 = (e18) ld4Var;
        e18Var3.a0(-1021081035);
        e18Var3.p(false);
        return str;
    }
}
