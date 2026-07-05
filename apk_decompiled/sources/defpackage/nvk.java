package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nvk {
    public static final ta4 a = new ta4(192443140, false, new ic4(9));
    public static final ta4 b = new ta4(-1155690430, false, new ic4(10));
    public static final ta4 c = new ta4(-1699365667, false, new cc4(21));
    public static final ta4 d = new ta4(1921534844, false, new cc4(22));
    public static final ta4 e = new ta4(964026797, false, new ic4(11));
    public static final ta4 f = new ta4(-1171856405, false, new ic4(12));
    public static final ta4 g = new ta4(1394871558, false, new cc4(23));

    public static final void a(h39 h39Var, iqb iqbVar, long j, ld4 ld4Var, int i) {
        int i2;
        bpc bpcVarA;
        int i3;
        int i4;
        long j2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-316092483);
        if ((i & 6) == 0) {
            i2 = (e18Var.d(h39Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.e(j) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            e18Var.V();
            if ((i & 1) != 0 && !e18Var.A()) {
                e18Var.T();
            }
            e18Var.q();
            o5b o5bVarD = dw1.d(lja.K, false);
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
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            fqb fqbVar = fqb.E;
            iqb iqbVarO = b.o(fqbVar, 16.0f);
            vve vveVar = xve.a;
            kxk.g(e18Var, yfd.p(iqbVarO, j, vveVar));
            kxk.g(e18Var, yfd.p(b.o(fqbVar, 10.0f), gm3.a(e18Var).F, vveVar));
            int iOrdinal = h39Var.ordinal();
            if (iOrdinal == 0) {
                e18Var.a0(2039353639);
                bpcVarA = a.a(ud0.N, e18Var);
                e18Var.p(false);
            } else {
                if (iOrdinal != 1) {
                    throw ebh.u(e18Var, 2039351578, false);
                }
                e18Var.a0(2039355815);
                bpcVarA = a.a(ud0.J1, e18Var);
                e18Var.p(false);
            }
            int iOrdinal2 = h39Var.ordinal();
            if (iOrdinal2 == 0) {
                i3 = 849535076;
                i4 = R.string.suggested_connector_badge_connected;
            } else {
                if (iOrdinal2 != 1) {
                    throw ebh.u(e18Var, 849533959, false);
                }
                i3 = 849537762;
                i4 = R.string.suggested_connector_badge_warning;
            }
            String strN = vb7.n(e18Var, i3, i4, e18Var, false);
            int iOrdinal3 = h39Var.ordinal();
            if (iOrdinal3 == 0) {
                e18Var.a0(-252251190);
                j2 = gm3.a(e18Var).D;
                e18Var.p(false);
            } else {
                if (iOrdinal3 != 1) {
                    throw ebh.u(e18Var, -252252925, false);
                }
                e18Var.a0(-252249494);
                j2 = gm3.a(e18Var).Q;
                e18Var.p(false);
            }
            cv8.b(bpcVarA, strN, b.o(fqbVar, 16.0f), j2, e18Var, 392, 0);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new i39(h39Var, iqbVar, j, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.lang.String r17, java.lang.String r18, defpackage.iqb r19, defpackage.rz7 r20, defpackage.ld4 r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nvk.b(java.lang.String, java.lang.String, iqb, rz7, ld4, int, int):void");
    }

    public static final void c(mw1 mw1Var, h39 h39Var, long j, ld4 ld4Var, int i) {
        int i2;
        h39 h39Var2;
        long j2;
        mw1Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(490229618);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(mw1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.d(h39Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                j = gm3.a(e18Var).n;
            } else {
                e18Var.T();
            }
            int i3 = i2 & (-897);
            long j3 = j;
            e18Var.q();
            h39Var2 = h39Var;
            a(h39Var2, sf5.M(mw1Var.a(fqb.E, lja.O), 4.0f, 4.0f), j3, e18Var, (i3 >> 3) & 14);
            j2 = j3;
        } else {
            h39Var2 = h39Var;
            e18Var.T();
            j2 = j;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new i39(mw1Var, h39Var2, j2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final java.lang.String r60, final java.lang.String r61, final java.lang.String r62, final defpackage.zy7 r63, final defpackage.iqb r64, boolean r65, boolean r66, boolean r67, defpackage.pz7 r68, defpackage.pz7 r69, defpackage.ta4 r70, defpackage.ld4 r71, final int r72, final int r73) {
        /*
            Method dump skipped, instruction units count: 1156
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nvk.d(java.lang.String, java.lang.String, java.lang.String, zy7, iqb, boolean, boolean, boolean, pz7, pz7, ta4, ld4, int, int):void");
    }

    public static final void e(qnd qndVar, bz7 bz7Var, i4g i4gVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        gnd gndVar;
        yih yihVar;
        qndVar.getClass();
        lsc lscVar = qndVar.d;
        wqd wqdVar = qndVar.b;
        bz7Var.getClass();
        i4gVar.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1517568241);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var2.f(qndVar) : e18Var2.h(qndVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.h(bz7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.f(i4gVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i3 = i2 | 3072;
        if (e18Var2.Q(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zI0 = bsg.I0(qndVar.O());
            gnd gndVar2 = qnd.i;
            boolean z = zI0 ? !(!wqdVar.r(gndVar2).isEmpty() || (((Boolean) qndVar.g.getValue()).booleanValue() && !wqdVar.m(gndVar2))) : ((List) lscVar.getValue()) == null;
            List list = (List) qndVar.h.getValue();
            yih yihVar2 = qndVar.c;
            boolean z2 = (i3 & 14) == 4 || ((i3 & 8) != 0 && e18Var2.h(qndVar));
            Object objN = e18Var2.N();
            if (z2 || objN == jd4.a) {
                gndVar = gndVar2;
                yihVar = yihVar2;
                ogf ogfVar = new ogf(0, qndVar, qnd.class, "loadMore", "loadMore()V", 0, 1);
                e18Var2.k0(ogfVar);
                objN = ogfVar;
            } else {
                yihVar = yihVar2;
                gndVar = gndVar2;
            }
            int i4 = i3 << 6;
            e18Var = e18Var2;
            f(z, list, null, bz7Var, i4gVar, yihVar, (zy7) ((jm9) objN), !bsg.I0(qndVar.O()) ? ((List) lscVar.getValue()) != null && wqdVar.k(gndVar, qndVar.O()).b : wqdVar.k(gndVar, null).b, !bsg.I0(qndVar.O()) ? ((List) lscVar.getValue()) != null && x44.r(wqdVar.k(gndVar, qndVar.O()).a, Boolean.TRUE) : x44.r(wqdVar.k(gndVar, null).a, Boolean.TRUE), e18Var, ((i3 >> 3) & 896) | (i4 & 7168) | (i4 & 57344), 0);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v76(qndVar, i, bz7Var, i4gVar, 28);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(boolean r20, java.util.List r21, java.lang.String r22, defpackage.bz7 r23, defpackage.i4g r24, defpackage.yih r25, defpackage.zy7 r26, boolean r27, boolean r28, defpackage.ld4 r29, int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nvk.f(boolean, java.util.List, java.lang.String, bz7, i4g, yih, zy7, boolean, boolean, ld4, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object h(ArrayList arrayList, xzg xzgVar) {
        if (arrayList.isEmpty()) {
            return lm6.E;
        }
        yv5[] yv5VarArr = (yv5[]) arrayList.toArray(new yv5[0]);
        ga1 ga1Var = new ga1(yv5VarArr);
        ua2 ua2Var = new ua2(1, zni.I(xzgVar));
        ua2Var.t();
        int length = yv5VarArr.length;
        ea1[] ea1VarArr = new ea1[length];
        for (int i = 0; i < length; i++) {
            myg mygVar = yv5VarArr[i];
            mygVar.start();
            ea1 ea1Var = new ea1(ga1Var, ua2Var);
            ea1Var.M = knk.A(mygVar, ea1Var);
            ea1VarArr[i] = ea1Var;
        }
        fa1 fa1Var = new fa1(ea1VarArr);
        for (int i2 = 0; i2 < length; i2++) {
            ea1VarArr[i2].u(fa1Var);
        }
        if (ua2Var.y()) {
            fa1Var.a();
        } else {
            ua2Var.x(fa1Var);
        }
        return ua2Var.r();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        r1 = r11 - r19.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        r1 = r19.a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        r1 = r9 - r19.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        r1 = r19.b - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        if (r1 >= com.agog.mathdisplay.render.MTTypesetterKt.kLineSkipLimitMultiplier) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0090, code lost:
    
        defpackage.sz6.j("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0094, code lost:
    
        defpackage.sz6.j("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0098, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean i(defpackage.l9e r18, defpackage.l9e r19, defpackage.l9e r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = j(r3, r2, r0)
            float r5 = r2.b
            float r6 = r2.d
            float r7 = r2.a
            float r2 = r2.c
            float r8 = r0.d
            float r9 = r0.b
            float r10 = r0.c
            float r11 = r0.a
            r12 = 0
            if (r4 != 0) goto L9c
            boolean r0 = j(r3, r1, r0)
            if (r0 != 0) goto L27
            goto L9c
        L27:
            java.lang.String r4 = "This function should only be used for 2-D focus search"
            r13 = 6
            r14 = 5
            r15 = 4
            r18 = 1
            r0 = 3
            if (r3 != r0) goto L36
            int r16 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r16 < 0) goto L98
            goto L4a
        L36:
            if (r3 != r15) goto L3d
            int r16 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r16 > 0) goto L98
            goto L4a
        L3d:
            if (r3 != r14) goto L44
            int r16 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r16 < 0) goto L98
            goto L4a
        L44:
            if (r3 != r13) goto L99
            int r16 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r16 > 0) goto L98
        L4a:
            if (r3 != r0) goto L4d
            goto L4f
        L4d:
            if (r3 != r15) goto L50
        L4f:
            return r18
        L50:
            if (r3 != r0) goto L57
            float r1 = r1.c
            float r1 = r11 - r1
            goto L69
        L57:
            if (r3 != r15) goto L5d
            float r1 = r1.a
            float r1 = r1 - r10
            goto L69
        L5d:
            if (r3 != r14) goto L64
            float r1 = r1.d
            float r1 = r9 - r1
            goto L69
        L64:
            if (r3 != r13) goto L94
            float r1 = r1.b
            float r1 = r1 - r8
        L69:
            r16 = 0
            int r17 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r17 >= 0) goto L71
            r1 = r16
        L71:
            if (r3 != r0) goto L75
            float r11 = r11 - r7
            goto L83
        L75:
            if (r3 != r15) goto L7a
            float r11 = r2 - r10
            goto L83
        L7a:
            if (r3 != r14) goto L7f
            float r11 = r9 - r5
            goto L83
        L7f:
            if (r3 != r13) goto L90
            float r11 = r6 - r8
        L83:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r11 = r0
        L8a:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L8f
            return r18
        L8f:
            return r12
        L90:
            defpackage.sz6.j(r4)
            return r12
        L94:
            defpackage.sz6.j(r4)
            return r12
        L98:
            return r18
        L99:
            defpackage.sz6.j(r4)
        L9c:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nvk.i(l9e, l9e, l9e, int):boolean");
    }

    public static final boolean j(int i, l9e l9eVar, l9e l9eVar2) {
        if (i == 3 || i == 4) {
            return l9eVar.d > l9eVar2.b && l9eVar.b < l9eVar2.d;
        }
        if (i == 5 || i == 6) {
            return l9eVar.c > l9eVar2.a && l9eVar.a < l9eVar2.c;
        }
        sz6.j("This function should only be used for 2-D focus search");
        return false;
    }

    public static final void l(jt7 jt7Var, wwb wwbVar) {
        if (!jt7Var.E.R) {
            b39.c("visitChildren called on an unattached node");
        }
        wwb wwbVar2 = new wwb(0, new hqb[16]);
        hqb hqbVar = jt7Var.E;
        hqb hqbVar2 = hqbVar.J;
        if (hqbVar2 == null) {
            yfd.i(wwbVar2, hqbVar);
        } else {
            wwbVar2.b(hqbVar2);
        }
        while (true) {
            int i = wwbVar2.G;
            if (i == 0) {
                return;
            }
            hqb hqbVarJ = (hqb) wwbVar2.m(i - 1);
            if ((hqbVarJ.H & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
                yfd.i(wwbVar2, hqbVarJ);
            } else {
                while (true) {
                    if (hqbVarJ == null) {
                        break;
                    }
                    if ((hqbVarJ.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
                        wwb wwbVar3 = null;
                        while (hqbVarJ != null) {
                            if (hqbVarJ instanceof jt7) {
                                jt7 jt7Var2 = (jt7) hqbVarJ;
                                if (jt7Var2.R && !yfd.W(jt7Var2).u0) {
                                    if (jt7Var2.r1().a) {
                                        wwbVar.b(jt7Var2);
                                    } else {
                                        l(jt7Var2, wwbVar);
                                    }
                                }
                            } else if ((hqbVarJ.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 && (hqbVarJ instanceof qw5)) {
                                int i2 = 0;
                                for (hqb hqbVar3 = ((qw5) hqbVarJ).T; hqbVar3 != null; hqbVar3 = hqbVar3.J) {
                                    if ((hqbVar3.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            hqbVarJ = hqbVar3;
                                        } else {
                                            if (wwbVar3 == null) {
                                                wwbVar3 = new wwb(0, new hqb[16]);
                                            }
                                            if (hqbVarJ != null) {
                                                wwbVar3.b(hqbVarJ);
                                                hqbVarJ = null;
                                            }
                                            wwbVar3.b(hqbVar3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            hqbVarJ = yfd.j(wwbVar3);
                        }
                    } else {
                        hqbVarJ = hqbVarJ.J;
                    }
                }
            }
        }
    }

    public static final jt7 m(wwb wwbVar, l9e l9eVar, int i) {
        l9e l9eVarL;
        jt7 jt7Var = null;
        if (i == 3) {
            l9eVarL = l9eVar.l((l9eVar.c - l9eVar.a) + 1.0f, MTTypesetterKt.kLineSkipLimitMultiplier);
        } else if (i == 4) {
            l9eVarL = l9eVar.l(-((l9eVar.c - l9eVar.a) + 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier);
        } else if (i == 5) {
            l9eVarL = l9eVar.l(MTTypesetterKt.kLineSkipLimitMultiplier, (l9eVar.d - l9eVar.b) + 1.0f);
        } else {
            if (i != 6) {
                sz6.j("This function should only be used for 2-D focus search");
                return null;
            }
            l9eVarL = l9eVar.l(MTTypesetterKt.kLineSkipLimitMultiplier, -((l9eVar.d - l9eVar.b) + 1.0f));
        }
        Object[] objArr = wwbVar.E;
        int i2 = wwbVar.G;
        for (int i3 = 0; i3 < i2; i3++) {
            jt7 jt7Var2 = (jt7) objArr[i3];
            if (cok.q(jt7Var2)) {
                l9e l9eVarM = cok.m(jt7Var2);
                if (p(l9eVarM, l9eVarL, l9eVar, i)) {
                    jt7Var = jt7Var2;
                    l9eVarL = l9eVarM;
                }
            }
        }
        return jt7Var;
    }

    public static final boolean n(jt7 jt7Var, int i, bz7 bz7Var) {
        l9e l9eVar;
        wwb wwbVar = new wwb(0, new jt7[16]);
        l(jt7Var, wwbVar);
        int i2 = wwbVar.G;
        if (i2 <= 1) {
            jt7 jt7Var2 = (jt7) (i2 == 0 ? null : wwbVar.E[0]);
            if (jt7Var2 != null) {
                return ((Boolean) bz7Var.invoke(jt7Var2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                l9e l9eVarM = cok.m(jt7Var);
                float f2 = l9eVarM.a;
                float f3 = l9eVarM.b;
                l9eVar = new l9e(f2, f3, f2, f3);
            } else {
                if (i != 3 && i != 5) {
                    sz6.j("This function should only be used for 2-D focus search");
                    return false;
                }
                l9e l9eVarM2 = cok.m(jt7Var);
                float f4 = l9eVarM2.c;
                float f5 = l9eVarM2.d;
                l9eVar = new l9e(f4, f5, f4, f5);
            }
            jt7 jt7VarM = m(wwbVar, l9eVar, i);
            if (jt7VarM != null) {
                return ((Boolean) bz7Var.invoke(jt7VarM)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean o(int i, j70 j70Var, jt7 jt7Var, l9e l9eVar) {
        if (u(i, j70Var, jt7Var, l9eVar)) {
            return true;
        }
        Boolean bool = (Boolean) wwk.r(jt7Var, i, new qgc(((ts7) yfd.X(jt7Var).getFocusOwner()).h(), jt7Var, l9eVar, i, j70Var, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean p(l9e l9eVar, l9e l9eVar2, l9e l9eVar3, int i) {
        if (!q(i, l9eVar, l9eVar3)) {
            return false;
        }
        if (q(i, l9eVar2, l9eVar3) && !i(l9eVar3, l9eVar, l9eVar2, i)) {
            return !i(l9eVar3, l9eVar2, l9eVar, i) && r(i, l9eVar3, l9eVar) < r(i, l9eVar3, l9eVar2);
        }
        return true;
    }

    public static final boolean q(int i, l9e l9eVar, l9e l9eVar2) {
        if (i == 3) {
            float f2 = l9eVar2.c;
            float f3 = l9eVar2.a;
            float f4 = l9eVar.c;
            return (f2 > f4 || f3 >= f4) && f3 > l9eVar.a;
        }
        if (i == 4) {
            float f5 = l9eVar2.a;
            float f6 = l9eVar2.c;
            float f7 = l9eVar.a;
            return (f5 < f7 || f6 <= f7) && f6 < l9eVar.c;
        }
        if (i == 5) {
            float f8 = l9eVar2.d;
            float f9 = l9eVar2.b;
            float f10 = l9eVar.d;
            return (f8 > f10 || f9 >= f10) && f9 > l9eVar.b;
        }
        if (i != 6) {
            sz6.j("This function should only be used for 2-D focus search");
            return false;
        }
        float f11 = l9eVar2.b;
        float f12 = l9eVar2.d;
        float f13 = l9eVar.b;
        return (f11 < f13 || f12 <= f13) && f12 < l9eVar.d;
    }

    public static final long r(int i, l9e l9eVar, l9e l9eVar2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        if (i == 3) {
            f2 = l9eVar.a;
            f3 = l9eVar2.c;
        } else if (i == 4) {
            f2 = l9eVar2.a;
            f3 = l9eVar.c;
        } else if (i == 5) {
            f2 = l9eVar.b;
            f3 = l9eVar2.d;
        } else {
            if (i != 6) {
                sz6.j("This function should only be used for 2-D focus search");
                return 0L;
            }
            f2 = l9eVar2.b;
            f3 = l9eVar.d;
        }
        float f7 = f2 - f3;
        if (f7 < MTTypesetterKt.kLineSkipLimitMultiplier) {
            f7 = 0.0f;
        }
        long j = (long) f7;
        if (i == 3 || i == 4) {
            float f8 = l9eVar.b;
            f4 = ((l9eVar.d - f8) / 2.0f) + f8;
            f5 = l9eVar2.b;
            f6 = l9eVar2.d;
        } else {
            if (i != 5 && i != 6) {
                sz6.j("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f9 = l9eVar.a;
            f4 = ((l9eVar.c - f9) / 2.0f) + f9;
            f5 = l9eVar2.a;
            f6 = l9eVar2.c;
        }
        long j2 = (long) (f4 - (((f6 - f5) / 2.0f) + f5));
        return (j2 * j2) + (13 * j * j);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(java.util.ArrayList r4, defpackage.vp4 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.ja1
            if (r0 == 0) goto L13
            r0 = r5
            ja1 r0 = (defpackage.ja1) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            ja1 r0 = new ja1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.G
            int r1 = r0.H
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            int r4 = r0.F
            java.util.Iterator r1 = r0.E
            defpackage.sf5.h0(r5)
            goto L3a
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L30:
            defpackage.sf5.h0(r5)
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r1 = r4
            r4 = r5
        L3a:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L55
            java.lang.Object r5 = r1.next()
            lf9 r5 = (defpackage.lf9) r5
            r0.E = r1
            r0.F = r4
            r0.H = r2
            java.lang.Object r5 = r5.n(r0)
            m45 r3 = defpackage.m45.E
            if (r5 != r3) goto L3a
            return r3
        L55:
            iei r4 = defpackage.iei.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nvk.s(java.util.ArrayList, vp4):java.lang.Object");
    }

    public static final boolean u(int i, j70 j70Var, jt7 jt7Var, l9e l9eVar) {
        jt7 jt7VarM;
        wwb wwbVar = new wwb(0, new jt7[16]);
        if (!jt7Var.E.R) {
            b39.c("visitChildren called on an unattached node");
        }
        wwb wwbVar2 = new wwb(0, new hqb[16]);
        hqb hqbVar = jt7Var.E;
        hqb hqbVar2 = hqbVar.J;
        if (hqbVar2 == null) {
            yfd.i(wwbVar2, hqbVar);
        } else {
            wwbVar2.b(hqbVar2);
        }
        while (true) {
            int i2 = wwbVar2.G;
            if (i2 == 0) {
                break;
            }
            hqb hqbVarJ = (hqb) wwbVar2.m(i2 - 1);
            if ((hqbVarJ.H & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
                yfd.i(wwbVar2, hqbVarJ);
            } else {
                while (true) {
                    if (hqbVarJ == null) {
                        break;
                    }
                    if ((hqbVarJ.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
                        wwb wwbVar3 = null;
                        while (hqbVarJ != null) {
                            if (hqbVarJ instanceof jt7) {
                                jt7 jt7Var2 = (jt7) hqbVarJ;
                                if (jt7Var2.R) {
                                    wwbVar.b(jt7Var2);
                                }
                            } else if ((hqbVarJ.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 && (hqbVarJ instanceof qw5)) {
                                int i3 = 0;
                                for (hqb hqbVar3 = ((qw5) hqbVarJ).T; hqbVar3 != null; hqbVar3 = hqbVar3.J) {
                                    if ((hqbVar3.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            hqbVarJ = hqbVar3;
                                        } else {
                                            if (wwbVar3 == null) {
                                                wwbVar3 = new wwb(0, new hqb[16]);
                                            }
                                            if (hqbVarJ != null) {
                                                wwbVar3.b(hqbVarJ);
                                                hqbVarJ = null;
                                            }
                                            wwbVar3.b(hqbVar3);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            hqbVarJ = yfd.j(wwbVar3);
                        }
                    } else {
                        hqbVarJ = hqbVarJ.J;
                    }
                }
            }
        }
        while (wwbVar.G != 0 && (jt7VarM = m(wwbVar, l9eVar, i)) != null) {
            if (jt7VarM.r1().a) {
                return ((Boolean) j70Var.invoke(jt7VarM)).booleanValue();
            }
            if (o(i, j70Var, jt7VarM, l9eVar)) {
                return true;
            }
            wwbVar.l(jt7VarM);
        }
        return false;
    }

    public static final Boolean v(int i, j70 j70Var, jt7 jt7Var, l9e l9eVar) {
        int iOrdinal = jt7Var.u1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                jt7 jt7VarO = cok.o(jt7Var);
                if (jt7VarO == null) {
                    sz6.j("ActiveParent must have a focusedChild");
                    return null;
                }
                int iOrdinal2 = jt7VarO.u1().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolV = v(i, j70Var, jt7VarO, l9eVar);
                        if (!x44.r(boolV, Boolean.FALSE)) {
                            return boolV;
                        }
                        if (l9eVar == null) {
                            if (jt7VarO.u1() != ft7.F) {
                                sz6.j("Searching for active node in inactive hierarchy");
                                return null;
                            }
                            jt7 jt7VarL = cok.l(jt7VarO);
                            if (jt7VarL == null) {
                                sz6.j("ActiveParent must have a focusedChild");
                                return null;
                            }
                            l9eVar = cok.m(jt7VarL);
                        }
                        return Boolean.valueOf(o(i, j70Var, jt7Var, l9eVar));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            wg6.i();
                            return null;
                        }
                        sz6.j("ActiveParent must have a focusedChild");
                        return null;
                    }
                }
                if (l9eVar == null) {
                    l9eVar = cok.m(jt7VarO);
                }
                return Boolean.valueOf(o(i, j70Var, jt7Var, l9eVar));
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return jt7Var.r1().a ? (Boolean) j70Var.invoke(jt7Var) : l9eVar == null ? Boolean.valueOf(n(jt7Var, i, j70Var)) : Boolean.valueOf(u(i, j70Var, jt7Var, l9eVar));
                }
                wg6.i();
                return null;
            }
        }
        return Boolean.valueOf(n(jt7Var, i, j70Var));
    }

    public void g(Object obj) {
    }

    public abstract boolean k(Object obj);

    public abstract Object t();
}
