package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.project.ProjectKnowledgeStats;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.project.create.UploadMaterialsScreenParams;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qik {
    public static final ta4 a = new ta4(396019918, false, new jb4(3));
    public static final qlk b = new qlk("id");
    public static final qlk c = new qlk("type");

    public static final void a(lod lodVar, ld4 ld4Var, int i) {
        boolean z;
        lz1 lz1Var;
        boolean z2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-679892081);
        int i2 = (e18Var.f(lodVar) ? 4 : 2) | i;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            boolean z3 = (i2 & 14) == 4;
            Object objN = e18Var.N();
            lz1 lz1Var2 = jd4.a;
            if (z3 || objN == lz1Var2) {
                bo boVar = new bo(2, lodVar, lod.class, "uploadProjectKnowledge", "uploadProjectKnowledge(Ljava/util/List;Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectFileSource;)V", 0, 22);
                e18Var.k0(boVar);
                objN = boVar;
            }
            r7i r7iVarF = itj.f((pz7) ((jm9) objN), lodVar.q.k, e18Var);
            ti7 ti7Var = (ti7) r7iVarF.E;
            l4h l4hVar = (l4h) r7iVarF.F;
            q2d q2dVar = (q2d) r7iVarF.G;
            boolean zEquals = dbj.a(e18Var).a.a().equals(rbj.b);
            fqb fqbVar = fqb.E;
            iqb iqbVarC = b.c(fqbVar, 1.0f);
            cxe cxeVarA = axe.a(new ho0(8.0f, true, new sz6(1)), lja.Q, e18Var, 54);
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
            boolean z4 = (((Boolean) lodVar.p.getValue()).booleanValue() || ((Boolean) lodVar.n.getValue()).booleanValue()) ? false : true;
            long jA = zEquals ? e21.b : za6.a(e21.b, MTTypesetterKt.kLineSkipLimitMultiplier, 60.0f, 1);
            boolean zBooleanValue = ((Boolean) lodVar.g.getValue()).booleanValue();
            fxe fxeVar = fxe.a;
            if (zBooleanValue) {
                e18Var.a0(1978947642);
                if (l4hVar != null) {
                    e18Var.a0(1978996126);
                    bpc bpcVarA = a.a(ud0.A, e18Var);
                    String strJ0 = d4c.j0(R.string.upload_camera_button, e18Var);
                    iqb iqbVarA = fxeVar.a(fqbVar, 1.0f, true);
                    boolean zH = e18Var.h(l4hVar);
                    Object objN2 = e18Var.N();
                    if (zH || objN2 == lz1Var2) {
                        objN2 = new ge(l4hVar, 1);
                        e18Var.k0(objN2);
                    }
                    lz1Var = lz1Var2;
                    z = true;
                    z2 = false;
                    xuk.a(bpcVarA, strJ0, z4, (zy7) objN2, iqbVarA, null, null, jA, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, 8, 352);
                    e18Var = e18Var;
                    e18Var.p(false);
                } else {
                    z = true;
                    lz1Var = lz1Var2;
                    z2 = false;
                    e18Var.a0(1979372311);
                    e18Var.p(false);
                }
                bpc bpcVarA2 = a.a(ud0.B0, e18Var);
                String strJ02 = d4c.j0(R.string.upload_photos_button, e18Var);
                iqb iqbVarA2 = fxeVar.a(fqbVar, 1.0f, z);
                boolean zH2 = e18Var.h(q2dVar);
                Object objN3 = e18Var.N();
                if (zH2 || objN3 == lz1Var) {
                    objN3 = new pza(15, q2dVar);
                    e18Var.k0(objN3);
                }
                e18 e18Var2 = e18Var;
                xuk.a(bpcVarA2, strJ02, z4, (zy7) objN3, iqbVarA2, null, null, jA, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var2, 8, 352);
                e18Var = e18Var2;
                e18Var.p(z2);
            } else {
                z = true;
                lz1Var = lz1Var2;
                e18Var.a0(1979744311);
                e18Var.p(false);
            }
            bpc bpcVarA3 = a.a(ud0.n0, e18Var);
            String strJ03 = d4c.j0(R.string.upload_file_button, e18Var);
            iqb iqbVarA3 = fxeVar.a(fqbVar, 1.0f, z);
            boolean zF = e18Var.f(ti7Var);
            Object objN4 = e18Var.N();
            if (zF || objN4 == lz1Var) {
                objN4 = new ie(ti7Var, 3);
                e18Var.k0(objN4);
            }
            e18 e18Var3 = e18Var;
            xuk.a(bpcVarA3, strJ03, z4, (zy7) objN4, iqbVarA3, null, null, jA, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var3, 8, 352);
            e18Var = e18Var3;
            e18Var.p(z);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pod(lodVar, i);
        }
    }

    public static final void b(znd zndVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1341444047);
        int i2 = (e18Var.h(zndVar) ? 4 : 2) | i;
        int i3 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, fqb.E);
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
            wp6 wp6VarE = gp6.e(null, 3);
            s64 s64Var = s64.a;
            wd6.H(s64Var, true, null, wp6VarE, null, null, ksk.a, e18Var, 1575990, 26);
            wp6 wp6VarE2 = gp6.e(null, 3);
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = new f7d(15);
                e18Var.k0(objN);
            }
            wd6.H(s64Var, true, null, wp6VarE2.a(gp6.n(1, (bz7) objN)), null, null, fd9.q0(-1620026164, new z85(zndVar, i3), e18Var), e18Var, 1575990, 26);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ood(zndVar, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    public static final void c(lod lodVar, znd zndVar, ld4 ld4Var, int i) {
        fqb fqbVar;
        ?? r12;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(488951760);
        int i2 = i | (e18Var.f(lodVar) ? 4 : 2) | (e18Var.h(zndVar) ? 32 : 16);
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            fqb fqbVar2 = fqb.E;
            iqb iqbVarE = kxk.E(e18Var, fqbVar2);
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
            ProjectKnowledgeStats projectKnowledgeStats = (ProjectKnowledgeStats) lodVar.m.getValue();
            if (projectKnowledgeStats != null) {
                e18Var.a0(1926664159);
                fqbVar = fqbVar2;
                wd6.H(s64.a, true, null, null, null, null, fd9.q0(788022087, new nw7(projectKnowledgeStats, 28, lodVar), e18Var), e18Var, 1572918, 30);
                e18Var.p(false);
            } else {
                fqbVar = fqbVar2;
                e18Var.a0(1927195592);
                e18Var.p(false);
            }
            fqb fqbVar3 = fqbVar;
            tjh.b(zndVar.d.b, gb9.N(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 7), gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).h, e18Var, 48, 0, 131064);
            e18Var = e18Var;
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (z || objN == lz1Var) {
                r12 = 1;
                objN = new jod(lodVar, 1);
                e18Var.k0(objN);
            } else {
                r12 = 1;
            }
            bz7 bz7Var = (bz7) objN;
            ?? r14 = i3 == 4 ? r12 : 0;
            Object objN2 = e18Var.N();
            if (r14 != 0 || objN2 == lz1Var) {
                byte b2 = 0;
                objN2 = new pod(lodVar, b2, b2);
                e18Var.k0(objN2);
            }
            pz7 pz7Var = (pz7) objN2;
            ?? r142 = i3 == 4 ? r12 : 0;
            Object objN3 = e18Var.N();
            if (r142 != 0 || objN3 == lz1Var) {
                objN3 = new pod(lodVar, r12, (byte) 0);
                e18Var.k0(objN3);
            }
            eve.c(true, bz7Var, pz7Var, null, (pz7) objN3, null, fd9.q0(-1433045852, new qod(lodVar, zndVar), e18Var), e18Var, 1575942);
            grc.z(fqbVar3, 24.0f, e18Var, r12);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new qod(lodVar, zndVar, i);
        }
    }

    public static final void d(lod lodVar, boolean z, znd zndVar, boolean z2, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1037170333);
        int i2 = 2;
        int i3 = (e18Var.f(lodVar) ? 4 : 2) | i | (e18Var.g(z) ? 32 : 16) | (e18Var.h(zndVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.g(z2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            xn5.G(Boolean.valueOf(z2), null, null, null, null, null, fd9.q0(-1099207386, new sy3(lodVar, zndVar, z, i2), e18Var), e18Var, ((i3 >> 9) & 14) | 1572864, 62);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new q32(lodVar, z, zndVar, z2, i);
        }
    }

    public static final void e(int i, int i2, ld4 ld4Var, String str) {
        str.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1055103241);
        int i3 = i2 | (e18Var.f(str) ? 4 : 2) | (e18Var.d(i) ? 32 : 16);
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            wo1 wo1Var = lja.Q;
            fqb fqbVar = fqb.E;
            iqb iqbVarC = b.c(fqbVar, 1.0f);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var, 48);
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
            xn5.N(u00.D(2131231385, 0, e18Var), null, b.o(fqbVar, 32.0f), null, null, MTTypesetterKt.kLineSkipLimitMultiplier, null, e18Var, 440, 120);
            kxk.g(e18Var, b.t(fqbVar, 12.0f));
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, fqbVar);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, q64VarA);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            tjh.b(str, fqbVar, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, (i3 & 14) | 48, 0, 131068);
            kxk.g(e18Var, b.e(fqbVar, 4.0f));
            tjh.b(d4c.f0(R.plurals.project_details_knowledge_file_count, i, new Object[]{Integer.valueOf(i)}, e18Var), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 0, 131070);
            e18Var = e18Var;
            e18Var.p(true);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lp1(str, i, i2);
        }
    }

    public static final void f(int i, ld4 ld4Var, zy7 zy7Var, iqb iqbVar, String str) {
        str.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1949233182);
        int i2 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16) | (e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            wo1 wo1Var = lja.Q;
            iqb iqbVarJ = gb9.J(androidx.compose.foundation.b.c(xn5.V(ez1.t(b.c(iqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).u, gm3.b(e18Var).h), gm3.b(e18Var).h), false, null, new vue(0), null, zy7Var, 11), 16.0f);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var, 48);
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
            fqb fqbVar = fqb.E;
            iqb iqbVarP = yfd.p(b.o(fqbVar, 40.0f), gm3.a(e18Var).q, xve.a);
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
            iv1.b(ud0.v0, null, null, null, gm3.a(e18Var).M, e18Var, 48, 12);
            e18Var.p(true);
            kxk.g(e18Var, b.t(fqbVar, 16.0f));
            tjh.b(str, new hw9(1.0f, true), gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, i2 & 14, 0, 131064);
            e18Var = e18Var;
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new uf2(str, zy7Var, iqbVar, i, 6);
        }
    }

    public static final void g(boolean z, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(453325835);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (e18Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            iqb iqbVarC = b.c(fqb.E, 1.0f);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
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
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            if (z) {
                e18Var.a0(-2001998975);
                e18Var.p(false);
            } else {
                e18Var.a0(-2002047986);
                l(0, e18Var);
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new hv(z, i, i3);
        }
    }

    public static final void h(lod lodVar, boolean z, boolean z2, zy7 zy7Var, String str, ld4 ld4Var, int i) {
        boolean z3;
        boolean z4;
        zy7Var.getClass();
        str.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1062640622);
        int i2 = i | (e18Var.f(lodVar) ? 4 : 2) | (e18Var.g(z) ? 32 : 16) | (e18Var.g(z2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.f(str) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            fqb fqbVar = fqb.E;
            iqb iqbVarK = gb9.K(fqbVar, 24.0f, 16.0f);
            vo1 vo1Var = lja.S;
            eo0 eo0Var = ko0.c;
            q64 q64VarA = p64.a(eo0Var, vo1Var, e18Var, 0);
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
            if (z2) {
                e18Var.a0(-623532767);
                q64 q64VarA2 = p64.a(eo0Var, vo1Var, e18Var, 0);
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
                a(lodVar, e18Var, i2 & 14);
                kxk.g(e18Var, b.e(fqbVar, 16.0f));
                g(z, e18Var, (i2 >> 3) & 14);
                kxk.g(e18Var, b.e(fqbVar, 16.0f));
                z3 = true;
                e18Var.p(true);
                z4 = false;
                e18Var.p(false);
            } else {
                z3 = true;
                z4 = false;
                e18Var.a0(-623281946);
                e18Var.p(false);
            }
            dtj.a(str, b.c(fqbVar, 1.0f), (((Boolean) lodVar.p.getValue()).booleanValue() || ((Boolean) lodVar.n.getValue()).booleanValue()) ? z4 : z3, null, null, null, 0L, zy7Var, e18Var, ((i2 >> 12) & 14) | 48 | (29360128 & (i2 << 12)), 120);
            WeakHashMap weakHashMap = gdj.x;
            kxk.g(e18Var, b.g(fik.n(s4i.d(e18Var).m), 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2));
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new iw0(lodVar, z, z2, zy7Var, str, i, 8);
        }
    }

    public static final void i(znd zndVar, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1356972505);
        int i2 = (e18Var.h(zndVar) ? 4 : 2) | i | 48;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            bpc bpcVarA = a.a(ud0.m0, e18Var);
            String str = zndVar.d.c;
            fqb fqbVar = fqb.E;
            pvj.b(bpcVarA, str, fqbVar, null, e18Var, 392, 8);
            iqbVar = fqbVar;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lpa(zndVar, iqbVar, i, 26);
        }
    }

    public static final void j(final UploadMaterialsScreenParams uploadMaterialsScreenParams, final zy7 zy7Var, final bz7 bz7Var, iqb iqbVar, lod lodVar, qi3 qi3Var, ld4 ld4Var, final int i) {
        final iqb iqbVar2;
        final lod lodVar2;
        final qi3 qi3Var2;
        r7e r7eVarS;
        pz7 pz7Var;
        final lod lodVar3;
        int i2;
        iqb iqbVar3;
        int i3;
        final qi3 qi3Var3;
        uploadMaterialsScreenParams.getClass();
        zy7Var.getClass();
        bz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-524266260);
        int i4 = (e18Var.f(uploadMaterialsScreenParams) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i4 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= e18Var.h(bz7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i5 = i4 | 76800;
        boolean z = true;
        if (e18Var.Q(i5 & 1, (74899 & i5) != 74898)) {
            e18Var.V();
            int i6 = i & 1;
            int i7 = 21;
            tp4 tp4Var = null;
            lz1 lz1Var = jd4.a;
            if (i6 == 0 || e18Var.A()) {
                m7f m7fVar = (m7f) e18Var.j(gr9.b);
                boolean zH = ((((i5 & 14) ^ 6) > 4 && e18Var.f(uploadMaterialsScreenParams)) || (i5 & 6) == 4) | e18Var.h(m7fVar);
                Object objN = e18Var.N();
                Object obj = objN;
                if (zH || objN == lz1Var) {
                    b4b b4bVar = new b4b(uploadMaterialsScreenParams, i7, m7fVar);
                    e18Var.k0(b4bVar);
                    obj = b4bVar;
                }
                kce kceVar = jce.a;
                lodVar3 = (lod) fd9.r0(kceVar.b(lod.class), oq5.B(kceVar.b(lod.class)), (bz7) obj, e18Var);
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN2 = e18Var.N();
                if (zF || objN2 == lz1Var) {
                    objN2 = m7fVarN.a(kceVar.b(qi3.class), null, null);
                    e18Var.k0(objN2);
                }
                e18Var.p(false);
                e18Var.p(false);
                i2 = i5 & (-516097);
                iqbVar3 = fqb.E;
                i3 = 256;
                qi3Var3 = (qi3) objN2;
            } else {
                e18Var.T();
                lodVar3 = lodVar;
                i2 = i5 & (-516097);
                i3 = 256;
                iqbVar3 = iqbVar;
                qi3Var3 = qi3Var;
            }
            e18Var.q();
            znd zndVar = (znd) lodVar3.i.getValue();
            if (zndVar == null) {
                r7eVarS = e18Var.s();
                if (r7eVarS != null) {
                    final iqb iqbVar4 = iqbVar3;
                    final int i8 = 0;
                    pz7Var = new pz7() { // from class: mod
                        @Override // defpackage.pz7
                        public final Object invoke(Object obj2, Object obj3) {
                            int i9 = i8;
                            iei ieiVar = iei.a;
                            int i10 = i;
                            switch (i9) {
                                case 0:
                                    ((Integer) obj3).getClass();
                                    int iP0 = x44.p0(i10 | 1);
                                    qik.j(uploadMaterialsScreenParams, zy7Var, bz7Var, iqbVar4, lodVar3, qi3Var3, (ld4) obj2, iP0);
                                    break;
                                default:
                                    ((Integer) obj3).getClass();
                                    int iP02 = x44.p0(i10 | 1);
                                    qik.j(uploadMaterialsScreenParams, zy7Var, bz7Var, iqbVar4, lodVar3, qi3Var3, (ld4) obj2, iP02);
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    r7eVarS.d = pz7Var;
                }
                return;
            }
            iqb iqbVar5 = iqbVar3;
            qi3 qi3Var4 = qi3Var3;
            boolean zH2 = e18Var.h(qi3Var4);
            Object objN3 = e18Var.N();
            Object obj2 = objN3;
            if (zH2 || objN3 == lz1Var) {
                gw gwVar = new gw(qi3Var4, tp4Var, 26);
                e18Var.k0(gwVar);
                obj2 = gwVar;
            }
            csg.g((bz7) obj2, e18Var, 0, 1);
            zy1 zy1Var = lodVar3.f;
            boolean z2 = (i2 & 896) == i3;
            Object objN4 = e18Var.N();
            Object obj3 = objN4;
            if (z2 || objN4 == lz1Var) {
                vp6 vp6Var = new vp6(z ? 1 : 0, tp4Var, bz7Var);
                e18Var.k0(vp6Var);
                obj3 = vp6Var;
            }
            x44.b(zy1Var, (pz7) obj3, e18Var, 0);
            boolean z3 = lodVar3.O() == tji.F;
            boolean zF2 = e18Var.f(lodVar3);
            Object objN5 = e18Var.N();
            Object obj4 = objN5;
            if (zF2 || objN5 == lz1Var) {
                iod iodVar = new iod(lodVar3, 6);
                e18Var.k0(iodVar);
                obj4 = iodVar;
            }
            yb5.c(0, 0, e18Var, (zy7) obj4, z3);
            Object objN6 = e18Var.N();
            Object objP = objN6;
            if (objN6 == lz1Var) {
                objP = sq6.p(e18Var);
            }
            ybg ybgVar = (ybg) objP;
            zni.g(lodVar3.e, ybgVar, e18Var, 48);
            boolean zEquals = dbj.a(e18Var).a.a().equals(rbj.b);
            lod lodVar4 = lodVar3;
            v40.b(iqbVar5, null, fd9.q0(1265059311, new nod(zy7Var, lodVar3), e18Var), fd9.q0(-540443984, new xb2(lodVar3, zEquals, 8), e18Var), fd9.q0(1949020017, new rn(ybgVar, 21), e18Var), null, 0, 0L, 0L, null, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(424389666, new qe(iqbVar5, lodVar4, zEquals, zndVar, 9), e18Var), e18Var, 28038, 2018);
            qi3Var2 = qi3Var4;
            iqbVar2 = iqbVar5;
            lodVar2 = lodVar4;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            lodVar2 = lodVar;
            qi3Var2 = qi3Var;
        }
        r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final int i9 = 1;
            pz7Var = new pz7() { // from class: mod
                @Override // defpackage.pz7
                public final Object invoke(Object obj22, Object obj32) {
                    int i92 = i9;
                    iei ieiVar = iei.a;
                    int i10 = i;
                    switch (i92) {
                        case 0:
                            ((Integer) obj32).getClass();
                            int iP0 = x44.p0(i10 | 1);
                            qik.j(uploadMaterialsScreenParams, zy7Var, bz7Var, iqbVar2, lodVar2, qi3Var2, (ld4) obj22, iP0);
                            break;
                        default:
                            ((Integer) obj32).getClass();
                            int iP02 = x44.p0(i10 | 1);
                            qik.j(uploadMaterialsScreenParams, zy7Var, bz7Var, iqbVar2, lodVar2, qi3Var2, (ld4) obj22, iP02);
                            break;
                    }
                    return ieiVar;
                }
            };
            r7eVarS.d = pz7Var;
        }
    }

    public static final void k(zy7 zy7Var, iqb iqbVar, lod lodVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-471646925);
        int i2 = (e18Var.h(zy7Var) ? 4 : 2) | i | 48 | (e18Var.f(lodVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                iqbVar = fqb.E;
            } else {
                e18Var.T();
            }
            iqb iqbVar3 = iqbVar;
            e18Var.q();
            zni.e(iqbVar3, null, fd9.q0(-898118029, new nod(lodVar, zy7Var), e18Var), null, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, e18Var, 390, 250);
            iqbVar2 = iqbVar3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ra7(zy7Var, iqbVar2, lodVar, i, 27);
        }
    }

    public static final void l(int i, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1002009429);
        if (e18Var.Q(i & 1, i != 0)) {
            wo1 wo1Var = lja.Q;
            fqb fqbVar = fqb.E;
            iqb iqbVarC = b.c(fqbVar, 1.0f);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var, 48);
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
            cv8.b(a.a(ud0.C0, e18Var), null, b.o(fqbVar, 20.0f), gm3.a(e18Var).O, e18Var, 440, 0);
            kxk.g(e18Var, b.t(fqbVar, 12.0f));
            tjh.b(d4c.j0(R.string.template_upload_can_upload_more, e18Var), new hw9(1.0f, true), gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 0, 131064);
            e18Var = e18Var;
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new oua(i, 26);
        }
    }

    public static final void m(String str, List list, bz7 bz7Var, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        iqb iqbVar2;
        str.getClass();
        list.getClass();
        bz7Var.getClass();
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-82821824);
        int i2 = i | (e18Var2.f(str) ? 4 : 2) | (e18Var2.f(list) ? 32 : 16) | (e18Var2.h(bz7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | 24576;
        if (e18Var2.Q(i2 & 1, (i2 & 9363) != 9362)) {
            r4g r4gVarS = gb9.S(null, null, null, zy7Var, e18Var2, i2 & 7168, 7);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objN = e18Var2.N();
            if (z || objN == jd4.a) {
                objN = new nwh(list, 6, bz7Var);
                e18Var2.k0(objN);
            }
            fqb fqbVar = fqb.E;
            e18Var = e18Var2;
            ovj.a(r4gVarS, str, fqbVar, null, false, false, null, null, null, null, null, null, null, (pz7) objN, e18Var, ((i2 << 3) & 112) | 392, 0, 32760);
            iqbVar2 = fqbVar;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new w4d(str, list, bz7Var, zy7Var, iqbVar2, i, 10);
        }
    }

    public static jt6 n(qh9 qh9Var) {
        try {
            Number numberL = qh9Var.s("width").l();
            Number numberL2 = qh9Var.s("height").l();
            numberL.getClass();
            numberL2.getClass();
            return new jt6(numberL, numberL2);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Viewport", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Viewport", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Viewport", e3);
            return null;
        }
    }

    public static dla o(qh9 qh9Var) {
        try {
            bh9 bh9VarS = qh9Var.s("technology");
            String strM = bh9VarS != null ? bh9VarS.m() : null;
            bh9 bh9VarS2 = qh9Var.s("carrier_name");
            return new dla(strM, bh9VarS2 != null ? bh9VarS2.m() : null);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Cellular", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Cellular", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Cellular", e3);
            return null;
        }
    }
}
