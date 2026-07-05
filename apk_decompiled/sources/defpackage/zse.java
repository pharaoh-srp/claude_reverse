package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zse {
    public static final xe4 a = new xe4(new afe(17));

    public static final void a(iqb iqbVar, ote oteVar, ta4 ta4Var, ld4 ld4Var, int i) {
        iqb iqbVar2;
        ote oteVar2;
        ta4 ta4Var2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(521643823);
        int i2 = (e18Var.f(iqbVar) ? 4 : 2) | i | (e18Var.f(oteVar) ? 32 : 16) | 384 | (e18Var.h(ta4Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            iqbVar2 = iqbVar;
            oteVar2 = oteVar;
            ta4Var2 = ta4Var;
            b(fd9.q0(-1665095235, new cua(iqbVar2, oteVar2, ta4Var2, 1, (byte) 0), e18Var), e18Var, 6);
        } else {
            iqbVar2 = iqbVar;
            oteVar2 = oteVar;
            ta4Var2 = ta4Var;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new cua(iqbVar2, oteVar2, ta4Var2, i);
        }
    }

    public static final void b(ta4 ta4Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(716390213);
        if (!e18Var.Q(i & 1, (i & 3) != 2)) {
            e18Var.T();
        } else if (((Boolean) e18Var.j(a)).booleanValue()) {
            e18Var.a0(289006828);
            ta4Var.invoke(e18Var, 6);
            e18Var.p(false);
        } else {
            e18Var.a0(288492941);
            msk.c(new oua(29), zb4.a, bw9.f0, zb4.b, fd9.q0(-1491968376, new rx0(ta4Var, 26), e18Var), e18Var, 27696);
            e18Var.p(false);
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new rx0(ta4Var, i, 27);
        }
    }
}
