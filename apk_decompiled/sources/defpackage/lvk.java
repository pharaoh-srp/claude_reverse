package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lvk {
    public static final ta4 a = new ta4(-337833740, false, new ic4(8));

    public static final void a(sec secVar, iqb iqbVar, ld4 ld4Var, int i) {
        secVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-500283809);
        int i2 = (e18Var.d(secVar.ordinal()) ? 4 : 2) | i | 48;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            cxe cxeVarA = axe.a(ko0.a, lja.Q, e18Var, 48);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            fqb fqbVar = fqb.E;
            iqb iqbVarE = kxk.E(e18Var, fqbVar);
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
            xn5.N(rx8.a((he6) de6.d.getValue(), e18Var), null, sf5.N(fqbVar, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), null, null, MTTypesetterKt.kLineSkipLimitMultiplier, null, e18Var, 440, 120);
            xn5.N(rx8.a(secVar.E, e18Var), null, sf5.N(lnk.j(b.t(fqbVar, 100.0f), 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, -10.0f, 1), null, null, MTTypesetterKt.kLineSkipLimitMultiplier, null, e18Var, 440, 120);
            xn5.N(rx8.a((he6) de6.b.getValue(), e18Var), null, sf5.M(fqbVar, -16.0f, 4.0f), null, null, MTTypesetterKt.kLineSkipLimitMultiplier, null, e18Var, 440, 120);
            e18Var.p(true);
            iqbVar = fqbVar;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lpa(secVar, iqbVar, i, 14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:193:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(boolean r26, java.util.List r27, defpackage.iqb r28, defpackage.bz7 r29, defpackage.bz7 r30, defpackage.i4g r31, defpackage.jgf r32, defpackage.hgf r33, defpackage.pz7 r34, defpackage.ta4 r35, defpackage.ld4 r36, int r37, int r38) {
        /*
            Method dump skipped, instruction units count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lvk.b(boolean, java.util.List, iqb, bz7, bz7, i4g, jgf, hgf, pz7, ta4, ld4, int, int):void");
    }

    public static final void c(yih yihVar, String str, i4g i4gVar, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        iqb iqbVar2;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-2096502425);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(yihVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.f(i4gVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i3 = i2 | 3072;
        if (e18Var2.Q(i3 & 1, (i3 & 1171) != 1170)) {
            long j = gm3.a(e18Var2).u;
            long j2 = gm3.a(e18Var2).n;
            long j3 = gm3.a(e18Var2).M;
            long j4 = gm3.a(e18Var2).O;
            e18Var = e18Var2;
            long j5 = gm3.a(e18Var2).O;
            qnc qncVar = e84.g;
            vve vveVarB = xve.b(12.0f);
            mnc mncVar = i4gVar.a;
            fqb fqbVar = fqb.E;
            gwk.f(yihVar, b.e(b.c(gb9.N(gb9.I(fqbVar, mncVar), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, 7), 1.0f), 40.0f), null, true, str, null, j, j2, j3, j4, j5, qncVar, vveVarB, e18Var, (i3 & 14) | 3072 | ((i3 << 9) & 57344), 36);
            iqbVar2 = fqbVar;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bg6(yihVar, str, i4gVar, iqbVar2, i, 22);
        }
    }

    public static String d(Context context) {
        PackageManager packageManager = context.getPackageManager();
        ArrayList<String> arrayList = new ArrayList();
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
        if (resolveInfoResolveActivity != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            arrayList = arrayList2;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent.setPackage(str2);
            if (packageManager.resolveService(intent, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    public static final boolean e(yr9 yr9Var) {
        xh3 xh3VarA = yr9Var.O().a();
        if (xh3VarA != null && g39.a(xh3VarA) && !o06.g((qqb) xh3VarA).equals(pkg.g)) {
            return true;
        }
        xh3 xh3VarA2 = yr9Var.O().a();
        qai qaiVar = xh3VarA2 instanceof qai ? (qai) xh3VarA2 : null;
        return qaiVar == null ? false : e(jwk.y(qaiVar));
    }

    public static final int f(int i, int i2) {
        return i > 0 ? i : (i2 * 2) / 4;
    }

    public static w8i g(w8i w8iVar, String[] strArr, Map map) {
        int i = 0;
        if (w8iVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (w8i) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                w8i w8iVar2 = new w8i();
                int length = strArr.length;
                while (i < length) {
                    w8iVar2.a((w8i) map.get(strArr[i]));
                    i++;
                }
                return w8iVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                w8iVar.a((w8i) map.get(strArr[0]));
                return w8iVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    w8iVar.a((w8i) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return w8iVar;
    }

    public static final Object h(t51 t51Var) {
        try {
            return t51Var.a();
        } catch (UnsupportedOperationException e) {
            return new hre(e);
        }
    }
}
