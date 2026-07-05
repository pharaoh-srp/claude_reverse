package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class q1g extends ts9 implements bz7 {
    public final /* synthetic */ int F = 1;
    public final /* synthetic */ c3d G;
    public final /* synthetic */ s1g H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1g(s1g s1gVar, c3d c3dVar) {
        super(1);
        this.H = s1gVar;
        this.G = c3dVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        char c;
        long j;
        long j2;
        l9e l9eVarX;
        long jH;
        cu9 cu9VarC;
        int i = this.F;
        iei ieiVar = iei.a;
        s1g s1gVar = this.H;
        c3d c3dVar = this.G;
        fcc fccVar = null;
        switch (i) {
            case 0:
                b3d b3dVar = (b3d) obj;
                s1gVar.T = true;
                s1gVar.S = null;
                r3g r3gVarA = s1gVar.U.d().c.a();
                if (!s1gVar.U.h()) {
                    b3dVar.f(c3dVar, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                } else if (!r3gVarA.d()) {
                    b3dVar.f(c3dVar, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                } else {
                    dpf dpfVarE = r3gVarA.e();
                    if (dpfVarE != null) {
                        l9e l9eVarC = r3gVarA.c();
                        if (l9eVarC == null) {
                            mr9.t("Match State is configured, but current bounds is null. State = ", r3gVarA);
                        } else if (s1gVar.U.d().b.a()) {
                            cu9 cu9VarC2 = b3dVar.c();
                            if (cu9VarC2 != null) {
                                boolean zB = s1gVar.U.d().c.a().b();
                                long jG = s1gVar.p1().G(cu9VarC2, 0L);
                                oq5.F(dpfVarE);
                                h2g h2gVar = s1gVar.U;
                                if (zB) {
                                    c = ' ';
                                    h2gVar.c().a(l9eVarC, oq5.F(dpfVarE), null);
                                } else {
                                    c = ' ';
                                    h2gVar.c().a(l9eVarC, oq5.F(dpfVarE), new eb0(1));
                                }
                                l9e l9eVarC2 = s1gVar.U.c().c();
                                if (l9eVarC2 != null) {
                                    j = jG;
                                    fccVar = new fcc(fcc.i(fcc.h(l9eVarC2.h(), ((fcc) ((lsc) dpfVarE.G).getValue()).a), ((fcc) ((lsc) dpfVarE.I).getValue()).a));
                                } else {
                                    j = jG;
                                }
                                if (s1gVar.U.c().b() || !zB) {
                                    long j3 = fccVar != null ? fccVar.a : j;
                                    if (fccVar == null) {
                                        j2 = j;
                                        l9eVarX = d4c.x(j2, csg.T(cu9VarC2.k()));
                                    } else {
                                        j2 = j;
                                        l9eVarX = d4c.x(fccVar.a, l9eVarC2.g());
                                    }
                                    s1gVar.U.d().c.a().i(l9eVarX);
                                    jH = j3;
                                } else {
                                    jH = fccVar != null ? fccVar.a : l9eVarC.h();
                                    j2 = j;
                                }
                                long jH2 = fcc.h(jH, j2);
                                b3dVar.f(c3dVar, Math.round(Float.intBitsToFloat((int) (jH2 >> c))), Math.round(Float.intBitsToFloat((int) (jH2 & 4294967295L))), MTTypesetterKt.kLineSkipLimitMultiplier);
                            } else {
                                b3dVar.f(c3dVar, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                            }
                        } else if (!s1gVar.U.c().b()) {
                            cu9 cu9VarC3 = b3dVar.c();
                            long jA0 = cu9VarC3 != null ? yfd.a0(fcc.h(l9eVarC.h(), s1gVar.p1().G(cu9VarC3, 0L))) : 0L;
                            b3dVar.f(c3dVar, (int) (jA0 >> 32), (int) (jA0 & 4294967295L), MTTypesetterKt.kLineSkipLimitMultiplier);
                        } else {
                            b3dVar.f(c3dVar, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                        }
                    } else {
                        mr9.t("Match State is configured, but target data is null. State = ", r3gVarA);
                    }
                }
                break;
            default:
                b3d b3dVar2 = (b3d) obj;
                b3dVar2.f(c3dVar, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                g2g g2gVarD = s1gVar.U.d();
                h2g h2gVar2 = s1gVar.U;
                s3g s3gVar = g2gVarD.c;
                s3gVar.c();
                if (!x44.r(s3gVar.a(), g4c.a) && h2gVar2.h()) {
                    r3g r3gVarA2 = s3gVar.a();
                    if (h2gVar2.c().b() && r3gVarA2.b() && (cu9VarC = b3dVar2.c()) != null) {
                        long jT = csg.T(cu9VarC.k());
                        k3g k3gVar = h2gVar2.d().b;
                        cu9 cu9Var = h2gVar2.d().b.J;
                        if (cu9Var != null) {
                            long jF = k3gVar.f(cu9Var, cu9VarC);
                            k3g k3gVar2 = h2gVar2.d().b;
                            cu9 cu9Var2 = h2gVar2.d().b.J;
                            if (cu9Var2 != null) {
                                long jL = cu9Var2.L(cu9VarC, 0L, (6 & 4) != 0);
                                r3g r3gVarA3 = s3gVar.a();
                                g2g g2gVar = s3gVar.a;
                                s1g s1gVar2 = s3gVar.f;
                                s1gVar2.getClass();
                                s3gVar.b.setValue(r3gVarA3.a(g2gVar, s1gVar2, jT, jF, jL));
                            } else {
                                sz6.p("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                            }
                        } else {
                            sz6.p("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                        }
                        break;
                    }
                }
                break;
        }
        return ieiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1g(c3d c3dVar, s1g s1gVar) {
        super(1);
        this.G = c3dVar;
        this.H = s1gVar;
    }
}
