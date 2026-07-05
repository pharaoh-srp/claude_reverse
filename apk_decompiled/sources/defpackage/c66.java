package defpackage;

import com.anthropic.claude.api.common.RateLimit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c66 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ r1e F;
    public final /* synthetic */ iwg G;
    public final /* synthetic */ qi3 H;
    public final /* synthetic */ zy7 I;
    public final /* synthetic */ long J;
    public final /* synthetic */ RateLimit K;

    public /* synthetic */ c66(RateLimit rateLimit, r1e r1eVar, iwg iwgVar, qi3 qi3Var, zy7 zy7Var, long j, int i, int i2) {
        this.E = i2;
        this.K = rateLimit;
        this.F = r1eVar;
        this.G = iwgVar;
        this.H = qi3Var;
        this.I = zy7Var;
        this.J = j;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        RateLimit rateLimit = this.K;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(1);
                h66.t((RateLimit.ExceedsLimit) rateLimit, this.F, this.G, this.H, this.I, this.J, (ld4) obj, iP0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(1);
                h66.r((RateLimit.ApproachingLimit) rateLimit, this.F, this.G, this.H, this.I, this.J, (ld4) obj, iP02);
                break;
        }
        return ieiVar;
    }
}
