package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u2f implements p90 {
    public static final u2f a = new u2f();

    @Override // defpackage.p90
    public final void a(el5 el5Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(607442778);
        int i2 = (e18Var.f(el5Var) ? 4 : 2) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            final noh nohVar = (noh) el5Var.E;
            boolean zH = e18Var.h(nohVar);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zH || objN == lz1Var) {
                objN = new bz7() { // from class: t2f
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj) {
                        ue7 ue7Var;
                        int i5 = i3;
                        noh nohVar2 = nohVar;
                        switch (i5) {
                            case 0:
                                y69 y69Var = (y69) obj;
                                moh mohVarG = nohVar2.E.g();
                                if (mohVarG == null) {
                                    mohVarG = null;
                                }
                                return new y69((mohVarG == null || (ue7Var = mohVarG.f) == null) ? y69Var.a : ue7Var.d(y69Var.a));
                            default:
                                toh tohVar = (toh) obj;
                                tohVar.getClass();
                                return Boolean.valueOf(!(tohVar.a(nohVar2.F) == lja.b0));
                        }
                    }
                };
                e18Var.k0(objN);
            }
            bz7 bz7Var = (bz7) objN;
            boolean zR = x44.r((dqc) nohVar.G.getValue(), zp3.M);
            boolean zH2 = e18Var.h(nohVar);
            Object objN2 = e18Var.N();
            if (zH2 || objN2 == lz1Var) {
                objN2 = new dg8(29, nohVar);
                e18Var.k0(objN2);
            }
            zy7 zy7Var = (zy7) objN2;
            a6i a6iVarA = nohVar.E.a();
            wp6 wp6Var = (wp6) el5Var.F;
            d77 d77Var = (d77) el5Var.G;
            iqb iqbVarQ = mwa.q();
            kl7 kl7Var = (kl7) el5Var.H;
            zy7Var.getClass();
            kl7Var.getClass();
            bz7Var.getClass();
            iqb iqbVarB = iqbVarQ.B(new r2f(zy7Var, kl7Var, bz7Var, nohVar, zR));
            iqb iqbVarW = fqb.E;
            if (!zR) {
                iqbVarW = xn5.W(iqbVarW);
            }
            iqb iqbVarB2 = iqbVarB.B(iqbVarW);
            boolean zH3 = e18Var.h(nohVar);
            Object objN3 = e18Var.N();
            if (zH3 || objN3 == lz1Var) {
                objN3 = new bz7() { // from class: t2f
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj) {
                        ue7 ue7Var;
                        int i5 = i4;
                        noh nohVar2 = nohVar;
                        switch (i5) {
                            case 0:
                                y69 y69Var = (y69) obj;
                                moh mohVarG = nohVar2.E.g();
                                if (mohVarG == null) {
                                    mohVarG = null;
                                }
                                return new y69((mohVarG == null || (ue7Var = mohVarG.f) == null) ? y69Var.a : ue7Var.d(y69Var.a));
                            default:
                                toh tohVar = (toh) obj;
                                tohVar.getClass();
                                return Boolean.valueOf(!(tohVar.a(nohVar2.F) == lja.b0));
                        }
                    }
                };
                e18Var.k0(objN3);
            }
            wd6.L(a6iVarA, (bz7) objN3, iqbVarB2, wp6Var, d77Var, fd9.q0(-164939928, new bu2(nohVar, 5, el5Var), e18Var), e18Var, 196608, 0);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fga(this, el5Var, i, 7);
        }
    }
}
