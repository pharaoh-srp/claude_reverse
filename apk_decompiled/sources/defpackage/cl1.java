package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cl1 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ fn1 F;

    public /* synthetic */ cl1(fn1 fn1Var, int i) {
        this.E = i;
        this.F = fn1Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        fn1 fn1Var = this.F;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    fqb fqbVar = fqb.E;
                    iqb iqbVarJ = gb9.J(fqbVar, 12.0f);
                    q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarJ);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    d4c.i0(e18Var, cd4.f, q64VarA);
                    d4c.i0(e18Var, cd4.e, hycVarL);
                    d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var, cd4.h);
                    d4c.i0(e18Var, cd4.d, iqbVarE);
                    e18Var.a0(-1246111514);
                    for (Map.Entry entry : w44.i1(((Map) ((tn1) fn1Var).J.getValue()).entrySet(), new mt7(11))) {
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        iqb iqbVarL = gb9.L(b.c(fqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 2.0f, 1);
                        cxe cxeVarA = axe.a(ko0.a, lja.P, e18Var, 0);
                        int iHashCode2 = Long.hashCode(e18Var.T);
                        hyc hycVarL2 = e18Var.l();
                        iqb iqbVarE2 = kxk.E(e18Var, iqbVarL);
                        dd4.e.getClass();
                        re4 re4Var2 = cd4.b;
                        e18Var.e0();
                        if (e18Var.S) {
                            e18Var.k(re4Var2);
                        } else {
                            e18Var.n0();
                        }
                        d4c.i0(e18Var, cd4.f, cxeVarA);
                        d4c.i0(e18Var, cd4.e, hycVarL2);
                        d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode2));
                        d4c.h0(e18Var, cd4.h);
                        d4c.i0(e18Var, cd4.d, iqbVarE2);
                        tkh tkhVar = ((jm3) gm3.c(e18Var).e.E).i;
                        long j = gm3.a(e18Var).N;
                        if (1.0f <= 0.0d) {
                            z29.a("invalid weight; must be greater than zero");
                        }
                        e18 e18Var2 = e18Var;
                        float f = 1.0f;
                        tjh.b(str, new hw9(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var2, 0, 0, 131064);
                        tkh tkhVar2 = ((jm3) gm3.c(e18Var2).e.E).i;
                        long j2 = gm3.a(e18Var2).M;
                        if (1.0f <= 0.0d) {
                            z29.a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f = Float.MAX_VALUE;
                        }
                        tjh.b(str2, new hw9(f, true), j2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar2, e18Var2, 0, 0, 131064);
                        e18Var = e18Var2;
                        e18Var.p(true);
                    }
                    e18Var.p(false);
                    e18Var.p(true);
                } else {
                    e18Var.T();
                }
                break;
            default:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var2;
                if (e18Var3.Q(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    rvk.b(fn1Var, null, e18Var3, 0);
                } else {
                    e18Var3.T();
                }
                break;
        }
        return ieiVar;
    }
}
