package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.draw.a;
import coil3.compose.AsyncImagePainter;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.tool.ImageGalleryItem;
import com.anthropic.claude.api.chat.tool.ImageGalleryItemId;
import com.anthropic.claude.models.organization.configtypes.CoworkStarterChip;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fuk {
    public static final ta4 a = new ta4(1888314131, false, new cc4(6));
    public static final ta4 b = new ta4(1923138068, false, new cc4(7));

    /* JADX WARN: Removed duplicated region for block: B:102:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.tw0 r21, final defpackage.iqb r22, defpackage.ld4 r23, final int r24) {
        /*
            Method dump skipped, instruction units count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fuk.a(tw0, iqb, ld4, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final com.anthropic.claude.sessions.types.AskUserQuestionInput r19, final defpackage.iqb r20, defpackage.ld4 r21, final int r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fuk.b(com.anthropic.claude.sessions.types.AskUserQuestionInput, iqb, ld4, int):void");
    }

    public static final void c(int i, ld4 ld4Var, bz7 bz7Var, iqb iqbVar, List list) {
        int i2;
        bz7 bz7Var2;
        boolean z;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-905473166);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var.f(list) : e18Var.h(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i3 = i2;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            iqb iqbVarB = iqbVar.B(b.c);
            o5b o5bVarD = dw1.d(lja.G, false);
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
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, o5bVarD);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            vo1 vo1Var = lja.T;
            ho0 ho0Var = new ho0(8.0f, true, new sz6(1));
            xo1 xo1Var = lja.K;
            nw1 nw1Var = nw1.a;
            fqb fqbVar = fqb.E;
            iqb iqbVarL = gb9.L(nw1Var.a(fqbVar, xo1Var), 32.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            b9g b9gVar = b9g.a;
            iqb iqbVarV = b.v(iqbVarL, MTTypesetterKt.kLineSkipLimitMultiplier, 580.0f, 1);
            q64 q64VarA = p64.a(ho0Var, vo1Var, e18Var, 54);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarV);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, q64VarA);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            xn5.N(u00.D(R.drawable.cowork_empty_checklist, 0, e18Var), null, gb9.N(b.t(fqbVar, 64.0f), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 32.0f, 7), null, null, MTTypesetterKt.kLineSkipLimitMultiplier, null, e18Var, 440, 120);
            int i4 = i3;
            tjh.b(d4c.j0(R.string.cowork_empty_what_can_claude_tackle_title, e18Var), null, gm3.a(e18Var).M, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).a, e18Var, 0, 0, 130042);
            e18Var = e18Var;
            if (list.isEmpty()) {
                bz7Var2 = bz7Var;
                z = true;
                e18Var.a0(-1651813396);
                e18Var.p(false);
            } else {
                e18Var.a0(-1652219372);
                z = true;
                ho0 ho0Var2 = new ho0(16.0f, true, new sz6(1));
                iqb iqbVarN = gb9.N(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13);
                q64 q64VarA2 = p64.a(ho0Var2, vo1Var, e18Var, 54);
                int iHashCode3 = Long.hashCode(e18Var.T);
                hyc hycVarL3 = e18Var.l();
                iqb iqbVarE3 = kxk.E(e18Var, iqbVarN);
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
                e18Var.a0(-907361784);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    CoworkStarterChip coworkStarterChip = (CoworkStarterChip) it.next();
                    int i5 = i4;
                    boolean zF = e18Var.f(coworkStarterChip) | ((i5 & 896) == 256);
                    Object objN = e18Var.N();
                    if (zF || objN == jd4.a) {
                        objN = new d44(bz7Var, 18, coworkStarterChip);
                        e18Var.k0(objN);
                    }
                    d(coworkStarterChip, (zy7) objN, e18Var, 0);
                    i4 = i5;
                }
                bz7Var2 = bz7Var;
                ij0.w(e18Var, false, true, false);
            }
            e18Var.p(z);
            e18Var.p(z);
        } else {
            bz7Var2 = bz7Var;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new p22(iqbVar, list, bz7Var2, i);
        }
    }

    public static final void d(CoworkStarterChip coworkStarterChip, zy7 zy7Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-734225716);
        int i2 = i | (e18Var.f(coworkStarterChip) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16);
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            pzg.c(zy7Var, null, false, xve.a, gm3.a(e18Var).n, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, sf5.a(MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).v), null, fd9.q0(-202106399, new mk4(7, coworkStarterChip), e18Var), e18Var, (i2 >> 3) & 14, 742);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new t04(coworkStarterChip, zy7Var, i, 25);
        }
    }

    public static final void e(ImageGalleryItem imageGalleryItem, String str, AsyncImagePainter asyncImagePainter, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1367947469);
        int i2 = i | (e18Var.f(imageGalleryItem) ? 4 : 2) | (e18Var.f(str) ? 32 : 16) | (e18Var.f(asyncImagePainter) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.f(iqbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zC = e3g.c(e18Var);
            iqb iqbVarT = b.t(b.e(iqbVar, 150.0f), r(imageGalleryItem));
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new ed8(21);
                e18Var.k0(objN);
            }
            iqb iqbVarA = tjf.a(iqbVarT, (bz7) objN);
            boolean zG = e18Var.g(zC);
            Object objN2 = e18Var.N();
            if (zG || objN2 == lz1Var) {
                objN2 = new q8(zC, 27);
                e18Var.k0(objN2);
            }
            iqb iqbVarI0 = xn5.i0(iqbVarA, (bz7) objN2);
            float f = tw8.b;
            str.getClass();
            String strConcat = "image-gallery-".concat(str);
            iqbVarI0.getClass();
            iqb iqbVarA2 = a.a(yfd.p(xn5.V(e3g.d(iqbVarI0, strConcat, false, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var), gm3.b(e18Var).d), gm3.a(e18Var).q, zni.b), asyncImagePainter, null, ho4.a, MTTypesetterKt.kLineSkipLimitMultiplier, null, 52);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarA2);
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
            f(imageGalleryItem.getSource(), gb9.J(nw1.a.a(fqb.E, lja.M), 8.0f), e18Var, 0);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mm5(imageGalleryItem, str, asyncImagePainter, iqbVar, i, 10);
        }
    }

    public static final void f(String str, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1018663866);
        int i2 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.f(iqbVar) ? 32 : 16);
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            wo1 wo1Var = lja.Q;
            ho0 ho0Var = new ho0(4.0f, true, new sz6(1));
            iqb iqbVarK = gb9.K(yfd.p(xn5.V(iqbVar, xve.a(50)), d54.b(0.6f, d54.b), zni.b), 8.0f, 4.0f);
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
            bpc bpcVarA = com.anthropic.claude.design.icon.a.a(ud0.u0, e18Var);
            String strJ0 = d4c.j0(R.string.image_search_source, e18Var);
            long j = d54.d;
            cv8.b(bpcVarA, strJ0, b.o(fqb.E, 12.0f), j, e18Var, 3464, 0);
            tjh.b(str, null, j, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var).e.E).k, e18Var, (i2 & 14) | 384, 24960, 110586);
            e18Var = e18Var;
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ip(str, iqbVar, i, 12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b A[PHI: r6
      0x009b: PHI (r6v19 int) = (r6v0 int), (r6v5 int), (r6v6 int) binds: [B:54:0x0099, B:64:0x00b1, B:63:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(java.util.List r17, java.lang.String r18, boolean r19, java.lang.Integer r20, java.lang.String r21, defpackage.iqb r22, java.lang.String r23, boolean r24, defpackage.pz7 r25, defpackage.ld4 r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fuk.g(java.util.List, java.lang.String, boolean, java.lang.Integer, java.lang.String, iqb, java.lang.String, boolean, pz7, ld4, int, int):void");
    }

    public static final void h(ImageGalleryItem imageGalleryItem, AsyncImagePainter asyncImagePainter, final boolean z, final boolean z2, iqb iqbVar, zy7 zy7Var, ld4 ld4Var, int i) {
        iqb iqbVar2;
        iqb iqbVar3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(366424219);
        int i2 = i | (e18Var.f(imageGalleryItem) ? 4 : 2) | (e18Var.f(asyncImagePainter) ? 32 : 16) | (e18Var.g(z) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.g(z2) ? 2048 : FreeTypeConstants.FT_LOAD_NO_RECURSE) | 24576 | (e18Var.h(zy7Var) ? 131072 : 65536);
        if (e18Var.Q(i2 & 1, (74899 & i2) != 74898)) {
            nwb nwbVarU = mpk.u(asyncImagePainter.Y, e18Var);
            final boolean zC = e3g.c(e18Var);
            iqb iqbVarC = fqb.E;
            iqb iqbVarT = b.t(b.e(iqbVarC, 150.0f), r(imageGalleryItem));
            boolean zG = ((i2 & 896) == 256) | e18Var.g(zC) | ((i2 & 7168) == 2048);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zG || objN == lz1Var) {
                objN = new bz7() { // from class: vx8
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj) {
                        xre xreVar = (xre) obj;
                        xreVar.getClass();
                        xreVar.b((z && (zC || z2)) ? MTTypesetterKt.kLineSkipLimitMultiplier : 1.0f);
                        return iei.a;
                    }
                };
                e18Var.k0(objN);
            }
            iqb iqbVarT2 = ez1.t(xn5.V(xn5.i0(iqbVarT, (bz7) objN), gm3.b(e18Var).d), 0.5f, gm3.a(e18Var).v, gm3.b(e18Var).d);
            if (zy7Var != null) {
                e18Var.a0(-1661592713);
                boolean z3 = (i2 & 458752) == 131072;
                Object objN2 = e18Var.N();
                if (z3 || objN2 == lz1Var) {
                    objN2 = new kl1(14, zy7Var);
                    e18Var.k0(objN2);
                }
                iqbVarC = androidx.compose.foundation.b.c(iqbVarC, false, null, null, null, (zy7) objN2, 15);
                iqbVar3 = iqbVarC;
                e18Var.p(false);
            } else {
                iqbVar3 = iqbVarC;
                e18Var.a0(-1661508393);
                e18Var.p(false);
            }
            iqb iqbVarB = iqbVarT2.B(iqbVarC);
            o5b o5bVarD = dw1.d(lja.G, false);
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
            knk.e((t01) nwbVarU.getValue(), null, null, "Image search crossfade", fd9.q0(1787955465, new nw7(imageGalleryItem, 3, asyncImagePainter), e18Var), e18Var, 27648, 6);
            f(imageGalleryItem.getSource(), gb9.J(nw1.a.a(iqbVar3, lja.M), 8.0f), e18Var, 0);
            e18Var.p(true);
            iqbVar2 = iqbVar3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new kv2(imageGalleryItem, asyncImagePainter, z, z2, iqbVar2, zy7Var, i);
        }
    }

    public static final void i(List list, String str, iqb iqbVar, String str2, boolean z, pz7 pz7Var, yw8 yw8Var, ld4 ld4Var, int i) {
        int i2;
        iqb iqbVar2;
        yw8 yw8Var2;
        int i3;
        yw8 yw8Var3;
        iqb iqbVar3;
        ArrayList arrayList;
        j9f j9fVar;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(90225370);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(list) : e18Var.h(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(str) ? 32 : 16;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 |= e18Var.f(str2 != null ? ImageGalleryItemId.m304boximpl(str2) : null) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i4 |= e18Var.g(z) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i4 |= e18Var.h(pz7Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        boolean z2 = false;
        if (e18Var.Q(i4 & 1, (599187 & i4) != 599186)) {
            e18Var.V();
            int i5 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i5 == 0 || e18Var.A()) {
                mrg mrgVar = nai.j;
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(mrgVar) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(yw8.class), mrgVar, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                i3 = i4 & (-3670017);
                yw8Var3 = (yw8) objN;
                iqbVar3 = fqb.E;
            } else {
                e18Var.T();
                i3 = i4 & (-3670017);
                iqbVar3 = iqbVar;
                yw8Var3 = yw8Var;
            }
            e18Var.q();
            j9f j9fVarY = mpk.Y(e18Var);
            e18Var.a0(807266456);
            List list2 = list;
            ArrayList arrayList2 = new ArrayList(x44.y(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                ImageGalleryItem imageGalleryItem = (ImageGalleryItem) it.next();
                Context context = (Context) e18Var.j(w00.b);
                String thumbnail_url = imageGalleryItem.getThumbnail_url();
                if (thumbnail_url == null) {
                    thumbnail_url = imageGalleryItem.getUrl();
                }
                String str3 = thumbnail_url;
                int iM0 = ((cz5) e18Var.j(ve4.h)).M0(((Configuration) e18Var.j(w00.a)).screenWidthDp);
                if (iM0 > 1080) {
                    iM0 = 1080;
                }
                Iterator it2 = it;
                boolean zF2 = e18Var.f(str3) | ((((i3 & 112) ^ 48) > 32 && e18Var.f(str)) || (i3 & 48) == 32) | e18Var.d(iM0);
                Object objN2 = e18Var.N();
                if (zF2 || objN2 == lz1Var) {
                    fx8 fx8Var = new fx8(context);
                    fx8Var.c = str3;
                    fx8Var.e = tw8.g(imageGalleryItem, str);
                    q46.a(iM0);
                    fx8Var.n = new a5e(new j8g(new q46(iM0), s46.a));
                    objN2 = fx8Var.a();
                    e18Var.k0(objN2);
                }
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(vuk.l((jx8) objN2, yw8Var3, null, null, ho4.a, e18Var, 44));
                it = it2;
                arrayList2 = arrayList3;
                z2 = false;
                lz1Var = lz1Var;
            }
            lz1 lz1Var2 = lz1Var;
            ArrayList arrayList4 = arrayList2;
            e18Var.p(z2);
            cz5 cz5Var = (cz5) e18Var.j(ve4.h);
            zy7 zy7Var = (zy7) e18Var.j(e3g.d);
            nwb nwbVarZ = mpk.Z(Boolean.valueOf(z), e18Var);
            ImageGalleryItemId imageGalleryItemIdM304boximpl = str2 != null ? ImageGalleryItemId.m304boximpl(str2) : null;
            boolean zF3 = ((i3 & 14) == 4 || ((i3 & 8) != 0 && e18Var.h(list))) | ((i3 & 7168) == 2048) | e18Var.f(j9fVarY) | e18Var.f(cz5Var) | e18Var.f(zy7Var) | e18Var.f(nwbVarZ);
            Object objN3 = e18Var.N();
            if (zF3 || objN3 == lz1Var2) {
                arrayList = arrayList4;
                xx8 xx8Var = new xx8(list, j9fVarY, cz5Var, zy7Var, str2, nwbVarZ, null);
                j9fVar = j9fVarY;
                e18Var.k0(xx8Var);
                objN3 = xx8Var;
            } else {
                arrayList = arrayList4;
                j9fVar = j9fVarY;
            }
            fd9.i(e18Var, (pz7) objN3, imageGalleryItemIdM304boximpl);
            iqbVar3.getClass();
            ArrayList arrayList5 = arrayList;
            iqb iqbVar4 = iqbVar3;
            j(iqbVar4, j9fVar, fd9.q0(-499456227, new bn(list, str, arrayList5, str2, 24), e18Var), fd9.q0(-878014709, new kj2(list, arrayList5, str2, z, pz7Var), e18Var), e18Var, 3456, 0);
            iqbVar2 = iqbVar4;
            yw8Var2 = yw8Var3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            yw8Var2 = yw8Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new de3(list, str, iqbVar2, str2, z, pz7Var, yw8Var2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(defpackage.iqb r17, defpackage.j9f r18, defpackage.rz7 r19, defpackage.ta4 r20, defpackage.ld4 r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fuk.j(iqb, j9f, rz7, ta4, ld4, int, int):void");
    }

    public static final void k(String str, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-558874741);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.f(iqbVar) ? 32 : 16;
        }
        int i3 = i2;
        if (e18Var2.Q(i3 & 1, (i3 & 19) != 18)) {
            eli eliVar = (eli) e18Var2.j(ve4.t);
            String strJ0 = d4c.j0(R.string.image_search_results_from_the_web, e18Var2);
            tkh tkhVar = ((jm3) gm3.c(e18Var2).e.E).k;
            long j = gm3.a(e18Var2).O;
            iqb iqbVarN = gb9.N(iqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 4.0f, 4.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 9);
            boolean zH = e18Var2.h(eliVar) | ((i3 & 14) == 4);
            Object objN = e18Var2.N();
            if (zH || objN == jd4.a) {
                objN = new kp1(eliVar, str, 9);
                e18Var2.k0(objN);
            }
            e18Var = e18Var2;
            tjh.b(strJ0, androidx.compose.foundation.b.c(iqbVarN, false, null, null, null, (zy7) objN, 15), j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var, 0, 0, 131064);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new el(str, iqbVar, i, 5);
        }
    }

    public static final void l(iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(2111334570);
        int i2 = i | 6;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            xo1 xo1Var = lja.K;
            iqb iqbVarP = yfd.p(b.c, gm3.a(e18Var).q, zni.b);
            o5b o5bVarD = dw1.d(xo1Var, false);
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
            iv1.b(ud0.K1, d4c.j0(R.string.generic_error_title, e18Var), null, null, gm3.a(e18Var).y, e18Var, 0, 12);
            e18Var.p(true);
            iqbVar = fqb.E;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fl(i, 19, iqbVar);
        }
    }

    public static final void m(int i, int i2, ld4 ld4Var, iqb iqbVar) {
        int i3;
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1405042842);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            iqbVar2 = iqbVar;
            j(iqbVar2, null, null, fd9.q0(-570684779, new mv(i, 3), e18Var), e18Var, ((i3 >> 3) & 14) | 3072, 6);
        } else {
            iqbVar2 = iqbVar;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new wx8(i, i2, iqbVar2);
        }
    }

    public static final void n(iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1910979154);
        int i2 = i | 6;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            xo1 xo1Var = lja.K;
            fqb fqbVar = fqb.E;
            iqb iqbVarP = yfd.p(xn5.V(kud.d(b.v(b.e(fqbVar, 150.0f), 200.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), 1.3333334f, true), gm3.b(e18Var).d), gm3.a(e18Var).q, zni.b);
            o5b o5bVarD = dw1.d(xo1Var, false);
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
            ez1.a(null, vf2.H, gm3.a(e18Var).O, e18Var, 48, 1);
            e18Var.p(true);
            iqbVar = fqbVar;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fl(i, 21, iqbVar);
        }
    }

    public static final void o(iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1114074197);
        int i2 = i | 6;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            xo1 xo1Var = lja.K;
            iqb iqbVarP = yfd.p(b.c, gm3.a(e18Var).q, zni.b);
            o5b o5bVarD = dw1.d(xo1Var, false);
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
            ez1.a(null, vf2.H, gm3.a(e18Var).O, e18Var, 48, 1);
            e18Var.p(true);
            iqbVar = fqb.E;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fl(i, 20, iqbVar);
        }
    }

    public static final void p(j0a j0aVar, List list, bz7 bz7Var, pz7 pz7Var, mnc mncVar) {
        j0aVar.getClass();
        list.getClass();
        bz7Var.getClass();
        mncVar.getClass();
        j0aVar.W(list.size(), new zkd(pz7Var, 17, list), new wxf(list, 6), new ta4(2039820996, true, new izh(list, mncVar, bz7Var, list, 0)));
    }

    public static z5c q(edh edhVar, edh edhVar2) {
        return new z5c(edhVar.e, edhVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float r(com.anthropic.claude.api.chat.tool.ImageGalleryItem r3) {
        /*
            com.anthropic.claude.api.common.PixelSize r0 = r3.getThumbnailSize()
            r1 = 0
            if (r0 == 0) goto L1d
            int r2 = r0.getHeight()
            if (r2 <= 0) goto Le
            goto Lf
        Le:
            r0 = r1
        Lf:
            if (r0 == 0) goto L1d
            int r3 = r0.getWidth()
            float r3 = (float) r3
            int r0 = r0.getHeight()
        L1a:
            float r0 = (float) r0
            float r3 = r3 / r0
            goto L38
        L1d:
            com.anthropic.claude.api.common.PixelSize r3 = r3.getImageSize()
            if (r3 == 0) goto L36
            int r0 = r3.getHeight()
            if (r0 <= 0) goto L2a
            r1 = r3
        L2a:
            if (r1 == 0) goto L36
            int r3 = r1.getWidth()
            float r3 = (float) r3
            int r0 = r1.getHeight()
            goto L1a
        L36:
            r3 = 1065353216(0x3f800000, float:1.0)
        L38:
            r0 = 1125515264(0x43160000, float:150.0)
            float r0 = r0 * r3
            va6 r3 = new va6
            r3.<init>(r0)
            va6 r0 = new va6
            r1 = 1124859904(0x430c0000, float:140.0)
            r0.<init>(r1)
            va6 r1 = new va6
            r2 = 1132593152(0x43820000, float:260.0)
            r1.<init>(r2)
            java.lang.Comparable r3 = defpackage.wd6.h0(r3, r0, r1)
            va6 r3 = (defpackage.va6) r3
            float r3 = r3.E
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fuk.r(com.anthropic.claude.api.chat.tool.ImageGalleryItem):float");
    }

    public static final List s(tze tzeVar) {
        int iM = iv1.m(tzeVar, "id");
        int iM2 = iv1.m(tzeVar, "seq");
        int iM3 = iv1.m(tzeVar, "from");
        int iM4 = iv1.m(tzeVar, "to");
        d8a d8aVarE = x44.E();
        while (tzeVar.H0()) {
            d8aVarE.add(new zv7((int) tzeVar.getLong(iM), (int) tzeVar.getLong(iM2), tzeVar.g0(iM3), tzeVar.g0(iM4)));
        }
        return w44.h1(x44.v(d8aVarE));
    }

    public static final m3h t(lze lzeVar, String str, boolean z) throws Exception {
        tze tzeVarL0 = lzeVar.L0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iM = iv1.m(tzeVarL0, "seqno");
            int iM2 = iv1.m(tzeVarL0, "cid");
            int iM3 = iv1.m(tzeVarL0, "name");
            int iM4 = iv1.m(tzeVarL0, "desc");
            if (iM != -1 && iM2 != -1 && iM3 != -1 && iM4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (tzeVarL0.H0()) {
                    if (((int) tzeVarL0.getLong(iM2)) >= 0) {
                        int i = (int) tzeVarL0.getLong(iM);
                        String strG0 = tzeVarL0.g0(iM3);
                        String str2 = tzeVarL0.getLong(iM4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i), strG0);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List listI1 = w44.i1(linkedHashMap.entrySet(), new x8e(6));
                ArrayList arrayList = new ArrayList(x44.y(listI1, 10));
                Iterator it = listI1.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listP1 = w44.p1(arrayList);
                List listI12 = w44.i1(linkedHashMap2.entrySet(), new x8e(7));
                ArrayList arrayList2 = new ArrayList(x44.y(listI12, 10));
                Iterator it2 = listI12.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                m3h m3hVar = new m3h(str, z, listP1, w44.p1(arrayList2));
                csg.o(tzeVarL0, null);
                return m3hVar;
            }
            csg.o(tzeVarL0, null);
            return null;
        } finally {
        }
    }
}
