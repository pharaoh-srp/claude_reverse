package com.anthropic.claude.project.menu;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.project.menu.ProjectItemMenuDialogDestination;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.amk;
import defpackage.bz7;
import defpackage.de3;
import defpackage.e18;
import defpackage.ebh;
import defpackage.eve;
import defpackage.fd9;
import defpackage.fqb;
import defpackage.ia0;
import defpackage.iei;
import defpackage.iqb;
import defpackage.iv1;
import defpackage.iy5;
import defpackage.j8;
import defpackage.jce;
import defpackage.jd4;
import defpackage.jga;
import defpackage.kce;
import defpackage.kgh;
import defpackage.ld4;
import defpackage.lz1;
import defpackage.mgd;
import defpackage.mwa;
import defpackage.nmd;
import defpackage.oq5;
import defpackage.ppa;
import defpackage.qfe;
import defpackage.r7e;
import defpackage.rwe;
import defpackage.sz7;
import defpackage.vwk;
import defpackage.xe;
import defpackage.zy7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    public static final void a(final Project project, boolean z, zy7 zy7Var, zy7 zy7Var2, bz7 bz7Var, final zy7 zy7Var3, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        zy7 zy7Var4;
        bz7 bz7Var2;
        iqb iqbVar2;
        project.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        zy7Var3.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-771757864);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(project) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            zy7Var4 = zy7Var;
            i2 |= e18Var.h(zy7Var4) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            zy7Var4 = zy7Var;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            bz7Var2 = bz7Var;
            i2 |= e18Var.h(bz7Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        } else {
            bz7Var2 = bz7Var;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.h(zy7Var3) ? 131072 : 65536;
        }
        int i3 = i2 | 1572864;
        if (e18Var.Q(i3 & 1, (i3 & 599187) != 599186)) {
            kce kceVar = jce.a;
            String strO = kgh.o(oq5.B(kceVar.b(ProjectItemMenuDialogDestination.class)), project.m404getUuid5pmjbU());
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = new mgd(19);
                e18Var.k0(objN);
            }
            final rwe rweVarP = eve.P(kceVar.b(ProjectItemMenuDialogDestination.class), strO, true, iv1.M(kceVar.b(ProjectItemMenuDialogDestination.class)), (zy7) objN, e18Var);
            int i4 = i3 >> 3;
            iqbVar2 = fqb.E;
            j8.b(z, zy7Var, iqbVar2, (((long) Float.floatToRawIntBits(-8.0f)) << 32) | (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) & 4294967295L), null, null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(1174664059, new xe(project, zy7Var2, zy7Var4, rweVarP, bz7Var2, 28), e18Var), e18Var, (i4 & 112) | (i4 & 14) | 3072 | ((i3 >> 12) & 896), 2032);
            e18Var = e18Var;
            mwa.l(rweVarP, null, null, fd9.q0(977769266, new sz7() { // from class: com.anthropic.claude.project.menu.b
                @Override // defpackage.sz7
                public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
                    ProjectItemMenuDialogDestination projectItemMenuDialogDestination = (ProjectItemMenuDialogDestination) obj2;
                    ld4 ld4Var2 = (ld4) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    ((ia0) obj).getClass();
                    projectItemMenuDialogDestination.getClass();
                    if ((iIntValue & 48) == 0) {
                        iIntValue |= (iIntValue & 64) == 0 ? ((e18) ld4Var2).f(projectItemMenuDialogDestination) : ((e18) ld4Var2).h(projectItemMenuDialogDestination) ? 32 : 16;
                    }
                    final int i5 = 1;
                    final int i6 = 0;
                    e18 e18Var2 = (e18) ld4Var2;
                    if (!e18Var2.Q(iIntValue & 1, (iIntValue & 145) != 144)) {
                        e18Var2.T();
                    } else if (projectItemMenuDialogDestination.equals(ProjectItemMenuDialogDestination.Dismissed.INSTANCE)) {
                        e18Var2.a0(256105166);
                        e18Var2.p(false);
                    } else {
                        boolean zEquals = projectItemMenuDialogDestination.equals(ProjectItemMenuDialogDestination.Rename.INSTANCE);
                        Project project2 = project;
                        final rwe rweVar = rweVarP;
                        lz1 lz1Var = jd4.a;
                        if (zEquals) {
                            e18Var2.a0(256177644);
                            qfe qfeVarF = amk.f(project2.m404getUuid5pmjbU(), e18Var2);
                            boolean zH = e18Var2.h(rweVar);
                            Object objN2 = e18Var2.N();
                            if (zH || objN2 == lz1Var) {
                                objN2 = new bz7() { // from class: com.anthropic.claude.project.menu.c
                                    @Override // defpackage.bz7
                                    public final Object invoke(Object obj5) {
                                        ((String) obj5).getClass();
                                        jga jgaVar = new jga(22, new ProjectItemMenuDialogDestination[]{ProjectItemMenuDialogDestination.Dismissed.INSTANCE});
                                        ppa ppaVar = new ppa(29);
                                        rwe rweVar2 = rweVar;
                                        rweVar2.getClass();
                                        rweVar2.E.m(jgaVar, ppaVar);
                                        return iei.a;
                                    }
                                };
                                e18Var2.k0(objN2);
                            }
                            bz7 bz7Var3 = (bz7) objN2;
                            boolean zH2 = e18Var2.h(rweVar);
                            Object objN3 = e18Var2.N();
                            if (zH2 || objN3 == lz1Var) {
                                objN3 = new zy7() { // from class: com.anthropic.claude.project.menu.d
                                    @Override // defpackage.zy7
                                    public final Object a() {
                                        int i7 = i6;
                                        iei ieiVar = iei.a;
                                        rwe rweVar2 = rweVar;
                                        switch (i7) {
                                            case 0:
                                                jga jgaVar = new jga(23, new ProjectItemMenuDialogDestination[]{ProjectItemMenuDialogDestination.Dismissed.INSTANCE});
                                                nmd nmdVar = new nmd(0);
                                                rweVar2.getClass();
                                                rweVar2.E.m(jgaVar, nmdVar);
                                                break;
                                            default:
                                                jga jgaVar2 = new jga(25, new ProjectItemMenuDialogDestination[]{ProjectItemMenuDialogDestination.Dismissed.INSTANCE});
                                                nmd nmdVar2 = new nmd(2);
                                                rweVar2.getClass();
                                                rweVar2.E.m(jgaVar2, nmdVar2);
                                                break;
                                        }
                                        return ieiVar;
                                    }
                                };
                                e18Var2.k0(objN3);
                            }
                            amk.a(qfeVarF, bz7Var3, (zy7) objN3, e18Var2, 0);
                            e18Var2.p(false);
                        } else {
                            if (!projectItemMenuDialogDestination.equals(ProjectItemMenuDialogDestination.Delete.INSTANCE)) {
                                throw ebh.u(e18Var2, -961571142, false);
                            }
                            e18Var2.a0(256716920);
                            iy5 iy5VarG = vwk.g(project2.m404getUuid5pmjbU(), e18Var2);
                            String name = project2.getName();
                            boolean zH3 = e18Var2.h(rweVar);
                            final zy7 zy7Var5 = zy7Var3;
                            boolean zF = zH3 | e18Var2.f(zy7Var5);
                            Object objN4 = e18Var2.N();
                            if (zF || objN4 == lz1Var) {
                                objN4 = new zy7() { // from class: com.anthropic.claude.project.menu.e
                                    @Override // defpackage.zy7
                                    public final Object a() {
                                        jga jgaVar = new jga(24, new ProjectItemMenuDialogDestination[]{ProjectItemMenuDialogDestination.Dismissed.INSTANCE});
                                        nmd nmdVar = new nmd(1);
                                        rwe rweVar2 = rweVar;
                                        rweVar2.getClass();
                                        rweVar2.E.m(jgaVar, nmdVar);
                                        zy7Var5.a();
                                        return iei.a;
                                    }
                                };
                                e18Var2.k0(objN4);
                            }
                            zy7 zy7Var6 = (zy7) objN4;
                            boolean zH4 = e18Var2.h(rweVar);
                            Object objN5 = e18Var2.N();
                            if (zH4 || objN5 == lz1Var) {
                                objN5 = new zy7() { // from class: com.anthropic.claude.project.menu.d
                                    @Override // defpackage.zy7
                                    public final Object a() {
                                        int i7 = i5;
                                        iei ieiVar = iei.a;
                                        rwe rweVar2 = rweVar;
                                        switch (i7) {
                                            case 0:
                                                jga jgaVar = new jga(23, new ProjectItemMenuDialogDestination[]{ProjectItemMenuDialogDestination.Dismissed.INSTANCE});
                                                nmd nmdVar = new nmd(0);
                                                rweVar2.getClass();
                                                rweVar2.E.m(jgaVar, nmdVar);
                                                break;
                                            default:
                                                jga jgaVar2 = new jga(25, new ProjectItemMenuDialogDestination[]{ProjectItemMenuDialogDestination.Dismissed.INSTANCE});
                                                nmd nmdVar2 = new nmd(2);
                                                rweVar2.getClass();
                                                rweVar2.E.m(jgaVar2, nmdVar2);
                                                break;
                                        }
                                        return ieiVar;
                                    }
                                };
                                e18Var2.k0(objN5);
                            }
                            vwk.a(iy5VarG, name, zy7Var6, (zy7) objN5, e18Var2, 0);
                            e18Var2.p(false);
                        }
                    }
                    return iei.a;
                }
            }, e18Var), e18Var, 3072, 6);
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new de3(project, z, zy7Var, zy7Var2, bz7Var, zy7Var3, iqbVar2, i);
        }
    }
}
