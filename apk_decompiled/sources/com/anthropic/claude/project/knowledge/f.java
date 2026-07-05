package com.anthropic.claude.project.knowledge;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.project.knowledge.ProjectDocMenuDialogDestination;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.bpc;
import defpackage.d4c;
import defpackage.dnd;
import defpackage.ds0;
import defpackage.e18;
import defpackage.ebh;
import defpackage.end;
import defpackage.eve;
import defpackage.fd9;
import defpackage.fnd;
import defpackage.ia0;
import defpackage.iei;
import defpackage.iv1;
import defpackage.j8;
import defpackage.jce;
import defpackage.jd4;
import defpackage.jga;
import defpackage.jo8;
import defpackage.kce;
import defpackage.kgh;
import defpackage.ld4;
import defpackage.mgd;
import defpackage.mwa;
import defpackage.nrk;
import defpackage.oq5;
import defpackage.ppa;
import defpackage.pz7;
import defpackage.qq;
import defpackage.r7e;
import defpackage.rwe;
import defpackage.s64;
import defpackage.sz7;
import defpackage.ud0;
import defpackage.uuj;
import defpackage.wcb;
import defpackage.wwk;
import defpackage.x44;
import defpackage.zy7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    public static final void a(s64 s64Var, zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        s64Var.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-864851688);
        if ((i & 48) == 0) {
            i2 = (e18Var.h(zy7Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (e18Var.Q(i2 & 1, (i2 & 17) != 16)) {
            String strJ0 = d4c.j0(R.string.project_knowledge_delete_doc_button, e18Var);
            bpc bpcVarA = com.anthropic.claude.design.icon.a.a(ud0.C1, e18Var);
            float f = wcb.a;
            uuj.a(strJ0, bpcVarA, zy7Var, null, null, false, null, nrk.e(e18Var), null, null, 0, 0, e18Var, 64 | ((i2 << 3) & 896), 3960);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new qq(s64Var, zy7Var, i, 26);
        }
    }

    public static final void b(boolean z, zy7 zy7Var, final fnd fndVar, ld4 ld4Var, int i) {
        int i2;
        final zy7 zy7Var2;
        zy7Var.getClass();
        fndVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-487405991);
        if ((i & 6) == 0) {
            i2 = (e18Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? e18Var.f(fndVar) : e18Var.h(fndVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i3 = i2;
        int i4 = 1;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            kce kceVar = jce.a;
            String strO = kgh.o(oq5.B(kceVar.b(ProjectDocMenuDialogDestination.class)), fndVar.getId());
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = new mgd(10);
                e18Var.k0(objN);
            }
            final rwe rweVarP = eve.P(kceVar.b(ProjectDocMenuDialogDestination.class), strO, true, iv1.M(kceVar.b(ProjectDocMenuDialogDestination.class)), (zy7) objN, e18Var);
            x44.q0(rweVarP, e18Var);
            j8.b(z, zy7Var, null, (((long) Float.floatToRawIntBits(-8.0f)) << 32) | (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) & 4294967295L), null, null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(1869990102, new jo8(rweVarP, i4), e18Var), e18Var, (i3 & 14) | 3072 | (i3 & 112), 2036);
            zy7Var2 = zy7Var;
            mwa.l(rweVarP, null, null, fd9.q0(1364471718, new sz7() { // from class: com.anthropic.claude.project.knowledge.c
                @Override // defpackage.sz7
                public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
                    ProjectDocMenuDialogDestination projectDocMenuDialogDestination = (ProjectDocMenuDialogDestination) obj2;
                    ld4 ld4Var2 = (ld4) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    ((ia0) obj).getClass();
                    projectDocMenuDialogDestination.getClass();
                    if ((iIntValue & 48) == 0) {
                        iIntValue |= (iIntValue & 64) == 0 ? ((e18) ld4Var2).f(projectDocMenuDialogDestination) : ((e18) ld4Var2).h(projectDocMenuDialogDestination) ? 32 : 16;
                    }
                    e18 e18Var2 = (e18) ld4Var2;
                    if (e18Var2.Q(iIntValue & 1, (iIntValue & 145) != 144)) {
                        final rwe rweVar = rweVarP;
                        boolean zH = e18Var2.h(rweVar);
                        final zy7 zy7Var3 = zy7Var2;
                        boolean zF = zH | e18Var2.f(zy7Var3);
                        Object objN2 = e18Var2.N();
                        if (zF || objN2 == jd4.a) {
                            objN2 = new zy7() { // from class: com.anthropic.claude.project.knowledge.d
                                @Override // defpackage.zy7
                                public final Object a() {
                                    rweVar.E.m(new jga(21, new ProjectDocMenuDialogDestination[]{ProjectDocMenuDialogDestination.Dismissed.INSTANCE}), new ppa(26));
                                    zy7Var3.a();
                                    return iei.a;
                                }
                            };
                            e18Var2.k0(objN2);
                        }
                        f.c(projectDocMenuDialogDestination, fndVar, (zy7) objN2, e18Var2, (iIntValue >> 3) & 14);
                    } else {
                        e18Var2.T();
                    }
                    return iei.a;
                }
            }, e18Var), e18Var, 3072, 6);
        } else {
            zy7Var2 = zy7Var;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ds0(z, zy7Var2, fndVar, i, 8);
        }
    }

    public static final void c(final ProjectDocMenuDialogDestination projectDocMenuDialogDestination, final fnd fndVar, zy7 zy7Var, ld4 ld4Var, final int i) {
        int i2;
        final zy7 zy7Var2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1192505956);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(projectDocMenuDialogDestination) : e18Var.h(projectDocMenuDialogDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var.f(fndVar) : e18Var.h(fndVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (!e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            zy7Var2 = zy7Var;
            e18Var.T();
        } else if (x44.r(projectDocMenuDialogDestination, ProjectDocMenuDialogDestination.Dismissed.INSTANCE)) {
            e18Var.a0(2024772484);
            e18Var.p(false);
            zy7Var2 = zy7Var;
        } else {
            if (!x44.r(projectDocMenuDialogDestination, ProjectDocMenuDialogDestination.Delete.INSTANCE)) {
                throw ebh.u(e18Var, 758050471, false);
            }
            e18Var.a0(2024864089);
            if (fndVar instanceof dnd) {
                e18Var.a0(2024929313);
                dnd dndVar = (dnd) fndVar;
                zy7Var2 = zy7Var;
                wwk.a(dndVar.a, dndVar.e.m414getUuidH8pzoGc(), zy7Var2, zy7Var, e18Var, (i2 & 896) | ((i2 << 3) & 7168));
                e18Var.p(false);
            } else {
                zy7Var2 = zy7Var;
                if (!(fndVar instanceof end)) {
                    throw ebh.u(e18Var, 758054857, false);
                }
                e18Var.a0(2025337831);
                end endVar = (end) fndVar;
                wwk.b(endVar.a, endVar.e.mo236getFile_uuidExWXDbg(), zy7Var2, zy7Var2, e18Var, (i2 & 896) | ((i2 << 3) & 7168));
                e18Var.p(false);
            }
            e18Var.p(false);
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: com.anthropic.claude.project.knowledge.e
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iP0 = x44.p0(i | 1);
                    f.c(projectDocMenuDialogDestination, fndVar, zy7Var2, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }
}
