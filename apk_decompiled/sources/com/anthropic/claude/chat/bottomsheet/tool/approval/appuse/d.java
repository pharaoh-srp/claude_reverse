package com.anthropic.claude.chat.bottomsheet.tool.approval.appuse;

import com.anthropic.claude.chat.bottomsheet.tool.approval.appuse.MobileAppUseDestination;
import com.anthropic.claude.tool.model.CalendarSearchPreviewData;
import com.anthropic.claude.tool.model.MobileAppToolPreviewInfo;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.bz7;
import defpackage.csg;
import defpackage.di;
import defpackage.e18;
import defpackage.eed;
import defpackage.eve;
import defpackage.fd9;
import defpackage.gb9;
import defpackage.gr9;
import defpackage.im6;
import defpackage.iv1;
import defpackage.jce;
import defpackage.jd4;
import defpackage.k44;
import defpackage.kce;
import defpackage.l45;
import defpackage.ld4;
import defpackage.lz1;
import defpackage.m7f;
import defpackage.mc;
import defpackage.mpk;
import defpackage.n82;
import defpackage.ne;
import defpackage.nwb;
import defpackage.o82;
import defpackage.oq5;
import defpackage.qwe;
import defpackage.r04;
import defpackage.r4g;
import defpackage.r7e;
import defpackage.rwe;
import defpackage.t4g;
import defpackage.u4g;
import defpackage.wd6;
import defpackage.x44;
import defpackage.yl1;
import defpackage.yxc;
import defpackage.zy7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {
    public static final void a(MobileAppToolPreviewInfo mobileAppToolPreviewInfo, mc mcVar, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, zy7 zy7Var4, ld4 ld4Var, int i) {
        mobileAppToolPreviewInfo.getClass();
        mcVar.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        zy7Var3.getClass();
        zy7Var4.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1296198730);
        int i2 = i | (e18Var.f(mobileAppToolPreviewInfo) ? 4 : 2) | (e18Var.f(mcVar) ? 32 : 16) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.h(zy7Var3) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.h(zy7Var4) ? 131072 : 65536);
        if (e18Var.Q(i2 & 1, (74899 & i2) != 74898)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = fd9.O(im6.E, e18Var);
                e18Var.k0(objN);
            }
            l45 l45Var = (l45) objN;
            m7f m7fVar = (m7f) e18Var.j(gr9.b);
            boolean zH = e18Var.h(m7fVar);
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var) {
                objN2 = new di(m7fVar, 21);
                e18Var.k0(objN2);
            }
            kce kceVar = jce.a;
            eed eedVar = (eed) fd9.r0(kceVar.b(eed.class), oq5.B(kceVar.b(eed.class)), (bz7) objN2, e18Var);
            MobileAppUseDestination.Dismissed dismissed = MobileAppUseDestination.Dismissed.INSTANCE;
            String strB = oq5.B(kceVar.b(MobileAppUseDestination.class));
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = new yl1(dismissed, 2);
                e18Var.k0(objN3);
            }
            rwe rweVarP = eve.P(kceVar.b(MobileAppUseDestination.class), strB, true, iv1.M(kceVar.b(MobileAppUseDestination.class)), (zy7) objN3, e18Var);
            x44.q0(rweVarP, e18Var);
            r4g r4gVarS = gb9.S(u4g.F, null, null, new k44(rweVarP, dismissed, zy7Var, 1), e18Var, 6, 6);
            boolean zF = e18Var.f(rweVarP) | e18Var.f(r4gVarS);
            Object objN4 = e18Var.N();
            if (zF || objN4 == lz1Var) {
                objN4 = new t4g(rweVarP, r4gVarS);
                e18Var.k0(objN4);
            }
            t4g t4gVar = (t4g) objN4;
            boolean zH2 = e18Var.h(t4gVar);
            Object objN5 = e18Var.N();
            if (zH2 || objN5 == lz1Var) {
                objN5 = new b(t4gVar, null);
                e18Var.k0(objN5);
            }
            csg.g((bz7) objN5, e18Var, 0, 1);
            Object objN6 = e18Var.N();
            if (objN6 == lz1Var) {
                objN6 = mpk.P(null);
                e18Var.k0(objN6);
            }
            nwb nwbVar = (nwb) objN6;
            yxc yxcVar = yxc.a;
            boolean zR = x44.r(wd6.x0("android.permission.READ_CALENDAR", null, yxcVar, e18Var, 390, 2).e(), yxcVar);
            boolean z = mobileAppToolPreviewInfo.getPreviewData() instanceof CalendarSearchPreviewData;
            o82 o82Var = eedVar.c;
            if (o82Var == null) {
                e18Var.a0(-993072758);
                e18Var.p(false);
            } else {
                e18Var.a0(-993072757);
                if (zR) {
                    e18Var.a0(630138386);
                    boolean zH3 = e18Var.h(o82Var);
                    Object objN7 = e18Var.N();
                    if (zH3 || objN7 == lz1Var) {
                        objN7 = new n82(o82Var, 2);
                        e18Var.k0(objN7);
                    }
                    fd9.d(o82Var, (bz7) objN7, e18Var);
                    e18Var.p(false);
                } else {
                    e18Var.a0(630317132);
                    e18Var.p(false);
                }
                e18Var.p(false);
            }
            qwe.a(t4gVar, null, null, false, null, new r04(z, zR, eedVar, zy7Var2, zy7Var, zy7Var3, zy7Var4, l45Var, mcVar, t4gVar, nwbVar, mobileAppToolPreviewInfo), e18Var, 0, 30);
            e18Var = e18Var;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ne(mobileAppToolPreviewInfo, mcVar, zy7Var, zy7Var2, zy7Var3, zy7Var4, i, 17);
        }
    }
}
