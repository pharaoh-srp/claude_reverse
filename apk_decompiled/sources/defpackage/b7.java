package defpackage;

import android.widget.FrameLayout;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b7 implements rz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ zy7 G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ qz7 L;
    public final /* synthetic */ Object M;

    public /* synthetic */ b7(m8j m8jVar, zy7 zy7Var, boolean z, z7j z7jVar, bz7 bz7Var, bz7 bz7Var2, lfa lfaVar, bz7 bz7Var3) {
        this.H = m8jVar;
        this.G = zy7Var;
        this.F = z;
        this.I = z7jVar;
        this.J = bz7Var;
        this.K = bz7Var2;
        this.M = lfaVar;
        this.L = bz7Var3;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj4 = this.M;
        qz7 qz7Var = this.L;
        Object obj5 = this.K;
        Object obj6 = this.J;
        Object obj7 = this.I;
        Object obj8 = this.H;
        switch (i) {
            case 0:
                m8j m8jVar = (m8j) obj8;
                z7j z7jVar = (z7j) obj7;
                bz7 bz7Var = (bz7) obj6;
                bz7 bz7Var2 = (bz7) obj5;
                lfa lfaVar = (lfa) obj4;
                bz7 bz7Var3 = (bz7) qz7Var;
                qw1 qw1Var = (qw1) obj;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                qw1Var.getClass();
                long j = qw1Var.b;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((e18) ld4Var).f(qw1Var) ? 4 : 2;
                }
                boolean z = (iIntValue & 19) != 18;
                int i2 = iIntValue & 1;
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(i2, z)) {
                    e18Var.T();
                } else {
                    mkk.b(m8jVar, new FrameLayout.LayoutParams(rl4.f(j) ? -1 : -2, rl4.e(j) ? -1 : -2), this.G, this.F, z7jVar, bz7Var, bz7Var2, lfaVar, bz7Var3, e18Var, 3072);
                }
                break;
            default:
                nwb nwbVar = (nwb) obj8;
                nwb nwbVar2 = (nwb) obj7;
                y49 y49Var = (y49) obj6;
                pl3 pl3Var = (pl3) obj5;
                zy7 zy7Var = (zy7) qz7Var;
                zy7 zy7Var2 = (zy7) obj4;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                } else {
                    bik.a((!((Boolean) nwbVar.getValue()).booleanValue() || this.F || ((Boolean) nwbVar2.getValue()).booleanValue()) ? false : true, fd9.q0(1487117902, new uo(y49Var, pl3Var, zy7Var, zy7Var2, nwbVar2, 5), e18Var2), pvj.G, this.G, null, gm3.a(e18Var2).M, gm3.a(e18Var2).M, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var2, 432, 304);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ b7(boolean z, zy7 zy7Var, nwb nwbVar, nwb nwbVar2, y49 y49Var, pl3 pl3Var, zy7 zy7Var2, zy7 zy7Var3) {
        this.F = z;
        this.G = zy7Var;
        this.H = nwbVar;
        this.I = nwbVar2;
        this.J = y49Var;
        this.K = pl3Var;
        this.L = zy7Var2;
        this.M = zy7Var3;
    }
}
