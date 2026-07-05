package defpackage;

import android.os.LocaleList;
import android.text.style.LocaleSpan;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ghk {
    public static final ta4 a = new ta4(-856428497, false, new bb4(29));
    public static final int[] b;

    static {
        new ta4(583477771, false, new gb4(3));
        new ta4(1110487485, false, new gb4(4));
        new ta4(272683178, false, new gb4(5));
        new ta4(400865871, false, new gb4(6));
        new ta4(-2114561754, false, new gb4(7));
        new ta4(-754094763, false, new gb4(0));
        new ta4(-1591128169, false, new gb4(1));
        new ta4(1742213912, false, new gb4(2));
        b = new int[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.zy7 r21, defpackage.iqb r22, defpackage.zy7 r23, defpackage.e0g r24, float r25, float r26, float r27, defpackage.pz7 r28, final defpackage.ta4 r29, defpackage.ld4 r30, final int r31, final int r32) {
        /*
            Method dump skipped, instruction units count: 745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ghk.a(zy7, iqb, zy7, e0g, float, float, float, pz7, ta4, ld4, int, int):void");
    }

    public static final void b(final String str, final boolean z, final boolean z2, final boolean z3, final zy7 zy7Var, final iqb iqbVar, ld4 ld4Var, final int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-391787665);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.g(z2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.g(z3) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.h(zy7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.f(iqbVar) ? 131072 : 65536;
        }
        int i3 = 1;
        if (e18Var.Q(i2 & 1, (74899 & i2) != 74898)) {
            q64 q64VarA = p64.a(new ho0(8.0f, true, new sz6(i3)), lja.S, e18Var, 6);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, fqb.E);
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
            final tkh tkhVar = ((jm3) gm3.c(e18Var).e.E).g;
            final long j = gm3.a(e18Var).O;
            tjh.a(tkhVar, fd9.q0(1901292392, new pz7() { // from class: lmd
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    long j2;
                    ld4 ld4Var2 = (ld4) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    e18 e18Var2 = (e18) ld4Var2;
                    if (e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        cxe cxeVarA = axe.a(ko0.b, lja.Q, e18Var2, 54);
                        int iHashCode2 = Long.hashCode(e18Var2.T);
                        hyc hycVarL2 = e18Var2.l();
                        iqb iqbVarE2 = kxk.E(e18Var2, iqbVar);
                        dd4.e.getClass();
                        re4 re4Var2 = cd4.b;
                        e18Var2.e0();
                        if (e18Var2.S) {
                            e18Var2.k(re4Var2);
                        } else {
                            e18Var2.n0();
                        }
                        d4c.i0(e18Var2, cd4.f, cxeVarA);
                        d4c.i0(e18Var2, cd4.e, hycVarL2);
                        d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode2));
                        d4c.h0(e18Var2, cd4.h);
                        d4c.i0(e18Var2, cd4.d, iqbVarE2);
                        long j3 = j;
                        String str2 = str;
                        if (str2 != null) {
                            e18Var2.a0(367685834);
                            ghk.c(8, j3, e18Var2, new hw9(1.0f, true), u00.D(R.drawable.project_user, 0, e18Var2), d4c.k0(R.string.project_created_by, new Object[]{str2}, e18Var2));
                            e18Var2.p(false);
                        } else {
                            e18Var2.a0(368012574);
                            e18Var2.p(false);
                        }
                        if (z2) {
                            e18Var2.a0(368095561);
                            j2 = j3;
                            lnk.d(zy7Var, null, false, null, q02.d(0L, j3, 0L, e18Var2, 13), new qnc(12.0f, 6.0f, 12.0f, 6.0f), null, fd9.q0(-278517163, new s50(z3, tkhVar, 7), e18Var2), e18Var2, 806879232, 430);
                            e18Var2 = e18Var2;
                            e18Var2.p(false);
                        } else {
                            j2 = j3;
                            e18Var2.a0(368810142);
                            e18Var2.p(false);
                        }
                        e18Var2.p(true);
                        if (z) {
                            e18Var2.a0(-625626023);
                            ghk.c(3080, j2, e18Var2, b.c(fqb.E, 1.0f), u00.D(R.drawable.project_buildings, 0, e18Var2), d4c.j0(R.string.project_details_open_disclaimer, e18Var2));
                            e18Var2.p(false);
                        } else {
                            e18Var2.a0(-625317542);
                            e18Var2.p(false);
                        }
                    } else {
                        e18Var2.T();
                    }
                    return iei.a;
                }
            }, e18Var), e18Var, 48);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: mmd
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ghk.b(str, z, z2, z3, zy7Var, iqbVar, (ld4) obj, x44.p0(i | 1));
                    return iei.a;
                }
            };
        }
    }

    public static final void c(int i, long j, ld4 ld4Var, iqb iqbVar, bpc bpcVar, String str) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-4531709);
        int i2 = (e18Var.h(bpcVar) ? 4 : 2) | i | (e18Var.f(str) ? 32 : 16) | (e18Var.e(j) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            prk.k(str, iqbVar, tkh.b((tkh) e18Var.j(tjh.a), j, 0L, null, null, null, 0L, null, 0, 0L, null, 0, 16777214), bpcVar, dv8.E, 0L, 4.0f, 0L, 0, 0, e18Var, ((i2 >> 3) & 14) | 1597440 | ((i2 >> 6) & 112) | FreeTypeConstants.FT_LOAD_MONOCHROME | ((i2 << 9) & 7168), 1952);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ff2(i, j, iqbVar, bpcVar, str);
        }
    }

    public static final void d(boolean z, boolean z2, ld4 ld4Var, int i) {
        int i2;
        boolean z3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-610318843);
        if ((i & 6) == 0) {
            i2 = (e18Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.g(z2) ? 32 : 16;
        }
        int i3 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            cxe cxeVarA = axe.a(new ho0(8.0f, true, new sz6(i3)), lja.Q, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, fqb.E);
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
            if (z) {
                e18Var.a0(-473366223);
                z3 = false;
                zmk.f(d4c.j0(R.string.project_badge_private, e18Var), null, a.a(ud0.H0, e18Var), 0L, 0L, null, null, null, null, e18Var, 512, 506);
                e18Var.p(false);
            } else {
                z3 = false;
                e18Var.a0(-473204775);
                e18Var.p(false);
            }
            if (z2) {
                e18Var.a0(-473174643);
                zmk.f(d4c.j0(R.string.project_badge_archived, e18Var), null, a.a(ud0.h, e18Var), 0L, 0L, null, null, null, null, e18Var, 512, 506);
                e18Var.p(z3);
            } else {
                e18Var.a0(-473009351);
                e18Var.p(z3);
            }
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new jmb(z, z2, i);
        }
    }

    public static final void e(String str, String str2, String str3, boolean z, boolean z2, boolean z3, iqb iqbVar, ld4 ld4Var, int i) {
        boolean z4;
        str.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(400095280);
        int i2 = i | (e18Var.f(str2) ? 32 : 16) | (e18Var.f(str3) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.g(z) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.g(z2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.g(z3) ? 131072 : 65536) | (e18Var.f(iqbVar) ? FreeTypeConstants.FT_LOAD_COLOR : 524288);
        int i3 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 599185) != 599184)) {
            q64 q64VarA = p64.a(new ho0(4.0f, true, new sz6(i3)), lja.S, e18Var, 6);
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
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            Object[] objArr = new Object[0];
            Object objN = e18Var.N();
            int i4 = 13;
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new mgd(i4);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) iuj.I(objArr, (zy7) objN, e18Var, 48);
            Object[] objArr2 = new Object[0];
            Object objN2 = e18Var.N();
            int i5 = 14;
            if (objN2 == lz1Var) {
                objN2 = new mgd(i5);
                e18Var.k0(objN2);
            }
            nwb nwbVar2 = (nwb) iuj.I(objArr2, (zy7) objN2, e18Var, 48);
            Object[] objArr3 = new Object[0];
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = new mgd(15);
                e18Var.k0(objN3);
            }
            isc iscVar = (isc) iuj.I(objArr3, (zy7) objN3, e18Var, 48);
            Boolean bool = (Boolean) nwbVar.getValue();
            bool.getClass();
            boolean zF = e18Var.f(iscVar);
            Object objN4 = e18Var.N();
            if (zF || objN4 == lz1Var) {
                objN4 = new tn(iscVar, 7);
                e18Var.k0(objN4);
            }
            xn5.G(bool, null, (bz7) objN4, null, "InfoFooter expanded", null, fd9.q0(475746985, new wd(str2, iscVar, nwbVar2, 10), e18Var), e18Var, 1597440, 42);
            boolean z5 = z3 && !z;
            if (str3 != null || ((Boolean) nwbVar2.getValue()).booleanValue()) {
                e18Var.a0(-496135955);
                boolean zBooleanValue = ((Boolean) nwbVar2.getValue()).booleanValue();
                boolean zBooleanValue2 = ((Boolean) nwbVar.getValue()).booleanValue();
                boolean zF2 = e18Var.f(nwbVar);
                Object objN5 = e18Var.N();
                if (zF2 || objN5 == lz1Var) {
                    objN5 = new k3c(13, nwbVar);
                    e18Var.k0(objN5);
                }
                z4 = true;
                b(str3, z5, zBooleanValue, zBooleanValue2, (zy7) objN5, b.c(fqb.E, 1.0f), e18Var, 196608 | (14 & (i2 >> 6)));
                e18Var.p(false);
            } else {
                e18Var.a0(-495783268);
                e18Var.p(false);
                z4 = true;
            }
            d(z, z2, e18Var, (i2 >> 9) & 126);
            e18Var.p(z4);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pyb(str, str2, str3, z, z2, z3, iqbVar, i);
        }
    }

    public static final iqb f(iqb iqbVar, e0g e0gVar, ld4 ld4Var) {
        iqbVar.getClass();
        return ez1.t(yfd.p(xn5.V(xn5.a0(iqbVar, e0gVar, new tzf(4.0f, d54.b(0.08f, d54.b), MTTypesetterKt.kLineSkipLimitMultiplier, 0L, 56)), e0gVar), gm3.a(ld4Var).n, zni.b), MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(ld4Var).v, e0gVar);
    }

    public static int g(int i, int i2) {
        int i3 = i < 0 ? 5 : 0;
        if (i == 10) {
            i3 |= 1;
        }
        if (i2 < 0) {
            i3 |= 10;
        }
        if (i2 == 10) {
            i3 |= 2;
        }
        return l(i) != l(i2) ? i3 | 16 : i3 | 32;
    }

    public static void h(int i, StringBuilder sb) {
        if (i > 255 ? xzk.A(eei.I, i) || xzk.A(eei.J, i) || xzk.A(eei.K, i) || xzk.A(eei.E, i) || xzk.A(eei.F, i) : (i >= 32 && i < 127) || (i >= 161 && i != 173)) {
            if ("\\.+*?()|[]{}^$".indexOf((char) i) >= 0) {
                sb.append('\\');
            }
            sb.appendCodePoint(i);
            return;
        }
        if (i == 12) {
            sb.append("\\f");
            return;
        }
        if (i == 13) {
            sb.append("\\r");
            return;
        }
        if (i == 34) {
            sb.append("\\\"");
            return;
        }
        if (i == 92) {
            sb.append("\\\\");
            return;
        }
        switch (i) {
            case 8:
                sb.append("\\b");
                break;
            case 9:
                sb.append("\\t");
                break;
            case 10:
                sb.append("\\n");
                break;
            default:
                String hexString = Integer.toHexString(i);
                if (i >= 256) {
                    sb.append("\\x{");
                    sb.append(hexString);
                    sb.append('}');
                } else {
                    sb.append("\\x");
                    if (hexString.length() == 1) {
                        sb.append('0');
                    }
                    sb.append(hexString);
                }
                break;
        }
    }

    public static us6 i(qh9 qh9Var) {
        try {
            bh9 bh9VarS = qh9Var.s("viewport");
            return new us6(bh9VarS != null ? qik.n(bh9VarS.g()) : null);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Display", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Display", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Display", e3);
            return null;
        }
    }

    public static xwi j(qh9 qh9Var) {
        try {
            bh9 bh9VarS = qh9Var.s("cls");
            ywi ywiVarI = bh9VarS != null ? thk.i(bh9VarS.g()) : null;
            bh9 bh9VarS2 = qh9Var.s("fcp");
            jwi jwiVarK = bh9VarS2 != null ? rwj.k(bh9VarS2.g()) : null;
            bh9 bh9VarS3 = qh9Var.s("fid");
            kwi kwiVarG = bh9VarS3 != null ? twj.g(bh9VarS3.g()) : null;
            bh9 bh9VarS4 = qh9Var.s("inp");
            pwi pwiVarJ = bh9VarS4 != null ? ywj.j(bh9VarS4.g()) : null;
            bh9 bh9VarS5 = qh9Var.s("lcp");
            swi swiVarG = bh9VarS5 != null ? kzj.g(bh9VarS5.g()) : null;
            bh9 bh9VarS6 = qh9Var.s("fbc");
            return new xwi(ywiVarI, jwiVarK, kwiVarG, pwiVarJ, swiVarG, bh9VarS6 != null ? qwj.f(bh9VarS6.g()) : null);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Performance", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Performance", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Performance", e3);
            return null;
        }
    }

    public static boolean k(String str) {
        return str == null || str.equals("error");
    }

    public static boolean l(int i) {
        if (65 <= i && i <= 90) {
            return true;
        }
        if (97 > i || i > 122) {
            return (48 <= i && i <= 57) || i == 95;
        }
        return true;
    }

    public static boolean m(int i) {
        if (48 <= i && i <= 57) {
            return true;
        }
        if (65 > i || i > 90) {
            return 97 <= i && i <= 122;
        }
        return true;
    }

    public static LocaleSpan n(gea geaVar) {
        ArrayList arrayList = new ArrayList(x44.y(geaVar, 10));
        Iterator it = geaVar.E.iterator();
        while (it.hasNext()) {
            arrayList.add(((eea) it.next()).a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public static void o(s60 s60Var, gea geaVar) {
        ArrayList arrayList = new ArrayList(x44.y(geaVar, 10));
        Iterator it = geaVar.E.iterator();
        while (it.hasNext()) {
            arrayList.add(((eea) it.next()).a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        s60Var.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public static int p(int i) {
        if (48 <= i && i <= 57) {
            return i - 48;
        }
        if (97 <= i && i <= 102) {
            return i - 87;
        }
        if (65 > i || i > 70) {
            return -1;
        }
        return i - 55;
    }
}
