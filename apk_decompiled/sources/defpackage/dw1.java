package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class dw1 {
    public static final ewb a = c(true);
    public static final ewb b = c(false);
    public static final cw1 c = cw1.b;

    public static final void a(iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-211209833);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 0;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            int iHashCode = Long.hashCode(e18Var.T);
            iqb iqbVarE = kxk.E(e18Var, iqbVar);
            hyc hycVarL = e18Var.l();
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, c);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new aw1(iqbVar, i, i3);
        }
    }

    public static final void b(b3d b3dVar, c3d c3dVar, h5b h5bVar, fu9 fu9Var, int i, int i2, tt ttVar) {
        tt ttVar2;
        Object objZ = h5bVar.z();
        yv1 yv1Var = objZ instanceof yv1 ? (yv1) objZ : null;
        b3d.j(b3dVar, c3dVar, ((yv1Var == null || (ttVar2 = yv1Var.S) == null) ? ttVar : ttVar2).a((((long) c3dVar.E) << 32) | (((long) c3dVar.F) & 4294967295L), (((long) i) << 32) | (((long) i2) & 4294967295L), fu9Var));
    }

    public static final ewb c(boolean z) {
        ewb ewbVar = new ewb(9);
        xo1 xo1Var = lja.G;
        ewbVar.m(xo1Var, new fw1(xo1Var, z));
        xo1 xo1Var2 = lja.H;
        ewbVar.m(xo1Var2, new fw1(xo1Var2, z));
        xo1 xo1Var3 = lja.I;
        ewbVar.m(xo1Var3, new fw1(xo1Var3, z));
        xo1 xo1Var4 = lja.J;
        ewbVar.m(xo1Var4, new fw1(xo1Var4, z));
        xo1 xo1Var5 = lja.K;
        ewbVar.m(xo1Var5, new fw1(xo1Var5, z));
        xo1 xo1Var6 = lja.L;
        ewbVar.m(xo1Var6, new fw1(xo1Var6, z));
        xo1 xo1Var7 = lja.M;
        ewbVar.m(xo1Var7, new fw1(xo1Var7, z));
        xo1 xo1Var8 = lja.N;
        ewbVar.m(xo1Var8, new fw1(xo1Var8, z));
        xo1 xo1Var9 = lja.O;
        ewbVar.m(xo1Var9, new fw1(xo1Var9, z));
        return ewbVar;
    }

    public static final o5b d(tt ttVar, boolean z) {
        o5b o5bVar = (o5b) (z ? a : b).g(ttVar);
        return o5bVar == null ? new fw1(ttVar, z) : o5bVar;
    }
}
