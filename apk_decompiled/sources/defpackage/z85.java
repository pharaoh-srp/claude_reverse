package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z85 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ znd F;

    public /* synthetic */ z85(znd zndVar, int i) {
        this.E = i;
        this.F = zndVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        fqb fqbVar = fqb.E;
        iei ieiVar = iei.a;
        znd zndVar = this.F;
        int i2 = 1;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var.T();
                } else {
                    kxk.g(e18Var, b.e(fqbVar, 16.0f));
                    tjh.b(zndVar.c.b, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 0, 131070);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                } else {
                    pzg.a(gb9.N(b.c(fqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 24.0f, 7), gm3.b(e18Var2).h, gm3.a(e18Var2).o, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, sf5.a(MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var2).v), fd9.q0(663959121, new ood(zndVar, i2, z ? (byte) 1 : (byte) 0), e18Var2), e18Var2, 12582918, 56);
                }
                break;
            default:
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    e18Var3.T();
                } else {
                    qik.b(zndVar, e18Var3, 8);
                }
                break;
        }
        return ieiVar;
    }
}
