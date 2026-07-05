package defpackage;

import com.anthropic.claude.api.experience.SpotlightContent;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c7 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ zy7 F;
    public final /* synthetic */ iqb G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ qz7 N;
    public final /* synthetic */ Object O;

    public /* synthetic */ c7(fn1 fn1Var, mj1 mj1Var, pl3 pl3Var, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, iqb iqbVar, boolean z, a6i a6iVar, int i) {
        this.J = fn1Var;
        this.K = mj1Var;
        this.L = pl3Var;
        this.F = zy7Var;
        this.M = zy7Var2;
        this.N = zy7Var3;
        this.G = iqbVar;
        this.H = z;
        this.O = a6iVar;
        this.I = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.I;
        Object obj3 = this.O;
        Object obj4 = this.L;
        qz7 qz7Var = this.N;
        Object obj5 = this.M;
        Object obj6 = this.K;
        Object obj7 = this.J;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                mkk.a((m8j) obj7, this.F, this.G, this.H, (z7j) obj6, (bz7) obj4, (bz7) obj5, (lfa) obj3, (bz7) qz7Var, (ld4) obj, iP0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                jwk.l((fn1) obj7, (mj1) obj6, (pl3) obj4, this.F, (zy7) obj5, (zy7) qz7Var, this.G, this.H, (a6i) obj3, (ld4) obj, iP02);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP03 = x44.p0(i2 | 1);
                hkk.a((r4g) obj7, (SpotlightContent) obj6, (k87) obj5, (pz7) qz7Var, this.F, this.G, this.H, (bz7) obj4, (l45) obj3, (ld4) obj, iP03);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ c7(r4g r4gVar, SpotlightContent spotlightContent, k87 k87Var, pz7 pz7Var, zy7 zy7Var, iqb iqbVar, boolean z, bz7 bz7Var, l45 l45Var, int i) {
        this.J = r4gVar;
        this.K = spotlightContent;
        this.M = k87Var;
        this.N = pz7Var;
        this.F = zy7Var;
        this.G = iqbVar;
        this.H = z;
        this.L = bz7Var;
        this.O = l45Var;
        this.I = i;
    }

    public /* synthetic */ c7(m8j m8jVar, zy7 zy7Var, iqb iqbVar, boolean z, z7j z7jVar, bz7 bz7Var, bz7 bz7Var2, lfa lfaVar, bz7 bz7Var3, int i) {
        this.J = m8jVar;
        this.F = zy7Var;
        this.G = iqbVar;
        this.H = z;
        this.K = z7jVar;
        this.L = bz7Var;
        this.M = bz7Var2;
        this.O = lfaVar;
        this.N = bz7Var3;
        this.I = i;
    }
}
