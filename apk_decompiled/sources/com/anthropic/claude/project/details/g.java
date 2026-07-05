package com.anthropic.claude.project.details;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.project.details.ProjectDetailsDialogDestination;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.a1a;
import defpackage.amk;
import defpackage.b4b;
import defpackage.bsk;
import defpackage.bz7;
import defpackage.cok;
import defpackage.csg;
import defpackage.dxe;
import defpackage.e18;
import defpackage.eve;
import defpackage.fd9;
import defpackage.fqb;
import defpackage.fw;
import defpackage.fxd;
import defpackage.g77;
import defpackage.gl;
import defpackage.gm3;
import defpackage.gr9;
import defpackage.gw;
import defpackage.ht0;
import defpackage.ia0;
import defpackage.iei;
import defpackage.ild;
import defpackage.iqb;
import defpackage.iv1;
import defpackage.iy5;
import defpackage.jce;
import defpackage.jd4;
import defpackage.jga;
import defpackage.jld;
import defpackage.kce;
import defpackage.kw;
import defpackage.ld4;
import defpackage.lw;
import defpackage.lz1;
import defpackage.m7f;
import defpackage.mgd;
import defpackage.ml3;
import defpackage.mm5;
import defpackage.mu2;
import defpackage.mwa;
import defpackage.mxd;
import defpackage.n2i;
import defpackage.oq5;
import defpackage.ppa;
import defpackage.pz7;
import defpackage.pzg;
import defpackage.q2i;
import defpackage.qfe;
import defpackage.qi3;
import defpackage.qz7;
import defpackage.r7e;
import defpackage.rg4;
import defpackage.rn;
import defpackage.rwe;
import defpackage.rz7;
import defpackage.sq6;
import defpackage.sz7;
import defpackage.tjh;
import defpackage.tkd;
import defpackage.v40;
import defpackage.vb7;
import defpackage.vwk;
import defpackage.wg6;
import defpackage.wsk;
import defpackage.x0a;
import defpackage.xw;
import defpackage.ybg;
import defpackage.yi7;
import defpackage.zni;
import defpackage.zy7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {
    public static final void a(int i, int i2, ld4 ld4Var, zy7 zy7Var, iqb iqbVar, boolean z) {
        int i3;
        iqb iqbVar2;
        int i4;
        iqb iqbVar3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(467923255);
        if ((i & 6) == 0) {
            i3 = i | (e18Var.g(z) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 = i3 | 384;
            iqbVar2 = iqbVar;
        } else {
            iqbVar2 = iqbVar;
            i4 = i3 | (e18Var.f(iqbVar2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        }
        if (e18Var.Q(i4 & 1, (i4 & 147) != 146)) {
            iqbVar3 = i5 != 0 ? fqb.E : iqbVar2;
            pzg.a(iqbVar3, gm3.b(e18Var).h, 0L, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, fd9.q0(-1904010990, new mu2(z, zy7Var, 3), e18Var), e18Var, ((i4 >> 6) & 14) | 12582912, 124);
        } else {
            e18Var.T();
            iqbVar3 = iqbVar2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xw(z, zy7Var, iqbVar3, i, i2, 2);
        }
    }

    public static final void b(ProjectDetailsScreenParams projectDetailsScreenParams, ml3 ml3Var, boolean z, pz7 pz7Var, zy7 zy7Var, pz7 pz7Var2, zy7 zy7Var2, zy7 zy7Var3, iqb iqbVar, ild ildVar, qi3 qi3Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        ild ildVar2;
        qi3 qi3Var2;
        qi3 qi3Var3;
        int i3;
        x0a x0aVar;
        qi3 qi3Var4;
        projectDetailsScreenParams.getClass();
        pz7Var.getClass();
        zy7Var.getClass();
        pz7Var2.getClass();
        zy7Var2.getClass();
        zy7Var3.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-902562885);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(projectDetailsScreenParams) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var2.f(ml3Var) : e18Var2.h(ml3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.h(pz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.h(zy7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var2.h(pz7Var2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var2.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= e18Var2.h(zy7Var3) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= e18Var2.f(iqbVar) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= 268435456;
        }
        if (e18Var2.Q(i2 & 1, (306783379 & i2) != 306783378)) {
            e18Var2.V();
            int i4 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i4 == 0 || e18Var2.A()) {
                m7f m7fVar = (m7f) e18Var2.j(gr9.b);
                boolean zH = ((((i2 & 14) ^ 6) > 4 && e18Var2.f(projectDetailsScreenParams)) || (i2 & 6) == 4) | e18Var2.h(m7fVar);
                Object objN = e18Var2.N();
                if (zH || objN == lz1Var) {
                    objN = new b4b(projectDetailsScreenParams, 20, m7fVar);
                    e18Var2.k0(objN);
                }
                kce kceVar = jce.a;
                int i5 = i2;
                int i6 = i5 & (-1879048193);
                ildVar = (ild) fd9.r0(kceVar.b(ild.class), oq5.B(kceVar.b(ild.class)), (bz7) objN, e18Var2);
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
                Object objN2 = e18Var2.N();
                if (zF || objN2 == lz1Var) {
                    Object objA = m7fVarN.a(kceVar.b(qi3.class), null, null);
                    e18Var2.k0(objA);
                    objN2 = objA;
                }
                e18Var2.p(false);
                e18Var2.p(false);
                qi3Var3 = (qi3) objN2;
                i3 = i6;
            } else {
                e18Var2.T();
                qi3Var3 = qi3Var;
                i3 = i2 & (-1879048193);
            }
            ild ildVar3 = ildVar;
            e18Var2.q();
            boolean zH2 = e18Var2.h(qi3Var3);
            Object objN3 = e18Var2.N();
            int i7 = 24;
            if (zH2 || objN3 == lz1Var) {
                objN3 = new gw(qi3Var3, null, i7);
                e18Var2.k0(objN3);
            }
            int i8 = 0;
            csg.g((bz7) objN3, e18Var2, 0, 1);
            boolean zH3 = e18Var2.h(ildVar3);
            Object objN4 = e18Var2.N();
            if (zH3 || objN4 == lz1Var) {
                objN4 = new jld(ildVar3, i8);
                e18Var2.k0(objN4);
            }
            int i9 = ild.A;
            mwa.d(ildVar3, null, (bz7) objN4, e18Var2, 8);
            Object objN5 = e18Var2.N();
            if (objN5 == lz1Var) {
                objN5 = sq6.p(e18Var2);
            }
            ybg ybgVar = (ybg) objN5;
            x0a x0aVarA = a1a.a(0, 3, e18Var2);
            mxd mxdVarD = fxd.d(e18Var2);
            zni.g(ildVar3.m, ybgVar, e18Var2, 48);
            g77 g77VarA = n2i.a(null, e18Var2, 15);
            tkd tkdVar = (tkd) ildVar3.t.getValue();
            String strN = tkdVar != null ? tkdVar.b : null;
            if (strN == null) {
                x0aVar = x0aVarA;
                qi3Var4 = qi3Var3;
                strN = vb7.n(e18Var2, 220510021, R.string.generic_project, e18Var2, false);
            } else {
                x0aVar = x0aVarA;
                qi3Var4 = qi3Var3;
                e18Var2.a0(220509339);
                e18Var2.p(false);
            }
            qi3 qi3Var5 = qi3Var4;
            x0a x0aVar2 = x0aVar;
            e18Var = e18Var2;
            v40.b(iqbVar, strN, fd9.q0(810719064, new mm5(ildVar3, zy7Var3, ml3Var, g77VarA, 29), e18Var2), null, fd9.q0(124951446, new rn(ybgVar, 19), e18Var2), fd9.q0(-217932363, new ht0(z, qi3Var5, ildVar3, projectDetailsScreenParams, zy7Var2, x0aVar2), e18Var2), 0, 0L, 0L, null, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(-718608443, new fw(ildVar3, mxdVarD, g77VarA, zy7Var, pz7Var2, pz7Var, x0aVar2), e18Var2), e18Var, ((i3 >> 24) & 14) | 221568, 1992);
            qi3Var2 = qi3Var5;
            ildVar2 = ildVar3;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            ildVar2 = ildVar;
            qi3Var2 = qi3Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new rg4(projectDetailsScreenParams, ml3Var, z, pz7Var, zy7Var, pz7Var2, zy7Var2, zy7Var3, iqbVar, ildVar2, qi3Var2, i);
        }
    }

    public static final void c(String str, ld4 ld4Var, int i) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(791143321);
        int i2 = i | (e18Var2.f(str) ? 4 : 2);
        if (e18Var2.Q(i2 & 1, (i2 & 3) != 2)) {
            e18Var = e18Var2;
            tjh.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, null, e18Var, i2 & 14, 24960, 241662);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new yi7(str, i, 24);
        }
    }

    public static final void d(final tkd tkdVar, final zy7 zy7Var, final bz7 bz7Var, final zy7 zy7Var2, ml3 ml3Var, q2i q2iVar, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        String str;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1923575260);
        int i2 = i | (e18Var.f(tkdVar) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16) | (e18Var.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.f(ml3Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.f(q2iVar) ? 131072 : 65536) | 1572864;
        if (e18Var.Q(i2 & 1, (599187 & i2) != 599186)) {
            if (tkdVar == null || (str = tkdVar.b) == null) {
                str = "";
            }
            fqb fqbVar = fqb.E;
            final String str2 = str;
            cok.f(fd9.q0(596290462, new yi7(str, 23), e18Var), q2iVar, androidx.compose.foundation.layout.b.c(fqbVar, 1.0f), null, fd9.q0(-94405094, new gl(ml3Var, 9), e18Var), fd9.q0(-1174413295, new rz7() { // from class: com.anthropic.claude.project.details.b
                @Override // defpackage.rz7
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ld4 ld4Var2 = (ld4) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((dxe) obj).getClass();
                    e18 e18Var2 = (e18) ld4Var2;
                    if (e18Var2.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        Object objN = e18Var2.N();
                        if (objN == jd4.a) {
                            objN = new mgd(7);
                            e18Var2.k0(objN);
                        }
                        kce kceVar = jce.a;
                        final rwe rweVarP = eve.P(kceVar.b(ProjectDetailsDialogDestination.class), oq5.B(kceVar.b(ProjectDetailsDialogDestination.class)), true, iv1.M(kceVar.b(ProjectDetailsDialogDestination.class)), (zy7) objN, e18Var2);
                        final tkd tkdVar2 = tkdVar;
                        wsk.c(fd9.q0(-295180128, new kw(tkdVar2, zy7Var, rweVarP, bz7Var, 11), e18Var2), bsk.b, e18Var2, 54);
                        final String str3 = str2;
                        final zy7 zy7Var3 = zy7Var2;
                        mwa.l(rweVarP, null, null, fd9.q0(1961785721, new sz7() { // from class: com.anthropic.claude.project.details.c
                            @Override // defpackage.sz7
                            public final Object i(Object obj4, Object obj5, Object obj6, Object obj7) {
                                ProjectDetailsDialogDestination projectDetailsDialogDestination = (ProjectDetailsDialogDestination) obj5;
                                ld4 ld4Var3 = (ld4) obj6;
                                int iIntValue2 = ((Integer) obj7).intValue();
                                ((ia0) obj4).getClass();
                                projectDetailsDialogDestination.getClass();
                                if ((iIntValue2 & 48) == 0) {
                                    iIntValue2 |= (iIntValue2 & 64) == 0 ? ((e18) ld4Var3).f(projectDetailsDialogDestination) : ((e18) ld4Var3).h(projectDetailsDialogDestination) ? 32 : 16;
                                }
                                final int i3 = 1;
                                final int i4 = 0;
                                e18 e18Var3 = (e18) ld4Var3;
                                if (e18Var3.Q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                    tkd tkdVar3 = tkdVar2;
                                    String str4 = tkdVar3 != null ? tkdVar3.a : null;
                                    if (!projectDetailsDialogDestination.equals(ProjectDetailsDialogDestination.Dismissed.INSTANCE)) {
                                        boolean zEquals = projectDetailsDialogDestination.equals(ProjectDetailsDialogDestination.Rename.INSTANCE);
                                        final rwe rweVar = rweVarP;
                                        lz1 lz1Var = jd4.a;
                                        if (zEquals) {
                                            if (str4 != null) {
                                                e18Var3.a0(1938684582);
                                                qfe qfeVarF = amk.f(str4, e18Var3);
                                                boolean zH = e18Var3.h(rweVar);
                                                Object objN2 = e18Var3.N();
                                                if (zH || objN2 == lz1Var) {
                                                    objN2 = new bz7() { // from class: com.anthropic.claude.project.details.d
                                                        @Override // defpackage.bz7
                                                        public final Object invoke(Object obj8) {
                                                            ((String) obj8).getClass();
                                                            jga jgaVar = new jga(17, new ProjectDetailsDialogDestination[]{ProjectDetailsDialogDestination.Dismissed.INSTANCE});
                                                            ppa ppaVar = new ppa(21);
                                                            rwe rweVar2 = rweVar;
                                                            rweVar2.getClass();
                                                            rweVar2.E.m(jgaVar, ppaVar);
                                                            return iei.a;
                                                        }
                                                    };
                                                    e18Var3.k0(objN2);
                                                }
                                                bz7 bz7Var2 = (bz7) objN2;
                                                boolean zH2 = e18Var3.h(rweVar);
                                                Object objN3 = e18Var3.N();
                                                if (zH2 || objN3 == lz1Var) {
                                                    objN3 = new zy7() { // from class: com.anthropic.claude.project.details.e
                                                        @Override // defpackage.zy7
                                                        public final Object a() {
                                                            int i5 = i4;
                                                            iei ieiVar = iei.a;
                                                            rwe rweVar2 = rweVar;
                                                            switch (i5) {
                                                                case 0:
                                                                    jga jgaVar = new jga(18, new ProjectDetailsDialogDestination[]{ProjectDetailsDialogDestination.Dismissed.INSTANCE});
                                                                    ppa ppaVar = new ppa(22);
                                                                    rweVar2.getClass();
                                                                    rweVar2.E.m(jgaVar, ppaVar);
                                                                    break;
                                                                default:
                                                                    jga jgaVar2 = new jga(20, new ProjectDetailsDialogDestination[]{ProjectDetailsDialogDestination.Dismissed.INSTANCE});
                                                                    ppa ppaVar2 = new ppa(24);
                                                                    rweVar2.getClass();
                                                                    rweVar2.E.m(jgaVar2, ppaVar2);
                                                                    break;
                                                            }
                                                            return ieiVar;
                                                        }
                                                    };
                                                    e18Var3.k0(objN3);
                                                }
                                                amk.a(qfeVarF, bz7Var2, (zy7) objN3, e18Var3, 0);
                                                e18Var3.p(false);
                                            } else {
                                                e18Var3.a0(1939241001);
                                                e18Var3.p(false);
                                            }
                                        } else {
                                            if (!projectDetailsDialogDestination.equals(ProjectDetailsDialogDestination.Delete.INSTANCE)) {
                                                wg6.i();
                                                return null;
                                            }
                                            if (str4 != null) {
                                                e18Var3.a0(1939347517);
                                                iy5 iy5VarG = vwk.g(str4, e18Var3);
                                                boolean zH3 = e18Var3.h(rweVar);
                                                final zy7 zy7Var4 = zy7Var3;
                                                boolean zF = zH3 | e18Var3.f(zy7Var4);
                                                Object objN4 = e18Var3.N();
                                                if (zF || objN4 == lz1Var) {
                                                    objN4 = new zy7() { // from class: com.anthropic.claude.project.details.f
                                                        @Override // defpackage.zy7
                                                        public final Object a() {
                                                            jga jgaVar = new jga(19, new ProjectDetailsDialogDestination[]{ProjectDetailsDialogDestination.Dismissed.INSTANCE});
                                                            ppa ppaVar = new ppa(23);
                                                            rwe rweVar2 = rweVar;
                                                            rweVar2.getClass();
                                                            rweVar2.E.m(jgaVar, ppaVar);
                                                            zy7Var4.a();
                                                            return iei.a;
                                                        }
                                                    };
                                                    e18Var3.k0(objN4);
                                                }
                                                zy7 zy7Var5 = (zy7) objN4;
                                                boolean zH4 = e18Var3.h(rweVar);
                                                Object objN5 = e18Var3.N();
                                                if (zH4 || objN5 == lz1Var) {
                                                    objN5 = new zy7() { // from class: com.anthropic.claude.project.details.e
                                                        @Override // defpackage.zy7
                                                        public final Object a() {
                                                            int i5 = i3;
                                                            iei ieiVar = iei.a;
                                                            rwe rweVar2 = rweVar;
                                                            switch (i5) {
                                                                case 0:
                                                                    jga jgaVar = new jga(18, new ProjectDetailsDialogDestination[]{ProjectDetailsDialogDestination.Dismissed.INSTANCE});
                                                                    ppa ppaVar = new ppa(22);
                                                                    rweVar2.getClass();
                                                                    rweVar2.E.m(jgaVar, ppaVar);
                                                                    break;
                                                                default:
                                                                    jga jgaVar2 = new jga(20, new ProjectDetailsDialogDestination[]{ProjectDetailsDialogDestination.Dismissed.INSTANCE});
                                                                    ppa ppaVar2 = new ppa(24);
                                                                    rweVar2.getClass();
                                                                    rweVar2.E.m(jgaVar2, ppaVar2);
                                                                    break;
                                                            }
                                                            return ieiVar;
                                                        }
                                                    };
                                                    e18Var3.k0(objN5);
                                                }
                                                vwk.a(iy5VarG, str3, zy7Var5, (zy7) objN5, e18Var3, 0);
                                                e18Var3.p(false);
                                            } else {
                                                e18Var3.a0(1940004841);
                                                e18Var3.p(false);
                                            }
                                        }
                                    }
                                } else {
                                    e18Var3.T();
                                }
                                return iei.a;
                            }
                        }, e18Var2), e18Var2, 3072, 6);
                    } else {
                        e18Var2.T();
                    }
                    return iei.a;
                }
            }, e18Var), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, ((i2 >> 12) & 112) | 221190, 200);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lw((Object) tkdVar, zy7Var, bz7Var, (qz7) zy7Var2, (Object) ml3Var, (Object) q2iVar, (Object) iqbVar2, i, 17);
        }
    }
}
