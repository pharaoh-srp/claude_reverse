package defpackage;

import com.anthropic.claude.app.main.loggedin.BootstrapScreen;
import com.anthropic.claude.app.main.loggedin.i;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iga implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ BootstrapScreen F;
    public final /* synthetic */ zy7 G;
    public final /* synthetic */ zy7 H;
    public final /* synthetic */ iqb I;

    public /* synthetic */ iga(BootstrapScreen bootstrapScreen, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar, int i) {
        this.E = i;
        this.F = bootstrapScreen;
        this.G = zy7Var;
        this.H = zy7Var2;
        this.I = iqbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        ld4 ld4Var = (ld4) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    xn5.R("LoggedInAppRouter", null, fd9.q0(206230178, new iga(this.F, this.G, this.H, this.I, 1), e18Var), e18Var, 3126);
                }
                break;
            default:
                e18 e18Var2 = (e18) ld4Var;
                if (!e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var2.T();
                } else {
                    i.d(((BootstrapScreen.Bootstrapped) this.F).getAgeSignalsResult(), this.G, this.H, this.I, null, null, e18Var2, 0);
                }
                break;
        }
        return ieiVar;
    }
}
