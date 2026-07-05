package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class n2i {
    public static final qnc a = new qnc(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
    public static final float b = 64.0f;
    public static final float c = 64.0f;
    public static final float d = 112.0f;

    public static g77 a(s2i s2iVar, ld4 ld4Var, int i) {
        if ((i & 1) != 0) {
            s2iVar = eg0.h(ld4Var);
        }
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (objN == lz1Var) {
            objN = new n7h(25);
            e18Var.k0(objN);
        }
        zy7 zy7Var = (zy7) objN;
        yig yigVarP = u00.P(asb.G, ld4Var);
        zn5 zn5VarA = qig.a(ld4Var);
        boolean zF = ((e18) ld4Var).f(s2iVar) | ((e18) ld4Var).f(zy7Var);
        e18 e18Var2 = (e18) ld4Var;
        boolean zF2 = zF | e18Var2.f(yigVarP) | e18Var2.f(zn5VarA);
        Object objN2 = e18Var2.N();
        if (zF2 || objN2 == lz1Var) {
            objN2 = new g77(s2iVar, yigVarP, zn5VarA, zy7Var);
            e18Var2.k0(objN2);
        }
        return (g77) objN2;
    }

    public static m2i b(n54 n54Var) {
        m2i m2iVar = n54Var.c0;
        if (m2iVar != null) {
            return m2iVar;
        }
        m2i m2iVar2 = new m2i(p54.c(n54Var, d4c.E), p54.c(n54Var, d4c.G), p54.c(n54Var, d4c.F), p54.c(n54Var, d4c.I), p54.c(n54Var, d4c.J), p54.c(n54Var, d4c.H));
        n54Var.c0 = m2iVar2;
        return m2iVar2;
    }

    public static a5a c(ld4 ld4Var) {
        return new a5a(kxk.y(ld4Var), mdj.e | 16);
    }

    public static m2i d(long j, long j2, long j3, long j4, long j5, ld4 ld4Var, int i) {
        return b(((gwa) ((e18) ld4Var).j(jwa.a)).a).a(j, (i & 2) != 0 ? d54.h : j2, (i & 4) != 0 ? d54.h : j3, (i & 8) != 0 ? d54.h : j4, (i & 16) != 0 ? d54.h : j5, d54.h);
    }
}
