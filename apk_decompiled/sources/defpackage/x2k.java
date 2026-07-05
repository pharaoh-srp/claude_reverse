package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.inputmethod.ExtractedText;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x2k {
    public static final ta4 a = new ta4(-296604264, false, new ya4(6));
    public static final xb b = new xb(10);

    public static final void a(fk fkVar, zy7 zy7Var, i4g i4gVar, iqb iqbVar, ue2 ue2Var, h86 h86Var, ld4 ld4Var, int i) {
        int i2;
        zy7 zy7Var2;
        i4g i4gVar2;
        iqb iqbVar2;
        h86 h86Var2;
        h86 h86Var3;
        int i3;
        ue2 ue2Var2;
        fkVar.getClass();
        zy7Var.getClass();
        i4gVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-426829640);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(fkVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            zy7Var2 = zy7Var;
            i2 |= e18Var.h(zy7Var2) ? 32 : 16;
        } else {
            zy7Var2 = zy7Var;
        }
        if ((i & 384) == 0) {
            i4gVar2 = i4gVar;
            i2 |= e18Var.f(i4gVar2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            i4gVar2 = i4gVar;
        }
        if ((i & 3072) == 0) {
            iqbVar2 = iqbVar;
            i2 |= e18Var.f(iqbVar2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        } else {
            iqbVar2 = iqbVar;
        }
        if ((i & 24576) == 0) {
            i2 |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= 65536;
        }
        if (e18Var.Q(i2 & 1, (74899 & i2) != 74898)) {
            e18Var.V();
            int i4 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i4 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(ue2.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                ue2 ue2Var3 = (ue2) objN;
                m7f m7fVarN2 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF2 = e18Var.f(null) | e18Var.f(m7fVarN2);
                Object objN2 = e18Var.N();
                if (zF2 || objN2 == lz1Var) {
                    objN2 = m7fVarN2.a(jce.a.b(h86.class), null, null);
                    e18Var.k0(objN2);
                }
                e18Var.p(false);
                e18Var.p(false);
                h86Var3 = (h86) objN2;
                i3 = i2 & (-516097);
                ue2Var2 = ue2Var3;
            } else {
                e18Var.T();
                h86Var3 = h86Var;
                i3 = i2 & (-516097);
                ue2Var2 = ue2Var;
            }
            e18Var.q();
            boolean zF3 = e18Var.f(fkVar.e);
            Object objN3 = e18Var.N();
            if (zF3 || objN3 == lz1Var) {
                objN3 = vb7.g(0, e18Var);
            }
            isc iscVar = (isc) objN3;
            int iH = iscVar.h();
            String str = fkVar.e;
            Boolean boolValueOf = Boolean.valueOf(fkVar.d());
            Integer numValueOf = Integer.valueOf(iH);
            boolean zH = e18Var.h(fkVar) | e18Var.h(ue2Var2) | e18Var.h(h86Var3);
            Object objN4 = e18Var.N();
            if (zH || objN4 == lz1Var) {
                objN4 = new w22(fkVar, ue2Var2, h86Var3, null);
                e18Var.k0(objN4);
            }
            ue2Var = ue2Var2;
            w21 w21Var = (w21) mpk.Q(s21.a, str, boolValueOf, numValueOf, (pz7) objN4, e18Var, 6).getValue();
            boolean zF4 = e18Var.f(iscVar);
            Object objN5 = e18Var.N();
            if (zF4 || objN5 == lz1Var) {
                objN5 = new d7(17, iscVar);
                e18Var.k0(objN5);
            }
            b(w21Var, (zy7) objN5, zy7Var2, i4gVar2, iqbVar2, e18Var, (i3 << 3) & 65408, 0);
            h86Var2 = h86Var3;
        } else {
            e18Var.T();
            h86Var2 = h86Var;
        }
        ue2 ue2Var4 = ue2Var;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new hl(fkVar, zy7Var, i4gVar, iqbVar, ue2Var4, h86Var2, i);
        }
    }

    public static final void b(final w21 w21Var, zy7 zy7Var, zy7 zy7Var2, final i4g i4gVar, iqb iqbVar, ld4 ld4Var, int i, int i2) {
        int i3;
        iqb iqbVar2;
        w21Var.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        i4gVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1700202424);
        if ((i & 6) == 0) {
            i3 = (e18Var.f(w21Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= e18Var.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i3 |= e18Var.f(i4gVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= e18Var.f(iqbVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        final int i5 = 1;
        final int i6 = 0;
        if (e18Var.Q(i3 & 1, (i3 & 9363) != 9362)) {
            iqb iqbVar3 = i4 != 0 ? fqb.E : iqbVar;
            if (w21Var.equals(s21.a)) {
                e18Var.a0(1806965457);
                c(iqbVar3, owj.a, e18Var, ((i3 >> 12) & 14) | 48);
                e18Var.p(false);
            } else if (w21Var.equals(r21.a)) {
                e18Var.a0(1806969730);
                c(iqbVar3, fd9.q0(1989785269, new wh(7, zy7Var), e18Var), e18Var, ((i3 >> 12) & 14) | 48);
                e18Var.p(false);
            } else if (w21Var.equals(v21.a)) {
                e18Var.a0(1806979598);
                c(iqbVar3, fd9.q0(949493430, new wh(8, zy7Var2), e18Var), e18Var, ((i3 >> 12) & 14) | 48);
                e18Var.p(false);
            } else if (w21Var instanceof u21) {
                e18Var.a0(1806990157);
                xvk.c(iqbVar3, fd9.q0(1949010806, new pz7() { // from class: pe2
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj, Object obj2) {
                        int i7 = i6;
                        iei ieiVar = iei.a;
                        i4g i4gVar2 = i4gVar;
                        w21 w21Var2 = w21Var;
                        switch (i7) {
                            case 0:
                                ld4 ld4Var2 = (ld4) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                e18 e18Var2 = (e18) ld4Var2;
                                if (!e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    e18Var2.T();
                                } else {
                                    tjh.b(((u21) w21Var2).a, gb9.N(gb9.I(mpk.b0(b.c, mpk.Y(e18Var2), true), i4gVar2.a), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, i4gVar2.b, 7), gm3.a(e18Var2).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (tkh) ((wk) gm3.c(e18Var2).e.F).c, e18Var2, 0, 0, 131064);
                                }
                                break;
                            default:
                                ld4 ld4Var3 = (ld4) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                e18 e18Var3 = (e18) ld4Var3;
                                if (!e18Var3.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    e18Var3.T();
                                } else {
                                    jlk.f(((t21) w21Var2).b, gb9.N(gb9.I(mpk.b0(b.c, mpk.Y(e18Var3), true), i4gVar2.a), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, i4gVar2.b, 7), null, null, null, null, null, e18Var3, 0, 252);
                                }
                                break;
                        }
                        return ieiVar;
                    }
                }, e18Var), e18Var, ((i3 >> 12) & 14) | 48, 0);
                e18Var.p(false);
            } else {
                if (!(w21Var instanceof t21)) {
                    throw ebh.u(e18Var, 1806965336, false);
                }
                e18Var.a0(1807006498);
                xvk.c(iqbVar3, fd9.q0(908718967, new pz7() { // from class: pe2
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj, Object obj2) {
                        int i7 = i5;
                        iei ieiVar = iei.a;
                        i4g i4gVar2 = i4gVar;
                        w21 w21Var2 = w21Var;
                        switch (i7) {
                            case 0:
                                ld4 ld4Var2 = (ld4) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                e18 e18Var2 = (e18) ld4Var2;
                                if (!e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    e18Var2.T();
                                } else {
                                    tjh.b(((u21) w21Var2).a, gb9.N(gb9.I(mpk.b0(b.c, mpk.Y(e18Var2), true), i4gVar2.a), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, i4gVar2.b, 7), gm3.a(e18Var2).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (tkh) ((wk) gm3.c(e18Var2).e.F).c, e18Var2, 0, 0, 131064);
                                }
                                break;
                            default:
                                ld4 ld4Var3 = (ld4) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                e18 e18Var3 = (e18) ld4Var3;
                                if (!e18Var3.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    e18Var3.T();
                                } else {
                                    jlk.f(((t21) w21Var2).b, gb9.N(gb9.I(mpk.b0(b.c, mpk.Y(e18Var3), true), i4gVar2.a), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, i4gVar2.b, 7), null, null, null, null, null, e18Var3, 0, 252);
                                }
                                break;
                        }
                        return ieiVar;
                    }
                }, e18Var), e18Var, ((i3 >> 12) & 14) | 48, 0);
                e18Var.p(false);
            }
            iqbVar2 = iqbVar3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new qe2(w21Var, zy7Var, zy7Var2, i4gVar, iqbVar2, i, i2, 0);
        }
    }

    public static final void c(iqb iqbVar, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1398742307);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(ta4Var) ? 32 : 16;
        }
        int i3 = 3;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            iqb iqbVarB = iqbVar.B(b.c);
            o5b o5bVarD = dw1.d(lja.K, false);
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
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            vb7.y((i2 >> 3) & 14, ta4Var, e18Var, true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new h60(iqbVar, ta4Var, i, i3);
        }
    }

    public static final void d(String str, String str2, zy7 zy7Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(985897958);
        int i2 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.f(str2) ? 32 : 16) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            vo1 vo1Var = lja.T;
            ho0 ho0Var = new ho0(16.0f, true, new sz6(1));
            iqb iqbVarJ = gb9.J(b.c(fqb.E, 1.0f), 24.0f);
            q64 q64VarA = p64.a(ho0Var, vo1Var, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarJ);
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
            tjh.b(str, null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, i2 & 14, 0, 130042);
            e18Var = e18Var;
            dtj.a(str2, null, false, null, f12.a, y02.a, 0L, zy7Var, e18Var, ((i2 >> 3) & 14) | 221184 | ((i2 << 15) & 29360128), 78);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new re2(str, str2, zy7Var, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final defpackage.zy7 r30, final defpackage.iqb r31, long r32, long r34, defpackage.mnc r36, float r37, float r38, defpackage.qu1 r39, final defpackage.ta4 r40, defpackage.ld4 r41, final int r42, final int r43) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x2k.e(zy7, iqb, long, long, mnc, float, float, qu1, ta4, ld4, int, int):void");
    }

    public static final void f(String str, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        iqb iqbVar2;
        str.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(909269301);
        int i2 = i | (e18Var2.f(str) ? 4 : 2) | 48;
        if (e18Var2.Q(i2 & 1, (i2 & 19) != 18)) {
            tkh tkhVar = ((jm3) gm3.c(e18Var2).e.E).j;
            e18Var = e18Var2;
            iqbVar2 = fqb.E;
            tjh.b(str, iqbVar2, gm3.a(e18Var2).a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var, i2 & 126, 0, 131064);
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ip(str, iqbVar2, i, 15);
        }
    }

    public static final ExtractedText g(efh efhVar) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = efhVar;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = efhVar.G.length();
        extractedText.partialStartOffset = -1;
        long j = efhVar.H;
        extractedText.selectionStart = kkh.g(j);
        extractedText.selectionEnd = kkh.f(j);
        extractedText.flags = !bsg.v0(efhVar, '\n') ? 1 : 0;
        return extractedText;
    }

    public static rs6 h(qh9 qh9Var) {
        try {
            long jK = qh9Var.s("format_version").k();
            bh9 bh9VarS = qh9Var.s("session");
            ss6 ss6VarE = bh9VarS != null ? bhk.e(bh9VarS.g()) : null;
            bh9 bh9VarS2 = qh9Var.s("configuration");
            ks6 ks6VarF = bh9VarS2 != null ? twj.f(bh9VarS2.g()) : null;
            bh9 bh9VarS3 = qh9Var.s("browser_sdk_version");
            String strM = bh9VarS3 != null ? bh9VarS3.m() : null;
            bh9 bh9VarS4 = qh9Var.s("sdk_name");
            String strM2 = bh9VarS4 != null ? bh9VarS4.m() : null;
            bh9 bh9VarS5 = qh9Var.s("profiling");
            dt6 dt6VarE = bh9VarS5 != null ? gik.e(bh9VarS5.g()) : null;
            if (jK == 2) {
                return new rs6(ss6VarE, ks6VarF, strM, strM2, dt6VarE);
            }
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Dd", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Dd", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Dd", e3);
            return null;
        }
    }

    public static twi i(qh9 qh9Var) {
        try {
            return new twi(qh9Var.s("load_delay").k(), qh9Var.s("load_time").k(), qh9Var.s("render_delay").k());
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type LcpSubParts", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type LcpSubParts", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type LcpSubParts", e3);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList j(android.text.Spanned r33) {
        /*
            Method dump skipped, instruction units count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x2k.j(android.text.Spanned):java.util.ArrayList");
    }

    public static final o5l k(ax5 ax5Var, Bundle bundle) {
        mp3 mp3Var = new mp3(new ClipData(ax5Var.s(), new ClipData.Item(ax5Var.q())));
        np3 np3Var = new np3(ax5Var.s());
        Uri uriU = ax5Var.u();
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        return new o5l(mp3Var, np3Var, 0, new b6d(uriU, bundle));
    }
}
