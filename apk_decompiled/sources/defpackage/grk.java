package defpackage;

import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.View;
import android.widget.TextView;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.analytics.events.MemoryEvents$MemoryStyleSelectedStyle;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class grk {
    public static final ta4 a = new ta4(-49277712, false, new tb4(20));

    /* JADX WARN: Removed duplicated region for block: B:101:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.String r20, defpackage.iqb r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, final android.webkit.WebViewClient r25, boolean r26, boolean r27, defpackage.ld4 r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.grk.a(java.lang.String, iqb, java.lang.String, java.lang.String, java.lang.String, android.webkit.WebViewClient, boolean, boolean, ld4, int, int):void");
    }

    public static final void b(boolean z, boolean z2, bz7 bz7Var, iqb iqbVar, ld4 ld4Var, int i) {
        bz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(79509255);
        int i2 = (e18Var.g(z) ? 4 : 2) | i | (e18Var.g(z2) ? 32 : 16) | (e18Var.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        int i3 = i2;
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = i3 >> 3;
            zsk.e(z2, fd9.q0(-106195249, new bc8(z2), e18Var), iqbVar, z, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, ysk.d(gm3.a(e18Var).o, gm3.a(e18Var).M, e18Var, 252), bz7Var, e18Var, (i4 & 896) | (i4 & 14) | 48 | ((i3 << 9) & 7168) | ((i3 << 15) & 29360128), 48);
            e18Var = e18Var;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new cy3(z, z2, bz7Var, iqbVar, i);
        }
    }

    public static final void c(iqb iqbVar, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(2064964257);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(ta4Var) ? 32 : 16;
        }
        int i3 = 0;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            d(iqbVar, ta4Var, e18Var, ((i2 << 3) & 896) | (i2 & 14) | 48);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new h60(iqbVar, ta4Var, i, i3);
        }
    }

    public static final void d(iqb iqbVar, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(771959668);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i3 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                lsc lscVar = new lsc(null, ql8.J);
                e18Var.k0(lscVar);
                objN = lscVar;
            }
            nwb nwbVar = (nwb) objN;
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new ve(9, nwbVar);
                e18Var.k0(objN2);
            }
            j8.c(keh.b.a(h((zy7) objN2, e18Var, 0)), fd9.q0(-291176396, new m6(iqbVar, nwbVar, ta4Var, 7), e18Var), e18Var, 56);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new h60(iqbVar, ta4Var, i, i3);
        }
    }

    public static fpe e(qh9 qh9Var) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((m7a) qh9Var.E.entrySet()).iterator();
            while (((o7a) it).hasNext()) {
                p7a p7aVarA = ((l7a) it).a();
                Object key = p7aVarA.getKey();
                key.getClass();
                String strM = ((bh9) p7aVarA.getValue()).m();
                strM.getClass();
                linkedHashMap.put(key, strM);
            }
            return new fpe(linkedHashMap);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type RequestHeaders", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type RequestHeaders", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type RequestHeaders", e3);
            return null;
        }
    }

    public static final MemoryEvents$MemoryStyleSelectedStyle f(hcb hcbVar) {
        hcbVar.getClass();
        int iOrdinal = hcbVar.ordinal();
        if (iOrdinal == 0) {
            return MemoryEvents$MemoryStyleSelectedStyle.MEMORY_FILES;
        }
        if (iOrdinal == 1) {
            return MemoryEvents$MemoryStyleSelectedStyle.CLASSIC;
        }
        if (iOrdinal == 2) {
            return MemoryEvents$MemoryStyleSelectedStyle.OFF;
        }
        wg6.i();
        return null;
    }

    public static xad g(ji0 ji0Var) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new xad(ke0.k(ji0Var));
        }
        TextPaint textPaint = new TextPaint(ji0Var.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = ji0Var.getBreakStrategy();
        int hyphenationFrequency = ji0Var.getHyphenationFrequency();
        if (ji0Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i < 28 || (ji0Var.getInputType() & 15) != 3) {
            boolean z = ji0Var.getLayoutDirection() == 1;
            switch (ji0Var.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(ke0.d(DecimalFormatSymbols.getInstance(ji0Var.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new xad(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static final g60 h(zy7 zy7Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        View view = (View) e18Var.j(w00.f);
        boolean zF = e18Var.f(view);
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (zF || objN == lz1Var) {
            objN = new g60(view, null, zy7Var);
            e18Var.k0(objN);
        }
        g60 g60Var = (g60) objN;
        boolean zH = e18Var.h(g60Var);
        Object objN2 = e18Var.N();
        if (zH || objN2 == lz1Var) {
            objN2 = new z50(g60Var, 3);
            e18Var.k0(objN2);
        }
        fd9.d(g60Var, (bz7) objN2, e18Var);
        return g60Var;
    }

    public static void i(TextView textView, int i) {
        if (i < 0) {
            mr9.y();
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            ke0.n(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void j(TextView textView, int i) {
        if (i < 0) {
            mr9.y();
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void k(TextView textView, int i) {
        if (i < 0) {
            mr9.y();
            return;
        }
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static ActionMode.Callback l(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof elh) || callback == null) ? callback : new elh(callback, textView);
    }

    public static hf0 m() {
        m94 m94Var = new m94(true, -1, -1, 0);
        Parcelable.Creator<hf0> creator = hf0.CREATOR;
        hf0 hf0Var = new hf0(m94Var, false);
        hf0Var.G = false;
        return hf0Var;
    }
}
