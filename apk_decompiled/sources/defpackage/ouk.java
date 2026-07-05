package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.analytics.events.OfflineEvents$CacheAgeBucket;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Locale;
import okio.FileSystem;
import okio.Path;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ouk {
    public static final ta4 a = new ta4(-521763382, false, new wb4(27));

    public static final void a(ux0 ux0Var, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, zy7 zy7Var4, zy7 zy7Var5, zy7 zy7Var6, ld4 ld4Var, int i) {
        int i2;
        zy7 zy7Var7;
        zy7 zy7Var8;
        zy7 zy7Var9;
        zy7Var.getClass();
        zy7Var2.getClass();
        zy7Var3.getClass();
        zy7Var4.getClass();
        zy7Var5.getClass();
        zy7Var6.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1948304314);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(ux0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            zy7Var7 = zy7Var;
            i2 |= e18Var.h(zy7Var7) ? 32 : 16;
        } else {
            zy7Var7 = zy7Var;
        }
        if ((i & 384) == 0) {
            zy7Var8 = zy7Var2;
            i2 |= e18Var.h(zy7Var8) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            zy7Var8 = zy7Var2;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(zy7Var3) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.h(zy7Var4) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.h(zy7Var5) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            zy7Var9 = zy7Var6;
            i2 |= e18Var.h(zy7Var9) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        } else {
            zy7Var9 = zy7Var6;
        }
        int i3 = 12582912 & i;
        fqb fqbVar = fqb.E;
        if (i3 == 0) {
            i2 |= e18Var.f(fqbVar) ? 8388608 : 4194304;
        }
        int i4 = i2;
        if (e18Var.Q(i4 & 1, (4793491 & i4) != 4793490)) {
            wd6.M(ux0Var.a, fqbVar, gp6.e(null, 3), gp6.f(null, 3), null, fd9.q0(-691138590, new fw(zy7Var4, ux0Var, zy7Var5, zy7Var9, zy7Var7, zy7Var8, zy7Var3), e18Var), e18Var, ((i4 >> 18) & 112) | 200064, 16);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new yu(ux0Var, zy7Var, zy7Var2, zy7Var3, zy7Var4, zy7Var5, zy7Var6, i);
        }
    }

    public static final void b(bpc bpcVar, String str, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i, int i2) {
        iqb iqbVar2;
        int i3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1042118237);
        int i4 = i | (e18Var.h(bpcVar) ? 4 : 2) | (e18Var.f(str) ? 32 : 16) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | 3072;
            iqbVar2 = iqbVar;
        } else {
            iqbVar2 = iqbVar;
            i3 = i4 | (e18Var.f(iqbVar2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        }
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            int i6 = i3 >> 6;
            iqbVar2 = i5 != 0 ? fqb.E : iqbVar2;
            ez1.e(zy7Var, iqbVar2, false, vz8.G(0L, gm3.a(e18Var).O, 0L, e18Var, 13), null, fd9.q0(-1054891269, new kn(bpcVar, 8, str), e18Var), e18Var, (i6 & 14) | 1572864 | (i6 & 112), 52);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xd(bpcVar, str, zy7Var, iqbVar2, i, i2);
        }
    }

    public static qi7 c(Path path, FileSystem fileSystem, String str, i4e i4eVar, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            i4eVar = null;
        }
        return new qi7(path, fileSystem, str, i4eVar);
    }

    public static final void d(int i, ld4 ld4Var, iqb iqbVar, String str, String str2) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1377673729);
        int i2 = i | (e18Var2.f(str) ? 4 : 2) | (e18Var2.f(str2) ? 32 : 16) | (e18Var2.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var2.Q(i2 & 1, (i2 & 147) != 146)) {
            iqb iqbVarL = gb9.L(iqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, 1);
            Object objN = e18Var2.N();
            if (objN == jd4.a) {
                objN = new x2h(29);
                e18Var2.k0(objN);
            }
            iqb iqbVarB = tjf.b(iqbVarL, true, (bz7) objN);
            cxe cxeVarA = axe.a(ko0.a, lja.P, e18Var2, 0);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarB);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, cd4.f, cxeVarA);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            tkh tkhVar = ((jm3) gm3.c(e18Var2).e.E).h;
            if (1.0f <= 0.0d) {
                z29.a("invalid weight; must be greater than zero");
            }
            tjh.b(str, new hw9(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var2, i2 & 14, 0, 131068);
            e18Var = e18Var2;
            kxk.g(e18Var, b.t(fqb.E, 16.0f));
            tkh tkhVar2 = ((jm3) gm3.c(e18Var).e.E).g;
            long j = gm3.a(e18Var).O;
            if (1.8f <= 0.0d) {
                z29.a("invalid weight; must be greater than zero");
            }
            float f = 1.8f;
            if (1.8f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
            }
            tjh.b(str2, new hw9(f, true), j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar2, e18Var, (i2 >> 3) & 14, 0, 131064);
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fl3(str, str2, iqbVar, i, 3);
        }
    }

    public static final OfflineEvents$CacheAgeBucket e(long j) {
        return j < 60000 ? OfflineEvents$CacheAgeBucket.UNDER_1M : j < 3600000 ? OfflineEvents$CacheAgeBucket.UNDER_1H : j < 86400000 ? OfflineEvents$CacheAgeBucket.UNDER_1D : j < 604800000 ? OfflineEvents$CacheAgeBucket.UNDER_1W : OfflineEvents$CacheAgeBucket.OVER_1W;
    }

    public static void f(Context context, Throwable th) {
        try {
            dgj.v(context);
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
        }
    }

    public static String g(String str) {
        return str != null ? str.toLowerCase(Locale.ROOT) : "";
    }

    public static String h(String str) {
        return g(str).trim();
    }
}
