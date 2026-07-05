package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nuk {
    public static final ta4 a = new ta4(61412262, false, new wb4(26));
    public static final ta4 b = new ta4(86258338, false, new cc4(8));
    public static final ta4 c = new ta4(-1427526668, false, new cc4(9));
    public static final ta4 d = new ta4(1053647925, false, new cc4(10));
    public static boolean e;

    public static final void a(String str, iqb iqbVar, Integer num, ld4 ld4Var, int i) {
        e18 e18Var;
        zb0 zb0VarN;
        str.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1389418911);
        int i2 = i | (e18Var2.f(str) ? 4 : 2) | (e18Var2.f(iqbVar) ? 32 : 16) | (e18Var2.f(num) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var2.Q(i2 & 1, (i2 & 147) != 146)) {
            iqb iqbVar2 = e93.a;
            iqb iqbVarL = gb9.L(iqbVar, 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var2, 0);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarL);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, cd4.f, q64VarA);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            long j = gm3.a(e18Var2).M;
            long j2 = gm3.a(e18Var2).O;
            boolean zE = ((i2 & 896) == 256) | ((i2 & 14) == 4) | e18Var2.e(j) | e18Var2.e(j2);
            Object objN = e18Var2.N();
            if (zE || objN == jd4.a) {
                if (num == null) {
                    zb0VarN = new zb0(str);
                } else {
                    int iE0 = wd6.e0(num.intValue(), 0, str.length());
                    if (1 <= iE0 && iE0 < str.length() && Character.isLowSurrogate(str.charAt(iE0))) {
                        iE0--;
                    }
                    xb0 xb0Var = new xb0();
                    int iM = xb0Var.m(new egg(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                    try {
                        xb0Var.d(0, iE0, str);
                        xb0Var.j(iM);
                        iM = xb0Var.m(new egg(j2, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                        try {
                            xb0Var.d(iE0, str.length(), str);
                            xb0Var.j(iM);
                            zb0VarN = xb0Var.n();
                        } finally {
                        }
                    } finally {
                    }
                }
                objN = zb0VarN;
                e18Var2.k0(objN);
            }
            tjh.c((zb0) objN, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, (tkh) ((wk) gm3.c(e18Var2).e.F).f, e18Var2, 0, 0, 262142);
            e18Var = e18Var2;
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new sx0(str, iqbVar, num, i, 0);
        }
    }

    public static final void b(jz0 jz0Var, iqb iqbVar, kg3 kg3Var, pz7 pz7Var, ld4 ld4Var, int i) {
        s6a s6aVar;
        jz0Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(56416721);
        int i2 = i | (e18Var.f(jz0Var) ? 4 : 2) | (e18Var.f(iqbVar) ? 32 : 16) | (e18Var.h(kg3Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(pz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            iqb iqbVar2 = e93.a;
            iqb iqbVarL = gb9.L(iqbVar, 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarL);
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
            if (kg3Var == null) {
                e18Var.a0(161991598);
                s6a s6aVar2 = (s6a) e18Var.j(u6a.a);
                e18Var.p(false);
                s6aVar = s6aVar2;
            } else {
                e18Var.a0(161990234);
                e18Var.p(false);
                s6aVar = kg3Var;
            }
            jlk.f(jz0Var, null, null, s6aVar, null, null, pz7Var, e18Var, (i2 & 14) | ((i2 << 12) & 29360128), 110);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fn(i, 3, pz7Var, iqbVar, jz0Var, kg3Var);
        }
    }

    public static final void c(bz7 bz7Var, iqb iqbVar, ta4 ta4Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1961963626);
        int i2 = (e18Var.h(bz7Var) ? 4 : 2) | i | (e18Var.f(iqbVar) ? 32 : 16);
        int i3 = 0;
        int i4 = 1;
        if (!e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            e18Var.T();
        } else if (bz7Var != null) {
            e18Var.a0(1351736619);
            lnk.c(bz7Var, iqbVar, fd9.q0(374065571, new rx0(ta4Var, i3), e18Var), e18Var, (i2 & 112) | (i2 & 14) | 384);
            e18Var.p(false);
        } else {
            e18Var.a0(1351869795);
            xvk.c(iqbVar, fd9.q0(85593373, new rx0(ta4Var, i4), e18Var), e18Var, ((i2 >> 3) & 14) | 48, 0);
            e18Var.p(false);
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new m6(bz7Var, iqbVar, ta4Var, i, 11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0116  */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [bz7] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v8, types: [bz7] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final java.lang.Object r30, final java.lang.String r31, final defpackage.iqb r32, defpackage.yw8 r33, defpackage.bpc r34, defpackage.bpc r35, defpackage.bpc r36, defpackage.bz7 r37, defpackage.tt r38, defpackage.jo4 r39, float r40, int r41, boolean r42, defpackage.ld4 r43, final int r44, final int r45, final int r46) {
        /*
            Method dump skipped, instruction units count: 717
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nuk.d(java.lang.Object, java.lang.String, iqb, yw8, bpc, bpc, bpc, bz7, tt, jo4, float, int, boolean, ld4, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final java.lang.Object r27, final java.lang.String r28, final defpackage.iqb r29, defpackage.yw8 r30, defpackage.bz7 r31, defpackage.tt r32, defpackage.jo4 r33, float r34, int r35, boolean r36, defpackage.ld4 r37, final int r38, final int r39) {
        /*
            Method dump skipped, instruction units count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nuk.e(java.lang.Object, java.lang.String, iqb, yw8, bz7, tt, jo4, float, int, boolean, ld4, int, int):void");
    }

    public static final void f(ta4 ta4Var, String str, iqb iqbVar, pz7 pz7Var, ld4 ld4Var, int i) {
        int i2;
        str.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-242996886);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(ta4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= e18Var.h(pz7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if (e18Var.Q(i3 & 1, (i3 & 9363) != 9362)) {
            iqb iqbVarT = ez1.t(iqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).u, gm3.b(e18Var).c);
            vo1 vo1Var = lja.S;
            q64 q64VarA = p64.a(ko0.c, vo1Var, e18Var, 0);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarT);
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
            int i4 = i3;
            ho0 ho0Var = new ho0(8.0f, true, new sz6(1));
            wo1 wo1Var = lja.Q;
            fqb fqbVar = fqb.E;
            iqb iqbVarK = gb9.K(fqbVar, 16.0f, 12.0f);
            cxe cxeVarA = axe.a(ho0Var, wo1Var, e18Var, 54);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarK);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, cxeVarA);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            ta4Var.invoke(e18Var, Integer.valueOf(i4 & 14));
            ho0 ho0Var2 = new ho0(2.0f, true, new sz6(1));
            hw9 hw9Var = new hw9(1.0f, true);
            q64 q64VarA2 = p64.a(ho0Var2, vo1Var, e18Var, 6);
            int iHashCode3 = Long.hashCode(e18Var.T);
            hyc hycVarL3 = e18Var.l();
            iqb iqbVarE3 = kxk.E(e18Var, hw9Var);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, q64VarA2);
            d4c.i0(e18Var, z80Var2, hycVarL3);
            ij0.t(iHashCode3, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE3);
            tjh.b(str, null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, (tkh) ((wk) gm3.c(e18Var).e.F).i, e18Var, (i4 >> 3) & 14, 24960, 110586);
            e18Var = e18Var;
            e18Var.a0(1828193928);
            e18Var.p(false);
            e18Var.p(true);
            e18Var.p(true);
            if (pz7Var != null) {
                e18Var.a0(-705872305);
                iuj.e(gb9.L(fqbVar, ((cz5) e18Var.j(ve4.h)).c0(1), MTTypesetterKt.kLineSkipLimitMultiplier, 2), MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).u, e18Var, 48, 0);
                sq6.B((i4 >> 12) & 14, pz7Var, e18Var, false);
            } else {
                e18Var.a0(-705504242);
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new p3h(ta4Var, str, iqbVar, pz7Var, i, 4);
        }
    }

    public static final q68 g(ArrayList arrayList) {
        q68 q68VarD;
        Iterator it = arrayList.iterator();
        o68 o68Var = o68.a;
        while (it.hasNext()) {
            q68 q68Var = (q68) it.next();
            if (q68Var != null && (q68VarD = o68Var.d(q68Var)) != null) {
                o68Var = q68VarD;
            }
        }
        return o68Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(defpackage.jfe r5) {
        /*
            java.util.ArrayList r0 = r5.b
            boolean r1 = r0.isEmpty()
            r2 = 1
            if (r1 != 0) goto L55
            if (r0 == 0) goto L12
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L12
            goto L27
        L12:
            java.util.Iterator r1 = r0.iterator()
        L16:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L27
            java.lang.Object r3 = r1.next()
            qk6 r3 = (defpackage.qk6) r3
            boolean r3 = r3 instanceof defpackage.wk6
            if (r3 != 0) goto L16
            goto L55
        L27:
            java.util.Iterator r0 = r0.iterator()
        L2b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6c
            java.lang.Object r1 = r0.next()
            qk6 r1 = (defpackage.qk6) r1
            r1.getClass()
            wk6 r1 = (defpackage.wk6) r1
            java.util.ArrayList r1 = r1.b
            int r3 = r1.size()
            if (r3 == r2) goto L2b
            rk6 r3 = new rk6
            r3.<init>()
            java.util.ArrayList r4 = r3.b
            defpackage.b54.t0(r4, r1)
            r1.clear()
            r1.add(r3)
            goto L2b
        L55:
            int r1 = r0.size()
            if (r1 != r2) goto L5c
            goto L6c
        L5c:
            rk6 r1 = new rk6
            r1.<init>()
            java.util.ArrayList r2 = r1.b
            defpackage.b54.t0(r2, r0)
            r0.clear()
            r0.add(r1)
        L6c:
            i(r5)
            jua r0 = new jua
            r1 = 26
            r0.<init>(r1)
            j(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nuk.h(jfe):void");
    }

    public static final void i(zk6 zk6Var) {
        ArrayList<qk6> arrayList = zk6Var.b;
        for (qk6 qk6Var : arrayList) {
            if (qk6Var instanceof zk6) {
                i((zk6) qk6Var);
            }
        }
        km8 km8Var = (km8) zk6Var.b().a(bw9.V, null);
        w46 w46Var = u46.a;
        if (((km8Var != null ? km8Var.a : w46Var) instanceof u46) && (arrayList == null || !arrayList.isEmpty())) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                km8 km8Var2 = (km8) ((qk6) it.next()).b().a(bw9.X, null);
                if ((km8Var2 != null ? km8Var2.a : null) instanceof p46) {
                    zk6Var.c(zk6Var.b().d(new km8(p46.a)));
                    break;
                }
            }
        }
        gaj gajVar = (gaj) zk6Var.b().a(bw9.W, null);
        if (gajVar != null) {
            w46Var = gajVar.a;
        }
        if (w46Var instanceof u46) {
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    gaj gajVar2 = (gaj) ((qk6) it2.next()).b().a(bw9.Y, null);
                    if ((gajVar2 != null ? gajVar2.a : null) instanceof p46) {
                        zk6Var.c(ovj.d(zk6Var.b()));
                        return;
                    }
                }
            }
        }
    }

    public static final void j(zk6 zk6Var, jua juaVar) {
        int i = 0;
        for (Object obj : zk6Var.b) {
            int i2 = i + 1;
            if (i < 0) {
                x44.n0();
                throw null;
            }
            qk6 qk6Var = (qk6) juaVar.invoke((qk6) obj);
            zk6Var.b.set(i, qk6Var);
            if (qk6Var instanceof zk6) {
                j((zk6) qk6Var, juaVar);
            }
            i = i2;
        }
    }

    public static final LinkedHashMap k(zk6 zk6Var) {
        ArrayList arrayList = zk6Var.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                x44.n0();
                throw null;
            }
            qk6 qk6Var = (qk6) obj;
            q68 q68VarB = qk6Var.b();
            cpc cpcVar = q68VarB.b(be5.X) ? (cpc) q68VarB.a(bw9.U, new cpc(null, o68.a)) : new cpc(null, q68VarB);
            pb pbVar = (pb) cpcVar.E;
            q68 q68Var = (q68) cpcVar.F;
            n9 n9Var = pbVar != null ? pbVar.a : null;
            cpc cpcVar2 = n9Var instanceof us9 ? new cpc(n9Var, q68Var) : new cpc(null, q68Var);
            if (qk6Var instanceof zk6) {
                for (Map.Entry entry : k((zk6) qk6Var).entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    Object arrayList2 = linkedHashMap.get(str);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(str, arrayList2);
                    }
                    ((List) arrayList2).addAll(list);
                }
            }
            i = i2;
        }
        return linkedHashMap;
    }
}
