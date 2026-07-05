package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mkk {
    public static final ta4 a = new ta4(1131014953, false, new pb4(1));

    static {
        new ta4(1281057409, false, new pb4(2));
        new ta4(560137987, false, new pb4(3));
        new ta4(-160781435, false, new pb4(4));
        new ta4(-521241146, false, new pb4(5));
        new ta4(-176841227, false, new pb4(6));
        new ta4(2044105267, false, new pb4(7));
        new ta4(-29915535, false, new pb4(8));
        new ta4(-1066925936, false, new pb4(9));
    }

    public static final void a(m8j m8jVar, zy7 zy7Var, iqb iqbVar, boolean z, z7j z7jVar, bz7 bz7Var, bz7 bz7Var2, lfa lfaVar, bz7 bz7Var3, ld4 ld4Var, int i) {
        int i2;
        z7j z7jVar2;
        bz7 bz7Var4;
        int i3;
        z7j z7jVar3;
        bz7 bz7Var5;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-786107086);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(m8jVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.g(z) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.h(bz7Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var.h(bz7Var2) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= e18Var.h(lfaVar) ? 8388608 : 4194304;
        }
        int i4 = i2 | 100663296;
        int i5 = 1;
        if (e18Var.Q(i4 & 1, (38347923 & i4) != 38347922)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                Object objN = e18Var.N();
                lz1 lz1Var = jd4.a;
                if (objN == lz1Var) {
                    objN = fd9.O(im6.E, e18Var);
                    e18Var.k0(objN);
                }
                l45 l45Var = (l45) objN;
                boolean zF = e18Var.f(l45Var);
                Object objN2 = e18Var.N();
                if (zF || objN2 == lz1Var) {
                    objN2 = new z7j(l45Var);
                    e18Var.k0(objN2);
                }
                z7j z7jVar4 = (z7j) objN2;
                i3 = i4 & (-57345);
                Object objN3 = e18Var.N();
                if (objN3 == lz1Var) {
                    objN3 = new q6(i5);
                    e18Var.k0(objN3);
                }
                z7jVar3 = z7jVar4;
                bz7Var5 = (bz7) objN3;
            } else {
                e18Var.T();
                i3 = i4 & (-57345);
                z7jVar3 = z7jVar;
                bz7Var5 = bz7Var3;
            }
            e18Var.q();
            xn5.H(iqbVar, null, false, fd9.q0(480521736, new b7(m8jVar, zy7Var, z, z7jVar3, bz7Var, bz7Var2, lfaVar, bz7Var5), e18Var), e18Var, ((i3 >> 6) & 14) | 3072, 6);
            z7jVar2 = z7jVar3;
            bz7Var4 = bz7Var5;
        } else {
            e18Var.T();
            z7jVar2 = z7jVar;
            bz7Var4 = bz7Var3;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new c7(m8jVar, zy7Var, iqbVar, z, z7jVar2, bz7Var, bz7Var2, lfaVar, bz7Var4, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24, types: [int] */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    public static final void b(m8j m8jVar, FrameLayout.LayoutParams layoutParams, zy7 zy7Var, boolean z, z7j z7jVar, bz7 bz7Var, bz7 bz7Var2, lfa lfaVar, bz7 bz7Var3, ld4 ld4Var, int i) {
        boolean z2;
        Object e7Var;
        ?? r11;
        int i2;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-956982364);
        int i3 = i | (e18Var.f(m8jVar) ? 4 : 2) | (e18Var.h(layoutParams) ? 32 : 16) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.g(z) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.f(z7jVar) ? 131072 : 65536) | (e18Var.h(bz7Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var.h(bz7Var2) ? 8388608 : 4194304) | (e18Var.h(lfaVar) ? 67108864 : 33554432) | (e18Var.h(bz7Var3) ? 536870912 : 268435456);
        int i4 = 0;
        if (e18Var.Q(i3 & 1, (i3 & 306783379) != 306783378)) {
            e18Var.V();
            if ((i & 1) != 0 && !e18Var.A()) {
                e18Var.T();
            }
            e18Var.q();
            WebView webView = (WebView) m8jVar.e.getValue();
            boolean z3 = z && ((Boolean) z7jVar.b.getValue()).booleanValue();
            boolean zH = e18Var.h(webView);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zH || objN == lz1Var) {
                objN = new d7(i4, webView);
                e18Var.k0(objN);
            }
            nai.a(0, 0, e18Var, (zy7) objN, z3);
            if (webView == null) {
                e18Var.a0(531958498);
                e18Var.p(false);
                z2 = false;
            } else {
                e18Var.a0(531958499);
                boolean zH2 = ((((458752 & i3) ^ 196608) > 131072 && e18Var.f(z7jVar)) || (i3 & 196608) == 131072) | e18Var.h(webView);
                Object objN2 = e18Var.N();
                tp4 tp4Var = null;
                if (zH2 || objN2 == lz1Var) {
                    objN2 = new h7(z7jVar, webView, tp4Var, 0);
                    e18Var.k0(objN2);
                }
                fd9.j(webView, z7jVar, (pz7) objN2, e18Var);
                boolean zH3 = ((i3 & 14) == 4) | e18Var.h(webView);
                Object objN3 = e18Var.N();
                if (zH3 || objN3 == lz1Var) {
                    objN3 = new m0(m8jVar, webView, tp4Var, 2);
                    e18Var.k0(objN3);
                }
                fd9.j(webView, m8jVar, (pz7) objN3, e18Var);
                z2 = false;
                e18Var.p(false);
            }
            lfaVar.getClass();
            lfaVar.a = m8jVar;
            z7jVar.getClass();
            lfaVar.b = z7jVar;
            boolean zH4 = ((1879048192 & i3) == 536870912 ? true : z2) | ((i3 & 896) == 256 ? true : z2) | ((3670016 & i3) == 1048576 ? true : z2) | e18Var.h(lfaVar) | ((i3 & 14) == 4 ? true : z2) | e18Var.h(layoutParams);
            Object objN4 = e18Var.N();
            if (zH4 || objN4 == lz1Var) {
                r11 = z2;
                i2 = i3;
                e7Var = new e7(bz7Var3, zy7Var, bz7Var, lfaVar, m8jVar, layoutParams);
                e18Var.k0(e7Var);
            } else {
                i2 = i3;
                e7Var = objN4;
                r11 = z2;
            }
            bz7 bz7Var4 = (bz7) e7Var;
            ?? r18 = (29360128 & i2) != 8388608 ? r11 : 1;
            Object objN5 = e18Var.N();
            if (r18 != 0 || objN5 == lz1Var) {
                objN5 = new f7(r11, bz7Var2);
                e18Var.k0(objN5);
            }
            uj5.b(bz7Var4, fqb.E, null, (bz7) objN5, null, e18Var, 48, 20);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new g7(m8jVar, layoutParams, zy7Var, z, z7jVar, bz7Var, bz7Var2, lfaVar, bz7Var3, i);
        }
    }

    public static final void c(bna bnaVar, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(382909894);
        e18Var.b0(185152185);
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (objN == lz1Var) {
            objN = new pna();
            e18Var.k0(objN);
        }
        pna pnaVar = (pna) objN;
        e18Var.p(false);
        e18Var.b0(185152232);
        Object objN2 = e18Var.N();
        if (objN2 == lz1Var) {
            objN2 = new Matrix();
            e18Var.k0(objN2);
        }
        Matrix matrix = (Matrix) objN2;
        e18Var.p(false);
        e18Var.b0(185152312);
        boolean zF = e18Var.f(bnaVar);
        Object objN3 = e18Var.N();
        if (zF || objN3 == lz1Var) {
            objN3 = mpk.P(null);
            e18Var.k0(objN3);
        }
        nwb nwbVar = (nwb) objN3;
        e18Var.p(false);
        e18Var.b0(185152364);
        if (bnaVar == null || bnaVar.b() == MTTypesetterKt.kLineSkipLimitMultiplier) {
            dw1.a(iqbVar, e18Var, 0);
            e18Var.p(false);
            r7e r7eVarS = e18Var.s();
            if (r7eVarS != null) {
                r7eVarS.d = new vma(bnaVar, zy7Var, iqbVar, i, 0);
                return;
            }
            return;
        }
        e18Var.p(false);
        Rect rect = bnaVar.k;
        Context context = (Context) e18Var.j(w00.b);
        int iWidth = rect.width();
        int iHeight = rect.height();
        iqbVar.getClass();
        v40.a(0, e18Var, new wma(rect, matrix, pnaVar, bnaVar, context, zy7Var, nwbVar), iqbVar.B(new xma(iWidth, iHeight)));
        r7e r7eVarS2 = e18Var.s();
        if (r7eVarS2 != null) {
            r7eVarS2.d = new vma(bnaVar, zy7Var, iqbVar, i, 1);
        }
    }

    public static final void d(zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1646555525);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            e((View) e18Var.j(w00.f), (cz5) e18Var.j(ve4.h), zy7Var, e18Var, (i2 << 6) & 896);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new np1(i, 5, zy7Var);
        }
    }

    public static final void e(View view, cz5 cz5Var, zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1319522472);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(view) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(cz5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(zy7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            boolean zH = e18Var.h(view) | ((i2 & 896) == 256);
            Object objN = e18Var.N();
            if (zH || objN == jd4.a) {
                objN = new f25(view, 12, zy7Var);
                e18Var.k0(objN);
            }
            fd9.e(view, cz5Var, (bz7) objN, e18Var);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v76(view, i, cz5Var, zy7Var, 1);
        }
    }

    public static final ExtractedText f(cjh cjhVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = cjhVar.a.F;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = cjhVar.b;
        extractedText.selectionStart = kkh.g(j);
        extractedText.selectionEnd = kkh.f(j);
        extractedText.flags = !bsg.v0(cjhVar.a.F, '\n') ? 1 : 0;
        return extractedText;
    }

    public static jbh g(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("id").m();
            strM.getClass();
            return new jbh(strM);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Action", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Action", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Action", e3);
            return null;
        }
    }

    public static boolean h(e92 e92Var) {
        e92Var.getClass();
        if (!a02.d.contains(e92Var.getName())) {
            return false;
        }
        if (w44.G0(a02.c, o06.c(e92Var)) && e92Var.I().isEmpty()) {
            return true;
        }
        if (!or9.y(e92Var)) {
            return false;
        }
        Collection collectionI = e92Var.i();
        collectionI.getClass();
        Collection<e92> collection = collectionI;
        if (collection.isEmpty()) {
            return false;
        }
        for (e92 e92Var2 : collection) {
            e92Var2.getClass();
            if (h(e92Var2)) {
                return true;
            }
        }
        return false;
    }
}
