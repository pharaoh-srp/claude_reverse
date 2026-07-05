package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ctk {
    public static final ta4 a = new ta4(1655940027, false, new xb4(12));

    public static final void a(String str, String str2, or4 or4Var, w05 w05Var, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        or4 or4Var2 = or4Var;
        float f = or4Var2.f;
        float f2 = or4Var2.k;
        float f3 = or4Var2.j;
        float f4 = or4Var2.i;
        float f5 = or4Var2.h;
        fx4 fx4Var = or4Var2.a;
        fx4 fx4Var2 = or4Var2.b;
        float f6 = or4Var2.c;
        w05Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-937757989);
        int i2 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.f(str2) ? 32 : 16) | (e18Var.f(or4Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(w05Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | 24576;
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            bn bnVar = new bn(str, str2, w05Var, or4Var2, 21);
            or4Var2 = or4Var2;
            ta4 ta4VarQ0 = fd9.q0(-804153758, bnVar, e18Var);
            fqb fqbVar = fqb.E;
            if (fx4Var == null && fx4Var2 == null && f6 == MTTypesetterKt.kLineSkipLimitMultiplier && f5 == MTTypesetterKt.kLineSkipLimitMultiplier && f4 == MTTypesetterKt.kLineSkipLimitMultiplier && f3 == MTTypesetterKt.kLineSkipLimitMultiplier && f2 == MTTypesetterKt.kLineSkipLimitMultiplier) {
                e18Var.a0(2014520319);
                ta4VarQ0.invoke(xn5.S(fqbVar, f), e18Var, 48);
                e18Var.p(false);
            } else {
                e18Var.a0(2014759701);
                vve vveVarB = xve.b(or4Var2.d);
                iqb iqbVarP = yfd.p(xn5.V(xn5.S(b.c(fqbVar, 1.0f), f), vveVarB), fx4Var != null ? fx4Var.a() : d54.g, vveVarB);
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
                if (fx4Var2 == null || f6 <= MTTypesetterKt.kLineSkipLimitMultiplier) {
                    e18Var.a0(-1362937443);
                    e18Var.p(false);
                } else {
                    e18Var.a0(-1363179615);
                    dw1.a(yfd.p(b.t(nw1.a.b(), f6), fx4Var2.a(), zni.b), e18Var, 0);
                    e18Var.p(false);
                }
                fqbVar = fqbVar;
                ta4VarQ0.invoke(gb9.M(fqbVar, f4 + f6, f5, f2, f3), e18Var, 48);
                e18Var.p(true);
                e18Var.p(false);
            }
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new uo(str, str2, or4Var2, w05Var, iqbVar2, i, 15);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0207 A[LOOP:0: B:113:0x0201->B:115:0x0207, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final java.lang.String r37, final java.lang.String r38, final defpackage.w05 r39, defpackage.iqb r40, long r41, boolean r43, defpackage.ld4 r44, final int r45, final int r46) {
        /*
            Method dump skipped, instruction units count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctk.b(java.lang.String, java.lang.String, w05, iqb, long, boolean, ld4, int, int):void");
    }

    public static final void c(q68 q68Var, int i, ta4 ta4Var, ld4 ld4Var, int i2) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1208072102);
        int i3 = 2;
        int i4 = 4;
        if ((((e18Var.f(q68Var) ? 4 : 2) | i2 | 48 | (e18Var.d(i) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC)) & 1171) == 1170 && e18Var.C()) {
            e18Var.T();
        } else {
            e18Var.b0(1849434622);
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = zwe.E;
                e18Var.k0(objN);
            }
            byte b = 0;
            e18Var.p(false);
            zy7 zy7Var = (zy7) ((jm9) objN);
            e18Var.b0(-683746039);
            e18Var.b0(-548224868);
            if (!(e18Var.a instanceof gn0)) {
                iuj.A();
                throw null;
            }
            e18Var.Y();
            if (e18Var.S) {
                e18Var.k(zy7Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, new qte(b, i3), q68Var);
            d4c.i0(e18Var, new qte(b, 3), new rt(i));
            d4c.i0(e18Var, new qte(b, i4), new pt(0));
            ta4Var.invoke(exe.a, e18Var, 54);
            e18Var.p(true);
            e18Var.p(false);
            e18Var.p(false);
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new n64(q68Var, i, ta4Var, i2, 1);
        }
    }

    public static mc1 d(kri kriVar) {
        long jI = 0;
        String strF = "";
        String strF2 = "";
        while (true) {
            int iG = kriVar.g();
            if (iG == 0) {
                return new mc1(jI, strF, strF2);
            }
            int i = iG >>> 3;
            int i2 = iG & 7;
            switch (i) {
                case 1:
                    kri.b(i, 0, i2);
                    kriVar.i();
                    break;
                case 2:
                    kri.b(i, 0, i2);
                    jI = kriVar.i();
                    break;
                case 3:
                    kri.b(i, 0, i2);
                    kriVar.i();
                    break;
                case 4:
                    kri.b(i, 2, i2);
                    strF = kriVar.f();
                    break;
                case 5:
                    kri.b(i, 0, i2);
                    kriVar.i();
                    break;
                case 6:
                    kri.b(i, 2, i2);
                    strF2 = kriVar.f();
                    break;
                case 7:
                    kri.b(i, 0, i2);
                    kriVar.i();
                    break;
                case 8:
                    kri.b(i, 2, i2);
                    kriVar.f();
                    break;
                default:
                    kriVar.j(i2);
                    break;
            }
        }
    }

    public static zl4 e(kri kriVar) {
        while (true) {
            int iG = kriVar.g();
            if (iG == 0) {
                return new zl4(13);
            }
            int i = iG >>> 3;
            int i2 = iG & 7;
            if (i == 1) {
                kri.b(i, 2, i2);
                kriVar.f();
            } else if (i == 2) {
                kri.b(i, 2, i2);
                kriVar.f();
            } else if (i == 3) {
                kri.b(i, 0, i2);
                kriVar.i();
            } else if (i == 4) {
                kri.b(i, 2, i2);
                kriVar.d();
            } else if (i != 6) {
                kriVar.j(i2);
            } else {
                kri.b(i, 2, i2);
                kri kriVarE = kriVar.e();
                while (true) {
                    int iG2 = kriVarE.g();
                    if (iG2 != 0) {
                        int i3 = iG2 >>> 3;
                        int i4 = iG2 & 7;
                        if (i3 != 1) {
                            kriVarE.j(i4);
                        } else {
                            kri.b(i3, 2, i4);
                            kriVarE.d();
                        }
                    }
                }
            }
        }
    }

    public static void f(kri kriVar, HashMap map) {
        int i;
        int i2;
        kri kriVar2;
        int i3 = 0;
        gvh gvhVar = null;
        int i4 = 0;
        while (true) {
            int iG = kriVar.g();
            if (iG == 0) {
                if (gvhVar != null) {
                    map.put(Integer.valueOf(i4), gvhVar);
                    return;
                }
                return;
            }
            int i5 = iG >>> 3;
            int i6 = iG & 7;
            int i7 = 1;
            if (i5 == 1) {
                i = i3;
                kri.b(i5, i, i6);
                i4 = (int) kriVar.i();
            } else if (i5 != 2) {
                kriVar.j(i6);
                i = i3;
            } else {
                kri.b(i5, 2, i6);
                kri kriVarE = kriVar.e();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int i8 = i3;
                String strF = "";
                while (true) {
                    int iG2 = kriVarE.g();
                    if (iG2 != 0) {
                        int i9 = iG2 >>> 3;
                        int i10 = iG2 & 7;
                        switch (i9) {
                            case 1:
                                i2 = i3;
                                kriVar2 = kriVarE;
                                kri.b(i9, i2, i10);
                                i8 = (int) kriVar2.i();
                                break;
                            case 2:
                                kriVar2 = kriVarE;
                                kri.b(i9, 2, i10);
                                strF = kriVar2.f();
                                i2 = 0;
                                break;
                            case 3:
                                kri.b(i9, 2, i10);
                                kri kriVarE2 = kriVarE.e();
                                String strF2 = "";
                                long jI = 0;
                                while (true) {
                                    int iG3 = kriVarE2.g();
                                    if (iG3 == 0) {
                                        kriVar2 = kriVarE;
                                        arrayList.add(new pde(strF2, jI));
                                        i2 = 0;
                                    } else {
                                        int i11 = iG3 >>> 3;
                                        kri kriVar3 = kriVarE;
                                        int i12 = iG3 & 7;
                                        if (i11 == i7) {
                                            kri.b(i11, 2, i12);
                                            strF2 = kriVarE2.f();
                                        } else if (i11 != 2) {
                                            kriVarE2.j(i12);
                                        } else {
                                            kri.b(i11, 0, i12);
                                            jI = kriVarE2.i();
                                        }
                                        kriVarE = kriVar3;
                                        i7 = 1;
                                    }
                                    break;
                                }
                                break;
                            case 4:
                                kri.b(i9, 2, i10);
                                arrayList4.add(d(kriVarE.e()));
                                kriVar2 = kriVarE;
                                i2 = 0;
                                break;
                            case 5:
                                kri.b(i9, 2, i10);
                                arrayList5.add(e(kriVarE.e()));
                                kriVar2 = kriVarE;
                                i2 = 0;
                                break;
                            case 6:
                                kri.b(i9, i3, i10);
                                kriVarE.i();
                                i2 = i3;
                                kriVar2 = kriVarE;
                                break;
                            case 7:
                                kri.b(i9, 2, i10);
                                arrayList2.add(kriVarE.f());
                                kriVar2 = kriVarE;
                                i2 = 0;
                                break;
                            case 8:
                                kri.b(i9, i3, i10);
                                kriVarE.i();
                                i2 = i3;
                                kriVar2 = kriVarE;
                                break;
                            case 9:
                                kri.b(i9, 2, i10);
                                arrayList3.add(kriVarE.f());
                                kriVar2 = kriVarE;
                                i2 = 0;
                                break;
                            default:
                                kriVarE.j(i10);
                                kriVar2 = kriVarE;
                                i2 = 0;
                                break;
                        }
                        i3 = i2;
                        kriVarE = kriVar2;
                        i7 = 1;
                    } else {
                        i = i3;
                        gvhVar = new gvh(i8, strF, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
                    }
                }
            }
            i3 = i;
        }
    }

    public static int h(dg2 dg2Var, int i, int i2, int i3) {
        fd9.E(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        bwk.d(bwk.d(i4, i5), 1 << i3);
        if (dg2Var.b() < i) {
            return -1;
        }
        int iG = dg2Var.g(i);
        if (iG == i4) {
            if (dg2Var.b() < i2) {
                return -1;
            }
            int iG2 = dg2Var.g(i2);
            iG += iG2;
            if (iG2 == i5) {
                if (dg2Var.b() < i3) {
                    return -1;
                }
                return dg2Var.g(i3) + iG;
            }
        }
        return iG;
    }

    public static void i(dg2 dg2Var) {
        dg2Var.o(3);
        dg2Var.o(8);
        boolean zF = dg2Var.f();
        boolean zF2 = dg2Var.f();
        if (zF) {
            dg2Var.o(5);
        }
        if (zF2) {
            dg2Var.o(6);
        }
    }

    public static void j(dg2 dg2Var) {
        int iG;
        int iG2 = dg2Var.g(2);
        if (iG2 == 0) {
            dg2Var.o(6);
            return;
        }
        int iH = h(dg2Var, 5, 8, 16) + 1;
        if (iG2 == 1) {
            dg2Var.o(iH * 7);
            return;
        }
        if (iG2 == 2) {
            boolean zF = dg2Var.f();
            int i = zF ? 1 : 5;
            int i2 = zF ? 7 : 5;
            int i3 = zF ? 8 : 6;
            int i4 = 0;
            while (i4 < iH) {
                if (dg2Var.f()) {
                    dg2Var.o(7);
                    iG = 0;
                } else {
                    if (dg2Var.g(2) == 3 && dg2Var.g(i2) * i != 0) {
                        dg2Var.n();
                    }
                    iG = dg2Var.g(i3) * i;
                    if (iG != 0 && iG != 180) {
                        dg2Var.n();
                    }
                    dg2Var.n();
                }
                if (iG != 0 && iG != 180 && dg2Var.f()) {
                    i4++;
                }
                i4++;
            }
        }
    }

    public abstract String g();
}
