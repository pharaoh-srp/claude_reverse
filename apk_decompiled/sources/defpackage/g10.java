package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g10 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ iqb F;
    public final /* synthetic */ long G;

    public /* synthetic */ g10(long j, iqb iqbVar) {
        this.G = j;
        this.F = iqbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        long j = this.G;
        ld4 ld4Var = (ld4) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    iqb iqbVar = this.F;
                    if (j == 9205357640488583168L) {
                        e18Var.a0(-1243644858);
                        l10.b(0, 0, e18Var, iqbVar);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(-1244013944);
                        iqb iqbVarL = b.l(iqbVar, za6.d(j), za6.c(j), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 12);
                        o5b o5bVarD = dw1.d(lja.H, false);
                        int iHashCode = Long.hashCode(e18Var.T);
                        hyc hycVarL = e18Var.l();
                        iqb iqbVarE = kxk.E(e18Var, iqbVarL);
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
                        l10.b(0, 1, e18Var, null);
                        e18Var.p(true);
                        e18Var.p(false);
                    }
                }
                break;
            default:
                num.getClass();
                lwj.b(this.F, j, ld4Var, x44.p0(1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ g10(iqb iqbVar, long j, int i) {
        this.F = iqbVar;
        this.G = j;
    }
}
