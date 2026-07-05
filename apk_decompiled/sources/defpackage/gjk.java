package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import okio.C0024SegmentedByteString;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gjk {
    public static final ta4 a = new ta4(-1035625233, false, new hb4(9));
    public static final ta4 b = new ta4(51334317, false, new hb4(14));
    public static final ta4 c = new ta4(-229734520, false, new ob4(0));
    public static final ta4 d = new ta4(-205158618, false, new hb4(15));
    public static final ta4 e = new ta4(685916004, false, new hb4(10));
    public static final ta4 f = new ta4(1161703295, false, new jb4(22));
    public static final ta4 g = new ta4(-991631707, false, new hb4(11));
    public static final ta4 h = new ta4(1989505703, false, new hb4(12));
    public static final ta4 i = new ta4(1406221612, false, new jb4(23));
    public static final ta4 j = new ta4(-956807770, false, new hb4(13));
    public static final ta4 k = new ta4(1441045549, false, new jb4(24));
    public static final ta4 l = new ta4(495172864, false, new jb4(25));
    public static final ta4 m = new ta4(743075383, false, new jb4(26));
    public static final ta4 n = new ta4(-2016258476, false, new jb4(27));
    public static final ta4 o = new ta4(-2109341920, false, new jb4(28));
    public static final ta4 p = new ta4(460608509, false, new jb4(29));

    public static final void a(String str, iqb iqbVar, ld4 ld4Var, int i2) {
        int i3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2117165720);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        if (e18Var.Q(i4 & 1, (i4 & 19) != 18)) {
            op3 op3Var = (op3) e18Var.j(ve4.f);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = fd9.O(im6.E, e18Var);
                e18Var.k0(objN);
            }
            l45 l45Var = (l45) objN;
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = mpk.P(Boolean.FALSE);
                e18Var.k0(objN2);
            }
            nwb nwbVar = (nwb) objN2;
            boolean zBooleanValue = ((Boolean) nwbVar.getValue()).booleanValue();
            boolean zH = e18Var.h(l45Var) | ((i4 & 14) == 4) | e18Var.h(op3Var);
            Object objN3 = e18Var.N();
            if (zH || objN3 == lz1Var) {
                objN3 = new he(l45Var, nwbVar, str, op3Var);
                e18Var.k0(objN3);
            }
            int i5 = (i4 << 3) & 896;
            fqb fqbVar = fqb.E;
            d(i5, e18Var, (zy7) objN3, fqbVar, zBooleanValue);
            iqbVar = fqbVar;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new el(str, iqbVar, i2, 9);
        }
    }

    public static final CancellationException b(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:269:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0135  */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [kl7, tn, yig] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final java.lang.String r43, final defpackage.zy7 r44, final defpackage.iqb r45, boolean r46, final boolean r47, final defpackage.pz7 r48, boolean r49, defpackage.pz7 r50, boolean r51, defpackage.e0g r52, defpackage.qu1 r53, defpackage.hhd r54, defpackage.rc2 r55, defpackage.mnc r56, float r57, defpackage.tkh r58, int r59, boolean r60, defpackage.rz7 r61, defpackage.ld4 r62, final int r63, final int r64, final int r65) {
        /*
            Method dump skipped, instruction units count: 1057
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gjk.c(java.lang.String, zy7, iqb, boolean, boolean, pz7, boolean, pz7, boolean, e0g, qu1, hhd, rc2, mnc, float, tkh, int, boolean, rz7, ld4, int, int, int):void");
    }

    public static final void d(int i2, ld4 ld4Var, zy7 zy7Var, iqb iqbVar, boolean z) {
        int i3;
        long j2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1355497432);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            if (z) {
                e18Var.a0(-1257935054);
                j2 = gm3.a(e18Var).C;
            } else {
                e18Var.a0(-1257933937);
                j2 = gm3.a(e18Var).N;
            }
            e18Var.p(false);
            wlg wlgVarA = f8g.a(j2, kxk.N(300, 0, null, 6), "copy_icon_color", e18Var, 432, 8);
            e18Var = e18Var;
            ez1.e(zy7Var, b.o(iqbVar, 32.0f), false, vz8.G(0L, ((d54) wlgVarA.getValue()).a, 0L, e18Var, 13), null, fd9.q0(-1031259834, new tp(z, 12), e18Var), e18Var, ((i3 >> 3) & 14) | 1572864, 52);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new r50(i2, 5, zy7Var, iqbVar, z);
        }
    }

    public static final void e(zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i2) {
        int i3;
        zy7 zy7Var2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1564330625);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.h(zy7Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        int i5 = 14;
        if (e18Var.Q(i4 & 1, (i4 & 19) != 18)) {
            wu8 wu8VarG = vz8.G(0L, gm3.a(e18Var).N, 0L, e18Var, 13);
            fqb fqbVar = fqb.E;
            zy7Var2 = zy7Var;
            ez1.e(zy7Var2, b.o(fqbVar, 32.0f), false, wu8VarG, null, quk.a, e18Var, (i4 & 14) | 1572864, 52);
            iqbVar = fqbVar;
        } else {
            zy7Var2 = zy7Var;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mu(zy7Var2, iqbVar, i2, i5);
        }
    }

    public static final void f(String str, String str2, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i2) {
        int i3;
        e18 e18Var;
        iqb iqbVar2;
        z80 z80Var;
        String strN;
        boolean z;
        fqb fqbVar;
        boolean z2;
        str.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(844214779);
        if ((i2 & 6) == 0) {
            i3 = (e18Var2.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var2.f(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= e18Var2.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i4 = i3 | 3072;
        if (e18Var2.Q(i4 & 1, (i4 & 1171) != 1170)) {
            long j2 = gm3.a(e18Var2).q;
            long j3 = gm3.a(e18Var2).p;
            fqb fqbVar2 = fqb.E;
            iqb iqbVarV = xn5.V(b.c(fqbVar2, 1.0f), xve.b(12.0f));
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var2, 0);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarV);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            z80 z80Var2 = cd4.f;
            d4c.i0(e18Var2, z80Var2, q64VarA);
            z80 z80Var3 = cd4.e;
            d4c.i0(e18Var2, z80Var3, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var4 = cd4.g;
            d4c.i0(e18Var2, z80Var4, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var2, bxVar);
            z80 z80Var5 = cd4.d;
            d4c.i0(e18Var2, z80Var5, iqbVarE);
            iqb iqbVarE2 = b.e(b.c(fqbVar2, 1.0f), 40.0f);
            wo8 wo8Var = zni.b;
            iqb iqbVarL = gb9.L(yfd.p(iqbVarE2, j2, wo8Var), 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            cxe cxeVarA = axe.a(ko0.a, lja.Q, e18Var2, 48);
            int iHashCode2 = Long.hashCode(e18Var2.T);
            hyc hycVarL2 = e18Var2.l();
            iqb iqbVarE3 = kxk.E(e18Var2, iqbVarL);
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, z80Var2, cxeVarA);
            d4c.i0(e18Var2, z80Var3, hycVarL2);
            ij0.t(iHashCode2, e18Var2, z80Var4, e18Var2, bxVar);
            d4c.i0(e18Var2, z80Var5, iqbVarE3);
            if (str2 == null) {
                z80Var = z80Var2;
                strN = null;
            } else if (str2.length() > 0) {
                StringBuilder sb = new StringBuilder();
                z80Var = z80Var2;
                sb.append((Object) unk.j(str2.charAt(0)));
                sb.append(str2.substring(1));
                strN = sb.toString();
            } else {
                z80Var = z80Var2;
                strN = str2;
            }
            if (strN == null) {
                z = false;
                strN = vb7.n(e18Var2, 1584154115, R.string.code_block_label_code, e18Var2, false);
            } else {
                z = false;
                e18Var2.a0(1584151976);
                e18Var2.p(false);
            }
            tjh.b(strN, null, gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (tkh) ((wk) gm3.c(e18Var2).e.F).i, e18Var2, 0, 0, 131066);
            e18Var = e18Var2;
            kxk.g(e18Var, new hw9(1.0f, true));
            int i5 = i4 & 14;
            a(str, null, e18Var, i5);
            if (zy7Var != null) {
                fqbVar = fqbVar2;
                ij0.r(4.0f, 1864543163, e18Var, e18Var, fqbVar);
                e(zy7Var, null, e18Var, (i4 >> 6) & 14);
                z2 = false;
                e18Var.p(false);
            } else {
                fqbVar = fqbVar2;
                z2 = false;
                e18Var.a0(1864652717);
                e18Var.p(false);
            }
            e18Var.p(true);
            iqb iqbVarP = yfd.p(b.c(fqbVar, 1.0f), j3, wo8Var);
            o5b o5bVarD = dw1.d(lja.G, z2);
            int iHashCode3 = Long.hashCode(e18Var.T);
            hyc hycVarL3 = e18Var.l();
            iqb iqbVarE4 = kxk.E(e18Var, iqbVarP);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, o5bVarD);
            d4c.i0(e18Var, z80Var3, hycVarL3);
            ij0.t(iHashCode3, e18Var, z80Var4, e18Var, bxVar);
            d4c.i0(e18Var, z80Var5, iqbVarE4);
            unk.b(str, str2 == null ? "plaintext" : str2, null, new qnc(16.0f, 16.0f, 16.0f, 16.0f), null, e18Var, i5 | 3072);
            e18Var.p(true);
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v0h(str, str2, zy7Var, iqbVar2, i2, 0);
        }
    }

    public static mla j(qh9 qh9Var) {
        ArrayList arrayList;
        String strM;
        try {
            bh9 bh9VarS = qh9Var.s("type");
            int i2 = 0;
            if (bh9VarS != null && (strM = bh9VarS.m()) != null) {
                int[] iArrH = sq6.H(7);
                int length = iArrH.length;
                while (i2 < length) {
                    int i3 = iArrH[i2];
                    if (y6a.c(i3).equals(strM)) {
                        i2 = i3;
                    } else {
                        i2++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            bh9 bh9VarS2 = qh9Var.s("name");
            String strM2 = bh9VarS2 != null ? bh9VarS2.m() : null;
            bh9 bh9VarS3 = qh9Var.s("model");
            String strM3 = bh9VarS3 != null ? bh9VarS3.m() : null;
            bh9 bh9VarS4 = qh9Var.s("brand");
            String strM4 = bh9VarS4 != null ? bh9VarS4.m() : null;
            bh9 bh9VarS5 = qh9Var.s("architecture");
            String strM5 = bh9VarS5 != null ? bh9VarS5.m() : null;
            bh9 bh9VarS6 = qh9Var.s("locale");
            String strM6 = bh9VarS6 != null ? bh9VarS6.m() : null;
            bh9 bh9VarS7 = qh9Var.s("locales");
            if (bh9VarS7 != null) {
                ArrayList arrayList2 = bh9VarS7.e().E;
                arrayList = new ArrayList(arrayList2.size());
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((bh9) it.next()).m());
                }
            } else {
                arrayList = null;
            }
            bh9 bh9VarS8 = qh9Var.s("time_zone");
            String strM7 = bh9VarS8 != null ? bh9VarS8.m() : null;
            bh9 bh9VarS9 = qh9Var.s("battery_level");
            Number numberL = bh9VarS9 != null ? bh9VarS9.l() : null;
            bh9 bh9VarS10 = qh9Var.s("power_saving_mode");
            Boolean boolValueOf = bh9VarS10 != null ? Boolean.valueOf(bh9VarS10.a()) : null;
            bh9 bh9VarS11 = qh9Var.s("brightness_level");
            Number numberL2 = bh9VarS11 != null ? bh9VarS11.l() : null;
            bh9 bh9VarS12 = qh9Var.s("logical_cpu_count");
            Number numberL3 = bh9VarS12 != null ? bh9VarS12.l() : null;
            bh9 bh9VarS13 = qh9Var.s("total_ram");
            Number numberL4 = bh9VarS13 != null ? bh9VarS13.l() : null;
            bh9 bh9VarS14 = qh9Var.s("is_low_ram");
            return new mla(i2, strM2, strM3, strM4, strM5, strM6, arrayList, strM7, numberL, boolValueOf, numberL2, numberL3, numberL4, bh9VarS14 != null ? Boolean.valueOf(bh9VarS14.a()) : null);
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type Device", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type Device", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type Device", e4);
            return null;
        }
    }

    public static final int k(C0024SegmentedByteString c0024SegmentedByteString, int i2) {
        int i3;
        int[] iArr = c0024SegmentedByteString.J;
        int i4 = i2 + 1;
        int length = c0024SegmentedByteString.I.length;
        iArr.getClass();
        int i5 = length - 1;
        int i6 = 0;
        while (true) {
            if (i6 <= i5) {
                i3 = (i6 + i5) >>> 1;
                int i7 = iArr[i3];
                if (i7 >= i4) {
                    if (i7 <= i4) {
                        break;
                    }
                    i5 = i3 - 1;
                } else {
                    i6 = i3 + 1;
                }
            } else {
                i3 = (-i6) - 1;
                break;
            }
        }
        return i3 >= 0 ? i3 : ~i3;
    }

    public static gjk m(StringBuilder sb) {
        return sb != null ? new n0e(sb, 1) : new n0e(sb, 0);
    }

    public abstract gjk g(char c2);

    public abstract gjk h(String str);

    public abstract gjk i(char[] cArr, int i2);

    public abstract qh9 l();
}
