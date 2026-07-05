package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class uj5 {
    public static final void a(bz7 bz7Var, iqb iqbVar, bz7 bz7Var2, ld4 ld4Var, int i, int i2) {
        int i3;
        bz7 bz7Var3;
        ex exVar = ex.R;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1783766393);
        if ((i & 6) == 0) {
            i3 = (e18Var.h(bz7Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= e18Var.h(bz7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            bz7 bz7Var4 = i4 != 0 ? exVar : bz7Var2;
            b(bz7Var, iqbVar, null, exVar, bz7Var4, e18Var, (i3 & 14) | 3072 | (i3 & 112) | ((i3 << 6) & 57344), 4);
            bz7Var3 = bz7Var4;
        } else {
            e18Var.T();
            bz7Var3 = bz7Var2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new q10(bz7Var, iqbVar, bz7Var3, i, i2, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.bz7 r17, defpackage.iqb r18, defpackage.bz7 r19, defpackage.bz7 r20, defpackage.bz7 r21, defpackage.ld4 r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj5.b(bz7, iqb, bz7, bz7, bz7, ld4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(boolean r27, boolean r28, defpackage.zy7 r29, java.util.List r30, defpackage.dwg r31, defpackage.bz7 r32, java.util.List r33, defpackage.iqb r34, defpackage.j9f r35, defpackage.ld4 r36, int r37, int r38) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj5.c(boolean, boolean, zy7, java.util.List, dwg, bz7, java.util.List, iqb, j9f, ld4, int, int):void");
    }

    public static final nxi d(av9 av9Var) {
        nxi nxiVar = av9Var.T;
        if (nxiVar != null) {
            return nxiVar;
        }
        throw sq6.z("Required value was null.");
    }

    public static iqb e(iqb iqbVar, float f) {
        if (va6.a(f, MTTypesetterKt.kLineSkipLimitMultiplier) > 0) {
            va6.a(f, MTTypesetterKt.kLineSkipLimitMultiplier);
        }
        return xn5.i0(iqbVar, new dt1(f, f, 0, true));
    }

    public static final void f(pl9 pl9Var, Object obj) {
        pl9Var.getClass();
        if (pl9Var.n(obj)) {
            obj.getClass();
            return;
        }
        throw new ClassCastException("Value cannot be cast to " + pl9Var.d());
    }

    public static final zy7 g(bz7 bz7Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        int iHashCode = Long.hashCode(e18Var.T);
        Context context = (Context) e18Var.j(w00.b);
        c18 c18VarF = iuj.F(e18Var);
        c5f c5fVar = (c5f) e18Var.j(e5f.a);
        View view = (View) e18Var.j(w00.f);
        boolean zH = ((((i & 14) ^ 6) > 4 && e18Var.f(bz7Var)) || (i & 6) == 4) | e18Var.h(context) | e18Var.h(c18VarF) | e18Var.h(c5fVar) | e18Var.d(iHashCode) | e18Var.h(view);
        Object objN = e18Var.N();
        if (zH || objN == jd4.a) {
            r70 r70Var = new r70(context, bz7Var, c18VarF, c5fVar, iHashCode, view);
            e18Var.k0(r70Var);
            objN = r70Var;
        }
        return (zy7) objN;
    }

    public static boolean h(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static axf i(Set set, hbd hbdVar) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof axf)) {
                return new bxf(set2, hbdVar);
            }
            axf axfVar = (axf) set2;
            hbd hbdVar2 = axfVar.F;
            hbdVar2.getClass();
            return new bxf((SortedSet) axfVar.E, new ibd(Arrays.asList(hbdVar2, hbdVar)));
        }
        if (!(set instanceof axf)) {
            set.getClass();
            return new axf(set, hbdVar);
        }
        axf axfVar2 = (axf) set;
        hbd hbdVar3 = axfVar2.F;
        hbdVar3.getClass();
        return new axf(axfVar2.E, new ibd(Arrays.asList(hbdVar3, hbdVar)));
    }

    public static btc j() {
        return btc.d;
    }

    public static int k(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static zwf l(Set set, qz8 qz8Var) {
        fd9.I("set1", set);
        fd9.I("set2", qz8Var);
        return new zwf(set, qz8Var);
    }

    public static boolean m(int i) {
        if (i == 8 || i == 7) {
            return true;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 31 || !(i == 26 || i == 27)) {
            return i2 >= 33 && i == 30;
        }
        return true;
    }

    public static final void n(kt6 kt6Var) {
        kt6Var.getClass();
        vs6 vs6Var = kt6Var.w;
        String strE = aph.e(vs6Var.b);
        strE.getClass();
        vs6Var.b = strE;
        String str = vs6Var.d;
        vs6Var.d = str != null ? aph.e(str) : null;
        List<hs6> list = vs6Var.e;
        if (list != null) {
            for (hs6 hs6Var : list) {
                String strE2 = aph.e(hs6Var.a);
                strE2.getClass();
                hs6Var.a = strE2;
                String str2 = hs6Var.c;
                hs6Var.c = str2 != null ? aph.e(str2) : null;
            }
        }
        List list2 = vs6Var.n;
        ArrayList arrayList = list2 instanceof ArrayList ? (ArrayList) list2 : null;
        if (arrayList != null) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Object obj = arrayList.get(i);
                    obj.getClass();
                    ht6 ht6Var = (ht6) obj;
                    String strE3 = aph.e(ht6Var.c);
                    String str3 = ht6Var.a;
                    boolean z = ht6Var.b;
                    String str4 = ht6Var.d;
                    strE3.getClass();
                    arrayList.set(i, new ht6(str3, z, strE3, str4));
                }
            } catch (UnsupportedOperationException unused) {
            }
        }
    }

    public static final void o(ld4 ld4Var, iqb iqbVar, int i, cz5 cz5Var, m4a m4aVar, u5f u5fVar, fu9 fu9Var, hyc hycVar) {
        dd4.e.getClass();
        d4c.i0(ld4Var, cd4.e, hycVar);
        d4c.i0(ld4Var, c0.N, iqbVar);
        d4c.i0(ld4Var, c0.O, cz5Var);
        d4c.i0(ld4Var, c0.P, m4aVar);
        d4c.i0(ld4Var, c0.Q, u5fVar);
        d4c.i0(ld4Var, c0.R, fu9Var);
        d4c.i0(ld4Var, cd4.g, Integer.valueOf(i));
    }
}
