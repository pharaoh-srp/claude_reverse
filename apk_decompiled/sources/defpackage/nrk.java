package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextPaint;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nrk {
    public static final ta4 a = new ta4(308061725, false, new tb4(21));
    public static final ta4 b = new ta4(-615105701, false, new tb4(22));
    public static final ta4 c = new ta4(78615542, false, new vb4(1));
    public static final ta4 d = new ta4(-78239371, false, new tb4(23));
    public static final ta4 e = new ta4(-1434276338, false, new vb4(2));

    public static final void a(final zb0 zb0Var, final pz7 pz7Var, iqb iqbVar, final tkh tkhVar, int i, float f, ld4 ld4Var, final int i2) {
        final iqb iqbVar2;
        final int i3;
        final float f2;
        iqb iqbVar3;
        int i4;
        float f3;
        zb0Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(559374614);
        int i5 = i2 | (e18Var.f(zb0Var) ? 4 : 2) | (e18Var.h(pz7Var) ? 32 : 16) | 384 | (e18Var.f(tkhVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | 221184;
        if (e18Var.Q(i5 & 1, (74899 & i5) != 74898)) {
            e18Var.V();
            if ((i2 & 1) == 0 || e18Var.A()) {
                iqbVar3 = fqb.E;
                i4 = 1;
                f3 = 6.0f;
            } else {
                e18Var.T();
                iqbVar3 = iqbVar;
                i4 = i;
                f3 = f;
            }
            e18Var.q();
            c(pz7Var, iqbVar3, f3, fd9.q0(948505075, new ui4(zb0Var, i4, tkhVar, 3), e18Var), e18Var, ((i5 >> 3) & 14) | 3504);
            i3 = i4;
            iqbVar2 = iqbVar3;
            f2 = f3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            i3 = i;
            f2 = f;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(pz7Var, iqbVar2, tkhVar, i3, f2, i2) { // from class: hlh
                public final /* synthetic */ pz7 F;
                public final /* synthetic */ iqb G;
                public final /* synthetic */ tkh H;
                public final /* synthetic */ int I;
                public final /* synthetic */ float J;

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(1);
                    nrk.a(this.E, this.F, this.G, this.H, this.I, this.J, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final java.lang.String r16, final defpackage.pz7 r17, defpackage.iqb r18, final defpackage.tkh r19, int r20, float r21, defpackage.ld4 r22, final int r23, final int r24) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nrk.b(java.lang.String, pz7, iqb, tkh, int, float, ld4, int, int):void");
    }

    public static final void c(pz7 pz7Var, iqb iqbVar, float f, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(854545998);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(pz7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.c(f) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            cxe cxeVarA = axe.a(new ho0(f, true, new sz6(1)), lja.Q, e18Var, 48);
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
            d4c.i0(e18Var, cd4.f, cxeVarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            ta4Var.invoke(kgh.n(e18Var, iqbVarE, cd4.d, 1.0f, false), e18Var, Integer.valueOf((i2 >> 6) & 112));
            if (pz7Var == null) {
                e18Var.a0(1228805679);
                e18Var.p(false);
            } else {
                e18Var.a0(1286564882);
                sq6.B(i2 & 14, pz7Var, e18Var, false);
            }
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lb1(pz7Var, iqbVar, f, ta4Var, i);
        }
    }

    public static final void d(yih yihVar, String str) {
        dfh dfhVarG = yihVar.g();
        try {
            dfhVarG.c(0, dfhVarG.F.length(), str);
            yihVar.b(dfhVarG);
        } finally {
            yihVar.c();
        }
    }

    public static final ycb e(ld4 ld4Var) {
        float f = wcb.a;
        return wcb.c(gm3.a(ld4Var).y, gm3.a(ld4Var).y, gm3.a(ld4Var).y, ld4Var, 56);
    }

    public static gpe f(qh9 qh9Var) {
        gpe gpeVar;
        int i;
        String strM;
        String strM2;
        String strM3;
        try {
            bh9 bh9VarS = qh9Var.s("id");
            String strM4 = bh9VarS != null ? bh9VarS.m() : null;
            String strM5 = qh9Var.s("type").m();
            strM5.getClass();
            int[] iArrH = sq6.H(11);
            int length = iArrH.length;
            int iJ = 0;
            int i2 = 0;
            while (i2 < length) {
                int[] iArr = iArrH;
                int i3 = iArr[i2];
                if (grc.i(i3).equals(strM5)) {
                    bh9 bh9VarS2 = qh9Var.s(VerifyMagicLinkRequest.Credentials.DISCRIMINATOR);
                    if (bh9VarS2 != null && (strM3 = bh9VarS2.m()) != null) {
                        for (int i4 : sq6.H(9)) {
                            if (grc.f(i4).equals(strM3)) {
                                i = i4;
                            }
                        }
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                    i = 0;
                    String strM6 = qh9Var.s("url").m();
                    bh9 bh9VarS3 = qh9Var.s("status_code");
                    Long lValueOf = bh9VarS3 != null ? Long.valueOf(bh9VarS3.k()) : null;
                    bh9 bh9VarS4 = qh9Var.s("duration");
                    Long lValueOf2 = bh9VarS4 != null ? Long.valueOf(bh9VarS4.k()) : null;
                    bh9 bh9VarS5 = qh9Var.s("size");
                    Long lValueOf3 = bh9VarS5 != null ? Long.valueOf(bh9VarS5.k()) : null;
                    bh9 bh9VarS6 = qh9Var.s("encoded_body_size");
                    Long lValueOf4 = bh9VarS6 != null ? Long.valueOf(bh9VarS6.k()) : null;
                    bh9 bh9VarS7 = qh9Var.s("decoded_body_size");
                    Long lValueOf5 = bh9VarS7 != null ? Long.valueOf(bh9VarS7.k()) : null;
                    bh9 bh9VarS8 = qh9Var.s("transfer_size");
                    Long lValueOf6 = bh9VarS8 != null ? Long.valueOf(bh9VarS8.k()) : null;
                    bh9 bh9VarS9 = qh9Var.s("render_blocking_status");
                    int iJ2 = (bh9VarS9 == null || (strM2 = bh9VarS9.m()) == null) ? 0 : rqk.j(strM2);
                    bh9 bh9VarS10 = qh9Var.s("worker");
                    ope opeVarE = bh9VarS10 != null ? ask.e(bh9VarS10.g()) : null;
                    bh9 bh9VarS11 = qh9Var.s("redirect");
                    dpe dpeVarE = bh9VarS11 != null ? mqk.e(bh9VarS11.g()) : null;
                    bh9 bh9VarS12 = qh9Var.s("dns");
                    qoe qoeVarE = bh9VarS12 != null ? opk.e(bh9VarS12.g()) : null;
                    bh9 bh9VarS13 = qh9Var.s("connect");
                    hoe hoeVarL = bh9VarS13 != null ? vok.l(bh9VarS13.g()) : null;
                    bh9 bh9VarS14 = qh9Var.s("ssl");
                    kpe kpeVarC = bh9VarS14 != null ? urk.c(bh9VarS14.g()) : null;
                    bh9 bh9VarS15 = qh9Var.s("first_byte");
                    toe toeVarE = bh9VarS15 != null ? tpk.e(bh9VarS15.g()) : null;
                    bh9 bh9VarS16 = qh9Var.s("download");
                    roe roeVarF = bh9VarS16 != null ? ppk.f(bh9VarS16.g()) : null;
                    bh9 bh9VarS17 = qh9Var.s("protocol");
                    String strM7 = bh9VarS17 != null ? bh9VarS17.m() : null;
                    bh9 bh9VarS18 = qh9Var.s("delivery_type");
                    if (bh9VarS18 != null && (strM = bh9VarS18.m()) != null) {
                        iJ = jpk.j(strM);
                    }
                    int i5 = iJ;
                    bh9 bh9VarS19 = qh9Var.s("provider");
                    cpe cpeVarE = bh9VarS19 != null ? gqk.e(bh9VarS19.g()) : null;
                    bh9 bh9VarS20 = qh9Var.s("request");
                    epe epeVarD = bh9VarS20 != null ? sqk.d(bh9VarS20.g()) : null;
                    bh9 bh9VarS21 = qh9Var.s("response");
                    jpe jpeVarD = bh9VarS21 != null ? trk.d(bh9VarS21.g()) : null;
                    bh9 bh9VarS22 = qh9Var.s("graphql");
                    uoe uoeVarE = bh9VarS22 != null ? wpk.e(bh9VarS22.g()) : null;
                    strM6.getClass();
                    return new gpe(strM4, i3, i, strM6, lValueOf, lValueOf2, lValueOf3, lValueOf4, lValueOf5, lValueOf6, iJ2, opeVarE, dpeVarE, qoeVarE, hoeVarL, kpeVarC, toeVarE, roeVarF, strM7, i5, cpeVarE, epeVarD, jpeVarD, uoeVarE);
                }
                try {
                    gpeVar = null;
                    i2++;
                    iArrH = iArr;
                } catch (IllegalStateException e2) {
                    e = e2;
                    pmf.j("Unable to parse json into type Resource", e);
                    return gpeVar;
                } catch (NullPointerException e3) {
                    e = e3;
                    pmf.j("Unable to parse json into type Resource", e);
                    return gpeVar;
                } catch (NumberFormatException e4) {
                    e = e4;
                    pmf.j("Unable to parse json into type Resource", e);
                    return gpeVar;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e5) {
            e = e5;
            gpeVar = null;
        } catch (NullPointerException e6) {
            e = e6;
            gpeVar = null;
        } catch (NumberFormatException e7) {
            e = e7;
            gpeVar = null;
        }
    }

    public static Intent g(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return context.registerReceiver(broadcastReceiver, intentFilter, null, null, 0);
    }

    public static final void h(TextPaint textPaint, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        if (f < MTTypesetterKt.kLineSkipLimitMultiplier) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        textPaint.setAlpha(Math.round(f * 255.0f));
    }

    public static String i(wik wikVar) {
        StringBuilder sb = new StringBuilder(wikVar.g());
        for (int i = 0; i < wikVar.g(); i++) {
            byte bA = wikVar.a(i);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                        } else {
                            sb.append((char) bA);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
