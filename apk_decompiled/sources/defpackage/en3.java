package defpackage;

import com.anthropic.claude.api.experience.ExperienceBullet;
import com.anthropic.claude.api.referral.ReferralEligibility;
import com.anthropic.claude.api.tasks.TaskStepResponse;
import com.anthropic.claude.conway.ConwayAppScreen;
import com.anthropic.claude.tasks.ui.q;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class en3 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ int H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    public /* synthetic */ en3(String str, nxf nxfVar, boolean z, int i, tkh tkhVar) {
        this.E = 10;
        this.I = str;
        this.G = nxfVar;
        this.F = z;
        this.H = i;
        this.J = tkhVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        int i2 = this.H;
        iei ieiVar = iei.a;
        Object obj3 = this.J;
        Object obj4 = this.G;
        Object obj5 = this.I;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                jlk.b((sn3) obj5, (zy7) obj4, this.F, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                wi4.f((ek4) obj5, this.F, (zy7) obj4, (zy7) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ypk.g((n56) obj5, this.F, (bz7) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                kr4.a((ConwayAppScreen.Extension) obj5, this.F, (bz7) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                cn5.o((zy7) obj4, this.F, (iqb) obj3, (ta4) obj5, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                dkk.b((ExperienceBullet) obj5, (vig) obj4, this.F, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                rrk.a((ReferralEligibility) obj5, this.F, (zy7) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                kkc.a((s64) obj5, (jkc) obj3, this.F, (zy7) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                qwk.d((String) obj5, (String) obj3, this.F, (zy7) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                xzk.m((k29) obj5, (j29) obj4, this.F, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 10:
                String str = (String) obj5;
                nxf nxfVar = (nxf) obj4;
                tkh tkhVar = (tkh) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    tjh.b(str, null, nxfVar.b(this.F), 0L, null, null, null, 0L, null, null, 0L, 2, false, this.H, 0, null, tkhVar, e18Var, 0, 384, 110586);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                q.c((TaskStepResponse) obj5, this.F, (zy7) obj4, (e5h) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ en3(Object obj, Object obj2, boolean z, zy7 zy7Var, int i, int i2) {
        this.E = i2;
        this.I = obj;
        this.J = obj2;
        this.F = z;
        this.G = zy7Var;
        this.H = i;
    }

    public /* synthetic */ en3(Object obj, Object obj2, boolean z, iqb iqbVar, int i, int i2) {
        this.E = i2;
        this.I = obj;
        this.G = obj2;
        this.F = z;
        this.J = iqbVar;
        this.H = i;
    }

    public /* synthetic */ en3(Object obj, boolean z, qz7 qz7Var, Object obj2, int i, int i2) {
        this.E = i2;
        this.I = obj;
        this.F = z;
        this.G = qz7Var;
        this.J = obj2;
        this.H = i;
    }

    public /* synthetic */ en3(zy7 zy7Var, boolean z, iqb iqbVar, ta4 ta4Var, int i) {
        this.E = 4;
        this.G = zy7Var;
        this.F = z;
        this.J = iqbVar;
        this.I = ta4Var;
        this.H = i;
    }
}
