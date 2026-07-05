package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.b;
import com.anthropic.claude.app.ClaudeAppDestination;
import com.anthropic.claude.app.ClaudeAppOverlay;
import com.anthropic.claude.app.main.loggedin.LoggedInScreens;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ej3 implements sz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ ej3(int i) {
        this.E = i;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2 = 0;
        int i3 = 1;
        switch (this.E) {
            case 0:
                ie3 ie3Var = (ie3) obj;
                ie3 ie3Var2 = (ie3) obj2;
                ((Boolean) obj4).getClass();
                ie3Var.getClass();
                ie3Var2.getClass();
                ((d56) obj3).getClass();
                Object obj5 = ie3Var.a;
                ClaudeAppDestination claudeAppDestination = obj5 instanceof ClaudeAppDestination ? (ClaudeAppDestination) obj5 : null;
                Object obj6 = ie3Var2.a;
                ClaudeAppDestination claudeAppDestination2 = obj6 instanceof ClaudeAppDestination ? (ClaudeAppDestination) obj6 : null;
                return (claudeAppDestination == null || !claudeAppDestination.isRootScreen() || claudeAppDestination2 == null || !claudeAppDestination2.isRootScreen()) ? new hu5(new hu5(nai.x(), i3, new hu5(kxk.N(0, 0, null, 7), i2, new ke7(i3))), i3, dch.Q(3)) : nai.x();
            case 1:
                ie3 ie3Var3 = (ie3) obj;
                ((Boolean) obj4).getClass();
                ie3Var3.getClass();
                ((ie3) obj2).getClass();
                ((d56) obj3).getClass();
                ClaudeAppOverlay claudeAppOverlay = (ClaudeAppOverlay) ie3Var3.a;
                if (!(claudeAppOverlay instanceof ClaudeAppOverlay.BellMode) && !(claudeAppOverlay instanceof j2g)) {
                    return x44.r(claudeAppOverlay, ClaudeAppOverlay.VoiceSettings.INSTANCE) ? new hu5(new hu5(nai.x(), i3, new hu5(kxk.N(0, 0, null, 7), i2, new ke7(i3))), i3, dch.Q(3)) : dch.Q(1);
                }
                return nai.x();
            case 2:
                poh pohVar = (poh) obj;
                vpc vpcVar = (vpc) obj2;
                ld4 ld4Var = (ld4) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                pohVar.getClass();
                vpcVar.getClass();
                if ((iIntValue & 6) == 0) {
                    i = ((iIntValue & 8) == 0 ? ((e18) ld4Var).f(pohVar) : ((e18) ld4Var).h(pohVar) ? 4 : 2) | iIntValue;
                } else {
                    i = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i |= ((e18) ld4Var).f(vpcVar) ? 32 : 16;
                }
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(i & 1, (i & 147) != 146)) {
                    xo1 xo1Var = lja.K;
                    iqb iqbVarK0 = mpk.k0(b.b, mpk.k);
                    o5b o5bVarD = dw1.d(xo1Var, false);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarK0);
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
                    Object objN = e18Var.N();
                    if (objN == jd4.a) {
                        objN = vb7.f(e18Var);
                    }
                    zub zubVar = (zub) objN;
                    yb5.f(pohVar.e(vpcVar, zubVar), null, null, null, zubVar, e18Var, 24576);
                    e18Var.p(true);
                } else {
                    e18Var.T();
                }
                return iei.a;
            case 3:
                ie3 ie3Var4 = (ie3) obj;
                ((Boolean) obj4).getClass();
                ie3Var4.getClass();
                ((ie3) obj2).getClass();
                ((d56) obj3).getClass();
                LoggedInScreens loggedInScreens = (LoggedInScreens) ie3Var4.a;
                if (x44.r(loggedInScreens, LoggedInScreens.AccountVerification.INSTANCE)) {
                    return dch.Q(3);
                }
                if (!x44.r(loggedInScreens, LoggedInScreens.Onboarding.INSTANCE) && !x44.r(loggedInScreens, LoggedInScreens.MinorBlocked.INSTANCE) && !x44.r(loggedInScreens, LoggedInScreens.ClaudeApp.INSTANCE)) {
                    mr9.b();
                    return null;
                }
                return nai.x();
            default:
                return new p5d((c45) obj, (Context) obj2, (mhf) obj3, (gea) obj4);
        }
    }
}
