package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class k4g {
    public static final k4g a = new k4g();
    public static final vve b = xve.d(44.0f, 44.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 12);
    public static final float c = 160.0f;
    public static final u4g d = u4g.E;
    public static final qnc e = gb9.b(24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
    public static final qnc f = new qnc(6.0f, 5.5f, 6.0f, 5.5f);
    public static final long g = mpk.d(36.0f, 5.0f);
    public static final float h = 16.0f;
    public static final qnc i = new qnc(16.0f, 5.0f, 16.0f, 5.0f);
    public static final a5g j = a5g.E;
    public static final float k = 8.0f;
    public static final z4g l = z4g.E;
    public static final int m = 2;

    public static z3g d(long j2, ld4 ld4Var, int i2) {
        if ((i2 & 1) != 0) {
            j2 = gm3.a(ld4Var).o;
        }
        long j3 = j2;
        return new z3g(j3, gm3.a(ld4Var).M, gm3.a(ld4Var).v, j3);
    }

    public static ta4 e(boolean z, v4g v4gVar, zy7 zy7Var, ld4 ld4Var) {
        v4gVar.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        if (objN == jd4.a) {
            objN = fd9.O(im6.E, e18Var);
            e18Var.k0(objN);
        }
        l45 l45Var = (l45) objN;
        if (!z || !v4gVar.d()) {
            e18 e18Var2 = (e18) ld4Var;
            e18Var2.a0(-1846813606);
            e18Var2.p(false);
            return null;
        }
        e18 e18Var3 = (e18) ld4Var;
        e18Var3.a0(-1847052988);
        ta4 ta4VarQ0 = fd9.q0(-1194409778, new tfe((Object) v4gVar, (Object) zy7Var, false, (Object) l45Var, 14), e18Var3);
        e18Var3.p(false);
        return ta4VarQ0;
    }

    public final void a(v4g v4gVar, zy7 zy7Var, l45 l45Var, ld4 ld4Var, int i2) {
        v4gVar.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1205883699);
        int i3 = 4;
        int i4 = (e18Var.f(v4gVar) ? 4 : 2) | i2 | (e18Var.h(zy7Var) ? 32 : 16) | (e18Var.f(l45Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i4 & 1, (i4 & 147) != 146)) {
            e18Var.V();
            if ((i2 & 1) != 0 && !e18Var.A()) {
                e18Var.T();
            }
            e18Var.q();
            boolean z = v4gVar.c() != b5g.E;
            boolean z2 = ((((i4 & 896) ^ 384) > 256 && e18Var.h(l45Var)) || (i4 & 384) == 256) | ((i4 & 14) == 4) | ((i4 & 112) == 32);
            Object objN = e18Var.N();
            if (z2 || objN == jd4.a) {
                objN = new vu1(v4gVar, l45Var, zy7Var, i3);
                e18Var.k0(objN);
            }
            nai.a(0, 0, e18Var, (zy7) objN, z);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v3e(this, v4gVar, zy7Var, l45Var, i2, 8);
        }
    }

    public final void b(String str, iqb iqbVar, ld4 ld4Var, int i2) {
        e18 e18Var;
        iqb iqbVar2;
        str.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1368174);
        int i3 = i2 | (e18Var2.f(str) ? 4 : 2) | 48;
        if (e18Var2.Q(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 & 126;
            fqb fqbVar = fqb.E;
            e18Var = e18Var2;
            tjh.b(str, fqbVar, 0L, 0L, null, null, null, 0L, null, null, 0L, m, false, 3, 0, null, null, e18Var, i4, 24576, 241660);
            iqbVar2 = fqbVar;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new j4g(this, str, iqbVar2, i2, 1);
        }
    }

    public final void c(String str, iqb iqbVar, ld4 ld4Var, int i2) {
        e18 e18Var;
        iqb iqbVar2;
        str.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(248078958);
        int i3 = i2 | (e18Var2.f(str) ? 4 : 2) | 48;
        if (e18Var2.Q(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 & 126;
            fqb fqbVar = fqb.E;
            e18Var = e18Var2;
            tjh.b(str, fqbVar, 0L, 0L, null, null, null, 0L, null, null, 0L, m, false, 2, 0, null, null, e18Var, i4, 24576, 241660);
            iqbVar2 = fqbVar;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new j4g(this, str, iqbVar2, i2, 0);
        }
    }
}
