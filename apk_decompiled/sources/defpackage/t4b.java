package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t4b implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ String G;
    public final /* synthetic */ zy7 H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ int K;
    public final /* synthetic */ int L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ Object P;

    public /* synthetic */ t4b(ta4 ta4Var, String str, boolean z, zy7 zy7Var, iqb iqbVar, boolean z2, boolean z3, tkh tkhVar, hhd hhdVar, int i, int i2) {
        this.M = ta4Var;
        this.G = str;
        this.F = z;
        this.H = zy7Var;
        this.N = iqbVar;
        this.I = z2;
        this.J = z3;
        this.O = tkhVar;
        this.P = hhdVar;
        this.K = i;
        this.L = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.K;
        Object obj3 = this.P;
        Object obj4 = this.O;
        Object obj5 = this.N;
        Object obj6 = this.M;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                u4b.b((ta4) obj6, this.G, this.F, this.H, (iqb) obj5, this.I, this.J, (tkh) obj4, (hhd) obj3, (ld4) obj, iP0, this.L);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                nvk.f(this.F, (List) obj6, this.G, (bz7) obj5, (i4g) obj4, (yih) obj3, this.H, this.I, this.J, (ld4) obj, iP02, this.L);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ t4b(boolean z, List list, String str, bz7 bz7Var, i4g i4gVar, yih yihVar, zy7 zy7Var, boolean z2, boolean z3, int i, int i2) {
        this.F = z;
        this.M = list;
        this.G = str;
        this.N = bz7Var;
        this.O = i4gVar;
        this.P = yihVar;
        this.H = zy7Var;
        this.I = z2;
        this.J = z3;
        this.K = i;
        this.L = i2;
    }
}
