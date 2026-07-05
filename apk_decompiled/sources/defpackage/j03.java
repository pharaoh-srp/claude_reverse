package defpackage;

import com.anthropic.claude.app.i1;
import com.anthropic.claude.app.main.loggedin.BootstrapScreen;
import com.anthropic.claude.app.main.loggedin.f;
import com.anthropic.claude.app.main.loggedin.g;
import com.anthropic.claude.app.main.loggedin.i;
import com.anthropic.claude.chat.bottomsheet.options.n;
import com.anthropic.claude.code.remote.stores.a;
import com.anthropic.claude.code.remote.stores.b;
import com.anthropic.claude.types.strings.OrganizationId;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j03 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    public /* synthetic */ j03(w1i w1iVar, zy7 zy7Var, String str, bz7 bz7Var, bz7 bz7Var2, bz7 bz7Var3, iqb iqbVar, ta4 ta4Var, int i) {
        this.E = 5;
        this.F = w1iVar;
        this.J = zy7Var;
        this.G = str;
        this.H = bz7Var;
        this.I = bz7Var2;
        this.L = bz7Var3;
        this.K = iqbVar;
        this.M = ta4Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.M;
        Object obj4 = this.K;
        Object obj5 = this.L;
        Object obj6 = this.I;
        Object obj7 = this.H;
        Object obj8 = this.G;
        Object obj9 = this.J;
        Object obj10 = this.F;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                n.a((t53) obj10, (hw2) obj8, (t4g) obj7, (hi4) obj6, (zy7) obj9, (iqb) obj4, (f03) obj5, (qi3) obj3, (ld4) obj, x44.p0(4161));
                break;
            case 1:
                ((Integer) obj2).getClass();
                i1.a((rwe) obj10, (zqc) obj8, (pkc) obj7, (jwf) obj6, (b) obj9, (a) obj4, (lq0) obj5, (z93) obj3, (ld4) obj, x44.p0(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                fd9.m((String) obj10, (jj) obj8, (pz7) obj7, (bz7) obj6, (zy7) obj9, (zy7) obj5, (iqb) obj4, (fca) obj3, (ld4) obj, x44.p0(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                i.c((String) obj10, (jj) obj8, (bz7) obj7, (zy7) obj9, (zy7) obj6, (zy7) obj5, (iqb) obj4, (eu1) obj3, (ld4) obj, x44.p0(1));
                break;
            case 4:
                BootstrapScreen bootstrapScreen = (BootstrapScreen) obj10;
                eu1 eu1Var = (eu1) obj8;
                zy7 zy7Var = (zy7) obj9;
                rwe rweVar = (rwe) obj7;
                String str = (String) obj6;
                zy7 zy7Var2 = (zy7) obj5;
                zy7 zy7Var3 = (zy7) obj3;
                iqb iqbVar = (iqb) obj4;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(1 & iIntValue, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    BootstrapScreen.NeedsBootstrap needsBootstrap = (BootstrapScreen.NeedsBootstrap) bootstrapScreen;
                    String strMo507getOrganizationIdQUMPZR0 = needsBootstrap.mo507getOrganizationIdQUMPZR0();
                    jj ageSignalsResult = needsBootstrap.getAgeSignalsResult();
                    boolean zH = e18Var.h(eu1Var) | e18Var.f(zy7Var) | e18Var.h(rweVar);
                    Object objN = e18Var.N();
                    lz1 lz1Var = jd4.a;
                    if (zH || objN == lz1Var) {
                        objN = new f(eu1Var, zy7Var, rweVar);
                        e18Var.k0(objN);
                    }
                    pz7 pz7Var = (pz7) objN;
                    boolean zF = e18Var.f(str != null ? OrganizationId.m1065boximpl(str) : null) | e18Var.f(zy7Var2) | e18Var.h(rweVar) | e18Var.h(bootstrapScreen);
                    Object objN2 = e18Var.N();
                    if (zF || objN2 == lz1Var) {
                        objN2 = new g(str, zy7Var2, rweVar, bootstrapScreen);
                        e18Var.k0(objN2);
                    }
                    bz7 bz7Var = (bz7) objN2;
                    boolean zF2 = e18Var.f(zy7Var2);
                    Object objN3 = e18Var.N();
                    if (zF2 || objN3 == lz1Var) {
                        objN3 = new px2(9, zy7Var2);
                        e18Var.k0(objN3);
                    }
                    fd9.m(strMo507getOrganizationIdQUMPZR0, ageSignalsResult, pz7Var, bz7Var, (zy7) objN3, zy7Var3, iqbVar, null, e18Var, 0);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                knk.k((w1i) obj10, (zy7) obj9, (String) obj8, (bz7) obj7, (bz7) obj6, (bz7) obj5, (iqb) obj4, (ta4) obj3, (ld4) obj, x44.p0(12582913));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ j03(BootstrapScreen bootstrapScreen, eu1 eu1Var, zy7 zy7Var, rwe rweVar, String str, zy7 zy7Var2, zy7 zy7Var3, iqb iqbVar) {
        this.E = 4;
        this.F = bootstrapScreen;
        this.G = eu1Var;
        this.J = zy7Var;
        this.H = rweVar;
        this.I = str;
        this.L = zy7Var2;
        this.M = zy7Var3;
        this.K = iqbVar;
    }

    public /* synthetic */ j03(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i, int i2) {
        this.E = i2;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
        this.J = obj5;
        this.K = obj6;
        this.L = obj7;
        this.M = obj8;
    }

    public /* synthetic */ j03(String str, jj jjVar, bz7 bz7Var, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, iqb iqbVar, eu1 eu1Var, int i) {
        this.E = 3;
        this.F = str;
        this.G = jjVar;
        this.H = bz7Var;
        this.J = zy7Var;
        this.I = zy7Var2;
        this.L = zy7Var3;
        this.K = iqbVar;
        this.M = eu1Var;
    }

    public /* synthetic */ j03(String str, jj jjVar, pz7 pz7Var, bz7 bz7Var, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar, fca fcaVar, int i) {
        this.E = 2;
        this.F = str;
        this.G = jjVar;
        this.H = pz7Var;
        this.I = bz7Var;
        this.J = zy7Var;
        this.L = zy7Var2;
        this.K = iqbVar;
        this.M = fcaVar;
    }
}
