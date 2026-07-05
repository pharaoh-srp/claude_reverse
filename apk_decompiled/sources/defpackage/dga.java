package defpackage;

import com.anthropic.claude.app.main.loggedin.BootstrapScreen;
import com.anthropic.claude.app.main.loggedin.LoggedInScreens;
import com.anthropic.claude.app.main.loggedin.h;
import com.anthropic.claude.app.main.loggedin.i;
import com.anthropic.claude.app.verification.a;
import com.anthropic.claude.types.strings.OrganizationId;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dga implements sz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ rwe F;
    public final /* synthetic */ zy7 G;
    public final /* synthetic */ zy7 H;
    public final /* synthetic */ iqb I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    public /* synthetic */ dga(eu1 eu1Var, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, bz7 bz7Var, iqb iqbVar, rwe rweVar, String str) {
        this.J = eu1Var;
        this.K = bz7Var;
        this.F = rweVar;
        this.G = zy7Var;
        this.L = str;
        this.H = zy7Var2;
        this.M = zy7Var3;
        this.I = iqbVar;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj5 = this.M;
        Object obj6 = this.L;
        Object obj7 = this.K;
        Object obj8 = this.J;
        switch (i) {
            case 0:
                l45 l45Var = (l45) obj8;
                is5 is5Var = (is5) obj7;
                koi koiVar = (koi) obj6;
                jj jjVar = (jj) obj5;
                LoggedInScreens loggedInScreens = (LoggedInScreens) obj2;
                ld4 ld4Var = (ld4) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((ia0) obj).getClass();
                loggedInScreens.getClass();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= (iIntValue & 64) == 0 ? ((e18) ld4Var).f(loggedInScreens) : ((e18) ld4Var).h(loggedInScreens) ? 32 : 16;
                }
                int i2 = iIntValue;
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(i2 & 1, (i2 & 145) != 144)) {
                    boolean zEquals = loggedInScreens.equals(LoggedInScreens.AccountVerification.INSTANCE);
                    rwe rweVar = this.F;
                    iqb iqbVar = this.I;
                    lz1 lz1Var = jd4.a;
                    if (zEquals) {
                        e18Var.a0(-1495360855);
                        xn5.P(6, e18Var);
                        boolean zH = e18Var.h(l45Var) | e18Var.h(is5Var);
                        Object objN = e18Var.N();
                        if (zH || objN == lz1Var) {
                            objN = new vc8(l45Var, 11, is5Var);
                            e18Var.k0(objN);
                        }
                        zy7 zy7Var = (zy7) objN;
                        boolean zH2 = e18Var.h(rweVar) | e18Var.f(koiVar) | e18Var.d(jjVar.ordinal());
                        Object objN2 = e18Var.N();
                        if (zH2 || objN2 == lz1Var) {
                            objN2 = new ka1(rweVar, koiVar, jjVar, 22);
                            e18Var.k0(objN2);
                        }
                        a.a(0, e18Var, zy7Var, (zy7) objN2, iqbVar);
                        e18Var.p(false);
                    } else if (loggedInScreens.equals(LoggedInScreens.Onboarding.INSTANCE)) {
                        e18Var.a0(-1494633719);
                        xn5.P(6, e18Var);
                        boolean zH3 = e18Var.h(rweVar);
                        Object objN3 = e18Var.N();
                        if (zH3 || objN3 == lz1Var) {
                            objN3 = new kj3(rweVar, 24);
                            e18Var.k0(objN3);
                        }
                        ovk.b((zy7) objN3, jjVar, iqbVar, null, null, null, e18Var, 0);
                        e18Var.p(false);
                    } else if (loggedInScreens.equals(LoggedInScreens.MinorBlocked.INSTANCE)) {
                        e18Var.a0(-1494306979);
                        xn5.P(6, e18Var);
                        lsk.b(0, 0, e18Var, this.G, iqbVar);
                        e18Var.p(false);
                    } else {
                        if (!loggedInScreens.equals(LoggedInScreens.ClaudeApp.INSTANCE)) {
                            throw kgh.s(e18Var, -48238634, false);
                        }
                        e18Var.a0(-1494062172);
                        xn5.R("ClaudeApp", null, fd9.q0(-1500435192, new ik3(this.H, iqbVar), e18Var), e18Var, 3126);
                        e18Var.p(false);
                    }
                } else {
                    e18Var.T();
                }
                return ieiVar;
            default:
                final eu1 eu1Var = (eu1) obj8;
                final bz7 bz7Var = (bz7) obj7;
                final String str = (String) obj6;
                final zy7 zy7Var2 = (zy7) obj5;
                Object needsBootstrap = (BootstrapScreen) obj2;
                ld4 ld4Var2 = (ld4) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((ia0) obj).getClass();
                needsBootstrap.getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= (iIntValue2 & 64) == 0 ? ((e18) ld4Var2).f(needsBootstrap) : ((e18) ld4Var2).h(needsBootstrap) ? 32 : 16;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    e18Var2.T();
                    return ieiVar;
                }
                if (!(needsBootstrap instanceof BootstrapScreen.NeedsBootstrap)) {
                    if (!(needsBootstrap instanceof BootstrapScreen.Bootstrapped)) {
                        mr9.b();
                        return null;
                    }
                    BootstrapScreen.Bootstrapped bootstrapped = (BootstrapScreen.Bootstrapped) needsBootstrap;
                    String strMo507getOrganizationIdQUMPZR0 = bootstrapped.mo507getOrganizationIdQUMPZR0();
                    eu1Var.getClass();
                    strMo507getOrganizationIdQUMPZR0.getClass();
                    if (!((Boolean) mpk.x(new l80(eu1Var, 7, strMo507getOrganizationIdQUMPZR0), a5.N).getValue()).booleanValue()) {
                        String strMo507getOrganizationIdQUMPZR02 = bootstrapped.mo507getOrganizationIdQUMPZR0();
                        List list = xah.a;
                        xah.e(6, "Bootstrapped screen needs reinit. org:" + OrganizationId.m1070toStringimpl(strMo507getOrganizationIdQUMPZR02), null, null);
                        needsBootstrap = new BootstrapScreen.NeedsBootstrap(strMo507getOrganizationIdQUMPZR02, bootstrapped.getAgeSignalsResult(), null);
                    }
                }
                Object obj9 = needsBootstrap;
                final zy7 zy7Var3 = this.G;
                final zy7 zy7Var4 = this.H;
                final iqb iqbVar2 = this.I;
                final rwe rweVar2 = this.F;
                knk.e(obj9, null, null, null, fd9.q0(2104358837, new rz7() { // from class: hga
                    @Override // defpackage.rz7
                    public final Object invoke(Object obj10, Object obj11, Object obj12) {
                        BootstrapScreen bootstrapScreen = (BootstrapScreen) obj10;
                        ld4 ld4Var3 = (ld4) obj11;
                        int iIntValue3 = ((Integer) obj12).intValue();
                        bootstrapScreen.getClass();
                        if ((iIntValue3 & 6) == 0) {
                            iIntValue3 |= (iIntValue3 & 8) == 0 ? ((e18) ld4Var3).f(bootstrapScreen) : ((e18) ld4Var3).h(bootstrapScreen) ? 4 : 2;
                        }
                        e18 e18Var3 = (e18) ld4Var3;
                        if (e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                            boolean z = bootstrapScreen instanceof BootstrapScreen.NeedsBootstrap;
                            rwe rweVar3 = rweVar2;
                            zy7 zy7Var5 = zy7Var4;
                            zy7 zy7Var6 = zy7Var2;
                            iqb iqbVar3 = iqbVar2;
                            if (z) {
                                e18Var3.a0(1611636423);
                                xn5.R("LoadingApp", null, fd9.q0(1910966113, new j03(bootstrapScreen, eu1Var, zy7Var3, rweVar3, str, zy7Var5, zy7Var6, iqbVar3), e18Var3), e18Var3, 3126);
                                e18Var3.p(false);
                            } else {
                                if (!(bootstrapScreen instanceof BootstrapScreen.Bootstrapped)) {
                                    throw kgh.s(e18Var3, -640749237, false);
                                }
                                e18Var3.a0(1614315877);
                                String strMo507getOrganizationIdQUMPZR03 = ((BootstrapScreen.Bootstrapped) bootstrapScreen).mo507getOrganizationIdQUMPZR0();
                                umg umgVar = qoi.a;
                                strMo507getOrganizationIdQUMPZR03.getClass();
                                e18Var3.a0(-1168520582);
                                m7f m7fVarB = gr9.b(e18Var3);
                                e18Var3.a0(-1633490746);
                                boolean zF = e18Var3.f(null) | e18Var3.f(m7fVarB);
                                Object objN4 = e18Var3.N();
                                lz1 lz1Var2 = jd4.a;
                                if (zF || objN4 == lz1Var2) {
                                    objN4 = m7fVarB.a(jce.a.b(moi.class), null, null);
                                    e18Var3.k0(objN4);
                                }
                                e18Var3.p(false);
                                e18Var3.p(false);
                                moi moiVar = (moi) objN4;
                                boolean zF2 = e18Var3.f(moiVar) | e18Var3.f(strMo507getOrganizationIdQUMPZR03);
                                Object objN5 = e18Var3.N();
                                if (zF2 || objN5 == lz1Var2) {
                                    objN5 = moiVar.a(strMo507getOrganizationIdQUMPZR03);
                                    e18Var3.k0(objN5);
                                }
                                koi koiVar2 = (koi) objN5;
                                boolean zH4 = e18Var3.h(rweVar3) | ((iIntValue3 & 14) == 4 || ((iIntValue3 & 8) != 0 && e18Var3.h(bootstrapScreen)));
                                Object objN6 = e18Var3.N();
                                if (zH4 || objN6 == lz1Var2) {
                                    objN6 = new h(rweVar3, bootstrapScreen);
                                    e18Var3.k0(objN6);
                                }
                                i.f(koiVar2, bz7Var, (bz7) objN6, fd9.q0(-389971602, new iga(bootstrapScreen, zy7Var6, zy7Var5, iqbVar3, 0), e18Var3), e18Var3, 3072);
                                e18Var3.p(false);
                            }
                        } else {
                            e18Var3.T();
                        }
                        return iei.a;
                    }
                }, e18Var2), e18Var2, 24576, 14);
                return ieiVar;
        }
    }

    public /* synthetic */ dga(l45 l45Var, is5 is5Var, rwe rweVar, koi koiVar, jj jjVar, iqb iqbVar, zy7 zy7Var, zy7 zy7Var2) {
        this.J = l45Var;
        this.K = is5Var;
        this.F = rweVar;
        this.L = koiVar;
        this.M = jjVar;
        this.I = iqbVar;
        this.G = zy7Var;
        this.H = zy7Var2;
    }
}
