package defpackage;

import android.content.res.Resources;
import android.graphics.Typeface;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.datadog.android.rum.internal.domain.scope.RumRawEvent;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vwk {
    public static qb5 a;

    public static final void a(iy5 iy5Var, String str, zy7 zy7Var, zy7 zy7Var2, ld4 ld4Var, int i) {
        iy5Var.getClass();
        str.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1233886398);
        int i2 = i | (e18Var.f(iy5Var) ? 4 : 2) | (e18Var.f(str) ? 32 : 16) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 & 14;
            int i4 = i2 >> 3;
            rwk.d(iy5Var, zy7Var, zy7Var2, d4c.j0(R.string.project_delete_dialog_title, e18Var), d4c.j0(R.string.project_delete, e18Var), d4c.k0(R.string.project_delete_dialog_subtitle, new Object[]{str}, e18Var), 0, e18Var, i3 | (i4 & 112) | (i4 & 896), 64);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mm5(iy5Var, str, zy7Var, zy7Var2, i, 1);
        }
    }

    public static final float b(List list, Resources resources) {
        Iterator it = list.iterator();
        float dimension = MTTypesetterKt.kLineSkipLimitMultiplier;
        while (it.hasNext()) {
            dimension += resources.getDimension(((Number) it.next()).intValue()) / resources.getDisplayMetrics().density;
        }
        return dimension;
    }

    public static Typeface c(Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }

    public static final iqb d(iqb iqbVar, q28 q28Var, ukc ukcVar, pz7 pz7Var) {
        return iqbVar.B(new fd6(q28Var, pz7Var, ukcVar));
    }

    public static final boolean e(int i, int i2) {
        return i == i2;
    }

    public static wpf f(RumRawEvent rumRawEvent) {
        rumRawEvent.getClass();
        if (rumRawEvent instanceof RumRawEvent.AddError ? true : rumRawEvent instanceof RumRawEvent.StopResourceWithError) {
            return wpf.G;
        }
        if (rumRawEvent instanceof RumRawEvent.StartAction) {
            return wpf.E;
        }
        if (rumRawEvent instanceof RumRawEvent.StartResource) {
            return wpf.F;
        }
        if (rumRawEvent instanceof RumRawEvent.AddLongTask) {
            return wpf.H;
        }
        return null;
    }

    public static final iy5 g(String str, e18 e18Var) {
        str.getClass();
        m7f m7fVar = (m7f) e18Var.j(gr9.b);
        boolean zF = e18Var.f(str) | e18Var.h(m7fVar);
        Object objN = e18Var.N();
        if (zF || objN == jd4.a) {
            objN = new jy5(str, m7fVar, 0);
            e18Var.k0(objN);
        }
        kce kceVar = jce.a;
        String strB = oq5.B(kceVar.b(iy5.class));
        return (iy5) fd9.r0(kceVar.b(iy5.class), strB, (bz7) objN, e18Var);
    }
}
