package defpackage;

import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ActionSource;
import com.anthropic.claude.app.main.loggedout.LoggedOutAppDestination;
import com.anthropic.claude.chat.bottomsheet.x0;
import com.anthropic.claude.login.LoginScreens;
import com.anthropic.claude.login.WelcomeNotice;
import com.anthropic.claude.login.b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g73 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    public /* synthetic */ g73(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
        this.J = obj5;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        tp4 tp4Var = null;
        lz1 lz1Var = jd4.a;
        int i2 = 2;
        int i3 = 3;
        iei ieiVar = iei.a;
        Object obj3 = this.J;
        Object obj4 = this.I;
        Object obj5 = this.H;
        Object obj6 = this.G;
        Object obj7 = this.F;
        switch (i) {
            case 0:
                ChatMessageActionEvents$ActionSource chatMessageActionEvents$ActionSource = (ChatMessageActionEvents$ActionSource) obj;
                chatMessageActionEvents$ActionSource.getClass();
                x0.d((rwe) obj7);
                gb9.D((l45) obj6, null, null, new tm((t53) obj5, (op3) obj4, (qi3) obj3, chatMessageActionEvents$ActionSource, (whd) obj2, (tp4) null, 16), 3);
                break;
            case 1:
                ((Integer) obj2).getClass();
                yb5.f((iqb) obj7, (yc6) obj6, (uc6) obj5, (xc6) obj4, (zub) obj3, (ld4) obj, x44.p0(24577));
                break;
            case 2:
                zy7 zy7Var = (zy7) obj7;
                zy7 zy7Var2 = (zy7) obj6;
                rz7 rz7Var = (rz7) obj5;
                zy7 zy7Var3 = (zy7) obj4;
                WelcomeNotice welcomeNotice = (WelcomeNotice) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(1 & iIntValue, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    Object objN = e18Var.N();
                    if (objN == lz1Var) {
                        objN = new q59(23);
                        e18Var.k0(objN);
                    }
                    zy7 zy7Var4 = (zy7) objN;
                    kce kceVar = jce.a;
                    rwe rweVarP = eve.P(kceVar.b(LoggedOutAppDestination.class), oq5.B(kceVar.b(LoggedOutAppDestination.class)), true, iv1.M(kceVar.b(LoggedOutAppDestination.class)), zy7Var4, e18Var);
                    x44.q0(rweVarP, e18Var);
                    xn5.P(6, e18Var);
                    kxk.h(rweVarP, "loggedout.app", null, iv1.P(nai.x(), null, 6), null, fd9.q0(1430381172, new x53(zy7Var, zy7Var2, rz7Var, zy7Var3, welcomeNotice), e18Var), e18Var, 196656, 20);
                    Object objN2 = e18Var.N();
                    if (objN2 == lz1Var) {
                        objN2 = new ml0(i2, tp4Var, i3);
                        e18Var.k0(objN2);
                    }
                    fd9.i(e18Var, (pz7) objN2, ieiVar);
                }
                break;
            case 3:
                rwe rweVar = (rwe) obj7;
                zy7 zy7Var5 = (zy7) obj6;
                zy7 zy7Var6 = (zy7) obj5;
                k3g k3gVar = (k3g) obj4;
                nwb nwbVar = (nwb) obj3;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    LoginScreens loginScreens = (LoginScreens) iv1.t(rweVar);
                    boolean zF = e18Var2.f(zy7Var5) | e18Var2.h(rweVar);
                    Object objN3 = e18Var2.N();
                    if (zF || objN3 == lz1Var) {
                        objN3 = new y53(zy7Var5, rweVar);
                        e18Var2.k0(objN3);
                    }
                    b.d(loginScreens, (zy7) objN3, zy7Var6, null, fd9.q0(1775543755, new m63(rweVar, k3gVar, nwbVar, 15), e18Var2), zy7Var5, null, e18Var2, 24576);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                aqc.a((noh) obj7, (wp6) obj6, (d77) obj5, (kl7) obj4, (ta4) obj3, (ld4) obj, x44.p0(1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ g73(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.E = i2;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
        this.J = obj5;
    }
}
