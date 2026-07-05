package defpackage;

import com.anthropic.claude.app.main.l;
import com.anthropic.claude.app.n0;
import com.anthropic.claude.login.LoginScreens;
import com.anthropic.claude.login.MagicLinkIntentData;
import com.anthropic.claude.login.OverlayScreens;
import com.anthropic.claude.login.WelcomeNotice;
import com.anthropic.claude.login.a;
import com.anthropic.claude.login.b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hx2 implements pz7 {
    public final /* synthetic */ int E = 2;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ hx2(zy7 zy7Var, bz7 bz7Var, zy7 zy7Var2, b0g b0gVar, j8f j8fVar, pl3 pl3Var, x89 x89Var, int i) {
        this.F = zy7Var;
        this.H = bz7Var;
        this.G = zy7Var2;
        this.I = b0gVar;
        this.J = j8fVar;
        this.K = pl3Var;
        this.L = x89Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.I;
        Object obj4 = this.L;
        Object obj5 = this.K;
        Object obj6 = this.H;
        Object obj7 = this.J;
        Object obj8 = this.F;
        Object obj9 = this.G;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                csg.b((zy7) obj8, (szh) obj9, (bz7) obj6, (ta4) obj3, (iqb) obj7, (pz7) obj4, (iqb) obj5, (ld4) obj, x44.p0(3073));
                break;
            case 1:
                ((Integer) obj2).getClass();
                dk3.a((un8) obj8, (of6) obj9, (zqc) obj6, (tg7) obj3, (sl) obj7, (qi3) obj5, (z93) obj4, (ld4) obj, x44.p0(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                n0.d((bhc) obj8, (qi3) obj9, (koi) obj3, (q7) obj7, (dkc) obj5, (z93) obj4, (bz7) obj6, (ld4) obj, x44.p0(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                n0.o((zy7) obj8, (bz7) obj6, (zy7) obj9, (b0g) obj3, (j8f) obj7, (pl3) obj5, (x89) obj4, (ld4) obj, x44.p0(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                b.d((LoginScreens) obj9, (zy7) obj8, (zy7) obj6, (iqb) obj7, (ta4) obj3, (zy7) obj5, (x89) obj4, (ld4) obj, x44.p0(24577));
                break;
            case 5:
                WelcomeNotice welcomeNotice = (WelcomeNotice) obj9;
                iqb iqbVar = (iqb) obj7;
                zy7 zy7Var = (zy7) obj8;
                zy7 zy7Var2 = (zy7) obj6;
                nwb nwbVar = (nwb) obj3;
                rz7 rz7Var = (rz7) obj5;
                hj hjVar = (hj) obj4;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(1 & iIntValue, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    boolean zD = e18Var.d(welcomeNotice == null ? -1 : welcomeNotice.ordinal());
                    Object objN = e18Var.N();
                    lz1 lz1Var = jd4.a;
                    if (zD || objN == lz1Var) {
                        objN = new dg8(12, welcomeNotice);
                        e18Var.k0(objN);
                    }
                    kce kceVar = jce.a;
                    rwe rweVarP = eve.P(kceVar.b(LoginScreens.class), oq5.B(kceVar.b(LoginScreens.class)), true, iv1.M(kceVar.b(LoginScreens.class)), (zy7) objN, e18Var);
                    x44.q0(rweVarP, e18Var);
                    Object objN2 = e18Var.N();
                    if (objN2 == lz1Var) {
                        objN2 = new q59(25);
                        e18Var.k0(objN2);
                    }
                    rwe rweVarP2 = eve.P(kceVar.b(OverlayScreens.class), oq5.B(kceVar.b(OverlayScreens.class)), true, iv1.M(kceVar.b(OverlayScreens.class)), (zy7) objN2, e18Var);
                    x44.q0(rweVarP2, e18Var);
                    o3g.a(null, fd9.q0(-233677082, new kx2(rweVarP, iqbVar, zy7Var, zy7Var2, nwbVar, rz7Var, hjVar), e18Var), e18Var, 48);
                    MagicLinkIntentData.Companion.getClass();
                    gh2 gh2Var = MagicLinkIntentData.channel;
                    boolean zH = e18Var.h(rweVarP2);
                    Object objN3 = e18Var.N();
                    if (zH || objN3 == lz1Var) {
                        objN3 = new a(rweVarP2, null);
                        e18Var.k0(objN3);
                    }
                    x44.b(gh2Var, (pz7) objN3, e18Var, 0);
                    yfd.a(new rwe[]{rweVarP2}, e18Var, 0);
                    fu5 fu5VarP = iv1.P(nai.x(), null, 6);
                    Object objN4 = e18Var.N();
                    if (objN4 == lz1Var) {
                        objN4 = new xga(0);
                        e18Var.k0(objN4);
                    }
                    kxk.h(rweVarP2, "login.overlay", null, fu5VarP, (bz7) objN4, fd9.q0(-1097566195, new ij3(iqbVar, rweVarP2, rz7Var, rweVarP, 2), e18Var), e18Var, 221232, 4);
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                l.a((zy7) obj8, (swe) obj9, (iqb) obj7, (fk0) obj6, (u2a) obj3, (g78) obj5, (w59) obj4, (ld4) obj, x44.p0(1));
                break;
            default:
                ((Integer) obj2).getClass();
                knk.k((w1i) obj9, (zy7) obj8, (String) obj7, (bz7) obj6, (bz7) obj5, (bz7) obj4, fqb.E, (ta4) obj3, (ld4) obj, x44.p0(12582913));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ hx2(zy7 zy7Var, swe sweVar, iqb iqbVar, fk0 fk0Var, u2a u2aVar, g78 g78Var, w59 w59Var, int i) {
        this.F = zy7Var;
        this.G = sweVar;
        this.J = iqbVar;
        this.H = fk0Var;
        this.I = u2aVar;
        this.K = g78Var;
        this.L = w59Var;
    }

    public /* synthetic */ hx2(zy7 zy7Var, szh szhVar, bz7 bz7Var, ta4 ta4Var, iqb iqbVar, pz7 pz7Var, iqb iqbVar2, int i) {
        this.F = zy7Var;
        this.G = szhVar;
        this.H = bz7Var;
        this.I = ta4Var;
        this.J = iqbVar;
        this.L = pz7Var;
        this.K = iqbVar2;
    }

    public /* synthetic */ hx2(un8 un8Var, of6 of6Var, zqc zqcVar, tg7 tg7Var, sl slVar, qi3 qi3Var, z93 z93Var, int i) {
        this.F = un8Var;
        this.G = of6Var;
        this.H = zqcVar;
        this.I = tg7Var;
        this.J = slVar;
        this.K = qi3Var;
        this.L = z93Var;
    }

    public /* synthetic */ hx2(bhc bhcVar, qi3 qi3Var, koi koiVar, q7 q7Var, dkc dkcVar, z93 z93Var, bz7 bz7Var, int i) {
        this.F = bhcVar;
        this.G = qi3Var;
        this.I = koiVar;
        this.J = q7Var;
        this.K = dkcVar;
        this.L = z93Var;
        this.H = bz7Var;
    }

    public /* synthetic */ hx2(w1i w1iVar, zy7 zy7Var, String str, bz7 bz7Var, bz7 bz7Var2, bz7 bz7Var3, ta4 ta4Var, int i) {
        this.G = w1iVar;
        this.F = zy7Var;
        this.J = str;
        this.H = bz7Var;
        this.K = bz7Var2;
        this.L = bz7Var3;
        this.I = ta4Var;
    }

    public /* synthetic */ hx2(LoginScreens loginScreens, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar, ta4 ta4Var, zy7 zy7Var3, x89 x89Var, int i) {
        this.G = loginScreens;
        this.F = zy7Var;
        this.H = zy7Var2;
        this.J = iqbVar;
        this.I = ta4Var;
        this.K = zy7Var3;
        this.L = x89Var;
    }

    public /* synthetic */ hx2(WelcomeNotice welcomeNotice, iqb iqbVar, zy7 zy7Var, zy7 zy7Var2, nwb nwbVar, rz7 rz7Var, hj hjVar) {
        this.G = welcomeNotice;
        this.J = iqbVar;
        this.F = zy7Var;
        this.H = zy7Var2;
        this.I = nwbVar;
        this.K = rz7Var;
        this.L = hjVar;
    }
}
