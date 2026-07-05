package com.anthropic.claude.tool.ui.chat;

import defpackage.bz7;
import defpackage.e18;
import defpackage.f2d;
import defpackage.fd9;
import defpackage.i2d;
import defpackage.jd4;
import defpackage.ld4;
import defpackage.lpa;
import defpackage.m4a;
import defpackage.mpk;
import defpackage.nwb;
import defpackage.pz7;
import defpackage.r7e;
import defpackage.ska;
import defpackage.t0d;
import defpackage.tda;
import defpackage.v0d;
import defpackage.zn;
import defpackage.zy7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    public static final void a(v0d v0dVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1601387218);
        int i2 = (e18Var.h(v0dVar) ? 4 : 2) | i;
        boolean z = true;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            m4a m4aVar = (m4a) e18Var.j(tda.a);
            int i3 = i2 & 14;
            nwb nwbVarZ = mpk.Z(v0dVar, e18Var);
            if (i3 != 4 && !e18Var.h(v0dVar)) {
                z = false;
            }
            boolean zF = e18Var.f(nwbVarZ) | z | e18Var.h(m4aVar);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = new f2d(v0dVar, m4aVar, nwbVarZ, 0);
                e18Var.k0(objN);
            }
            fd9.e(m4aVar, v0dVar, (bz7) objN, e18Var);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ska(v0dVar, i, 13);
        }
    }

    public static final void b(i2d i2dVar, zy7 zy7Var, ld4 ld4Var, int i) {
        i2d i2dVar2;
        zy7 zy7Var2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1259028443);
        int i2 = (e18Var.h(i2dVar) ? 4 : 2) | i | (e18Var.h(zy7Var) ? 32 : 16);
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            v0d v0dVar = (v0d) i2dVar.d.getValue();
            t0d t0dVar = v0dVar != null ? (t0d) v0dVar.c.getValue() : null;
            boolean zH = e18Var.h(t0dVar) | e18Var.h(i2dVar) | ((i2 & 112) == 32);
            Object objN = e18Var.N();
            if (zH || objN == jd4.a) {
                i2dVar2 = i2dVar;
                zy7Var2 = zy7Var;
                zn znVar = new zn(t0dVar, i2dVar2, zy7Var2, null, 25);
                e18Var.k0(znVar);
                objN = znVar;
            } else {
                i2dVar2 = i2dVar;
                zy7Var2 = zy7Var;
            }
            fd9.i(e18Var, (pz7) objN, t0dVar);
        } else {
            i2dVar2 = i2dVar;
            zy7Var2 = zy7Var;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lpa(i2dVar2, zy7Var2, i, 21);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03d9  */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v9, types: [zy7] */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v37 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [int] */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [f0d] */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [s0d] */
    /* JADX WARN: Type inference failed for: r8v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final java.lang.String r26, final com.anthropic.claude.tool.model.PhoneUseInput r27, final com.anthropic.claude.tool.custom.PhoneUseOutput r28, final boolean r29, final boolean r30, final defpackage.k1d r31, final defpackage.lvh r32, final defpackage.iqb r33, defpackage.ld4 r34, final int r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1086
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.tool.ui.chat.e.c(java.lang.String, com.anthropic.claude.tool.model.PhoneUseInput, com.anthropic.claude.tool.custom.PhoneUseOutput, boolean, boolean, k1d, lvh, iqb, ld4, int):void");
    }
}
