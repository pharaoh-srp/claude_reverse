package defpackage;

import android.view.KeyEvent;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;
import org.jsoup.helper.ValidationException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pqi {
    public static final uo8 a = new uo8(0, null);
    public static final uo8 b = new uo8(1, null);
    public static final efe c = new efe(1, (Object) null);

    public static final void a(iqb iqbVar, long j, long j2, rz7 rz7Var, ld4 ld4Var, int i) {
        e0g e0gVarB;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1428256508);
        int i2 = i | (e18Var.f(iqbVar) ? 4 : 2) | (e18Var.e(j) ? 32 : 16) | (e18Var.e(j2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            e18Var.V();
            if ((i & 1) != 0 && !e18Var.A()) {
                e18Var.T();
            }
            e18Var.q();
            float f = rz7Var != null ? rkj.c : rkj.e;
            if (rz7Var != null) {
                e18Var.a0(-1051024814);
                e0gVarB = k1g.b(rkj.b, e18Var);
                e18Var.p(false);
            } else {
                e18Var.a0(-1050967433);
                e0gVarB = k1g.b(rkj.d, e18Var);
                e18Var.p(false);
            }
            iqb iqbVarP = yfd.p(b.a(iqbVar, f, f), j, e0gVarB);
            iqb iqbVarL = fqb.E;
            if (rz7Var != null) {
                iqbVarL = gb9.L(iqbVarL, 4.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            }
            iqb iqbVarB = iqbVarP.B(iqbVarL);
            cxe cxeVarA = axe.a(ko0.e, lja.Q, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarB);
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
            if (rz7Var != null) {
                e18Var.a0(1345815094);
                zh4.h(j2, bci.a(rkj.a, e18Var), fd9.q0(541712501, new fp(7, rz7Var), e18Var), e18Var, ((i2 >> 6) & 14) | 384);
                e18Var.p(false);
            } else {
                e18Var.a0(1346141834);
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new qc1(iqbVar, j, j2, rz7Var, i, 0);
        }
    }

    public static final void b(m8j m8jVar, lfa lfaVar, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        lfaVar.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(170525131);
        int i2 = i | (e18Var.f(m8jVar) ? 4 : 2) | (e18Var.h(lfaVar) ? 32 : 16) | (e18Var.h(zy7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.f(iqbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            String strJ0 = d4c.j0(R.string.browser_takeover_webview_content_description, e18Var);
            boolean zF = e18Var.f(strJ0);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                objN = new o8(strJ0, 20);
                e18Var.k0(objN);
            }
            iqb iqbVarB = tjf.b(iqbVar, false, (bz7) objN);
            boolean z = (i2 & 896) == 256;
            Object objN2 = e18Var.N();
            if (z || objN2 == lz1Var) {
                objN2 = new kl1(3, zy7Var);
                e18Var.k0(objN2);
            }
            zy7 zy7Var2 = (zy7) objN2;
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = new zv(26);
                e18Var.k0(objN3);
            }
            bz7 bz7Var = (bz7) objN3;
            Object objN4 = e18Var.N();
            if (objN4 == lz1Var) {
                objN4 = new zv(27);
                e18Var.k0(objN4);
            }
            int i3 = lfa.c;
            mkk.a(m8jVar, zy7Var2, iqbVarB, false, null, bz7Var, (bz7) objN4, lfaVar, null, e18Var, (i2 & 14) | 18549760 | ((i2 << 18) & 29360128));
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fn(m8jVar, lfaVar, zy7Var, iqbVar, i, 11);
        }
    }

    public static final void c(zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-213584120);
        int i2 = (e18Var.h(zy7Var) ? 4 : 2) | i | (e18Var.f(iqbVar) ? 32 : 16);
        byte b2 = 0;
        int i3 = 10;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            pzg.a(b.c(iqbVar, 1.0f), gm3.b(e18Var).h, gm3.a(e18Var).o, gm3.a(e18Var).N, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, sf5.a(1.0f, gm3.a(e18Var).v), fd9.q0(1870147171, new sxa(zy7Var, i3, b2), e18Var), e18Var, 12582912, 48);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xh(zy7Var, iqbVar, i, 10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final java.lang.String r18, final defpackage.pz7 r19, defpackage.iqb r20, defpackage.mnc r21, long r22, defpackage.tkh r24, int r25, defpackage.ld4 r26, final int r27, final int r28) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqi.d(java.lang.String, pz7, iqb, mnc, long, tkh, int, ld4, int, int):void");
    }

    public static final void e(uli uliVar, List list, ud7 ud7Var, ld4 ld4Var, int i) {
        int i2;
        list.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-244062953);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(uliVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(ud7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            qnc qncVar = qf2.a;
            fqb fqbVar = fqb.E;
            kxk.g(e18Var, b.e(fqbVar, 12.0f));
            boolean z = ((i2 & 14) == 4) | ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object objN = e18Var.N();
            if (z || objN == jd4.a) {
                objN = new f2d(ud7Var, uliVar, list, 25);
                e18Var.k0(objN);
            }
            qwj.a(null, null, qvk.a, null, null, null, null, (bz7) objN, e18Var, 384, 123);
            kxk.g(e18Var, b.e(fqbVar, 12.0f));
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new c3g(uliVar, i, list, ud7Var, 8);
        }
    }

    public static final void f(uli uliVar, iqb iqbVar, ld4 ld4Var, int i) {
        String strK0;
        String str;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1567572948);
        int i2 = 4;
        int i3 = (e18Var.f(uliVar) ? 4 : 2) | i | 48;
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            String strJ0 = d4c.j0(uliVar.a, e18Var);
            int i4 = uliVar.b;
            nme nmeVar = uliVar.c;
            String strJ02 = null;
            if (nmeVar == null) {
                e18Var.a0(386491448);
                e18Var.p(false);
                strK0 = null;
            } else {
                e18Var.a0(386491449);
                if (nmeVar instanceof mme) {
                    e18Var.a0(1655310250);
                    strK0 = d4c.k0(R.string.usage_resets_in_minutes, new Object[]{Integer.valueOf(((mme) nmeVar).a)}, e18Var);
                    e18Var.p(false);
                } else if (nmeVar instanceof lme) {
                    e18Var.a0(1655313373);
                    lme lmeVar = (lme) nmeVar;
                    strK0 = d4c.k0(R.string.usage_resets_in_hours_minutes, new Object[]{Integer.valueOf(lmeVar.a), Integer.valueOf(lmeVar.b)}, e18Var);
                    e18Var.p(false);
                } else {
                    if (!(nmeVar instanceof kme)) {
                        throw ebh.u(e18Var, 1655309122, false);
                    }
                    e18Var.a0(1655316932);
                    strK0 = d4c.k0(R.string.usage_resets_at, new Object[]{((kme) nmeVar).a}, e18Var);
                    e18Var.p(false);
                }
                e18Var.p(false);
            }
            if (strK0 == null) {
                e18Var.a0(386535252);
                Integer num = uliVar.d;
                if (num == null) {
                    e18Var.a0(386535251);
                } else {
                    e18Var.a0(386535252);
                    strJ02 = d4c.j0(num.intValue(), e18Var);
                }
                e18Var.p(false);
                e18Var.p(false);
                str = strJ02;
            } else {
                e18Var.a0(-1095911669);
                e18Var.p(false);
                str = strK0;
            }
            Integer numValueOf = Integer.valueOf(i4);
            fqb fqbVar = fqb.E;
            g(strJ0, numValueOf, fqbVar, str, null, e18Var, 384, 16);
            iqbVar = fqbVar;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new nwh(uliVar, iqbVar, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(java.lang.String r35, java.lang.Integer r36, defpackage.iqb r37, java.lang.String r38, java.lang.String r39, defpackage.ld4 r40, int r41, int r42) {
        /*
            Method dump skipped, instruction units count: 767
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqi.g(java.lang.String, java.lang.Integer, iqb, java.lang.String, java.lang.String, ld4, int, int):void");
    }

    public static final void h(float f, int i, ld4 ld4Var, iqb iqbVar) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1941876092);
        int i2 = (e18Var.c(f) ? 4 : 2) | i;
        int i3 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            float fD0 = wd6.d0(f, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f);
            iqb iqbVarV = xn5.V(b.e(iqbVar, 6.0f), xve.b(3.0f));
            long j = gm3.a(e18Var).v;
            wo8 wo8Var = zni.b;
            iqb iqbVarP = yfd.p(iqbVarV, j, wo8Var);
            o5b o5bVarD = dw1.d(lja.G, false);
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
            if (fD0 > MTTypesetterKt.kLineSkipLimitMultiplier) {
                e18Var.a0(965097390);
                dw1.a(yfd.p(xn5.V(b.e(b.c(fqb.E, fD0), 6.0f), xve.b(3.0f)), gm3.a(e18Var).l, wo8Var), e18Var, 0);
                e18Var.p(false);
            } else {
                e18Var.a0(965364548);
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new g84(f, i, i3, iqbVar);
        }
    }

    public static final void i(zy7 zy7Var, iqb iqbVar, zli zliVar, qi3 qi3Var, ld4 ld4Var, int i) {
        iqb iqbVar2;
        zli zliVar2;
        qi3 qi3Var2;
        int i2;
        qi3 qi3Var3;
        zli zliVar3;
        iqb iqbVar3;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-787600315);
        int i3 = i | (e18Var.h(zy7Var) ? 4 : 2) | 1200;
        int i4 = 0;
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            e18Var.V();
            int i5 = i & 1;
            int i6 = 3;
            tp4 tp4Var = null;
            lz1 lz1Var = jd4.a;
            if (i5 == 0 || e18Var.A()) {
                m7f m7fVar = (m7f) e18Var.j(gr9.b);
                boolean zH = e18Var.h(m7fVar);
                Object objN = e18Var.N();
                if (zH || objN == lz1Var) {
                    objN = new t2g(m7fVar, i6);
                    e18Var.k0(objN);
                }
                kce kceVar = jce.a;
                zli zliVar4 = (zli) fd9.r0(kceVar.b(zli.class), oq5.B(kceVar.b(zli.class)), (bz7) objN, e18Var);
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN2 = e18Var.N();
                if (zF || objN2 == lz1Var) {
                    objN2 = m7fVarN.a(kceVar.b(qi3.class), null, null);
                    e18Var.k0(objN2);
                }
                e18Var.p(false);
                e18Var.p(false);
                i2 = i3 & (-8065);
                qi3Var3 = (qi3) objN2;
                zliVar3 = zliVar4;
                iqbVar3 = fqb.E;
            } else {
                e18Var.T();
                i2 = i3 & (-8065);
                iqbVar3 = iqbVar;
                zliVar3 = zliVar;
                qi3Var3 = qi3Var;
            }
            e18Var.q();
            boolean zH2 = e18Var.h(qi3Var3);
            Object objN3 = e18Var.N();
            if (zH2 || objN3 == lz1Var) {
                objN3 = new ami(qi3Var3, tp4Var, i4);
                e18Var.k0(objN3);
            }
            csg.g((bz7) objN3, e18Var, 0, 1);
            boolean zF2 = e18Var.f(zliVar3);
            Object objN4 = e18Var.N();
            if (zF2 || objN4 == lz1Var) {
                objN4 = new l6b(zliVar3, tp4Var, 13);
                e18Var.k0(objN4);
            }
            fd9.i(e18Var, (pz7) objN4, iei.a);
            ssj.c(d4c.j0(R.string.usage_title, e18Var), zy7Var, iqbVar3, null, null, 0L, fd9.q0(-528772716, new lca(18, zliVar3), e18Var), e18Var, ((i2 << 3) & 112) | 1573248, 56);
            iqbVar2 = iqbVar3;
            zliVar2 = zliVar3;
            qi3Var2 = qi3Var3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            zliVar2 = zliVar;
            qi3Var2 = qi3Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v3e(zy7Var, iqbVar2, (iwe) zliVar2, (Object) qi3Var2, i, 15);
        }
    }

    public static final boolean j(KeyEvent keyEvent) {
        return keyEvent.getKeyCode() == 4 && ssj.j(keyEvent) == 1;
    }

    public static u56 k(boolean z, boolean z2, e18 e18Var) {
        int i;
        int i2;
        int i3;
        int i4;
        zb0 zb0VarF;
        if (!z2) {
            i = 1066154753;
            i2 = R.string.ghost_mode_disclaimer_without_memory_line1;
        } else if (z) {
            i = 1066158072;
            i2 = R.string.ghost_mode_disclaimer_raven_line1;
        } else {
            i = 1066161019;
            i2 = R.string.ghost_mode_disclaimer_consumer_line1;
        }
        zb0 zb0VarF2 = qy1.f(e18Var, i, i2, e18Var, false);
        if (z2) {
            if (z) {
                i3 = 1066167192;
                i4 = R.string.ghost_mode_disclaimer_raven_line2;
            } else {
                i3 = 1066170139;
                i4 = R.string.ghost_mode_disclaimer_consumer_line2;
            }
            zb0VarF = qy1.f(e18Var, i3, i4, e18Var, false);
        } else {
            e18Var.a0(-1308589112);
            e18Var.p(false);
            zb0VarF = null;
        }
        return new u56(zb0VarF2, zb0VarF, !z2 ? "https://privacy.claude.com/articles/10023580" : tyg.HOW_MEMORY_WORKS.a());
    }

    public static void l(String str, boolean z) {
        if (!z) {
            throw new ValidationException(str);
        }
    }

    public static void m(boolean z) {
        if (!z) {
            throw new ValidationException("Must be true");
        }
    }

    public static void n(String str) {
        if (str == null || str.length() == 0) {
            throw new ValidationException("String must not be empty");
        }
    }

    public static void o(String str, String str2) {
        if (str.length() == 0) {
            throw new ValidationException(str2);
        }
    }

    public static void p(Object obj) {
        if (obj == null) {
            throw new ValidationException("Object must not be null");
        }
    }
}
