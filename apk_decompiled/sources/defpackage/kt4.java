package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kt4 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ m15 F;

    public /* synthetic */ kt4(m15 m15Var, int i) {
        this.E = i;
        this.F = m15Var;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) throws IOException {
        int i = this.E;
        iei ieiVar = iei.a;
        m15 m15Var = this.F;
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
                    pzg.a(null, xve.a, gm3.a(e18Var).o, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, sf5.a(1.0f, gm3.a(e18Var).u), fd9.q0(739458903, new mk4(i2, m15Var), e18Var), e18Var, 12582912, 57);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                } else {
                    osk.f(m15Var.c, null, e18Var2, 0);
                }
                break;
            default:
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    e18Var3.T();
                } else {
                    osk.d(m15Var.l, null, e18Var3, 0);
                }
                break;
        }
        return ieiVar;
    }
}
