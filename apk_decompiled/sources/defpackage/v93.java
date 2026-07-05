package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v93 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public /* synthetic */ v93(Object obj, boolean z, Object obj2, int i) {
        this.E = i;
        this.G = obj;
        this.F = z;
        this.H = obj2;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        Object obj4 = this.H;
        Object obj5 = this.G;
        switch (i) {
            case 0:
                List list = (List) obj5;
                bz7 bz7Var = (bz7) obj4;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    iqb iqbVarE = b.e(gb9.N(fqb.E, MTTypesetterKt.kLineSkipLimitMultiplier, 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), 76.0f);
                    o5b o5bVarD = dw1.d(lja.K, false);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE2 = kxk.E(e18Var, iqbVarE);
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
                    d4c.i0(e18Var, cd4.d, iqbVarE2);
                    xjk.d(list, this.F, bz7Var, null, e18Var, 0);
                    e18Var.p(true);
                } else {
                    e18Var.T();
                }
                return iei.a;
            default:
                rhh rhhVar = (rhh) obj5;
                lsc lscVar = rhhVar.f;
                zub zubVar = (zub) obj4;
                ((Integer) obj3).getClass();
                e18 e18Var2 = (e18) ((ld4) obj2);
                e18Var2.a0(-2137546592);
                boolean z = ((ukc) lscVar.getValue()) == ukc.E || !(e18Var2.j(ve4.n) == fu9.F);
                boolean zF = e18Var2.f(rhhVar);
                Object objN = e18Var2.N();
                lz1 lz1Var = jd4.a;
                if (zF || objN == lz1Var) {
                    objN = new hfh(2, rhhVar);
                    e18Var2.k0(objN);
                }
                nwb nwbVarZ = mpk.Z((bz7) objN, e18Var2);
                Object objN2 = e18Var2.N();
                if (objN2 == lz1Var) {
                    it5 it5Var = new it5(new ig1(7, nwbVarZ));
                    e18Var2.k0(it5Var);
                    objN2 = it5Var;
                }
                aaf aafVar = (aaf) objN2;
                boolean zF2 = e18Var2.f(aafVar) | e18Var2.f(rhhVar);
                Object objN3 = e18Var2.N();
                if (zF2 || objN3 == lz1Var) {
                    objN3 = new qhh(aafVar, rhhVar);
                    e18Var2.k0(objN3);
                }
                iqb iqbVarB = r9f.b(fqb.E, (qhh) objN3, (ukc) lscVar.getValue(), this.F && rhhVar.b.h() != MTTypesetterKt.kLineSkipLimitMultiplier, z, zubVar, 160);
                e18Var2.p(false);
                return iqbVarB;
        }
    }
}
