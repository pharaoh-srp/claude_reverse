package defpackage;

import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jd8 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ long G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ long I;
    public final /* synthetic */ Boolean J;
    public final /* synthetic */ qz7 K;

    public /* synthetic */ jd8(boolean z, long j, long j2, zy7 zy7Var, Boolean bool, boolean z2) {
        this.F = z;
        this.G = j;
        this.I = j2;
        this.K = zy7Var;
        this.J = bool;
        this.H = z2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        p0h p0hVarE;
        int i = this.E;
        iei ieiVar = iei.a;
        qz7 qz7Var = this.K;
        Boolean bool = this.J;
        boolean z = this.H;
        boolean z2 = this.F;
        switch (i) {
            case 0:
                zy7 zy7Var = (zy7) qz7Var;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(1 & iIntValue, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else if (z2) {
                    e18Var.a0(-1480058583);
                    pd8.h(this.G, this.I, zy7Var, e18Var, 0);
                    e18Var.p(false);
                } else if (bool != null) {
                    e18Var.a0(-1480055235);
                    pd8.j(d4c.j0(R.string.internal_setting_growthbook_server_value_subtitle, e18Var), 0L, e18Var, 0, 2);
                    e18Var.p(false);
                } else if (!z) {
                    e18Var.a0(-1480049962);
                    pd8.j(d4c.j0(R.string.internal_setting_growthbook_value_on_login, e18Var), 0L, e18Var, 0, 2);
                    e18Var.p(false);
                } else {
                    e18Var.a0(-1480051432);
                    pd8.k(0, e18Var);
                    e18Var.p(false);
                }
                break;
            default:
                bz7 bz7Var = (bz7) qz7Var;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    if (z2) {
                        e18Var2.a0(-297825267);
                        p0hVarE = pd8.l(this.G, e18Var2);
                        e18Var2.p(false);
                    } else if (z) {
                        e18Var2.a0(-297822608);
                        p0hVarE = pd8.l(this.I, e18Var2);
                        e18Var2.p(false);
                    } else {
                        e18Var2.a0(-297819956);
                        p0hVarE = djk.e(e18Var2);
                        e18Var2.p(false);
                    }
                    q0h.a(x44.r(bool, Boolean.TRUE), bz7Var, null, false, p0hVarE, e18Var2, 0, 92);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ jd8(boolean z, long j, boolean z2, long j2, Boolean bool, bz7 bz7Var) {
        this.F = z;
        this.G = j;
        this.H = z2;
        this.I = j2;
        this.J = bool;
        this.K = bz7Var;
    }
}
