package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.tool.model.ChartDisplayV0Input;
import com.anthropic.claude.tool.model.ChartDisplayV0InputSeriesItem;
import com.anthropic.claude.tool.model.ChartDisplayV0InputSeriesItemPointsItem;
import com.anthropic.claude.tool.model.ChartDisplayV0InputStyle;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pj2 {
    public static final yl4 a = new yl4();
    public static final yl4 b = new yl4();
    public static final yl4 c = new yl4();
    public static final y5a d = new y5a(pk7.b, null, 126);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0582  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v2, types: [e18] */
    /* JADX WARN: Type inference failed for: r10v8, types: [e18, ld4] */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v60 */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v37, types: [int] */
    /* JADX WARN: Type inference failed for: r13v47 */
    /* JADX WARN: Type inference failed for: r13v48 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v55 */
    /* JADX WARN: Type inference failed for: r21v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r26v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v44, types: [d0g, java.lang.Object, m5a] */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r5v107 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v64 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v71 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v95 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.anthropic.claude.tool.model.ChartDisplayV0Input r55, defpackage.iqb r56, defpackage.ld4 r57, int r58) {
        /*
            Method dump skipped, instruction units count: 3464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pj2.a(com.anthropic.claude.tool.model.ChartDisplayV0Input, iqb, ld4, int):void");
    }

    public static final void b(ChartDisplayV0Input chartDisplayV0Input, iqb iqbVar, qi3 qi3Var, fk0 fk0Var, x89 x89Var, boolean z, ld4 ld4Var, int i) throws IOException {
        int i2;
        qi3 qi3Var2;
        fk0 fk0Var2;
        x89 x89Var2;
        boolean z2;
        e18 e18Var;
        int i3;
        x89 x89Var3;
        boolean zA;
        fk0 fk0Var3;
        qi3 qi3Var3;
        qi3 qi3Var4;
        boolean z3;
        e18 e18Var2;
        cz5 cz5Var;
        ja8 ja8Var;
        int i4;
        int i5;
        cz5 cz5Var2;
        Object obj;
        zy7 zy7Var;
        zy7 zy7Var2;
        cz5 cz5Var3;
        nwb nwbVar;
        lz1 lz1Var;
        nwb nwbVar2;
        nwb nwbVar3;
        boolean z4;
        e18 e18Var3;
        ChartDisplayV0Input chartDisplayV0Input2 = chartDisplayV0Input;
        e18 e18Var4 = (e18) ld4Var;
        e18Var4.c0(532725339);
        if ((i & 6) == 0) {
            i2 = (e18Var4.f(chartDisplayV0Input2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var4.f(iqbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 24576) == 0) {
            i2 |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= 65536;
        }
        if (e18Var4.Q(i2 & 1, (73875 & i2) != 73874)) {
            e18Var4.V();
            int i6 = i & 1;
            lz1 lz1Var2 = jd4.a;
            if (i6 == 0 || e18Var4.A()) {
                m7f m7fVarN = sq6.n(e18Var4, -1168520582, e18Var4, -1633490746);
                boolean zF = e18Var4.f(null) | e18Var4.f(m7fVarN);
                Object objN = e18Var4.N();
                if (zF || objN == lz1Var2) {
                    objN = m7fVarN.a(jce.a.b(qi3.class), null, null);
                    e18Var4.k0(objN);
                }
                e18Var4.p(false);
                e18Var4.p(false);
                qi3 qi3Var5 = (qi3) objN;
                m7f m7fVarN2 = sq6.n(e18Var4, -1168520582, e18Var4, -1633490746);
                boolean zF2 = e18Var4.f(null) | e18Var4.f(m7fVarN2);
                Object objN2 = e18Var4.N();
                if (zF2 || objN2 == lz1Var2) {
                    objN2 = m7fVarN2.a(jce.a.b(fk0.class), null, null);
                    e18Var4.k0(objN2);
                }
                e18Var4.p(false);
                e18Var4.p(false);
                fk0 fk0Var4 = (fk0) objN2;
                m7f m7fVarN3 = sq6.n(e18Var4, -1168520582, e18Var4, -1633490746);
                boolean zF3 = e18Var4.f(null) | e18Var4.f(m7fVarN3);
                Object objN3 = e18Var4.N();
                if (zF3 || objN3 == lz1Var2) {
                    objN3 = m7fVarN3.a(jce.a.b(x89.class), null, null);
                    e18Var4.k0(objN3);
                }
                e18Var4.p(false);
                e18Var4.p(false);
                x89 x89Var4 = (x89) objN3;
                i3 = i2 & (-524161);
                x89Var3 = x89Var4;
                zA = x89Var4.a();
                fk0Var3 = fk0Var4;
                qi3Var3 = qi3Var5;
            } else {
                e18Var4.T();
                i3 = i2 & (-524161);
                qi3Var3 = qi3Var;
                fk0Var3 = fk0Var;
                x89Var3 = x89Var;
                zA = z;
            }
            e18Var4.q();
            if (chartDisplayV0Input2 != null) {
                e18Var4.a0(516915678);
                Object objN4 = e18Var4.N();
                if (objN4 == lz1Var2) {
                    objN4 = mpk.P(Boolean.FALSE);
                    e18Var4.k0(objN4);
                }
                nwb nwbVar4 = (nwb) objN4;
                Object objN5 = e18Var4.N();
                if (objN5 == lz1Var2) {
                    objN5 = mpk.P(new fcc(0L));
                    e18Var4.k0(objN5);
                }
                nwb nwbVar5 = (nwb) objN5;
                Object objN6 = e18Var4.N();
                if (objN6 == lz1Var2) {
                    objN6 = mpk.P(Boolean.FALSE);
                    e18Var4.k0(objN6);
                }
                nwb nwbVar6 = (nwb) objN6;
                int i7 = na8.b;
                ga8 ga8Var = (ga8) e18Var4.j(ve4.g);
                Object objN7 = e18Var4.N();
                if (objN7 == lz1Var2) {
                    objN7 = new ha8(ga8Var);
                    e18Var4.k0(objN7);
                }
                ja8 ja8Var2 = ((ha8) objN7).F;
                Context context = (Context) e18Var4.j(w00.b);
                cz5 cz5Var4 = (cz5) e18Var4.j(ve4.h);
                Object objN8 = e18Var4.N();
                if (objN8 == lz1Var2) {
                    objN8 = fd9.O(im6.E, e18Var4);
                    e18Var4.k0(objN8);
                }
                l45 l45Var = (l45) objN8;
                boolean zH = e18Var4.h(l45Var) | e18Var4.h(ja8Var2) | e18Var4.h(context) | e18Var4.h(qi3Var3);
                Object objN9 = e18Var4.N();
                if (zH || objN9 == lz1Var2) {
                    objN9 = new he(l45Var, ja8Var2, context, qi3Var3, 5);
                    e18Var4.k0(objN9);
                }
                zy7 zy7Var3 = (zy7) objN9;
                int i8 = i3 & 14;
                boolean zH2 = e18Var4.h(l45Var) | e18Var4.h(ja8Var2) | e18Var4.h(context) | (i8 == 4) | e18Var4.h(qi3Var3);
                Object objN10 = e18Var4.N();
                if (zH2 || objN10 == lz1Var2) {
                    cz5Var = cz5Var4;
                    ja8Var = ja8Var2;
                    i4 = i8;
                    objN10 = new dn(l45Var, ja8Var, context, chartDisplayV0Input2, qi3Var3, 4);
                    chartDisplayV0Input2 = chartDisplayV0Input2;
                    e18Var4.k0(objN10);
                } else {
                    i4 = i8;
                    ja8Var = ja8Var2;
                    cz5Var = cz5Var4;
                }
                zy7 zy7Var4 = (zy7) objN10;
                int i9 = oj2.a[chartDisplayV0Input2.getStyle().ordinal()];
                if (i9 == 1) {
                    i5 = R.string.chart_a11y_type_line;
                } else if (i9 == 2) {
                    i5 = R.string.chart_a11y_type_bar;
                } else {
                    if (i9 != 3) {
                        wg6.i();
                        return;
                    }
                    i5 = R.string.chart_a11y_type_scatter;
                }
                String strJ0 = d4c.j0(i5, e18Var4);
                boolean zF4 = e18Var4.f(chartDisplayV0Input2.getSeries()) | e18Var4.d(chartDisplayV0Input2.getStyle().ordinal());
                Object objN11 = e18Var4.N();
                if (zF4 || objN11 == lz1Var2) {
                    List<ChartDisplayV0InputSeriesItem> series = chartDisplayV0Input2.getSeries();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = series.iterator();
                    while (it.hasNext()) {
                        Iterator it2 = it;
                        Object next = it2.next();
                        qi3 qi3Var6 = qi3Var3;
                        cz5 cz5Var5 = cz5Var;
                        if (f(chartDisplayV0Input2.getStyle(), (ChartDisplayV0InputSeriesItem) next)) {
                            arrayList.add(next);
                        }
                        it = it2;
                        qi3Var3 = qi3Var6;
                        cz5Var = cz5Var5;
                    }
                    qi3Var4 = qi3Var3;
                    cz5Var2 = cz5Var;
                    e18Var4.k0(arrayList);
                    obj = arrayList;
                } else {
                    qi3Var4 = qi3Var3;
                    cz5Var2 = cz5Var;
                    obj = objN11;
                }
                List list = (List) obj;
                String strF0 = d4c.f0(R.plurals.chart_a11y_series, list.size(), new Object[]{Integer.valueOf(list.size())}, e18Var4);
                boolean zF5 = e18Var4.f(list);
                Object objN12 = e18Var4.N();
                if (zF5 || objN12 == lz1Var2) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        String name = ((ChartDisplayV0InputSeriesItem) it3.next()).getName();
                        if (name == null || bsg.I0(name)) {
                            name = null;
                        }
                        if (name != null) {
                            arrayList2.add(name);
                        }
                    }
                    objN12 = w44.S0(arrayList2, ", ", null, null, null, 62);
                    e18Var4.k0(objN12);
                }
                String str = (String) objN12;
                String title = chartDisplayV0Input2.getTitle();
                if (title == null || bsg.I0(title)) {
                    title = null;
                }
                if (str.length() <= 0) {
                    str = null;
                }
                String strS0 = w44.S0(mp0.C0(new String[]{title, strJ0, strF0, str}), ". ", null, null, null, 62);
                String strJ02 = d4c.j0(R.string.chart_action_copy_as_image, e18Var4);
                String strJ03 = d4c.j0(R.string.chart_action_share, e18Var4);
                boolean zH3 = e18Var4.h(ja8Var);
                Object objN13 = e18Var4.N();
                if (zH3 || objN13 == lz1Var2) {
                    objN13 = new v0(21, ja8Var);
                    e18Var4.k0(objN13);
                }
                iqb iqbVarU = zni.u(iqbVar, (bz7) objN13);
                Object objN14 = e18Var4.N();
                if (objN14 == lz1Var2) {
                    objN14 = new nj2(nwbVar5, nwbVar4, 0);
                    e18Var4.k0(objN14);
                }
                iqb iqbVarA = a0h.a(iqbVarU, iei.a, (PointerInputEventHandler) objN14);
                boolean zF6 = e18Var4.f(strS0) | e18Var4.f(strJ02) | e18Var4.f(zy7Var3) | e18Var4.f(strJ03) | e18Var4.f(zy7Var4);
                Object objN15 = e18Var4.N();
                if (zF6 || objN15 == lz1Var2) {
                    zy7Var = zy7Var4;
                    zy7Var2 = zy7Var3;
                    objN15 = new w20(strS0, strJ02, strJ03, zy7Var2, zy7Var, 2);
                    e18Var4.k0(objN15);
                } else {
                    zy7Var = zy7Var4;
                    zy7Var2 = zy7Var3;
                }
                a(chartDisplayV0Input2, tjf.b(iqbVarA, true, (bz7) objN15), e18Var4, i4);
                if (((Boolean) nwbVar6.getValue()).booleanValue()) {
                    e18Var4.a0(519834917);
                    Object objN16 = e18Var4.N();
                    if (objN16 == lz1Var2) {
                        objN16 = new ve(25, nwbVar6);
                        e18Var4.k0(objN16);
                    }
                    lz1Var = lz1Var2;
                    nwbVar2 = nwbVar5;
                    z4 = false;
                    nwbVar3 = nwbVar6;
                    nwbVar = nwbVar4;
                    cz5Var3 = cz5Var2;
                    ppk.a((zy7) objN16, fd9.q0(-522279287, new jj2(0, nwbVar6), e18Var4), null, null, null, rwj.b, fd9.q0(1636339364, new fp(18, chartDisplayV0Input2), e18Var4), null, 0L, 0L, 0L, 0L, null, e18Var4, 1769526, 0, 16284);
                    e18 e18Var5 = e18Var4;
                    e18Var5.p(false);
                    e18Var3 = e18Var5;
                } else {
                    cz5Var3 = cz5Var2;
                    e18 e18Var6 = e18Var4;
                    nwbVar = nwbVar4;
                    lz1Var = lz1Var2;
                    nwbVar2 = nwbVar5;
                    nwbVar3 = nwbVar6;
                    z4 = false;
                    e18Var6.a0(520636391);
                    e18Var6.p(false);
                    e18Var3 = e18Var6;
                }
                boolean zBooleanValue = ((Boolean) nwbVar.getValue()).booleanValue();
                Object objN17 = e18Var3.N();
                if (objN17 == lz1Var) {
                    objN17 = new ve(26, nwbVar);
                    e18Var3.k0(objN17);
                }
                boolean z5 = zA;
                z3 = z5;
                j8.b(zBooleanValue, (zy7) objN17, null, (((long) Float.floatToRawIntBits(cz5Var3.g0(Float.intBitsToFloat((int) (((fcc) nwbVar2.getValue()).a >> 32))))) << 32) | (((long) Float.floatToRawIntBits(cz5Var3.g0(Float.intBitsToFloat((int) (((fcc) nwbVar2.getValue()).a & 4294967295L))))) & 4294967295L), null, null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(-2034944423, new kj2(zy7Var2, zy7Var, z5, nwbVar, nwbVar3), e18Var3), e18Var3, 48, 2036);
                e18Var3.p(z4);
                e18Var2 = e18Var3;
            } else {
                qi3Var4 = qi3Var3;
                e18 e18Var7 = e18Var4;
                z3 = zA;
                e18Var7.a0(521752391);
                e18Var7.p(false);
                e18Var2 = e18Var7;
            }
            qi3Var2 = qi3Var4;
            z2 = z3;
            fk0Var2 = fk0Var3;
            x89Var2 = x89Var3;
            e18Var = e18Var2;
        } else {
            e18 e18Var8 = e18Var4;
            e18Var8.T();
            qi3Var2 = qi3Var;
            fk0Var2 = fk0Var;
            x89Var2 = x89Var;
            z2 = z;
            e18Var = e18Var8;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pg1(chartDisplayV0Input2, iqbVar, qi3Var2, fk0Var2, x89Var2, z2, i, 3);
        }
    }

    public static final long c(jl3 jl3Var, int i) {
        jl3Var.getClass();
        int i2 = i % 7;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? jl3Var.Y : jl3Var.X : jl3Var.W : jl3Var.V : jl3Var.U : jl3Var.T : jl3Var.S;
    }

    public static final String d(double d2) {
        double dAbs = Math.abs(d2);
        double d3 = d2 % 1.0d;
        return (d3 != 0.0d || dAbs < 1000.0d) ? d3 == 0.0d ? String.valueOf((int) d2) : dAbs >= 1000.0d ? String.format("%,.2f", Arrays.copyOf(new Object[]{Double.valueOf(d2)}, 1)) : String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d2)}, 1)) : String.format("%,d", Arrays.copyOf(new Object[]{Long.valueOf((long) d2)}, 1));
    }

    public static final boolean e(ChartDisplayV0InputStyle chartDisplayV0InputStyle, List list) {
        chartDisplayV0InputStyle.getClass();
        list.getClass();
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (f(chartDisplayV0InputStyle, (ChartDisplayV0InputSeriesItem) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean f(ChartDisplayV0InputStyle chartDisplayV0InputStyle, ChartDisplayV0InputSeriesItem chartDisplayV0InputSeriesItem) {
        List<ChartDisplayV0InputSeriesItemPointsItem> points;
        chartDisplayV0InputStyle.getClass();
        chartDisplayV0InputSeriesItem.getClass();
        int i = oj2.a[chartDisplayV0InputStyle.ordinal()];
        if (i == 1) {
            List<Double> values = chartDisplayV0InputSeriesItem.getValues();
            return ((values == null || values.isEmpty()) && ((points = chartDisplayV0InputSeriesItem.getPoints()) == null || points.isEmpty())) ? false : true;
        }
        if (i == 2) {
            List<Double> values2 = chartDisplayV0InputSeriesItem.getValues();
            return (values2 == null || values2.isEmpty()) ? false : true;
        }
        if (i == 3) {
            List<ChartDisplayV0InputSeriesItemPointsItem> points2 = chartDisplayV0InputSeriesItem.getPoints();
            return (points2 == null || points2.isEmpty()) ? false : true;
        }
        wg6.i();
        return false;
    }

    public static final y5a g(ld4 ld4Var) {
        long j = gm3.a(ld4Var).v;
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        if (objN == jd4.a) {
            objN = new y5a(dmk.e(j), hj6.R, ModuleDescriptor.MODULE_VERSION);
            e18Var.k0(objN);
        }
        return (y5a) objN;
    }

    public static final wdh h(long j) {
        int iN0 = d4c.n0(j);
        Typeface.DEFAULT.getClass();
        return new wdh(iN0, e59.e);
    }
}
