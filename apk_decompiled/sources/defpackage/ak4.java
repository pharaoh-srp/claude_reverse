package defpackage;

import com.anthropic.claude.api.account.RavenType;
import com.anthropic.claude.api.kyc.KycStatusResponse;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ak4 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ zy7 L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ int P;

    public /* synthetic */ ak4(s64 s64Var, pvg pvgVar, RavenType ravenType, qvg qvgVar, String str, boolean z, ovg ovgVar, boolean z2, KycStatusResponse kycStatusResponse, zy7 zy7Var, int i) {
        this.E = 2;
        this.I = s64Var;
        this.J = pvgVar;
        this.K = ravenType;
        this.M = qvgVar;
        this.F = str;
        this.G = z;
        this.N = ovgVar;
        this.H = z2;
        this.O = kycStatusResponse;
        this.L = zy7Var;
        this.P = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.P;
        Object obj3 = this.O;
        Object obj4 = this.N;
        Object obj5 = this.M;
        Object obj6 = this.K;
        Object obj7 = this.J;
        Object obj8 = this.I;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                bqk.a(this.F, this.G, this.H, (Boolean) obj8, (pz7) obj7, (bz7) obj6, this.L, (bz7) obj5, (zy7) obj4, (iqb) obj3, (ld4) obj, iP0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                bqk.a(this.F, this.G, this.H, (Boolean) obj8, (pz7) obj7, (bz7) obj6, this.L, (bz7) obj5, (zy7) obj4, (iqb) obj3, (ld4) obj, iP02);
                break;
            default:
                ((Integer) obj2).intValue();
                int iP03 = x44.p0(i2 | 1);
                xzk.j((s64) obj8, (pvg) obj7, (RavenType) obj6, (qvg) obj5, this.F, this.G, (ovg) obj4, this.H, (KycStatusResponse) obj3, this.L, (ld4) obj, iP03);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ ak4(String str, boolean z, boolean z2, Boolean bool, pz7 pz7Var, bz7 bz7Var, zy7 zy7Var, bz7 bz7Var2, zy7 zy7Var2, iqb iqbVar, int i, int i2) {
        this.E = i2;
        this.F = str;
        this.G = z;
        this.H = z2;
        this.I = bool;
        this.J = pz7Var;
        this.K = bz7Var;
        this.L = zy7Var;
        this.M = bz7Var2;
        this.N = zy7Var2;
        this.O = iqbVar;
        this.P = i;
    }
}
