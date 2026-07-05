package defpackage;

import android.view.View;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class od9 {
    public static final long a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final /* synthetic */ int f = 0;

    static {
        lz1 lz1Var = uh6.F;
        zh6 zh6Var = zh6.MILLISECONDS;
        a = v40.Q(1000, zh6Var);
        b = uh6.g(v40.Q(16, zh6Var));
        c = uh6.g(v40.Q(25, zh6Var));
        d = uh6.g(v40.Q(700, zh6Var));
        e = uh6.g(v40.Q(1, zh6Var));
    }

    public static final void a(ad9 ad9Var, boolean z, Object obj, md9 md9Var, ld4 ld4Var, int i, int i2) {
        int i3;
        Object obj2;
        int i4;
        md9 md9Var2;
        md9 md9Var3;
        int i5;
        Object iw2Var;
        md9 md9Var4;
        ad9Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1179602310);
        if ((i & 6) == 0) {
            i3 = i | (e18Var.f(ad9Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= e18Var.g(z) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i4 = i3 | 384;
            obj2 = obj;
        } else {
            obj2 = obj;
            i4 = i3 | (e18Var.h(obj2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        }
        int i7 = i4 | FreeTypeConstants.FT_LOAD_NO_RECURSE;
        if (e18Var.Q(i7 & 1, (i7 & 1171) != 1170)) {
            e18Var.V();
            int i8 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i8 == 0 || e18Var.A()) {
                if (i6 != 0) {
                    obj2 = null;
                }
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(md9.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                md9Var3 = (md9) objN;
                i5 = i7 & (-7169);
            } else {
                e18Var.T();
                i5 = i7 & (-7169);
                md9Var3 = md9Var;
            }
            e18Var.q();
            View view = (View) e18Var.j(w00.f);
            boolean zF2 = e18Var.f(view);
            Object objN2 = e18Var.N();
            if (zF2 || objN2 == lz1Var) {
                view.getClass();
                View rootView = view.getRootView();
                Object tag = rootView.getTag(R.id.metricsStateHolder);
                if (tag == null) {
                    tag = new fxc();
                    rootView.setTag(R.id.metricsStateHolder, tag);
                }
                objN2 = (fxc) tag;
                e18Var.k0(objN2);
            }
            fxc fxcVar = (fxc) objN2;
            Object[] objArr = {fxcVar, ad9Var, Boolean.valueOf(z), obj2};
            boolean zH = ((i5 & 112) == 32) | e18Var.h(md9Var3) | e18Var.h(fxcVar) | ((i5 & 14) == 4);
            Object objN3 = e18Var.N();
            if (zH || objN3 == lz1Var) {
                md9Var4 = md9Var3;
                iw2Var = new iw2(z, md9Var4, fxcVar, ad9Var, 2);
                e18Var.k0(iw2Var);
            } else {
                iw2Var = objN3;
                md9Var4 = md9Var3;
            }
            fd9.g(objArr, (bz7) iw2Var, e18Var);
            md9Var2 = md9Var4;
        } else {
            e18Var.T();
            md9Var2 = md9Var;
        }
        Object obj3 = obj2;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pw1(ad9Var, z, obj3, md9Var2, i, i2);
        }
    }

    public static final String b(ad9 ad9Var) {
        return d(ad9Var.a, ad9Var.b);
    }

    public static final String c(ad9 ad9Var) {
        String str = ad9Var.c;
        return str == null ? "jank.".concat(d(ad9Var.a, ad9Var.b)) : str;
    }

    public static final String d(String str, String str2) {
        return ij0.C(str, "=", str2);
    }
}
