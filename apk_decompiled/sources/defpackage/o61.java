package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o61 {
    public static final long a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final /* synthetic */ int e = 0;

    static {
        dx1.b.getClass();
        long j = cx1.b;
        a = d54.b(0.5f, j);
        b = j;
        long jL = d4c.l(0.42f, 0.61f, 0.8f, 1.0f, t54.e);
        c = jL;
        d = d54.b(0.5f, jL);
    }

    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27, types: [m4a, tp4] */
    /* JADX WARN: Type inference failed for: r5v37 */
    public static final void a(dmc dmcVar, y49 y49Var, boolean z, boolean z2, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        p61 p61Var;
        ?? r5;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(304973654);
        int i2 = i | (e18Var2.h(dmcVar) ? 4 : 2) | (e18Var2.h(y49Var) ? 32 : 16) | (e18Var2.g(z) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.g(z2) ? 2048 : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var2.f(iqbVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        if (e18Var2.Q(i2 & 1, (i2 & 9363) != 9362)) {
            Context context = (Context) e18Var2.j(w00.b);
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            Object obj = objN;
            if (objN == lz1Var) {
                p61 p61Var2 = new p61(context);
                p61Var2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                e18Var2.k0(p61Var2);
                obj = p61Var2;
            }
            p61 p61Var3 = (p61) obj;
            boolean zH = ((i2 & 14) == 4 || e18Var2.h(dmcVar)) | e18Var2.h(p61Var3);
            Object objN2 = e18Var2.N();
            tp4 tp4Var = null;
            if (zH || objN2 == lz1Var) {
                objN2 = new g9(p61Var3, dmcVar, tp4Var, 13);
                e18Var2.k0(objN2);
            }
            fd9.i(e18Var2, (pz7) objN2, dmcVar);
            boolean zH2 = e18Var2.h(p61Var3) | ((i2 & 112) == 32 || e18Var2.h(y49Var));
            Object objN3 = e18Var2.N();
            if (zH2 || objN3 == lz1Var) {
                objN3 = new g9(p61Var3, y49Var, tp4Var, 14);
                e18Var2.k0(objN3);
            }
            fd9.i(e18Var2, (pz7) objN3, y49Var);
            Boolean boolValueOf = Boolean.valueOf(z2);
            Boolean boolValueOf2 = Boolean.valueOf(z);
            int i3 = i2 & 896;
            boolean zH3 = e18Var2.h(p61Var3) | ((i2 & 7168) == 2048) | (i3 == 256);
            Object objN4 = e18Var2.N();
            if (zH3 || objN4 == lz1Var) {
                objN4 = new l61(p61Var3, z2, z, null);
                e18Var2.k0(objN4);
            }
            int i4 = i2 >> 9;
            fd9.j(boolValueOf, boolValueOf2, (pz7) objN4, e18Var2);
            Object objN5 = e18Var2.N();
            if (objN5 == lz1Var) {
                objN5 = mpk.P(Boolean.FALSE);
                e18Var2.k0(objN5);
            }
            nwb nwbVar = (nwb) objN5;
            Boolean boolValueOf3 = Boolean.valueOf(z);
            boolean z3 = i3 == 256;
            Object objN6 = e18Var2.N();
            if (z3 || objN6 == lz1Var) {
                objN6 = new m61(z, nwbVar, tp4Var, 0);
                e18Var2.k0(objN6);
            }
            fd9.i(e18Var2, (pz7) objN6, boolValueOf3);
            boolean z4 = ((Boolean) nwbVar.getValue()).booleanValue() || z2;
            boolean zF = v40.F(e18Var2);
            long j = !z4 ? d54.g : ((d54) f8g.a(!z4 ? d54.g : ((Boolean) nwbVar.getValue()).booleanValue() ? zF ? a : b : zF ? d : c, kxk.N(300, 0, null, 6), "Bell Color Transition", e18Var2, 432, 8).getValue()).a;
            d54 d54Var = new d54(j);
            boolean zH4 = e18Var2.h(p61Var3) | e18Var2.e(j);
            Object objN7 = e18Var2.N();
            if (zH4 || objN7 == lz1Var) {
                objN7 = new n61(p61Var3, j, tp4Var, 0);
                p61Var = p61Var3;
                r5 = 0;
                e18Var2.k0(objN7);
            } else {
                p61Var = p61Var3;
                r5 = 0;
            }
            fd9.i(e18Var2, (pz7) objN7, d54Var);
            Boolean boolValueOf4 = Boolean.valueOf(z4);
            boolean zG = e18Var2.g(z4) | e18Var2.h(p61Var);
            Object objN8 = e18Var2.N();
            if (zG || objN8 == lz1Var) {
                objN8 = new nw0(z4, p61Var, (tp4) r5, 1);
                e18Var2.k0(objN8);
            }
            fd9.i(e18Var2, (pz7) objN8, boolValueOf4);
            Boolean boolValueOf5 = Boolean.valueOf(z4);
            boolean zG2 = e18Var2.g(z4) | e18Var2.h(p61Var);
            Object objN9 = e18Var2.N();
            if (zG2 || objN9 == lz1Var) {
                objN9 = new xu0(z4, p61Var, 1);
                e18Var2.k0(objN9);
            }
            mwa.d(boolValueOf5, r5, (bz7) objN9, e18Var2, 0);
            if (((Boolean) p61Var.I.getValue()).booleanValue()) {
                e18Var2.a0(1616921100);
                e18Var2.p(false);
                e18Var = e18Var2;
            } else {
                e18Var2.a0(1616813468);
                boolean zH5 = e18Var2.h(p61Var);
                Object objN10 = e18Var2.N();
                if (zH5 || objN10 == lz1Var) {
                    objN10 = new v0(12, p61Var);
                    e18Var2.k0(objN10);
                }
                uj5.a((bz7) objN10, iqbVar, null, e18Var2, i4 & 112, 4);
                e18 e18Var3 = e18Var2;
                e18Var3.p(false);
                e18Var = e18Var3;
            }
        } else {
            e18Var2.T();
            e18Var = e18Var2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new iw0(dmcVar, y49Var, z, z2, iqbVar, i);
        }
    }
}
