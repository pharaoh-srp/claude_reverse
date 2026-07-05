package defpackage;

import com.anthropic.claude.api.account.RavenType;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xu8 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ String F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ iqb H;
    public final /* synthetic */ long I;
    public final /* synthetic */ int J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ qz7 N;

    public /* synthetic */ xu8(bpc bpcVar, String str, iqb iqbVar, boolean z, h12 h12Var, z02 z02Var, long j, zy7 zy7Var, int i) {
        this.K = bpcVar;
        this.F = str;
        this.H = iqbVar;
        this.G = z;
        this.L = h12Var;
        this.M = z02Var;
        this.I = j;
        this.N = zy7Var;
        this.J = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.J;
        qz7 qz7Var = this.N;
        Object obj3 = this.M;
        Object obj4 = this.L;
        Object obj5 = this.K;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                ktk.h((bpc) obj5, this.F, this.H, this.G, (h12) obj4, (z02) obj3, this.I, (zy7) qz7Var, (ld4) obj, iP0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                uvk.b(this.F, (String) obj5, this.G, (pvg) obj4, (RavenType) obj3, (sz7) qz7Var, this.H, this.I, (ld4) obj, iP02);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ xu8(String str, String str2, boolean z, pvg pvgVar, RavenType ravenType, sz7 sz7Var, iqb iqbVar, long j, int i) {
        this.F = str;
        this.K = str2;
        this.G = z;
        this.L = pvgVar;
        this.M = ravenType;
        this.N = sz7Var;
        this.H = iqbVar;
        this.I = j;
        this.J = i;
    }
}
