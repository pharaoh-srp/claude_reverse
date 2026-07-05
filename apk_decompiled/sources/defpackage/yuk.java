package defpackage;

import android.net.Uri;
import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yuk {
    public static final ta4 a = new ta4(545056642, false, new ic4(1));
    public static final ta4 b = new ta4(-1052626979, false, new ic4(2));

    public static final void a(String str, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(23893653);
        int i3 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.f(iqbVar) ? 32 : 16);
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            wo1 wo1Var = lja.Q;
            ho0 ho0Var = new ho0(8.0f, true, new sz6(1));
            iqb iqbVarC = b.c(iqbVar, 1.0f);
            qnc qncVar = qf2.a;
            iqb iqbVarK = gb9.K(yfd.p(xn5.V(iqbVarC, xve.b(16.0f)), gm3.a(e18Var).n, zni.b), 12.0f, 10.0f);
            cxe cxeVarA = axe.a(ho0Var, wo1Var, e18Var, 54);
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
            iv1.b(ud0.D0, null, null, ef2.F, gm3.a(e18Var).c, e18Var, 3120, 4);
            tjh.b(str, null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, i3 & 14, 0, 131066);
            e18Var = e18Var;
            i2 = 1;
            e18Var.p(true);
        } else {
            i2 = 1;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ip(str, iqbVar, i, i2);
        }
    }

    public static final void b(bz7 bz7Var, zy7 zy7Var, iqb iqbVar, k75 k75Var, qi3 qi3Var, pl3 pl3Var, ld4 ld4Var, int i) {
        iqb iqbVar2;
        k75 k75Var2;
        qi3 qi3Var2;
        pl3 pl3Var2;
        k75 k75Var3;
        int i2;
        iqb iqbVar3;
        pl3 pl3Var3;
        qi3 qi3Var3;
        bz7Var.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(519170516);
        int i3 = 4;
        int i4 = i | (e18Var.h(bz7Var) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16) | 75136;
        if (e18Var.Q(i4 & 1, (74899 & i4) != 74898)) {
            e18Var.V();
            int i5 = i & 1;
            tp4 tp4Var = null;
            lz1 lz1Var = jd4.a;
            if (i5 == 0 || e18Var.A()) {
                m7f m7fVar = (m7f) e18Var.j(gr9.b);
                boolean zH = e18Var.h(m7fVar);
                Object objN = e18Var.N();
                if (zH || objN == lz1Var) {
                    objN = new di(m7fVar, 12);
                    e18Var.k0(objN);
                }
                kce kceVar = jce.a;
                k75Var3 = (k75) fd9.r0(kceVar.b(k75.class), oq5.B(kceVar.b(k75.class)), (bz7) objN, e18Var);
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN2 = e18Var.N();
                if (zF || objN2 == lz1Var) {
                    objN2 = m7fVarN.a(kceVar.b(qi3.class), null, null);
                    e18Var.k0(objN2);
                }
                e18Var.p(false);
                e18Var.p(false);
                qi3 qi3Var4 = (qi3) objN2;
                m7f m7fVarN2 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF2 = e18Var.f(null) | e18Var.f(m7fVarN2);
                Object objN3 = e18Var.N();
                if (zF2 || objN3 == lz1Var) {
                    objN3 = m7fVarN2.a(kceVar.b(pl3.class), null, null);
                    e18Var.k0(objN3);
                }
                e18Var.p(false);
                e18Var.p(false);
                i2 = i4 & (-523265);
                iqbVar3 = fqb.E;
                pl3Var3 = (pl3) objN3;
                qi3Var3 = qi3Var4;
            } else {
                e18Var.T();
                i2 = i4 & (-523265);
                iqbVar3 = iqbVar;
                k75Var3 = k75Var;
                qi3Var3 = qi3Var;
                pl3Var3 = pl3Var;
            }
            e18Var.q();
            boolean zH2 = e18Var.h(qi3Var3);
            Object objN4 = e18Var.N();
            if (zH2 || objN4 == lz1Var) {
                objN4 = new gw(qi3Var3, tp4Var, 10);
                e18Var.k0(objN4);
            }
            csg.g((bz7) objN4, e18Var, 0, 1);
            Object objN5 = e18Var.N();
            if (objN5 == lz1Var) {
                objN5 = sq6.p(e18Var);
            }
            ybg ybgVar = (ybg) objN5;
            r4g r4gVarS = gb9.S(u4g.F, null, null, zy7Var, e18Var, ((i2 << 6) & 7168) | 6, 6);
            String strJ0 = d4c.j0(R.string.project_create_screen_title, e18Var);
            ta4 ta4VarQ0 = fd9.q0(486666321, new ci(i3, k75Var3), e18Var);
            k75 k75Var4 = k75Var3;
            pl3 pl3Var4 = pl3Var3;
            ta4 ta4VarQ02 = fd9.q0(413081743, new mn(k75Var4, ybgVar, r4gVarS, pl3Var4, bz7Var, 2), e18Var);
            iqb iqbVar4 = iqbVar3;
            vkc.a(r4gVarS, strJ0, iqbVar4, null, false, false, null, null, null, null, ta4VarQ0, ybgVar, ta4VarQ02, e18Var, 392, 3504, 2040);
            iqbVar2 = iqbVar4;
            k75Var2 = k75Var4;
            pl3Var2 = pl3Var4;
            qi3Var2 = qi3Var3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            k75Var2 = k75Var;
            qi3Var2 = qi3Var;
            pl3Var2 = pl3Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ne(bz7Var, zy7Var, iqbVar2, k75Var2, qi3Var2, pl3Var2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x022d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final java.lang.String r42, final defpackage.bz7 r43, final java.lang.String r44, final defpackage.bz7 r45, final java.lang.String r46, final boolean r47, final boolean r48, final boolean r49, final defpackage.bz7 r50, boolean r51, defpackage.ld4 r52, final int r53, final int r54, final int r55) {
        /*
            Method dump skipped, instruction units count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yuk.c(java.lang.String, bz7, java.lang.String, bz7, java.lang.String, boolean, boolean, boolean, bz7, boolean, ld4, int, int, int):void");
    }

    public static final void d(final o3f o3fVar, final Boolean bool, zy7 zy7Var, ld4 ld4Var, final int i, final int i2) {
        int i3;
        e18 e18Var;
        final zy7 zy7Var2;
        r7e r7eVarS;
        pz7 pz7Var;
        zy7 zy7Var3;
        zy7 zy7Var4;
        o3fVar.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-357181011);
        int i4 = i | (e18Var2.f(o3fVar) ? 4 : 2) | (e18Var2.f(bool) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
        } else {
            i3 = i4 | (e18Var2.h(zy7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC);
        }
        int i6 = i3;
        if (e18Var2.Q(i6 & 1, (i6 & 147) != 146)) {
            lz1 lz1Var = jd4.a;
            if (i5 != 0) {
                Object objN = e18Var2.N();
                if (objN == lz1Var) {
                    objN = new oob(19);
                    e18Var2.k0(objN);
                }
                zy7Var3 = (zy7) objN;
            } else {
                zy7Var3 = zy7Var;
            }
            if (bool == null) {
                final zy7 zy7Var5 = zy7Var3;
                r7eVarS = e18Var2.s();
                if (r7eVarS != null) {
                    final int i7 = 0;
                    pz7Var = new pz7(o3fVar, bool, zy7Var5, i, i2, i7) { // from class: i4i
                        public final /* synthetic */ int E;
                        public final /* synthetic */ o3f F;
                        public final /* synthetic */ Boolean G;
                        public final /* synthetic */ zy7 H;
                        public final /* synthetic */ int I;

                        {
                            this.E = i7;
                            this.I = i2;
                        }

                        @Override // defpackage.pz7
                        public final Object invoke(Object obj, Object obj2) {
                            int i8 = this.E;
                            iei ieiVar = iei.a;
                            switch (i8) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iP0 = x44.p0(1);
                                    yuk.d(this.F, this.G, this.H, (ld4) obj, iP0, this.I);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iP02 = x44.p0(1);
                                    yuk.d(this.F, this.G, this.H, (ld4) obj, iP02, this.I);
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    r7eVarS.d = pz7Var;
                }
                return;
            }
            Object objN2 = e18Var2.N();
            if (objN2 == lz1Var) {
                objN2 = mpk.P(Boolean.FALSE);
                e18Var2.k0(objN2);
            }
            nwb nwbVar = (nwb) objN2;
            boolean z = ((i6 & 14) == 4) | ((i6 & 112) == 32) | ((i6 & 896) == 256);
            Object objN3 = e18Var2.N();
            if (z || objN3 == lz1Var) {
                zy7 zy7Var6 = zy7Var3;
                wvc wvcVar = new wvc(o3fVar, bool, zy7Var6, nwbVar, 8);
                zy7Var4 = zy7Var6;
                e18Var2.k0(wvcVar);
                objN3 = wvcVar;
            } else {
                zy7Var4 = zy7Var3;
            }
            e18Var = e18Var2;
            mwa.e(o3fVar, bool, null, (bz7) objN3, e18Var, i6 & 126);
            zy7Var2 = zy7Var4;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            zy7Var2 = zy7Var;
        }
        r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final int i8 = 1;
            pz7Var = new pz7(o3fVar, bool, zy7Var2, i, i2, i8) { // from class: i4i
                public final /* synthetic */ int E;
                public final /* synthetic */ o3f F;
                public final /* synthetic */ Boolean G;
                public final /* synthetic */ zy7 H;
                public final /* synthetic */ int I;

                {
                    this.E = i8;
                    this.I = i2;
                }

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    int i82 = this.E;
                    iei ieiVar = iei.a;
                    switch (i82) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iP0 = x44.p0(1);
                            yuk.d(this.F, this.G, this.H, (ld4) obj, iP0, this.I);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iP02 = x44.p0(1);
                            yuk.d(this.F, this.G, this.H, (ld4) obj, iP02, this.I);
                            break;
                    }
                    return ieiVar;
                }
            };
            r7eVarS.d = pz7Var;
        }
    }

    public static c09 e(Uri uri, String str, String str2) {
        String str3;
        uri.getClass();
        String[] strArrSplit = str2.split("/");
        int i = 0;
        while (true) {
            if (i >= 5) {
                str3 = null;
                break;
            }
            str3 = c09.d[i];
            if (fsk.e(strArrSplit, str3.split("/"))) {
                break;
            }
            i++;
        }
        if (str3 != null) {
            return new c09(uri, str, str2);
        }
        return null;
    }

    public static iaf f() {
        return iaf.e;
    }

    public static boolean g(fe8 fe8Var, long j, long j2, long j3, long j4, long j5) {
        long j6 = j - j5;
        long j7 = j + j5;
        long j8 = j3;
        while (j8 < j6 && j2 - j8 >= j4) {
            long j9 = j8 + j4;
            if (j9 >= j6 && j6 - j8 < j9 - j6) {
                break;
            }
            char[] cArr = (char[]) fe8Var.e;
            int i = fe8Var.b - 1;
            cArr[i] = (char) (cArr[i] - 1);
            j8 = j9;
        }
        if (j8 < j7 && j2 - j8 >= j4) {
            long j10 = j8 + j4;
            if (j10 < j7 || j7 - j8 > j10 - j7) {
                return false;
            }
        }
        return 2 * j5 <= j8 && j8 <= j2 - (4 * j5);
    }
}
