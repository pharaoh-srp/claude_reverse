package defpackage;

import androidx.compose.foundation.b;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class otj {
    public static final ta4 a = new ta4(-115984305, false, new m14(20));
    public static final ta4 b = new ta4(-255133654, false, new m14(21));
    public static final ta4 c = new ta4(1577326505, false, new m14(22));
    public static final String[] d = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] e = {44100, 48000, 32000};
    public static final int[] f = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] g = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] h = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] i = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] j = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static final void a(final g44 g44Var, final zy7 zy7Var, final iqb iqbVar, final boolean z, ld4 ld4Var, final int i2) {
        e18 e18Var;
        r7e r7eVarS;
        pz7 pz7Var;
        List list = g44Var.d;
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-152516863);
        int i3 = i2 | (e18Var2.h(g44Var) ? 4 : 2) | (e18Var2.h(zy7Var) ? 32 : 16) | (e18Var2.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.g(z) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        boolean z2 = true;
        if (e18Var2.Q(i3 & 1, (i3 & 1171) != 1170)) {
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((rvh) it.next()).f == qvh.E) {
                        z2 = false;
                        break;
                    }
                }
            }
            rvh rvhVar = (rvh) w44.V0(list);
            if (!z2 && rvhVar != null) {
                e18Var2.a0(445881047);
                b((i3 & 112) | 3072 | (i3 & 896), 0, e18Var2, zy7Var, iqbVar, ntk.b(rvhVar, e18Var2, 0), true);
                e18Var2.p(false);
                r7eVarS = e18Var2.s();
                if (r7eVarS != null) {
                    final int i4 = 0;
                    pz7Var = new pz7(g44Var, zy7Var, iqbVar, z, i2, i4) { // from class: r22
                        public final /* synthetic */ int E;
                        public final /* synthetic */ g44 F;
                        public final /* synthetic */ zy7 G;
                        public final /* synthetic */ iqb H;
                        public final /* synthetic */ boolean I;

                        {
                            this.E = i4;
                        }

                        @Override // defpackage.pz7
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.E;
                            iei ieiVar = iei.a;
                            switch (i5) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iP0 = x44.p0(1);
                                    otj.a(this.F, this.G, this.H, this.I, (ld4) obj, iP0);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iP02 = x44.p0(1);
                                    otj.a(this.F, this.G, this.H, this.I, (ld4) obj, iP02);
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    r7eVarS.d = pz7Var;
                }
                return;
            }
            e18Var = e18Var2;
            e18Var.a0(446321185);
            e18Var.p(false);
            int i5 = i3 >> 3;
            c(zy7Var, iqbVar, fd9.q0(-2110851487, new s50(g44Var, z, 3), e18Var), e18Var, (i5 & 112) | (i5 & 14) | 384);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final int i6 = 1;
            pz7Var = new pz7(g44Var, zy7Var, iqbVar, z, i2, i6) { // from class: r22
                public final /* synthetic */ int E;
                public final /* synthetic */ g44 F;
                public final /* synthetic */ zy7 G;
                public final /* synthetic */ iqb H;
                public final /* synthetic */ boolean I;

                {
                    this.E = i6;
                }

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.E;
                    iei ieiVar = iei.a;
                    switch (i52) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iP0 = x44.p0(1);
                            otj.a(this.F, this.G, this.H, this.I, (ld4) obj, iP0);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iP02 = x44.p0(1);
                            otj.a(this.F, this.G, this.H, this.I, (ld4) obj, iP02);
                            break;
                    }
                    return ieiVar;
                }
            };
            r7eVarS.d = pz7Var;
        }
    }

    public static final void b(int i2, int i3, ld4 ld4Var, zy7 zy7Var, iqb iqbVar, String str, boolean z) {
        int i4;
        boolean z2;
        str.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-910764700);
        if ((i2 & 6) == 0) {
            i4 = (e18Var.f(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i5 = i3 & 8;
        if (i5 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= e18Var.g(z) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        int i6 = 1;
        if (e18Var.Q(i4 & 1, (i4 & 1171) != 1170)) {
            z2 = i5 != 0 ? false : z;
            int i7 = i4 >> 3;
            c(zy7Var, iqbVar, fd9.q0(1799101636, new qk1(z2, str, i6), e18Var), e18Var, (i7 & 112) | (i7 & 14) | 384);
        } else {
            e18Var.T();
            z2 = z;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new s22(str, zy7Var, iqbVar, z2, i2, i3, 0);
        }
    }

    public static final void c(zy7 zy7Var, iqb iqbVar, ta4 ta4Var, ld4 ld4Var, int i2) {
        int i3;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-999873255);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.h(zy7Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            wo1 wo1Var = lja.Q;
            iqb iqbVarK = gb9.K(b.c(xn5.V(fd9.h0(androidx.compose.foundation.layout.b.c(iqbVar, 1.0f), new p6(9)), xve.b(12.0f)), false, null, null, null, zy7Var, 15), 8.0f, 10.0f);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var, 48);
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
            d4c.i0(e18Var, cd4.f, cxeVarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            ta4Var.invoke(fxe.a, e18Var, Integer.valueOf(((i3 >> 3) & 112) | 6));
            kxk.g(e18Var, androidx.compose.foundation.layout.b.t(fqb.E, 4.0f));
            iv1.b(ud0.C, null, null, ef2.F, gm3.a(e18Var).O, e18Var, 3120, 4);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new op1(zy7Var, iqbVar, ta4Var, i2, 1);
        }
    }

    public static final void d(l46 l46Var, iqb iqbVar, ld4 ld4Var, int i2) {
        e18 e18Var;
        iqb iqbVar2;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1035081770);
        int i3 = (e18Var2.f(l46Var) ? 4 : 2) | i2 | 48;
        if (e18Var2.Q(i3 & 1, (i3 & 19) != 18)) {
            e18Var2.a0(1718835234);
            xb0 xb0Var = new xb0();
            int iM = xb0Var.m(new egg(gm3.a(e18Var2).D, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
            try {
                xb0Var.h("+" + l46Var.a);
                xb0Var.j(iM);
                iM = xb0Var.m(new egg(gm3.a(e18Var2).z, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                try {
                    xb0Var.h(" -" + l46Var.b);
                    xb0Var.j(iM);
                    zb0 zb0VarN = xb0Var.n();
                    e18Var2.p(false);
                    tkh tkhVar = ((jm3) gm3.c(e18Var2).e.E).g;
                    iqbVar2 = fqb.E;
                    e18Var = e18Var2;
                    tjh.c(zb0VarN, iqbVar2, 0L, 0L, 0L, null, 0L, 0, false, 1, 0, null, null, tkhVar, e18Var, 48, 24576, 245756);
                } finally {
                }
            } finally {
            }
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new kn(l46Var, iqbVar2, i2, 15);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final java.lang.String r34, final boolean r35, final boolean r36, final defpackage.zy7 r37, final defpackage.zy7 r38, final defpackage.zy7 r39, defpackage.iqb r40, java.lang.String r41, defpackage.ybg r42, defpackage.a5g r43, defpackage.mnc r44, final defpackage.ta4 r45, defpackage.ld4 r46, final int r47, final int r48, final int r49) {
        /*
            Method dump skipped, instruction units count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.otj.e(java.lang.String, boolean, boolean, zy7, zy7, zy7, iqb, java.lang.String, ybg, a5g, mnc, ta4, ld4, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(defpackage.r4g r16, java.lang.String r17, defpackage.iqb r18, defpackage.z3g r19, boolean r20, defpackage.pz7 r21, defpackage.ta4 r22, defpackage.ld4 r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.otj.f(r4g, java.lang.String, iqb, z3g, boolean, pz7, ta4, ld4, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(defpackage.v4g r24, defpackage.zy7 r25, java.lang.String r26, defpackage.iqb r27, defpackage.z3g r28, boolean r29, boolean r30, defpackage.pz7 r31, defpackage.ta4 r32, defpackage.ld4 r33, int r34, int r35) {
        /*
            Method dump skipped, instruction units count: 705
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.otj.g(v4g, zy7, java.lang.String, iqb, z3g, boolean, boolean, pz7, ta4, ld4, int, int):void");
    }

    public static int h(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if ((i2 & (-2097152)) != -2097152 || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = e[i6];
        if (i3 == 2) {
            i7 /= 2;
        } else if (i3 == 0) {
            i7 /= 4;
        }
        int i8 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? f[i5 - 1] : g[i5 - 1]) * 12) / i7) + i8) * 4;
        }
        int i9 = i3 == 3 ? i4 == 2 ? h[i5 - 1] : i[i5 - 1] : j[i5 - 1];
        if (i3 == 3) {
            return grc.m(i9, 144, i7, i8);
        }
        return grc.m(i4 == 1 ? 72 : 144, i9, i7, i8);
    }

    public static er9 i() {
        er9 er9Var = zp3.J;
        if (er9Var != null) {
            return er9Var;
        }
        sz6.j("KoinApplication has not been started");
        return null;
    }

    public static er9 j() {
        return zp3.J;
    }

    public static final boolean k(char c2) {
        return '0' <= c2 && c2 < ':';
    }

    public static final dyc l(ld4 ld4Var) {
        m7f m7fVarB = gr9.b(ld4Var);
        e18 e18Var = (e18) ld4Var;
        boolean zH = e18Var.h(m7fVarB);
        Object objN = e18Var.N();
        if (zH || objN == jd4.a) {
            objN = new di(m7fVarB, 23);
            e18Var.k0(objN);
        }
        kce kceVar = jce.a;
        String strB = oq5.B(kceVar.b(dyc.class));
        return (dyc) fd9.r0(kceVar.b(dyc.class), strB, (bz7) objN, e18Var);
    }

    public static final String m(int i2, String str) {
        int iF0;
        if (str.length() >= i2 + 12) {
            int i3 = 0;
            if (bsg.v0("+-", str.charAt(0)) && (iF0 = bsg.F0(str, '-', 1, 4)) >= 12) {
                while (true) {
                    int i4 = i3 + 1;
                    if (str.charAt(i4) != '0') {
                        break;
                    }
                    i3 = i4;
                }
                if (iF0 - i3 < 12) {
                    return bsg.S0(1, iF0 - 10, str).toString();
                }
            }
        }
        return str;
    }
}
