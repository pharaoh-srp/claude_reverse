package com.anthropic.claude.app;

import com.anthropic.claude.app.ClaudeAppDestination;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.e18;
import defpackage.fd9;
import defpackage.ie3;
import defpackage.iei;
import defpackage.jd4;
import defpackage.ld4;
import defpackage.m63;
import defpackage.nf7;
import defpackage.pz7;
import defpackage.qzb;
import defpackage.r7e;
import defpackage.te3;
import defpackage.zqc;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class l1 {
    public static final void a(zqc zqcVar, nf7 nf7Var, qzb qzbVar, ld4 ld4Var, int i) {
        nf7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1805432200);
        int i2 = (e18Var.f(zqcVar) ? 4 : 2) | i | (e18Var.f(nf7Var) ? 32 : 16) | (e18Var.h(qzbVar) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256 || e18Var.h(qzbVar)) | ((i2 & 14) == 4);
            Object objN = e18Var.N();
            if (z || objN == jd4.a) {
                objN = new k1(nf7Var, zqcVar, qzbVar, null);
                e18Var.k0(objN);
            }
            fd9.i(e18Var, (pz7) objN, iei.a);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new m63(zqcVar, i, nf7Var, qzbVar, 11);
        }
    }

    public static final boolean b(zqc zqcVar) {
        te3 te3Var = (te3) zqcVar.F.getValue();
        ArrayList arrayList = te3Var.a;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((ClaudeAppDestination.List) ((ie3) it.next()).a).getRequiresChat()) {
                    return true;
                }
            }
        }
        ArrayList arrayList2 = te3Var.b;
        if (arrayList2.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            if (((ClaudeAppDestination.Detail) ((ie3) it2.next()).a).getRequiresChat()) {
                return true;
            }
        }
        return false;
    }
}
