package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import coil3.compose.AsyncImagePainter;
import coil3.compose.AsyncImagePainter$State$Error;
import coil3.compose.AsyncImagePainter$State$Loading;
import coil3.compose.AsyncImagePainter$State$Success;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.tool.ImageGalleryItem;
import com.anthropic.claude.api.chat.tool.ImageGalleryItemId;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.types.strings.ToolUseId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tw8 {
    public static final long a = d54.b(0.4f, d54.b);
    public static final float b = 120.0f;

    public static final void a(koc kocVar, List list, String str, yw8 yw8Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1707143575);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(kocVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var.f(list) : e18Var.h(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(str) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0 ? e18Var.f(yw8Var) : e18Var.h(yw8Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.f(iqbVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            ImageGalleryItem imageGalleryItem = (ImageGalleryItem) w44.O0(((isc) kocVar.d.G).h(), list);
            if (imageGalleryItem == null) {
                e18Var.a0(-806257272);
                e18Var.p(false);
            } else {
                e18Var.a0(-806257271);
                f(imageGalleryItem, str, yw8Var, iqbVar, e18Var, (i2 >> 3) & 8176);
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pk((Object) kocVar, list, (Object) str, (Object) yw8Var, (Object) iqbVar, i, 16);
        }
    }

    public static final void b(ImageGalleryItem imageGalleryItem, iqb iqbVar, ld4 ld4Var, int i) {
        Object obj;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(307631240);
        int i2 = i | (e18Var.f(imageGalleryItem) ? 4 : 2) | 48;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            eli eliVar = (eli) e18Var.j(ve4.t);
            String page_url = imageGalleryItem.getPage_url();
            if (page_url == null) {
                page_url = imageGalleryItem.getUrl();
            }
            fqb fqbVar = fqb.E;
            iqb iqbVarC = b.c(fqbVar, 1.0f);
            wo8 wo8Var = zni.b;
            iqb iqbVarP = yfd.p(iqbVarC, a, wo8Var);
            WeakHashMap weakHashMap = gdj.x;
            iqb iqbVarK = gb9.K(knk.M(iqbVarP, s4i.d(e18Var).e), 16.0f, 12.0f);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
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
            wo1 wo1Var = lja.Q;
            ho0 ho0Var = new ho0(6.0f, true, new sz6(1));
            iqb iqbVarV = xn5.V(fqbVar, xve.a(50));
            long j = d54.d;
            iqb iqbVarP2 = yfd.p(iqbVarV, d54.b(0.15f, j), wo8Var);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = vb7.f(e18Var);
            }
            zub zubVar = (zub) objN;
            boolean zH = e18Var.h(eliVar) | e18Var.f(page_url);
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var) {
                objN2 = new kp1(eliVar, page_url, 8);
                e18Var.k0(objN2);
            }
            iqb iqbVarK2 = gb9.K(androidx.compose.foundation.b.b(iqbVarP2, zubVar, null, false, null, null, (zy7) objN2, 28), 10.0f, 6.0f);
            cxe cxeVarA = axe.a(ho0Var, wo1Var, e18Var, 54);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarK2);
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
            cv8.b(a.a(ud0.u0, e18Var), d4c.j0(R.string.image_search_source, e18Var), b.o(fqbVar, 14.0f), j, e18Var, 3464, 0);
            fqb fqbVar2 = fqbVar;
            tjh.b(imageGalleryItem.getSource(), null, j, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 384, 24960, 110586);
            e18Var = e18Var;
            e18Var.p(true);
            if (bsg.I0(imageGalleryItem.getTitle())) {
                e18Var.a0(2039784452);
                e18Var.p(false);
            } else {
                sq6.A(8.0f, 2039430804, e18Var, e18Var, fqbVar2);
                tjh.b(imageGalleryItem.getTitle(), null, d54.b(0.85f, j), 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, tkh.b(((jm3) gm3.c(e18Var).e.E).i, 0L, 0L, dv7.K, null, null, 0L, null, 0, 0L, null, 0, 16777211), e18Var, 384, 24960, 110586);
                e18Var = e18Var;
                e18Var.p(false);
            }
            e18Var.p(true);
            obj = fqbVar2;
        } else {
            e18Var.T();
            obj = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new um5(imageGalleryItem, obj, i, 24);
        }
    }

    public static final void c(ImageGalleryItem imageGalleryItem, String str, gkj gkjVar, yw8 yw8Var, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        iqb iqbVarA;
        boolean z;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(708115210);
        int i2 = i | (e18Var.f(imageGalleryItem) ? 4 : 2) | (e18Var.f(gkjVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.f(yw8Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | 24576;
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = fd9.O(im6.E, e18Var);
                e18Var.k0(objN);
            }
            l45 l45Var = (l45) objN;
            Context context = (Context) e18Var.j(w00.b);
            boolean zF = e18Var.f(imageGalleryItem.getUrl());
            Object objN2 = e18Var.N();
            if (zF || objN2 == lz1Var) {
                fx8 fx8Var = new fx8(context);
                fx8Var.c = imageGalleryItem.getUrl();
                fx8Var.e(g(imageGalleryItem, str));
                fx8Var.n = new a5e(j8g.c);
                objN2 = fx8Var.a();
                e18Var.k0(objN2);
            }
            AsyncImagePainter asyncImagePainterL = vuk.l((jx8) objN2, yw8Var, null, null, null, e18Var, 60);
            nwb nwbVarU = mpk.u(asyncImagePainterL.Y, e18Var);
            boolean z2 = ((t01) nwbVarU.getValue()) instanceof AsyncImagePainter$State$Success;
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = mpk.w(new xi4(21, gkjVar));
                e18Var.k0(objN3);
            }
            wlg wlgVar = (wlg) objN3;
            boolean zC = e3g.c(e18Var);
            xo1 xo1Var = lja.K;
            FillElement fillElement = b.c;
            boolean zG = e18Var.g(zC);
            Object objN4 = e18Var.N();
            if (zG || objN4 == lz1Var) {
                objN4 = new q8(zC, 25);
                e18Var.k0(objN4);
            }
            iqb iqbVarI0 = xn5.i0(fillElement, (bz7) objN4);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarI0);
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
            String title = imageGalleryItem.getTitle();
            tp4 tp4Var = null;
            if (bsg.I0(title)) {
                title = null;
            }
            fqb fqbVar = fqb.E;
            if (z2) {
                e18Var.a0(-1465312399);
                boolean zBooleanValue = ((Boolean) wlgVar.getValue()).booleanValue();
                Object objN5 = e18Var.N();
                if (objN5 == lz1Var) {
                    objN5 = new vj(2, tp4Var, 11);
                    e18Var.k0(objN5);
                }
                iqb iqbVarJ = iik.j(fqbVar, gkjVar, zBooleanValue, (pz7) objN5, 26);
                boolean zH = ((i2 & 896) == 256) | e18Var.h(l45Var);
                Object objN6 = e18Var.N();
                if (zH || objN6 == lz1Var) {
                    objN6 = new c35(l45Var, 2, gkjVar);
                    e18Var.k0(objN6);
                }
                iqbVarA = a0h.a(iqbVarJ, iei.a, (PointerInputEventHandler) objN6);
                e18Var.p(false);
            } else {
                e18Var.a0(-1464165926);
                e18Var.p(false);
                iqbVarA = fqbVar;
            }
            xn5.N(asyncImagePainterL, title, fillElement.B(iqbVarA), null, ho4.b, MTTypesetterKt.kLineSkipLimitMultiplier, null, e18Var, 24576, 104);
            e18Var = e18Var;
            t01 t01Var = (t01) nwbVarU.getValue();
            if ((t01Var instanceof AsyncImagePainter$State$Loading) || (t01Var instanceof r01)) {
                z = true;
                e18Var.a0(-1155602634);
                ez1.a(null, null, d54.d, e18Var, 384, 3);
                e18Var = e18Var;
                e18Var.p(false);
            } else if (t01Var instanceof AsyncImagePainter$State$Error) {
                e18Var.a0(-1155599638);
                z = true;
                tjh.b(d4c.j0(R.string.generic_error_something_went_wrong, e18Var), null, d54.b(0.7f, d54.d), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 384, 0, 131066);
                e18Var = e18Var;
                e18Var.p(false);
            } else {
                z = true;
                if (!(t01Var instanceof AsyncImagePainter$State$Success)) {
                    throw ebh.u(e18Var, -1155606361, false);
                }
                e18Var.a0(-1155591212);
                e18Var.p(false);
            }
            e18Var.p(z);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new uo(imageGalleryItem, str, gkjVar, yw8Var, iqbVar2, i, 24);
        }
    }

    public static final void d(int i, int i2, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i3) {
        iqb iqbVar2;
        fqb fqbVar;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(272387651);
        int i4 = i3 | (e18Var.d(i) ? 4 : 2) | (e18Var.d(i2) ? 32 : 16) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 3072;
        if (e18Var.Q(i4 & 1, (i4 & 1171) != 1170)) {
            wo1 wo1Var = lja.Q;
            fqb fqbVar2 = fqb.E;
            iqb iqbVarP = yfd.p(b.c(fqbVar2, 1.0f), a, zni.b);
            WeakHashMap weakHashMap = gdj.x;
            iqb iqbVarJ = gb9.J(knk.M(iqbVarP, s4i.d(e18Var).f), 4.0f);
            cxe cxeVarA = axe.a(ko0.g, wo1Var, e18Var, 54);
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
            d4c.i0(e18Var, cd4.f, cxeVarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            ez1.e(zy7Var, null, false, null, null, zmk.a, e18Var, ((i4 >> 6) & 14) | 1572864, 62);
            if (i2 > 1) {
                e18Var.a0(1351571977);
                fqbVar = fqbVar2;
                tjh.b(d4c.k0(R.string.image_gallery_page_indicator, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, e18Var), null, d54.d, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkh.b(((jm3) gm3.c(e18Var).e.E).g, 0L, 0L, null, null, null, 0L, null, 0, 0L, null, 0, 16777151), e18Var, 384, 0, 131066);
                e18Var = e18Var;
                e18Var.p(false);
            } else {
                fqbVar = fqbVar2;
                e18Var.a0(1351873731);
                e18Var.p(false);
            }
            kxk.g(e18Var, b.o(fqbVar, 48.0f));
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new vp(i, i2, zy7Var, iqbVar2, i3, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [int] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v61 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [int] */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r9v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static final void e(String str, zy7 zy7Var, iqb iqbVar, gw8 gw8Var, yw8 yw8Var, ld4 ld4Var, int i) {
        gw8 gw8Var2;
        yw8 yw8Var2;
        e18 e18Var;
        int i2;
        yw8 yw8Var3;
        gw8 gw8Var3;
        List list;
        lz1 lz1Var;
        int i3;
        String str2;
        ?? r9;
        gw8 gw8Var4;
        Object obj;
        xs5 xs5Var;
        List list2;
        Object heVar;
        List list3;
        xs5 xs5Var2;
        String str3;
        nwb nwbVar;
        float f;
        l45 l45Var;
        nwb nwbVar2;
        hsc hscVar;
        tp4 tp4Var;
        Object obj2;
        nwb nwbVar3;
        Object obj3;
        gw8 gw8Var5;
        float f2;
        zy7 zy7Var2;
        l45 l45Var2;
        hsc hscVar2;
        Object obj4;
        xs5 xs5Var3;
        List list4;
        str.getClass();
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(636521972);
        int i4 = i | (e18Var2.f(str) ? 4 : 2) | (e18Var2.h(zy7Var) ? 32 : 16) | 9216;
        if (e18Var2.Q(i4 & 1, (i4 & 9363) != 9362)) {
            e18Var2.V();
            int i5 = i & 1;
            lz1 lz1Var2 = jd4.a;
            if (i5 == 0 || e18Var2.A()) {
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
                Object objN = e18Var2.N();
                if (zF || objN == lz1Var2) {
                    objN = m7fVarN.a(jce.a.b(gw8.class), null, null);
                    e18Var2.k0(objN);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                gw8 gw8Var6 = (gw8) objN;
                mrg mrgVar = nai.j;
                m7f m7fVarN2 = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF2 = e18Var2.f(mrgVar) | e18Var2.f(m7fVarN2);
                Object objN2 = e18Var2.N();
                if (zF2 || objN2 == lz1Var2) {
                    objN2 = m7fVarN2.a(jce.a.b(yw8.class), mrgVar, null);
                    e18Var2.k0(objN2);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                i2 = i4 & (-64513);
                yw8Var3 = (yw8) objN2;
                gw8Var3 = gw8Var6;
            } else {
                e18Var2.T();
                gw8Var3 = gw8Var;
                i2 = i4 & (-64513);
                yw8Var3 = yw8Var;
            }
            e18Var2.q();
            Object objN3 = e18Var2.N();
            Object obj5 = objN3;
            if (objN3 == lz1Var2) {
                List listP1 = w44.p1(gw8Var3.a.y());
                e18Var2.k0(listP1);
                obj5 = listP1;
            }
            List list5 = (List) obj5;
            Object objN4 = e18Var2.N();
            if (objN4 == lz1Var2) {
                ToolUseId toolUseId = (ToolUseId) gw8Var3.c.getValue();
                String strM1163unboximpl = toolUseId != null ? toolUseId.m1163unboximpl() : null;
                objN4 = strM1163unboximpl != null ? ToolUseId.m1157boximpl(strM1163unboximpl) : null;
                e18Var2.k0(objN4);
            }
            ToolUseId toolUseId2 = (ToolUseId) objN4;
            String strM1163unboximpl2 = toolUseId2 != null ? toolUseId2.m1163unboximpl() : null;
            Object objN5 = e18Var2.N();
            Object obj6 = objN5;
            if (objN5 == lz1Var2) {
                Integer numValueOf = Integer.valueOf(gw8Var3.f);
                e18Var2.k0(numValueOf);
                obj6 = numValueOf;
            }
            int iIntValue = ((Number) obj6).intValue();
            int i6 = i2 & 112;
            boolean zH = e18Var2.h(list5) | (i6 == 32) | e18Var2.h(gw8Var3);
            Object objN6 = e18Var2.N();
            if (zH || objN6 == lz1Var2) {
                list = list5;
                lz1Var = lz1Var2;
                i3 = i2;
                str2 = strM1163unboximpl2;
                r9 = 0;
                wu0 wu0Var = new wu0(list, str2, zy7Var, gw8Var3, iIntValue);
                gw8Var4 = gw8Var3;
                e18Var2.k0(wu0Var);
                obj = wu0Var;
            } else {
                list = list5;
                lz1Var = lz1Var2;
                i3 = i2;
                gw8Var4 = gw8Var3;
                str2 = strM1163unboximpl2;
                r9 = 0;
                obj = objN6;
            }
            fd9.d(iei.a, (bz7) obj, e18Var2);
            int i7 = ((i3 & 14) == 4 ? 1 : r9) | (e18Var2.f(list) ? 1 : 0);
            Object objN7 = e18Var2.N();
            Object obj7 = objN7;
            if (i7 != 0 || objN7 == lz1Var) {
                Iterator it = list.iterator();
                ?? r10 = r9;
                while (true) {
                    if (!it.hasNext()) {
                        r10 = -1;
                        break;
                    } else if (ImageGalleryItemId.m307equalsimpl0(((ImageGalleryItem) it.next()).m303getIdivCCbqw(), str)) {
                        break;
                    } else {
                        r10 = (r10 == true ? 1 : 0) + 1;
                    }
                }
                if (r10 < 0) {
                    r10 = r9;
                }
                Integer numValueOf2 = Integer.valueOf((int) r10);
                e18Var2.k0(numValueOf2);
                obj7 = numValueOf2;
            }
            int iIntValue2 = ((Number) obj7).intValue();
            boolean zH2 = e18Var2.h(list);
            Object objN8 = e18Var2.N();
            Object obj8 = objN8;
            if (zH2 || objN8 == lz1Var) {
                ws5 ws5Var = new ws5(list, 1);
                e18Var2.k0(ws5Var);
                obj8 = ws5Var;
            }
            xs5 xs5VarB = moc.b(iIntValue2, r9, e18Var2, (zy7) obj8);
            boolean zF3 = e18Var2.f(xs5VarB) | e18Var2.h(gw8Var4) | e18Var2.h(list);
            Object objN9 = e18Var2.N();
            if (zF3 || objN9 == lz1Var) {
                List list6 = list;
                objN9 = new x43(xs5VarB, gw8Var4, list6, iIntValue, (tp4) null);
                xs5Var = xs5VarB;
                list2 = list6;
                e18Var2.k0(objN9);
            } else {
                list2 = list;
                xs5Var = xs5VarB;
            }
            fd9.j(xs5Var, list2, (pz7) objN9, e18Var2);
            boolean zD = e18Var2.d(list2.size());
            Object objN10 = e18Var2.N();
            Object obj9 = objN10;
            if (zD || objN10 == lz1Var) {
                int size = list2.size();
                ArrayList arrayList = new ArrayList(size);
                for (?? r15 = r9; r15 < size; r15++) {
                    arrayList.add(new gkj(wd6.o0()));
                }
                e18Var2.k0(arrayList);
                obj9 = arrayList;
            }
            List list7 = (List) obj9;
            Object objN11 = e18Var2.N();
            Object obj10 = objN11;
            if (objN11 == lz1Var) {
                wz5 wz5VarW = mpk.w(new w95(list7, 26, xs5Var));
                e18Var2.k0(wz5VarW);
                obj10 = wz5VarW;
            }
            wlg wlgVar = (wlg) obj10;
            Object objN12 = e18Var2.N();
            Object obj11 = objN12;
            if (objN12 == lz1Var) {
                hsc hscVar3 = new hsc(MTTypesetterKt.kLineSkipLimitMultiplier);
                e18Var2.k0(hscVar3);
                obj11 = hscVar3;
            }
            hsc hscVar4 = (hsc) obj11;
            Object objN13 = e18Var2.N();
            Object obj12 = objN13;
            if (objN13 == lz1Var) {
                lsc lscVarP = mpk.P(Boolean.FALSE);
                e18Var2.k0(lscVarP);
                obj12 = lscVarP;
            }
            nwb nwbVar4 = (nwb) obj12;
            Object objN14 = e18Var2.N();
            Object obj13 = objN14;
            if (objN14 == lz1Var) {
                lsc lscVarP2 = mpk.P(Boolean.FALSE);
                e18Var2.k0(lscVarP2);
                obj13 = lscVarP2;
            }
            nwb nwbVar5 = (nwb) obj13;
            Object objN15 = e18Var2.N();
            Object obj14 = objN15;
            if (objN15 == lz1Var) {
                l45 l45VarO = fd9.O(im6.E, e18Var2);
                e18Var2.k0(l45VarO);
                obj14 = l45VarO;
            }
            l45 l45Var3 = (l45) obj14;
            int i8 = (e18Var2.h(gw8Var4) ? 1 : 0) | (e18Var2.h(l45Var3) ? 1 : 0) | (i6 == 32 ? 1 : r9);
            Object objN16 = e18Var2.N();
            if (i8 != 0 || objN16 == lz1Var) {
                list3 = list7;
                xs5Var2 = xs5Var;
                str3 = str2;
                nwbVar = nwbVar5;
                f = 0.0f;
                l45Var = l45Var3;
                nwbVar2 = nwbVar4;
                hscVar = hscVar4;
                heVar = new he(14, nwbVar, gw8Var4, l45Var, zy7Var);
                e18Var2.k0(heVar);
            } else {
                heVar = objN16;
                str3 = str2;
                nwbVar = nwbVar5;
                l45Var = l45Var3;
                list3 = list7;
                xs5Var2 = xs5Var;
                f = 0.0f;
                nwbVar2 = nwbVar4;
                hscVar = hscVar4;
            }
            zy7 zy7Var3 = (zy7) heVar;
            nai.a(r9, 1, e18Var2, zy7Var3, r9);
            Object objN17 = e18Var2.N();
            Object obj15 = objN17;
            if (objN17 == lz1Var) {
                a80 a80VarA = zh4.a(f);
                e18Var2.k0(a80VarA);
                obj15 = a80VarA;
            }
            a80 a80Var = (a80) obj15;
            Boolean bool = (Boolean) nwbVar.getValue();
            bool.getClass();
            boolean zH3 = e18Var2.h(a80Var);
            Object objN18 = e18Var2.N();
            if (zH3 || objN18 == lz1Var) {
                tp4Var = null;
                ix5 ix5Var = new ix5(a80Var, nwbVar, tp4Var, 18);
                e18Var2.k0(ix5Var);
                obj2 = ix5Var;
            } else {
                tp4Var = null;
                obj2 = objN18;
            }
            fd9.i(e18Var2, (pz7) obj2, bool);
            Object objN19 = e18Var2.N();
            Object obj16 = objN19;
            if (objN19 == lz1Var) {
                lsc lscVarP3 = mpk.P(tp4Var);
                e18Var2.k0(lscVarP3);
                obj16 = lscVarP3;
            }
            nwb nwbVar6 = (nwb) obj16;
            float fQ0 = ((cz5) e18Var2.j(ve4.h)).q0(b);
            Object objN20 = e18Var2.N();
            Object obj17 = objN20;
            if (objN20 == lz1Var) {
                f25 f25Var = new f25(nwbVar6, 16, hscVar);
                e18Var2.k0(f25Var);
                obj17 = f25Var;
            }
            pd6 pd6VarB = nd6.b((bz7) obj17, e18Var2, 6);
            List list8 = list2;
            lz1 lz1Var3 = lz1Var;
            hsc hscVar5 = hscVar;
            List list9 = list3;
            yw8 yw8Var4 = yw8Var3;
            String str4 = str3;
            wlg wlgVarB = n80.b(((Boolean) nwbVar.getValue()).booleanValue() ? MTTypesetterKt.kLineSkipLimitMultiplier : 1.0f, null, "Dismiss scrim fade", e18Var2, 3072, 22);
            Object objN21 = e18Var2.N();
            if (objN21 == lz1Var3) {
                nwbVar3 = nwbVar2;
                wz5 wz5VarW2 = mpk.w(new mw8(wlgVar, nwbVar3, nwbVar, 0));
                e18Var2.k0(wz5VarW2);
                obj3 = wz5VarW2;
            } else {
                nwbVar3 = nwbVar2;
                obj3 = objN21;
            }
            wlg wlgVar2 = (wlg) obj3;
            FillElement fillElement = b.c;
            iqb iqbVarB = iqbVar.B(fillElement);
            boolean z = ((Boolean) wlgVar.getValue()).booleanValue() && !((Boolean) nwbVar.getValue()).booleanValue();
            boolean zH4 = e18Var2.h(gw8Var4);
            Object objN22 = e18Var2.N();
            Object obj18 = objN22;
            if (zH4 || objN22 == lz1Var3) {
                n23 n23Var = new n23(gw8Var4, nwbVar3, nwbVar6, (tp4) null);
                e18Var2.k0(n23Var);
                obj18 = n23Var;
            }
            rz7 rz7Var = (rz7) obj18;
            boolean zC = e18Var2.c(fQ0) | e18Var2.f(zy7Var3) | e18Var2.h(l45Var) | e18Var2.h(gw8Var4);
            Object objN23 = e18Var2.N();
            if (zC || objN23 == lz1Var3) {
                gw8Var5 = gw8Var4;
                l45 l45Var4 = l45Var;
                objN23 = new qw8(fQ0, zy7Var3, l45Var4, nwbVar3, hscVar5, gw8Var5, nwbVar6, null);
                f2 = fQ0;
                zy7Var2 = zy7Var3;
                l45Var2 = l45Var4;
                hscVar2 = hscVar5;
                e18Var2.k0(objN23);
            } else {
                zy7Var2 = zy7Var3;
                f2 = fQ0;
                gw8Var5 = gw8Var4;
                l45Var2 = l45Var;
                hscVar2 = hscVar5;
            }
            iqb iqbVarA = nd6.a(iqbVarB, pd6VarB, ukc.E, z, null, false, rz7Var, (rz7) objN23, false, 152);
            xo1 xo1Var = lja.G;
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarA);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var2, z80Var, o5bVarD);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var2, z80Var2, hycVarL);
            Integer numValueOf3 = Integer.valueOf(iHashCode);
            zy7 zy7Var4 = zy7Var2;
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var2, z80Var3, numValueOf3);
            bx bxVar = cd4.h;
            d4c.h0(e18Var2, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var2, z80Var4, iqbVarE);
            boolean zF4 = e18Var2.f(wlgVarB) | e18Var2.c(f2);
            Object objN24 = e18Var2.N();
            l45 l45Var5 = l45Var2;
            int i9 = 3;
            Object obj19 = objN24;
            if (zF4 || objN24 == lz1Var3) {
                k10 k10Var = new k10(wlgVarB, f2, hscVar2, i9);
                e18Var2.k0(k10Var);
                obj19 = k10Var;
            }
            dw1.a(yfd.p(xn5.i0(fillElement, (bz7) obj19), d54.b, zni.b), e18Var2, 0);
            String strJ0 = d4c.j0(R.string.image_gallery_next_image_a11y, e18Var2);
            String strJ02 = d4c.j0(R.string.image_gallery_previous_image_a11y, e18Var2);
            Object objN25 = e18Var2.N();
            if (objN25 == lz1Var3) {
                rk1 rk1Var = new rk1(hscVar2, 1);
                e18Var2.k0(rk1Var);
                obj4 = rk1Var;
            } else {
                obj4 = objN25;
            }
            iqb iqbVarL = sf5.L(fillElement, (bz7) obj4);
            boolean zH5 = e18Var2.h(a80Var);
            Object objN26 = e18Var2.N();
            Object obj20 = objN26;
            if (zH5 || objN26 == lz1Var3) {
                nn nnVar = new nn(26, a80Var);
                e18Var2.k0(nnVar);
                obj20 = nnVar;
            }
            iqb iqbVarH0 = fd9.h0(iqbVarL, (rz7) obj20);
            o5b o5bVarD2 = dw1.d(xo1Var, false);
            int iHashCode2 = Long.hashCode(e18Var2.T);
            hyc hycVarL2 = e18Var2.l();
            iqb iqbVarE2 = kxk.E(e18Var2, iqbVarH0);
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, z80Var, o5bVarD2);
            d4c.i0(e18Var2, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var2, z80Var3, e18Var2, bxVar);
            d4c.i0(e18Var2, z80Var4, iqbVarE2);
            xs5 xs5Var4 = xs5Var2;
            boolean zF5 = e18Var2.f(xs5Var4) | e18Var2.f(strJ02) | e18Var2.h(l45Var5) | e18Var2.f(strJ0);
            Object objN27 = e18Var2.N();
            if (zF5 || objN27 == lz1Var3) {
                objN27 = new fe(xs5Var4, strJ02, strJ0, l45Var5, 20);
                e18Var2.k0(objN27);
            }
            wwk.c(8.0f, 0, 196608, 16348, null, null, fd9.q0(2070986800, new kw(list8, str4, list9, yw8Var4), e18Var2), e18Var2, tjf.b(fillElement, false, (bz7) objN27), null, null, null, xs5Var4, null, null, false);
            nw1 nw1Var = nw1.a;
            fqb fqbVar = fqb.E;
            if (str4 != null) {
                e18Var2.a0(-1503169888);
                a(xs5Var4, list8, str4, yw8Var4, nw1Var.a(fqbVar, lja.K), e18Var2, 384);
                xs5Var3 = xs5Var4;
                list4 = list8;
                e18Var2.p(false);
            } else {
                xs5Var3 = xs5Var4;
                list4 = list8;
                e18Var2.a0(-1502876783);
                e18Var2.p(false);
            }
            e18Var2.p(true);
            wd6.M(((Boolean) wlgVar2.getValue()).booleanValue(), nw1Var.a(b.c(fqbVar, 1.0f), lja.H), gp6.e(null, 3), gp6.f(kxk.N(100, 0, null, 6), 2), null, fd9.q0(-585242538, new xg4(xs5Var3, list4, zy7Var4, 17), e18Var2), e18Var2, 200064, 16);
            wd6.M(((Boolean) wlgVar2.getValue()).booleanValue(), nw1Var.a(b.c(fqbVar, 1.0f), lja.N), gp6.e(null, 3), gp6.f(kxk.N(100, 0, null, 6), 2), null, fd9.q0(1529031167, new nw7(list4, 2, xs5Var3), e18Var2), e18Var2, 200064, 16);
            e18 e18Var3 = e18Var2;
            e18Var3.p(true);
            gw8Var2 = gw8Var5;
            yw8Var2 = yw8Var4;
            e18Var = e18Var3;
        } else {
            e18 e18Var4 = e18Var2;
            e18Var4.T();
            gw8Var2 = gw8Var;
            yw8Var2 = yw8Var;
            e18Var = e18Var4;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new uo(str, zy7Var, iqbVar, (Object) gw8Var2, (Object) yw8Var2, i, 25);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0105 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(com.anthropic.claude.api.chat.tool.ImageGalleryItem r13, java.lang.String r14, defpackage.yw8 r15, defpackage.iqb r16, defpackage.ld4 r17, int r18) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tw8.f(com.anthropic.claude.api.chat.tool.ImageGalleryItem, java.lang.String, yw8, iqb, ld4, int):void");
    }

    public static final String g(ImageGalleryItem imageGalleryItem, String str) {
        imageGalleryItem.getClass();
        str.getClass();
        return ij0.k("gallery-cache-", str, "-", imageGalleryItem.m303getIdivCCbqw());
    }
}
