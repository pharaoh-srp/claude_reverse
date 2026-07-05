package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xpk {
    public static final ta4 a = new ta4(-91331245, false, new ub4(16));

    public static woe a(qh9 qh9Var) {
        try {
            return new woe(qh9Var.s("line").k(), qh9Var.s("column").k());
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Location", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Location", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Location", e3);
            return null;
        }
    }

    public static final int b(boolean z, boolean z2) {
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    public static final int c(dv7 dv7Var, int i) {
        boolean z = dv7Var.compareTo(dv7.H) >= 0;
        boolean z2 = i == 1;
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    public static final float d(yjh yjhVar, int i) {
        if (i < 0) {
            return MTTypesetterKt.kLineSkipLimitMultiplier;
        }
        xjh xjhVar = yjhVar.a;
        qtb qtbVar = yjhVar.b;
        if (xjhVar.a.F.length() == 0) {
            return MTTypesetterKt.kLineSkipLimitMultiplier;
        }
        int iMin = Math.min(qtbVar.d(i), Math.min(qtbVar.b - 1, qtbVar.f - 1));
        if (i > qtbVar.c(iMin, false)) {
            return MTTypesetterKt.kLineSkipLimitMultiplier;
        }
        qtbVar.l(iMin);
        ArrayList arrayList = qtbVar.h;
        drc drcVar = (drc) arrayList.get(v40.r(iMin, arrayList));
        x30 x30Var = drcVar.a;
        int i2 = iMin - drcVar.d;
        wjh wjhVar = x30Var.d;
        return wjhVar.e(i2) - wjhVar.g(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(defpackage.ta4 r4, defpackage.vp4 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.k68
            if (r0 == 0) goto L13
            r0 = r5
            k68 r0 = (defpackage.k68) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.F = r1
            goto L18
        L13:
            k68 r0 = new k68
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.E
            int r1 = r0.F
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return
        L27:
            kotlin.KotlinNothingValueException r4 = defpackage.sq6.y(r5)
            throw r4
        L2c:
            defpackage.sf5.h0(r5)
            c45 r5 = r0.getContext()
            c0l r1 = defpackage.c0l.J
            a45 r5 = r5.x0(r1)
            ym0 r5 = (defpackage.ym0) r5
            if (r5 == 0) goto L43
            r0.F = r2
            r5.a(r4, r0)
            return
        L43:
            java.lang.String r4 = "provideContent requires a ContentReceiver and should only be called from GlanceAppWidget.provideGlance"
            defpackage.sz6.j(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xpk.e(ta4, vp4):void");
    }

    public static final uj4 f(ld4 ld4Var) {
        m7f m7fVarB = gr9.b(ld4Var);
        e18 e18Var = (e18) ld4Var;
        boolean zH = e18Var.h(m7fVarB);
        Object objN = e18Var.N();
        if (zH || objN == jd4.a) {
            objN = new di(m7fVarB, 9);
            e18Var.k0(objN);
        }
        kce kceVar = jce.a;
        String strB = oq5.B(kceVar.b(uj4.class));
        return (uj4) fd9.r0(kceVar.b(uj4.class), strB, (bz7) objN, e18Var);
    }

    public static boolean g(Comparator comparator, Collection collection) {
        Object objComparator;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            objComparator = ((SortedSet) collection).comparator();
            if (objComparator == null) {
                objComparator = w1k.F;
            }
        } else {
            if (!(collection instanceof r0k)) {
                return false;
            }
            objComparator = ((r0k) collection).J;
        }
        return comparator.equals(objComparator);
    }
}
