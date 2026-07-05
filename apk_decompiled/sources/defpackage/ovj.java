package defpackage;

import android.text.InputFilter;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ovj {
    public static final ta4 a = new ta4(-986832763, false, new ya4(0));
    public static final ta4 b = new ta4(-952008826, false, new ya4(1));
    public static final o54 c = o54.P;

    /* JADX WARN: Removed duplicated region for block: B:100:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.r4g r24, final java.lang.String r25, defpackage.iqb r26, defpackage.z3g r27, boolean r28, boolean r29, defpackage.z4g r30, defpackage.a5g r31, defpackage.pz7 r32, defpackage.sz7 r33, defpackage.ybg r34, defpackage.x0a r35, defpackage.mnc r36, final defpackage.pz7 r37, defpackage.ld4 r38, final int r39, final int r40, final int r41) {
        /*
            Method dump skipped, instruction units count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ovj.a(r4g, java.lang.String, iqb, z3g, boolean, boolean, z4g, a5g, pz7, sz7, ybg, x0a, mnc, pz7, ld4, int, int, int):void");
    }

    public static final int b(Map map) {
        int i;
        int i2 = 0;
        for (List list : map.values()) {
            if ((list instanceof Collection) && list.isEmpty()) {
                i = 0;
            } else {
                Iterator it = list.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (((k82) it.next()).d && (i = i + 1) < 0) {
                        x44.m0();
                        throw null;
                    }
                }
            }
            i2 += i;
        }
        return i2;
    }

    public static final void c(j0a j0aVar, o82 o82Var) {
        j0aVar.getClass();
        o82Var.getClass();
        lsc lscVar = o82Var.h;
        if (((Boolean) o82Var.i.getValue()).booleanValue()) {
            j0a.V(j0aVar, null, null, kwj.a, 3);
        } else {
            for (String str : w44.i1(w44.p1(w44.s1(dxf.p0(o82Var.P().keySet(), o82Var.O().keySet()))), new z31(3))) {
                List list = (List) o82Var.P().get(str);
                List list2 = lm6.E;
                if (list == null) {
                    list = list2;
                }
                List list3 = (List) o82Var.O().get(str);
                if (list3 != null) {
                    list2 = list3;
                }
                int i = 1;
                j0aVar.U(str, "account_header", new ta4(-1648343725, true, new pp(str, 5)));
                j0aVar.W(list.size(), new kp(new c32(14), 18, list), new kp(new c32(15), 19, list), new ta4(802480018, true, new m82(list, o82Var, 0)));
                if (!list2.isEmpty() && !((Boolean) lscVar.getValue()).booleanValue()) {
                    j0aVar.U(ij0.i("show_more_button_", str), "show_more_button", new ta4(676396504, true, new nn(6, o82Var)));
                }
                if (((Boolean) lscVar.getValue()).booleanValue()) {
                    j0aVar.W(list2.size(), new kp(new c32(16), 20, list2), new kp(new c32(17), 21, list2), new ta4(802480018, true, new m82(list2, o82Var, i)));
                }
            }
        }
        j0a.V(j0aVar, null, null, kwj.b, 3);
    }

    public static final q68 d(q68 q68Var) {
        return q68Var.d(new gaj(p46.a));
    }

    public static o54 e() {
        return c;
    }

    public static iqb g(iqb iqbVar, bz7 bz7Var) {
        return iqbVar.B(new id4(new h8d(bz7Var)));
    }

    public static final fti h(String str, ld4 ld4Var) {
        str.getClass();
        e18 e18Var = (e18) ld4Var;
        m7f m7fVar = (m7f) e18Var.j(gr9.b);
        boolean zF = e18Var.f(m7fVar);
        Object objN = e18Var.N();
        if (zF || objN == jd4.a) {
            kce kceVar = jce.a;
            fti ftiVar = new fti(str, (j2d) m7fVar.a(kceVar.b(j2d.class), null, null), (koi) m7fVar.a(kceVar.b(koi.class), null, null), (tl0) m7fVar.a(kceVar.b(tl0.class), null, null), (q7) m7fVar.a(kceVar.b(q7.class), null, null), (qi3) m7fVar.a(kceVar.b(qi3.class), null, null), (h86) m7fVar.a(kceVar.b(h86.class), null, null));
            e18Var.k0(ftiVar);
            objN = ftiVar;
        }
        return (fti) objN;
    }

    public abstract InputFilter[] f(InputFilter[] inputFilterArr);

    public abstract void i(boolean z);

    public abstract void j(boolean z);
}
