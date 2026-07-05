package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public abstract class npf {
    static {
        xb0 xb0Var = new xb0();
        xb0Var.h("Open the PR via the ");
        int iK = xb0Var.k(new n6a("https://example.com/compare", (ekh) null, 6));
        try {
            int iM = xb0Var.m(new egg(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, qeh.c, null, 61439));
            try {
                xb0Var.h("compare link");
                xb0Var.j(iK);
                xb0Var.h(" — ");
                iM = xb0Var.m(new egg(0L, 0L, null, null, null, xt7.H, null, 0L, null, null, null, 0L, null, null, 65503));
                try {
                    xb0Var.h("gh");
                    xb0Var.j(iM);
                    xb0Var.h(" is unavailable so the branch is pushed but no PR exists yet.");
                    xb0Var.n();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            xb0Var.j(iK);
            throw th;
        }
    }

    public static final void a(String str, buf bufVar, boolean z, zy7 zy7Var, ta4 ta4Var, iqb iqbVar, String str2, zy7 zy7Var2, pz7 pz7Var, ld4 ld4Var, int i) {
        iqb iqbVar2;
        str.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-644876589);
        int i2 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.d(bufVar.ordinal()) ? 32 : 16) | (e18Var.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | 196608 | (e18Var.f(str2) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var.h(zy7Var2) ? 8388608 : 4194304) | (e18Var.h(pz7Var) ? 67108864 : 33554432);
        if (e18Var.Q(i2 & 1, (38347923 & i2) != 38347922)) {
            fqb fqbVar = fqb.E;
            ghk.a(zy7Var, fqbVar, zy7Var2, gm3.b(e18Var).j, 16.0f, 16.0f, 8.0f, pz7Var, fd9.q0(1674119660, new kj2(bufVar, z, ta4Var, str, str2), e18Var), e18Var, ((i2 >> 3) & 29360128) | ((i2 >> 9) & 14) | 102457392 | ((i2 >> 15) & 896), 0);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new g7(str, bufVar, z, zy7Var, ta4Var, iqbVar2, str2, zy7Var2, pz7Var, i);
        }
    }

    public static final void b(zb0 zb0Var, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        iqb iqbVar2;
        zb0Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(320492989);
        int i2 = i | (e18Var2.f(zb0Var) ? 4 : 2) | 48;
        if (e18Var2.Q(i2 & 1, (i2 & 19) != 18)) {
            tkh tkhVar = ((jm3) gm3.c(e18Var2).e.E).i;
            long j = gm3.a(e18Var2).M;
            fqb fqbVar = fqb.E;
            e18Var = e18Var2;
            tjh.c(zb0Var, gb9.J(b.c(fqbVar, 1.0f), 16.0f), j, 0L, 0L, null, 0L, 2, false, 3, 0, null, null, tkhVar, e18Var, i2 & 14, 24960, 241656);
            iqbVar2 = fqbVar;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ufe(zb0Var, iqbVar2, i, 3);
        }
    }

    public static final void c(String str, String str2, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        str.getClass();
        str2.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1209536246);
        int i2 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.f(str2) ? 32 : 16) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 3072;
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            fqb fqbVar = fqb.E;
            iqb iqbVarJ = gb9.J(b.c(fqbVar, 1.0f), 16.0f);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarJ);
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
            tjh.b(str, null, gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, i2 & 14, 0, 131066);
            kxk.g(e18Var, b.e(fqbVar, 4.0f));
            tjh.b(str2, null, gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, (tkh) ((wk) gm3.c(e18Var).e.F).i, e18Var, (i2 >> 3) & 14, 24960, 110586);
            e18Var = e18Var;
            dtj.a(gid.p(12.0f, R.string.ccr_session_approve_once, e18Var, e18Var, fqbVar), b.c(fqbVar, 1.0f), false, null, f12.a, y02.a, 0L, zy7Var, e18Var, ((i2 << 15) & 29360128) | 221232, 76);
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new eob(str, str2, zy7Var, iqbVar2, i, 1);
        }
    }

    public static final void d(String str, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-987727837);
        int i2 = i | (e18Var.f(str) ? 4 : 2) | 48;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            cxe cxeVarA = axe.a(new ho0(4.0f, true, new sz6(1)), lja.Q, e18Var, 54);
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
            cv8.b(a.a(ud0.R, e18Var), null, b.o(fqbVar, 14.0f), gm3.a(e18Var).O, e18Var, 440, 0);
            tjh.b(str, new hw9(1.0f, false), gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, i2 & 14, 24960, 110584);
            e18Var = e18Var;
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ip(str, iqbVar2, i, 17);
        }
    }

    public static final void e(boolean z, String str, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        long j;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(483474485);
        int i2 = i | (e18Var.g(z) ? 4 : 2) | (e18Var.f(str) ? 32 : 16) | 384;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            if (z) {
                e18Var.a0(762517439);
                j = gm3.a(e18Var).D;
            } else {
                e18Var.a0(762518556);
                j = gm3.a(e18Var).O;
            }
            e18Var.p(false);
            long j2 = j;
            cxe cxeVarA = axe.a(new ho0(4.0f, true, new sz6(1)), lja.Q, e18Var, 54);
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
            cv8.b(a.a(z ? ud0.W : ud0.V, e18Var), null, b.o(fqbVar, 14.0f), j2, e18Var, 440, 0);
            tjh.b(d4c.j0(z ? R.string.ccr_session_connected : R.string.ccr_session_disconnected, e18Var), null, j2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 24576, 114682);
            tjh.b("•", null, gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 6, 0, 131066);
            tjh.b(str, new hw9(1.0f, false), gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, (i2 >> 3) & 14, 24960, 110584);
            e18Var = e18Var;
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new iv(z, str, iqbVar2, i, 24);
        }
    }

    public static final void f(buf bufVar, boolean z, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-863053922);
        int i3 = i | (e18Var.d(bufVar.ordinal()) ? 4 : 2) | (e18Var.g(z) ? 32 : 16) | 384;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            int iOrdinal = bufVar.ordinal();
            if (iOrdinal == 0) {
                i2 = R.string.ccr_session_status_idle;
            } else if (iOrdinal == 1) {
                i2 = R.string.ccr_session_status_in_progress;
            } else if (iOrdinal == 2) {
                i2 = R.string.ccr_session_status_pr_draft;
            } else if (iOrdinal == 3) {
                i2 = R.string.ccr_session_status_pr_created;
            } else if (iOrdinal == 4) {
                i2 = R.string.ccr_session_status_pr_merged;
            } else {
                if (iOrdinal != 5) {
                    wg6.i();
                    return;
                }
                i2 = R.string.ccr_session_status_pr_closed;
            }
            String strJ0 = d4c.j0(i2, e18Var);
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
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            h(bufVar, strJ0, e18Var, i3 & 14);
            if (z) {
                e18Var.a0(1775253884);
                k(nw1.a.a(fqbVar, lja.I), e18Var, 0);
                e18Var.p(false);
            } else {
                e18Var.a0(1775328842);
                e18Var.p(false);
            }
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new iv(bufVar, z, iqbVar2, i, 26);
        }
    }

    public static final void g(final String str, final iyg iygVar, final boolean z, zy7 zy7Var, final zy7 zy7Var2, iqb iqbVar, final String str2, zy7 zy7Var3, final zb0 zb0Var, final pz7 pz7Var, ld4 ld4Var, int i) {
        iqb iqbVar2;
        str.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(825404400);
        int i2 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.d(iygVar.ordinal()) ? 32 : 16) | (e18Var.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.h(zy7Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | 196608 | (e18Var.f(str2) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var.h(zy7Var3) ? 8388608 : 4194304) | (e18Var.f(zb0Var) ? 67108864 : 33554432) | (e18Var.h(pz7Var) ? 536870912 : 268435456);
        if (e18Var.Q(i2 & 1, (306783379 & i2) != 306783378)) {
            fqb fqbVar = fqb.E;
            ghk.a(zy7Var, fqbVar, zy7Var3, gm3.b(e18Var).j, 16.0f, 16.0f, 8.0f, null, fd9.q0(-1173321015, new rz7() { // from class: mpf
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v16 */
                /* JADX WARN: Type inference failed for: r1v17, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r1v46 */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // defpackage.rz7
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ?? r1;
                    boolean z2;
                    dxe dxeVar = (dxe) obj;
                    ld4 ld4Var2 = (ld4) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    dxeVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((e18) ld4Var2).f(dxeVar) ? 4 : 2;
                    }
                    e18 e18Var2 = (e18) ld4Var2;
                    if (e18Var2.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        ho0 ho0Var = new ho0(16.0f, true, new sz6(1));
                        fqb fqbVar2 = fqb.E;
                        iqb iqbVarA = dxeVar.a(fqbVar2, 1.0f, true);
                        vo1 vo1Var = lja.S;
                        q64 q64VarA = p64.a(ho0Var, vo1Var, e18Var2, 6);
                        int iHashCode = Long.hashCode(e18Var2.T);
                        hyc hycVarL = e18Var2.l();
                        iqb iqbVarE = kxk.E(e18Var2, iqbVarA);
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
                        ho0 ho0Var2 = new ho0(8.0f, true, new sz6(1));
                        wo1 wo1Var = lja.Q;
                        cxe cxeVarA = axe.a(ho0Var2, wo1Var, e18Var2, 54);
                        int iHashCode2 = Long.hashCode(e18Var2.T);
                        hyc hycVarL2 = e18Var2.l();
                        iqb iqbVarE2 = kxk.E(e18Var2, fqbVar2);
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
                        iyg iygVar2 = iygVar;
                        npf.i(iygVar2, z, null, e18Var2, 0);
                        ho0 ho0Var3 = new ho0(2.0f, true, new sz6(1));
                        if (1.0f <= 0.0d) {
                            z29.a("invalid weight; must be greater than zero");
                        }
                        hw9 hw9Var = new hw9(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                        q64 q64VarA2 = p64.a(ho0Var3, vo1Var, e18Var2, 6);
                        int iHashCode3 = Long.hashCode(e18Var2.T);
                        hyc hycVarL3 = e18Var2.l();
                        iqb iqbVarE3 = kxk.E(e18Var2, hw9Var);
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
                        cxe cxeVarA2 = axe.a(new ho0(8.0f, true, new sz6(1)), wo1Var, e18Var2, 54);
                        int iHashCode4 = Long.hashCode(e18Var2.T);
                        hyc hycVarL4 = e18Var2.l();
                        iqb iqbVarE4 = kxk.E(e18Var2, fqbVar2);
                        e18Var2.e0();
                        if (e18Var2.S) {
                            e18Var2.k(re4Var);
                        } else {
                            e18Var2.n0();
                        }
                        d4c.i0(e18Var2, z80Var, cxeVarA2);
                        d4c.i0(e18Var2, z80Var2, hycVarL4);
                        ij0.t(iHashCode4, e18Var2, z80Var3, e18Var2, bxVar);
                        d4c.i0(e18Var2, z80Var4, iqbVarE4);
                        tkh tkhVar = ((jm3) gm3.c(e18Var2).e.E).g;
                        long j = gm3.a(e18Var2).M;
                        if (1.0f <= 0.0d) {
                            z29.a("invalid weight; must be greater than zero");
                        }
                        tjh.b(str, new hw9(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), j, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, tkhVar, e18Var2, 0, 24960, 110584);
                        String str3 = str2;
                        if (str3 != null) {
                            e18Var2.a0(-1894229960);
                            tjh.b(str3, null, gm3.a(e18Var2).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, 0, 24576, 114682);
                            r1 = 0;
                            e18Var2.p(false);
                        } else {
                            r1 = 0;
                            e18Var2.a0(-1893937971);
                            e18Var2.p(false);
                        }
                        e18Var2.p(true);
                        pz7 pz7Var2 = pz7Var;
                        if (pz7Var2 == null) {
                            e18Var2.a0(-1826633504);
                        } else {
                            e18Var2.a0(-1721491647);
                            pz7Var2.invoke(e18Var2, Integer.valueOf((int) r1));
                        }
                        e18Var2.p(r1);
                        e18Var2.p(true);
                        e18Var2.p(true);
                        if (iygVar2 == iyg.H) {
                            e18Var2.a0(957125539);
                            tjh.b(d4c.j0(R.string.session_card_working_on_it, e18Var2), b.c(fqbVar2, 1.0f), gm3.a(e18Var2).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, 48, 0, 131064);
                            z2 = false;
                            e18Var2.p(false);
                        } else {
                            zb0 zb0Var2 = zb0Var;
                            if (zb0Var2 == null || iygVar2 == iyg.I) {
                                z2 = false;
                                e18Var2.a0(957866191);
                                e18Var2.p(false);
                            } else {
                                e18Var2.a0(957516914);
                                tjh.c(zb0Var2, b.c(fqbVar2, 1.0f), gm3.a(e18Var2).O, 0L, 0L, null, 0L, 2, false, 3, 0, null, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, 48, 24960, 241656);
                                z2 = false;
                                e18Var2.p(false);
                            }
                        }
                        int iOrdinal = iygVar2.ordinal();
                        if (iOrdinal == 0 || iOrdinal == 1) {
                            e18Var2.a0(1832033943);
                            e18Var2.p(z2);
                            e18Var2.p(true);
                        } else if (iOrdinal != 2) {
                            if (iOrdinal != 3 && iOrdinal != 4) {
                                throw ebh.u(e18Var2, 1832015264, z2);
                            }
                            e18Var2.a0(1832033943);
                            e18Var2.p(z2);
                            e18Var2.p(true);
                        } else {
                            e18Var2.a0(957984084);
                            dtj.a(d4c.j0(R.string.ccr_session_approve_once, e18Var2), b.c(fqbVar2, 1.0f), false, null, e12.a, y02.a, 0L, zy7Var2, e18Var2, 221232, 76);
                            e18Var2.p(false);
                            e18Var2.p(true);
                        }
                    } else {
                        e18Var2.T();
                    }
                    return iei.a;
                }
            }, e18Var), e18Var, ((i2 >> 15) & 896) | ((i2 >> 9) & 14) | 102457392, FreeTypeConstants.FT_LOAD_PEDANTIC);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new il1(str, iygVar, z, zy7Var, zy7Var2, iqbVar2, str2, zy7Var3, zb0Var, pz7Var, i);
        }
    }

    public static final void h(buf bufVar, String str, ld4 ld4Var, int i) {
        int i2;
        long j;
        cpc cpcVar;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-116829959);
        if ((i & 6) == 0) {
            i2 = (e18Var.d(bufVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(str) ? 32 : 16;
        }
        boolean z = true;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            jl3 jl3VarA = gm3.a(e18Var);
            int iOrdinal = bufVar.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                j = jl3VarA.p;
            } else if (iOrdinal == 3) {
                j = jl3VarA.E;
            } else if (iOrdinal == 4) {
                j = jl3VarA.i;
            } else {
                if (iOrdinal != 5) {
                    wg6.i();
                    return;
                }
                j = jl3VarA.A;
            }
            xo1 xo1Var = lja.K;
            fqb fqbVar = fqb.E;
            iqb iqbVarP = yfd.p(b.o(fqbVar, 36.0f), j, gm3.b(e18Var).e);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarP);
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
            iqb iqbVarO = b.o(fqbVar, 20.0f);
            int iOrdinal2 = bufVar.ordinal();
            if (iOrdinal2 == 0) {
                e18Var.a0(1832499148);
                e18Var = e18Var;
                cv8.b(a.a(ud0.X0, e18Var), str, iqbVarO, jl3VarA.O, e18Var, (i2 & 112) | 392, 0);
                e18Var.p(false);
            } else if (iOrdinal2 == 1) {
                e18Var.a0(1832784658);
                long j2 = jl3VarA.O;
                boolean z2 = (i2 & 112) == 32;
                Object objN = e18Var.N();
                if (z2 || objN == jd4.a) {
                    objN = new cm5(str, 22);
                    e18Var.k0(objN);
                }
                tjd.a(tjf.b(iqbVarO, false, (bz7) objN), j2, 1.5f, 0L, 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, 384, 56);
                e18Var.p(false);
                z = true;
                e18Var = e18Var;
            } else {
                if (iOrdinal2 != 2 && iOrdinal2 != 3 && iOrdinal2 != 4 && iOrdinal2 != 5) {
                    throw ebh.u(e18Var, -1742003465, false);
                }
                e18Var.a0(1833177304);
                int iOrdinal3 = bufVar.ordinal();
                if (iOrdinal3 == 2) {
                    cpcVar = new cpc(ud0.b1, new d54(jl3VarA.O));
                } else if (iOrdinal3 == 3) {
                    cpcVar = new cpc(ud0.d1, new d54(jl3VarA.D));
                } else if (iOrdinal3 == 4) {
                    cpcVar = new cpc(ud0.c1, new d54(jl3VarA.g));
                } else {
                    if (iOrdinal3 != 5) {
                        wg6.i();
                        return;
                    }
                    cpcVar = new cpc(ud0.a1, new d54(jl3VarA.z));
                }
                cv8.b(a.a((ud0) cpcVar.E, e18Var), str, iqbVarO, ((d54) cpcVar.F).a, e18Var, (i2 & 112) | 392, 0);
                e18Var.p(false);
            }
            e18Var.p(z);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new qq(bufVar, str, i, 28);
        }
    }

    public static final void i(iyg iygVar, boolean z, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1651633693);
        int i2 = i | (e18Var.d(iygVar.ordinal()) ? 4 : 2) | (e18Var.g(z) ? 32 : 16) | 384;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
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
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            j(iygVar, null, e18Var, i2 & 14);
            if (z) {
                e18Var.a0(-295160175);
                k(nw1.a.a(fqbVar, lja.I), e18Var, 0);
                e18Var.p(false);
            } else {
                e18Var.a0(-295085217);
                e18Var.p(false);
            }
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new iv(iygVar, z, iqbVar2, i, 25);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(defpackage.iyg r15, defpackage.iqb r16, defpackage.ld4 r17, int r18) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.npf.j(iyg, iqb, ld4, int):void");
    }

    public static final void k(iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-149265891);
        int i2 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            String strJ0 = d4c.j0(R.string.ccr_session_unread, e18Var);
            iqb iqbVarO = b.o(sf5.M(iqbVar, 3.0f, -3.0f), 12.0f);
            long j = gm3.a(e18Var).n;
            vve vveVar = xve.a;
            iqb iqbVarP = yfd.p(gb9.J(yfd.p(iqbVarO, j, vveVar), 2.0f), gm3.a(e18Var).k, vveVar);
            boolean zF = e18Var.f(strJ0);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = new cm5(strJ0, 21);
                e18Var.k0(objN);
            }
            dw1.a(tjf.b(iqbVarP, false, (bz7) objN), e18Var, 0);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fl(i, 25, iqbVar);
        }
    }
}
