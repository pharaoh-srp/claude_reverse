package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rl5 {
    public static final qnc a = gb9.d(24.0f, 10.0f, 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 8);
    public static final float b = 16.0f;

    public static final void a(Long l, bz7 bz7Var, o72 o72Var, b79 b79Var, am5 am5Var, xl5 xl5Var, wl5 wl5Var, bt7 bt7Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-432341251);
        int i2 = i | (e18Var.f(l) ? 4 : 2) | (e18Var.h(bz7Var) ? 32 : 16) | (e18Var.h(o72Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(b79Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.f(am5Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.f(xl5Var) ? 131072 : 65536) | (e18Var.f(wl5Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var.f(bt7Var) ? 8388608 : 4194304);
        if (e18Var.Q(i2 & 1, (4793491 & i2) != 4793490)) {
            boolean zF = e18Var.f(o72Var.a);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                Locale locale = o72Var.a;
                String localizedDateTimePattern = DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, null, Chronology.ofLocale(locale), locale);
                Pattern patternCompile = Pattern.compile("[^dMy/\\-.]");
                patternCompile.getClass();
                localizedDateTimePattern.getClass();
                String strReplaceAll = patternCompile.matcher(localizedDateTimePattern).replaceAll("");
                strReplaceAll.getClass();
                Pattern patternCompile2 = Pattern.compile("d{1,2}");
                patternCompile2.getClass();
                String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll("dd");
                strReplaceAll2.getClass();
                Pattern patternCompile3 = Pattern.compile("M{1,2}");
                patternCompile3.getClass();
                String strReplaceAll3 = patternCompile3.matcher(strReplaceAll2).replaceAll("MM");
                strReplaceAll3.getClass();
                Pattern patternCompile4 = Pattern.compile("y{1,4}");
                patternCompile4.getClass();
                String strReplaceAll4 = patternCompile4.matcher(strReplaceAll3).replaceAll("yyyy");
                strReplaceAll4.getClass();
                String strT0 = bsg.T0(isg.n0(strReplaceAll4, "My", "M/y", false), ".");
                Pattern patternCompile5 = Pattern.compile("[/\\-.]");
                patternCompile5.getClass();
                Matcher matcher = patternCompile5.matcher(strT0);
                matcher.getClass();
                ova ovaVarL = dgj.l(matcher, 0, strT0);
                ovaVarL.getClass();
                hva hvaVarA = ovaVarL.c.a(0);
                hvaVarA.getClass();
                objN = new nl5(strT0, hvaVarA.a.charAt(0));
                e18Var.k0(objN);
            }
            nl5 nl5Var = (nl5) objN;
            String strE = dch.E(R.string.m3c_date_input_invalid_for_pattern, e18Var);
            String strE2 = dch.E(R.string.m3c_date_input_invalid_year_range, e18Var);
            String strE3 = dch.E(R.string.m3c_date_input_invalid_not_allowed, e18Var);
            boolean zF2 = e18Var.f(nl5Var) | ((57344 & i2) == 16384);
            Object objN2 = e18Var.N();
            if (zF2 || objN2 == lz1Var) {
                sl5 sl5Var = new sl5(b79Var, xl5Var, nl5Var, am5Var, strE, strE2, strE3);
                e18Var.k0(sl5Var);
                objN2 = sl5Var;
            }
            sl5 sl5Var2 = (sl5) objN2;
            String upperCase = nl5Var.a.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            String strE4 = dch.E(R.string.m3c_date_input_label, e18Var);
            iqb iqbVarI = gb9.I(b.c(fqb.E, 1.0f), a);
            sl5Var2.getClass();
            int i3 = i2 << 3;
            b(iqbVarI, l, bz7Var, o72Var, fd9.q0(-752164549, new ny3(strE4, upperCase, 2), e18Var), fd9.q0(-1179434278, new rq(upperCase, 25), e18Var), sl5Var2, nl5Var, o72Var.a, wl5Var, bt7Var, e18Var, (i3 & 7168) | (i3 & 112) | 1794054 | (i3 & 896), (i2 >> 18) & 126);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mq0(l, bz7Var, o72Var, b79Var, am5Var, xl5Var, wl5Var, bt7Var, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r21v12 */
    /* JADX WARN: Type inference failed for: r21v13 */
    /* JADX WARN: Type inference failed for: r21v14 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v16 */
    public static final void b(iqb iqbVar, Long l, bz7 bz7Var, o72 o72Var, ta4 ta4Var, ta4 ta4Var2, sl5 sl5Var, nl5 nl5Var, Locale locale, wl5 wl5Var, bt7 bt7Var, ld4 ld4Var, int i, int i2) {
        int i3;
        int i4;
        e18 e18Var;
        wl5 wl5Var2;
        bt7 bt7Var2;
        int i5;
        int i6;
        int i7;
        int i8;
        nwb nwbVar;
        ?? r12;
        ?? r20;
        nl5 nl5Var2;
        nwb nwbVar2;
        bt7 bt7Var3;
        Long l2 = l;
        o72 o72Var2 = o72Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1456309913);
        if ((i & 6) == 0) {
            i3 = (e18Var2.f(iqbVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= e18Var2.f(l2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= e18Var2.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i3 |= e18Var2.h(o72Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i3 |= e18Var2.h(ta4Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((i & 196608) == 0) {
            i3 |= e18Var2.h(ta4Var2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= e18Var2.d(0) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= e18Var2.f(sl5Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= e18Var2.f(nl5Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= e18Var2.f(locale) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (e18Var2.f(wl5Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= e18Var2.f(bt7Var) ? 32 : 16;
        }
        int i9 = i4;
        if (e18Var2.Q(i3 & 1, ((306783379 & i3) == 306783378 && (i9 & 19) == 18) ? false : true)) {
            Object[] objArr = new Object[0];
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new h85(11);
                e18Var2.k0(objN);
            }
            nwb nwbVarH = iuj.H(objArr, cjh.d, (zy7) objN, e18Var2);
            Object[] objArr2 = {(cjh) nwbVarH.getValue()};
            int i10 = i3 & 29360128;
            int i11 = i3 & 234881024;
            boolean zF = e18Var2.f(nwbVarH) | (i10 == 8388608) | e18Var2.h(o72Var2) | (i11 == 67108864);
            int i12 = i3 & 1879048192;
            boolean z = zF | (i12 == 536870912);
            int i13 = i3 & 3670016;
            boolean z2 = z | (i13 == 1048576);
            Object objN2 = e18Var2.N();
            if (z2 || objN2 == lz1Var) {
                i5 = i13;
                i6 = i10;
                i7 = i12;
                i8 = 8388608;
                objN2 = new dn((Object) sl5Var, (Object) o72Var2, (Object) nl5Var, (Object) locale, nwbVarH, 7);
                o72Var2 = o72Var2;
                nwbVar = nwbVarH;
                e18Var2.k0(objN2);
            } else {
                nwbVar = nwbVarH;
                i5 = i13;
                i6 = i10;
                i7 = i12;
                i8 = 8388608;
            }
            nwb nwbVar3 = (nwb) iuj.I(objArr2, (zy7) objN2, e18Var2, 0);
            boolean zI0 = bsg.I0((CharSequence) nwbVar3.getValue());
            float f = b;
            if (!zI0) {
                if (((16.0f >= MTTypesetterKt.kLineSkipLimitMultiplier) & (16.0f >= MTTypesetterKt.kLineSkipLimitMultiplier) & (4.0f >= MTTypesetterKt.kLineSkipLimitMultiplier) & (MTTypesetterKt.kLineSkipLimitMultiplier >= MTTypesetterKt.kLineSkipLimitMultiplier)) == false) {
                    z29.a("Padding must be non-negative");
                }
                f -= MTTypesetterKt.kLineSkipLimitMultiplier + 4.0f;
            }
            float f2 = f;
            cjh cjhVar = (cjh) nwbVar.getValue();
            boolean zF2 = (i11 == 67108864) | e18Var2.f(nwbVar) | e18Var2.f(nwbVar3) | ((i3 & 896) == 256) | e18Var2.h(o72Var2) | (i7 == 536870912) | (i6 == i8) | (i5 == 1048576);
            Object objN3 = e18Var2.N();
            if (zF2 || objN3 == lz1Var) {
                nwb nwbVar4 = nwbVar;
                r12 = 0;
                r20 = 0;
                o72 o72Var3 = o72Var2;
                dz3 dz3Var = new dz3(nl5Var, nwbVar3, bz7Var, o72Var3, locale, sl5Var, nwbVar4);
                nl5Var2 = nl5Var;
                o72Var2 = o72Var3;
                nwbVar2 = nwbVar3;
                nwbVar = nwbVar4;
                e18Var2.k0(dz3Var);
                objN3 = dz3Var;
            } else {
                r12 = 0;
                r20 = 0;
                nl5Var2 = nl5Var;
                nwbVar2 = nwbVar3;
            }
            bz7 bz7Var2 = (bz7) objN3;
            iqb iqbVarN = gb9.N(iqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, f2, 7);
            boolean zF3 = e18Var2.f(nwbVar2);
            Object objN4 = e18Var2.N();
            if (zF3 || objN4 == lz1Var) {
                objN4 = new ol5(r12, nwbVar2);
                e18Var2.k0(objN4);
            }
            iqb iqbVarB = tjf.b(iqbVarN, r12, (bz7) objN4);
            iqb iqbVarS = fqb.E;
            if (bt7Var != null) {
                bt7Var3 = bt7Var;
                iqbVarS = iv1.s(iqbVarS, bt7Var3);
            } else {
                bt7Var3 = bt7Var;
            }
            wl5Var2 = wl5Var;
            bt7Var2 = bt7Var3;
            kxk.c(cjhVar, bz7Var2, iqbVarB.B(iqbVarS), false, null, ta4Var, ta4Var2, null, fd9.q0(-357881838, new jj2(10, nwbVar2), e18Var2), !bsg.I0((CharSequence) nwbVar2.getValue()), new on5(nl5Var2), new mp9(r12, 3, 7, 113), null, true, 0, 0, null, wl5Var2.y, e18Var2, (i3 << 6) & 33030144, 12779904, 0, 4001592);
            e18Var = e18Var2;
            ?? r15 = (i9 & 112) == 32 ? 1 : r12;
            Object objN5 = e18Var.N();
            if (r15 != 0 || objN5 == lz1Var) {
                objN5 = new ql5(bt7Var2, null, r12);
                e18Var.k0(objN5);
            }
            fd9.i(e18Var, (pz7) objN5, iei.a);
            ?? r0 = (e18Var.h(o72Var2) ? 1 : 0) | ((i3 & 112) == 32 ? 1 : r12) | (i11 == 67108864 ? 1 : r12) | (i7 == 536870912 ? 1 : r12) | (e18Var.f(nwbVar) ? 1 : 0);
            Object objN6 = e18Var.N();
            if (r0 != 0 || objN6 == lz1Var) {
                j43 j43Var = new j43(l, o72Var2, nl5Var, locale, nwbVar, null, 3);
                l2 = l;
                e18Var.k0(j43Var);
                objN6 = j43Var;
            } else {
                l2 = l;
            }
            fd9.i(e18Var, (pz7) objN6, l2);
        } else {
            e18Var = e18Var2;
            wl5Var2 = wl5Var;
            bt7Var2 = bt7Var;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new as1(iqbVar, l2, bz7Var, o72Var, ta4Var, ta4Var2, sl5Var, nl5Var, locale, wl5Var2, bt7Var2, i, i2);
        }
    }
}
