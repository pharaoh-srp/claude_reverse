package defpackage;

import androidx.compose.foundation.layout.b;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class nx3 implements lfh {
    public final /* synthetic */ boolean E;
    public final /* synthetic */ String F;
    public final /* synthetic */ List G;
    public final /* synthetic */ jl3 H;
    public final /* synthetic */ jm3 I;
    public final /* synthetic */ pz7 J;
    public final /* synthetic */ yih K;
    public final /* synthetic */ String L;

    public nx3(boolean z, String str, List list, jl3 jl3Var, jm3 jm3Var, pz7 pz7Var, yih yihVar, String str2) {
        this.E = z;
        this.F = str;
        this.G = list;
        this.H = jl3Var;
        this.I = jm3Var;
        this.J = pz7Var;
        this.K = yihVar;
        this.L = str2;
    }

    @Override // defpackage.lfh
    public final void k(ta4 ta4Var, ld4 ld4Var, int i) {
        lz1 lz1Var;
        jl3 jl3Var;
        boolean z;
        jm3 jm3Var;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(615287696);
        int i2 = i | (e18Var.f(this) ? 32 : 16);
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            fqb fqbVar = fqb.E;
            iqb iqbVarE = kxk.E(e18Var, fqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            lz1 lz1Var2 = jd4.a;
            boolean z2 = this.E;
            jl3 jl3Var2 = this.H;
            jm3 jm3Var2 = this.I;
            if (z2) {
                e18Var.a0(894269829);
                long j = jl3Var2.M;
                Set set = sdi.a;
                String str = this.F;
                str.getClass();
                List<b79> list = this.G;
                list.getClass();
                long j2 = gm3.a(e18Var).b0;
                boolean zF = e18Var.f(str) | e18Var.f(list) | e18Var.e(j) | e18Var.e(j2);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var2) {
                    xb0 xb0Var = new xb0();
                    xb0Var.h(str);
                    long j3 = j2;
                    xb0Var.b(new egg(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), 0, str.length());
                    for (b79 b79Var : list) {
                        long j4 = j3;
                        j3 = j4;
                        xb0Var.b(new egg(j4, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), b79Var.E, b79Var.F + 1);
                    }
                    objN = xb0Var.n();
                    e18Var.k0(objN);
                }
                zb0 zb0Var = (zb0) objN;
                tkh tkhVar = jm3Var2.e;
                iqb iqbVarC = b.c(fqbVar, 1.0f);
                Object objN2 = e18Var.N();
                if (objN2 == lz1Var2) {
                    objN2 = new it2(19);
                    e18Var.k0(objN2);
                }
                lz1Var = lz1Var2;
                jl3Var = jl3Var2;
                jm3Var = jm3Var2;
                z = false;
                tjh.c(zb0Var, tjf.a(iqbVarC, (bz7) objN2), 0L, 0L, 0L, null, 0L, 0, false, 6, 0, null, null, tkhVar, e18Var, 0, 24576, 245756);
                e18Var = e18Var;
                e18Var.p(false);
            } else {
                lz1Var = lz1Var2;
                jl3Var = jl3Var2;
                z = false;
                jm3Var = jm3Var2;
                e18Var.a0(895078712);
                e18Var.p(false);
            }
            ta4Var.invoke(e18Var, 6);
            Object objN3 = e18Var.N();
            pz7 pz7Var = this.J;
            if (objN3 == lz1Var) {
                objN3 = mpk.P(pz7Var);
                e18Var.k0(objN3);
            }
            nwb nwbVar = (nwb) objN3;
            if (pz7Var != null) {
                nwbVar.setValue(pz7Var);
            }
            yih yihVar = this.K;
            wd6.M((yihVar.d().G.length() != 0 || pz7Var == null) ? z : true, null, gp6.e(null, 3).a(gp6.d(null, null, 15)), gp6.f(null, 3).a(gp6.l(null, null, 15)), null, fd9.q0(-23193870, new dl1(2, nwbVar), e18Var), e18Var, 200064, 18);
            if (yihVar.d().G.length() == 0 && pz7Var == null) {
                e18Var.a0(896361244);
                e18 e18Var2 = e18Var;
                tjh.b(this.L, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkh.b(jm3Var.e, jl3Var.O, 0L, null, null, null, 0L, null, 0, 0L, null, 0, 16777214), e18Var2, 0, 0, 131070);
                e18Var = e18Var2;
                e18Var.p(z);
            } else {
                e18Var.a0(896480408);
                e18Var.p(z);
            }
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new kn(this, ta4Var, i, 25);
        }
    }
}
