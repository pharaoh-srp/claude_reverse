package defpackage;

import android.view.View;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class e3g {
    public static final umg a = new umg(new wof(2));
    public static final xe4 b = new xe4(new wof(2));
    public static final umg c = new umg(new wof(2));
    public static final umg d = new umg(new wof(2));

    public static final void a(zy7 zy7Var, ta4 ta4Var, ld4 ld4Var, int i) {
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1420253890);
        int i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            View view = (View) e18Var.j(w00.f);
            nwb nwbVarZ = mpk.Z(zy7Var, e18Var);
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = new fg1(20, nwbVarZ);
                e18Var.k0(objN);
            }
            o3g.a(null, fd9.q0(2059538244, new wt2(view, (zy7) objN, ta4Var, 9), e18Var), e18Var, 48);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fga(zy7Var, ta4Var, i, 10);
        }
    }

    public static final void b(ia0 ia0Var, zy7 zy7Var, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        ia0Var.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(956400432);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(ia0Var) : e18Var.h(ia0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            j8.c(b.a(ia0Var), fd9.q0(-2049264016, new ufe(zy7Var, 7, ta4Var), e18Var), e18Var, 48);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new c3g(ia0Var, i, zy7Var, ta4Var, 0);
        }
    }

    public static final boolean c(ld4 ld4Var) {
        k3g k3gVar = (k3g) ((e18) ld4Var).j(a);
        return k3gVar != null && k3gVar.a();
    }

    public static final iqb d(iqb iqbVar, String str, boolean z, float f, float f2, ld4 ld4Var) {
        boolean z2;
        a80 a80Var;
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(191779727);
        k3g k3gVar = (k3g) e18Var.j(a);
        if (k3gVar == null) {
            e18Var.p(false);
            return iqbVar;
        }
        zy7 zy7Var = (zy7) e18Var.j(d);
        if (zy7Var == null) {
            e18Var.p(false);
            return iqbVar;
        }
        if (e18Var.j(w00.f) != e18Var.j(c)) {
            e18Var.p(false);
            return iqbVar;
        }
        boolean zBooleanValue = ((Boolean) zy7Var.a()).booleanValue();
        if (!z) {
            z2 = zBooleanValue;
        } else if (zBooleanValue) {
            z2 = false;
        } else {
            zBooleanValue = true;
            z2 = zBooleanValue;
        }
        e18Var.a0(-383260268);
        h3g h3gVarB = k3g.b(str, e18Var);
        e18Var.p(false);
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (objN == lz1Var) {
            objN = new a80(new va6(z2 ? f2 : f), dgj.h, new va6(0.5f), 8);
            e18Var.k0(objN);
        }
        a80 a80Var2 = (a80) objN;
        Boolean boolValueOf = Boolean.valueOf(z2);
        boolean zH = e18Var.h(a80Var2) | e18Var.g(z2);
        Object objN2 = e18Var.N();
        if (zH || objN2 == lz1Var) {
            objN2 = new d3g(a80Var2, z2, f, f2, null);
            a80Var = a80Var2;
            e18Var.k0(objN2);
        } else {
            a80Var = a80Var2;
        }
        fd9.i(e18Var, (pz7) objN2, boolValueOf);
        boolean zF = e18Var.f(zy7Var);
        Object objN3 = e18Var.N();
        if (zF || objN3 == lz1Var) {
            objN3 = new tu(22, zy7Var);
            e18Var.k0(objN3);
        }
        iqb iqbVarH0 = fd9.h0(iqbVar, (rz7) objN3);
        eb0 eb0Var = ez1.o;
        g3g.a.getClass();
        iqb iqbVarP = kxk.p(iqbVarH0, new i3g(h3gVarB, null, new j3g(z2), k3gVar, f3g.b, o3g.b, eb0Var));
        int iA = va6.a(f, MTTypesetterKt.kLineSkipLimitMultiplier);
        iqb iqbVarI0 = fqb.E;
        if (iA > 0 || va6.a(f2, MTTypesetterKt.kLineSkipLimitMultiplier) > 0) {
            e18Var.a0(-1836820827);
            boolean zH2 = e18Var.h(a80Var);
            Object objN4 = e18Var.N();
            if (zH2 || objN4 == lz1Var) {
                objN4 = new hk1(a80Var, 2);
                e18Var.k0(objN4);
            }
            iqbVarI0 = xn5.i0(iqbVarI0, (bz7) objN4);
            e18Var.p(false);
        } else {
            e18Var.a0(-1836627914);
            e18Var.p(false);
        }
        iqb iqbVarB = iqbVarP.B(iqbVarI0);
        e18Var.p(false);
        return iqbVarB;
    }

    public static final iqb e(iqb iqbVar, Object obj, e18 e18Var, int i) {
        Object objQ0;
        iqbVar.getClass();
        obj.getClass();
        e18Var.a0(-1057107593);
        k3g k3gVar = (k3g) e18Var.j(a);
        if (k3gVar == null) {
            e18Var.p(false);
            return iqbVar;
        }
        ia0 ia0Var = (ia0) e18Var.j(b);
        if (ia0Var == null) {
            e18Var.p(false);
            return iqbVar;
        }
        if (e18Var.j(w00.f) != e18Var.j(c)) {
            e18Var.p(false);
            return iqbVar;
        }
        a6i a6iVarA = ia0Var.a();
        d9i d9iVar = dgj.h;
        boolean zG = a6iVarA.g();
        rok rokVar = a6iVarA.a;
        Object obj2 = jd4.a;
        if (zG) {
            e18Var.a0(1666827533);
            e18Var.p(false);
            objQ0 = rokVar.q0();
        } else {
            e18Var.a0(1666573488);
            boolean zF = e18Var.f(a6iVarA);
            objQ0 = e18Var.N();
            if (zF || objQ0 == obj2) {
                rcg rcgVarZ = fd9.Z();
                bz7 bz7VarE = rcgVarZ != null ? rcgVarZ.e() : null;
                rcg rcgVarK0 = fd9.k0(rcgVarZ);
                try {
                    Object objQ02 = rokVar.q0();
                    fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
                    e18Var.k0(objQ02);
                    objQ0 = objQ02;
                } catch (Throwable th) {
                    fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
                    throw th;
                }
            }
            e18Var.p(false);
        }
        e18Var.a0(-1573749707);
        int iOrdinal = ((zo6) objQ0).ordinal();
        if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
            mr9.b();
            return null;
        }
        e18Var.p(false);
        va6 va6Var = new va6(MTTypesetterKt.kLineSkipLimitMultiplier);
        boolean zF2 = e18Var.f(a6iVarA);
        Object objN = e18Var.N();
        if (zF2 || objN == obj2) {
            objN = mpk.w(new kc5(a6iVarA, 4));
            e18Var.k0(objN);
        }
        zo6 zo6Var = (zo6) ((wlg) objN).getValue();
        e18Var.a0(-1573749707);
        int iOrdinal2 = zo6Var.ordinal();
        if (iOrdinal2 != 0 && iOrdinal2 != 1 && iOrdinal2 != 2) {
            mr9.b();
            return null;
        }
        e18Var.p(false);
        va6 va6Var2 = new va6(MTTypesetterKt.kLineSkipLimitMultiplier);
        boolean zF3 = e18Var.f(a6iVarA);
        Object objN2 = e18Var.N();
        if (zF3 || objN2 == obj2) {
            objN2 = mpk.w(new kc5(a6iVarA, 5));
            e18Var.k0(objN2);
        }
        ((t5i) ((wlg) objN2).getValue()).getClass();
        e18Var.a0(1947536657);
        yig yigVarK = kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, 400.0f, new va6(0.5f), 1);
        e18Var.p(false);
        v5i v5iVarV = nai.v(a6iVarA, va6Var, va6Var2, yigVarK, d9iVar, e18Var, 196608);
        iqb iqbVarC = k3g.c(k3gVar, iqbVar, k3g.b(obj, e18Var), ia0Var, 124);
        int iA = va6.a(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
        iqb iqbVarI0 = fqb.E;
        if (iA > 0 || va6.a(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier) > 0) {
            e18Var.a0(-1380196648);
            boolean zF4 = e18Var.f(v5iVarV);
            Object objN3 = e18Var.N();
            if (zF4 || objN3 == obj2) {
                objN3 = new ma0(v5iVarV, 3);
                e18Var.k0(objN3);
            }
            iqbVarI0 = xn5.i0(iqbVarI0, (bz7) objN3);
            e18Var.p(false);
        } else {
            e18Var.a0(-1379998930);
            e18Var.p(false);
        }
        iqb iqbVarB = iqbVarC.B(iqbVarI0);
        e18Var.p(false);
        return iqbVarB;
    }
}
