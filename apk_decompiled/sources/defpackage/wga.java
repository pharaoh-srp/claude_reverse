package defpackage;

import com.anthropic.claude.login.WelcomeNotice;
import com.anthropic.claude.login.b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wga implements pz7 {
    public final /* synthetic */ int E = 2;
    public final /* synthetic */ int F;
    public final /* synthetic */ qz7 G;
    public final /* synthetic */ qz7 H;
    public final /* synthetic */ qz7 I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ wga(int i, pz7 pz7Var, ta4 ta4Var, pz7 pz7Var2, pz7 pz7Var3, ywb ywbVar, pz7 pz7Var4) {
        this.F = i;
        this.G = pz7Var;
        this.H = ta4Var;
        this.I = pz7Var2;
        this.J = pz7Var3;
        this.K = ywbVar;
        this.L = pz7Var4;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.L;
        Object obj4 = this.K;
        Object obj5 = this.J;
        qz7 qz7Var = this.I;
        qz7 qz7Var2 = this.H;
        qz7 qz7Var3 = this.G;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                b.a((rz7) qz7Var3, (zy7) qz7Var2, (iqb) obj5, (WelcomeNotice) obj4, (zy7) qz7Var, (hj) obj3, (ld4) obj, x44.p0(1), this.F);
                break;
            case 1:
                pz7 pz7Var = (pz7) qz7Var3;
                ta4 ta4Var = (ta4) qz7Var2;
                pz7 pz7Var2 = (pz7) qz7Var;
                pz7 pz7Var3 = (pz7) obj5;
                ywb ywbVar = (ywb) obj4;
                pz7 pz7Var4 = (pz7) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(1 & iIntValue, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    oq5.j(this.F, pz7Var, ta4Var, pz7Var2, pz7Var3, ywbVar, pz7Var4, e18Var, 0);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                oq5.j(this.F, (pz7) qz7Var3, (ta4) qz7Var2, (pz7) qz7Var, (pz7) obj5, (wbj) obj4, (pz7) obj3, (ld4) obj, x44.p0(1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ wga(int i, pz7 pz7Var, ta4 ta4Var, pz7 pz7Var2, pz7 pz7Var3, wbj wbjVar, pz7 pz7Var4, int i2) {
        this.F = i;
        this.G = pz7Var;
        this.H = ta4Var;
        this.I = pz7Var2;
        this.J = pz7Var3;
        this.K = wbjVar;
        this.L = pz7Var4;
    }

    public /* synthetic */ wga(rz7 rz7Var, zy7 zy7Var, iqb iqbVar, WelcomeNotice welcomeNotice, zy7 zy7Var2, hj hjVar, int i, int i2) {
        this.G = rz7Var;
        this.H = zy7Var;
        this.J = iqbVar;
        this.K = welcomeNotice;
        this.I = zy7Var2;
        this.L = hjVar;
        this.F = i2;
    }
}
